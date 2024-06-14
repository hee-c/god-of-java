package c.string.practice;

public class UseStringMethods {
    public static void main(String[] args) {
        UseStringMethods obj = new UseStringMethods();
        obj.pringWords("The String class represents character strings");
        obj.findString("The String class represents character strings", "string");
        obj.findAnyCaseString("The String class represents character strings", "string");
        obj.countChars("The String class represents character strings", 's');
        obj.printContainWords("The String class represents character stringss", "ss");
    }

    public void pringWords(String string) {
        String[] arr = string.split(" ");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public void findString(String str, String findStr) {
        int index = str.indexOf(findStr);
        System.out.println(index);
    }

    public void findAnyCaseString(String str, String findStr) {
        String lowerStr = str.toLowerCase();
        String lowerFindStr = findStr.toLowerCase();

        System.out.println(lowerStr.indexOf(lowerFindStr));
    }

    public void countChars(String str, char c) {
        char[] chars = str.toCharArray();
        int count = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == c) {
                count++;
            }
        }
        System.out.println(count);
    }

    public void printContainWords(String str, String containWords) {
        String[] arr = str.split(" ");
        for (String s : arr) {
            if (s.contains(containWords)) {
                System.out.println(s);
            }
        }
    }
}
