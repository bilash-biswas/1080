a=Array.new()
for i in 1..100
  a[i]=gets().chomp().to_i
end
max=a[1]
index=1
for i in 2..100
 if a[i]>max
   max=a[i]
   index=i
 end
end

 printf("%d\n",max);
 printf("%d\n",index);
