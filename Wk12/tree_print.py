"""
Recitation: Trees, traversals
"""
from bst import *

def inorder( tree ):
	""" 
	Prints the values in the given list in order
	where smaller values (to the left) are printed
	first, then this node is printed, then larger 
	values are printed (by going right)
	"""
	if tree is not None:
		inorder( tree.left )
		print( tree.value, end=' ' )
		inorder( tree.right )


def preorder( tree ):
	""" 
	Prints the values in the given list in pre-order, 
	where a parent prints itself before recursing to 
	its children
	"""
	if tree is not None:
		print( tree.value, end=' ' )
		preorder( tree.left )
		preorder( tree.right )

def postorder( tree ):
	""" inorder: BinaryTree -> None
	Prints the values in the given list in post-order
	where all child nodes are printed before this node
	"""
	if tree is not None:
		postorder( tree.left )
		postorder( tree.right )
		print( tree.value, end=' ' )


def inorder_tab( tree, tabs="", value=0 ):
	""" 
	Prints the values in the given list in order
	where smaller values (to the left) are printed
	first, then this node is printed, then larger 
	values are printed (by going right)
	Added tabs to show depth of the node
	Added value to show order nodes are visited
	"""
	if tree is not None:
		tabs += "\t"
		value = inorder_tab( tree.left, tabs, value ) + 1
		print(str(value)+":", tabs, tree.value )
		return inorder_tab( tree.right, tabs, value )
	else:
		return value

def preorder_tab( tree, tabs="", value=0 ):
	""" 
	Prints the values in the given list in pre-order, 
	where a parent prints itself before recursing to 
	its children
	Added tabs to show depth of the node
	Added value to show order nodes are visited
	"""
	if tree is not None:
		tabs += "\t"
		value += 1
		print(str(value)+":", tabs, tree.value)
		value = preorder_tab( tree.left, tabs, value )
		return preorder_tab( tree.right, tabs, value )
	else:
		return value
		
def postorder_tab( tree, tabs="", value=0 ):
	""" inorder: BinaryTree -> None
	Prints the values in the given list in post-order
	where all child nodes are printed before this node
	Added tabs to show depth of the node
	Added value to show order nodes are visited
	"""
	if tree is not None:
		tabs += "\t"
		value = postorder_tab( tree.left, tabs, value )
		value = postorder_tab( tree.right, tabs, value ) + 1
		print(str(value)+":", tabs, tree.value )
		return value
	else:
		return value
		
############################################################
# Sample trees
############################################################

#hard coded the tree instead of using insert since the 
#students must implement insert for their HW
# Tree looks like:
#
#						5
#				3				7
#			1		4		6		9		
#
lt = BinaryTree( BinaryTree( None, 1, None ),  \
                 3,                            \
                 BinaryTree( None, 4, None ) )
rt = BinaryTree( BinaryTree( None, 6, None ),  \
                 7,                            \
				 BinaryTree( None, 9, None ) )
root = BinaryTree( lt, 5, rt )

print("preorder:")
preorder(root)
print("\npostorder:")
postorder(root)
print("\ninorder:")
inorder(root)
print()
print("preorder with tabs:")
print("Depth:\t 0\t 1\t 2\nVisit")
preorder_tab(root)
print("\npostorder with tabs:")
print("Depth:\t 0\t 1\t 2\nVisit")
postorder_tab(root)
print("\ninorder:")
print("Depth:\t0 \t1 \t 2\nVisit")
inorder_tab(root)