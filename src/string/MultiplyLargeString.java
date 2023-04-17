package string;

public class MultiplyLargeString {
    public static void main(String[] args) {
        multiply("12","12");

    }

    public static void multiply1(String num1, String num2) {
        int m = num1.length();
        int n = num2.length();
        int[] vals = new int[m + n];

//        for (int i = n - 1; i >= 0; --i) {
//            int carry =0;
//            for (int j = m - 1; j >= 0; --j) {
//                int mul = (num1.charAt(i) - '0') * (num2.charAt(i) - '0') + carry+vals[i + j ];
//                //int sum = vals[i + j + 1] + mul;
//               System.out.println("vals[i + j ]->"+vals[i + j ]);
//                System.out.println("vals[i + j+1 ]->"+vals[i + j+1 ]);
//                carry= mul / 10; //carry
//                vals[i+j+1] = mul % 10; // remainder
//            }
//            vals[i+ m]= carry;
//        }

        for(int i=0;i<n;i++){
            int carry =0;
            for(int j=0;j<m;j++){
                int product = (num1.charAt(i) - '0') * (num2.charAt(i) - '0')+ carry+vals[i+j];
                carry = product/10;
                vals[i+j] = product%10;
            }
            vals[i+num1.length()]= carry;

        }

    StringBuilder sb = new StringBuilder();
        for(int val : vals){
            if(sb.length()!=0|| val!=0){
                sb.append(val);
            }
        }
        System.out.println(sb.toString());
    }

    public static String multiply(String num1, String num2) {
        int[] n1 = new int[num1.length()];
        int[] n2 = new int[num2.length()];

        for (int i = 0; i < num1.length(); i++) {
            n1[i] = num1.charAt(num1.length() - 1 - i) - '0';
        }

        for (int i = 0; i < num2.length(); i++) {
            n2[i] = num2.charAt(num2.length() - 1 - i) - '0';
        }

        int[] result = new int[num1.length() + num2.length()];

        for (int i = 0; i < n2.length; i++) {
            int carry = 0;
            for (int j = 0; j < n1.length; j++) {
                int product = n1[j] * n2[i] + carry + result[i + j];
                carry = product / 10;
                result[i + j] = product % 10;
            }
            result[i + n1.length] = carry;
        }

        StringBuilder sb = new StringBuilder();
        int i = result.length - 1;
        while (i > 0 && result[i] == 0) {
            i--;
        }
        while (i >= 0) {
            sb.append(result[i--]);
        }
        System.out.println(sb.toString());
        return sb.toString();
    }
}
