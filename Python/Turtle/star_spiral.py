import turtle  

colors1 = ['red', 'purple', 'blue', 'green', 'orange'] 
colors2 = ['yellow', 'white', 'gray', 'red', 'brown'] 
turtle.bgcolor('black') 

star = turtle.Turtle() 

for i in range(50): 
    star.pencolor(colors1[i%5]) 
    star.width(i/100) 
    star.forward(i * 7)  
    star.right(144) 

star.left(100)

for i in range(50): 
    star.pencolor(colors2[i%5]) 
    star.width(i/100) 
    star.forward(i * 7)
    star.right(144) 

star.left(100)

for i in range(50): 
    star.pencolor(colors1[i%5]) 
    star.width(i/100) 
    star.forward(i * 7)
    star.right(144) 
      
turtle.done() 