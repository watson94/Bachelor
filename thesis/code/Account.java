public class Account {
    private Integer balance = 0;
    synchronized void incrementBalance(Integer value){
        balance += value;
    }

    synchronized Integer getBalance() {
        return balance;
    }
}
