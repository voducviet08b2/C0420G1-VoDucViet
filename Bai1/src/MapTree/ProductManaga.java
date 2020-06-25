package MapTree;

import java.util.*;

public class ProductManaga<E> {
    public ArrayList<E> map;

    public ProductManaga() {

        this.map=new ArrayList<>();
    }
    public void add(E element){
        map.add(element);
    }
    public void show(){
        System.out.println(map);
    }
    public int size(){
        return map.size();
    }
    public E get(int i){
        return map.get(i);
    }
    public void set(int index,E element){
        map.set(index,element);
    }
    public void remove(int index){
        map.remove(index);
    }

    public static void main(String[] args) {
        Product product1=new Product(1,"Coca",22000);
        Product product2=new Product(2,"Coca",33000);
        Product product3=new Product(34,"Cigarate",20000);
        ProductManaga<Product> list=new ProductManaga<>();

        list.add(product1);
        list.add(product2);
        list.add(product3);

        Scanner scanner=new Scanner(System.in);

        //Thông tin update

//        System.out.println("Nhap id ban muon sua:");
//        int id=Integer.parseInt(scanner.nextLine());
//        System.out.println("Nhap lai ten san pham");
//        String name=scanner.nextLine();
//        System.out.println("Nhap lai gia san pham");
//        int cost=scanner.nextInt();

        //Update Product

//        for(int i=0;i<list.size();i++) {
//            if (id == list.get(i).getId()) {
//                list.set(i, new Product(id, name, cost));
//            }
//        }
        //Remove Product

//        for(int i=0;i<list.size();i++) {
//            if (id == list.get(i).getId()) {
//                list.remove(i);
//            }
//        }

        //Tim kiem san pham

//        System.out.println("Nhập tên sản phẩm");
//        String name=scanner.nextLine();
//        for(int i=0;i<list.size();i++) {
//            if (name.equals(list.get(i).getName())) {
//                System.out.println("ID: "+list.get(i).getId()+"; Name: "+list.get(i).getName()+"; Cost: "+list.get(i).getCost());
//            }
//        }

        //Sap xep san pham

//        Collections.sort(list.map);

        //Show san pham
       list.show();


    }
}
