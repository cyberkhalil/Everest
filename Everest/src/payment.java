/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mohammed salah
 */
public class payment {

    private int paymentId;
    private double paymentValue;
    private String paymetDate;

    public payment() {

    }

    public payment(int paymentId, double paymentValue, String paymetDate) {
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
