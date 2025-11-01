public class Cloud {

    public static char[][] getCloud() {

        int cloudheight = 9;
        int cloudwidth = 6;

        char[][] cloudimg = new char[cloudheight+1][cloudheight+1];
        for (int y = 0; y <= cloudheight; y++) {
            for (int x = 0; x <= cloudwidth; x++) {
                cloudimg[y][x] = ' ';
            }
        }

        for (int i = 2; i <= 9; i++) {
            cloudimg[i][1] = ':';
        }
        cloudimg[1][2] = '_';
        cloudimg[2][3] = ':';
        cloudimg[2][4] = '.';
        cloudimg[3][5] = ':';
        cloudimg[4][4] = '*';
        cloudimg[5][5] = ':';
        cloudimg[6][6] = '*';
        cloudimg[7][6] = ';';
        cloudimg[8][4] = '.';
        cloudimg[8][5] = '*';
        cloudimg[9][2] = ':';
        cloudimg[9][3] = '*';

        return cloudimg;

    }

    public static void printCloud() { //testing printing cloud

        char[][] art = getCloud();
        for (int i = 0; i < art.length; i++) {
            for (int j = 0; j < art[i].length; j++) {
                System.out.print(art[i][j]);
            }
            System.out.println();
        }

    }

}
