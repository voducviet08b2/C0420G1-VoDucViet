package FuramaProject.Model;

public class House extends Services implements Comparable<House> {
    private String roomStandard;
    private String features;
    private String countFloor;

    public House(String id, String serviceName, double areaUse, double cost, double countPerson, String rentType, String roomStandard, String features, String countFloor) {
        super(id, serviceName, areaUse, cost, countPerson, rentType);
        this.roomStandard = roomStandard;
        this.features = features;
        this.countFloor = countFloor;
    }
    public String getIds(){
        return this.getId();
    }
    public String getServiceNames(){
        return this.getServiceName();
    }
    public double getAreaUses(){
        return this.getAreaUse();
    }
    public double getCosts(){
        return this.getCost();
    }
    public double getCountPersons(){
        return this.getCountPerson();
    }
    public String getRentTypes(){
        return this.getRentType();
    }

    public String getRoomStandard() {
        return roomStandard;
    }

    public String getFeatures() {
        return features;
    }

    public String getCountFloor() {
        return countFloor;
    }

    @Override
    public void showInfo() {
        System.out.println("Ten dich vu: "+this.getServiceName()+"; Dien tich Su dung: "+this.getAreaUse()+";" +
                " Thanh Toan: "+this.getCost()+"; So luong nguoi:"+this.getCountPerson()+"; Loai dich vu: "+this.getRentType()
                +"; Tieu chuan phong: "+this.roomStandard+"; Tien ich khac: "+this.features+"; So tang: "+this.countFloor);
    }

    @Override
    public int compareTo(House o) {
        return this.getServiceName().compareTo(o.getServiceName());
    }
}
