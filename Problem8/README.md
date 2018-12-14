This problem asks for us to find whether it is possible to dived the array into k non-empty subsets whose sums are all equal.

1. The recursive aspect of this is that attempts to add an array element into the subset, and if it reaches the required sum, we recursively iterate to the next part, otherwise we backtrack for a different set of elements. If the number of subsets whose sum equal the required sum, we say it is possible to partition into K parts. So if the first subset is done, we recursively move onto the next subset until we have an error, or all k partitions are filled and satisfied.

2. This problem can be solved by first having an array for sum of each partition and a boolean array to check if an element is already taken into another partition.