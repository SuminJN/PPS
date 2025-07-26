#include <stdio.h>
#define minfind(a, b) a < b ? a : b

int main(void) {
    char arr[50][50];
    int N, M, i, j, k, l;
    int min=64, cntW, cntB;

    scanf("%d %d",  &N, &M);
    for(i=0; i<N; i++){
        scanf("%s", arr[i]);
    }

    for(i=0; i<N-7; i++){
        for(j=0; j<M-7; j++){
            cntW=0;
            cntB=0;
            for(k=i; k<i+8; k++){
                for(l=j; l<j+8; l++){
                    if((k+l)%2 == 0){
                        if(arr[k][l] == 'W')
                            cntB++;
                        else
                            cntW++;
                    }
                    else{
                        if(arr[k][l] == 'W')
                            cntW++;
                        else
                            cntB++;
                    }

                }
            }
            min = minfind(min, cntW);
            min = minfind(min, cntB);
        }
    }


    printf("%d\n", min);
    return 0;
}
