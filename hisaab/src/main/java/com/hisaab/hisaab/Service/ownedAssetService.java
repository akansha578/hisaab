package com.hisaab.hisaab.service;

import com.hisaab.hisaab.Repository.ownedAssetRepository;
import com.hisaab.hisaab.model.DocumentCharacterstics;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.hisaab.hisaab.model.OwnedAsset;
import java.util.List;

@Service
public class ownedAssetService {

    @Autowired
    private ownedAssetRepository ownedAssetRepo;

    public OwnedAsset createNewOwnedAsset(long id, String assetName ,List<DocumentCharacterstics> documents,String earnings , List<String> assetOwnedId) {
       OwnedAsset ownedAsset  = new OwnedAsset(id,assetName,documents , earnings,assetOwnedId);
        return ownedAssetRepository.save(ownedAsset);
    }

    public static com.hisaab.hisaab.model.OwnedAsset createOwnedAsset(OwnedAsset ownedAsset ) {
        return ownedAssetRepository.save(ownedAsset);
    }




}
