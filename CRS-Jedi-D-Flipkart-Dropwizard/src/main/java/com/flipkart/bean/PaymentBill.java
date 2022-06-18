package com.flipkart.bean;

public class PaymentBill {
    private String paymentType;

    /**
     * @param paymentType UPI/NET BANKING/CASH
     */
    public PaymentBill(String paymentType) {
        this.paymentType = paymentType;
    }

    /**
     * @return payment type UPI/NET Banking
     */
    public String getPaymentType() {
        return paymentType;
    }

    /**
     * @update paymentType
     * @param paymentType
     */
    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }
}
