package MachineCodingRound.meesho.dto;

public class Address {
    private String placeName;
    private int pincode;
    private String district;

    public Address(String placeName, int pincode, String district) {
        this.placeName = placeName;
        this.pincode = pincode;
        this.district = district;
    }

    public String getPlaceName() {
        return placeName;
    }

    public void setPlaceName(String placeName) {
        this.placeName = placeName;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }
}

