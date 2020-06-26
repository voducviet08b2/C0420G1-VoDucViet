package input_output;

import java.io.*;

public class DocFileCSV {
    public static void main(String[] args) {
        File file=new File("src/folder","CSV.txt");
        System.out.println(file.getAbsolutePath());
        StringBuffer string=new StringBuffer();
        try{
            FileReader fileReader=new FileReader(file.getAbsolutePath());
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            while((line=bufferedReader.readLine())!=null){
                string.append(line);
                String[] tempStr=line.split(",");
                System.out.println(tempStr[4]+" - "+tempStr[5]);
            }
        }
        catch(IOException e) {
            e.printStackTrace();
        }

    }
}
