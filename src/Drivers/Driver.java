/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Drivers;

/**
 *
 * @author Charith
 */
public class Driver {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private String name;
    private String nic;
    private String address;
    private int age;
    private int telephone;
    private String date;
    private String username;
    private String password;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNic() {
        return nic;
    }

    public void setNic(String nic) {
        this.nic = nic;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getTelephone() {
        return telephone;
    }

    public void setTelephone(int telephone) {
        this.telephone = telephone;
    }
    
    public Driver(String name, String nic, String address, int age, int telephone, String id, String date, String username, String password) {
        this.name = name;
        this.id= id;
        this.nic = nic;
        this.address= address;
        this.age = age;
        this.telephone= telephone;
        this.date= date;
        this.username= username;
        this.password= password;
    }
     public Driver() {
    }
    
}
