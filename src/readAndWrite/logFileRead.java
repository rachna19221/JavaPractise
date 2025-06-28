package readAndWrite;

import java.io.*;

public class logFileRead {
    public static void main(String[] args) {
        try{
            BufferedReader br =new BufferedReader(new FileReader("src/readAndWrite/application.log"));
            BufferedWriter bw=new BufferedWriter(new FileWriter("src/readAndWrite/error2.log"));
            String line;
            while((line=br.readLine())!=null){
                if(line.contains("ERROR")){
                    System.out.println(line);
                    bw.write(line);
                    bw.newLine();
                }
            }
            bw.close();
            br.close();

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
