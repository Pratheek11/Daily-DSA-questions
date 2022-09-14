import java.util.*;

// class Data {
//     public int index;
//     public String name;
//     public int time;
//     public int amount;
//     public String city;
// }

class Transaction {

    public String name;
    public int time;
    public int amount;
    public String city;

    public Transaction(String transVal) {
        String[] value = transVal.split(",");
        this.name = value[0];
        this.time = Integer.parseInt(value[1]);
        this.amount = Integer.parseInt(value[2]);
        this.city = value[3];
    }

}

public class InvalidTransactions {
    public static void main(String[] args) {
        String[] transactions = { "alice,20,800,mtv", "alice,50,100,beijing" };
        List<String> ans = invalidTransactions(transactions);
    }

    public static List<String> invalidTransactions(String[] transactions) {
        List<String> invalidTns = new ArrayList<String>();
        Map<String, List<Transaction>> map = new HashMap<String, List<Transaction>>();

        for (String transaction : transactions) {
            Transaction t = new Transaction(transaction);
            map.putIfAbsent(t.name, new ArrayList<Transaction>());
            map.get(t.name).add(t);
        }

        for (String transaction : transactions) {
            Transaction t = new Transaction(transaction);

            if (!isValid(t, map.getOrDefault(t.name, new ArrayList<Transaction>()))) {
                invalidTns.add(transaction);
            }
        }
        return invalidTns;
    }

    public static boolean isValid(Transaction t, List<Transaction> transactions) {
        if (t.amount > 1000) {
            return false;
        }

        for (Transaction transaction : transactions) {
            if (Math.abs(t.time - transaction.time) <= 60 && !t.city.equals(transaction.city)) {
                return false;
            }
        }

        return true;
    }

}
