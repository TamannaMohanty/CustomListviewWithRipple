package com.example.customlistviewwithripple;

public class UserPojo {

    int image;
    String Countries;
    String Capital;

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getCountries() {
        return Countries;
    }

    public void setCountries(String countries) {
        Countries = countries;
    }

    public String getCapital() {
        return Capital;
    }

    public void setCapital(String capital) {
        Capital = capital;
    }

    public UserPojo(int image, String countries, String capital) {
        this.image = image;
        this.Countries = countries;
        this.Capital = capital;

    }
}
