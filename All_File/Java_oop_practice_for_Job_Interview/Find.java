public class Find {
    public static void main(String[] args) {
        

        String str="this is santu";
        char[] ch=str.toCharArray();

        for(int i=0;i<ch.length;i++){
            int index=i;
                    int count=0;
                    
            for(int j=0;j<ch.length;j++){
                if(j<i && ch[j]==ch[i]){
             //       count++;
                    break;

                }
                if(ch[index]==ch[j]){
   count++;
                }
            }

            if(count>0){
                System.out.println(count);
            }
        }
    }
}
