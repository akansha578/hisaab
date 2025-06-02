package com.hisaab.hisaab.Service;

import com.hisaab.hisaab.Model.DocumentCharacterstics;
import com.hisaab.hisaab.Repository.documentCharactersticsRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class documentCharactersticsService {

    @Autowired
    private documentCharactersticsRepository documentCharactersticsRepository;

    public DocumentCharacterstics createDocumentCharacterstics(DocumentCharacterstics documentCharacterstics){
        return documentCharactersticsRepository.save(documentCharacterstics);
    }


}
