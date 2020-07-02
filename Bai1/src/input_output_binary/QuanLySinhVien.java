package input_output_binary;

import MapTree.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class QuanLySinhVien {
    public static ArrayList<SinhVien> list=new ArrayList<>();
    public static ArrayList<Object> objectsList = new ArrayList<>();
    public static void main(String[] args) {
        boolean cont=true;
        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/folder/sinhvien.txt"));
            while(cont){
                SinhVien sinhvien=(SinhVien) ois.readObject();
                //System.out.println(sanpham.toString());
                if (sinhvien != null) {
                    list.add(sinhvien);
                } else {
                    cont = false;
                }

            }

        } catch (Exception e){
            e.getMessage();
        }

        MainMenu();

    }



    public static void MainMenu() {

        System.out.println(" 1. Thêm Sinh Viên \n 2. Hiển thị Sinh Viên \n 3. Xóa Sinh Viên \n " +
                "4. Sửa Sinh Viên  \n 5. Tìm kiếm Sinh Viên tu File  \n Vui lòng nhập lựa chọn");
        Scanner scanner = new Scanner(System.in);
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice) {
            case 1:
                ThemSinhVien();
                MainMenu();
                break;
            case 2:
                HienThiSinhVien();
                MainMenu();
                break;
            case 3:
                XoaSinhVien();
                MainMenu();
                break;

            case 4:
                SuaSinhVien();
                MainMenu();
                break;

            case 5:
                TimKiemSinhVien();
                MainMenu();
                break;
        }
    }

    public static void SuaSinhVien(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhập id sinh viên muốn sửa:");
        int id=scanner.nextInt();
        scanner.nextLine();
        SinhVien sinhvien;
        String classes,name;
        int age;
        for (int i = 0; i < list.size() ; i++) {

            if(id==list.get(i).getId()){

                System.out.print("Nhập tên sinh viên: ");
                 name = scanner.nextLine();
                System.out.print("Nhập tên lớp: ");
                 classes = scanner.nextLine();
                System.out.print("Nhập tuổi: ");
                 age = Integer.parseInt(scanner.nextLine());
                list.get(i).setAge(age);
                list.get(i).setClasses(classes);
                list.get(i).setName(name);
            }


        }
        LuuSinhVien();
    }

    public static void ThemSinhVien(){

        Scanner scanner=new Scanner(System.in);
        System.out.print("Nhập mã sinh viên: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.print("Nhập tên sinh viên: ");
        String name = scanner.nextLine();
        System.out.print("Nhập tên lớp: ");
        String classes = scanner.nextLine();
        System.out.print("Nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
       
        list.add(new SinhVien(id,name,classes,age));
        LuuSinhVien();
    }
    public static void HienThiSinhVien(){
        boolean cont=true;
        objectsList.clear();
        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/folder/sinhvien.txt"));
            while(cont){
                SinhVien sinhvien=(SinhVien) ois.readObject();
                //System.out.println(sanpham.toString());
                if (sinhvien != null) {
                    objectsList.add(sinhvien);
                } else {
                    cont = false;
                }
            }
            ois.close();

        } catch (Exception e){
            e.getMessage();
        }
        System.out.println("Danh sách sinh viên:\n");
        for (int i = 0; i <objectsList.size() ; i++) {
            System.out.println(objectsList.get(i));
        }
        System.out.println();
    }
    public static void LuuSinhVien () {
        try{
            ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("src/folder/sinhvien.txt"));
            for (int i = 0; i < list.size(); i++) {
                objectOutputStream.writeObject(list.get(i));
            }

            objectOutputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void XoaSinhVien(){
//        HienThiSinhVien();
        Scanner scanner=new Scanner(System.in);
        System.out.println("Chọn Id sinh viên muốn xóa: ");
        int id=Integer.parseInt(scanner.nextLine());


        for(int i=0;i<list.size();i++){

                if(id==list.get(i).getId()){
                    System.out.println("true");

                   list.remove(list.get(i));
                }
            }
        LuuSinhVien();
    }


    public static void TimKiemSinhVien(){
        System.out.println("Nhập tên sinh vien");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();

        for (int i = 0; i < list.size(); i++) {

            if(name.equals(list.get(i).getName())){
                System.out.println("Search successfull...");
                System.out.println(list.get(i).toString());

            }
        }
    }
}


