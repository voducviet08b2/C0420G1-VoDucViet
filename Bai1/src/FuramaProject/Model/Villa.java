package FuramaProject.Model;

public class Villa extends Services {
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



    @Override
    public void showInfo() {
        System.out.println("Ten dich vu: "+this.getServiceName()+"; Dien tich Su dung: "+this.getAreaUse()+";" +
                " Thanh Toan: "+this.getCost()+"; So luong nguoi:"+this.getCountPerson()+"; Loai dich vu: "+this.getRentType()
        +"; Tieu chuan phong: "+this.roomStandard+"; Tien ich khac: "+this.features+"; Dien tich ho boi: "+this.poolArea+
                "; So tang: "+this.countFloor);


    }
}