package comas.base;

/**
 * Class for supplier.
 */
public class Supplier {

    private String   firstName;
    private String   lastName;
    private String   address;
    private String   city;
    private String   telephoneA;
    private String   telephoneB;
    private String   postalCode;
    private String   taxRegister;
    
    public Supplier(String firstName, String lastName, String address, String city, String telephoneA, String telephoneB, String postalCode, String taxRegister)
    {
        this.firstName      = firstName;
        this.lastName       = lastName;
        this.address        = address;
        this.city           = city;
        this.telephoneA     = telephoneA;
        this.telephoneB     = telephoneB;
        this.postalCode     = postalCode;
        this.taxRegister    = taxRegister;
    } // Supplier

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getTelephoneA() {
        return telephoneA;
    }

    public void setTelephoneA(String telephoneA) {
        this.telephoneA = telephoneA;
    }

    public String getTelephoneB() {
        return telephoneB;
    }

    public void setTelephoneB(String telephoneB) {
        this.telephoneB = telephoneB;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTaxRegister() {
        return taxRegister;
    }

    public void setTaxRegister(String taxRegister) {
        this.taxRegister = taxRegister;
    }
}
