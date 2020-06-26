package input_output_binary;

import MapTree.Product;

import java.io.*;
import java.util.ArrayList;
import java.util.Map;
import java.util.Scanner;

public class QuanLySanPham {
    public static ArrayList<SanPham> list=new ArrayList<>();
    public static ArrayList<Object> objectsList = new ArrayList<>();
    public static void main(String[] args) {

        MainMenu();

    }



    public static void MainMenu() {
        System.out.println(" 1. Them San Pham \n 2. Hien Thi San Pham \n 3. Luu San Pham \n 4. Lay ra San Pham tu File \n 5. Tim kiem San Pham tu File  \n Vui lòng nhập lựa chọn");
        Scanner scanner = new Scanner(System.in);
        int choice = scanner.nextInt();
        switch (choice) {
            case 1:
                ThemSanPham();
                MainMenu();
                break;
            case 2:
                HienThiSanPham();
                break;
            case 3:
                LuuSanPham();
                MainMenu();
                break;
            case 4:
                LayRaSanPham();
                MainMenu();
                break;
            case 5:
                TimKiemSanPham();
                MainMenu();
                break;
        }
    }
        public static void ThemSanPham(){
        Scanner scanner=new Scanner(System.in);
            System.out.print("Nhập mã sản phẩm: ");
            int id = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập tên sản phẩm: ");
            String name = scanner.nextLine();
            System.out.print("Nhập hãng sản xuất: ");
            String manufacturer = scanner.nextLine();
            System.out.print("Nhập giá: ");
            int price = Integer.parseInt(scanner.nextLine());
            System.out.print("Nhập thông tin khác: ");
            String other = scanner.nextLine();
            list.add(new SanPham(id,name,manufacturer,price,other));
        }
        public static void HienThiSanPham(){
            for (int i = 0; i <list.size() ; i++) {
                System.out.println(list.get(i));

            }
        }
        public static void LuuSanPham () {
            try{
                ObjectOutputStream objectOutputStream=new ObjectOutputStream(new FileOutputStream("src/folder/sanpham.txt"));
                for (int i = 0; i < list.size(); i++) {
                    objectOutputStream.writeObject(list.get(i));
                }

                objectOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        public static void LayRaSanPham(){
        boolean cont=true;

        try{
            ObjectInputStream ois=new ObjectInputStream(new FileInputStream("src/folder/sanpham.txt"));
            while(cont){
                SanPham sanpham=(SanPham) ois.readObject();
                //System.out.println(sanpham.toString());
                if (sanpham != null) {
                    objectsList.add(sanpham);
                } else {
                    cont = false;
                }
            }

        } catch (Exception e){
            e.getMessage();
        }
            for (int i = 0; i <objectsList.size() ; i++) {
                System.out.println(objectsList.get(i));
            }

        }
    public static void TimKiemSanPham(){
        System.out.println("Nhap ten san pham");
        Scanner scanner=new Scanner(System.in);
        String name=scanner.nextLine();
        SanPham sanpham;
        for (int i = 0; i < objectsList.size(); i++) {
            sanpham=(SanPham) objectsList.get(i);
            if(name.equals(sanpham.getName())){
                System.out.println(sanpham.toString());

            }
        }
    }
    }


