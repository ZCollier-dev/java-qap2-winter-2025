public class Person {
    //attributes
    private String lastName;
    private String firstName;
    private Address home;

    //methods
    public Person(String firstName, String lastName, Address home){
        this.lastName = lastName;
        this.firstName = firstName;
        this.home = home;
    }

    public String toString(){
        return String.format("Person: %s, %s %s", this.lastName, this.firstName, this.home.toString());
    }
}
