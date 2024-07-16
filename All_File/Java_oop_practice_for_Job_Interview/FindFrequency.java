public class FindFrequency {
    public static void main(String[] args) {
        String str="this is santu";
        char[] ch=str.toCharArray();
        
        String s1="s";
        char[] ch1=s1.toCharArray();
        int count=0;
        for(int i=0;i<ch.length;i++){
            for(int j=0;j<ch.length;i++){
                if(ch[0]==ch[j]){
                    count++;
                }
            }
        }
        if(count>0){
            System.out.println(count);
        }
    }
}
