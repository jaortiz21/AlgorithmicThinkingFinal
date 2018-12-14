Here our problem is focused on finding the minimum falling path sum of a square grid.

1. The recursive apporoach here works by starting out with the second to last row(last is already done). For each element we try to find its min movement path between straight down, down left, or down right. In this case, the best of that row will be chosen and added to the final sum, and we move onto the next(although we are going from top to bottom) row.

2. The only data needed to keep track of the sum is an integer value, since we are focused on the final path and not intermediate values. The comparisons along the way up the path removes the need to store more data than one value.
