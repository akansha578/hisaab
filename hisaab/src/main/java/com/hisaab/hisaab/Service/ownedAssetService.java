package com.hisaab.hisaab.Service;

import com.hisaab.hisaab.Model.OwnedAsset;
import com.hisaab.hisaab.Repository.ownedAssetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class ownedAssetService {

    @Autowired
    private ownedAssetRepository ownedAssetRepo;

    public OwnedAsset createNewOwnedAsset(long id, String assetName , List<String> documents, String earnings , List<String> assetOwnedId) {
       OwnedAsset ownedAsset  = new OwnedAsset(id,assetName,documents , earnings,assetOwnedId);
        return ownedAssetRepo.save(ownedAsset);
    }

    public  OwnedAsset createOwnedAsset(OwnedAsset ownedAsset ) {
        return ownedAssetRepo.save(ownedAsset);
    }




}
