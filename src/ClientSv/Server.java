/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ClientSv;

import java.util.ArrayList;
import java.util.Scanner;


public class Server extends Infor {
    double doanhthu;
    int idComputer;
    
    ArrayList<Infor> danhSachTaiKhoan = new ArrayList<>();
    public Server(){
        
    }
    public Server(String tenTK, String mkTK, double thoiGian, int point,int idUser,int idComputer,double doanhthu) {
        super(tenTK, mkTK, thoiGian, point,idUser);
        this.doanhthu = doanhthu;
        this.idComputer = idComputer;  
    }
    public void taoTk(String tenTK,String mkTK){
        if(!tenTK.equals(getTenTK())){
            System.out.println("Ten tai khoan da ton tai. Vui long nhap lai!");
        } else {
            setTenTK(tenTK);
            setMkTK(mkTK);
            System.out.println("Tao tai khoan thanh cong!");
        }
    }
      public double getDoanhThu() {
        return doanhthu;
    }
    public void setDoanhThu(double doanhThu) {
        this.doanhthu = doanhThu;
    }
    public int getIdCom() {
        return idComputer;
    }
    public void setIdCom(int idMay) {
        this.idComputer = idMay;
    }
    public void moMay(String tenTK,String mkTK){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten tai khoan: ");
        String tk = scanner.nextLine();
        System.out.print("Nhap mat khau: ");
        String mk = scanner.nextLine();
        
        if(!tk.equals(getTenTK()) || !mk.equals(getMkTK())){
            System.out.print("Ten tai khoan hoac mat khau khong chinh xac. Vui long nhap lai! ");
        } else {
            if(idComputer > 20){
                System.out.print("May da full");
            } else {
                idComputer++;
                System.out.print("Mo may thanh cong!");
            }
        }
    }
    
    public void tatMay(){
        if(idComputer < 0){
            System.out.print("Hien tai khong co may nao dang duoc su dung");
        } else {
            idComputer--;
            System.out.print("May da duoc tat");
        }
    }
    
    public void napTien(String tenTK){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten tai khoan: ");
        String tk1 = scanner.nextLine();
        
        if(!timkiem(tk1)){
            System.out.println("Tai khoan khong ton tai!");
            return;
        } 

        System.out.print("Nhap so tien muon nap: ");
        double coin = scanner.nextDouble();
        if(coin < 5000){
            System.out.println("So tien nap vao qua nho");
        } else {
            System.out.print("Nap tien thanh cong");
            double tgconthua = getThoiGian() + 1.0 * coin*60/8000;
            setThoiGian(tgconthua);
            setDoanhThu(getDoanhThu() + coin);
            if(getPoint() >= 5 ){
                System.out.print("Ban duoc tang 1 chai nuoc!");
                setPoint(0);
            } else {
                setPoint(getPoint() + 1);
            }
        }
        
    }
    
    public void suaTaiKhoan(String tenTK,String mkTK){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhap ten tai khoan: ");
        String tk2 = scanner.nextLine();
        
        if(!timkiem(tk2)){
            System.out.println("Ten tai khoan khong ton tai!");
        } else {
            System.out.println("Nhap thong tin moi:");
            System.out.print("Ten tai khoan: ");
            String newTenTK = scanner.nextLine();
            System.out.print("Mat khau: ");
            String newMkTK = scanner.nextLine();

            setTenTK(newTenTK);
            setMkTK(newMkTK);
            System.out.println("Sua tai khoan thanh cong!");
        }
    }
    public String tongKet(){
        return "Tong doanh thu: " + doanhthu;
    }
    public String thongKe(){
        return "So luong may dang duoc su dung: " + idComputer +
                "So luong may tinh con trong: " + (20-idComputer);
    }
    public boolean timkiem(String tenTK){
        if (tenTK.equals(getTenTK())) {
            return true;
        } else {
            return false;
        }
    }
    @Override
    public void inThongTin(){
        System.out.println("Danh sách tài khoản:");
        for (Infor tk : danhSachTaiKhoan) {
            super.inThongTin();
        }
    }    
}
