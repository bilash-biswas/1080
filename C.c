#include<stdio.h>
int main()
{
    int a[101],i,max,index;
    for(i=1;i<=100;i++)
    {
     scanf("%d",&a[i]);
    }
    max=a[1];
    index=1;
    for(i=2;i<=100;i++)
    {
     if(a[i]>max)
    {
       max=a[i];
       index=i;
    }
    }
     printf("%d\n",max);
     printf("%d\n",index);
    return 0;
}
