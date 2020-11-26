package T1010;

import java.util.Scanner;

public class T1002 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        for(int i=1;i<=5;i++){
            System.out.print("请输入第"+i+"个任意正整数：");
            int n=scan.nextInt();
            System.out.println(huiwen(n)?"此正整数是回文数":"此正整数不是回文数");
        }
        System.out.print("输入一个整数：");
        int n=scan.nextInt();
        System.out.println("此整数的各个位相加等于"+sum(n));
        System.out.print("请输入a的值：");
        int a=scan.nextInt();
        System.out.println();
        System.out.print("请输入b的值：");
        int b=scan.nextInt();
        interchange(a,b);
    }
    public static boolean huiwen(int n){
       String strn=String.valueOf(n);
        int i=0,j=strn.length()-1;
      for (;i!=j&&i<j;i++,j--){
          if(strn.charAt(i)!=strn.charAt(j)){
              return false;
          }
      }
      return true;
    }
    public static int sum(int n){
        int sum = 0;
        while (n!=0){
            sum += n%10;
            n /= 10;
        }
        return sum;
    }
    public static void interchange(int a,int b){
        a+=b;
        b=a-b;
        a=a-b;
        System.out.println("a="+a+",b="+b);
    }
}
