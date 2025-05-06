package Insurance;

import java.util.Random;

public class InsuranceOrderIdGenerator {
    private final String authkey;
    private final String bn;
    private final String pincode;

    public InsuranceOrderIdGenerator(String authkey, String bn, String pincode) {
        this.authkey = authkey;
        this.bn = bn;
        this.pincode = pincode;
    }

    public String generateOrderId() {
        return this.authkey + this.bn + this.pincode + generateRandomNumber();
    }

    private String generateRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(12);
        return String.valueOf(randomNumber);
    }

}
