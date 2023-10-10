package com.immanuel.dojosurvey;

public class Survey {

    private String name;
    private String location;
    private String language;


    public Survey() {
    }


    public Survey(String name, String location, String language) {
        this.name = name;
        this.location = location;
        this.language = language;
    }


    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return this.location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLanguage() {
        return this.language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public String toString() {
        return "{" +
            " name='" + getName() + "'" +
            ", location='" + getLocation() + "'" +
            ", language='" + getLanguage() + "'" +
            "}";
    }

    
}
