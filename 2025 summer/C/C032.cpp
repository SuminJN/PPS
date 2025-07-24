#include <stdio.h>

int main(void) {
    int n, an=1,i;
    scanf("%d", &n);


    if(n==1)
        printf("%d\n", n);
    else{
        for(i=2; i<=100000000; i++){
            if(n <= 6 * an + 1){
                printf("%d", i);
                break;
            }
            an += i;
        }
    }

    return 0;
}
