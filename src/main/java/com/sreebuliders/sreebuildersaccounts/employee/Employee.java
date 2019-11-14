package com.sreebuliders.sreebuildersaccounts.employee;

import javax.persistence.*;

@Entity
@Table(name = "EMP")
public class Employee {

    private Long empId;
    private String empName;
    private String empPhoneNo;
    private String empAddress;
    private String empType;
    private String empIdenProof;

    public Employee(){

    }
    public Employee(Long empId, String empName, String empPhoneNo, String empAddress, String empType, String empIdenProof) {
        super();
        this.empId = empId;
        this.empName = empName;
        this.empPhoneNo = empPhoneNo;
        this.empAddress = empAddress;
        this.empType = empType;
        this.empIdenProof = empIdenProof;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "EMP_ID", nullable = false)
    public Long getEmpId() {
        return empId;
    }

    public void setEmpId(Long empId) {
        this.empId = empId;
    }

    @Column(name = "EMP_NAME")
    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    @Column(name = "EMP_PHONE")
    public String getEmpPhoneNo() {
        return empPhoneNo;
    }

    public void setEmpPhoneNo(String empPhoneNo) {
        this.empPhoneNo = empPhoneNo;
    }

    @Column(name = "EMP_ADD")
    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    @Column(name = "EMP_TYPE")
    public String getEmpType() {
        return empType;
    }

    public void setEmpType(String empType) {
        this.empType = empType;
    }

    @Column(name = "EMP_ID_PROOF")
    public String getEmpIdenProof() {
        return empIdenProof;
    }

    public void setEmpIdenProof(String empIdenProof) {
        this.empIdenProof = empIdenProof;
    }
}
