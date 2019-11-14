package com.sreebuliders.sreebuildersaccounts.site;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SiteService {

    @Autowired
    private SiteRepositry siteRepositry;

    public List<Site> getAllSites() {
            List<Site> site = new ArrayList<>();
            siteRepositry.findAll()
                             .forEach(site::add);

        return site;
    }

    public Optional<Site> getSite(Long id){

        return siteRepositry.findById(id);
    }

    public void addSite(Site site){
        siteRepositry.save(site);
    }

    public void updateSite(Site site) {
        siteRepositry.save(site);
    }

    public void deleteSite(Long id){
        siteRepositry.deleteById(id);
    }
}
