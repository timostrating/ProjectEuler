import com.sun.javafx.geom.Vec2d;

import java.util.*;

/**
 * Created by Sneeuwpopsneeuw on 10-Aug-16.
 */
public class Problem096_SuDoku {  // TODO: Problem0SIZE6_SuDoku
    public static void main(String[] args) {
        new Problem096_SuDoku().run();
    }
    final static int SIZE = 9;
    static String output = "";
    static int outputValue = 0;



    public void run() {
        String[] input = {
                "003020600900305001001806400008102900700000008006708200002609500800203009005010300",
                "200080300060070084030500209000105408000000000402706000301007040720040060004010003",
                "000000907000420180000705026100904000050000040000507009920108000034059000507000000",
                "030050040008010500460000012070502080000603000040109030250000098001020600080060020",
                "020810740700003100090002805009040087400208003160030200302700060005600008076051090",
                "100920000524010000000000070050008102000000000402700090060000000000030945000071006",
                "043080250600000000000001094900004070000608000010200003820500000000000005034090710",
                "480006902002008001900370060840010200003704100001060049020085007700900600609200018",
                "000900002050123400030000160908000000070000090000000205091000050007439020400007000",
                "001900003900700160030005007050000009004302600200000070600100030042007006500006800",
                "000125400008400000420800000030000095060902010510000060000003049000007200001298000",
                "062340750100005600570000040000094800400000006005830000030000091006400007059083260",
                "300000000005009000200504000020000700160000058704310600000890100000067080000005437",
                "630000000000500008005674000000020000003401020000000345000007004080300902947100080",
                "000020040008035000000070602031046970200000000000501203049000730000000010800004000",
                "361025900080960010400000057008000471000603000259000800740000005020018060005470329",
                "050807020600010090702540006070020301504000908103080070900076205060090003080103040",
                "080005000000003457000070809060400903007010500408007020901020000842300000000100080",
                "003502900000040000106000305900251008070408030800763001308000104000020000005104800",
                "000000000009805100051907420290401065000000000140508093026709580005103600000000000",
                "020030090000907000900208005004806500607000208003102900800605007000309000030020050",
                "005000006070009020000500107804150000000803000000092805907006000030400010200000600",
                "040000050001943600009000300600050002103000506800020007005000200002436700030000040",
                "004000000000030002390700080400009001209801307600200008010008053900040000000000800",
                "360020089000361000000000000803000602400603007607000108000000000000418000970030014",
                "500400060009000800640020000000001008208000501700500000000090084003000600060003002",
                "007256400400000005010030060000508000008060200000107000030070090200000004006312700",
                "000000000079050180800000007007306800450708096003502700700000005016030420000000000",
                "030000080009000500007509200700105008020090030900402001004207100002000800070000090",
                "200170603050000100000006079000040700000801000009050000310400000005000060906037002",
                "000000080800701040040020030374000900000030000005000321010060050050802006080000000",
                "000000085000210009960080100500800016000000000890006007009070052300054000480000000",
                "608070502050608070002000300500090006040302050800050003005000200010704090409060701",
                "050010040107000602000905000208030501040070020901080406000401000304000709020060010",
                "053000790009753400100000002090080010000907000080030070500000003007641200061000940",
                "006080300049070250000405000600317004007000800100826009000702000075040190003090600",
                "005080700700204005320000084060105040008000500070803010450000091600508007003010600",
                "000900800128006400070800060800430007500000009600079008090004010003600284001007000",
                "000080000270000054095000810009806400020403060006905100017000620460000038000090000",
                "000602000400050001085010620038206710000000000019407350026040530900020007000809000",
                "000900002050123400030000160908000000070000090000000205091000050007439020400007000",
                "380000000000400785009020300060090000800302009000040070001070500495006000000000092",
                "000158000002060800030000040027030510000000000046080790050000080004070100000325000",
                "010500200900001000002008030500030007008000500600080004040100700000700006003004050",
                "080000040000469000400000007005904600070608030008502100900000005000781000060000010",
                "904200007010000000000706500000800090020904060040002000001607000000000030300005702",
                "000700800006000031040002000024070000010030080000060290000800070860000500002006000",
                "001007090590080001030000080000005800050060020004100000080000030100020079020700400",
                "000003017015009008060000000100007000009000200000500004000000020500600340340200000",
                "300200000000107000706030500070009080900020004010800050009040301000702000000008006"
        };


        for (String str : input) {
            Sudoku sudoku = new Sudoku();
            for (int j = 0; j < str.length(); j++)
                if (str.charAt(j) != '0')
                    sudoku.registerValue(j / SIZE, j % SIZE, Character.getNumericValue(str.charAt(j)));

            sudoku.solve();
        }

        System.out.println(output);
        System.out.println("");
        System.out.println(outputValue);
    }


    class Sudoku {
        Map<Vec2d, GridItem> map = new HashMap<Vec2d, GridItem>();
        int discoverdItems = 0;

