/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labth1;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class test_1a {

    private static int menu_1;
        Scanner sc = new Scanner(System.in);
        public void Nhap(){
             
        }
        
       public static void main(String[]args){
           Vehicle v[]=null;
           int a,n=0, menu;
           boolean flag =true;
           do{
               System.out.println("Menu lua chon chuc nang---------------------------");
               System.out.println("1. Nhập thông tin và tạo các đối tượng xe1, xe2, x3");
               System.out.println("2. Xuất bảng kê khai tiền thuế trước bạ của các xe ");
               System.out.println("3. Thoát");
               System.out.print("Nhap: ");
               
             switch (menu_1){
              case 1: {
                 System.out.print("Nhập số lượng xe bạn muốn khai báo thuế: ");
                    v= new Vehicle[n];
                    for (int i = 0; i < n; i++) {
                        System.out.println("Xe thứ " + (i+1));
                        v[i] = new Vehicle();
                  
                    }
                    break;
              }
                    case 2: {
                    System.out.printf("%5s %5s %5s %10s %10s %8s \n","Mã xe","Chủ xe","Dung tích","Trị giá","mô tả","Thuế");
                    for (int i = 0; i < n; i++) {
                        v[i].thuexe();
                    }
                    break;
                 }
               default:
                   {
                       if (menu_1 == 0) {
                           System.out.println("Thoat chuong trinh");
                       } else {
                           System.out.println("Vui long nhap lai lua chon");
                       }
                   }

            }
        } while (menu_1 != 0);
       
    }
}
