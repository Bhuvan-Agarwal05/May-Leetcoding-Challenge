This Code is being tested with 68 TestCases...

For Optimizing the Brute Force Approach
I have used Binary Search Algorithm Concept...


  example:- 
  	
	Input: num=9

    =>	     1  2  3  4  5  6  7  8  9
	
	left=1
	high=num


    =>	     1  2  3  4  5  6  7  8  9
             |                       |
            left                    right


      Calculate: mid = (1+9)/2 = 5

    
    =>       1  2  3  4  5  6  7  8  9
             |           |           |
            left        mid         right

      
          mid*mid = 5*5 =25
          25 > num(9)
       So, right = mid - 1

	
    =>      1  2  3  4  5  6  7  8  9
            |        |
           left     right

	
	Calculate: mid = (1+4)/2 = 2


    =>     1  2  3  4  5  6  7  8  9
           |  |     |
         left mid  right

	
	  mid*mid = 2*2 =4
          4 < num(9)
       So, left = mid + 1

     
    =>    1  2  3  4  5  6  7  8  9
                |  |
              left right


	Calculate: mid = (3+4)/2 = 3

	mid*mid = 3*3 == num(9)
           return true;

