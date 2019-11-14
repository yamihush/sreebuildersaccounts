package com.sreebuliders.sreebuildersaccounts.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SiteController {
    @Autowired
    private SiteService siteService;

    @RequestMapping("/sites")
    public List<Site> getAllSites(){

        return siteService.getAllSites();
    }

    @RequestMapping("/sites/{id}")
    public Optional<Site> getSite(@PathVariable Long id){
        return siteService.getSite(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/sites")
    public void addSite(@RequestBody Site site){

        siteService.addSite(site);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/sites/{id}")
    public void deleteSite(@PathVariable Long id){

        siteService.deleteSite(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/sites")
    public void updateSite(@RequestBody Site site){

        siteService.updateSite(site);
    }
}
