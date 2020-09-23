/*
 Developed by the European Commission - Directorate General for Maritime Affairs and Fisheries @ European Union, 2015-2020.

 This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can redistribute it
 and/or modify it under the terms of the GNU General Public License as published by the Free Software Foundation, either version 3 of
 the License, or any later version. The IFDM Suite is distributed in the hope that it will be useful, but WITHOUT ANY WARRANTY;
 without even the implied warranty of MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more
 details. You should have received a copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 */
package eu.europa.ec.fisheries.uvms.asset.rest.client;

import java.util.Date;
import java.util.List;

import eu.europa.ec.fisheries.wsdl.asset.group.AssetGroup;
import eu.europa.ec.fisheries.wsdl.asset.module.AssetGroupsForAssetRequest;
import eu.europa.ec.fisheries.wsdl.asset.module.AssetGroupsForAssetResponse;
import eu.europa.ec.fisheries.wsdl.asset.module.AssetIdsForGroupRequest;
import eu.europa.ec.fisheries.wsdl.asset.module.FindAssetHistGuidByAssetGuidAndOccurrenceDateRequest;
import eu.europa.ec.fisheries.wsdl.asset.module.FindAssetHistGuidByAssetGuidAndOccurrenceDateResponse;
import eu.europa.ec.fisheries.wsdl.asset.module.FindVesselIdsByAssetHistGuidRequest;
import eu.europa.ec.fisheries.wsdl.asset.module.FindVesselIdsByAssetHistGuidResponse;
import eu.europa.ec.fisheries.wsdl.asset.module.FindVesselIdsByMultipleAssetHistGuidsRequest;
import eu.europa.ec.fisheries.wsdl.asset.module.FindVesselIdsByMultipleAssetHistGuidsResponse;
import eu.europa.ec.fisheries.wsdl.asset.types.Asset;
import eu.europa.ec.fisheries.wsdl.asset.types.AssetId;
import eu.europa.ec.fisheries.wsdl.asset.types.AssetIdsForGroupGuidResponseElement;
import eu.europa.ec.fisheries.wsdl.asset.types.AssetListQuery;
import eu.europa.ec.fisheries.wsdl.asset.types.BatchAssetListResponseElement;
import eu.europa.ec.fisheries.wsdl.asset.types.ListAssetResponse;

import javax.ws.rs.QueryParam;

public interface AssetClient {
    List<Asset> findHistoryOfAssetByCfr(String cfr);

    List<Asset> findHistoryOfAssetBy(String reportDate, String cfr, String regCountry, String ircs, String extMark, String iccat, String uvi);

    List<BatchAssetListResponseElement> getAssetListBatch(List<AssetListQuery> assetBatchRequest);

    Asset getAsset(AssetId assetId);

    List<AssetGroup> getAssetGroupListByAssetGuid(String assetGuid);

    FindVesselIdsByAssetHistGuidResponse findVesselIdsByAssetHistGuid(FindVesselIdsByAssetHistGuidRequest request);

    FindVesselIdsByMultipleAssetHistGuidsResponse findVesselIdsByMultipleAssetHistGuid(FindVesselIdsByMultipleAssetHistGuidsRequest request);

    FindAssetHistGuidByAssetGuidAndOccurrenceDateResponse findAssetHistGuidByAssetGuidAndOccurrenceDate(FindAssetHistGuidByAssetGuidAndOccurrenceDateRequest request);

    AssetGroupsForAssetResponse findAssetGroupsForAsset(AssetGroupsForAssetRequest request);

    AssetIdsForGroupGuidResponseElement findAssetIdentifiersForGroupGuid(AssetIdsForGroupRequest request);


    ListAssetResponse getAssetListByQuery(AssetListQuery query);

    List<Asset> getAssetGroup(List<AssetGroup> assetGroupQuery);

    Asset getAssetFromAssetGuidAndDate(String assetGuid, Date occurrenceDate);

    Asset getAssetFromAssetHistGuid(String assetHistId);
}