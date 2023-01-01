#----------  Create to check all the posiblity to find password  -----------

# Python program to print all permutation
# with duplicates allowed
def toString(List):
	return ''.join(List)

# Function to print permutations
# of string
# This function takes three parameters:
# 1. String
# 2. Starting index of the string
# 3. Ending index of the string.
def password(a, l, r):
	if l == r:
		print (toString(a))
	else:
		for i in range(l, r + 1):
			a[l], a[i] = a[i], a[l]
			password(a, l + 1, r)

			# backtrack
			a[l], a[i] = a[i], a[l]

# Driver code
string = input("enter word: ")
nlen = len(string)
a = list(string)
# a=a , l=0 , r=n-1
password(a, 0, nlen-1)