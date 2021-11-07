## [Equal Sides Of An Array](https://github.com/McChama/java-katas/blob/master/src/com/company/EqualSidesOfAnArray.java)
You are going to be given an array of integers. Your job is to take that array and find an index N where the sum of the integers to the left of N is equal to the sum of the integers to the right of N. If there is no index that would make this happen, return -1.
<details>
  <summary>Example 1</summary>
  Let's say you are given the array {1,2,3,4,3,2,1}:
  Your function will return the index 3, because at the 3rd position of the array, the sum of left side of the index ({1,2,3}) and the sum of the right side of the index ({3,2,1})  both equal 6.
</details>

<details>
  <summary>Example 2</summary>
  You are given the array {1,100,50,-51,1,1}
  Your function will return the index 1, because at the 1st position of the array, the sum of left side of the index ({1}) and the sum of the right side of the index ({50,-51,1,1}) both equal 1.
</details>

<details>
  <summary>Example 3</summary>
  You are given the array {20,10,-80,10,10,15,35}
  At index 0 the left side is {}
  The right side is {10,-80,10,10,15,35}
  They both are equal to 0 when added. (Empty arrays are equal to 0 in this problem)
  Index 0 is the place where the left side and right side are equal.
</details>

<details>
  <summary>Extra notes</summary>  
  <strong>Note:</strong> Please remember that in most programming/scripting languages the index of an array starts at 0.
  
  <strong>Note:</strong> If you are given an array with multiple answers, return the lowest correct index.
  
  <strong>Input:</strong> An integer array of length 0 < arr < 1000. The numbers in the array can be any integer positive or negative.
  
  <strong>Output:</strong> The lowest index N where the side to the left of N is equal to the side to the right of N. If you do not find an index that fits these rules, then you will return -1.
</details>

## [Smallest Integer Finder](https://github.com/McChama/java-katas/blob/master/src/com/company/SmallestIntegerFinder.java)
Given an array of integers your solution should find the smallest integer.

For example:

- Given `[34, 15, 88, 2]` your solution will return 2
- Given `[34, -345, -1, 100]` your solution will return -345
You can assume, for the purpose of this kata, that the supplied array will not be empty.
  
## [Sum of Numbers](https://github.com/McChama/java-katas/blob/master/src/com/company/SumOfNumbers.java)
Given two integers a and b, which can be positive or negative, find the sum of all the integers between and including them and return it. If the two numbers are equal return a or b.

Note: a and b are not ordered!

Examples (a, b) --> output (explanation)
```
(1, 0) --> 1 (1 + 0 = 1)
(1, 2) --> 3 (1 + 2 = 3)
(0, 1) --> 1 (0 + 1 = 1)
(1, 1) --> 1 (1 since both are same)
(-1, 0) --> -1 (-1 + 0 = -1)
(-1, 2) --> 2 (-1 + 0 + 1 + 2 = 2)
```
