package com.sreebuliders.sreebuildersaccounts.inwarddetails;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class InwardDetailsEntryController {
    @Autowired
    private InwardDetailsEntryService inwardDetailsEntryService;

    @RequestMapping("/inwarddetails")
    public List<InwardDetailsEntry> getAllInwardDetailsEntry(){

        return inwardDetailsEntryService.getAllInwardDetailsEntry();
    }

    @RequestMapping("/inwarddetails/{id}")
    public Optional<InwardDetailsEntry> getInwardDetailsEntry(@PathVariable Long id){
        return inwardDetailsEntryService.getInwardDetailsEntry(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/inwarddetails")
    public void addMaterial(@RequestBody InwardDetailsEntry inwardDetailsEntry){

        inwardDetailsEntryService.addInwardDetailsEntry(inwardDetailsEntry);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/inwarddetails/{id}")
    public void deleteMaterial(@PathVariable Long id){

        inwardDetailsEntryService.deleteInwardDetailsEntry(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/inwarddetails")
    public void updateMaterial(@RequestBody InwardDetailsEntry inwardDetailsEntry){

        inwardDetailsEntryService.updateInwardDetailsEntry(inwardDetailsEntry);
    }
}
