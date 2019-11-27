package com.sreebuliders.sreebuildersaccounts.material;

import com.sreebuliders.sreebuildersaccounts.inwarddetails.InwardDetailsEntry;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "MATERIAL")
public class Material {


    private Long materialId;
    private String materialName;
    private String materialSubType;

    public Material(){

    }
    public Material(Long materialId, String materialName, String materialSubType) {
        super();
        this.materialId = materialId;
        this.materialName = materialName;
        this.materialSubType = materialSubType;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @Column(name = "MAT_ID", nullable = false)
    public Long getMaterialId() {
        return materialId;
    }

    public void setMaterialId(Long materialId) {
        this.materialId = materialId;
    }

    @Column(name = "MAT_NAME", nullable = false)
    public String getMaterialName() {
        return materialName;
    }

    public void setMaterialName(String materialName) {
        this.materialName = materialName;
    }
    @Column(name = "MAT_SUB_TYPE", nullable = false)
    public String getMaterialSubType() {
        return materialSubType;
    }

    public void setMaterialSubType(String materialSubType) {
        this.materialSubType = materialSubType;
    }

}
