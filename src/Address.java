public class Address {
    //attributes
    private String street;
    private String city;
    private String province; //replacing state because canada
    private String postal; //replacing zip because canada

    //methods
    public Address(String street, String city, String province, String postal){
        this.street = street;
        this.city = city;
        this.province = province;
        this.postal = postal;
    }

    public String toString(){
        return String.format("%s, %s %s %s", this.street, this.city, this.province, this.postal);
    }
}
