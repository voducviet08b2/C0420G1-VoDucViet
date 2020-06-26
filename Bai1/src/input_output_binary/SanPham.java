package input_output_binary;

import java.io.*;

public class SanPham implements Serializable {
    private static final long serialVersionUID = 1L;
    private int id;
    private String name;
    private String factory;
    private int cost;
    private String otherDetail;

    public SanPham(int id, String name, String factory, int cost, String otherDetail) {
        this.id = id;
        this.name = name;
        this.factory = factory;
        this.cost = cost;
        this.otherDetail = otherDetail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", factory='" + factory + '\'' +
                ", cost=" + cost +
                ", otherDetail='" + otherDetail + '\'' +
                '}';
    }
}
