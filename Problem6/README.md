Here we would want to find the max length of a pair chain given a pair of n numbers. Each pair can be considered a link of a chain, and they can only connect if the last value of the first link is smaller than the first value of the second link.

1. Here the recursive aspect involves checking the first pair of the chain and ensuring that our array of index i is has the longest length of the chain. When we move onto the next link, we want to make sure that that first value is bigger than our most previous value. If so, then we can extend the chain.

2. All we need in this case is an array of length of number of pairs, that stores the longest pair chain for that particular row. This eliminates the need to go back and checking if the old pairs can be added with the new pair.