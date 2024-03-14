//Check whether entered year is Leap-Year or Not
/*
1.Using if-else statement
2.Using Ternory Operater
3.Using inbuilt method
*/
class Leapyear{
    public static void leapYear(int year){
      /*   boolean is_leap_year=false;
        if(year%4==0){
            is_leap_year=true;
            if(year%100==0){
                if(year%400==0)
                is_leap_year=true;
                else
                is_leap_year=false;
            }
        }
        else{
            is_leap_year=false;
        }
if(!is_leap_year){
    System.out.println(year+" is Non leap year");
}else{
    System.out.println(year+" is Leap year");
}
    }*/


 //Using Scanner Class   
   /*  if(year%4==0&&year%100!=0||year%400==0){
        System.out.println("Leap Year");
    }
    else{
        System.out.println("Non leap year");

    }*/

    //Using ternary operator
    boolean is_leap_year=false;
    is_leap_year=(year%4==0&&year%100!=0||year%400==0)?true:false;
    if(!is_leap_year){
        System.out.println(year+" Non leap year");
    }else{
System.out.println(year+" leap Year");
    }

}

    public static void main(String[] args) {
        leapYear(2000);
        leapYear(2002);
    }
}
