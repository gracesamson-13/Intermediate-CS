import java.io.File;

class FileOrFolder {
    String name;
    String path; // full (absolute) path from root
    FileOrFolder[] children = {};
    String separatorCharacter = "\\"; // change this to / if you are mac user!

    FileOrFolder(String path) {
        this.path = path;
        this.name = path.substring(path.lastIndexOf(separatorCharacter) + 1);
    }

    FileOrFolder(String path, String name) {
        this.path = path;
        this.name = name;
    }

    void setChildren(FileOrFolder[] children) {
        this.children = children;
    }

    FileOrFolder(File file) {
        this.path = file.getAbsolutePath();
        this.name = file.getName();
        // populate children recursively
        if (file.listFiles() != null) {
            File[] children = file.listFiles();
            // copy children into FileOrFolder array
            FileOrFolder[] childFOFs = new FileOrFolder[children.length];
            for (int i = 0; i < children.length; i++) {
                childFOFs[i] = new FileOrFolder(children[i]);
                // this is recursion! since this method calls itself
            }
            this.children = childFOFs;
        }
    }

    

    void listFilesRecursively() {
        System.out.println(name);
        for (FileOrFolder child : children) {
            child.listFilesRecursively();
        }
    }

    FileOrFolder findPathWithName(String fileNameToFind) {
        if (fileNameToFind == this.name) {
            return this;
        }
        System.out.println(name);
        for (FileOrFolder child : children) {
        //  child.findPathWithName(fileNameToFind);
            child.listFilesRecursively();
        }
     return null;
    }

}
