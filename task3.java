import java.util.Scanner;

class Grade{
    public String grade(int avgpercentage){
        switch (avgpercentage / 10) {
            case 10:
                return "A+";
            case 9:
                return "A";
            case 8:
                return "B+";
            case 7:
                return "B";
            case 6:
                return "C";
            case 5:
                return "D";
            default:
                return "F";
        }
    }
}

public class task3{
    public static void main(String[] args){
        Grade g = new Grade();
        Scanner sc = new Scanner(System.in);

        //Taking input of how many subjects are there
        System.out.println("Enter the amount of subjects");
        int testsubs = sc.nextInt();
        int testmarks = 0;

        
        for (int i = 0; i < testsubs; i++) {
            System.out.println("Enter the marks obtained in subject " + (i + 1));
            int marks = sc.nextInt();
            testmarks += marks;
        }

        
        int avgpercentage = testmarks / testsubs;

        
        String Grade = g.grade(avgpercentage);

        
        System.out.println("Total marks obtained :- " + testmarks);
        System.out.println("Percentage obtained :- " + avgpercentage+"%");
        System.out.println("Grade obtained :- " + Grade);

        sc.close();

    }
}