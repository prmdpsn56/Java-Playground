package Array;

public class StringRunner {

    String [] daysOfWeek = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};


    public String printingFunction(){
        String dayWithMostChars = "";
        for(String day:daysOfWeek){
                if (day.length()> dayWithMostChars.length()){
                        dayWithMostChars = day;
                }
        }
        return dayWithMostChars;
    }


    public void printInReverse(){
            for (int i=daysOfWeek.length-1;i>=0;i--){
                System.out.println(daysOfWeek[i]);
            }
    }


}
