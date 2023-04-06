public class StringUlits {
    private static String String;
    public StringUlits(String string) {
        String = string;
    }

    /**
     * Converts String to PigLatin
     * @return Returns String but ins PigLatin
     */
    public static String toPigLatin() {
        String delims = "[ ,.?!;:-]+", end, start, startRep, endRep,
                startBeg, endBeg, toBeReturned;
        String[] tokens = String.split(delims);
        for(int i = 0; i < tokens.length; i++)
        {
            if(!containsVowel(tokens[i]))
            {
                tokens[i] += "ay";
            }
            else if(beginsWithVowel(tokens[i]))
            {
                tokens[i] += "yay";
            }
            else if(containsVowel(tokens[i]) && !beginsWithVowel(tokens[i]))
            {
                for(int j = 0; j < tokens[i].length(); j++)
                {
                    if(beginsWithVowel(tokens[i].substring(j)))
                    {
                        start = tokens[i].substring(0, j);
                        end = tokens[i].substring(j, tokens[i].length());

                        if(Character.isUpperCase(tokens[i].charAt(0)))
                        {
                            endRep = String.valueOf(Character.
                                    toUpperCase(end.charAt(0)));
                            endBeg = String.valueOf(end.charAt(0));
                            startRep = String.valueOf(Character.
                                    toLowerCase(start.charAt(0)));
                            startBeg = String.valueOf(start.charAt(0));

                            end = end.replace(endBeg, endRep);
                            start = start.replace(startBeg, startRep);

                            start.replaceFirst(start, String.valueOf(
                                    Character.toLowerCase(start.charAt(0))));
                        }
                        tokens[i] = end + start + "ay";
                        break;
                    }
                }
            }
        }
        String returned = "";
        for(int i = 0; i < tokens.length; i++)
        {
            returned = returned + tokens[i] + " ";
        }
        return returned;
    }

    /**
     * Check if String is a Palindrome
     * @return Returns if String is a Palindrome true=yes false=no
     */
    public static boolean isPalindrome() {
        String rev = "";
        boolean ans = false;

        for (int i = String.length() - 1; i >= 0; i--) {
            rev = rev + String.charAt(i);
        }

        // Checking if both the strings are equal
        if (String.equals(rev)) {
            ans = true;
        }
        return ans;
    }

    /**
     * Reverses String
     * @return The reverse of String
     */
    public static String reverse ()
    {
        String nstr="";
        for (int i=0; i<String.length(); i++)
        {
            char ch;
            ch= String.charAt(i);
            nstr= ch+nstr;
        }
        return nstr;
    }

    /**
     * Converts String to shorthand
     * @return Returns a shorthand version on String but with no vowels and changes "and" with "&", "to" with "2", "you" with "U", and "for" with "4"
     */
    public static String shorthand(){
        String strOutput = "";
        String[][] replacements = {
                {"and", "&"},
                {"you", "U"},
                {"for", "4"},
                {"a", ""},
                {"e", ""},
                {"i", ""},
                {"o", ""},
                {"u", ""},
                {"A", ""},
                {"E", ""},
                {"I", ""},
                {"O", ""},
                {"U", ""},
        };
        for(String[] replacement: replacements) {
            strOutput = strOutput.replace(replacement[0], replacement[1]);
        }





        return strOutput;
    }

    /**
     * Checks if a string begins with a vowel
     * @param tokens The string you want to check
     * @return If tokens begins with a vowel
     */
    private static boolean beginsWithVowel(String tokens) {
        if(tokens.charAt(0) == 'a'
                || tokens.charAt(0) == 'e'
                || tokens.charAt(0) == 'i'
                || tokens.charAt(0) == 'o'
                || tokens.charAt(0) == 'u'
                || tokens.charAt(0) == 'A'
                || tokens.charAt(0) == 'E'
                || tokens.charAt(0) == 'I'
                || tokens.charAt(0) == 'O'
                || tokens.charAt(0) == 'U')
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    /**
     * Checks If a string to see if it has a vowel in it
     * @param tokens The string you want to check
     * @return If a string to see if it has a vowel in it
     */
    private static boolean containsVowel(String tokens) {
        for(int i = 0; i < tokens.length(); i++)
        {
            if(tokens.charAt(i) == 'a'
                    || tokens.charAt(i) == 'e'
                    || tokens.charAt(i) == 'i'
                    || tokens.charAt(i) == 'o'
                    || tokens.charAt(i) == 'u'
                    || tokens.charAt(i) == 'A'
                    || tokens.charAt(i) == 'E'
                    || tokens.charAt(i) == 'I'
                    || tokens.charAt(i) == 'O'
                    || tokens.charAt(i) == 'U')
            {
                return true;
            }
            else if(i == tokens.length() - 1)
            {
                return false;
            }
        }
        return false;
    }
}
