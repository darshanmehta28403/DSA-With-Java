import java.util.*;

class Solution {
    public int compress(char[] chars) {
        int count = 0;
        char[] res = new char[10];
        int flag = 0;

        for (int i = 0; i < chars.length; i++) {
            for (int j = i; j < chars.length; j++) {
                if (res != null) {
                    for (int j2 = 0; j2 < res.length; j2++) {
                        if(res[j2] == chars[j]){
                            flag = 1;
                            continue;
                        }
                    }
                }
                if(flag == 1){
                    continue;
                }
                else{
                    if(chars[j] == chars[i]){
                        count++;
                    }
                }
            }
            if(flag == 1){
                continue;
            }
            else{
                
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        char[] chars = new char[10];
        chars[0] = 'a';
        chars[1] = 'b';
        chars[2] = '*';
        chars[3] = 'b';
        chars[4] = 'a';
        chars[5] = 'b';
        chars[6] = 'a';
        chars[7] = '*';
        chars[8] = 'a';
        chars[9] = 'a';

        Solution s1 = new Solution();
        s1.compress(chars);
    }
}