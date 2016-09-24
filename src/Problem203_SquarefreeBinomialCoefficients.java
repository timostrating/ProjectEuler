/**
 * Created by Sneeuwpopsneeuw on 06-Sep-16.
 */
public class Problem203_SquarefreeBinomialCoefficients {  // TODO: Problem203_SquarefreeBinomialCoefficients
}


/*

The binomial coefficients nCk can be arranged in triangular form, Pascal's triangle, like this:

                            1	                                = 1
                        1		1	                            = 2
                    1		2		1	                        = 4
                1		3		3		1	                    = 8
            1		4		6		4		1	                = 16
        1		5		10		10		5		1	            = 32
    1		6		15		20		15		6		1	        = 64
1		7		21		35		35		21		7		1       = 128



It can be seen that the first eight rows of Pascal's triangle contain twelve distinct numbers: 1, 2, 3, 4, 5, 6, 7, 10, 15, 20, 21 and 35.

A positive integer n is called squarefree if no square of a prime divides n.
Of the twelve distinct numbers in the first eight rows of Pascal's triangle, all except 4 and 20 are squarefree.
The sum of the distinct squarefree numbers in the first eight rows is 105.

Find the sum of the distinct squarefree numbers in the first 51 rows of Pascal's triangle.





Step 1:  generate this

    1
    1	1
    1	2	1
    1	3	3	1
    1	4	6	4	1
    1	5	10	10	5	1
    1	6	15	20	15	6	1
    1	7	21	35	35	21	7	1



Step 2:  distinct numbers list

    1, 2, 3, 4, 5, 6, 7, 10, 15, 20, 21 and 35



Step 3:  squarefree check  +  sum




 */