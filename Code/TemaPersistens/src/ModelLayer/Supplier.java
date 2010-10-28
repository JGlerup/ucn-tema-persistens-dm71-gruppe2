/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ModelLayer;

/**
 *
 * @author Erik
 */
public class Supplier {

    private int id;
    private String name;
    private String address;
    private String country;
    private int phoneno;
    private String email;

    public Supplier() {
    }

    public Supplier(int id, String name, String address, String country, int phoneno, String email) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.country = country;
        this.phoneno = phoneno;
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPhoneno() {
        return phoneno;
    }

    public void setPhoneno(int phoneno) {
        this.phoneno = phoneno;
    }
}
