package jpmc;

import java.util.ArrayList;
import java.util.List;

class HappyNumber {
    public boolean isHappy(int n) {
        List<Integer> list = new ArrayList<>();
        while(true) {
            int sum = 0;
            System.out.println(n);
            while(n > 0) {
                int rem = n % 10;
                //System.out.println(rem);
                sum += (rem * rem);
                //System.out.println(sum);
                n = n / 10;
                //System.out.println(n);
            }
            n = sum;
            if (sum == 1) return true;

            if (hasContainsSum(list, sum)) return false;
            list.add(sum);
        }
    }

    private boolean hasContainsSum(List<Integer> list, int sum) {
        return list.contains(sum);
    }

    public static void main(String[] args) {
        HappyNumber happyNumber = new HappyNumber();

        System.out.println(happyNumber.isHappy(16));
    }
}