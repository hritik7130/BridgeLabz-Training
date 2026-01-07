import java.util.*;
import java.time.LocalDate;

class Policy {
    String policyNumber;
    String holderName;
    LocalDate expiryDate;

    Policy(String policyNumber, String holderName, LocalDate expiryDate) {
        this.policyNumber = policyNumber;
        this.holderName = holderName;
        this.expiryDate = expiryDate;
    }

    public String toString() {
        return policyNumber + " | " + holderName + " | " + expiryDate;
    }
}

public class CollectionManagementSystem {

    static class InsurancePolicyManager {
        Map<String, Policy> policyMap = new HashMap<>();
        Map<String, Policy> insertionOrder = new LinkedHashMap<>();
        TreeMap<LocalDate, List<Policy>> expiryMap = new TreeMap<>();

        void addPolicy(Policy policy) {
            policyMap.put(policy.policyNumber, policy);
            insertionOrder.put(policy.policyNumber, policy);
            expiryMap.computeIfAbsent(policy.expiryDate, k -> new ArrayList<>()).add(policy);
        }

        Policy getPolicy(String policyNumber) {
            return policyMap.get(policyNumber);
        }

        List<Policy> policiesExpiringIn30Days() {
            LocalDate now = LocalDate.now();
            LocalDate next30 = now.plusDays(30);
            List<Policy> result = new ArrayList<>();

            for (List<Policy> list : expiryMap.subMap(now, true, next30, true).values()) {
                result.addAll(list);
            }
            return result;
        }

        List<Policy> policiesByHolder(String name) {
            List<Policy> result = new ArrayList<>();
            for (Policy p : policyMap.values()) {
                if (p.holderName.equalsIgnoreCase(name)) {
                    result.add(p);
                }
            }
            return result;
        }

        void removeExpiredPolicies() {
            LocalDate today = LocalDate.now();
            Iterator<Map.Entry<String, Policy>> it = policyMap.entrySet().iterator();

            while (it.hasNext()) {
                Policy p = it.next().getValue();
                if (p.expiryDate.isBefore(today)) {
                    it.remove();
                    insertionOrder.remove(p.policyNumber);
                }
            }
        }
    }

    static class VotingSystem {
        Map<String, Integer> votes = new HashMap<>();
        Map<String, Integer> voteOrder = new LinkedHashMap<>();

        void vote(String candidate) {
            votes.put(candidate, votes.getOrDefault(candidate, 0) + 1);
            voteOrder.put(candidate, votes.get(candidate));
        }

        void showSortedResults() {
            TreeMap<String, Integer> sorted = new TreeMap<>(votes);
            System.out.println("Voting Results: " + sorted);
        }
    }

    static class ShoppingCart {
        Map<String, Double> prices = new HashMap<>();
        Map<String, Double> order = new LinkedHashMap<>();

        void addItem(String item, double price) {
            prices.put(item, price);
            order.put(item, price);
        }

        void displaySortedByPrice() {
            TreeMap<Double, List<String>> sorted = new TreeMap<>();
            for (Map.Entry<String, Double> e : prices.entrySet()) {
                sorted.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
            }
            System.out.println("Items Sorted by Price: " + sorted);
        }
    }

    static class BankingSystem {
        Map<String, Double> accounts = new HashMap<>();
        Queue<String> withdrawalQueue = new LinkedList<>();

        void addAccount(String accNo, double balance) {
            accounts.put(accNo, balance);
        }

        void requestWithdrawal(String accNo) {
            withdrawalQueue.add(accNo);
        }

        void processWithdrawals(double amount) {
            while (!withdrawalQueue.isEmpty()) {
                String acc = withdrawalQueue.remove();
                if (accounts.get(acc) >= amount) {
                    accounts.put(acc, accounts.get(acc) - amount);
                }
            }
        }

        void displaySortedByBalance() {
            TreeMap<Double, List<String>> sorted = new TreeMap<>();
            for (Map.Entry<String, Double> e : accounts.entrySet()) {
                sorted.computeIfAbsent(e.getValue(), k -> new ArrayList<>()).add(e.getKey());
            }
            System.out.println("Accounts Sorted by Balance: " + sorted);
        }
    }

 
    public static void main(String[] args) {

      
        InsurancePolicyManager manager = new InsurancePolicyManager();
        manager.addPolicy(new Policy("P1", "Alice", LocalDate.now().plusDays(10)));
        manager.addPolicy(new Policy("P2", "Bob", LocalDate.now().plusDays(40)));
        manager.addPolicy(new Policy("P3", "Alice", LocalDate.now().minusDays(5)));

        System.out.println("Policy P1: " + manager.getPolicy("P1"));
        System.out.println("Policies expiring in 30 days: " + manager.policiesExpiringIn30Days());
        System.out.println("Policies for Alice: " + manager.policiesByHolder("Alice"));
        manager.removeExpiredPolicies();

        
        VotingSystem voting = new VotingSystem();
        voting.vote("Alice");
        voting.vote("Bob");
        voting.vote("Alice");
        voting.showSortedResults();

     
        ShoppingCart cart = new ShoppingCart();
        cart.addItem("Laptop", 50000);
        cart.addItem("Mouse", 500);
        cart.addItem("Keyboard", 1500);
        cart.displaySortedByPrice();

       
        BankingSystem bank = new BankingSystem();
        bank.addAccount("ACC1", 5000);
        bank.addAccount("ACC2", 3000);
        bank.requestWithdrawal("ACC1");
        bank.processWithdrawals(1000);
        bank.displaySortedByBalance();
    }
}