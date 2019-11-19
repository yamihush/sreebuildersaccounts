package com.sreebuliders.sreebuildersaccounts.inwarddetails;

import com.sreebuliders.sreebuildersaccounts.material.Material;
import com.sreebuliders.sreebuildersaccounts.site.Site;
import com.sreebuliders.sreebuildersaccounts.supplier.Supplier;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "INWARD_ENTRY")
public class InwardDetailsEntry {

    private int inwardId;
    private Date inwardDate;
    private String supBillNo;
    private String units;
    private String rate;
    private String billAmt;
    private String cashMode;
    private Site site;
    private Material material;
    private Supplier supplier;


    public InwardDetailsEntry() {

    }

    public InwardDetailsEntry(int inwardId, Date inwardDate, String supBillNo, String units, String rate, String billAmt, String cashMode, Site site, Material material, Supplier supplier) {
        super();
        this.inwardId = inwardId;
        this.inwardDate = inwardDate;
        this.supBillNo = supBillNo;
        this.units = units;
        this.rate = rate;
        this.billAmt = billAmt;
        this.cashMode = cashMode;
        this.site = site;
        this.material = material;
        this.supplier = supplier;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "INWRD_ID")
    public int getInwardId() {
        return inwardId;
    }

    public void setInwardId(int inwardId) {
        this.inwardId = inwardId;
    }

    @Column(name = "INWRD_DATE")
    public Date getInwardDate() {
        return inwardDate;
    }

    public void setInwardDate(Date inwardDate) {
        this.inwardDate = inwardDate;
    }
    @Column(name = "SUP_BILL_NO")
    public String getSupBillNo() {
        return supBillNo;
    }

    public void setSupBillNo(String supBillNo) {
        this.supBillNo = supBillNo;
    }

    @Column(name = "UNITS")
    public String getUnits() {
        return units;
    }

    public void setUnits(String units) {
        this.units = units;
    }

    @Column(name = "RATE")
    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }

    @Column(name = "BILL_AMT")
    public String getBillAmt() {
        return billAmt;
    }

    public void setBillAmt(String billAmt) {
        this.billAmt = billAmt;
    }

    @Column(name = "CASH_MODE")
    public String getCashMode() {
        return cashMode;
    }

    public void setCashMode(String cashMode) {
        this.cashMode = cashMode;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SITE_ID", referencedColumnName = "SITE_ID")
    public Site getSite() {
        return site;
    }

    public void setSite(Site site) {
        this.site = site;
    }

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "MAT_ID", referencedColumnName = "MAT_ID")
    public Material getMaterial() {
        return material;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "SUP_ID", referencedColumnName = "SUP_ID")
    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }
}
