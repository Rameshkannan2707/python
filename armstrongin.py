n,k=input().split()
n=int(n)
k=int(k)
for i in range(n+1,k,1):
        rev=0
        a=i
        while(i>0):
                dig=i%10
                rev=rev+(dig**3)
                i=i//10
        if(a==rev):
                print(rev)
	
