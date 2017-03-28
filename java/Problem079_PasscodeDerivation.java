/**
 * Created by Sneeuwpopsneeuw on 28-Aug-16.
 */
public class Problem079_PasscodeDerivation {
}


/*
        /////////////////////////////////////////////////////////////////////////////////////////
        //_____And_then_they_say_You_can_not_solve_any_problems_by_writing_comments_hahaha_____//
        /////////////////////////////////////////////////////////////////////////////////////////


3 characters are asked for in order
get the shortest possible secret passcode of length ????????????

    1   2   3
0   -   -   X
1   X   X   1
2   2   X   X
3   X   2   -
4   -   -   -
5   -   -   -
6   X   X   X
7   X   -   -
8   1   X   X
9   -   x   X

    731__890   <--  By using ctrl+f you can visualise the table above,  by using this table you can reverse the first 3 and last 3 digits
    73162890        We also need to place 6 and 2 so we use ctrl+f once again.
319
680
180
690
129
620
762
689
762
318
368
710
720
710
629
168
160
689
716
731     first 3 ?
736
729
316
729
729
710
769
290
719
680
318
389
162
289
162
718
729
319
790
680
890     last 3 ?
362
319
760
316
729
380
319
728
716

 */