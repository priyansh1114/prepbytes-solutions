
def checkYear(year):
	if (year % 4) == 0:
		if (year % 100) == 0:
			if (year % 400) == 0:
				return True
			else:
				return False
		else:
			return True
	else:
		return False

# Driver Code
n=int(input())
while(n>0):
    n=n-1
    year=int(input())
    if(checkYear(year)):
	     print("Yes")
    else:
        print("No")
	
