package com.sreebuliders.sreebuildersaccounts.supplier;

import com.sreebuliders.sreebuildersaccounts.inwarddetails.InwardDetailsEntry;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "SUPPLIER")
public class Supplier {


    private Long supId;
    private String supName;
    private String supAddress;
    private String supGstNo;
    private String supPhoneNo;



    @OneToMany(targetEntity=InwardDetailsEntry.class, mappedBy="supplier")
    private Set<InwardDetailsEntry> inwardDetailsEntries = new HashSet<InwardDetailsEntry>();

    public Supplier() {

    }

    public Supplier(Long supId, String supName, String supAddress, String supGstNo, String supPhoneNo) {
        super();
        this.supId = supId;
        this.supName = supName;
        this.supAddress = supAddress;
        this.supGstNo = supGstNo;
        this.supPhoneNo = supPhoneNo;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "SUP_ID" ,nullable = false)
    public Long getSupId() {
        return supId;
    }

    public void setSupId(Long supId) {
        this.supId = supId;
    }

    @Column(name = "SUP_NAME")
    public String getSupName() {
        return supName;
    }

    public void setSupName(String supName) {
        this.supName = supName;
    }

    @Column(name = "SUP_ADDRESS")
    public String getSupAddress() {
        return supAddress;
    }

    public void setSupAddress(String supAddress) {
        this.supAddress = supAddress;
    }

    @Column(name = "SUP_GST_NO")
    public String getSupGstNo() {
        return supGstNo;
    }

    public void setSupGstNo(String supGstNo) {
        this.supGstNo = supGstNo;
    }

    @Column(name = "SUP_PHONE")
    public String getSupPhoneNo() {
        return supPhoneNo;
    }

    public void setSupPhoneNo(String supPhoneNo) {
        this.supPhoneNo = supPhoneNo;
    }

    public Set<InwardDetailsEntry> getInwardDetailsEntries() {
        return inwardDetailsEntries;
    }

    public void setInwardDetailsEntries(Set<InwardDetailsEntry> inwardDetailsEntries) {
        this.inwardDetailsEntries = inwardDetailsEntries;
    }
}
