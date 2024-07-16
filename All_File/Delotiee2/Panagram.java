public class Panagram {
    
    public static void main(String[] args) {
        String str = "AbcdefghijklmnopqrstuvwxyzAA";
        String str2=str.toLowerCase();
        if (str2.length() < 26) {
    System.out.println("no Panagram");
} else {
    
    for (char ch = 'a'; ch < 'z'; ch++) {
        if (str2.indexOf(ch) < 0) {
            System.out.println("not Panagram");
            break;
        }

    }
    System.out.println("panagram");
}
        
    }
}
