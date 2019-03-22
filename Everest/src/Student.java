
public class Student extends Person {

    private double net;
    private int StdID;
    private String StdName;
    private int StdPhoneNum;
    private String paymentMethod;
    private double paid;
    private double TotalPrice;
    private double discount;

    public double getNet() {
        return net;
    }

    public void setNet(double net) {
        this.net = net;
    }

    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    public double getTotalPrice() {
        return TotalPrice;
    }

    public void setTotalPrice(double TotalPrice) {
        this.TotalPrice = TotalPrice;
    }

    public Student() {

    }

    public Student(int id, String name, int phone_number, String payment_method) {
        super(id, name, phone_number);
        this.paymentMethod = payment_method;
    }

    public Student(String name, int phone_number) {
        this.StdName = name;
        this.StdPhoneNum = phone_number;
    }

    public String getPaymentMethod() {
        return paymentMethod;
    }

    /**
     * @param paymentMethod the paymentMethod to set
     */
    public void setPaymentMethod(String paymentMethod) {
        this.paymentMethod = paymentMethod;
    }

    /**
     * @return the paid
     */
    public double getPaid() {
        return paid;
    }

    /**
     * @param paid the paid to set
     */
    public void setPaid(double paid) {
        this.paid = paid;
    }

    public int getStdID() {
        return StdID;
    }

    public void setStdID(int StdID) {
        this.StdID = StdID;
    }

    public String getStdName() {
        return StdName;
    }

    public void setStdName(String StdName) {
        this.StdName = StdName;
    }

    public int getStdPhoneNum() {
        return StdPhoneNum;
    }

    public void setStdPhoneNum(int StdPhoneNum) {
        this.StdPhoneNum = StdPhoneNum;
    }

}
