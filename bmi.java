package cliApp;

import java.util.Scanner;

public class bmi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("이름을 입력해주세요 : ");
        String name = sc.next();
        System.out.println(name + "님 키(cm)를 입력해 주세요 : ");
        int height = sc.nextInt();
        System.out.println(name + "님의 체중(kg)을 입력해주세요 : ");
        int weight = sc.nextInt();
        double myBmi =(double) weight / Math.pow(height * 0.01,2);
        String msg ="";
        if(myBmi >20) {
            System.out.println("저체중입니디");
        }else if (myBmi < 20 && myBmi <=25) {
            System.out.println("정상입니다");
        } else if (myBmi >= 25 && myBmi <30) {
            System.out.println("과체중입니다.");
        } else {
            System.out.println("비만입니다.");
        }
        System.out.printf(
                "%s님의 BMI 수치는 %.2f 입니다.\n%s",
                name,myBmi,msg
        );

    }
}
