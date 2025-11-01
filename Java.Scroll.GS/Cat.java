 import java.util.Random;  //catherine's art

public class Cat {
    static final int WIDTH = getTerminalWidth() - 1;
    static final int CAT_WIDTH = 15;
    static final int CAT_HEIGHT = 7;
    static final Random rand = new Random();

    public static void main(String[] args) throws InterruptedException {
        char[][] nextRows = new char[CAT_HEIGHT][WIDTH]; // store upcoming rows
        for (int i = 0; i < nextRows.length; i++) {
            nextRows[i] = emptyRow();
        }

        while (true) {
            for (int x = 0; x < WIDTH - CAT_WIDTH; x=x+15) {
                if (rand.nextDouble() < 0.01) {
                    char[][] img;
                    img = getBunny();
                
                    for (int iy = 0; iy < CAT_HEIGHT; iy++) {
                        for (int ix = 0; ix < CAT_WIDTH; ix++) {
                            nextRows[iy][x + ix] = img[iy][ix];
                        }
                    }
                }
        }

            // Print and remove the top row
            System.out.println(new String(nextRows[0]));
            // Shift all rows up
            shiftRowsUp(nextRows);
            Thread.sleep(40); // Delay in ms
        }
    }

    static void shiftRowsUp(char[][] nextRows) {
        for (int i = 1; i < nextRows.length; i++) {
            nextRows[i - 1] = nextRows[i];
        }
        nextRows[nextRows.length - 1] = emptyRow();
    }

    static char[] emptyRow() {
        char[] row = new char[WIDTH];
        for (int i = 0; i < WIDTH; i++) {
            row[i] = ' ';
        }
        return row;
    }

    // rename your function here
    static char[][] getBunny() {
        char[][] img = new char[CAT_HEIGHT][CAT_WIDTH];
        // fill with empty space
        for (int y = 0; y < CAT_HEIGHT; y++) {
            for (int x = 0; x < CAT_WIDTH; x++) {
                img[y][x] = ' ';
            }
        }
        // then fill individual characters
        img[1][7] = '*';
        img[2][3] = '*';
        img[2][5] = '^';
        img[2][6] = '_';

        img[2][7] = '_';
        img[2][8] = '_';

        img[2][9] = '^';
        img[2][10] = '!';
        img[2][12] = '*';
        img[3][1] = '*';

        img[3][3] = '=';
        img[3][4]='(';
        img[3][5] = '●';
        img [3][7]='^';
        img[3][9] = '●';
        img[3][10] = ')';
        img[3][11] = '=';
        img[3][14]='*';

        img[4][3]='o';
        img[4][4]='/';
        img[4][10]='\\';
        img[4][11]='o';
        img[4][12]='♥';

        img[5][3]='/';
        img[5][11]='\\';

        img[6][2]='(';
        img[6][4]='_';
        img[6][6]='_';
        img[6][8]='_';
        img[6][10]='_';
        img[6][12]=')';
        return img;
    }

    public static int getTerminalWidth() {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            return getUnixTerminalWidth();
        } else {
            return 80; // fallback for unknown OS
        }
    }

    private static int getUnixTerminalWidth() {
        try {
            // Try to get terminal size from environment variables first
            String columns = System.getenv("COLUMNS");
            if (columns != null && !columns.isEmpty()) {
                return Integer.parseInt(columns);
            }

            // Fallback to stty command
            ProcessBuilder pb = new ProcessBuilder("/bin/sh", "-c", "stty size </dev/tty");
            pb.redirectErrorStream(true);
            Process process = pb.start();
            java.io.BufferedReader reader = new java.io.BufferedReader(
                    new java.io.InputStreamReader(process.getInputStream()));
            String output = reader.readLine();
            if (output != null && !output.isEmpty()) {
                String[] parts = output.trim().split(" ");
                return Integer.parseInt(parts[1]); // columns
            }
        } catch (Exception ignored) {
            // Silently ignore errors and fall back to default
        }
        return 80; // fallback
    }

}
