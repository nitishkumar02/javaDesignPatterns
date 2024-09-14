package com.Composite;

import java.util.ArrayList;
import java.util.List;

interface IFileSystemElement
{
    double getSize();
}

public class File implements IFileSystemElement{


    double size;

    public File(double size) {
        this.size = size;
    }
    public double getSize() {
        return size;
    }
}

class Folder implements IFileSystemElement
{
    double size;
    List<IFileSystemElement> children= new ArrayList<IFileSystemElement>();

    //List<Folder> subFolders = new ArrayList<>();

    // we have to implement the size fun such that it will return all the sizes of the objects inside plus it's own size
    public double getSize()
    {
        double size1=0;
        for (IFileSystemElement child: children)
        {
            size1 += child.getSize();
        }
        return size +size1;

    }

    public Folder(double size)
    {
       this.size = size;
    }
    //add files
    public void addChild(IFileSystemElement element)
    {
        children.add(element);
    }

}

class Program
{
    public static void main(String[] args) {
        // create root folder or composite object
        Folder root = new Folder(0.5);
        // add files in the root object
        root.addChild(new File(10));
        root.addChild(new File(2));
        root.addChild(new File(5));

        // Add Subfolders
        //for that first create folders
        Folder subFolder1 = new Folder(0);
        Folder subFolder2 = new Folder(0);
        Folder subFolder3 = new Folder(0);

        // now add it to composite
        subFolder3.addChild(new File(8));
        subFolder2.addChild(subFolder3);
        subFolder2.addChild(new File(3));

        subFolder1.addChild(subFolder2);

        // now attach this to root / composite object
        root.addChild(subFolder1);
        double res = root.getSize();
        System.out.println(res);


    }
}
