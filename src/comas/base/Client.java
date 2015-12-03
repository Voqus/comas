package comas.base;

/**
 * Class for client.
 */
public class Client {

    private String   businessName;
    private String   firstName;
    private String   lastName;
    private String   profession;
    private String   address;
    private String   city;
    private String   telephoneA;
    private String   telephoneB;
    private String   fax;
    private String   postalCode;
    private String   taxRegister;
    private String   professionCode;
    
    public Client(String businessName,String firstName, String lastName, String profession, String address, String city, String telephoneA, String telephoneB, String fax, String postalCode, String taxRegister, String professionCode)
    {
       this.businessName    = businessName;
       this.firstName       = firstName;
       this.lastName        = lastName;
       this.profession      = profession;
       this.address         = address;
       this.city            = city;
       this.telephoneA      = telephoneA;
       this.telephoneB      = telephoneB;
       this.fax             = fax;
       this.postalCode      = postalCode;
       this.taxRegister     = taxRegister;
       this.professionCode  = professionCode;
    }
    
    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

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

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
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

    public String getFax() {
        return fax;
    }

    public void setFax(String fax) {
        this.fax = fax;
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

    public String getProfessionCode() {
        return professionCode;
    }

    public void setProfessionCode(String professionCode) {
        this.professionCode = professionCode;
    }

}
