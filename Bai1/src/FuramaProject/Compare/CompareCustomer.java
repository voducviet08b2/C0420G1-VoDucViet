package FuramaProject.Compare;

import Compare.Student;
import FuramaProject.Model.Customer;

import java.util.Comparator;

public class CompareCustomer implements Comparator<Customer> {
    @Override
    public int compare(Customer o1, Customer o2) {
        int value=o1.getName().compareTo(o2.getName());


            if(value!=0){
                return value;
            }
            String[] str1=o1.getBirthday().split("/");
            String[] str2=o2.getBirthday().split("/");
            String yearCustomer1=str1[2];
            String yearCustomer2=str2[2];
            value=Integer.parseInt(yearCustomer2)-Integer.parseInt(yearCustomer1);
            return value;

    }
}
