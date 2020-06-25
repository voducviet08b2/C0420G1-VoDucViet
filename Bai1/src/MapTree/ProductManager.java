package MapTree;


import java.util.*;

public class ProductManager {
    static List<Product> lists = new ArrayList<Product>();

    public static void addProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập id: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Nhập tên: ");
        String name = sc.nextLine();
        System.out.print("Nhập giá: ");
        int price = Integer.parseInt(sc.nextLine());
        Product sp = new Product(id, name, price);
        lists.add(sp);
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "đ");
        }
        System.out.println("-------------------------");
    }


    public static void editProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập id sản phẩm muốn sửa: ");
        int id = Integer.parseInt(sc.nextLine());
        System.out.print("Sửa tên sản phẩm thành: ");
        String name = sc.nextLine();
        for (int i = 0; i < lists.size(); i++) {
            if (id == lists.get(i).getId()) {
                lists.get(i).setName(name);
            }
        }
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "đ");
        }
        System.out.println("-------------------------");
    }


    public static void deleteProduct() {
        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.print("Nhập id sản phẩm muốn xóa: ");
        int id = sc.nextInt();
        for (int i = 0; i < lists.size(); i++) {
            if (lists.get(i).getId() == id) {
                lists.remove(i);
            }
        }
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "đ");
        }
        System.out.println("-------------------------");
    }


    public static void showProduct() {
        System.out.println();
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "đ");
        }
        System.out.println("-------------------------");
    }


    public static void findProduct() {
        System.out.println();
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập tên sản phẩm muốn tìm: ");
        String name = sc.nextLine();
        for (int i = 0; i < lists.size(); i++) {
            if (name.equals(lists.get(i).getName())) {
                System.out.println("Thông tin sản phẩm bạn muốn tìm: ");
                System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "đ");
            }
        }
        System.out.println("-------------------------");
    }


    public static void sortIncreaseProduct() {
        boolean needNextPass = true;
        for (int k = 1; k < lists.size() && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < lists.size() - k; i++) {
                if (lists.get(i).getPrice() > lists.get(i + 1).getPrice()) {
                    Product temp = lists.get(i);
                    lists.set(i, lists.get(i + 1));
                    lists.set(i + 1, temp);
                    needNextPass = true;
                }
            }
        }
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "đ");
        }
        System.out.println("-------------------------");
    }


    public static void sortReductionProduct() {
        boolean needNextPass = true;
        for (int k = 1; k < lists.size() && needNextPass; k++) {
            needNextPass = false;
            for (int i = 0; i < lists.size() - k; i++) {
                if (lists.get(i).getPrice() < lists.get(i + 1).getPrice()) {
                    Product temp = lists.get(i);
                    lists.set(i, lists.get(i + 1));
                    lists.set(i + 1, temp);
                    needNextPass = true;
                }
            }
        }
        System.out.println("Danh sách sản phẩm: ");
        for (int i = 0; i < lists.size(); i++) {
            System.out.println(lists.get(i).getId() + ". " + lists.get(i).getName() + ": " + lists.get(i).getPrice() + "đ");
        }
        System.out.println("-------------------------");
    }


    public static void main(String[] args) {
        ProductManager pro = new ProductManager();
        Scanner scanner = new Scanner(System.in);
        int choice = 0;
        while (choice != 7) {
            System.out.println("1.Thêm sản phẩm " +
                    "\n2.Sửa thông tin sản phẩm " +
                    "\n3.Xóa sản phẩm" +
                    "\n4.Hiển thị danh sách sản phẩm " +
                    "\n5.Tìm kiếm sản phẩm" +
                    "\n6.Sắp xếp sản phẩm theo giá" +
                    "\n7.Exit");
            System.out.print("Enter your choice: ");
            choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case 1:
                    pro.addProduct();
                    break;
                case 2:
                    pro.editProduct();
                    break;
                case 3:
                    pro.deleteProduct();
                    break;
                case 4:
                    pro.showProduct();
                    break;
                case 5:
                    pro.findProduct();
                    break;
                case 6:
//                    pro.sortProduct();
                    System.out.println("1.Sắp xếp tăng: " +
                            "\n2.Sắp xếp giảm: ");
                    System.out.print("Enter choice: ");
                    int num = Integer.parseInt(scanner.nextLine());
                    switch (num) {
                        case 1:
                            pro.sortIncreaseProduct();
                            break;
                        case 2:
                            pro.sortReductionProduct();
                            break;
                    }
                    break;
            }
        }

    }

}
