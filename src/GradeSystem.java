

public class GradeSystem {
    public static void main(String[] args) {

        int score;
        score = 97;

        String grade;

        switch(score / 10) {
            case 10:
                grade = "A+";
                break;
            case 9:
                grade = "A";
                break;
            case 8:
                grade = "B";
                break;
            case 7:
                grade = "C";
                break;
            case 6:
                grade = "D";
                break;
            default :
                grade = "F";
                break;
        }
        System.out.println("Your grade : " + grade);
    }
}
