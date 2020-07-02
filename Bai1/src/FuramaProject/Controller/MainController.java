package FuramaProject.Controller;

import FuramaProject.Compare.CompareCustomer;
import FuramaProject.Exception.*;
import FuramaProject.Model.*;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.regex.Pattern;

public class MainController {
    public static void displayMainMenu(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Add New Services \n 2. Show Services \n 3. Add New Customer " +
                "\n 4. Show Info Of Customer \n 5. Add New Booking \n 6. Show Information of Employee" +
                "\n 7. Exit \n Please Choice: ");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                addNewService();
                break;
            case 2:
                showService();
                break;
            case 3:

                try {
                    addNewCustomer();
                } catch (NameException e) {
                    System.out.println(e.getMessage());
                }catch (EmailException e){
                    System.out.println(e.getMessage());
                }

                break;
            case 4:
                showInfoCustomer();
                break;
            case 5:
                addNewBooking();
                break;
        }
    }
    public static void addNewBooking(){
        Scanner scanner=new Scanner(System.in);
        ArrayList<Customer> listCustomer=new ArrayList<>();
        StringBuffer stringBuffer=new StringBuffer();
        try{
            FileReader fileReader=new FileReader("src\\FuramaProject\\data\\customer.csv");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            String[] str;
            while((line=bufferedReader.readLine())!=null){
                str=line.split(",");
                // str=String.valueOf(stringBuffer).split(",");
                listCustomer.add(new Customer(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7],null));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(listCustomer,new CompareCustomer());

        for (int i = 0; i < listCustomer.size(); i++) {
            System.out.println(i+". "+listCustomer.get(i).toString());
        }
        System.out.println("Lua chon ten khach hang");
        int indexCustomer=scanner.nextInt();
        System.out.println("1. Booking Villa \n 2. Booking House \n 3. Booking Room " +
                "\n Lua chon Danh Sach Booking");
        int bookChoice=scanner.nextInt();
        switch (bookChoice){
            case 1:
                bookingVilla(listCustomer.get(indexCustomer).getName(),listCustomer.get(indexCustomer).getBirthday(),
                        listCustomer.get(indexCustomer).getGender(),listCustomer.get(indexCustomer).getCmnd(),
                        listCustomer.get(indexCustomer).getPhone(),listCustomer.get(indexCustomer).getEmail(),
                        listCustomer.get(indexCustomer).getTypeCustomer(),listCustomer.get(indexCustomer).getAddress());
                break;
            case 2:
                bookingHouse(listCustomer.get(indexCustomer).getName(),listCustomer.get(indexCustomer).getBirthday(),
                        listCustomer.get(indexCustomer).getGender(),listCustomer.get(indexCustomer).getCmnd(),
                        listCustomer.get(indexCustomer).getPhone(),listCustomer.get(indexCustomer).getEmail(),
                        listCustomer.get(indexCustomer).getTypeCustomer(),listCustomer.get(indexCustomer).getAddress());
                break;
            case 3:
                bookingRoom(listCustomer.get(indexCustomer).getName(),listCustomer.get(indexCustomer).getBirthday(),
                        listCustomer.get(indexCustomer).getGender(),listCustomer.get(indexCustomer).getCmnd(),
                        listCustomer.get(indexCustomer).getPhone(),listCustomer.get(indexCustomer).getEmail(),
                        listCustomer.get(indexCustomer).getTypeCustomer(),listCustomer.get(indexCustomer).getAddress());
                break;
        }
    }
    public static void bookingRoom(String name,String birthday,String gender,String cmnd,String phone,
                                   String email,String typeCustomer,String address){
        Scanner scanner=new Scanner(System.in);
        StringBuffer result=new StringBuffer();
        try {
            FileReader fileReader=new FileReader("src/FuramaProject/data/room.csv");
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

        ArrayList<Room> listRoom=new ArrayList<>();
        int i=0;
        while(i<word.length){
            listRoom.add(new Room(word[i],word[i+1],Double.parseDouble(word[i+2]),Double.parseDouble(word[i+3]),
                    Double.parseDouble(word[i+4]),word[i+5],word[i+6]));
            i+=7;
        }
        for (int j = 0; j < listRoom.size(); j++) {
            System.out.print(j+". ");
            listRoom.get(j).showInfo();
        }
        System.out.println("Vui long chon Room ban muon:");
        int indexVilla=scanner.nextInt();
        try {
            FileWriter fileWriter=new FileWriter("src\\FuramaProject\\data\\booking.csv",true);
            fileWriter.write(name+","+birthday+","+gender+","+cmnd+","+phone+","+email+","
                    +typeCustomer+","+address+","+gender+","+listRoom.get(indexVilla).getId()+","+listRoom.get(indexVilla).getServiceName()
                    +","+listRoom.get(indexVilla).getAreaUse()+","+listRoom.get(indexVilla).getCost()+","+listRoom.get(indexVilla).getCountPerson()
                    +","+listRoom.get(indexVilla).getRentType()+","+listRoom.get(indexVilla).getOtherService()+",\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void bookingHouse(String name,String birthday,String gender,String cmnd,String phone,
                                    String email,String typeCustomer,String address){
        Scanner scanner=new Scanner(System.in);
        StringBuffer result=new StringBuffer();
        try {
            FileReader fileReader=new FileReader("src/FuramaProject/data/house.csv");
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

        ArrayList<House> listHouse=new ArrayList<>();
        int i=0;
        while(i<word.length){
            listHouse.add(new House(word[i],word[i+1],Double.parseDouble(word[i+2]),Double.parseDouble(word[i+3]),
                    Double.parseDouble(word[i+4]),word[i+5],word[i+6],word[i+7],word[i+8]));
            i+=9;
        }
        for (int j = 0; j < listHouse.size(); j++) {
            System.out.print(j+". ");
            listHouse.get(j).showInfo();
        }
        System.out.println("Vui long chon House ban muon:");
        int indexVilla=scanner.nextInt();
        try {
            FileWriter fileWriter=new FileWriter("src\\FuramaProject\\data\\booking.csv",true);
            fileWriter.write(name+","+birthday+","+gender+","+cmnd+","+phone+","+email+","
                    +typeCustomer+","+address+","+gender+","+listHouse.get(indexVilla).getIds()+","+listHouse.get(indexVilla).getServiceNames()
                    +","+listHouse.get(indexVilla).getAreaUses()+","+listHouse.get(indexVilla).getCosts()+","+listHouse.get(indexVilla).getCountPersons()
                    +","+listHouse.get(indexVilla).getRentTypes()+","+listHouse.get(indexVilla).getRoomStandard()+","+listHouse.get(indexVilla).getFeatures()
                    +","+listHouse.get(indexVilla).getCountFloor()+",\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void bookingVilla(String name,String birthday,String gender,String cmnd,String phone,
                                    String email,String typeCustomer,String address){
        Scanner scanner=new Scanner(System.in);
        StringBuffer result=new StringBuffer();
        try {
            FileReader fileReader=new FileReader("src/FuramaProject/data/villa.csv");
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

        ArrayList<Villa> listVilla=new ArrayList<>();
        int i=0;
        while(i<word.length){
            listVilla.add(new Villa(word[i],word[i+1],Double.parseDouble(word[i+2]),Double.parseDouble(word[i+3]),
                    Double.parseDouble(word[i+4]),word[i+5],word[i+6],word[i+7],word[i+8],Integer.parseInt(word[i+9])));
            i+=10;
        }
        for (int j = 0; j < listVilla.size(); j++) {
            System.out.print(j+". ");
            listVilla.get(j).showInfo();
        }
        System.out.println("Vui long chon Villa ban muon:");
        int indexVilla=scanner.nextInt();
        try {
            FileWriter fileWriter=new FileWriter("src\\FuramaProject\\data\\booking.csv",true);
            fileWriter.write(name+","+birthday+","+gender+","+cmnd+","+phone+","+email+","
                    +typeCustomer+","+address+","+gender+","+listVilla.get(indexVilla).getIds()+","+listVilla.get(indexVilla).getServiceNames()
                    +","+listVilla.get(indexVilla).getAreaUses()+","+listVilla.get(indexVilla).getCosts()+","+listVilla.get(indexVilla).getCountPersons()
                    +","+listVilla.get(indexVilla).getRentTypes()+","+listVilla.get(indexVilla).getRoomStandard()+","+listVilla.get(indexVilla).getFeatures()
                    +","+listVilla.get(indexVilla).getPoolArea()+","+listVilla.get(indexVilla).getCountFloor()+",\n");
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    public static void showInfoCustomer(){
        ArrayList<Customer> listCustomer=new ArrayList<>();
        StringBuffer stringBuffer=new StringBuffer();
        try{
            FileReader fileReader=new FileReader("src\\FuramaProject\\data\\customer.csv");
            BufferedReader bufferedReader=new BufferedReader(fileReader);
            String line=null;
            String[] str;
            while((line=bufferedReader.readLine())!=null){
                str=line.split(",");
               // str=String.valueOf(stringBuffer).split(",");
                listCustomer.add(new Customer(str[0],str[1],str[2],str[3],str[4],str[5],str[6],str[7],null));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        Collections.sort(listCustomer,new CompareCustomer());
        for (int i = 0; i < listCustomer.size(); i++) {
            listCustomer.get(i).showInfo();
        }
    }
    public static void addNewCustomer() throws NameException,EmailException {
        Scanner scanner=new Scanner(System.in);
        String name="";

        while(true){
            try{
                System.out.println("Nhập tên khách hàng: ");
                name=scanner.nextLine();
                if(!Pattern.matches("([A-Z]([a-z])* ?)+",name)){
                    throw new NameException("Ten khong dung dinh dang");
                }
                break;
            }catch(NameException e){

                System.out.println(e.getMessage());
            }
        }
        String birthday;

        while(true) {
            try {
                System.out.println("Nhập ngày sinh: ");
                birthday=scanner.nextLine();
                if (!Pattern.matches("[0-9]{2}/[0-9]{2}/(19[0-9][0-9]|20(00|01|02))", birthday)) {
                    throw new BirthdayException("Ngay sinh khong dung dinh dang");
                }
                break;
            } catch (BirthdayException e) {
                System.out.println(e.getMessage());
            }
        }
        String gender="";

        while(true){
            try{
                System.out.println("Nhập giới tính: ");
                gender=scanner.nextLine();
                if(!Pattern.matches("(male|female)",gender)){
                    throw new GenderException("Nhap male hoac female");
                }
                break;
            }catch(GenderException e){

                System.out.println(e.getMessage());
            }
        }
        String cmnd;

        while(true){
            try{
                System.out.println("Nhập chứng minh nhân dân: ");
                cmnd=scanner.nextLine();
                if(!Pattern.matches("[\\d]{3} [\\d]{3} [\\d]{3}",cmnd)){
                    throw new IdException("Vui long nhap theo dinh dang XXX XXX XXX");
                }
                break;
            }catch(IdException e){

                System.out.println(e.getMessage());
            }
        }
        System.out.println("Nhập Số điện thoại: ");
        String phone=scanner.nextLine();
        String email="";
        while(true) {
            try {
                System.out.println("Nhập Email: ");
                email = scanner.nextLine();
                if (!Pattern.matches("[a-zA-Z0-9]+@[a-zA-Z0-9]+(\\.[a-zA-Z0-9]+)", email)) {
                    throw new EmailException("Email khong dung dinh dang");
                }
                break;
            } catch (EmailException e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.println("Nhập Loại khách hàng: ");
        String typeCustomer=scanner.nextLine();
        System.out.println("Nhập Địa chỉ: ");
        String address=scanner.nextLine();
        FileWriter fileWriter;
        String PATH="src/FuramaProject/data/customer.csv";
        try{
            fileWriter=new FileWriter(PATH,true);
            fileWriter.write(name+","+birthday+","+gender+","+cmnd+","+phone+","
                    +email+","+typeCustomer+","+address+",\n");
            fileWriter.close();
        }catch(Exception e){
            e.getMessage();
        }
    }
    public static void addNewService(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("1. Add New Villa \n 2. Add New House \n 3. Add New Room " +
                "\n 4. Back To Menu \n 5. Exit \n Please Choice: ");
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                addNewVilla();
                addNewService();
                break;
            case 2:
                addNewHouse();
                addNewService();
                break;
            case 3:
                addNewRoom();
                addNewService();
                break;
            case 4:
                displayMainMenu();
                break;
        }
    }
    public static void addNewVilla(){

        Scanner scanner=new Scanner(System.in);

        String id;
        do{
            System.out.println("Input ID Service:");
            id=scanner.nextLine();
        }while (!Pattern.matches("SV(VL|HO|RO)-[\\d]{4}",id));
        String serviceName;

        do{
            System.out.println("Input Service Name");
            serviceName=scanner.nextLine();
        }while  (!Pattern.matches("[A-Z][a-z0-9\\s]*",serviceName));
        Double areaUse;
        do {
            System.out.println("Input Area used: ");
            areaUse=scanner.nextDouble();
        }while ((areaUse<0||areaUse>30));
        Double cost;
        do{
            System.out.println("Input Cost: ");
            cost=scanner.nextDouble();
        }while (cost<0);

        Double countPerson;
        do {
            System.out.println("Input Total Person: ");
            countPerson=scanner.nextDouble();
        }while(!(countPerson<20&&countPerson>0));
        scanner.nextLine();
        String rentType;
        do {
            System.out.println("Input Type Rent: ");
            rentType=scanner.nextLine();
        }while(!Pattern.matches("[A-Z][a-z0-9\\s]*",rentType));


        System.out.println("Input Room Standard: ");
        String roomStandard=scanner.nextLine();
        System.out.println("Input Feature: ");
        String feature=scanner.nextLine();
        System.out.println("Input Pool Area: ");
        String poolArea=scanner.nextLine();
        int countFloor;
        do {
            System.out.println("Input Count Floor: ");
            countFloor=scanner.nextInt();
        }while(countFloor<0);

        FileWriter fileWriter;
        String PATH="src/FuramaProject/data/villa.csv";
        try{
            fileWriter=new FileWriter(PATH,true);
            fileWriter.write(id+","+serviceName+","+areaUse+","+cost+","+countPerson+","
                    +rentType+","+roomStandard+","+feature+","+poolArea+","+countFloor+",\n");
            fileWriter.close();
        }catch(Exception e){
            e.getMessage();
        }
    }
    public static void addNewHouse(){

        Scanner scanner=new Scanner(System.in);

        String id;
        do{
            System.out.println("Input ID Service:");
            id=scanner.nextLine();
        }while (!Pattern.matches("SV(VL|HO|RO)-[\\d]{4}",id));
        String serviceName;

        do{
            System.out.println("Input Service Name");
            serviceName=scanner.nextLine();
        }while  (!Pattern.matches("[A-Z][a-z0-9\\s]*",serviceName));
        Double areaUse;
        do {
            System.out.println("Input Area used: ");
            areaUse=scanner.nextDouble();
        }while ((areaUse<0||areaUse>30));
        Double cost;
        do{
            System.out.println("Input Cost: ");
            cost=scanner.nextDouble();
        }while (cost<0);

        Double countPerson;
        do {
            System.out.println("Input Total Person: ");
            countPerson=scanner.nextDouble();
        }while(!(countPerson<20&&countPerson>0));
        scanner.nextLine();
        String rentType;
        do {
            System.out.println("Input Type Rent: ");
            rentType=scanner.nextLine();
        }while(!Pattern.matches("[A-Z][a-z0-9\\s]*",rentType));
        System.out.println("Input Room Standard: ");
        String roomStandard=scanner.nextLine();
        System.out.println("Input Feature: ");
        String feature=scanner.nextLine();
        int countFloor;
        do {
            System.out.println("Input Count Floor: ");
            countFloor=scanner.nextInt();
        }while(countFloor<0);
        FileWriter fileWriter;
        String PATH="src/FuramaProject/data/house.csv";
        try{
            fileWriter=new FileWriter(PATH,true);
            fileWriter.write(id+","+serviceName+","+areaUse+","+cost+","+countPerson+","
                    +rentType+","+roomStandard+","+feature+","+countFloor+",\n");
            fileWriter.close();
        }catch(Exception e){
            e.getMessage();
        }
    }

    public static void addNewRoom(){
        Scanner scanner=new Scanner(System.in);

        String id;
        do{
            System.out.println("Input ID Service:");
            id=scanner.nextLine();
        }while (!Pattern.matches("SV(VL|HO|RO)-[\\d]{4}",id));
        String serviceName;

        do{
            System.out.println("Input Service Name");
            serviceName=scanner.nextLine();
        }while  (!Pattern.matches("[A-Z][a-z0-9\\s]*",serviceName));
        Double areaUse;
        do {
            System.out.println("Input Area used: ");
            areaUse=scanner.nextDouble();
        }while ((areaUse<0||areaUse>30));
        Double cost;
        do{
            System.out.println("Input Cost: ");
            cost=scanner.nextDouble();
        }while (cost<0);

        Double countPerson;
        do {
            System.out.println("Input Total Person: ");
            countPerson=scanner.nextDouble();
        }while(!(countPerson<20&&countPerson>0));
        scanner.nextLine();
        String rentType;
        do {
            System.out.println("Input Type Rent: ");
            rentType=scanner.nextLine();
        }while(!Pattern.matches("[A-Z][a-z0-9\\s]*",rentType));
        String otherService;
        do{
            System.out.println("Input Other Service: ");
            otherService=scanner.nextLine();
        }while(!Pattern.matches("(massage|food|drink|karaoke|car)",otherService));


        FileWriter fileWriter;
        String PATH="src/FuramaProject/data/room.csv";
        try{
            fileWriter=new FileWriter(PATH,true);
            fileWriter.write(id+","+serviceName+","+areaUse+","+cost+","+countPerson+","
                    +rentType+","+otherService+",\n");
            fileWriter.close();
        }catch(Exception e){
            e.getMessage();
        }
    }
    public static void showService(){
        System.out.println("1. Show all Villa \n 2. Show all House \n 3. Show all Room \n 4. Show all Villa not duplicate \n" +
                " 5. Show all House not Duplicate \n 6. Show all Room not duplicate \n 7. Back to Menu \n 8. Exit" +
                "\n Please choose: ");
        Scanner scanner=new Scanner(System.in);
        int choice=scanner.nextInt();
        switch(choice){
            case 1:
                showAllVilla();
                break;
            case 2:
                showAllHouse();
                break;
            case 3:
                showAllRoom();
                break;
            case 7:
                displayMainMenu();
                break;
        }

    }
    public static void showAllVilla(){
        StringBuffer result=new StringBuffer();
        try {
            FileReader fileReader=new FileReader("src/FuramaProject/data/villa.csv");
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

        ArrayList<Villa> listVilla=new ArrayList<>();
        int i=0;
        while(i<word.length){
            listVilla.add(new Villa(word[i],word[i+1],Double.parseDouble(word[i+2]),Double.parseDouble(word[i+3]),
                    Double.parseDouble(word[i+4]),word[i+5],word[i+6],word[i+7],word[i+8],Integer.parseInt(word[i+9])));
            i+=10;
        }
        for (int j = 0; j < listVilla.size(); j++) {
            listVilla.get(j).showInfo();
        }
    }
    public static void showAllHouse(){
        StringBuffer result=new StringBuffer();
        try {
            FileReader fileReader=new FileReader("src/FuramaProject/data/house.csv");
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

        ArrayList<House> listHouse=new ArrayList<>();
        int i=0;
        while(i<word.length){
            listHouse.add(new House(word[i],word[i+1],Double.parseDouble(word[i+2]),Double.parseDouble(word[i+3]),
                    Double.parseDouble(word[i+4]),word[i+5],word[i+6],word[i+7],word[i+8]));
            i+=9;
        }
        for (int j = 0; j < listHouse.size(); j++) {
            listHouse.get(j).showInfo();
        }
    }

    public static void showAllRoom(){
        StringBuffer result=new StringBuffer();
        try {
            FileReader fileReader=new FileReader("src/FuramaProject/data/room.csv");
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

        ArrayList<Room> listRoom=new ArrayList<>();
        int i=0;
        while(i<word.length){
            listRoom.add(new Room(word[i],word[i+1],Double.parseDouble(word[i+2]),Double.parseDouble(word[i+3]),
                    Double.parseDouble(word[i+4]),word[i+5],word[i+6]));
            i+=7;
        }
        for (int j = 0; j < listRoom.size(); j++) {
            listRoom.get(j).showInfo();
        }
    }

    public static void main(String[] args) {
        displayMainMenu();
    }
}
