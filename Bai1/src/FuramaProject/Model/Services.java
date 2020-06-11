package FuramaProject.Model;

public abstract class Services {
    private String id;
    private String serviceName;
    private double areaUse;
    private double cost;
    private double countPerson;
    private String rentType;

    public Services(String id, String serviceName, double areaUse, double cost, double countPerson, String rentType) {
        this.id = id;
        this.serviceName = serviceName;
        this.areaUse = areaUse;
        this.cost = cost;
        this.countPerson = countPerson;
        this.rentType = rentType;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public double getAreaUse() {
        return areaUse;
    }

    public void setAreaUse(double areaUse) {
        this.areaUse = areaUse;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public double getCountPerson() {
        return countPerson;
    }

    public void setCountPerson(double countPerson) {
        this.countPerson = countPerson;
    }

    public String getRentType() {
        return rentType;
    }

    public void setRentType(String rentType) {
        this.rentType = rentType;
    }

    public abstract void showInfo();

}
