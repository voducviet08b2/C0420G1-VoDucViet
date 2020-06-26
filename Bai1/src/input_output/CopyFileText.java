package input_output;

import java.io.*;

public class CopyFileText {

    public static void main(String[] args) throws IOException {
       File file=nhap();
        ghi(file);
        StringBuffer tempText=new StringBuffer();
        doc(file,tempText);
        System.out.println(tempText);
        File copyfile=new File("src/folder","CopyText.txt");

        try{
            FileWriter fileWriter=new FileWriter(copyfile.getAbsolutePath());
            fileWriter.write(String.valueOf(tempText));
            fileWriter.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void doc(File file,StringBuffer temp){
        try{
            FileReader fileReader=new FileReader(file);
            BufferedReader bufferedReader=new BufferedReader(fileReader);

            String line=null;
            while((line=bufferedReader.readLine())!=null){
                temp.append(line);

            }
            bufferedReader.close();
            fileReader.close();
            //System.out.println(tempText);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static void ghi(File file){
        try{
            FileWriter fileWriter=new FileWriter(file.getAbsolutePath());
            fileWriter.write("Hom nay la thu 6");
            fileWriter.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
    public static File nhap(){
        File dir=new File("src/folder");
        dir.mkdir();

        File file=new File(dir.getAbsoluteFile(),"hello.txt");
        try{
            if(file.createNewFile()){
                System.out.println("File created");
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }
        return file;
    }
}
