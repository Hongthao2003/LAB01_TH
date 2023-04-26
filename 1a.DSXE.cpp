/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labth1;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class DSXE {
    ArrayList<Vehicle> ds = new ArrayList<>();
    Scanner sc = new Scanner(System.in);
    
    public void Nhap(){
        while (true){
            System.out.println("Nhập loại xe:");
            String loaixe = sc.nextLine();
            System.out.println("Nhập mã xe:");
            int maxe = sc.nextInt();
            System.out.println("Nhập dung tích xe :");
            int dungtich = sc.nextInt();
            System.out.println("Nhập trị giá xe: ");
            int trigia = sc.nextInt();
            
            Vehicle Vehicle = new Vehicle(loaixe, maxe, dungtich, trigia, maxe);
            ds.add(Vehicle);
            
            System.out.println("Nhập xe tiếp theo :(yes or no )");
            sc.nextLine();
            if(sc.nextLine().equals("no")){
                break;
            }
        }
    }
    public void Xuat(){
        for(Vehicle c:ds){
            System.out.println(c.toString());
            
        }
    }
    public void thuexe(double trigia, int dungtich){
        int thuexe;
        if(dungtich <100) thuexe =(int) (trigia*0.01);
        else if (dungtich >= 100 && dungtich<=200) thuexe = (int) (trigia * 0.03);
        
        else thuexe = (int) (trigia * 0.05);
    
            System.out.println("Thuế xe cần nộp là :" +thuexe);
    }
}

