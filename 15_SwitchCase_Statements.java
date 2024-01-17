
class Hello{
    public static void main(String args[]){
        // int n = 7;
        // if(n == 1)
        // System.out.println("Monday");
        // if(n == 2)
        // System.out.println("Tuesday");
        // if(n == 3)
        // System.out.println("Wednesday");
        // if(n == 4)
        // System.out.println("Thrusday");
        // if(n == 5)
        // System.out.println("Friday");
        // if(n == 6)
        // System.out.println("Saturday");
        // if(n == 7)
        // System.out.println("Sunday");


        int n = 7;
        switch(n) {

        case 1:
            System.out.println("Monday");
            break;
        case 2:
            System.out.println("Tuesday");
            break;
        case 3:
            System.out.println("Wednesday");
            break;
        case 4:
            System.out.println("Thrusday");
            break;
        case 5:
            System.out.println("Friday");
            break;
        case 6:
            System.out.println("Saturday");
            break;
        case 7:
            System.out.println("Sunday");
            break;
        default:
                System.out.println("Enter a valid number");
        }

    }
}
