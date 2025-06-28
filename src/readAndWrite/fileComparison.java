package readAndWrite;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class fileComparison {
    public static void main(String[] args) {
        try{
            File file1=new File("src/readAndWrite/file_one.txt");
            File file2=new File("src/readAndWrite/file_two.txt");
            BufferedReader br_one=new BufferedReader(new FileReader("src/readAndWrite/file_one.txt"));
            BufferedReader br_two=new BufferedReader(new FileReader("src/readAndWrite/file_two.txt"));
            String file_line1,file_line2;
            if(file1.length()!=file2.length()) {
                System.out.println("file size doesnt match file one "+ file1.length() + " file two length "+ file2.length());

            }
                while ((file_line1 = br_one.readLine()) != null & (file_line2 = br_two.readLine()) != null) {
                    if (!file_line1.equalsIgnoreCase(file_line2)) {
                        System.out.println("first file content   " + file_line1);
                        System.out.println("second file content   " + file_line2);
                    }
                }


            br_two.close();
            br_one.close();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
