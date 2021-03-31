package com.franktran.lc;

public class UserRegistrationDTO {

    private String name;
    private String username;
    private char[] password;
    private String countryName;
    private String[] hobbies;
    private String gender;
    private int age;
    private CommunicationDTO communicationDTO;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public String getCountryName() {
        return countryName;
    }

    public void setCountryName(String countryName) {
        this.countryName = countryName;
    }

    public String[] getHobbies() {
        return hobbies;
    }

    public void setHobbies(String[] hobbies) {
        this.hobbies = hobbies;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CommunicationDTO getCommunicationDTO() {
        return communicationDTO;
    }

    public void setCommunicationDTO(CommunicationDTO communicationDTO) {
        this.communicationDTO = communicationDTO;
    }
}
