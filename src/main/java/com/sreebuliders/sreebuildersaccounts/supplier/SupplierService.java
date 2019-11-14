package com.sreebuliders.sreebuildersaccounts.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class SupplierService {

    @Autowired
    private SupplierRepositry supplierRepositry;

    public List<Supplier> getAllSuppliers() {
            List<Supplier> supplier = new ArrayList<>();
            supplierRepositry.findAll()
                             .forEach(supplier::add);

        return supplier;
    }

    public Optional<Supplier> getSupplier(Long id){

        return supplierRepositry.findById(id);
    }

    public void addSupplier(Supplier supplier){
        supplierRepositry.save(supplier);
    }

    public void updateSupplier(Supplier supplier) {
        supplierRepositry.save(supplier);
    }

    public void deleteSupplier(Long id){
        supplierRepositry.deleteById(id);
    }
}
