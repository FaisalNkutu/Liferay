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

import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import org.tvd.thptty.service.persistence.SemesterPK;

import java.io.Serializable;

/**
 * The base model interface for the Semester service. Represents a row in the &quot;TY_Semester&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.tvd.thptty.model.impl.SemesterModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.tvd.thptty.model.impl.SemesterImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a semester model instance should use the {@link Semester} interface instead.
 * </p>
 *
 * @author Ta Van Dung
 * @see Semester
 * @see org.tvd.thptty.model.impl.SemesterImpl
 * @see org.tvd.thptty.model.impl.SemesterModelImpl
 * @generated
 */
public interface SemesterModel extends BaseModel<Semester> {
	/**
	 * Gets the primary key of this semester.
	 *
	 * @return the primary key of this semester
	 */
	public SemesterPK getPrimaryKey();

	/**
	 * Sets the primary key of this semester
	 *
	 * @param pk the primary key of this semester
	 */
	public void setPrimaryKey(SemesterPK pk);

	/**
	 * Gets the company id of this semester.
	 *
	 * @return the company id of this semester
	 */
	public long getCompanyId();

	/**
	 * Sets the company id of this semester.
	 *
	 * @param companyId the company id of this semester
	 */
	public void setCompanyId(long companyId);

	/**
	 * Gets the group id of this semester.
	 *
	 * @return the group id of this semester
	 */
	public long getGroupId();

	/**
	 * Sets the group id of this semester.
	 *
	 * @param groupId the group id of this semester
	 */
	public void setGroupId(long groupId);

	/**
	 * Gets the semester id of this semester.
	 *
	 * @return the semester id of this semester
	 */
	public int getSemesterId();

	/**
	 * Sets the semester id of this semester.
	 *
	 * @param semesterId the semester id of this semester
	 */
	public void setSemesterId(int semesterId);

	/**
	 * Gets the status of this semester.
	 *
	 * @return the status of this semester
	 */
	public int getStatus();

	/**
	 * Sets the status of this semester.
	 *
	 * @param status the status of this semester
	 */
	public void setStatus(int status);

	/**
	 * Gets a copy of this semester as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public Semester toEscapedModel();

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

	public int compareTo(Semester semester);

	public int hashCode();

	public String toString();

	public String toXmlString();
}