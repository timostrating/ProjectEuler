Print[
 Max[
  Select[
   Map[First[#]*Last[#] &, 
    Append[Subsets[Range[900, 999], {2}], Range[900, 999]]], 
    PalindromeQ[#] &]]]