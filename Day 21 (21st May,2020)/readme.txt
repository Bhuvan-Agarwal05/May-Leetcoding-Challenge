This Code is being testes with 32 TestCases...


Solution:- 

	Input: matrix =
			[
  			   [0,1,1,1],
  			   [1,1,1,1],
  			   [0,1,1,1]
			]

       Solution 1:- 
		Create a matrix of same number of rows and columns as the input matrix.
		
		Traverse the whole matrix and modify ->    [If matrix[i][j]==1   then ,  matCopy[i][j] = 1 + min(top,left,topleft)  ]
		[
		   [0,1,1,1],
		   [1,1,2,2],
		   [0,1,2,3]
		]
	
		Now Count the whole matrix ,,, the sum is 15 which is our output...
