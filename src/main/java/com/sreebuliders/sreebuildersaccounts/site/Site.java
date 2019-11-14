package com.sreebuliders.sreebuildersaccounts.site;

import javax.persistence.*;

@Entity
@Table(name = "SITE")
public class Site {

    private Long siteId;
    private String siteName;
    private String siteCustomerName;
    private String siteAddress;
    private String sitePlan;

    public Site(){

    }

    public Site(Long siteId, String siteName, String siteCustomerName, String siteAddress, String sitePlan) {
        super();
        this.siteId = siteId;
        this.siteName = siteName;
        this.siteCustomerName = siteCustomerName;
        this.siteAddress = siteAddress;
        this.sitePlan = sitePlan;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "SITE_ID",nullable = false)
    public Long getSiteId() {
        return siteId;
    }

    public void setSiteId(Long siteId) {
        this.siteId = siteId;
    }

    @Column(name = "SITE_NAME")
    public String getSiteName() {
        return siteName;
    }

    public void setSiteName(String siteName) {
        this.siteName = siteName;
    }

    @Column(name = "SITE_CUS_NAME")
    public String getSiteCustomerName() {
        return siteCustomerName;
    }

    public void setSiteCustomerName(String siteCustomerName) {
        this.siteCustomerName = siteCustomerName;
    }

    @Column(name = "SITE_ADDRESS")
    public String getSiteAddress() {
        return siteAddress;
    }

    public void setSiteAddress(String siteAddress) {
        this.siteAddress = siteAddress;
    }

    @Column(name = "SITE_PLAN")
    public String getSitePlan() {
        return sitePlan;
    }

    public void setSitePlan(String sitePlan) {
        this.sitePlan = sitePlan;
    }

}
