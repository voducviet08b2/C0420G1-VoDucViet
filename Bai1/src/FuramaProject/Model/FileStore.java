package FuramaProject.Model;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.*;

public class FileStore<E> {
    public Stack<E> stack;
    public void store(){
        Scanner scanner=new Scanner(System.in);
        stack=new Stack<>();
        StringBuffer result=new StringBuffer();
        try {
            FileReader fileReader=new FileReader("src/FuramaProject/data/employee.csv");
            BufferedReader buffer=new BufferedReader(fileReader);
            result=new StringBuffer();
            String line=null;
            while((line=buffer.readLine())!=null){
                result.append(line);
            }
            buffer.close();
            fileReader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        String s= String.valueOf(result);
        String[] word=String.valueOf(result).split(",");

         ArrayList<Employee> listEmployee=new ArrayList<>();
       
        int i=0;
      
        while(i<word.length){

            listEmployee.add((new Employee(word[i],Integer.parseInt(word[i+1]),word[i+2])));
            i+=3;
        }
        for (int j = 0; j < listEmployee.size(); j++) {
            stack.push((E)listEmployee.get(j));
        }
        System.out.println("Input name of Employee you want search:");
        String name=scanner.nextLine();
        for (int j = 0; j <listEmployee.size() ; j++) {
            if(name.equals((listEmployee.get(j).getName()))){
                System.out.println("Searched Successfull...");
                System.out.println(listEmployee.get(j));
            }
        }
        //System.out.println(stack.contains(listRoom.get(index)));

    }
}
