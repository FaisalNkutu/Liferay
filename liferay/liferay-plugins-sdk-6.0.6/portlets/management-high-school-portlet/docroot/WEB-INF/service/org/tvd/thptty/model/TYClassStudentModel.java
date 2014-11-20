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

import org.tvd.thptty.service.persistence.TYClassStudentPK;

import java.io.Serializable;

/**
 * The base model interface for the TYClassStudent service. Represents a row in the &quot;TY_TYClassStudent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link org.tvd.thptty.model.impl.TYClassStudentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link org.tvd.thptty.model.impl.TYClassStudentImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a t y class student model instance should use the {@link TYClassStudent} interface instead.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClassStudent
 * @see org.tvd.thptty.model.impl.TYClassStudentImpl
 * @see org.tvd.thptty.model.impl.TYClassStudentModelImpl
 * @generated
 */
public interface TYClassStudentModel extends BaseModel<TYClassStudent> {
	/**
	 * Gets the primary key of this t y class student.
	 *
	 * @return the primary key of this t y class student
	 */
	public TYClassStudentPK getPrimaryKey();

	/**
	 * Sets the primary key of this t y class student
	 *
	 * @param pk the primary key of this t y class student
	 */
	public void setPrimaryKey(TYClassStudentPK pk);

	/**
	 * Gets the courses of this t y class student.
	 *
	 * @return the courses of this t y class student
	 */
	public int getCourses();

	/**
	 * Sets the courses of this t y class student.
	 *
	 * @param courses the courses of this t y class student
	 */
	public void setCourses(int courses);

	/**
	 * Gets the student id of this t y class student.
	 *
	 * @return the student id of this t y class student
	 */
	public long getStudentId();

	/**
	 * Sets the student id of this t y class student.
	 *
	 * @param studentId the student id of this t y class student
	 */
	public void setStudentId(long studentId);

	/**
	 * Gets the class id of this t y class student.
	 *
	 * @return the class id of this t y class student
	 */
	public long getClassId();

	/**
	 * Sets the class id of this t y class student.
	 *
	 * @param classId the class id of this t y class student
	 */
	public void setClassId(long classId);

	/**
	 * Gets a copy of this t y class student as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public TYClassStudent toEscapedModel();

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

	public int compareTo(TYClassStudent tyClassStudent);

	public int hashCode();

	public String toString();

	public String toXmlString();
}