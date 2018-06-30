package ir.meandme.persianviews;

/**
 * Created by Mostafa on 11/4/2016.
 */
public class FormatHelper {
    private static String[] persianNumbers = new String[]{"۰", "۱", "۲", "۳", "۴", "۵", "۶", "۷", "۸", "۹"};

    public static String toPersianNumber(String text) {
        if (text.isEmpty())
            return "";
        String out = "";
        int length = text.length();
        for (int i = 0; i < length; i++) {
            char c = text.charAt(i);
            if ('0' <= c && c <= '9') {
                int number = Integer.parseInt(String.valueOf(c));
                out += persianNumbers[number];
            } else if (c == '٫') {
                out += '،';
            } else {
                out += c;
            }

        }
        return out;
    }


    public static String priceFormatHelper(String str){

        if (str.length()>0) {
            str = str.replace(",","");
            str = toPersianNumber(str);
            String out = "";
            int counter = 0;
            for (int i = str.length()-1; i >=0; i--,counter++) {
                char c = str.charAt(i);
                if (counter==3){
                    out = "," + out;
                    out = c + out;
                    counter=0;
                }
                else out = c + out;
            }
            return out;
        }
        else return "";

    }

}