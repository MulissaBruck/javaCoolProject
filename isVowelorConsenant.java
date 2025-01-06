public class isVowelorConsenant {
    public static String isVowelorConsenant(char spell) {

        char[] vowel = { 'a', 'e', 'i', 'o', 'u' };

        spell = Character.toLowerCase(spell);

        for (char sp : vowel) {

            if (sp == spell) {

                return "vowel";
            }
        }
        return "constant";

    }

    public static void main(String[] args) {

        char spell = 'A';

        System.out.println(isVowelorConsenant(spell));
    }
}
