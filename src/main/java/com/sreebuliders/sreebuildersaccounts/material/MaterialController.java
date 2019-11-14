package com.sreebuliders.sreebuildersaccounts.material;

import com.sreebuliders.sreebuildersaccounts.material.Material;
import com.sreebuliders.sreebuildersaccounts.material.MaterialService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class MaterialController {
    @Autowired
    private MaterialService materialService;

    @RequestMapping("/materials")
    public List<Material> getAllMaterials(){

        return materialService.getAllMaterials();
    }

    @RequestMapping("/materials/{id}")
    public Optional<Material> getMaterial(@PathVariable Long id){
        return materialService.getMaterial(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/materials")
    public void addMaterial(@RequestBody Material material){

        materialService.addMaterial(material);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/materials/{id}")
    public void deleteMaterial(@PathVariable Long id){

        materialService.deleteMaterial(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/materials")
    public void updateMaterial(@RequestBody Material material){

        materialService.updateMaterial(material);
    }
}
