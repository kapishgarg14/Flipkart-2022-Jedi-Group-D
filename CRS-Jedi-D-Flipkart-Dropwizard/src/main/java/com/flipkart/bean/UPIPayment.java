package com.flipkart.bean;

public class UPIPayment {
    private String upiId;
    private int amount;

    /**
     * returns a constructor
     * @param upiId
     * @param amount
     */
    public UPIPayment(String upiId, int amount) {
        this.upiId = upiId;
        this.amount = amount;
    }

    /**
     *
     * @return upi id
     */
    public String getUpiId() {
        return upiId;
    }

    /**
     * updates the upi id
     * @param upiId
     */
    public void setUpiId(String upiId) {
        this.upiId = upiId;
    }

    /**
     *
     * @return amount pending
     */
    public int getAmount() {
        return amount;
    }

    /**
     * update the amount pending
     * @param amount
     */
    public void setAmount(int amount) {
        this.amount = amount;
    }
}
