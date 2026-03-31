class Solution {
    public String generateString(String str1, String str2) {
        int n = str1.length();
        int m = str2.length();

        int length = n + m - 1;
        char[] word = new char[length];
        boolean[] change = new boolean[length];

        for (int i = 0; i < length; i++) {
            word[i] = '1';
        }

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'T') {
                int tem = i;

                for (int j = 0; j < m; j++) {
                    if (word[tem] != '1' && word[tem] != str2.charAt(j)) {
                        return "";
                    }
                    word[tem] = str2.charAt(j);
                    tem++;
                }
            }
        }

        for (int i = length - 1; i >= 0; i--) {
            if (word[i] == '1') {
                word[i] = 'a';
                change[i] = true;
            }
        }

        for (int i = 0; i < n; i++) {
            if (str1.charAt(i) == 'F') {

                boolean equal = true;
                int tem = i;
                for (int j = 0; j < m; j++) {
                    if (word[tem] != str2.charAt(j)) {
                        equal = false;
                        break;
                    }
                    tem++;
                }

                if (equal) {

                    boolean hua = false;
                    for (int j = i + m - 1; j >= i; j--) {
                        if (change[j]) {
                            word[j] = 'b';
                            change[j] = false;
                            hua = true;
                            break;
                        }
                    }

                    if (!hua) {
                        return "";
                    }
                }
            }
        }
        return new String(word);
    }
}