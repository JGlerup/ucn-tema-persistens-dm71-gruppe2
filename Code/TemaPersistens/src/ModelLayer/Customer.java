/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package ModelLayer;

/**
 *
 * @author Kristian Byrialsen
 */
public class Customer {

private String name;
private String address;
private int zipcode;
private String city;
private int phoneno;
private String CustomerType;
private String email;

    public Customer(String name, String address, int zipcode, String city, int phoneno, String CustomerType, String email)
    {
        this.name = name;
        this.address = address;
        this.zipcode = zipcode;
        this.city = city;
        this.phoneno = phoneno;
        this.CustomerType = CustomerType;
        this.email = email;
    }

    public String getCustomerType()
    {
        return CustomerType;
    }

    public void setCustomerType(String CustomerType)
    {
        this.CustomerType = CustomerType;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getCity()
    {
        return city;
    }

    public void setCity(String city)
    {
        this.city = city;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public int getPhoneno()
    {
        return phoneno;
    }

    public void setPhoneno(int phoneno)
    {
        this.phoneno = phoneno;
    }

    public int getZipcode()
    {
        return zipcode;
    }

    public void setZipcode(int zipcode)
    {
        this.zipcode = zipcode;
    }



}