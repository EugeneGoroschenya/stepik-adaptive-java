import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

public class Task6 {

    /**
     * https://stepik.org/lesson/36145/step/1?adaptive=true&unit=24657
     *
     * <p>
     * You have two classes:
     * <p>
     * - Transaction: uuid: String,  state: State (CANCELED, FINISHED, PROCESSING), sum: Long, created: Date
     * - Account: number: String, balance: Long, transactions: List<Transaction>
     * <p>
     * Both classes have getters for all fields with the corresponding names (getState(), getSum(), getTransactions() and so on).
     * Write a method using Stream API that calculates the total sum of canceled transactions for all non-empty accounts (balance > 0). Perhaps, flatMap method can help you to implement it.
     * <p>
     * Classes Transaction, Account and enum State will be available during testing. You can define your own classes for local testing.
     * <p>
     * Important. Use the given template for your method. Pay attention to type of an argument and the returned value. Please, use only Stream API, no cycles.
     */
    public static void main(String[] args) {

        List<Account> accounts = new ArrayList<>();
        List<Transaction> transactions;

        transactions = new ArrayList<>();
        transactions.add(new Transaction("", State.CANCELED, 1000L, new Date()));
        accounts.add(new Account("1001", 0L, transactions));

        transactions = new ArrayList<>();
        transactions.add(new Transaction("", State.FINISHED, 8000L, new Date()));
        transactions.add(new Transaction("", State.CANCELED, 10000L, new Date()));
        accounts.add(new Account("1002", 8000L, transactions));
        System.out.println(calcSumOfCanceledTransOnNonEmptyAccounts(accounts));
    }

    /**
     * Calculates the general sum of canceled transactions for all non empty accounts in the list
     */
    public static long calcSumOfCanceledTransOnNonEmptyAccounts(List<Account> accounts) {
        return accounts.stream()
                .filter((Account a) -> a.getBalance() > 0)
                .flatMap((Account a) -> a.getTransactions().stream())
                .filter((Transaction t) -> t.getState() == State.CANCELED)
                .collect(Collectors.summarizingLong(Transaction::getSum)).getSum();
    }

}

class Account {
    private String number;
    private Long balance;
    private List<Transaction> transactions;

    public Account(String number, Long balance, List<Transaction> transactions) {
        this.number = number;
        this.balance = balance;
        this.transactions = transactions;
    }

    public String getNumber() {
        return number;
    }

    public Long getBalance() {
        return balance;
    }

    public List<Transaction> getTransactions() {
        return transactions;
    }
}

class Transaction {
    private String uuid;
    private State state;
    private Long sum;
    private Date created;

    public Transaction(String uuid, State state, Long sum, Date created) {
        this.uuid = uuid;
        this.state = state;
        this.sum = sum;
        this.created = created;
    }

    public String getUuid() {
        return uuid;
    }

    public State getState() {
        return state;
    }

    public Long getSum() {
        return sum;
    }

    public Date getCreated() {
        return created;
    }
}

enum State {
    CANCELED, FINISHED, PROCESSING
}