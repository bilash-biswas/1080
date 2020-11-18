a=[]
for i in range(0,100):
    b=int(input())
    a.append(b)
maximum=1
index=1
for i in range(1,100):
    if maximum<a[i] :
        maximum=a[i]
        index=i
print(maximum)
print(index+1)
