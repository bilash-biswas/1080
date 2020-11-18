a={}
for i=1,100 do
    a[i]=io.read("*n")
end
max=a[1]
index=1
for i=1,100 do
    if(a[i]>max)then
       max=a[i]
       index=i
    end
end
print(max)
print(index)
