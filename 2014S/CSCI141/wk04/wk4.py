#!/usr/local/bin/python3

"""
This week we focused on strings and how to manipulate
them. In this program we use slicing notation to index
into a string and change one character for another.

Strings are immutable so notice we need to
create a new string when we are making changes.
"""

def replace(str1, char2replace, newChar):
	
	for i in range(len(str1)):
		if str1[i] == char2replace:
			str1 = str1[:i] + newChar + str1[i+1:]
	return str1


if __name__ == "__main__":
	print(replace('test', 't', 'x'))
