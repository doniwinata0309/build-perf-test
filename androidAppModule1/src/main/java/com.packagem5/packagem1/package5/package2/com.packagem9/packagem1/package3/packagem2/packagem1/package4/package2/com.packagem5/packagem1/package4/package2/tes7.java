package com.packagem5.packagem1.package5.package2.com.packagem9.packagem1.package3.packagem2.packagem1.package4.package2.com.packagem5.packagem1.package4.package2;


import androidx.databinding.Bindable;
import androidx.databinding.Observable;

import org.parceler.Parcel;

@Parcel
public class tes7 implements Observable {

    protected String propertyName;
    protected String propertyGlobalName;
    protected String propertyLocation;
    protected boolean isDualNameShown;

    protected double propLa;
    protected double propLo;
    protected boolean isMapLaSo;

    protected String propertyId;
    protected String funnelType;
    protected String searchId;
    protected boolean landmarkLoading;

    @Bindable
    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;

    }

    @Bindable
    public String getPropertyGlobalName() {
        return propertyGlobalName;
    }

    public void setPropertyGlobalName(String propertyGlobalName) {
        this.propertyGlobalName = propertyGlobalName;

    }

    @Bindable
    public boolean isDualNameShown() {
        return isDualNameShown;
    }

    public void setDualNameShown(boolean dualNameShown) {
        isDualNameShown = dualNameShown;

    }




    @Bindable
    public double getPropLa() {
        return propLa;
    }

    public void setPropLa(double propLa) {
        this.propLa = propLa;

    }

    @Bindable
    public double getPropLo() {
        return propLo;
    }

    public void setPropLo(double propLo) {
        this.propLo = propLo;

    }

    @Bindable
    public boolean isMapLaSo() {
        return isMapLaSo;
    }

    public void setMapLaSo(boolean mapLaSo) {
        isMapLaSo = mapLaSo;

    }




    public String getPropertyLocation() {
        return propertyLocation;
    }

    public void setPropertyLocation(String propertyLocation) {
        this.propertyLocation = propertyLocation;
    }

    public void setPropertyId(String propertyId) {
        this.propertyId = propertyId;
    }

    public String getPropertyId() {
        return propertyId;
    }

    public void setFunnelType(String funnelType) {
        this.funnelType = funnelType;
    }

    public String getFunnelType() {
        return funnelType;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public String getSearchId() {
        return searchId;
    }


    @Override
    public void addOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }

    @Override
    public void removeOnPropertyChangedCallback(OnPropertyChangedCallback callback) {

    }
}