        public Sudoku() {
            for (int x=0; x < SIZE; x++) {  // LOOP x
                for (int y=0; y < SIZE; y++) {  // LOOP y
                    map.put(new Vec2d(x,y), new GridItem());
                }
            }
        }

        public void solve() {
            int i = 0;
            while (discoverdItems < SIZE * SIZE) {
                fireOnePossibleCellChecks();
                fireOnePossibleGridChecks();

                mistakeCheck();

                i++;
                if (i > 10)
                    break;
            }

            show();

            outputValue += map.get(new Vec2d(0,0)).value;
            output += " ("+map.get(new Vec2d(0,0)).value + ") ";
            output += Arrays.toString(map.get(new Vec2d(0,0)).possibleValues.toArray()) + "\n";

            outputValue += map.get(new Vec2d(1,0)).value;
            output += " ("+map.get(new Vec2d(1,0)).value + ") ";
            output += Arrays.toString(map.get(new Vec2d(1,0)).possibleValues.toArray()) + "\n";

            outputValue += map.get(new Vec2d(2,0)).value;
            output += " ("+map.get(new Vec2d(2,0)).value + ") ";
            output += Arrays.toString(map.get(new Vec2d(2,0)).possibleValues.toArray()) + "\n";
            output += "\n";

        }

        private void fireOnePossibleCellChecks() {
            for (int x = 0; x < SIZE; x++) {  // LOOP x
                for (int y = 0; y < SIZE; y++) {  // LOOP y
                    if (map.get(new Vec2d(x, y)).possibleValues.size() == 1) {
                        int value = map.get(new Vec2d(x, y)).possibleValues.get(0);
                        registerValue(x, y, value);
                    }
                }
            }
        }

        private void fireOnePossibleGridChecks() {
            for (int x = 0; x < SIZE; x++) {  // LOOP x
                for (int y = 0; y < SIZE; y++) {  // LOOP y
                    GridItem gridItem = map.get(new Vec2d(x,y));

                    for (int n=0; n < gridItem.possibleValues.size(); n++) {
                        List<Vec2d> list = new ArrayList<>();
                        int xStart = (x / 3) * 3;     // you should not write code like this
                        int yStart = (y / 3) * 3;     // It is cleaner when you just use the Math Class

                        for (int i = xStart; i < xStart + 3; i++) {  // LOOP x
                            for (int j = yStart; j < yStart + 3; j++) {  // LOOP y
                                if (map.get(new Vec2d(i, j)).possibleValues.contains( gridItem.possibleValues.get(n) ))
                                    list.add(new Vec2d(i, j));
                            }
                        }

                        int value = gridItem.possibleValues.get(n);

                        switch (list.size()) {
                            case 1:
                                registerValue(x, y, value);
                                break;
                            case 2:  // not really clean but it works
                                list.add(new Vec2d(list.get(0).x, list.get(0).y));
                            case 3:
                                if (list.get(0).x == list.get(1).x  &&  list.get(1).x == list.get(2).x) {
                                    System.out.print(" ("+list.get(0).x + " : " + list.get(0).y+") ");
                                    System.out.print(" ("+list.get(1).x + " : " + list.get(1).y+") ");
                                    System.out.print(" ("+list.get(2).x + " : " + list.get(2).y+") ");
                                    System.out.println(" ");
//                                    debug();

                                    for (int y2=0; y2 < SIZE; y2++) {
                                        if (y2 != list.get(0).y  &&  y2 != list.get(1).y  &&  y2 != list.get(2).y) {
                                            GridItem item = map.get(new Vec2d((int) list.get(0).x, y2));
                                            if (item.possibleValues.contains(value))
                                                item.possibleValues.remove(new Integer(value));
                                        }
                                    }
                                }
                                else if (list.get(0).y == list.get(1).y  &&  list.get(1).y == list.get(2).y) {
                                    System.out.print(" ("+list.get(0).x + " : " + list.get(0).y+") ");
                                    System.out.print(" ("+list.get(1).x + " : " + list.get(1).y+") ");
                                    System.out.print(" ("+list.get(2).x + " : " + list.get(2).y+") ");
                                    System.out.println(" ");
//                                    debug();

                                    for (int x2=0; x2 < SIZE; x2++) {
                                        if (x2 != list.get(0).x  &&  x2 != list.get(1).x  &&  x2 != list.get(2).x) {
                                            GridItem item = map.get(new Vec2d(x2, (int) list.get(0).y));
                                            if (item.possibleValues.contains(value))
                                                item.possibleValues.remove(new Integer(value));
                                        }
                                    }
                                }

                                break;
                        }
                    }

                }
            }

        }

        private void fireXwingChecks() {
            fireDirectionChecksRows();
            fireDirectionChecksCols();
        }

        private void fireDirectionChecksRows() {
            System.err.println("___Rows___");
            show();
            debug();

            for (int x = 0; x < SIZE; x++) {  // LOOP X
                List<Integer> missingValues = new ArrayList<>();
                for (int k=1; k <= SIZE; k++)
                    missingValues.add(k);

                for (int y = 0; y < SIZE; y++)
                    missingValues.remove( new Integer( map.get(new Vec2d(x,y)).value));

                System.err.println( Arrays.toString( missingValues.toArray() ) );
            }
            System.err.println("/___Rows___");
        }

