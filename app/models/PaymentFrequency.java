package models;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class PaymentFrequency
{
    @Id private String paymentFrequencyId;
    private String paymentFrequencyName;

    public PaymentFrequency(String paymentFrequencyId, String paymentFrequencyName)
    {
        this.paymentFrequencyId = paymentFrequencyId;
        this.paymentFrequencyName = paymentFrequencyName;
    }

    public String getPaymentFrequencyId()
    {
        return paymentFrequencyId;
    }

    public void setPaymentFrequencyId(String paymentFrequencyId)
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
