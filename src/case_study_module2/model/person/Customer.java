package case_study_module2.model.person;

public class Customer extends Person {
    private String typeCustomer;
    private String phoneNumber;
    private String email;

    public Customer() {
    }

    public Customer(int id,
                    String name,
                    int age,
                    String sex,
                    String dateOfBirth,
                    String idCard,
                    String address,
                    String typeCustomer,
                    String phoneNumber,
                    String email) {
        super(id, name, age, sex, dateOfBirth, idCard, address);
        this.typeCustomer = typeCustomer;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Customer{" + super.toString()+
                "typeCustomer='" + typeCustomer + '\'' +
                ", idCard='" +  '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

