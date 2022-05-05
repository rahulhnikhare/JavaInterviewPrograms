package hackerank;

public class CharacterWithCount {

    public static void main(String[] args) {
        String str = "aaabbc";
//        int count = 1;
//        for(int i = 0; i <str.length();i=i+count){
//            count =1;
//            for(int j = i+1; j<str.length();j++){
//                if(str.charAt(i) == str.charAt(j)){
//                    count = count+1;
//                }
//                else{
//                    break;
//                }
//            }
//            // Print here otherwise you will miss the last group of letters
//            // Also if you just want one line use .print instead of println
//            System.out.print(str.charAt(i)+""+count);
//        }

//        if (str == null || str.length() == 0)
//            return str;

        StringBuilder sb = new StringBuilder();
        int count = 1;
        char currentChar;

        for (int i = 0; i < str.length() - 1; i++) {
            currentChar = str.charAt(i);
            if (currentChar == str.charAt(i+1)) {
                count++;
            } else {
                sb.append(currentChar);
                sb.append(String.valueOf(count));
                count = 1;
            }
        }

        sb.append(str.charAt(str.length()-1));
        sb.append(String.valueOf(count));

        System.out.println(sb.toString());
    }
    }

