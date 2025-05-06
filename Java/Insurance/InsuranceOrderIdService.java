package Insurance;

import java.util.Optional;

public class InsuranceOrderIdService {
    private final InsuranceOrderIdGenerator generator;

    public InsuranceOrderIdService(InsuranceOrderIdGenerator generator) {
        this.generator = generator;
    }

    public Optional<String> generateOrderId() {
        String orderId = generator.generateOrderId();
        if (orderId.length() != 4) {
            throw new RuntimeException("OrderId length should be 4 characters => " + orderId);
        }
        return Optional.of(orderId);
    }
}
