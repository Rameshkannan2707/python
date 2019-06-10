N,K=input().split()
N=int(N)
K=int(K)
c=N+1
c1=0
for i in range(c,K):
	for j in range(1,i+1):
		if(i%j==0):
			c1=c1+1
	if(c1==2):
		print(i,end=' ')
	c1=0

