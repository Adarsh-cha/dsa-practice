class Solution {
    public String decodeCiphertext(String encodedText, int rows) {
        int n = encodedText.length();
        int totalCol = n / rows;

        StringBuilder sb = new StringBuilder();

        for (int col = 0; col < totalCol; col++) {
            for (int i = col; i < n; i += (totalCol + 1)) {
                sb.append(encodedText.charAt(i));
            }
        }

        while (sb.length() != 0 && sb.charAt(sb.length() - 1) == ' ') {
            sb.deleteCharAt(sb.length() - 1);
        } 
        return sb.toString();
    }
}