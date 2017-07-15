print("ENTER THE NUMBER")
num=input()
length=len(num)
sum=0
for i in range(0,length):
	j=int(num[i])
	h=j**length
	sum=sum+h
	h=0
	i=i+1
if(int(num)==sum):
	print("ARMSTRONG NUMBER")
else:
	print("NOT ARMSTRONG")



			
			


