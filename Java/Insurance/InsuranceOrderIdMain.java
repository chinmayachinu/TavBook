package Insurance;


public class InsuranceOrderIdMain {
    public static void main(String[] args) {
        String orderId = getOrderId();
        System.out.println(orderId);
    }

    private static String getOrderId() {
        var generator = new InsuranceOrderIdGenerator("1", "2", "3");
        try {
            var service = new InsuranceOrderIdService(generator);
            return service.generateOrderId().get();
        } catch (Exception e) {
            extracted(e);
            return "";
        }
    }

    private static void extracted(Exception e) {
        throw new RuntimeException(e.getMessage());
    }
}

