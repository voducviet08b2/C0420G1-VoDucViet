package FuramaProject.Model;

public class Villa extends Services implements Comparable<Villa> {
    private String roomStandard;
    private String features;
    private String poolArea;
    private int countFloor;

    public Villa(String id, String serviceName, double areaUse, double cost, double countPerson, String rentType,
                 String roomStandard, String features, String poolArea, int countFloor) {
        super(id, serviceName, areaUse, cost, countPerson, rentType);
        this.roomStandard = roomStandard;
        this.features = features;
        this.poolArea = poolArea;
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

    public String getPoolArea() {
        return poolArea;
    }

    public int getCountFloor() {
        return countFloor;
    }

    @Override
    public boolean equals(Object obj) {
        Villa obj1=(Villa) obj;
        if(this.getServiceName().equals(obj1.getServiceName())){
            return true;
        }else return false;

    }

    @Override
    public void showInfo() {
        System.out.println("Ten dich vu: "+this.getServiceName()+"; Dien tich Su dung: "+this.getAreaUse()+";" +
                " Thanh Toan: "+this.getCost()+"; So luong nguoi:"+this.getCountPerson()+"; Loai dich vu: "+this.getRentType()
        +"; Tieu chuan phong: "+this.roomStandard+"; Tien ich khac: "+this.features+"; Dien tich ho boi: "+this.poolArea+
                "; So tang: "+this.countFloor);
    }

    @Override
    public int compareTo(Villa o) {
        return this.getServiceName().compareTo(o.getServiceName());
    }
}
