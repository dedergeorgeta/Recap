package algorithms;

public class CountVowel {
    public static void main(String[] args) {
        String world = "afara ploua";
        int count = 0;
        for (int i = 0; i < world.length(); i++) {
            if(world.charAt(i) == 'a' ||
            world.charAt(i) == 'e' ||
            world.charAt(i) == 'i' ||
            world.charAt(i) == 'o' ||
            world.charAt(i) == 'u' ) {
                count++;
            }
        }
        System.out.println("Count of vowels is " + count);
    }
}
