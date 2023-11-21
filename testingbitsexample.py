# Creating a mask to test bits at positions 2, 4, and 6
bit_positions = [2, 4, 6]
mask = 0
for pos in bit_positions:
    mask |= 1 << pos
