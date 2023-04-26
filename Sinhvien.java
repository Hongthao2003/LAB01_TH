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
    
        }
