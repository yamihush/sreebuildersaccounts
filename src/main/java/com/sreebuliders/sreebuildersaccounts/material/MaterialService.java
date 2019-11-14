package com.sreebuliders.sreebuildersaccounts.material;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class MaterialService {

    @Autowired
    private MaterialRepositry materialRepositry;

    public List<Material> getAllMaterials() {
            List<Material> materials = new ArrayList<>();
            materialRepositry.findAll()
                             .forEach(materials::add);

        return materials;
    }

    public Optional<Material> getMaterial(Long id){

        return materialRepositry.findById(id);
    }

    public void addMaterial(Material material){
        materialRepositry.save(material);
    }

    public void updateMaterial(Material material) {
        materialRepositry.save(material);
    }

    public void deleteMaterial(Long id){
        materialRepositry.deleteById(id);
    }
}
