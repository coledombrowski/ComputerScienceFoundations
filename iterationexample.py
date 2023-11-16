# Creating the iterator
my_list = [1, 2, 3, 4, 5]
my_iter = iter(my_list)  # Create an iterator from a list

# Iterating
print(next(my_iter))  # Output: 1
print(next(my_iter))  # Output: 2
print(next(my_iter))  # Output: 3

# LOOP
for element in my_iter:
    print(element)  # Output: 4, 5 (Iterates over remaining elements)
