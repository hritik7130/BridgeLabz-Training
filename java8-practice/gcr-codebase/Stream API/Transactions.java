import java.time.LocalDateTime;
import java.util.*;

public class Transactions {
    public static void main(String[] args) {

        List<String> transactionIds = Arrays.asList("TXN101", "TXN102");

        transactionIds.forEach(id ->
            System.out.println(LocalDateTime.now() + " - Transaction: " + id)
        );
    }
}
