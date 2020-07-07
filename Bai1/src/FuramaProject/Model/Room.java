package FuramaProject.Model;

public class Room extends Services implements Comparable<Room>{
    private String otherService;

    public Room(String id, String serviceName, double areaUse, double cost, double countPerson, String rentType, String otherService) {
        super(id, serviceName, areaUse, cost, countPerson, rentType);
        this.otherService = otherService;
    }

    public String getOtherService() {
        return otherService;
    }

    @Override
    public void showInfo() {
        System.out.println("Ten dich vu: "+this.getServiceName()+"; Dien tich Su dung: "+this.getAreaUse()+";" +
                " Thanh Toan: "+this.getCost()+"; So luong nguoi:"+this.getCountPerson()+"; Loai dich vu: "+this.getRentType()
                +"; Dich vu khac: "+this.otherService);
    }

    @Override
    public int compareTo(Room o) {
        return this.getServiceName().compareTo(o.getServiceName());
    }
}
