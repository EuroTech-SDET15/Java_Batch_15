package day57;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class CreateClass {

    public static void main(String[] args) throws IOException {


        String name = "David";
        String sentence = "Hello " + name + "! How are you?";
        System.out.println(sentence);

//        createClass("day57", "Training2");
//        createClass("day56", "Training");
//        deleteClass("day56","Training");
       // deleteClass("day57","Training2");
      //  deleteFile("day57","text","txt");
        deleteFile("C:\\Users\\ahmet\\IdeaProjects\\Java_Batch_15\\text.txt");
    }

    public static void deleteFile(String path) {
        File file = new File(path);
        file.delete();
    }
    public static void deleteFile(String packageName, String fileName,String extension) {
        File file = new File("C:\\Users\\ahmet\\IdeaProjects\\" +
                "Java_Batch_15\\src\\" + packageName + "\\" + fileName + "."+extension+"");
        file.delete();
    }

    public static void deleteClass(String packageName, String className) {
        File file = new File("C:\\Users\\ahmet\\IdeaProjects\\" +
                "Java_Batch_15\\src\\" + packageName + "\\" + className + ".java");
        file.delete();
    }

    public static void createClass(String packageName, String className) {// packageName    className
        File file = new File("C:\\Users\\ahmet\\IdeaProjects\\" +
                "Java_Batch_15\\src\\" + packageName + "\\" + className + ".java");//package  classname

        try {
            file.createNewFile();
            FileWriter writer = new FileWriter(file);
            writer.write("package " + packageName + ";");//package
            writer.write("\npublic class " + className + " { ");//class
            writer.write("\npublic static void main(String[] args){ \n} ");
            writer.write("\n}");
            writer.close();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        }
    }

}
