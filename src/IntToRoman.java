public class IntToRoman {

    public String toRoman(int num) {
        int[] values = {100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanNum = {"C", "XC", "L", "XL", "X", "IX", "V","IV", "I"};

        String roman = "";

        for (int i = 0; i < values.length; i++) {
            while (num >= values[i]) {
                num -= values[i];
                roman += romanNum[i];
            }
        }
        return roman;
    }
}



