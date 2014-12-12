def bad_merge(sorted1 , sorted2):
	"""
	To the student - can you spot the bugs in this code
	that is used in the merging step of mergesort
	"""
	result = []
	index1 = 0
	index2 = 0
	while index1 < len(sorted1) and index2 < len(sorted2):
		result.append(sorted1[index1])
		index1 += 1
		result.append(sorted2[index2])
		index2 = index2 + 1
	if index1 < len(sorted1):
		result.append(sorted1[index2:])
	elif index2 < len(sorted2):
		result.append(sorted2[index1:])
	return result

def good_merge(sorted1 , sorted2):
	"""
	Here is the corrected code - 
	Note that we need to test what value to append to 
	result and that we need to extend the list with the
	correct index for that list	
	"""
	result = []
	index1 = 0
	index2 = 0
	while index1 < len(sorted1) and index2 < len(sorted2):
		if sorted1[index1] < sorted2[index2]:
			result.append(sorted1[index1])
			index1 += 1
		else:
			result.append(sorted2[index2])
			index2 = index2 + 1
	if index1 < len(sorted1):
		result.extend(sorted1[index1:])
	elif index2 < len(sorted2):
		result.extend(sorted2[index2:])
	return result
	
	
a = [1,2,3,4,5]
b = [6,7,8,9,10,11,12]

print("Bad", bad_merge(a,b))
print("Good", good_merge(a,b))
