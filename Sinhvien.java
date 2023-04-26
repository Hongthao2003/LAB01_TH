/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labth1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author LENOVO
 */
public class Sinhvien {
    private String maSV, hoTen;
    

    public Sinhvien() {
    }

    public Sinhvien(String maSV, String hoTen) {
        this.maSV = maSV;
        this.hoTen = hoTen;
    }

    public String getMaSV() {
        return maSV;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    @Override
    public String toString() {
        return "Sinhvien{" + "maSV=" + maSV + ", hoTen=" + hoTen + '}';
    }
     private ArrayList<Sinhvien> svn = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void in_sv(){
        for (Sinhvien sinhVien : svn) {
            System.out.println(sinhVien.toString());
        }
    }
    
    public List<Sinhvien> nhapthongtinsv(){
        List<Sinhvien> dsSV = new ArrayList<>();
        System.out.println("Nhap thong tin cua sinh vien");
        
        while(true){
            System.out.println("Nhap ma sinh vien: ");
            String maSV = sc.nextLine();
            
            System.out.println("Nhap ho ten sinh vien: ");
            String hoTen = sc.nextLine();
            
            if(maSV.isEmpty()||hoTen.isEmpty()){
                System.out.println("Nhap thanh cong");
                break;
            }
            Sinhvien sv = new Sinhvien(maSV, hoTen);
        }
        return dsSV;
    }
        public int getSoLuongSV(){
        return svn.size();
    }
        }
