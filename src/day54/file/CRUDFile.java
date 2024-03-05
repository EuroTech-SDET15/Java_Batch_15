package day54.file;

import java.io.*;
import java.util.Scanner;

public class CRUDFile {
    public static void main(String[] args) throws IOException {
     //   File file = new File("src\\day54\\file\\text.txt");
        File file = new File("C:\\Users\\ahmet\\IdeaProjects\\" +
                "Java_Batch_15\\src\\day54\\file\\text.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        System.out.println("file.getAbsoluteFile() = " + file.getAbsoluteFile());

        FileWriter writer = new FileWriter(file, true);
        writer.write("Hello!!!!");
        writer.write("\nfrom Java!!!!");
        writer.write("\nKobe Bryant");
        writer.close();

        Scanner scanner = new Scanner(file);

        while (scanner.hasNext()) {
            System.out.println(scanner.nextLine());
        }

        scanner.close();

        //file.delete();

//        FileInputStream
//        FileOutputStream

        BufferedWriter bif = new BufferedWriter(writer);
        BufferedReader reader = new BufferedReader(new FileReader(file));

    }
}
