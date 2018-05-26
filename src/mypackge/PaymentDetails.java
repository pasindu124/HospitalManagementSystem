/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mypackge;

/**
 *
 * @author Pasindu Weerasinghe
 */
public class PaymentDetails {
    private int paymentID;
    private int amount;
    private String date;
    private String paymode;
    

    /**
     * @return the paymentID
     */
    public int getPaymentID() {
        return paymentID;
    }

    /**
     * @param paymentID the paymentID to set
     */
    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    /**
     * @return the amount
     */
    public int getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }

    /**
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * @return the paymode
     */
    public String getPaymode() {
        return paymode;
    }

    /**
     * @param paymode the paymode to set
     */
    public void setPaymode(String paymode) {
        this.paymode = paymode;
    }
}
