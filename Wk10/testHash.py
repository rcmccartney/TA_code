# i am using global variables, but better idea is to use a class for labs..
N = 10
hashTable = [None for _ in range(N)]
size = 0

def hashFn(str, N):
	"""hashFn: (string, int) -> int"""
	value = ord(str[0]) - ord('a')
	return value % N

def insert(key):
	global size
	hashCode = hashFn(key, N)
	# we don't have a way to resize, so don't want to insert if 
	# the table is full - check if any slots are open
	if size == N:
		print("Can't insert - Need a resizing function!")
		return
	# find the right place to insert this key, value pair by looking
	# for an open position in the table
	while hashCode < len(hashTable) and hashTable[hashCode] is not None:
		# this key already exists in the table
		if key == hashTable[hashCode][0]:
			# value is one more than the value of this item before
			# need to make a new tuple since tuples are immutable
			hashTable[hashCode] = (key, hashTable[hashCode][1] + 1)
			return
		hashCode += 1  # this is open addressing
		if hashCode >= len(hashTable):
			hashCode = 0
	# since the key was not found already in the table, the word count is 1
	# and we increment the size
	hashTable[hashCode] = (key, 1)
	size += 1
		
def main():
	print("hash code for zebra:", hashFn("zebra",10))

	print(hashTable, '\n')
	insert('batman')
	print(hashTable, '\n')
	insert('has')
	print(hashTable, '\n')
	insert('zebra')
	print(hashTable, '\n')
	insert('all')	
	print(hashTable, '\n')
	insert('his')
	print(hashTable, '\n')
	insert('gizmos')
	print(hashTable, '\n')
	insert('encircling')
	print(hashTable, '\n')
	insert('his')
	print(hashTable, '\n')
	insert('belt')
	print(hashTable, '\n')
	insert('furry')
	print(hashTable, '\n')
	insert('striped')
	print(hashTable, '\n')
	print("size:", size, '\n')
	
	# test lack of resizing
	insert('overflow')
	print(hashTable)
	
if __name__ == '__main__':
	main()