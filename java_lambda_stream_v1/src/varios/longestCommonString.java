package varios;

public class longestCommonString {
    public static String longestCommonPrefix(String[] strs) {
        int longest = strs[0].length();
        // find the length of the shortest string in strs
        for(int i=1; i<strs.length; i++) {
            if(strs[i].length()<longest) longest = strs[i].length();
        }

        if(longest==0)return"";

        for(int i = 0; i < longest; i++) {
            for(int j = 1; j < strs.length; j++ ) {
                if(strs[0].charAt(i)!=strs[j].charAt(i)) {
                    return strs[0].substring(0,i);
                }
            }
        }
        return strs[0].substring(0,longest);
    }

    public static void main(String[] args) {
        String [] ar = {"reflower","flow","flight"};
        System.out.println(longestCommonPrefix(ar));
    }
}
