# hexColPlayground
CMSC 22 Final Project 

Adrian Miguel Custodio
BS Computer Scince II
Project: Hex Color Code Calculator

1.Design Patterns Used

1.1 Creational Pattern:
- Factory Design Pattern
I used this not only because I think it's neat, but also because it organizes things better that doesnt end up with me looking through long lines of code

1.2 Structural Pattern:
- Facade Design Pattern
This goes hand in hand with the Factory pattern as I separated the bigger equations into separate subclasses to make it easier for the user

1.3 Behavioral Pattern:
- Template Method Design Pattern
Since Hexacodes follow a certain pattern/set of rules, I thought the Template Method design pattern would suit the program


2. Use Test Driven Development:
- Since I've prominently used the do-while loop in the main code, I made it ask for nothing in the beginning which well, didnt run the loop. I then set a parameter to ask for a "yes" 
and tapping any key would let you exit the loop. 

- Having methods in separate classes meant that I can't test them out without going through the Main code. Since I didn't implement the code to call the method yet,
I made the basicColors method a Main class. To checking the input, hex color codes only reach until 255 so when I put a random input higher than that, I received a format 
that isn't in the proper way of #000000. I made an error catcher that would return an error message. Also formated that converting the numbers to hexadecimals would result to 
2 digits each (e.g. 05)

- Did the same thing of making the method into a Main Class for oppositeOrTriadic. For Opposite, the concept there is to subtract 255 to each color. To test this at first, I didnt
cut the hexcode string into 3 parts and so the subtracting process didn't line up, giving me a negative value. Same goes for the Triadic process, where it relies on moving strings around
via the concatonation of strings. I made it 'move' the entire string (again, no cutting of parts) and it just made the hexcode really long

3.Apply the Best Java Coding Practices

- used the proper naming conventions of varibles;
- did a do while loop for ease of printing the code all over again;
- used iteration to assign values for 12 colors;
- utilized the lock and key system of dictionaries;
- separated methods in their own classes for organization;
- finally used javadoc for comments

