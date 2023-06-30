package com.akanksha.Composite;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem{

    private String directoryName;

    private List<FileSystem> fileSystemList=new ArrayList<>();
    @Override
    public void ls() {
        System.out.println("Directory name "+directoryName);
        for(FileSystem fileSystem:fileSystemList){
            fileSystem.ls();
        }

    }

    public Directory(String directoryName) {
        this.directoryName = directoryName;
    }

    public void add(FileSystem fileSystem){

        fileSystemList.add(fileSystem);
    }
}
