package DanhSach;

public class TestLinkedList {
    public static void main(String[] args) {
        class Student{
            private int id;
            private String name;
            public Student(){

            }

            public Student(int id, String name) {
                this.id = id;
                this.name = name;
            }

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            @Override
            public String toString() {
                return "Student{" +
                        "id=" + id +
                        ", name='" + name + '\'' +
                        '}';
            }
        }
        MyLinkedList<Student> myLinkedList=new MyLinkedList<>();
        Student student1=new Student(1,"trung");
        Student student2=new Student(2,"hai ");
        Student student3=new Student(3,"tuan");
        Student student4=new Student(4,"long ");
        Student student5=new Student(5,"phong ");
        Student student6=new Student(6,"duong ");
        myLinkedList.addFirst(student1);
        myLinkedList.addLast(student2);
        myLinkedList.addLast(student3);
        myLinkedList.addLast(student4);
        myLinkedList.addLast(student5);


        MyLinkedList<Student> abc=myLinkedList.clone(myLinkedList);

        Student student;
//        for(int i=0;i<myLinkedList.size();i++){
//             student=(Student) myLinkedList.get(i);
//            System.out.println(student.getName());
//        }

        for(int i=0;i<abc.size();i++){
            student=(Student) abc.get(i);
            System.out.println(student.getName());
        }

    }
}
