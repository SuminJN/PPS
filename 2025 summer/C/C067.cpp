#include <stdio.h>

int main(void) {
    int N, M;
    int i, j, k, sum=0, max=0;
    int arr[100] = {0,};

    scanf("%d %d", &N, &M);

    for(i=0; i<N; i++)
        scanf("%d", &arr[i]);

    for(i=0; i<N; i++){
        for(j=i+1; j<N; j++){
            for(k=j+1; k<N; k++){
                sum = arr[i] + arr[j] + arr[k];
                if(sum > max && sum <= M)
                    max = sum;
            }
        }
    }

    printf("%d\n", max);

    return 0;
}
