package Compare;

import java.util.Comparator;

public class sortNameAge implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        int value=o1.age-o2.age;
        if(value!=0){
            return value;
        }
        value=o1.name.compareTo(o2.name);
        return value;
    }
}
