import java.util.Random;

public class ASCII {
    static int x = 40;
    static int y = 39;
    static final Random rand = new Random();

    public static void main(String[] args) {

        char[][] nextRows = new char[x][y];
        char[][] func = xmastree();

        for (int a = 0; a < 7; a++) {
            for (int b = 0; b < 30; b++) {
                System.out.print(func[a][b]);
            }
            System.out.println();
        }

        // for (int i = 0; i < nextRows.length; i++) {
        //     // nextRows[i] = emptyRow();

        //     char[][] variable = penguin();
        //     for (int x = 0; x < 40; x++) {
        //         for (int y = 0; y < 39; y++) {
        //             System.out.print(variable[x][y]);
        //         }
        //         System.out.println();
        //     }
        // }

    //     while (true) {
    //         for (int x = 0; x < x - y; x++) {

    //             if (rand.nextDouble() < 0.01) {
    //                 char[][] img;
    //                 if (rand.nextDouble() < 0.5)
    //                     img = penguin();
    //                 else {
    //                     img = xmastree();
    //                 }
    //                 for (int iy = 0; iy < y; iy++) {
    //                     for (int ix = 0; ix < x; ix++) {
    //                         nextRows[iy][x + ix] = img[iy][ix];

    //                     }

    //                 }

    //             }
    //         }
    //     }
     }

    static char[][] penguin() {
        char[][] img = new char[40][39];
        for (int x = 0; x < 40; x++) {
            for (int y = 0; y < 39; y++) {
                img[x][y] = ' ';
            }
        }

        img[0][6] = '_';
        img[0][7] = '_';
        img[0][8] = '_';
        img[1][3] = '+';
        img[1][6] = '|';
        img[1][8] = '|';
        img[2][5] = '_';
        img[2][6] = '|';
        img[2][7] = '_';
        img[2][8] = '|';
        img[2][9] = '_';
        img[2][12] = '+';
        img[3][2] = '+';
        img[3][5] = '(';
        img[3][6] = '^';
        img[3][8] = '^';
        img[3][9] = ')';
        img[3][12] = '[';
        img[3][13] = ']';
        img[4][0] = '[';
        img[4][1] = ']';
        img[4][2] = '\\';
        img[4][5] = '/';
        img[4][7] = 'v';
        img[4][9] = '\\';
        img[4][11] = '/';
        img[4][16] = '+';
        img[5][1] = '+';
        img[5][3] = '\\';
        img[5][4] = '/';
        img[5][5] = '(';
        img[5][7] = 'O';
        img[5][9] = ')';
        img[5][10] = '\\';
        img[5][11] = '/';
        img[5][14] = '+';
        img[6][4] = '\\';
        img[6][5] = '\\';
        img[6][6] = '|';
        img[6][8] = '|';
        img[6][10] = '/';
        img[6][9] = '/';
        img[7][3] = '+';
        img[7][6] = '\\';
        img[7][8] = '/';
        img[7][10] = '+';
        img[8][5] = '^';
        img[8][6] = '^';
        img[8][8] = '^';
        img[8][9] = '^';
        img[0][24] = '[';
        img[0][25] = ']';
        img[1][23] = '[';
        img[1][24] = ']';
        img[1][25] = '[';
        img[1][26] = ']';
        img[2][22] = '[';
        img[2][23] = ']';
        img[2][24] = '[';
        img[2][25] = ']';
        img[2][26] = '[';
        img[2][27] = ']';
        img[3][21] = '-';
        img[3][22] = '-';
        img[3][23] = '-';
        img[3][24] = '-';
        img[3][25] = '-';
        img[3][26] = '-';
        img[3][27] = '-';
        img[3][28] = '-';
        img[4][20] = '=';
        img[4][21] = '=';
        img[4][22] = '=';
        img[4][23] = '=';
        img[4][24] = '=';
        img[4][25] = '=';
        img[4][26] = '=';
        img[4][27] = '=';
        img[4][28] = '=';
        img[4][29] = '=';
        img[5][24] = '|';
        img[5][25] = '|';
        img[6][24] = '-';
        img[6][25] = '-';

        // initials
        img[9][26] = 'G';
        img[9][27] = '.';
        img[9][28] = 'S';
        img[9][29] = '.';

        return img;
    }

    static char[][] xmastree() {
        char[][] pic = new char[31][32];
        for (int a = 0; a < 31; a++) {
            for (int b = 0; b < 32; b++) {
                pic[a][b] = ' ';
            }
        }

        pic[0][24] = '[';
        pic[0][25] = ']';
        pic[1][23] = '[';
        pic[1][24] = ']';
        pic[1][25] = '[';
        pic[1][26] = ']';
        pic[2][22] = '[';
        pic[2][23] = ']';
        pic[2][24] = '[';
        pic[2][25] = ']';
        pic[2][26] = '[';
        pic[2][27] = ']';
        pic[3][21] = '-';
        pic[3][22] = '-';
        pic[3][23] = '-';
        pic[3][24] = '-';
        pic[3][25] = '-';
        pic[3][26] = '-';
        pic[3][27] = '-';
        pic[3][28] = '-';
        pic[4][20] = '=';
        pic[4][21] = '=';
        pic[4][22] = '=';
        pic[4][23] = '=';
        pic[4][24] = '=';
        pic[4][25] = '=';
        pic[4][26] = '=';
        pic[4][27] = '=';
        pic[4][28] = '=';
        pic[4][29] = '=';
        pic[5][24] = '|';
        pic[5][25] = '|';
        pic[6][24] = '-';
        pic[6][25] = '-';

        return pic;

    }
}
