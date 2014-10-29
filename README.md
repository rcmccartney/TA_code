TA_code
=======

All the live code from recitation sessions will be posted here

Wk8: 
This week we went over stacks and queues, as well as their Big-O complexities.  
In Python (v3.4), we created a Node class that extended the rit_object class and 
used it to implement a FIFO queue and a LIFO stack.  The queue required an 
additional class structure to hold references to the front and the back of the 
queue, but the stack only required a reference to the top Node, which in turn
holds a reference to the node immediately below it.

Wk9:
This week we went over linkedlists and how they compare to arraylists, as well as the
Big-O complexity trade-offs between the two.  We implemented the count and remove 
functions on the class implementation of linkedlist both iteratively and recursively.
The recursive implementation uses a helper function to actually do the recursion, while
the public-facing function just starts the recursion on the head of the list.  This
is a very common design pattern that allows us to present uniform interfaces to the 
user for both the iterative and recursive implementations, as they appear the same 
from the outside (besides their names). 

Wk10:
This week focuses on hash tables, with explanations on what a hash function is, how a hash code
is computed, how this hash code is used to implement a hash table, and how collisions are 
handled inside the table.  The code for this week focuses on the last problem in recitation, 
implementing a small hash table using a list and inserting with open addressing (where you linearly
search for the next open spot from the point of entry of the hash code for your given key). 
Here, the key is a string used to compute a hash code and the value is an integer representing how
many times we have seen this key.  We also discussed rehashing and expanding the size of a hash table
as collisions become more frequent.
