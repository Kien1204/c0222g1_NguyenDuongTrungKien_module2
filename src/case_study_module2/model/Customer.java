package case_study_module2.model;

public class Customer extends Person {
    private String typeCustomer;
    private String address;
    private String idCard;

    public Customer() {
    }

    public Customer(int id,
                    String name,
                    int age,
                    String sex,
                    String typeCustomer,
                    String address) {
        super(id, name, age, address, sex);
        this.typeCustomer = typeCustomer;
        this.address=address;
    }


    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                '}';
    }
}

