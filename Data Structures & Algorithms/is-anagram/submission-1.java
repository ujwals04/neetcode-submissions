class Solution {
    public boolean isAnagram(String s, String t) {
       char sc[]=s.toCharArray();
       char tc[]=t.toCharArray();
       Arrays.sort(sc);
       Arrays.sort(tc);
       if(s.length()==t.length()){
        for(int i=0;i<s.length();i++){
            if(!(sc[i]==tc[i])){
                return false;
            }
       }
       return true;
       }
       return false;
    }
}
