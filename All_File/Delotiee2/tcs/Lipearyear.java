public class Lipearyear{
    public static void main(String[] args) {
    
        
        int year=400;

        if (year % 100 == 0) {
            System.out.println("This is lipearyear");
        } else if (year % 4 == 0) {
            System.out.println("Obisly it is lipear year");
        } else if (year % 400 == 0) {
            System.out.println("Ohh this is lipear year");
        } else {
            System.out.println("this is not lipear year");
        }

    }
}