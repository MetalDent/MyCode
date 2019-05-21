import random

num = random.randrange(1, 41, 1)

n = input("Guess the no (from 1 to 40): ")

if n > num:
	print("Guessed no is greater than actual no")
elif n < num:
	print("Guessed no is less than actual no")
else:
	print("Your guess is correct!")

print "Actual no is: %d" %(num)