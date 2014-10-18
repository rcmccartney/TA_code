from rit_object import *

# Use this class to make both a
# FIFO queue and a LIFO stack
class Node(rit_object):
    __slots__ = ('data', 'next')
    _types    = (object, 'Node')

# The stack does not require a second class. 
# It is held by the user as the top node, with
# each node holding a reference to the node below it
# Here are the stack methods
def pop( node ):
	if (emptyStack(node)):
		raise IndexError("Pop on empty")
	return node.next

def push(node, data):
	newNode = Node(data, node)
	return newNode
	
def emptyStack(node):
	return node is None

#Test our stack
def stackMain():
	stackTop = Node(5, None)
	stackTop = push(stackTop, 7)
	print(stackTop)
	stackTop = pop(stackTop)
	print(stackTop)
	stackTop = pop(stackTop)
	print(stackTop)		
	#this will raise IndexError
	#stackTop = pop(stackTop)

# Use the Node class to make a 
# FIFO queue
class Queue(rit_object):
    """
	object is specified as the type of the 'front' and
    'back' slots so that either None or a Node object
    can be used as valid assignments.
    """
    __slots__ = ( 'front', 'back', 'size' )
    _types    = ( object,  object, int    )

def dequeue(queue):
	if (emptyQueue(queue)):
		raise IndexError("dequeue on empty")
	queue.front = queue.front.next
	if (emptyQueue(queue)):
		queue.back = None
	queue.size -= 1
		
def enqueue(queue, data):
	newNode = Node(data, None)
	if (emptyQueue(queue)):
		queue.front = newNode	
	else:
		queue.back.next = newNode
	queue.back = newNode
	queue.size += 1

def emptyQueue(queue):
	return queue.front is None

# Test our queue 
def queueMain():
	queue = Queue(None, None, 0)
	enqueue(queue, 3)
	enqueue(queue, 11)
	print(queue)
	dequeue(queue)
	print(queue)		
	dequeue(queue)
	print(queue)	
	
stackMain()
queueMain()




	
