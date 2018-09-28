package models;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Date;

@Entity
public class StudentDetail
{
    @Id private int studentId;
    private String lastName;
    private String firstName;
    private String studentAddress;
    private String cityName;
    private String stateId;
    private String zipCode;
    private int techniqueId;
    private boolean contractStatus;
    private int instructorId;
    private int paymentFrequencyId;
    private LocalDate startDate;
    private String stateName;
    private String instructorName;
    private String phoneNumber;
    private BigDecimal rate;
    private String beltRank;



    public StudentDetail(String lastName, String firstName, String studentAddress, String cityName, String stateName, String zipCode, String phoneNumber, String beltRank, String InstructorName, int techniqueId, boolean contractStatus, BigDecimal rate, LocalDate startDate)
    {
        this.studentId = studentId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.studentAddress = studentAddress;
        this.cityName = cityName;
        this.stateId = stateId;
        this.zipCode = zipCode;
        this.techniqueId = techniqueId;
        this.contractStatus = contractStatus;
        this.instructorId = instructorId;
        this.paymentFrequencyId = paymentFrequencyId;
        this.startDate = startDate;
        this.stateName = stateName;
        this.instructorName = instructorName;
        this.phoneNumber = phoneNumber;
        this.rate = rate;
        this.beltRank = beltRank;
    }





    public String getBeltRank()
    {
        return beltRank;
    }

    public void setBeltRank(String beltRank)
    {
        this.beltRank = beltRank;
    }

    public String getPhoneNumber()
    {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }

    public BigDecimal getRate()
    {
        return rate;
    }

    public void setRate(BigDecimal rate)
    {
        this.rate = rate;
    }

    public String getStateName()
    {
        return stateName;
    }

    public void setStateName(String stateName)
    {
        this.stateName = stateName;
    }

    public String getInstructorName()
    {
        return instructorName;
    }

    public void setInstructorName(String instructorName)
    {
        this.instructorName = instructorName;
    }

    public int getStudentId()
    {
        return studentId;
    }

    public void setStudentId(int studentId)
    {
        this.studentId = studentId;
    }

    public String getLastName()
    {
        return lastName;
    }

    public void setLastName(String lastName)
    {
        this.lastName = lastName;
    }

    public String getFirstName()
    {
        return firstName;
    }

    public void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }

    public String getStudentAddress()
    {
        return studentAddress;
    }

    public void setStudentAddress(String studentAddress)
    {
        this.studentAddress = studentAddress;
    }

    public String getCityName()
    {
        return cityName;
    }

    public void setCityName(String cityName)
    {
        this.cityName = cityName;
    }

    public String getStateId()
    {
        return stateId;
    }

    public void setStateId(String stateId)
    {
        this.stateId = stateId;
    }

    public String getZipCode()
    {
        return zipCode;
    }

    public void setZipCode(String zipCode)
    {
        this.zipCode = zipCode;
    }

    public int getTechniqueId()
    {
        return techniqueId;
    }

    public void setTechniqueId(int techniqueId)
    {
        this.techniqueId = techniqueId;
    }

    public boolean isContractStatus()
    {
        return contractStatus;
    }

    public void setContractStatus(boolean contractStatus)
    {
        this.contractStatus = contractStatus;
    }

    public int getInstructorId()
    {
        return instructorId;
    }

    public void setInstructorId(int instructorId)
    {
        this.instructorId = instructorId;
    }

    public int getPaymentFrequencyId()
    {
        return paymentFrequencyId;
    }

    public void setPaymentFrequencyId(int paymentFrequencyId)
    {
        this.paymentFrequencyId = paymentFrequencyId;
    }

    public LocalDate getStartDate()
    {
        return startDate;
    }

    public void setStartDate(LocalDate startDate)
    {
        this.startDate = startDate;
    }
}
