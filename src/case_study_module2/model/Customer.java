package case_study_module2.model;

public class Customer extends Person {
    private String typeCustomer;


    public Customer() {
    }

    public Customer(int id, String name, int age, String address, String sex, String typeCustomer) {
        super(id, name, age, address, sex);
        this.typeCustomer = typeCustomer;
    }


    public String getTypeCustomer() {
        return typeCustomer;
    }

    public void setTypeCustomer(String typeCustomer) {
        this.typeCustomer = typeCustomer;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "typeCustomer='" + typeCustomer + '\'' +
                '}';
    }
}

