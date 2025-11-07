import java.io.File;
    
public class App {
    public static void main(String[] args) throws Exception {
        // get working directory
        String currPath = System.getProperty("user.dir");
        System.out.println(currPath);
        File currentDirectory = new File(currPath);

        // demonstration of the listFiles function in the File class
        // but this doesn't go through the directories recursively! 
        File[] filesAndDirectories = currentDirectory.listFiles();

        System.out.println("Contents of current working directory:");
        for (File item : filesAndDirectories) {
            System.out.println(item.getName());
        }

        // our own recursive function to list the files :) 
        // System.out.println("Recursively listing files from: " + currentDirectory);
        // listFilesRecursively(currentDirectory);

        // demonstration of FileOrFolder class, which represents a node -> child(ren) node structure: a Tree
         FileOrFolder f = new FileOrFolder(currPath);
         System.out.println(f.name);
        // FileOrFolder bin = new FileOrFolder(currPath, "bin");
        // f.setChildren(new FileOrFolder[]{bin});
         f.listFilesRecursively(); // same thing, the code looks cleaner in a tree.
        
        // using File class constructor, which recursively populates children
        FileOrFolder treeNode = new FileOrFolder(currentDirectory);

        System.out.println(treeNode.findPathWithName("FileOrFolder.java").name);
        // System.out.println(treeNode.findPathWithName("ShouldReturnNullCauseThisDoesntExist.java").name);

    }

    // listing the files recursively
    static void listFilesRecursively(File file) {
        // base case - print your own path.
        System.out.println(file.getName());

        // recursive case
        File[] children = file.listFiles();
        if (children != null) {
            for (File child : children) {
                listFilesRecursively(child);
            }
        }
    }
}
