#include <stdio.h>
#include <stdlib.h>

int commonmin(int num1[], int num2[], int n1, int n2) {
    int i = 0;
    int j = 0;
    while (i < n1 && j < n2) {
        if (num1[i] == num2[j]) {
            return num1[i];
        } else if (num1[i] < num2[j]) {
            i++;
        } else {
            j++;
        }
    }
    return -1;
}

int main(int argc, char *argv[]) {
    if (argc < 3) {
        printf("Usage: %s <num1 array> <num2 array>\n", argv[0]);
        return 1;
    }

    int num1[argc], num2[argc];
    int n1 = 0, n2 = 0;
    int i = 1;

    
    while (i < argc && argv[i][0] != ';') {
        num1[n1++] = atoi(argv[i]);
        i++;
    }

    
    if (i < argc && argv[i][0] == ';') {
        i++;
    }

    
    while (i < argc) {
        num2[n2++] = atoi(argv[i]);
        i++;
    }

    int result = commonmin(num1, num2, n1, n2);
    if (result != -1) {
        printf("The smallest common element is: %d\n", result);
    } else {
        printf("No common elements found.\n");
    }

    return 0;
}
