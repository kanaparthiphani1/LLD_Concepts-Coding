package Structural.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    private List<FileSystem> eles;
    private  String name;

    public Directory(String name) {
        this.name = name;
        this.eles = new ArrayList<>();
    }

    public void addToDirectory(FileSystem ele){
        eles.add(ele);
    }

    @Override
    public void ls() {
        System.out.println("Directory name : "+name);
        for(FileSystem f:eles){
            f.ls();
        }
    }
}
