#!/usr/local/bin/python3

"""
This week focuses on tail recursion.  The power 
of tail recursion comes from the fact that it can 
always be converted into iteration.  Here is an
example of a recursive function and its iterative 
form.  Note that the base case of recursion becomes
the conditional on the iteration, except you are testing
whether to continue instead of whether to stop (so the 
truth statement is reversed!). the recursive function
call becomes an update to the variables in iteration.
"""


from turtle import *

def draw_sq_rec(sides):
	if sides == 0:
		pass
	else:
		forward(100)
		right(90)
		draw_sq_rec(sides-1)



def draw_sq_iter(sides):

	while sides != 0:
		forward(100)
		right(90)
		sides -= 1  # sides = sides - 1

draw_sq_rec(4)
draw_sq_iter(4)
input("Wait")


