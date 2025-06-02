package com.hisaab.hisaab.Model;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Id;
import java.util.List;

@Entity
public class OwnedAsset {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "OwnedAsset_sequence")
    @SequenceGenerator(name = "OwnedAsset_sequence", sequenceName = "OwnedAsset_id_seq", allocationSize = 1)
    private long id;
    private String assetName;
    private List<String> documentsId;
    private String earnings;
    private List<String> assetOwnedId;

    public OwnedAsset(long id, String assetName, List<String> documentsId, String earnings, List<String> assetOwnedId) {
        this.id = id;
        this.assetName = assetName;
        this.documentsId = documentsId;
        this.earnings = earnings;
        this.assetOwnedId = assetOwnedId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public List<String> getdocumentsId() {
        return documentsId;
    }

    public void setdocumentsId(List<String> documentsId) {
        this.documentsId = documentsId;
    }

    public String getEarnings() {
        return earnings;
    }

    public void setEarnings(String earnings) {
        this.earnings = earnings;
    }

    public List<String> getAssetOwnedId() {
        return assetOwnedId;
    }

    public void setAssetOwnedId(List<String> assetOwnedId) {
        this.assetOwnedId = assetOwnedId;
    }
}

