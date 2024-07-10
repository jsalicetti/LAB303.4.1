import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
// part one
                int x = 7;
                System.out.println(x < 10 ? "Less than 10" : "");

                x = 15;



// part two
        int y = 7;

        if (y < 10) {
            System.out.println("Less than 10");
        } else {
            System.out.println("Greater than 10");
        }

        y = 15;


        
      // part three
         int z = 15;
                checkAndPrint(z);

                z = 50;
               
      
        
                if (z < 10) {
                    System.out.println("Less than 10");
                } else if (z < 20) {
                    System.out.println("Between 10 and 20");
                } else {
                    System.out.println("Greater than or equal to 20");
                }
            }

    private static void checkAndPrint(int z) {


        // part four
                int x = 15;
        System.out.println((x >= 10 && x <= 20) ? "In range" : "Out of range");

                x = 5;

   // part five


                Scanner scanner = new Scanner(System.in);
                System.out.print("Enter the score: ");
                int score = scanner.nextInt();

                if (score < 0 || score > 100) {
                    System.out.println("Score out of range");
                } else if (score >= 90 && score <= 100) {
                    System.out.println("Grade: A");
                } else if (score >= 80 && score <= 89) {
                    System.out.println("Grade: B");
                } else if (score >= 70 && score <= 79) {
                    System.out.println("Grade: C");
                } else if (score >= 60 && score <= 69) {
                    System.out.println("Grade: D");
                } else {
                    System.out.println("Grade: F");
                }

                scanner.close();



        // part six
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter a number 1-7");
        int day = scanner1.nextInt();

        switch (day){
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
            default:
                System.out.println("Out of range");
                break;
        }


        // part seven

        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter filling status: (ex. Single, Married, Head)");
        String status = scanner2.nextLine();
        if(status.equals("Married")){
            System.out.println("Are you filling Jointly or Separate");
            status = scanner2.nextLine();
        }

        status = status.toLowerCase();
        System.out.println("What is your yearly income?");
        int income = scanner2.nextInt();

        System.out.println(printTaxRate(status, income));
    }

    public static double printTaxRate(String status, int income){

        double result =0;

        int[] arr = getStatusArr(status);
        if(income >= 0 && income <= arr[0]){
            result = income * .10;
        }else if(income > arr[0] && income <= arr[1]){
            result = income * .15;
        }else if(income > arr[1] && income <= arr[2]){
            result = income * .25;
        }else if (income > arr[2] && income <= arr[3]){
            result = income * .28;
        }else if(income > arr[3] && income <= arr[4]){
            result = income * .33;
        }else if(income > arr[4]){
            result = income * .35;
        }else{
            System.out.println("Out of range");
            result = 0;
        }

        return result;
    }


    public static int[] getStatusArr(String status){
        int[] arr;

        int[] singleArr = {8350, 82250, 171550, 372950};
        int[] jointlyArr = {16700, 67900, 137050, 208850, 372950};
        int[] separateArr = {8350, 33950, 68525, 104425, 186475};
        int[] headArr = {11950, 45500, 117450, 190200, 372950};

        switch (status){
            case "single":
                arr = singleArr;
                break;
            case "jointly":
                arr = jointlyArr;
                break;
            case "separate":
                arr=separateArr;
                break;
            case "head":
                arr=headArr;
                break;
            default:
                arr = null;
                break;
        }

        return arr;
    }
}




