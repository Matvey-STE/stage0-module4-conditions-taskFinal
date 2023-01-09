package school.mjc.stage0.conditions.finalTask;

public class SeasonDeterminer {
    public void tellTheSeason(int monthNumber) {
        if (monthNumber <= 2 && monthNumber !=0 || monthNumber == 12){
            System.out.println("Winter");
        } else if (monthNumber > 2 && monthNumber <= 5){
            System.out.println("Spring");
        } else if (monthNumber > 5 && monthNumber <= 8){
            System.out.println("Summer");
        } else if (monthNumber > 8 && monthNumber < 12){
            System.out.println("Fall");
        } else {
            System.out.println("Wrong month number");
        }
    }
}
