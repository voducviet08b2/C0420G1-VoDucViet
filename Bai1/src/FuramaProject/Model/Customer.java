package FuramaProject.Model;

import java.util.Comparator;

public class Customer  {
    //Họ tên Customer, Ngày sinh, Giới tính, Số CMND, Số ĐT, Email, Loại khách, Địa chỉ và thuộc tính
    //sử dụng dịch vụ có kiểu đối tượng là Services, và phương thức showInfor().
    private String name;
    private String birthday;
    private String gender;
    private String cmnd;
    private String phone;
    private String email;
    private String typeCustomer;
    private String address;

    public String getName() {
        return name;
    }

    private Services service;

    public String getBirthday() {
        return birthday;
    }

    public String getGender() {
        return gender;
    }

    public String getCmnd() {
        return cmnd;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public Customer(String name, String birthday, String gender, String cmnd, String phone, String email, String typeCustomer, String address, Services service) {
        this.name = name;
        this.birthday = birthday;
        this.gender = gender;
        this.cmnd = cmnd;
        this.phone = phone;
        this.email = email;
        this.typeCustomer = typeCustomer;
        this.address = address;
        this.service = service;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\'' +
                '}';
    }

    public void showInfo(){
        System.out.println("Customer{" +
                "name='" + name + '\'' +
                ", birthday='" + birthday + '\'' +
                ", gender='" + gender + '\'' +
                ", cmnd='" + cmnd + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", typeCustomer='" + typeCustomer + '\'' +
                ", address='" + address + '\''
                );
    }



}
