public class xmastree {
    public static void main(String[] args) {
        char[][] func = xmastree();
        for (int a = 0; a < 31; a++) {
            for (int b = 0; b < 32; b++) {
              System.out.print(func[a][b]);
            }
              System.out.println();
        }
    }

    static char[][] xmastree() {
        char[][] pic = new char[31][32];
        for (int a= 0; a < 31; a++) {
            for (int b = 0; b < 32; b++) {
                pic[a][b] = ' ';
            }
        }
        

pic[0][24]='[';
pic[0][25]=']';
pic[1][23]='[';
pic[1][24]=']';
pic[1][25]='[';
pic[1][26]=']';
pic[2][22]='[';
pic[2][23]=']';
pic[2][24]='[';
pic[2][25]=']';
pic[2][26]='[';
pic[2][27]=']';
pic[3][21]='-';
pic[3][22]='-';
pic[3][23]='-';
pic[3][24]='-';
pic[3][25]='-';
pic[3][26]='-';
pic[3][27]='-';
pic[3][28]='-';
pic[4][20]='=';
pic[4][21]='=';
pic[4][22]='=';
pic[4][23]='=';
pic[4][24]='=';
pic[4][25]='=';
pic[4][26]='=';
pic[4][27]='=';
pic[4][28]='=';
pic[4][29]='=';
pic[5][24]='|';
pic[5][25]='|';
pic[6][24]='-';
pic[6][25]='-';

 return pic;

}
}

