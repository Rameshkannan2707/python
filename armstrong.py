a=int(input())
t=a
rev=0
while(a>0):
	dig=a%10
	rev=rev+dig**3
	a=a//10
if(t==rev):
	print("yes")
else:
	print("no")
