package case_study_module2.model.booking_contract;

public class Contracts {
    private int idContracts;
    private int idBooking;
    private double deposit;
    private double totalPrice;
    private int idCustomer;

    public Contracts() {
    }

    public Contracts(int idContracts, int idBooking, double deposit, double totalPrice, int idCustomer) {
        this.idContracts = idContracts;
        this.idBooking = idBooking;
        this.deposit = deposit;
        this.totalPrice = totalPrice;
        this.idCustomer = idCustomer;
    }

    public int getIdContracts() {
        return idContracts;
    }

    public void setIdContracts(int idContracts) {
        this.idContracts = idContracts;
    }

    public int getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(int idBooking) {
        this.idBooking = idBooking;
    }

    public double getDeposit() {
        return deposit;
    }

    public void setDeposit(double deposit) {
        this.deposit = deposit;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public int getIdCustomer() {
        return idCustomer;
    }

    public void setIdCustomer(int idCustomer) {
        this.idCustomer = idCustomer;
    }

    @Override
    public String toString() {
        return "Contracts{" +
                "idContracts=" + idContracts +
                ", idBooking=" + idBooking +
                ", deposit=" + deposit +
                ", totalPrice=" + totalPrice +
                ", idCustomer=" + idCustomer +
                '}';
    }
}
