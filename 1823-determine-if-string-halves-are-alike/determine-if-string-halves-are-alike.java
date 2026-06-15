class Solution {
    public boolean halvesAreAlike(String s) {
        String a = s.substring(0, s.length() / 2);
        String b = s.substring(s.length()/2);
        int ch1 = 0;
        int ch2 = 0;
        for (int i = 0; i < a.length(); i++) {
             ch1 = ch1 + value(a.charAt(i));
             ch2 = ch2 + value(b.charAt(i));
        }
        return ch1 == ch2;
    }

    int value(char ch) {
        if (ch == 'a')
            return 1;
        if (ch == 'e')
            return 1;
        if (ch == 'i')
            return 1;
        if (ch == 'o')
            return 1;
        if (ch == 'u')
            return 1;
        if (ch == 'A')
            return 1;
        if (ch == 'E')
            return 1;
        if (ch == 'I')
            return 1;
        if (ch == 'O')
            return 1;
        if (ch == 'U')
            return 1;
        return 0;

    }
}