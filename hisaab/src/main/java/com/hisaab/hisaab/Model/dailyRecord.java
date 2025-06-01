package com.hisaab.hisaab.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class dailyRecord {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "DailyRecord_sequence")
    @SequenceGenerator(name = "DailyRecord_sequence", sequenceName = "DailyRecord_id_seq", allocationSize = 1)
    private long id;
    private String name;
    private String phoneNumber;
    private String email;
    private List<String> assetOwnedId;
    private String adharCard;
    private String panCard;
    private String licenseNo;

    public dailyRecord(long id, String name, String phoneNumber, String email, List<String> assetOwnedId, String adharCard, String panCard, String licenseNo) {
        this.id = id;
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.assetOwnedId = assetOwnedId;
        this.adharCard = adharCard;
        this.panCard = panCard;
        this.licenseNo = licenseNo;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<String> getAssetOwnedId() {
        return assetOwnedId;
    }

    public void setAssetOwnedId(List<String> assetOwnedId) {
        this.assetOwnedId = assetOwnedId;
    }

    public String getAdharCard() {
        return adharCard;
    }

    public void setAdharCard(String adharCard) {
        this.adharCard = adharCard;
    }

    public String getPanCard() {
        return panCard;
    }

    public void setPanCard(String panCard) {
        this.panCard = panCard;
    }

    public String getLicenseNo() {
        return licenseNo;
    }

    public void setLicenseNo(String licenseNo) {
        this.licenseNo = licenseNo;
    }
}

