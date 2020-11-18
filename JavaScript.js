var input = require('fs').readFileSync('/dev/stdin', 'utf8');
var lines = input.split('\n');
var a=[],b=[],c=[],v=[];
var n,i;

var i,max,index;
var a=[];
for(i=0;i<100;i++)
{
 a.push(parseInt(lines.shift()));
}
max=a[0];
index=1;
for(i=1;i<100;i++)
{
 if(a[i]>max)
{
   max=a[i];
   index=i+1;
}
}
console.log(max);
console.log(index);
