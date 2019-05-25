from turtle import *
import random
from random import randint

def randomcolour():
	colors = ['red', 'purple', 'blue', 'green', 'orange']
	color(random.choice(colors))

def randomplace():
	penup()
	x = randint(-100, 100)
	y = randint(-100, 100)
	goto(x, y)
	pendown()

def randomheading():
  heading = randint(0, 360)
  setheading(heading)

for i in range(1, 30):
  randomcolour()
  randomplace()
  randomheading()
  stamp()


done() 