import java.util.ArrayList;
import java.util.Arrays;

public class StringQuestion {
    //		Interview sorusu
//		Verilen bir metindeki harflerin frekansını bulup yazdıran bir METHOD yazınız.
//		(Büyük harf-küçük harf ayrımına dikkat edilecek)
//		Input = AAABBCDD
//		output = A3B2C1D2
    public static void main(String[] args) {
        String str = "AAABBCDDEEEEE";
        mthd(str);
        numOfChar(str);
    }

    static void mthd(String input) {
      int l=input.length();
       StringBuilder sb=new StringBuilder();
       int count=1;
       for (int i=0;i<l;i++){
           //if i reaches at the end then append all and break the loop
           if(i==l-1){
               sb.append(input.charAt(i)+""+count);
               break;
           }
           //if two successive chars are equal then increase the counter

           if (input.charAt(i)==input.charAt(i+1)){
               count++;
           }
           //else append character with its count
           else{
               sb.append(input.charAt(i)+""+count);
               count=1;
           }
       }
        System.out.println(sb.toString());
    }
    //2.way:
    public static String numOfChar(String str) {
        int l = str.length();
        String newStr = "";
        ArrayList<Character> list = new ArrayList<>();
        for (int i = 0; i < l; i++) {
            int num = 1;
            char each = str.charAt(i);
            if (!list.contains(each)) {
                for (int j = i + 1; j < l; j++) {
                    if (each == str.charAt(j)) {
                        num += 1;
                    }
                }
                list.add(each);
                newStr += "" + (num) + each;
            }
        }
        System.out.println(newStr);
        return newStr;
    }


}


