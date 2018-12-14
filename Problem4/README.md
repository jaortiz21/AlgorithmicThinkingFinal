This problem asks to find if there is an arithmetic sequence in an array. Here an arithmetic sequence is any time where two consecutive numbers have the same difference.

1. The recursive aspect in this problem is checking from previously passed sequences on whether or not they equal to the same difference as the current sequence of numbers. This means that we will have to be looking back recursively.

2. This could easily be solved with a single array that for every index i, stores the number of possible arithmetic possible up until that range.