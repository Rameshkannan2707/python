N,K=input().split()
N=int(N)
K=int(K)
s=0
if(N>0):
    if(K>0 and K<=N):
        for i in range(1,K+1):
            s=s+i
        print(s)
    else:
        print("invalid")
else:
    print("invalid")