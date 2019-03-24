package all;


public class Payment {

    private int paymentId;
    private double paymentValue;
    private String paymetDate;

    public Payment() {

    }

    public Payment(int paymentId, double paymentValue, String paymetDate) {
        this.paymentId = paymentId;
        this.paymentValue = paymentValue;
        this.paymetDate = paymetDate;

    }

    /**
     * @return the paymentId
     */
    public int getPaymentId() {
        return paymentId;
    }

    /**
     * @param paymentId the paymentId to set
     */
    public void setPaymentId(int paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * @return the paymentValue
     */
    public double getPaymentValue() {
        return paymentValue;
    }

    /**
     * @param paymentValue the paymentValue to set
     */
    public void setPaymentValue(double paymentValue) {
        this.paymentValue = paymentValue;
    }

    /**
     * @return the paymetDate
     */
    public String getPaymetDate() {
        return paymetDate;
    }

    /**
     * @param paymetDate the paymetDate to set
     */
    public void setPaymetDate(String paymetDate) {
        this.paymetDate = paymetDate;
    }

    /**
     * @return the payment1
     */
}
