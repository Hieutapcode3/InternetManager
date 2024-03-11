/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ClientSv;

/**
 *
 * @author phamt
 */
public class Infor {
    private String tenTK;
    private String mkTK;
    private double thoiGian;
    private int point;
    private int idUser;

    // Constructor
    public Infor(){
        
    }
    public Infor(String tenTK, String mkTK, double thoiGian, int point,int idUser) {
        this.tenTK = tenTK;
        this.mkTK = mkTK;
        this.thoiGian = thoiGian;
        this.point = point;
        this.idUser = idUser;
    }

    // Getters and Setters
    public String getTenTK() {
        return tenTK;
    }

    public void setTenTK(String tenTK) {
        this.tenTK = tenTK;
    }

    public String getMkTK() {
        return mkTK;
    }

    public void setMkTK(String mkTK) {
        this.mkTK = mkTK;
    }

    public double getThoiGian() {
        return thoiGian;
    }

    public void setThoiGian(double thoiGian) {
        this.thoiGian = thoiGian;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
    public void setId(int id){
        this.idUser = id;
    }
    public int getId(){
        return idUser;
    }

    // Hàm in ra thông tin
    public void inThongTin() {
        System.out.println("Ten tai khoan: " + getTenTK());
        System.out.println("Mat khau: " + getMkTK());
        System.out.println("Thoi gian con lai: " + getThoiGian());
        System.out.println("Point: " + getPoint());
        System.out.println("ID User: " + getId());
    }

}

