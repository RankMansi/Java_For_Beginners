import java.util.*;

class consonants_vowels {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a line:");
        String str = scan.nextLine();
        int vowels=0;
        int consonants=0;
        str = str.toLowerCase();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowels = vowels + 1;
            }
            else {
                consonants = consonants + 1;
            }
        }
        System.out.println("Vowels is:" + vowels);
        System.out.println("Consonants is:" + consonants);
    }
}
