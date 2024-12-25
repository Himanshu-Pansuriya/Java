import java.util.*;
public class Scoreboard{
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        // -1 for wide  // -2 for no ball  // -3 for wicket

        System.out.println("enter how many over in this match:");
        int n = sc.nextInt();
        int over[][] = new int[n][6];
        int ball = 0 , runs = 0, wicket=0, sixes = 0, fours = 0, extras = 0;

        for(int i=0;i<n;i++){
            for(int j=0;j<6;j++){
            
             System.out.println("enter runs, -1 for wide ,-2 for no ball ,-3 for wicket:");
                 ball = sc.nextInt();
                 if(ball == -3){
                       wicket++;
                 }
                 if(ball == 6){
                    sixes++;
                 }
                 if(ball == 4){
                    fours++;
                 }
                 while(ball == -1 || ball == -2){
                    if(ball == -1){
                        runs++;
                        System.out.println("enter runs, -1 for wide ,-2 for no ball ,-3 for wicket:");
                         ball = sc.nextInt();
                    }
                   else if(ball == -2){
                        runs++;
                        ball = sc.nextInt();
                         if(ball == 6){
                             sixes++;
                 }
                        if(ball == 4){
                             fours++;
                 }
                        runs=runs+ball;
                        System.out.println("enter runs, -1 for wide ,-2 for no ball ,-3 for wicket:");
                         ball = sc.nextInt();
                    }
                    extras++;
                 }                             
                runs = runs + ball ;
           }
       }
           System.out.println("total runs is = "+runs+ " and wicket is = "+wicket);
            System.out.println("Boundries : fours = "+fours+ " sixes = "+sixes);
             System.out.println("extras = "+extras);
    }
}