This Code is being testes with 91 TestCases...


Given, Solution =>

How to traverse the tree
   There are two general strategies to traverse a tree:

	Depth First Search (DFS)-
		In this strategy, we adopt the depth as the priority, so that one would start from a root and reach all the way down to certain leaf, and then back to root to reach another branch.
		The DFS strategy can further be distinguished as preorder, inorder, and postorder depending on the relative order among the root node, left node and right node.

	Breadth First Search (BFS)-
		We scan through the tree level by level, following the order of height, from top to bottom. 
		The nodes on higher level would be visited before the ones with lower levels.
		On the following figure the nodes are numerated in the order you visit them, please follow 1-2-3-4-5 to compare different strategies.


	To solve the problem, one could use the property of BST : inorder traversal of BST is an array sorted in the ascending order.



Approach 1: Recursion
	It's a very straightforward approach with \mathcal{O}(N)O(N) time complexity. 
	The idea is to build an inorder traversal of BST which is an array sorted in the ascending order. 
	Now the answer is the (k - 1)th element of this array.

Complexity Analysis-
	Time complexity : O(N)O(N) to build a traversal.
	Space complexity : O(N)O(N) to keep an inorder traversal.


Approach 2: Iteration
	The above recursion could be converted into iteration, with the help of stack. 
	This way one could speed up the solution because there is no need to build the entire inorder traversal, and one could stop after the kth element.

Complexity Analysis-
	Time complexity : O(H + k)O(H+k), where HH is a tree height. This complexity is defined by the stack, which contains at least H + kH+k elements, since before starting to pop out one has to go down to a leaf. This results in \mathcal{O}(\log N + k)O(logN+k) for the balanced tree and \mathcal{O}(N + k)O(N+k) for completely unbalanced tree with all the nodes in the left subtree.
	Space complexity : O(H + k)O(H+k), the same as for time complexity, \mathcal{O}(N + k)O(N+k) in the worst case, and \mathcal{O}(\log N + k)O(logN+k) in the average case.

Follow up-
What if the BST is modified (insert/delete operations) often and you need to find the kth smallest frequently? How would you optimize the kthSmallest routine?
Insert and delete in a BST were discussed last week, the time complexity of these operations is O(H)O(H), where HH is a height of binary tree, and H = \log NH=logN for the balanced tree.

Hence without any optimisation insert/delete + search of kth element has \mathcal{O}(2H + k)O(2H+k) complexity. How to optimise that?

That's a design question, basically we're asked to implement a structure which contains a BST inside and optimises the following operations :

Insert

Delete

Find kth smallest

Seems like a database description, isn't it? Let's use here the same logic as for LRU cache design, and combine an indexing structure (we could keep BST here) with a double linked list.

Such a structure would provide:

\mathcal{O}(H)O(H) time for the insert and delete.

\mathcal{O}(k)O(k) for the search of kth smallest.

bla

The overall time complexity for insert/delete + search of kth smallest is \mathcal{O}(H + k)O(H+k) instead of \mathcal{O}(2H + k)O(2H+k).

Complexity Analysis

Time complexity for insert/delete + search of kth smallest: \mathcal{O}(H + k)O(H+k), where HH is a tree height. \mathcal{O}(\log N + k)O(logN+k) in the average case, \mathcal{O}(N + k)O(N+k) in the worst case.

Space complexity : \mathcal{O}(N)O(N) to keep the linked list.
