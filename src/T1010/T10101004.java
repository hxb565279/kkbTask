package T1010;

import java.util.Scanner;

public class T10101004 {
    public static void main(String[] args) {
        //人工智能
        //Ai();
        //1、计算应缴金额
        //oney();
        //2、计算该年该月天数
        //days();
        for(int i=0;i<3;i++){
            money();
        }
    }
    public static void Ai(){
        System.out.println("人工智障聊天开始：(输入”结束聊天“+回车结束聊天)");       //提示信息
        Scanner input=new Scanner(System.in);                                 //创建Scanner对象用于获取输入的数据
        String question;                                                       //定义变量用于存储输入的数据
        while (true){
            question = input.next();
            if(question.equals("结束聊天")){
                System.out.println("再见哟！");
                break;                                                          //跳出循环
            }
            //      replace用法：
            //      字符串.replace("字符串1","字符串2")；
            //      功能将字符串里面的字符串1替换为字符串2，如果字符串里面没有字符串1则不进行替换
            question = question.replace("吧","");            //将输入的字符串中的”吧“替换成空字符串
            question = question.replace("吗","");            //
            question = question.replace("我","我也");
            question = question.replace("嘿嘿嘿","你笑个锤子");
            question = question.replace("你是","我是");
            System.out.println(question);
        }
    }
    public static void money(){
        System.out.println("请输入金额和您的积分，金额和积分以空格分开，以回车结束");
        Scanner input=new Scanner(System.in);
        double money=input.nextDouble();                    //购物车金额
        int integral=input.nextInt();                //积分
        if(integral<2000){
            System.out.println("应缴金额："+money*0.9);
        }else if(integral>=2000&&integral<4000){
            System.out.println("应缴金额："+money*0.8);
        }else if(integral>=4000&&integral<8000){
            System.out.println("应缴金额："+money*0.75);
        }else if(integral>=8000){
            System.out.println("应缴金额："+money*0.7);
        }
    }
    public static void days(){
        System.out.println("请输入年份和月份，年份和月份以空格分开，以回车结束");
        Scanner input=new Scanner(System.in);
        int[] mo={31,0,31,30,31,30,31,31,30,31,30,31};
        int year=input.nextInt();
        int month=input.nextInt();
        if(month>=0&&month<=12){
            if(month==2){
                if(year%400==0||(year%4==0&&year%100!=0)){
                    System.out.println("本月有29天");
                }else {
                    System.out.println("本月有28天");
                }
            }else {
                System.out.println("本月有"+mo[month-1]+"天");
            }
        }else{
            System.out.println("您输入的格式有问题");
        }


    }
}

