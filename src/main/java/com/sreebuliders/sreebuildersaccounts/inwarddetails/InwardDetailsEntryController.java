package com.sreebuliders.sreebuildersaccounts.inwarddetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InwardDetailsEntryController {
    @Autowired
    private InwardDetailsEntryService inwardDetalsEntryService;

    @RequestMapping("/inwarddetails")
    public List<InwardDetailsEntry> getAllInwardDetailsEntry(){

        return inwardDetalsEntryService.getAllInwardDetailsEntry();
    }

    @RequestMapping("/inwarddetails/{id}")
    public Optional<InwardDetailsEntry> getInwardDetailsEntry(@PathVariable Long id){
        return inwardDetalsEntryService.getInwardDetailsEntry(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/inwarddetails")
    public void addMaterial(@RequestBody InwardDetailsEntry inwardDetailsEntry){

        inwardDetalsEntryService.addInwardDetailsEntry(inwardDetailsEntry);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/inwarddetails/{id}")
    public void deleteMaterial(@PathVariable Long id){

        inwardDetalsEntryService.deleteInwardDetailsEntry(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/inwarddetails")
    public void updateMaterial(@RequestBody InwardDetailsEntry inwardDetailsEntry){

        inwardDetalsEntryService.updateInwardDetailsEntry(inwardDetailsEntry);
    }
}
