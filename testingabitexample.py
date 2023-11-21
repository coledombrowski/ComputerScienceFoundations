# Testing if bit at position 3 is set
bit_position = 3
number = 0b101010  # Example number
mask = 1 << bit_position
is_set = number & mask != 0
