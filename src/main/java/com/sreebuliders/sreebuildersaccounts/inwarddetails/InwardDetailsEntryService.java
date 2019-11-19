package com.sreebuliders.sreebuildersaccounts.inwarddetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class InwardDetailsEntryService {

    @Autowired
    private InwardDetailsEntryRepositry inwardDetailsEntryRepositry;

    public List<InwardDetailsEntry> getAllInwardDetailsEntry() {
            List<InwardDetailsEntry> inwarddetailsentry = new ArrayList<>();
        inwardDetailsEntryRepositry.findAll()
                             .forEach(inwarddetailsentry::add);

        return inwarddetailsentry;
    }

    public Optional<InwardDetailsEntry> getInwardDetailsEntry(Long id){

        return inwardDetailsEntryRepositry.findById(id);
    }

    public void addInwardDetailsEntry(InwardDetailsEntry inwardDetailsEntry){
        inwardDetailsEntryRepositry.save(inwardDetailsEntry);
    }

    public void updateInwardDetailsEntry(InwardDetailsEntry inwardDetailsEntry) {
        inwardDetailsEntryRepositry.save(inwardDetailsEntry);
    }

    public void deleteInwardDetailsEntry(Long id){
        inwardDetailsEntryRepositry.deleteById(id);
    }
}
