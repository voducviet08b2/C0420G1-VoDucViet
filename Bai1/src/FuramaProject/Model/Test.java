package FuramaProject.Model;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test {
    public static void main(String[] args) {
        Set<Room> tree=new HashSet<>();
        Room room1=new Room("12","12",12,12,12,"12","12");
        tree.add(room1);

        for(Room room:tree){
            System.out.println(room.getServiceName());
        }
    }
}
