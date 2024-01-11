public class DrivingTest {
    public static void main(String[] args) {
        int yearBirth = 2004;
        int currentYear = 2024;
        int age = currentYear - yearBirth;

        boolean passedExam = true;

        if ( age < 18 ){
        
             System.out.println("You are not old enough to drive.");

        } else {

             if ( passedExam) {

                System.out.println("Congratulations, you passed your driving test.");

            } else {

             System.out.println("You did`t pass your driving test .");

             }
         }
    }
}