/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labth1;

/**
 *
 * @author LENOVO
 */
public class Vehicle {
    String loaixe;
    int maxe,dungtich,trigia, thuexe;

    public Vehicle() {
    }

    public Vehicle(String loaixe, int maxe, int dungtich, int trigia, int thuexe) {
        this.loaixe = loaixe;
        this.maxe = maxe;
        this.dungtich = dungtich;
        this.trigia = trigia;
        this.thuexe = thuexe;
    }

    public String getLoaixe() {
        return loaixe;
    }

    public void setLoaixe(String loaixe) {
        this.loaixe = loaixe;
    }

    public int getMaxe() {
        return maxe;
    }

    public void setMaxe(int maxe) {
        this.maxe = maxe;
    }

    public int getDungtich() {
        return dungtich;
    }

    public void setDungtich(int dungtich) {
        this.dungtich = dungtich;
    }

    public int getTrigia() {
        return trigia;
    }

    public void setTrigia(int trigia) {
        this.trigia = trigia;
    }

    public int thuexe(){
        int thuexe;
        if(dungtich <100) thuexe =(int) (trigia*0.01);
        else if (dungtich >= 100 && dungtich<=200) thuexe = (int) (trigia * 0.03);
        else thuexe = (int) (trigia * 0.05);
        return thuexe;
    }
    
    @Override
    public String toString() {
        return "Vehicle{" + "loaixe=" + loaixe + ", maxe=" + maxe + ", dungtich=" + dungtich + ", trigia=" + trigia + ", thuexe=" + thuexe + '}';
    }
 void inThuecuaxe(){
        System.out.printf("%5d %-20s %5d %10.2f %10s %8.5f \n ", loaixe, maxe,dungtich,trigia,thuexe);
    }

}

