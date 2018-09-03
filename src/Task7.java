import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.*;

public class Task7 {

    /**
     * https://stepik.org/lesson/36018/step/1?adaptive=true&unit=24661
     *
     * <p>
     * You have two classes:
     * <p>
     * Account: number: String, balance: Long
     * Transaction: uuid: String, sum: Long, account: Account
     * <p>
     * Both classes have getters for all fields with the corresponding names (getNumber(), getSum(), getAccount() and so on).
     * Write a collector that calculates the total sum of transactions (long type, not integer) by each account (i.e. by account number). The collector will be applied to a stream of transactions.
     * <p>
     * Classes Transaction and Account will be available during testing. You can create your own classes for local testing.
     * <p>
     * Important. You should write only the collector in any valid formats but without ; on the end.
     * It will be passed as an argument to the collect() method of a stream as shown below.
     * <p>
     * List<Transaction> transactions = ...
     * Map<String, Long> totalSumOfTransByEachAccount =
     * transactions.stream()
     * .collect(...your_collector_will_be_passed_here...);
     * <p>
     * Examples of the valid solution formats: Collectors.reducing(...) or reducing(...)
     */
    public static void main(String[] args) {

        List<Transaction> transactions = new ArrayList<>();
        transactions.add(new Transaction("", 1000L, new Account("1001", 10L)));
        transactions.add(new Transaction("", 2000L, new Account("1001", 20L)));
        transactions.add(new Transaction("", 1500L, new Account("1002", 30L)));

        Map<String, Long> totalSumOfTransByEachAccount = transactions.stream().collect(
                groupingBy((Transaction t) -> t.getAccount().getNumber(), reducing(0L, Transaction::getSum, Long::sum))
        );

        System.out.println(totalSumOfTransByEachAccount);
    }

}
