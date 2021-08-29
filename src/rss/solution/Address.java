package rss.solution;


public class Address {
    private String city;
    private String district;
    private String street;
    private Integer zipCode;
    


    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getStreet1() {
        return street;
    }

    public void setStreet1(String street1) {
        this.street = street1;
    }

    public Integer getZipCode() {
        return zipCode;
    }

    public void setZipCode(Integer zipCode) {
        this.zipCode = zipCode;
    }
    
        @Override
    public String toString() {
        return "Address{" +
                ", city='" + city + '\'' +
                ", district='" + district + '\'' +
                ", street1='" + street + '\'' +
                ", zipCode=" + zipCode +
                '}';
    }
}
