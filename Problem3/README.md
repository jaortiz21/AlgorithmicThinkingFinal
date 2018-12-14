This problem focuses on palindromic substrings and finding how many palindromes are within each substring of a particular string.

1. This problem can be solved recursively by first starting with every consecutive substring of length 2, checking if both are equal to each other. Otherwise, if the full string is a palindrome i.e. index 0 to length-1, then we store that and move onto 0+1 and length-1, as well as 0 and length-2. Here, we would remove common so palindrome substrings. Else if not a palindrome, we still move on just like in the previous example.


2. Here I would use a 2d array to store count of the substrings along with another 2d boolean array that says true of the corresponding substring is a palindrome. These palindromes will be stored in a List to be printed out at the end. The 2D arrays would be able to cut down on knowing where a palindrome is possible, and where it is not.