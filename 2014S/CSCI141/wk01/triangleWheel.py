#!/usr/local/bin/python3
"""
Using turtle to show how to make functions and the 
value of function re-use.
It takes more to code initially, but gives us much 
more flexibility to re-use our drawTriangle function
at a later time (shown by the one triangle off to the
right after our original figure is drawn).
"""


from turtle import *

def drawTriangle():
	forward(60)
	left(120)
	forward(60)
	left(120)
	forward(60)
	left(120)


def main():
	drawTriangle()
	right(90)
	drawTriangle()
	right(90)
	drawTriangle()
	right(90)
	drawTriangle()
	right(90)

	up()
	forward(120)
	down()
	drawTriangle()

main()
input("Enter to close")

