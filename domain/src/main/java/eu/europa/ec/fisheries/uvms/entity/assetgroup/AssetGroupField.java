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
package eu.europa.ec.fisheries.uvms.entity.assetgroup;

import java.io.Serializable;
import java.time.LocalDateTime;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import static eu.europa.ec.fisheries.uvms.entity.assetgroup.AssetGroupField.ASSETGROUP_FIELD_CLEAR;
import static eu.europa.ec.fisheries.uvms.entity.assetgroup.AssetGroupField.ASSETGROUP_FIELD_GETBYID;
import static eu.europa.ec.fisheries.uvms.entity.assetgroup.AssetGroupField.ASSETGROUP_RETRIEVE_FIELDS_FOR_GROUP;


/**
 * The persistent class for the assetgroupfield database table.
 * 
 */
@Entity
@Table(name="Assetgroupfield")
@NamedQueries({
		@NamedQuery(name="Assetgroupfield.findAll", query="SELECT a FROM AssetGroupField a"),
		@NamedQuery(name=ASSETGROUP_FIELD_GETBYID, query="SELECT a FROM AssetGroupField a where a.id=:id"),
		@NamedQuery(name=ASSETGROUP_FIELD_CLEAR, query="DELETE  FROM AssetGroupField a where a.assetgroup=:assetgroup"),
		@NamedQuery(name=ASSETGROUP_RETRIEVE_FIELDS_FOR_GROUP, query="SELECT a  FROM AssetGroupField a where a.assetgroup=:assetgroup"),
})
public class AssetGroupField implements Serializable {
	private static final long serialVersionUID = 1L;

	public static final String ASSETGROUP_FIELD_CLEAR = "Assetgroupfield.clear";
	public static final String ASSETGROUP_FIELD_GETBYID = "Assetgroupfield.getbyid";
	public static final String ASSETGROUP_RETRIEVE_FIELDS_FOR_GROUP = "Assetgroupfield.retrievefieldsforgroup";


	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id")
	private Long id;

	@Size(max=80)
	@NotNull
	@Column(name="field")
	private String field;

	@Column(name="updatetime")
	private LocalDateTime updateTime;

	@Size(max=60)
	@Column(name="updateuser")
	private String updatedBy;

	@Size(max=100)
	@NotNull
	@Column(name="value")
	private String value;

	@ManyToOne(fetch=FetchType.LAZY, cascade=CascadeType.ALL)
	@JoinColumn(name="group_id")
	private AssetGroupEntity assetgroup;

	public AssetGroupField() {
	}

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getField() {
		return this.field;
	}

	public void setField(String filterField) {
		this.field = filterField;
	}

	public LocalDateTime getUpdateTime() {
		return this.updateTime;
	}

	public void setUpdateTime(LocalDateTime updateTime) {
		this.updateTime = updateTime;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public String getValue() {
		return this.value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public AssetGroupEntity getAssetGroup() {
		return this.assetgroup;
	}

	public void setAssetGroup(AssetGroupEntity assetgroup) {
		this.assetgroup = assetgroup;
	}

}