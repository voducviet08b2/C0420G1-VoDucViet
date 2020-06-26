package input_output_binary;

import java.io.*;


public class CopyTextBinary {
    public static void main(String[] args) {
        //-----------------------GHI----------------------------//
        try{
            FileOutputStream file1=new FileOutputStream(new File("src/folder","hello.txt"));
            DataOutputStream data1=new DataOutputStream(file1);
            data1.writeUTF("dsfsdfsdfsdf");

            data1.flush();
            System.out.println("OK");
            data1.close();
            file1.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        StringBuffer stringBuffer=new StringBuffer();
        //---------------------DOC--------------------------------//
        try{
            FileInputStream file1=new FileInputStream(new File("src/folder/hello.txt"));
            DataInputStream data1=new DataInputStream(file1);
            String str;
            while(data1.available()>0) {

                // reads characters encoded with modified UTF-8
                String k = data1.readUTF();
                stringBuffer.append(k);
                // print
                System.out.println(k+" ");
            }
        } catch (Exception e) {
            e.getMessage();
        }

        System.out.println(stringBuffer);
        //-----------------------COPY------------------------//
        try{
            FileOutputStream file1=new FileOutputStream(new File("src/folder","CopyText.txt"));
            DataOutputStream data1=new DataOutputStream(file1);
            data1.writeUTF(String.valueOf(stringBuffer));

            data1.flush();
            System.out.println("Da Copy Xong...");
            data1.close();
            file1.close();
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
