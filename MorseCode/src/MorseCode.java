public class App {
    public static void main(String[] args) throws Exception {
     System.out.println("Hello, World!");
    }
}

class MorseCodeNode {
    String name;
    MorseCodeNode left;
    MorseCodeNode right;

    public MorseCodeNode(String name) {
        this.name = name;
    }
}

public class MorseCode {
    private static boolean isSetup = false;
    static MorseCodeNode start = new MorseCodeNode("start");

    private static void setup() {
        if (!isSetup) {
            System.out.println("Setting up Morse Code search...");
            isSetup = true;
        }
        MorseCodeNode e, i, a, w;
        e = new MorseCodeNode("E");
        i = new MorseCodeNode("I");
        a = new MorseCodeNode("A");
        w = new MorseCodeNode("W");
        start.left = e;
        e.left = i;
        e.right = a;
        a.right = w;

        // can just build the rest of the tree straight with the start variables

        start.right = new MorseCodeNode("T");
        start.right.left = new MorseCodeNode("N");
        start.right.right = new MorseCodeNode("M");
        start.left.left.left = new MorseCodeNode("S");
        start.left.left.right = new MorseCodeNode("U");
        start.left.right.left = new MorseCodeNode("R");
        start.right.left.left = new MorseCodeNode("D");
        start.right.left.right = new MorseCodeNode("K");
        start.right.right.left = new MorseCodeNode("G");
        start.right.right.right = new MorseCodeNode("O");
        start.left.left.left.left = new MorseCodeNode("H");
        start.left.left.left.right = new MorseCodeNode("V");
        start.left.left.right.left = new MorseCodeNode("F");
        start.left.right.left.left = new MorseCodeNode("L");
        start.left.right.right.left = new MorseCodeNode("P");
        start.left.right.right.right = new MorseCodeNode("J");
    }

    static String getMorseCode(String letter) {
        setup();
        return getMorseCode(start, letter, "");
    }

    private static String getMorseCode(MorseCodeNode node, String letter, String code) {
        if (node == null) {
            return null;
        }
        if (node.name.equals(letter)) {
            return code;
        }
        String leftCode = getMorseCode(node.left, letter, code + ".");
        if (leftCode != null) {
            return leftCode;
        }
        String rightCode = getMorseCode(node.right, letter, code + "-");
        if (rightCode != null) {
            return rightCode;
        }
        System.out.println("Looked through " + node.name + " with code: " + code);
        return null;
    }

    // Can you code a method that, given a morse code, a string of "." / "-"'s,
    // return the letter? 
    static String getLetter(String morseCode) {
        setup();
        return getLetter(start, morseCode, 0); // start at 0
    }

    private static String getLetter(MorseCodeNode node, String morseCode, int index) {
        if (node == null) {
        return null;
        }
        if (index == morseCode.length()) {
        return node.name;
    }
    char symbol = morseCode.charAt(index);

    if (symbol == '.') {
        return getLetter(node.left, morseCode, index + 1);
    } else if (symbol == '-') {
        return getLetter(node.right, morseCode, index + 1);
    } else {
        return null;
    }
}
    }



