#!/usr/local/bin/python3

"""
File: class_code.py
Author: Rob McCartney
Language: Python 3
Description:  Count and remove functions for a node-based singly linked list
Purpose: RECITATION
"""

from myListIter import *  # by extension, myNode and rit_object 

def countIter(llst, searchFor ):
	count = 0
	tmp = llst.head
	
	while tmp is not None:
		if tmp.data == searchFor:
			count += 1
		tmp = tmp.next
	
	return count

def removeIter(llst, searchFor ):
	tmp = llst.head
	#prev is used to have a reference to the node
	#that came before the current tmp node
	prev = None
	
	while tmp is not None:
		if tmp.data == searchFor:
			if prev is None:
				llst.head = tmp.next
			else:
				prev.next = tmp.next
			llst.size -= 1
			return
		else:
			prev = tmp
			tmp = tmp.next

# This is the non-recursive function exposed to the 
# user that we use to keep the interface the same. 
# You pass it a list rather than a node as required by
# the recursion to mimic the iterative call	
def countRec(llst, searchFor):
	return countRecHelper(llst.head, searchFor)

# This is the recursive helper function that takes
# node as a parameter, recursively moving to each 
# node of the list	
def countRecHelper(node, searchFor):
	if node is None:
		return 0
	else:
		count = countRecHelper(node.next, searchFor)
		if node.data == searchFor:
			count += 1
		return count

# This is the non-recursive function exposed to the 
# user that we use to keep the interface the same. 
# You pass it a list rather than a node as required by
# the recursion to mimic the iterative call	
def removeRec(llst, searchFor):
	llst.head = removeRecHelper(llst.head, searchFor, llst)
	
# This is the recursive helper function that takes
# node as a parameter, recursively moving to each 
# node of the list	
def removeRecHelper(node, searchFor, llst):
	if node is None:
		return node
	elif node.data == searchFor:
		llst.size -= 1
		return node.next
	else:
		node.next = removeRecHelper(node.next, searchFor)
		return node

def testIt():
	lst = createEmptyList ( )
	append ( lst , 2 )
	append ( lst , 5 )
	append ( lst , 4 )
	append ( lst , 7 )
	append ( lst , 2 )
	append ( lst , 10 )
	append ( lst , 11 )
	print("Our initial list:", lst ) 
	print ( " countIter : ", countIter(lst, 2) )
	print ( " countRec : ", countRec(lst, 2) )
	removeRec(lst, 2)
	print("Recursive remove 2:", lst )
	removeIter(lst, 11)
	print("Iterative remove 11:", lst )
	
testIt()