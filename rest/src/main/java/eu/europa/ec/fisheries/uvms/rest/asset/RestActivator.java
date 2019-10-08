/*
﻿Developed with the contribution of the European Commission - Directorate General for Maritime Affairs and Fisheries
© European Union, 2015-2016.

This file is part of the Integrated Fisheries Data Management (IFDM) Suite. The IFDM Suite is free software: you can
redistribute it and/or modify it under the terms of the GNU General Public License as published by the
Free Software Foundation, either version 3 of the License, or any later version. The IFDM Suite is distributed in
the hope that it will be useful, but WITHOUT ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
FITNESS FOR A PARTICULAR PURPOSE.  See the GNU General Public License for more details. You should have received a
copy of the GNU General Public License along with the IFDM Suite. If not, see <http://www.gnu.org/licenses/>.
 */
package eu.europa.ec.fisheries.uvms.rest.asset;

import eu.europa.ec.fisheries.uvms.rest.mobileterminal.V2.service.MobileTerminalRestResource2;
import eu.europa.ec.fisheries.uvms.rest.mobileterminal.V2.service.PluginRestResource2;
import eu.europa.ec.fisheries.uvms.rest.mobileterminal.V2.service.PollRestResource2;
import eu.europa.ec.fisheries.uvms.rest.asset.V2.service.*;
import eu.europa.ec.fisheries.uvms.rest.asset.filter.AssetRestExceptionMapper;
import eu.europa.ec.fisheries.uvms.rest.asset.service.*;
import eu.europa.ec.fisheries.uvms.rest.mobileterminal.services.MobileTerminalRestResource;
import eu.europa.ec.fisheries.uvms.rest.mobileterminal.services.PluginRestResource;
import eu.europa.ec.fisheries.uvms.rest.mobileterminal.services.PollRestResource;
import eu.europa.ec.fisheries.uvms.rest.security.UnionVMSFeatureFilter;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

@ApplicationPath("/rest")
public class RestActivator extends Application {

    private final Set<Object> singletons = new HashSet<>();
    private final Set<Class<?>> set = new HashSet<>();

    public RestActivator() {
        set.add(AssetRestExceptionMapper.class);
        set.add(AssetRestResource.class);
        set.add(AssetGroupResource.class);
        set.add(AssetConfigResource.class);
        set.add(CustomCodesResource.class);
        set.add(InternalResource.class);
        set.add(UnionVMSFeatureFilter.class);
        set.add(ObjectMapperContextResolver.class);
        set.add(com.github.phillipkruger.apiee.ApieeService.class);
        set.add(MobileTerminalRestResource.class);
        set.add(PollRestResource.class);
        set.add(PluginRestResource.class);
        set.add(SSEResource.class);

        //V2
        set.add(AssetConfigRestResource2.class);
        set.add(AssetGroupRestResource2.class);
        set.add(AssetRestResource2.class);
        set.add(CustomCodesRestResource2.class);
        set.add(InternalRestResource2.class);
        set.add(MobileTerminalRestResource2.class);
        set.add(PluginRestResource2.class);
        set.add(PollRestResource2.class);
    }

    @Override
    public Set<Class<?>> getClasses() {
        return set;
    }

    @Override
    public Set<Object> getSingletons() {
        return singletons;
    }
}