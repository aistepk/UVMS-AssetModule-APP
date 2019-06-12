package eu.europa.ec.fisheries.uvms.asset.dto;

import java.util.UUID;

public class MicroAsset {

    String assetId;
    String flagstate;
    String assetName;
    String vesselType;
    String ircs;
    String cfr;
    String externalMarking;
    Double lengthOverAll;

    public MicroAsset(UUID assetId, String flagstate, String assetName, String vesselType, String ircs, String cfr, String externalMarking, Double lengthOverAll) {
        this.assetId = assetId.toString();
        this.flagstate = flagstate;
        this.assetName = assetName;
        this.vesselType = vesselType;
        this.ircs = ircs;
        this.cfr = cfr;
        this.externalMarking = externalMarking;
        this.lengthOverAll = lengthOverAll;
    }

    public MicroAsset() {
    }

    public String getAssetId() {
        return assetId;
    }

    public void setAssetId(String assetId) {
        this.assetId = assetId;
    }

    public String getFlagstate() {
        return flagstate;
    }

    public void setFlagstate(String flagstate) {
        this.flagstate = flagstate;
    }

    public String getAssetName() {
        return assetName;
    }

    public void setAssetName(String assetName) {
        this.assetName = assetName;
    }

    public String getVesselType() {
        return vesselType;
    }

    public void setVesselType(String vesselType) {
        this.vesselType = vesselType;
    }

    public String getIrcs() {
        return ircs;
    }

    public void setIrcs(String ircs) {
        this.ircs = ircs;
    }

    public String getCfr() {
        return cfr;
    }

    public void setCfr(String cfr) {
        this.cfr = cfr;
    }

    public String getExternalMarking() {
        return externalMarking;
    }

    public void setExternalMarking(String externalMarking) {
        this.externalMarking = externalMarking;
    }

    public Double getLengthOverAll() {
        return lengthOverAll;
    }

    public void setLengthOverAll(Double lengthOverAll) {
        this.lengthOverAll = lengthOverAll;
    }
}
