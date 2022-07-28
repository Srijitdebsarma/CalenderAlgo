import java.util.*;

/*
public class Main {
    public static void main(String[] args) {
        Calculate c= new Calculate();
        c.dayfinder(); // Rana Algorithm
    }
}
 */

public class Calculate {
    Scanner Sc= new Scanner(System.in);
    int year;
    int month;
    int day;
    int sum=0;
    public void dayfinder(){
        System.out.println("Give the day:");
        day= Sc.nextInt();
        sum+= day;
        System.out.println("Give the Month:");
        month= Sc.nextInt();
        if(month==10||month==1){
            sum+=1;
        }
        else if(month==2||month==3  month==11){
            sum+=4;
        }
        else if(month==9||month==12){
            sum+=6;
        }
        else if(month==5){
            sum+=2;
        }
        else if(month==6){
            sum+=5;
        }
        else if(month==8){
            sum+=3;
        }
        else if(month==4 month==7){
            sum+=3;
        }
        else{
            System.out.println("You are putting an wrong value");
        }
        System.out.println("Give the year:");
        year=Sc.nextInt();
        int y1 =  year;
        int y2 =  year;
        int y4=y1/100;
        if(y4==16||y4==20||y4==24){
            sum+=6;
        }
        else if(y4==17||y4==21||y4==25){
            sum+=4;
        }
        else if(y4==18||y4==22||y4==14){
            sum+=2;
        }
        else {
            sum+=0;
        }
        int y3 = y2%100;
        sum += (y3%7);
        sum +=(y3/4);
        if(((year % 4 == 0) && (year %100 !=0))  (year%400==0)){
            if(month==1  month==2){
                sum-=1;  // it's a leap year
            }
            else
                sum+=0;
        }
        System.out.println(sum);
        int sum2 = sum%7;
        switch (sum2){
            case 1 :
                System.out.println("Given Day is Sunday");
                return;
            case 2 :
                System.out.println("Given Day is Monday");
                return;
            case 3 :
                System.out.println("Given Day is Tuesday");
                return;
            case 4 :
                System.out.println("Given Day is Wednesday");
                return;
            case 5 :
                System.out.println("Given Day is Thursday");
                return;
            case 6 :
                System.out.println("Given Day is Friday");
                return;
            case 7,0 :
                System.out.println("Given Day is Saturday");
                return;
            default:
                System.out.println("opps! compiler Error");
        }

    }

}
