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

speed(0)
clear()

def drawcircle():
  radius = randint(5, 100)
  randomcolour()
  randomplace()
  dot(radius)
  
def drawstar():
  randomcolour()
  randomplace()
  randomheading()
  begin_fill()
  size = randint(20, 100)
  for side in range(5):
    left(144)
    forward(size)

  end_fill()
  
clear()
setheading(0)

for i in range(50):
  drawcircle()

clear()

for i in range(20):
  drawstar()

done() 