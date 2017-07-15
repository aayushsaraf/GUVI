print("ENTER THE NUMBER")
num=int(input())
mul=1
for i in range(1,num+1):
	mul=mul*i
	i=i+1
print("FACTORIAL IS",mul)