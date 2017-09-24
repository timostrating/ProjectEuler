A palindromic number reads the same both ways. The largest palindrome made
from the product of two 2-digit numbers is 9009 = 91 * 99.

Find the largest palindrome made from the product of two 3-digit numbers.

<?php 

$largest = 0;

for ($i=999; $i > 10; $i--) { 
	for ($j=999; $i <= $j; $j--) {

		$v = ($i*$j);
		if (strrev($v) == $v) {
			if($largest < $v ) {
				$largest = $v;
			}
		}
		
	}	
}

echo "Ans: $largest";

?>