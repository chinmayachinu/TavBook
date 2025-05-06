package jpmc;

class ReverseInteger {
    public int reverse(int x) {


        StringBuilder s = new StringBuilder(String.valueOf(x));
        StringBuilder reverse = s.reverse();


        try{
            if (x < 0) {
                String str1 = reverse.substring(reverse.length()-1);
                String str2 = reverse.substring(0,reverse.length()-1);

                return Integer.parseInt(str1 + str2);
            }

            int rev = Integer.parseInt(reverse.toString());
            return rev;
        } catch (Exception e) {
            return 0;
        }


    }


    public static void main(String[] args) {

        ReverseInteger r = new ReverseInteger();
        System.out.println(r.reverse(-123));

    }
}