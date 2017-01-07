/**
 * Created by Sneeuwpopsneeuw on 02-Jan-17.
 */
public class Problem345_MatrixSum {  // TODO: Problem345_MatrixSum
    public static void main(String[] args) {
        int[][] map = {
                { 7  ,  53, 183, 439, 863, 497, 383, 563,  79, 973, 287,  63, 343, 169, 583 },
                { 627, 343, 773, 959, 943, 767, 473, 103, 699, 303, 957, 703, 583, 639, 913 },
                { 447, 283, 463,  29,  23, 487, 463, 993, 119, 883, 327, 493, 423, 159, 743 },
                { 217, 623,   3, 399, 853, 407, 103, 983,  89, 463, 290, 516, 212, 462, 350 },
                { 960, 376, 682, 962, 300, 780, 486, 502, 912, 800, 250, 346, 172, 812, 350 },
                { 870, 456, 192, 162, 593, 473, 915,  45, 989, 873, 823, 965, 425, 329, 803 },
                { 973, 965, 905, 919, 133, 673, 665, 235, 509, 613, 673, 815, 165, 992, 326 },
                { 322, 148, 972, 962, 286, 255, 941, 541, 265, 323, 925, 281, 601,  95, 973 },
                { 445, 721,  11, 525, 473,  65, 511, 164, 138, 672,  18, 428, 154, 448, 848 },
                { 414, 456, 310, 312, 798, 104, 566, 520, 302, 248, 694, 976, 430, 392, 198 },
                { 184, 829, 373, 181, 631, 101, 969, 613, 840, 740, 778, 458, 284, 760, 390 },
                { 821, 461, 843, 513,  17, 901, 711, 993, 293, 157, 274,  94, 192, 156, 574 },
                { 34 , 124,   4, 878, 450, 476, 712, 914, 838, 669, 875, 299, 823, 329, 699 },
                { 815, 559, 813, 459, 522, 788, 168, 586, 966, 232, 308, 833, 251, 631, 107 },
                { 813, 883, 451, 509, 615,  77, 281, 613, 459, 205, 380, 274, 302,  35, 805 }
        };


        int totaal = 1;

        for (int a=0; a < map.length; a++) {   if(map[0][a] < 450) continue;
        for (int b=0; b < map.length; b++) {   if(map[1][b] < 450  || equals(b, a)) continue;
        for (int c=0; c < map.length; c++) {   if(map[2][c] < 450  || equals(c, a,b)) continue;
        for (int d=0; d < map.length; d++) {   if(map[3][d] < 450  || equals(d, a,b,c)) continue;
        for (int e=0; e < map.length; e++) {   if(map[4][e] < 450  || equals(e, a,b,c,d)) continue;
        for (int f=0; f < map.length; f++) {   if(map[5][f] < 450  || equals(f, a,b,c,d,e)) continue;
        for (int g=0; g < map.length; g++) {   if(map[6][g] < 450  || equals(g, a,b,c,d,e,f)) continue;
        for (int h=0; h < map.length; h++) {   if(map[7][h] < 450  || equals(h, a,b,c,d,e,f,g)) continue;
        for (int i=0; i < map.length; i++) {   if(map[8][i] < 450  || equals(i, a,b,c,d,e,f,g,h)) continue;
        for (int j=0; j < map.length; j++) {   if(map[9][j] < 450  || equals(j, a,b,c,d,e,f,g,h,i)) continue;
        for (int k=0; k < map.length; k++) {   if(map[10][k] < 450 || equals(k, a,b,c,d,e,f,g,h,i,j)) continue;
        for (int l=0; l < map.length; l++) {   if(map[11][l] < 450 || equals(l, a,b,c,d,e,f,g,h,i,j,k)) continue;
        for (int m=0; m < map.length; m++) {   if(map[12][m] < 450 || equals(m, a,b,c,d,e,f,g,h,i,j,k,l)) continue;
        for (int n=0; n < map.length; n++) {   if(map[13][n] < 450 || equals(n, a,b,c,d,e,f,g,h,i,j,k,l,m)) continue;
        for (int o=0; o < map.length; o++) {   if(map[14][o] < 450 || equals(o, a,b,c,d,e,f,g,h,i,j,k,l,m,n)) continue;

                int tmp = map[0][a] + map[1][b] + map[2][c] + map[3][d] + map[4][e] + map[5][f] + map[6][g] + map[7][h]
                        + map[8][i] + map[9][j] + map[10][k] + map[11][l] + map[12][m] + map[13][n] + map[14][o];
                totaal = (tmp > totaal) ? tmp : totaal;

        }}}}}}}}}}}}}}}


        System.out.println("");
        System.out.println(totaal);
    }

    private static boolean equals(int x, int ... inputs) {
        for (int i = 0; i < inputs.length; ++i)
            if (inputs[i] == x)
                return true;

        return false;
    }
}
