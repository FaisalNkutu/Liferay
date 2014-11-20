/**
 * Copyright (c) 2000-2011 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.inkwell.internet.productregistration.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the PRRegistration service. Represents a row in the &quot;PR_PRRegistration&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.inkwell.internet.productregistration.model.impl.PRRegistrationModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.inkwell.internet.productregistration.model.impl.PRRegistrationImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a p r registration model instance should use the {@link PRRegistration} interface instead.
 * </p>
 *
 * @author Rich Sezov
 * @see PRRegistration
 * @see com.inkwell.internet.productregistration.model.impl.PRRegistrationImpl
 * @see com.inkwell.internet.productregistration.model.impl.PRRegistrationModelImpl
 * @generated
 */
public interface PRRegistrationModel extends BaseModel<PRRegistration> {
	/**
	 * Gets the primary key of this p r registration.
	 *
	 * @return the primary key of this p r registration
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this p r registration
	 *
	 * @param pk the primary key of this p r registration
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the registration id of this p r registration.
	 *
	 * @return the registration id of this p r registration
	 */
	public long getRegistrationId();

	/**
	 * Sets the registration id of this p r registration.
	 *
	 * @param registrationId the registration id of this p r registration
	 */
	public void setRegistrationId(long registrationId);

	/**
	 * Gets the pr user id of this p r registration.
	 *
	 * @return the pr user id of this p r registration
	 */
	public long getPrUserId();

	/**
	 * Sets the pr user id of this p r registration.
	 *
	 * @param prUserId the pr user id of this p r registration
	 */
	public void setPrUserId(long prUserId);

	/**
	 * Gets the pr user uuid of this p r registration.
	 *
	 * @return the pr user uuid of this p r registration
	 * @throws SystemException if a system exception occurred
	 */
	public String getPrUserUuid() throws SystemException;

	/**
	 * Sets the pr user uuid of this p r registration.
	 *
	 * @param prUserUuid the pr user uuid of this p r registration
	 */
	public void setPrUserUuid(String prUserUuid);

	/**
	 * Gets the date purchased of this p r registration.
	 *
	 * @return the date purchased of this p r registration
	 */
	public Date getDatePurchased();

	/**
	 * Sets the date purchased of this p r registration.
	 *
	 * @param datePurchased the date purchased of this p r registration
	 */
	public void setDatePurchased(Date datePurchased);

	/**
	 * Gets the how hear of this p r registration.
	 *
	 * @return the how hear of this p r registration
	 */
	@AutoEscape
	public String getHowHear();

	/**
	 * Sets the how hear of this p r registration.
	 *
	 * @param howHear the how hear of this p r registration
	 */
	public void setHowHear(String howHear);

	/**
	 * Gets the where purchased of this p r registration.
	 *
	 * @return the where purchased of this p r registration
	 */
	@AutoEscape
	public String getWherePurchased();

	/**
	 * Sets the where purchased of this p r registration.
	 *
	 * @param wherePurchased the where purchased of this p r registration
	 */
	public void setWherePurchased(String wherePurchased);

	/**
	 * Gets the serial number of this p r registration.
	 *
	 * @return the serial number of this p r registration
	 */
	@AutoEscape
	public String getSerialNumber();

	/**
	 * Sets the serial number of this p r registration.
	 *
	 * @param serialNumber the serial number of this p r registration
	 */
	public void setSerialNumber(String serialNumber);

	/**
	 * Gets the product id of this p r registration.
	 *
	 * @return the product id of this p r registration
	 */
	public long getProductId();

	/**
	 * Sets the product id of this p r registration.
	 *
	 * @param productId the product id of this p r registration
	 */
	public void setProductId(long productId);

	/**
	 * Gets the company id of this p r registration.
	 *
	 * @return the company id of this p r registration
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this p r registration.
	 *
	 * @param companyId the company id of this p r registration
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the group id of this p r registration.
	 *
	 * @return the group id of this p r registration
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this p r registration.
	 *
	 * @param groupId the group id of this p r registration
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets a copy of this p r registration as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public PRRegistration toEscapedModel();

	public boolean isNew();

	public void setNew(boolean n);

	public boolean isCachedModel();

	public void setCachedModel(boolean cachedModel);

	public boolean isEscapedModel();

	public void setEscapedModel(boolean escapedModel);

	public Serializable getPrimaryKeyObj();

	public ExpandoBridge getExpandoBridge();

	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	public Object clone();

	public int compareTo(PRRegistration prRegistration);

	public int hashCode();

	public String toString();

	public String toXmlString();
}