// from https://exercism.org/tracks/java/exercises/football-match-reports

public class FootballMatchReports {    
    public static String onField(int shirtNum) {
        switch (shirtNum) {
            case 1:
                return "goalie";
            case 2:
                return "left back";
            case 3:
                return "center back";
            case 4:
                return "center back";
            case 5:
                return "right back";
            case 6:
                return "midfielder";
            case 7:
                return "midfielder";
            case 8:
                return "midfielder";
            case 9:
                return "left wing";
            case 10:
                return "striker";
            case 11:
                return "right wing";
            default:
                throw new IllegalArgumentException("Wrong shirt number. It should be between 1 and 11");
        }
    }
}

// I learned about the switch statement in Java. It is similar to the switch statement in JavaScript, 
// so not a huge learning curve.