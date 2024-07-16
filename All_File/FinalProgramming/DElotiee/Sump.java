public class Sump {
    public static void main(String[] a) {
        int no = 43;
        int count = 0, rem;
        String str;
        String str2 = "";
        while (no > 0) {
            rem = no % 10;
            str = String.valueOf(rem);
            count = count + rem;

            str2 =  str+str2;
            no /= 10;
        }
        System.out.println(count);
        System.out.println(str2);
    }
    
}
