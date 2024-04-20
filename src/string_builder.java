public class string_builder {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder();
        for(char c='a';c<='z';c++)        //O(26) when using StringBuilder else O(n*m) when using String type where n is the string length and m is loop length
        {
            sb.append(c);
        }
        System.out.println(sb);
    }
    
}
