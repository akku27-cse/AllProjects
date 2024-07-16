public class StringP {
    

    public static void main(String[] args) {
        
        String s="my name is SAntu";
        System.out.println("String length" + s.length());
        //uppercase
        System.out.println(s.toUpperCase());
        //lowercase
        System.out.println(s.toLowerCase());
        //find 
        System.out.println(s.indexOf("name"));

        ///java concat()
        String sa="santu";
        String ja="Jana";
        System.out.println(sa.concat( ja));
    }
}
