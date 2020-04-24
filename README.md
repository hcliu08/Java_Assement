# Java_Assement
1. Order Processing using Multithreading

This class tests the Worker class. It invokes the run() method of a Worker
* instance.

The Worker class holds an instance of a queue of Order objects.
The max size of this queue is 5. 100 Orders are generated asynchronously and placed in the queue.

Those 100 Orders are processed concurrently as they are placed in the
queue. Any time we are waiting for Orders to be FULFILLED, this should be printed to standard output. An Order is simply a class with a state field and an order number (1-100). An Order can be in either NEW or FULFILLED states. When a new Order is created, the default state is NEW. Whenever there is a state change, this is printed to standard output. The test ends when all Orders are FULFILLED.






2. Rotate Array

A zero-indexed array A consisting of N integers is given. Rotation of the array means that each element is shifted right by one index, and the last element of the array is also moved to the first place.
For example, the rotation of array A = [3, 8, 9, 7, 6] is [6, 3, 8, 9, 7]. The goal is to rotate array A K times; that is, each element of A will be shifted to the right by K indexes.
Write a function:
struct Results solution(int A[], int N, int K);
that, given a zero-indexed array A consisting of N integers and an integer K, returns the array A rotated K times.
For example, given array A = [3, 8, 9, 7, 6] and K = 3, the function should return [9, 7, 6, 3, 8].
Assume that:
	•	N and K are integers within the range [0..100];
	•	each element of array A is an integer within the range [−1,000..1,000].
In your solution, focus on correctness. The performance of your solution will not be the focus of the assessment.


3.  Permutation

A non-empty array A consisting of N integers is given.
A permutation is a sequence containing each element from 1 to N once, and only once.
For example, array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
is a permutation, but array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
is not a permutation, because value 2 is missing.
The goal is to check whether array A is a permutation.
Write a function:
int solution(int A[], int N);
that, given an array A, returns 1 if array A is a permutation and 0 if it is not.
For example, given array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
    A[3] = 2
the function should return 1.
Given array A such that:
    A[0] = 4
    A[1] = 1
    A[2] = 3
the function should return 0.
Assume that:
	•	N is an integer within the range [1..100,000];
	•	each element of array A is an integer within the range [1..1,000,000,000].
Complexity:
	•	expected worst-case time complexity is O(N);
	•	expected worst-case space complexity is O(N) (not counting the storage required for input arguments).


4. Web Application with REST API + AJAX

Create a Java Web Application to consume the following Github Users REST API. List out all the Usernames and on click of a name, display the Photo’s of all his/her follwers asynchronously next to the Username.

https://api.github.com/users

Technology Stack: HTML5, Bootstrap CSS, jQuery, AJAX
