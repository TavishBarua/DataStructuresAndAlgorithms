package ProblemSolving;

public class FindFirstNonRepeatingCharacter {

    private static int firstNonRepeating(String str) {
        int[] arr = new int[26];

//        for(int i=0;i<=arr.length;i++){
//            arr[i] = -1;
//        }
        for(char c='a'; c<='z';c++){
            arr[c-97] = -1;
        }

        for (int i = 0; i < str.length(); i++) {
            if (arr[str.charAt(i)-97]==-1 ){
                arr[str.charAt(i)-97] = -2;
            }else{
                arr[str.charAt(i)-97] = -3;
            }
        }

        for (int i = 0; i < str.length(); i++) {
            if(arr[str.charAt(i)-97]==-2)
                return i;
        }

        return 0;

    }

    public static void main(String[] args) {
        String str;
        str = "geeksforgeeks";
        //str = "tavish";
        int firstIndex = firstNonRepeating(str);
        if (firstIndex == -1)
            System.out.println("Either all characters are repeating or string is empty");
        else
            System.out.println("First non-repeating character is "+ str.charAt(firstIndex));
    }
}
