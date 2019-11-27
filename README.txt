ARI VALENZUELA (A01635584)
NATALY HERNANDEZ (A01631314)
Solving Ideal and Nonideal Gas Laws (Chemical/Bioengineering) using Newton-Raphson Method.

The problem we decided to solve comes from the book Numerical Methods for Engineers by Steven C.  Chapra and Raymond P. Canale (p. 205) 
called “Solving Ideal and Nonideal Gas Laws (Chemical/Bioengineering) using Newton-Raphson Method”. 


This problem is based on the Ideal Gas Law, which is an approximation of the behavior of many gases under different conditions, 
assuming they conform to the Ideal Gas Law. 
The problem is that they need to get the molal volume of both carbon dioxide and oxygen so they can choose an appropriate container for both of them. 
The rapid solution would be to get v by using the Ideal Gas Law, Ideal Gas Law is described by  pV = nRT where p is the  absolute  pressure,  V  is  the  volume,  
n  is  the  number  of  moles,  R  is  the  universal  gas  constant,  and  T  is  the  absolute  temperature, by using the previous formula we would get (v = RT/p), 
and that would be the result used to select a container.

Although is a good approximation, there are certain cases that the result is not accurate enough, due to many gases not behaving exactly like an ideal gas, 
which is why it’s common to use the van Der Waals equation ( f(v) = (p + a/v^2)(v - b) - RT ). The problem is that we can’t easily get v, the molal volume, 
from that formula, we need to get the root of the equation.
We decided to solve this problem with Newton-Raphson because it is a simple time-efficient solution for getting the root of a function, since we have a 
good initial value by using the one we get from the Ideal Gas Law. And the derivative of the function is easy to get as well.
The function is:
f(v) = (p + a/v^2)(v - b) - RT 
The derivative is:
f‘(v) =  p - a/v^2 + 2ab/v^3 
So then we use our algorithm, which keeps applying the Newton-Raphson method until the error calculated is below 0.001, and returns a 
more accurate approximation of the real value of the molal volume. It also helps us compare to see how well the gas behaves relating to the Ideal Gas Law. 
The usual disadvantage of the Newton-Raphson is not having a good initial value, which causes it to not converge to a value and keep a high percentage of error, 
but since in this problem we get an amazing approximation to the real value with the Ideal Gas Law, that problem is non-existent.

INSTRUCTIONS TO USE THE PROGRAM:
1.OPEN THE FILE: NumericalMethodsFrame.Java
2.EXECUTE IT
3.CLICK ON THE BUTTON “SOLVE” THAT APPEARS ON THE PANEL THAT JUST POPPED UP
4.SELECT THE FILE THAT WILL BE USED TO TEST THE METHOD, WE PROVIDE WITH TWO DATASETS, ONE OF OXYGEN AND ANOTHER OF CARBON DIOXIDE, 
THE FIRST ONE IS CALLED “oxygen.txt” AND THE SECOND ONE IS CALLED “carbonDioxide.txt”. YOU CAN CHOOSE ANY OF THE TWO.
5.NOW THE INITIAL GUESS, THE FINAL GUESS, HOW MANY ITERATIONS TOOK TO SOLVE IT AND THE FINAL ERROR CALCULATED WILL BE DISPLAYED ON THE CONSOLE.

DATASET USED:
WE USED THE DATA PROVIDED FOR THE PROBLEM DESCRIBED IN: 
Chapra, Steven C., and Raymond P. Canale. Numerical Methods for Engineers. McGraw-Hill Education, 2015. [PDF]. 
http://mechfamilyhu.net/download/uploads/mech144232415981.pdf  on the 204-206 pages.


BIBLIOGRAPHY
Newton's Method. (n.d.). Wolfram Alpha. http://mathworld.wolfram.com/NewtonsMethod.html
Chapra, Steven C., and Raymond P. Canale. Numerical Methods for Engineers. McGraw-Hill Education, 2015. [PDF]. http://mechfamilyhu.net/download/uploads/mech144232415981.pdf 
