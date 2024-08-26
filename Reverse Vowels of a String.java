class Solution {
    public String reverseVowels(String s) {
        List<Character> list=new ArrayList<>();
        char[] ch=s.toCharArray();
        for(int i=0;i<ch.length;i++){
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u' || ch[i]=='A' || ch[i]=='E'|| ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U')
            list.add(ch[i]);
        }
        int j=0;
        for(int i=ch.length-1;i>-1;i--){
            if(ch[i]=='a' || ch[i]=='e'|| ch[i]=='i'|| ch[i]=='o'|| ch[i]=='u' || ch[i]=='A' || ch[i]=='E'|| ch[i]=='I'|| ch[i]=='O'|| ch[i]=='U')
            ch[i]=list.get(j++);
        }
        String res="";
        for(int i=0;i<ch.length;i++)
        res+=ch[i];
        return res;
    }
}
