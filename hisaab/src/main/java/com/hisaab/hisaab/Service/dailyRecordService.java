package com.hisaab.hisaab.Service;

import com.hisaab.hisaab.Model.dailyRecord;
import com.hisaab.hisaab.Repository.dailyRecordRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class dailyRecordService {

    @Autowired
    private dailyRecordRepository dailyRecordRepository;
    public  dailyRecord createDailyRecord(dailyRecord dailyRecord){
        return dailyRecordRepository.save(dailyRecord);
    }
}
