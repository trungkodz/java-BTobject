package bai07;

public class address {
    private String Sa, city, state;
    private long zipcode;

    public address(String Sa, String city, String state, long zipcode) {
        this.Sa = Sa;
        this.city = city;
        this.state = state;
        this.zipcode = zipcode;
    }

    @Override

    public String toString() {
        return Sa + " " + city + " " + state + " " + zipcode;
    }
}
