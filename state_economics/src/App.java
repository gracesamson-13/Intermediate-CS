import java.util.HashMap;

// public class App {
//     public static void main(String[] args) throws Exception {     

       
//         FileSave bea = new FileSave("SAGDP1__ALL_AREAS_1997_2024.CSV");
//         FileSave Table = new FileSave("Table.csv");

//         //System.out.print("SAGDP1__ALL_AREAS_1997_2024.CSV");
//         System.out.print(Table);
    
//     }
// }

public class App {
    public static void main(String[] args) throws Exception {

        FileSave Table = new FileSave("Table.csv");

        Table.getResults().forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
    }
}




    

