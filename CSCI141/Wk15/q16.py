from rit_object import * 


class Item(rit_object):
   """ 
   An Item in a grocery store
   containing a name and aisle number
   """
   __slots__ = ("grocery", "aisle")
   _types    = (str, int)


def organize(inventory, grocery_list, exists=set()):
	"""
	Create the organized store with items arranged by aisle - uses a single list and a dictionary
	Assuming N items in inventory and G items in grocery_list
	Students - don't implement it this way, I was having fun seeing how concise 
	I could be (at the expense of understandability and efficiency)
	"""
	lst = sorted(inventory, key=lambda x : x.aisle)  #sort by aisle - O(N*logN)
	aisles = [[] for y in lst if not exist_test(y.aisle, exists)]  #create unique aisles only - O(N)
	[aisles[y.aisle].append(y.grocery) for y in lst if y.grocery in grocery_list]  #append groceries - O(N*G) 
	return aisles


def exist_test(y, d):
	"""
	test if we have seen this aisle before
	"""
	if y in d: 
		return True
	else:  
		d.add(y)
		return False


def main():
	inventory = (Item('bread',0), Item('muffins',0), Item('coldcuts',5), Item('toothpaste',1),
				Item('eyeliner',1), Item('soda',2), Item('bottledwater',2), Item('cereal',3),
				Item('milk',4), Item('eggs',4), Item('butter',4), Item('meat',5), Item('fish',5))
	grocery_list = ('muffins','butter','soda')
	print(organize(inventory, grocery_list))


if __name__ == "__main__":
	main()