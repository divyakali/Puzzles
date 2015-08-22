### Puzzles

##Problem Description:
 
You are in a room with 100 cups arranged in a big circle. The cups are numbered sequentially from 1 to 100.

At some point in time, cup #1 will be taken away, and cup #2 will be skipped. Then cup #3 will be taken away, and cup #4 will be skipped. This pattern of taking a cup away and skipping the next will keep going around the circle until there is only one cup left.
 
Write a program to determine which cup is left. Please send us the answer and your working code.
 
Your code should print the answer to the cup challenge when there are 100 cups.

##Approach:
The datastructure used to solve this puzzle is a Circular linked list.
Why?
1. Deletion operations take constant time.
2. Simple implementation for going in a round about manner without checking for the size of the list at every pass.


##Functionality:
1. constructCircularList - Creates a circular list of nodes to represent cups with numbers.
2. solvePuzzle - Function to take away a cup and keep one cup in a circular manner until one cup is left.

Testing is crucial for any project. It helps identify and fix bugs.

##Performance:
This is an O(n) algorithm. Why? Because the first pass takes n steps, second n/2, third n/4 etc.., O(n+n/2+n/4+....+n/2^k) = O(n)
Note: 1/2+1/4....1/2^k = 1(approximately as k tends to infinity)

Space complexity is O(n) because we are going through numbers 1-n and creating a circular linked list with n nodes.


##Limitations:
Program will run into overflow/underflow issues when the number of cups reach maximum,minimum boundaries of int values in java. One solution for this would be to use long int.

Since the problem deals with 100 cups, I left this as an extension for future.

##Future:
Each node in the list comprises of only integers at the moment. This can be extended in the future to hold any real world entity. 
