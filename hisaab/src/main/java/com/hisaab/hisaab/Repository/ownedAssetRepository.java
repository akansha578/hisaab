package com.hisaab.hisaab.Repository;

import com.hisaab.hisaab.model.OwnedAsset;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ownedAssetRepository extends JpaRepository<com.hisaab.hisaab.Model.OwnedAsset, Long> {
    static OwnedAsset save(OwnedAsset ownedAsset) {







    }
}
