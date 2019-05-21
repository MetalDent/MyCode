import random

print "You have total 10 guesses. Start guessing..."

word = random.choice(["dracarys", "secret", "drogon", "ghost", "crows"])

guesses = ''

turns = 10

while turns > 0:         
    failed = 0             

    for char in word:      
        if char in guesses:    
            print char,    

        else:
            print "_",     
            failed += 1    


    if failed == 0:        
        print "\nYou won!"  
        break              

    print

    guess = raw_input("guess a character:") 

    guesses += guess                    

    if guess not in word:  
        turns -= 1        
        print "Wrong"  
 
        print "You have", + turns, 'more guesses' 
 
        if turns == 0:           
            print "You Loose"  