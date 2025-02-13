public class CreditCard {
    //attributes
    private Money balance;
    private Money creditLimit;
    private Person owner;

    //methods
    public CreditCard(Person newCardHolder, Money limit){
        this.balance = new Money(0.00);
        this.creditLimit = limit;
        this.owner = newCardHolder;
    }

    public Money getBalance(){
        return this.balance;
    }
    public Money getCreditLimit(){
        return this.creditLimit;
    }
    public String getPersonals(){
        return this.owner.toString();
    }

    public void charge(Money amount){
        Money sum = this.balance.add(amount);
        int compare = sum.compareTo(this.creditLimit);
        switch (compare){
            case -1: {
                this.balance = sum;
                break;
            }
            case 1: {
                System.out.println("ERR: Charge brings balance above credit limit.");
                break;
            }
            default: {
                this.balance = sum;
                System.out.println("ALERT: Credit Limit Reached");
                break;
            }
        }
    }
    public void payment(Money amount){
        this.balance = this.balance.subtract(amount);
    }
}
