public class tree { 
    //edward's art
    public static void main(String[] args) throws Exception {

        int count = 0;

        char[][] tree = new char[14][14];
        tree[0][0] = ' ';
        tree[0][1] = ' ';
        tree[0][2] = ' ';
        tree[0][3] = ' ';
        tree[0][4] = ' ';
        tree[0][5] = ' ';
        tree[0][6] = '/';
        tree[0][7] = '\\';
        tree[0][8] = ' ';
        tree[0][9] = ' ';
        tree[0][10] = ' ';
        tree[0][11] = ' ';
        tree[0][12] = ' ';
        tree[0][13] = ' ';
        tree[1][0] = ' ';
        tree[1][1] = ' ';
        tree[1][2] = ' ';
        tree[1][3] = ' ';
        tree[1][4] = ' ';
        tree[1][5] = '/';
        tree[1][6] = '/';
        tree[1][7] = '\\';
        tree[1][8] = '\\';
        tree[1][9] = ' ';
        tree[1][10] = ' ';
        tree[1][11] = ' ';
        tree[1][12] = ' ';
        tree[1][13] = ' ';
        tree[2][0] = ' ';
        tree[2][1] = ' ';
        tree[2][2] = ' ';
        tree[2][3] = ' ';
        tree[2][4] = '/';
        tree[2][5] = '/';
        tree[2][6] = '/';
        tree[2][7] = '\\';
        tree[2][8] = '\\';
        tree[2][9] = '\\';
        tree[2][10] = ' ';
        tree[2][11] = ' ';
        tree[2][12] = ' ';
        tree[2][13] = ' ';
        tree[3][0] = ' ';
        tree[3][1] = ' ';
        tree[3][2] = ' ';
        tree[3][3] = '/';
        tree[3][4] = '/';
        tree[3][5] = '/';
        tree[3][6] = '/';
        tree[3][7] = '\\';
        tree[3][8] = '\\';
        tree[3][9] = '\\';
        tree[3][10] = '\\';
        tree[3][11] = ' ';
        tree[3][12] = ' ';
        tree[3][13] = ' ';
        tree[4][0] = ' ';
        tree[4][1] = ' ';
        tree[4][2] = ' ';
        tree[4][3] = ' ';
        tree[4][4] = '/';
        tree[4][5] = '/';
        tree[4][6] = '/';
        tree[4][7] = '\\';
        tree[4][8] = '\\';
        tree[4][9] = '\\';
        tree[4][10] = ' ';
        tree[4][11] = ' ';
        tree[4][12] = ' ';
        tree[4][13] = ' ';
        tree[5][0] = ' ';
        tree[5][1] = ' ';
        tree[5][2] = ' ';
        tree[5][3] = '/';
        tree[5][4] = '/';
        tree[5][5] = '/';
        tree[5][6] = '/';
        tree[5][7] = '\\';
        tree[5][8] = '\\';
        tree[5][9] = '\\';
        tree[5][10] = '\\';
        tree[5][11] = ' ';
        tree[5][12] = ' ';
        tree[5][13] = ' ';
        tree[6][0] = ' ';
        tree[6][1] = ' ';
        tree[6][2] = '/';
        tree[6][3] = '/';
        tree[6][4] = '/';
        tree[6][5] = '/';
        tree[6][6] = '/';
        tree[6][7] = '\\';
        tree[6][8] = '\\';
        tree[6][9] = '\\';
        tree[6][10] = '\\';
        tree[6][11] = '\\';
        tree[6][12] = ' ';
        tree[6][13] = ' ';
        tree[7][0] = ' ';
        tree[7][1] = ' ';
        tree[7][2] = ' ';
        tree[7][3] = '/';
        tree[7][4] = '/';
        tree[7][5] = '/';
        tree[7][6] = '/';
        tree[7][7] = '\\';
        tree[7][8] = '\\';
        tree[7][9] = '\\';
        tree[7][10] = '\\';
        tree[7][11] = ' ';
        tree[7][12] = ' ';
        tree[7][13] = ' ';
        tree[8][0] = ' ';
        tree[8][1] = ' ';
        tree[8][2] = '/';
        tree[8][3] = '/';
        tree[8][4] = '/';
        tree[8][5] = '/';
        tree[8][6] = '/';
        tree[8][7] = '\\';
        tree[8][8] = '\\';
        tree[8][9] = '\\';
        tree[8][10] = '\\';
        tree[8][11] = '\\';
        tree[8][12] = ' ';
        tree[8][13] = ' ';
        tree[9][0] = ' ';
        tree[9][1] = '/';
        tree[9][2] = '/';
        tree[9][3] = '/';
        tree[9][4] = '/';
        tree[9][5] = '/';
        tree[9][6] = '/';
        tree[9][7] = '\\';
        tree[9][8] = '\\';
        tree[9][9] = '\\';
        tree[9][10] = '\\';
        tree[9][11] = '\\';
        tree[9][12] = '\\';
        tree[9][13] = ' ';
        tree[10][0] = '/';
        tree[10][1] = '/';
        tree[10][2] = '/';
        tree[10][3] = '/';
        tree[10][4] = '/';
        tree[10][5] = '/';
        tree[10][6] = '/';
        tree[10][7] = '\\';
        tree[10][8] = '\\';
        tree[10][9] = '\\';
        tree[10][10] = '\\';
        tree[10][11] = '\\';
        tree[10][12] = '\\';
        tree[10][13] = '\\';
        tree[11][0] = ' ';
        tree[11][1] = ' ';
        tree[11][2] = ' ';
        tree[11][3] = ' ';
        tree[11][4] = ' ';
        tree[11][5] = ' ';
        tree[11][6] = '|';
        tree[11][7] = '|';
        tree[11][8] = ' ';
        tree[11][9] = ' ';
        tree[11][10] = ' ';
        tree[11][11] = ' ';
        tree[11][12] = ' ';
        tree[11][13] = ' ';
        tree[12][0] = ' ';
        tree[12][1] = ' ';
        tree[12][2] = ' ';
        tree[12][3] = ' ';
        tree[12][4] = ' ';
        tree[12][5] = ' ';
        tree[12][6] = '|';
        tree[12][7] = '|';
        tree[12][8] = ' ';
        tree[12][9] = ' ';
        tree[12][10] = ' ';
        tree[12][11] = ' ';
        tree[12][12] = ' ';
        tree[12][13] = ' ';
        tree[13][0] = ' ';
        tree[13][1] = ' ';
        tree[13][2] = ' ';
        tree[13][3] = ' ';
        tree[13][4] = ' ';
        tree[13][5] = ' ';
        tree[13][6] = '|';
        tree[13][7] = '|';
        tree[13][8] = ' ';
        tree[13][9] = ' ';
        tree[13][10] = ' ';
        tree[13][11] = 'e';
        tree[13][12] = 'b';
        tree[13][13] = 'C';
        for (int i = 0; i < 14; i++) {
            for (int k = 0; k < 14; k++) {
                System.out.print(tree[i][k]);

            }
            System.out.println();
        }

        char[][] leaf = new char[9][14];
        leaf[0][1] = ' ';
        leaf[0][2] = ' ';
        leaf[0][3] = ' ';
        leaf[0][4] = ' ';
        leaf[0][5] = ' ';
        leaf[0][6] = ' ';
        leaf[0][7] = ' ';
        leaf[0][8] = ' ';
        leaf[0][9] = ' ';
        leaf[0][10] = ' ';
        leaf[0][11] = '_';
        leaf[0][12] = '_';
        leaf[0][13] = '_';
        leaf[1][0] = ' ';
        leaf[1][1] = ' ';
        leaf[1][2] = ' ';
        leaf[1][3] = ' ';
        leaf[1][4] = ' ';
        leaf[1][5] = '_';
        leaf[1][6] = '_';
        leaf[1][7] = '_';
        leaf[1][8] = '_';
        leaf[1][9] = '/';
        leaf[1][10] = ' ';
        leaf[1][11] = ' ';
        leaf[1][12] = ' ';
        leaf[1][13] = '\\';
        leaf[2][0] = ' ';
        leaf[2][1] = ' ';
        leaf[2][2] = ' ';
        leaf[2][3] = ' ';
        leaf[2][4] = '/';
        leaf[2][5] = ' ';
        leaf[2][6] = ' ';
        leaf[2][7] = '_';
        leaf[2][8] = '/';
        leaf[2][9] = ' ';
        leaf[2][10] = '\\';
        leaf[2][11] = ' ';
        leaf[2][12] = ' ';
        leaf[2][13] = ' ';
        leaf[3][0] = ' ';
        leaf[3][1] = ' ';
        leaf[3][2] = ' ';
        leaf[3][3] = '/';
        leaf[3][4] = ' ';
        leaf[3][5] = ' ';
        leaf[3][6] = ' ';
        leaf[3][7] = '/';
        leaf[3][8] = '\\';
        leaf[3][9] = ' ';
        leaf[3][10] = ' ';
        leaf[3][11] = '|';
        leaf[3][12] = ' ';
        leaf[3][13] = ' ';
        leaf[4][0] = ' ';
        leaf[4][1] = ' ';
        leaf[4][2] = '|';
        leaf[4][3] = ' ';
        leaf[4][4] = ' ';
        leaf[4][5] = '_';
        leaf[4][6] = '/';
        leaf[4][7] = ' ';
        leaf[4][8] = ' ';
        leaf[4][9] = ' ';
        leaf[4][10] = ' ';
        leaf[4][11] = '/';
        leaf[4][12] = ' ';
        leaf[4][13] = ' ';
        leaf[5][0] = ' ';
        leaf[5][1] = ' ';
        leaf[5][2] = '/';
        leaf[5][3] = ' ';
        leaf[5][4] = ' ';
        leaf[5][5] = '/';
        leaf[5][6] = '\\';
        leaf[5][7] = ' ';
        leaf[5][8] = ' ';
        leaf[5][9] = ' ';
        leaf[5][10] = '|';
        leaf[5][11] = ' ';
        leaf[5][12] = ' ';
        leaf[5][13] = ' ';
        leaf[6][0] = ' ';
        leaf[6][1] = '/';
        leaf[6][2] = ' ';
        leaf[6][3] = '_';
        leaf[6][4] = '/';
        leaf[6][5] = ' ';
        leaf[6][6] = ' ';
        leaf[6][7] = ' ';
        leaf[6][8] = '_';
        leaf[6][9] = '/';
        leaf[6][10] = ' ';
        leaf[6][11] = ' ';
        leaf[6][12] = ' ';
        leaf[6][13] = ' ';
        leaf[7][0] = '|';
        leaf[7][1] = ' ';
        leaf[7][2] = ' ';
        leaf[7][3] = '/';
        leaf[7][4] = '\\';
        leaf[7][5] = ' ';
        leaf[7][6] = '_';
        leaf[7][7] = '/';
        leaf[7][8] = ' ';
        leaf[7][9] = ' ';
        leaf[7][10] = ' ';
        leaf[7][11] = ' ';
        leaf[7][12] = ' ';
        leaf[7][13] = ' ';
        leaf[8][0] = '|';
        leaf[8][1] = '_';
        leaf[8][2] = '_';
        leaf[8][3] = '_';
        leaf[8][4] = '_';
        leaf[8][5] = '/';
        leaf[8][6] = ' ';
        leaf[8][7] = ' ';
        leaf[8][8] = ' ';
        leaf[8][9] = ' ';
        leaf[8][10] = ' ';
        leaf[8][11] = 'e';
        leaf[8][12] = 'b';
        leaf[8][13] = 'c';

        for (int i = 0; i < 9; i++) {
            for (int k = 0; k < 14; k++) {
                System.out.print(leaf[i][k]);
            }
            System.out.println();
        }
        boolean decrease = false;
        while (true) {

            if (!decrease) {
                count += 5;
                ;
            } else {
                count -= 5;
            }
            if (count == 0) {
                decrease = false;
            }
            if (count == 80) {
                decrease = true;
            }

            for (int i = 0; i < 14; i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print(" ");
                }
                for (int k = 0; k < 14; k++) {

                    System.out.print(tree[i][k]);
                }
                Thread.sleep(50);
                System.out.println();

            }

            for (int i = 0; i < 9; i++) {
                for (int j = 0; j < count; j++) {
                    System.out.print(" ");
                }

                for (int k = 0; k < 14; k++) {
                    System.out.print(leaf[i][k]);
                }
                System.out.println();

            }

        }

    }

}
