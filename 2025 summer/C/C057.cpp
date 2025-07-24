#include <stdio.h>
#include <stdlib.h>
#include <string.h>

typedef struct {
    char string[51];
    int length;
} str;

str sort[20001];

void merge(str* arr, int first, int mid, int last);
void mergesort_(str* arr, int first, int last);


int main(void)
{
    int N;
    scanf("%d", &N);
    str arr[N];

    for(int i = 0; i < N; i++) {
        scanf("%s", arr[i].string);
        arr[i].length = strlen(arr[i].string);
    }

    mergesort_(arr, 0, N - 1);


    for (int i = 0; i < N; i++) {
        if (strcmp(arr[i+1].string, arr[i].string) != 0)
            printf("%s\n", arr[i].string);
    }
    return 0;
}


void merge(str* arr, int first, int mid, int last)
{
    int i = first;
    int j = mid + 1;
    int k = first;

    while(i <= mid && j <= last) {
        if (arr[i].length < arr[j].length) {
            sort[k++] = arr[i++];
        } else if (arr[i].length > arr[j].length) {
            sort[k++] = arr[j++];
        } else {
            if (strcmp(arr[i].string, arr[j].string) < 0) {
                sort[k++] = arr[i++];
            }
            else {
                sort[k++] = arr[j++];
            }
        }
    }
    if (i > mid) {
        while (j <= last)
            sort[k++] = arr[j++];
    }
    else {
        while (i <= mid)
            sort[k++] = arr[i++];
    }
    for (k = first; k <= last; k++)
        arr[k] = sort[k];
}


void mergesort_(str* arr, int first, int last)
{
    int mid;
    if (first < last) {
        mid = (first + last) / 2;
        mergesort_(arr, first, mid);
        mergesort_(arr, mid + 1, last);
        merge(arr, first, mid, last);
    }
}
