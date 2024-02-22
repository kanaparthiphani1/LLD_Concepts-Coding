package Structural.Composite;

public class Client {
    public static void main(String[] args) {
        FileSystem file1 =new File("phani.js");
        FileSystem file2 =new File("sumathi.js");
        Directory dir1 = new Directory("innerDIr");
        dir1.addToDirectory(file1);
        dir1.addToDirectory(file2);
        FileSystem f3 = new File("abhi.js");
        Directory d2 = new Directory("OuterDir");
        d2.addToDirectory(f3);
        d2.addToDirectory(dir1);
        d2.ls();
    }
}
