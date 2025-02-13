public class Money {
    //attributes
    private long dollars;
    private long cents;

    //methods
    public Money(double amount){
        this.dollars = (long) Math.floor(amount);
        this.cents = (long) (amount - this.dollars) * 100;
    }
    public Money(Money otherObject){
        this.dollars = otherObject.dollars;
        this.cents = otherObject.cents;
    }

    public Money add(Money otherObject){
        long dollars = this.dollars + otherObject.dollars;
        long cents = this.cents + otherObject.cents;
        if (cents >= 100){
            ++dollars;
            cents -= 100;
        }
        double amount = (double) dollars + ((double) cents)/100;
        return new Money(amount);
    }
    public Money subtract(Money otherObject){
        long dollars = this.dollars - otherObject.dollars;
        long cents = this.cents - otherObject.cents;
        if (cents < 0){
            --dollars;
            cents += 100;
        }
        double amount = (double) dollars + ((double) cents)/100;
        return new Money(amount);
    }

    public int compareTo(Money otherObject){
        double double1 = (double) this.dollars + ((double) this.cents / 100);
        double double2 = (double) otherObject.dollars + ((double) otherObject.cents / 100);
        if (double1 < double2) {
            return -1;
        } else if (double1 > double2) {
            return 1;
        } else {
            return 0;
        }
    }
    public boolean equals(Money otherObject){
        String string1 = String.format("$d.%d", this.dollars, this.cents);
        String string2 = String.format("$d.%d", otherObject.dollars, otherObject.cents);

        if (string1 == string2){
            return true;
        } else {
            return false;
        }
    }

    public String toString(){
        return String.format("Amount: $%d.%d", this.dollars, this.cents);
    }
}
