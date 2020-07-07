package CaseStudy;

import input_output_binary.SanPham;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Dictionary {

    public static ArrayList<Word> listWordAll=DocObject();

    public static void main(String[] args) {

        Word word1=new Word("hello","hello","hello","hello","hello","hello");
        Word word2=new Word("hi","hi","hi","hi","i","i");
        //doAddWord("-a","hello");

        System.out.println("Select action you want: lookup/define/drop/export [word]");
        System.out.print("Action: ");
        Scanner scanner=new Scanner(System.in);
        String word=scanner.nextLine();
        String[] groupWord=word.split(" ");
        switch (groupWord[0]){
            case "lookup":
                doLookup(groupWord[1]);
                break;
            case "drop":
                doDrop(groupWord[1]);
                break;
            case "export":
                doExport(groupWord[1]);
                break;
            case "define":
                doAddWord(groupWord[1],groupWord[2]);
                break;
        }


    }
    private static void doAddWord(String type, String keyword) {
        Scanner scanner=new Scanner(System.in);
        ArrayList<Word> listWord=DocObject();

        //Lấy word trong arrayList theo từ khóa
        Word word = null;
        for (int i = 0; i < listWord.size(); i++) {
            if(keyword.equals(listWord.get(i).getKeyword())){
                word=listWord.get(i);
                listWord.remove(listWord.get(i));
            }else if(i==listWord.size()-1){
                System.out.println("Search unsuccessful, please add new word with new define: ");
                word=new Word(keyword,"","","","","");

            }
        }
        //Gõ text gặp exit thì dừng

        System.out.println("Input text to add (Stop when type 'exit'): ");
        String str=scanner.nextLine();
        StringBuffer stringBuffer=new StringBuffer();
        while(!str.equals("exit")){
            stringBuffer.append(str);
            stringBuffer.append("\n");
            str=scanner.nextLine();
        }
        String str1=String.valueOf(stringBuffer);
        //System.out.println(str1);
        //Sửa word
        switch (type){
            case "-p":
                word.setPronoun(str1);
                break;
            case "-n":
                word.setNoun(str1);
                break;
            case "-a":
                word.setAdjective(str1);
                break;
            case "-v":
                word.setVerb(str1);
                break;
            case "-s":
                word.setSynonymous(str1);
                break;
            default:
                System.out.println("Error");
        }
        //System.out.println(word.toString());
        //Thêm từ mới vào array list
        listWord.add(word);
        //ghi list word ra file
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src\\CaseStudy\\wordObject.txt"));
            for (int i = 0; i < listWord.size(); i++) {
                oos.writeObject(listWord.get(i));
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void doExport(String path){
        //ghi file
        File file=new File(path);
        try {
            if(file.createNewFile()){
                System.out.println("Xuat file thanh công");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        ArrayList<Word> fileExport=DocObject();

        //doc file
        try {
            FileWriter fileWriter=new FileWriter(path);
            for (int i = 0; i <fileExport.size() ; i++) {

                fileWriter.write(fileExport.get(i).toString()+"\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void doDrop(String word) {
        ArrayList<Word> listWordDrop=DocObject();


        for (int i = 0; i <listWordDrop.size() ; i++) {
            if(word.equals(listWordDrop.get(i).getKeyword())){
                listWordDrop.remove(listWordDrop.get(i));
            }
        }
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src\\CaseStudy\\wordObject.txt"));
            for (int i = 0; i < listWordDrop.size(); i++) {
                oos.writeObject(listWordDrop.get(i));
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Drop word successfull...");

    }

    private static void doLookup(String word) {
        for (int i = 0; i <listWordAll.size() ; i++) {
                if(word.equals(listWordAll.get(i).getKeyword())){
                System.out.println(listWordAll.get(i).toString());
            }
        }
    }

    public static void GhiObject(Word word){
        ArrayList<Word> listWord=new ArrayList<>();
        boolean cont=true;
        try {
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src\\CaseStudy\\wordObject.txt"));
            while(cont){
                Word words=(Word) ois.readObject();

                if (words != null) {
                    listWord.add(words);
                } else {
                    cont = false;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
        listWord.add(word);
        try {
            ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("src\\CaseStudy\\wordObject.txt"));
            for (int i = 0; i < listWord.size(); i++) {
                oos.writeObject(listWord.get(i));
            }
            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Word> DocObject(){
        ArrayList<Word> listWord=new ArrayList<>();
        boolean cont=true;
        try {

            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src\\CaseStudy\\wordObject.txt"));
            while(cont){
               Word word=(Word) ois.readObject();

                if (word != null) {
                    listWord.add(word);
                } else {
                    cont = false;
                }
            }
        } catch (Exception e) {
            e.getMessage();
        }
       return listWord;
    }
}
