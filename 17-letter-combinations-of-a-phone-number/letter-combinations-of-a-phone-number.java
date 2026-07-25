class Solution {
    public List<String> letterCombinations(String digits) {
     return pad("", digits);
    }

    ArrayList<String> pad(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        int digit = unprocessed.charAt(0) - '0';

        int offset = (digit - 2) * 3 + (digit > 7 ? 1 : 0);
        int letters = (digit == 7 || digit == 9) ? 4 : 3;

        ArrayList<String> list = new ArrayList<>();

        for (int i = offset; i < offset + letters; i++) {
            char ch = (char) ('a' + i);

            list.addAll(pad(processed + ch, unprocessed.substring(1)));
        }
        return list;
    }
}