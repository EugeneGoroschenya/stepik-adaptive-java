import java.util.Date;

class Transaction {
    private String uuid;
    private State state;
    private Long sum;
    private Date created;
    private Account account;

    public Transaction(String uuid, State state, Long sum, Date created) {
        this.uuid = uuid;
        this.state = state;
        this.sum = sum;
        this.created = created;
    }

    public Transaction(String uuid, Long sum, Account account) {
        this.uuid = uuid;
        this.sum = sum;
        this.account = account;
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

    public Account getAccount() {
        return account;
    }

}
