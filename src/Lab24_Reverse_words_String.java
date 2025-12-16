import java.util.Scanner;

public class Lab24_Reverse_words_String {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Sentence");
        String sentence = sc.nextLine();
        Lab24_Reverse_words_String obj = new Lab24_Reverse_words_String();
        obj.reverseString(sentence);
    }
    public void reverseString(String sentence){
        String revSent="";
        String[] words = sentence.split(" ");
        for(int i=0;i<words.length;i++){
            words[i] = reverse(words[i]);
        }
        revSent = String.join(" ",words);
        System.out.println(revSent);
    }

    public String reverse(String reverseStr) {
        String rStr = "";
        for (int i = reverseStr.length()-1; i>=0;i--) {
            rStr = rStr + reverseStr.charAt(i);
        }
        return rStr;
    }

}


