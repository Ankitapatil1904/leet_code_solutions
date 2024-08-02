#include <stdio.h>
int main() {
    int n; 
    printf("Enter the number of passengers: ");
    scanf("%d", &n);
    
    char details[n][15]; 
    int cnt = 0; 

    printf("Enter the details of each passenger (each detail should be 15 characters long):\n");
    for (int i = 0; i < n; i++) {
        printf("Passenger %d: ", i + 1);
        scanf("%s", details[i]);
    }

    for (int i = 0; i < n; i++) {
        int age = (details[i][11] - '0') * 10 + (details[i][12] - '0'); 
        if (age > 60) { 
            cnt++;
        }
    }

    printf("The number of passengers above age 60 is: %d\n", cnt);
    return 0;
}
