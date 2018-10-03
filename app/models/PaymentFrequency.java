package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentFrequency
{
    @Id private int paymentFrequencyId;
    private String paymentFrequencyName;



    public int getPaymentFrequencyId()
    {
        return paymentFrequencyId;
    }

    public void setPaymentFrequencyId(int paymentFrequencyId)
    {
        this.paymentFrequencyId = paymentFrequencyId;
    }

    public String getPaymentFrequencyName()
    {
        return paymentFrequencyName;
    }

    public void setPaymentFrequencyName(String paymentFrequencyName)
    {
        this.paymentFrequencyName = paymentFrequencyName;
    }
}
