# LearnBySort
1. Take the sum of each position in an array of 1s and 0s
2. Make the position with the highest count of 1s a Maximum
3. Remove all cases that contain that 1 in that position
4. Take the sum of the next position with the highest sum
5. Make that the maximum
6. Remove all cases where the first and second highest counts are 1s


This is one way to find the most important positions where 1 leads to an affirmative. 0s are not considered in this example and
all are affirmative test cases. Also, the position means the same thing in every test case.

## Examples

Example 1

{1, 0, 1}

{1, 0, 0}

{0, 1, 1}

{1, 1, 1}

Position 0 and 2 are where the maximum is at 3.

Remove {1,0,1},{1,0,0},{0,1,1},{1, 1, 1}

Position 0 and 2 tie.

Example 2

{1, 0, 1}

{1, 0, 0}

{0, 1, 1}

{0, 0, 1}

Position 2 is where the maximum is at 3.

Remove {1,0,1},{0,1,1} and {0, 0, 1}

{1,0,0} is left with 1.

Position 0 is the next most important 1.
