print("ENTER THE NUMBER WHOSE MULTIPLICATION TABLE IS TO BE GENERATED")
num=int(input())
limit=int(num/2)
for i in range(1,limit):
	if(num%i==0):
		d=num/i
		print(i,"*",d)
		