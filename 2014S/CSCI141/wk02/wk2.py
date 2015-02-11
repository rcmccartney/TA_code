#!/usr/local/bin/python3

"""
This week the focus is on recursion and how to 
properly form a recursive function.  For proper
recursion, there needs to be a base case and the
recursive call needs to decrement towards the base
case (or it will run forever!).
"""

from turtle import *
import sys

def crosses(S, N):
	if N <= 0:
		return
	
	forward(S)
	left(90)
	crosses(S/2, N-1)
	
	right(90)
	crosses(S/2, N-1)
	
	right(90)
	crosses(S/2, N-1)

	left(90)
	back(S)

def main():
	S = int(input("Enter S: "))
	N = int(input("Enter N: "))
	crosses(S, N)

main()
input('Enter to close')
