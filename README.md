TA_code
=======

All the live code from recitation sessions will be posted here

Wk1:
This week we use turtle to show how to make functions and the 
value of function re-use.  Making reusable functions takes more work 
to code initially, but gives us much more flexibility to use our 
drawTriangle function at a later time (shown by the one triangle 
off to the right after our original figure is drawn).

Usage:  % python triangleWheel.py

Wk2:
This week the focus is on recursion and how to 
properly form a recursive function.  For proper
recursion, there needs to be a base case and the
recursive call needs to decrement towards the base
case (or it will run forever!).

Usage: % python wk2.py

Wk8: 
This week we went over stacks and queues, as well as their Big-O complexities.  
In Python (v3.4), we created a Node class that extended the rit_object class 
and used it to implement a FIFO queue and a LIFO stack.  The queue required an 
additional class structure to hold references to the front and the back of the 
queue, but the stack only required a reference to the top Node, which in turn
holds a reference to the node immediately below it.

Usage:  % python myStackandQueue.py

Wk9:
This week we went over linkedlists and how they compare to arraylists, as well as the
Big-O complexity trade-offs between the two.  We implemented the count and remove 
functions on the class implementation of linkedlist both iteratively and recursively.
The recursive implementation uses a helper function to actually do the recursion, while
the public-facing function just starts the recursion on the head of the list.  This
is a very common design pattern that allows us to present uniform interfaces to the 
user for both the iterative and recursive implementations, as they appear the same 
from the outside (besides their names). 

Usage:  % python count_remove.py

Wk10:
This week focuses on hash tables, with explanations on what a hash function is, how a hash code
is computed, how this hash code is used to implement a hash table, and how collisions are 
handled inside the table.  The code for this week focuses on the last problem in recitation, 
implementing a small hash table using a list and inserting with open addressing (where you linearly
search for the next open spot from the point of entry of the hash code for your given key). 
Here, the key is a string used to compute a hash code and the value is an integer representing how
many times we have seen this key.  We also discussed rehashing and expanding the size of a hash table
as collisions become more frequent.

Usage:  % python testHash.py

Wk12: 
This week is all about Binary Search Trees and different forms of traversals.  In breadth-first 
search, an entire depth of the tree is visited before going to any node at the next depth of the tree.
In contrast, depth-first search has three forms of traversal. Pre-order visits the current node before 
visiting any children.  In-order visits the left subtree, then this node, then the right subtree.
Post-order visits the left and right subtrees before visiting the parent, so the root node
is the last node visited in the tree.  See the code for a visualization of both the depth
of the tree and the order of visiting the nodes under all three forms of DFS.

Usage:  % python tree_print.py

Wk14:
This week we went over quicksort and mergesort as optimal )(N*logN) sorting algorithms.  In the code, we show a bad merge function for use in a mergesort algorithm.  The good version of the function is displayed below - convince yourself
why the first version will not properly merge two arbitraily sorted lists.

Usage: % python badMerge.py
