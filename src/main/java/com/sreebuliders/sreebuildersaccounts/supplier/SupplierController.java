package com.sreebuliders.sreebuildersaccounts.supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class SupplierController {
    @Autowired
    private SupplierService supplierService;

    @RequestMapping("/suppliers")
    public List<Supplier> getAllsuppliers(){

        return supplierService.getAllSuppliers();
    }

    @RequestMapping("/suppliers/{id}")
    public Optional<Supplier> getsupplier(@PathVariable Long id){
        return supplierService.getSupplier(id);
    }

    @RequestMapping(method = RequestMethod.POST, value = "/suppliers")
    public void addsupplier(@RequestBody Supplier supplier){

        supplierService.addSupplier(supplier);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/suppliers/{id}")
    public void deletesupplier(@PathVariable Long id){

        supplierService.deleteSupplier(id);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/suppliers")
    public void updatesupplier(@RequestBody Supplier supplier){

        supplierService.updateSupplier(supplier);
    }
}
