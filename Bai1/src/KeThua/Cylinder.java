package KeThua;

public class Cylinder extends Circle {
    private double height;

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height=height;
    }
    @Override
    public String toString(){
        return "Radius: "+this.getRadius()+"; Color: "+this.getColor()+"; Height:"+this.getHeight();
    }
    public double getTheTich(){
        return this.getRadius()*this.getRadius()*this.getHeight()*3.14;
    }
    public void inManHinh(){
        System.out.println("In ke thua");
    }
    public static void main(String[] args) {
        Circle cylinder=new Cylinder(5,"Red",7.5);
        Cylinder cylinder1= (Cylinder) cylinder;
        cylinder1.inManHinh();

    }
}
