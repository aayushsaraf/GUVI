def main():
	print("ENTER THE FIRST LIMIT")
	num=int(input())
	print("ENTER THE UPPER LIMIT")
	val=int(input())
	for i in range(num,val+1):
		if(prime(i)==1):
				print(" ",i)
		i=i+1
	
def prime(a):
	num=a
	count = 0
	for i in range(1,num+1):
		if(num%i==0):
			count=count+1
	if(count==2):
		return 1
	else:
		return 0

main()



			
			


