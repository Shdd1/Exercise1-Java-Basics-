import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

     // Q1:
      /*int weight = 70;
       double height = 1.75;
       double h= height* height;
      double bmi=weight/h;
        System.out.println(bmi);*/

        // another solution
       Scanner scanner = new Scanner(System.in);
        System.out.println("Enter weight in kilograms:");
        double weight = scanner.nextDouble();

        System.out.println("Enter height in meters:");
        double height = scanner.nextDouble();


        double bmi = weight / (height * height);
        System.out.printf("BMI = %.2f", bmi);
        scanner.close();

        //Q2:
        /*double obtained_Marks = 85;
        double total_Marks = 100;
        System.out.println((obtained_Marks/total_Marks)*100+"%");*/

        //Q3
        /*int amount_USD = 100;
        double usd_eur=amount_USD*0.85;
        System.out.println(usd_eur);*/

        //4
        /*Scanner scan=new Scanner(System.in);
        System.out.println("Enter word:");
        String Input=scan.next();
        StringBuilder stb=new StringBuilder();
        stb.append(Input);
        System.out.println("Length of the string:"+Input.length());
        System.out.println("Reversed string:"+stb.reverse());*/

        //Q5
      /* String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(sentence.substring(10,20));*/

        //Q6
        /*String sentance="The quick brown fox jumps over the lazy dog";
        String keyword ="jumps";
        System.out.println(sentance.contains(keyword));*/

        //Q7
        /*String sentence = "The quick brown fox jumps over the lazy dog";
        System.out.println(sentence.replaceFirst("fox","cat"));*/

        //Q8
        /*String str1="Hello";
        String str2 = "hello";
        System.out.println(str1.equalsIgnoreCase(str2));*/





















    }
}