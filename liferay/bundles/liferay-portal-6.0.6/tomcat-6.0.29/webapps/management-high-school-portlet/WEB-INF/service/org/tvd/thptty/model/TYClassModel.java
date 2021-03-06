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

package org.tvd.thptty.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the TYClass service. Represents a row in the &quot;TY_TYClass&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.tvd.thptty.model.impl.TYClassModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.tvd.thptty.model.impl.TYClassImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a t y class model instance should use the {@link TYClass} interface instead.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClass
 * @see org.tvd.thptty.model.impl.TYClassImpl
 * @see org.tvd.thptty.model.impl.TYClassModelImpl
 * @generated
 */
public interface TYClassModel extends BaseModel<TYClass> {
	/**
	 * Gets the primary key of this t y class.
	 *
	 * @return the primary key of this t y class
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this t y class
	 *
	 * @param pk the primary key of this t y class
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the class id of this t y class.
	 *
	 * @return the class id of this t y class
	 */
	public long getClassId();

	/**
	 * Sets the class id of this t y class.
	 *
	 * @param classId the class id of this t y class
	 */
	public void setClassId(long classId);

	/**
	 * Gets the company id of this t y class.
	 *
	 * @return the company id of this t y class
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this t y class.
	 *
	 * @param companyId the company id of this t y class
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the group id of this t y class.
	 *
	 * @return the group id of this t y class
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this t y class.
	 *
	 * @param groupId the group id of this t y class
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the class code of this t y class.
	 *
	 * @return the class code of this t y class
	 */
	@AutoEscape
	public String getClassCode();

	/**
	 * Sets the class code of this t y class.
	 *
	 * @param classCode the class code of this t y class
	 */
	public void setClassCode(String classCode);

	/**
	 * Gets the class group of this t y class.
	 *
	 * @return the class group of this t y class
	 */
	public int getClassGroup();

	/**
	 * Sets the class group of this t y class.
	 *
	 * @param classGroup the class group of this t y class
	 */
	public void setClassGroup(int classGroup);

	/**
	 * Gets the class name of this t y class.
	 *
	 * @return the class name of this t y class
	 */
	@AutoEscape
	public String getClassName();

	/**
	 * Sets the class name of this t y class.
	 *
	 * @param className the class name of this t y class
	 */
	public void setClassName(String className);

	/**
	 * Gets the modified date of this t y class.
	 *
	 * @return the modified date of this t y class
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this t y class.
	 *
	 * @param modifiedDate the modified date of this t y class
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Gets the user id of this t y class.
	 *
	 * @return the user id of this t y class
	 */
	public long getUserId();

	/**
	 * Sets the user id of this t y class.
	 *
	 * @param userId the user id of this t y class
	 */
	public void setUserId(long userId);

	/**
	 * Gets the user uuid of this t y class.
	 *
	 * @return the user uuid of this t y class
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this t y class.
	 *
	 * @param userUuid the user uuid of this t y class
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Gets a copy of this t y class as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public TYClass toEscapedModel();

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

	public int compareTo(TYClass tyClass);

	public int hashCode();

	public String toString();

	public String toXmlString();
}