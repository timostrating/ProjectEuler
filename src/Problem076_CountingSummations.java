/**
 * Created by Sneeuwpopsneeuw on 26-Aug-16.
 */
public class Problem076_CountingSummations {  // TODO:   76  -->  77  -->  78
//    public static int[] coinValues = new int[0];
//
//    public static void main(String[] args) {
//        coinValues = new int[100];
//        for (int i=0; i < 100; i++) {
//            coinValues[i] = i;
//        }
//        System.out.println(numWays(100, 100));
//    }
//    static int numWays(int p, int maxCoin){
//        if(p == 1)
//            return 1;
//        else if(p < 0)
//            return 0;
//
//        int ways = 0;
//        for(int i=0; i <= 100  &&  coinValues[i] <= maxCoin; i++){
//            ways += numWays(p - coinValues[i], coinValues[i]);
//        }
//        return ways;
//    }


    public static void main(String[] args) {
        long ans = 0;


        int Aa = 100;
        for (int Ab=Aa; Ab>=0; Ab-=99) {                // far far far,  to slow too even run
        for (int Ac=Ab; Ac>=0; Ac-=98) {
        for (int Ad=Ac; Ad>=0; Ad-=97) {
        for (int Ae=Ad; Ae>=0; Ae-=96) {
        for (int Af=Ae; Af>=0; Af-=95) {
        for (int Ag=Af; Ag>=0; Ag-=94) {
        for (int Ah=Ag; Ah>=0; Ah-=93) {
        for (int Ai=Ah; Ai>=0; Ai-=92) {
        for (int Aj=Ai; Aj>=0; Aj-=91) {
            for (int Ba=Aj; Ba>=0; Ba-=90) {
            for (int Bb=Ba; Bb>=0; Bb-=89) {
            for (int Bc=Bb; Bc>=0; Bc-=88) {
            for (int Bd=Bc; Bd>=0; Bd-=87) {
            for (int Be=Bd; Be>=0; Be-=86) {
            for (int Bf=Be; Bf>=0; Bf-=85) {
            for (int Bg=Bf; Bg>=0; Bg-=84) {
            for (int Bh=Bg; Bh>=0; Bh-=83) {
            for (int Bi=Bh; Bi>=0; Bi-=82) {
            for (int Bj=Bi; Bj>=0; Bj-=81) {
                for (int Ca=Bj; Ca>=0; Ca-=80) {
                for (int Cb=Ca; Cb>=0; Cb-=79) {
                for (int Cc=Cb; Cc>=0; Cc-=78) {
                for (int Cd=Cc; Cd>=0; Cd-=77) {
                for (int Ce=Cd; Ce>=0; Ce-=76) {
                for (int Cf=Ce; Cf>=0; Cf-=75) {
                for (int Cg=Cf; Cg>=0; Cg-=74) {
                for (int Ch=Cg; Ch>=0; Ch-=73) {
                for (int Ci=Ch; Ci>=0; Ci-=72) {
                for (int Cj=Ci; Cj>=0; Cj-=71) {
                    for (int Da=Cj; Da>=0; Da-=70) {
                    for (int Db=Da; Db>=0; Db-=69) {
                    for (int Dc=Db; Dc>=0; Dc-=68) {
                    for (int Dd=Dc; Dd>=0; Dd-=67) {
                    for (int De=Dd; De>=0; De-=66) {
                    for (int Df=De; Df>=0; Df-=65) {
                    for (int Dg=Df; Dg>=0; Dg-=64) {
                    for (int Dh=Dg; Dh>=0; Dh-=63) {
                    for (int Di=Dh; Di>=0; Dh-=62) {
                    for (int Dj=Di; Dj>=0; Dj-=61) {
                        for (int Ea=Dj; Ea>=0; Ea-=60) {
                        for (int Eb=Ea; Eb>=0; Eb-=59) {
                        for (int Ec=Eb; Ec>=0; Ec-=58) {
                        for (int Ed=Ec; Ed>=0; Ed-=57) {
                        for (int Ee=Ed; Ee>=0; Ee-=56) {
                        for (int Ef=Ee; Ef>=0; Ef-=55) {
                        for (int Eg=Ef; Eg>=0; Eg-=54) {
                        for (int Eh=Eg; Eh>=0; Eh-=53) {
                        for (int Ei=Eh; Ei>=0; Ei-=52) {
                        for (int Ej=Ei; Ej>=0; Ej-=51) {
                            for (int Fa=Ej; Fa>=0; Fa-=50) {
                            for (int Fb=Fa; Fb>=0; Fb-=49) {
                            for (int Fc=Fb; Fc>=0; Fc-=48) {
                            for (int Fd=Fc; Fd>=0; Fd-=47) {
                            for (int Fe=Fd; Fe>=0; Fe-=46) {
                            for (int Ff=Fe; Ff>=0; Ff-=45) {
                            for (int Fg=Ff; Fg>=0; Fg-=44) {
                            for (int Fh=Fg; Fh>=0; Fh-=43) {
                            for (int Fi=Fh; Fi>=0; Fi-=42) {
                            for (int Fj=Fi; Fj>=0; Fj-=41) {
                                for (int Ga=Fj; Ga>=0; Ga-=40) {
                                for (int Gb=Ga; Gb>=0; Gb-=39) {
                                for (int Gc=Gb; Gc>=0; Gc-=38) {
                                for (int Gd=Gc; Gd>=0; Gd-=37) {
                                for (int Ge=Gd; Ge>=0; Ge-=36) {
                                for (int Gf=Ge; Gf>=0; Gf-=35) {
                                for (int Gg=Gf; Gg>=0; Gg-=34) {
                                for (int Gh=Gg; Gh>=0; Gh-=33) {
                                for (int Gi=Gh; Gi>=0; Gi-=32) {
                                for (int Gj=Gi; Gj>=0; Gj-=31) {
                                    for (int Ha=Gj; Ha>=0; Ha-=30) {
                                    for (int Hb=Ha; Hb>=0; Hb-=29) {
                                    for (int Hc=Hb; Hc>=0; Hc-=28) {
                                    for (int Hd=Hc; Hd>=0; Hd-=27) {
                                    for (int He=Hd; He>=0; He-=26) {
                                    for (int Hf=He; Hf>=0; Hf-=25) {
                                    for (int Hg=Hf; Hg>=0; Hg-=24) {
                                    for (int Hh=Hg; Hh>=0; Hh-=23) {
                                    for (int Hi=Hh; Hi>=0; Hi-=22) {
                                    for (int Hj=Hi; Hj>=0; Hj-=21) {
                                        for (int Ia=Hj; Ia>=0; Ia-=20) {
                                        for (int Ib=Ia; Ib>=0; Ib-=19) {
                                        for (int Ic=Ib; Ic>=0; Ic-=18) {
                                        for (int Id=Ic; Id>=0; Id-=17) {
                                        for (int Ie=Id; Ie>=0; Ie-=16) {
                                        for (int If=Ie; If>=0; If-=15) {
                                        for (int Ig=If; Ig>=0; Ig-=14) {
                                        for (int Ih=Ig; Ih>=0; Ih-=13) {
                                        for (int Ii=Ih; Ii>=0; Ii-=12) {
                                        for (int Ij=Ii; Ij>=0; Ij-=11) {
                                            for (int Ja=Ij; Ja>=0; Ja-=10) {
                                            for (int Jb=Ja; Jb>=0; Jb-=9) {
                                            for (int Jc=Jb; Jc>=0; Jc-=8) {
                                            for (int Jd=Jc; Jd>=0; Jd-=7) {
                                            for (int Je=Jd; Je>=0; Je-=6) {
                                            for (int Jf=Je; Jf>=0; Jf-=5) {
                                            for (int Jg=Jf; Jg>=0; Jg-=4) {
                                            for (int Jh=Jg; Jh>=0; Jh-=3) {
                                            for (int Ji=Jh; Ji>=0; Ji-=2) {
//                                            for (int Jj=Ji; Jj>=0; Jj-=1) {
                                                    ans ++;
                                            } } } } } } } } } /*}*/
                                        } } } } } } } } } }
                                    } } } } } } } } } }
                                } } } } } } } } } }
                            } } } } } } } } } }
                        } } } } } } } } } }
                    } } } } } } } } } }
                } } } } } } } } } }
            } } } } } } } } } }
        } } } } } } } } } /*}*/

        System.out.println("");
        System.out.println("ans = "+ans);
    }
}


/*

        for (int a=100; a>0; a-=100) {
            for (int b=a; b>=0; b-=99) {
                for (int c=b; c>=0; c-=98) {
                    for (int d=c; d>=0; d-=97) {
                        for (int e=d; e>=0; e-=96) {
                            for (int f=e; f>=0; f-=95) {
                                for (int g=f; g>=0; g-=94) {
                                    for (int h=g; h>=0; h-=93) {
                                        ...........................
                                            ..........................

        This must be made smart   while + array ?

        */