        private void fireDirectionChecksCols() {
            System.err.println("___Cols___");
            show();
            debug();

            for (int y = 0; y < SIZE; y++) {  // LOOP y
                List<Integer> missingValues = new ArrayList<>();
                for (int k=1; k <= SIZE; k++)
                    missingValues.add(k);

                for (int x = 0; x < SIZE; x++)
                    missingValues.remove( new Integer( map.get(new Vec2d(x,y)).value));

                System.err.println( Arrays.toString( missingValues.toArray() ) );
            }
            System.err.println("/___Cols___");
        }



        private void mistakeCheck() {
            for (int x = 0; x < SIZE; x++) {  // LOOP x
                for (int y = 0; y < SIZE; y++) {  // LOOP y
                    if (map.get(new Vec2d(x, y)).possibleValues.size() == 0) {
                        if (map.get(new Vec2d(x, y)).value == 0) {
                            System.err.print("YOU MADE A MISTAKE");
                            debug();
                            throw new Error("");
                        }
                    }
                }
            }
        }



        public void show() {
            System.out.println("_SHOW_");
            for (int x=0; x < SIZE; x++) {  // LOOP x
                for (int y=0; y < SIZE; y++)  // LOOP y
                    System.out.print( map.get(new Vec2d(x,y)).value + ((y % 3 == 2)? "  " : " "));

                if(x % 3 == 2)
                    System.out.println("");

                System.out.println("");
            }
        }
        public void debug() {
            System.out.println("_DEBUG_");
            for (int x=0; x < SIZE; x++) {  // LOOP x
                for (int y=0; y < SIZE; y++) {  // LOOP y
                    GridItem gridItem = map.get(new Vec2d(x, y));
                    System.out.print("("+gridItem.value+") ");

                    for (int n=1; n <= SIZE; n++)
                        System.out.print((gridItem.possibleValues.contains(n))? gridItem.possibleValues.get( gridItem.possibleValues.indexOf( new Integer(n) )) : "_");

                    System.out.print((y % 3 == 2) ? "    " : "  ");
                }

                if(x % 3 == 2)
                    System.out.println("");

                System.out.println("");
            }
        }



        public void registerValue(int x, int y, int value) {
            if (isValidValue(x, y, value) == false)
                throw new Error("WRONG");

            System.out.println( " ("+x+", "+y+") = " + value);
            debug();

            discoverdItems ++;
            informCell(x, y, value);
            informGrid(x, y, value);
            informRow(y, value);
            informCol(x, value);
        }
        private void informCell(int x, int y, int value) {
            map.get( new Vec2d(x,y)).value = value;
            map.get( new Vec2d(x,y)).possibleValues.clear();
        }
        private void informGrid(int x, int y, int value) {
            int xStart = (x/3) * 3;     // you should not write code like this
            int yStart = (y/3) * 3;     // It is cleaner when you just use the Math Class

            for (int i=xStart; i < xStart+3; i++) {  // LOOP x
                for (int j = yStart; j < yStart + 3; j++) {  // LOOP y
                    GridItem gridItem = map.get(new Vec2d(i,j));
                    if (gridItem.possibleValues.contains(value))
                        gridItem.possibleValues.remove(new Integer(value));
                }
            }
        }
        private void informRow(int y, int value) {
            for (int x=0; x < SIZE; x++) {
                GridItem gridItem = map.get(new Vec2d(x,y));
                if (gridItem.possibleValues.contains(value))
                    gridItem.possibleValues.remove( new Integer(value));
            }
        }
        private void informCol(int x, int value) {
            for (int y=0; y < SIZE; y++) {
                GridItem gridItem = map.get(new Vec2d(x,y));
                if (gridItem.possibleValues.contains(value))
                    gridItem.possibleValues.remove( new Integer(value));
            }
        }


        private boolean isValidValue(int x, int y, int value) {
            if (map.get(new Vec2d(x, y)).value != 0)
                return false;

            for (int y2 = 0; y2 < SIZE; y2++)   // LOOP y
                if (map.get(new Vec2d(x, y2)).value == value)
                    return false;

            for (int x2 = 0; x2 < SIZE; x2++)   // LOOP x
                if (map.get(new Vec2d(x2, y)).value == value)
                    return false;

            int xStart = (x/3) * 3;     // you should not write code like this
            int yStart = (y/3) * 3;     // It is cleaner when you just use the Math Class

            for (int i=xStart; i < xStart+3; i++)   // LOOP x
                for (int j=yStart; j < yStart+3; j++)   // LOOP y
                    if (map.get(new Vec2d(i, j)).value == value)
                        return false;


            return true;
        }
    }

    class GridItem {
        public List<Integer> possibleValues = new ArrayList<>();
        public int value = 0;
        public int x;
        public int y;

        public GridItem() {
            possibleValues = new ArrayList<>();
            for (int k=1; k <= SIZE; k++)
                possibleValues.add(k);
        }
    }
}
