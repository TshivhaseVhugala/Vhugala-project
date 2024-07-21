import java.util.Scanner;


public class Main
{
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter student marks");
        
        double marks = sc.nextDouble();
        
        String achievement = "";
        
        if (marks>=80) {
            achievement = "level 7-outstanding";
            
        }
        
        else if (marks>=70){
            achievement = "level 6-meritorious";
        }
        else if (marks>=60){
            achievement = "level 5-substential";
        }
        else if (marks>=50){
            achievement = "level 4-moderate";
        }else if (marks>=40){
            achievement = "level 3-adequate";
        }
        else if (marks>=30){
            achievement = "level 2-elementary";
        }
        else{
            achievement = "level 1-not achieved";
        }
        
        System.out.println("achievement:" + achievement);
        }
        
        
        
    }

