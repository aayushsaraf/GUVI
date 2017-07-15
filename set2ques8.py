def main():
	print("ENTER THE FIRST LIMIT")
	num=int(input())
	print("ENTER THE UPPER LIMIT")
	val=int(input())
	for i in range(num,val+1):
		if(armstrong(i)==1):
				print(" ",i)
		i=i+1
	
def armstrong(a):
	num=a
	length=len(num)
	sum=0
	for i in range(0,length):
		j=int(num[i])
		h=j**length
		sum=sum+h
		h=0
		i=i+1
	if(int(num)==sum):
		return 1
	else:
		return 0



			
main()



			
			


