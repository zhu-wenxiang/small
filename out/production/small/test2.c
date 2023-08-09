#include <stdio.h>

int main(){
    int p=1,i=10;
    while (p<100)
    {
        p=p*i;
        printf("%s%s%dp=%d\n",__FILE__,__FUNCTION__,__LINE__,p);
    }
    return 0;
}