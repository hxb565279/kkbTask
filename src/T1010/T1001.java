package T1010;

import java.util.Scanner;

public class T1001 {
    public static void main(String[] args) {
        //判断输入类型，类型错误不接受输入
        Scanner input=new Scanner(System.in);
        System.out.println("请输入一个数字:");
        if(input.hasNextInt()){
             int  i=input.nextInt();
        }else {
            System.out.println("你输入的是个锤子");
        }
        System.out.println("请输入一个Byte类型的数字");
        if(input.hasNextByte()){
            int j=input.nextByte();
        }else {
            System.out.println("你在输入锤子");
        }
    }
}
