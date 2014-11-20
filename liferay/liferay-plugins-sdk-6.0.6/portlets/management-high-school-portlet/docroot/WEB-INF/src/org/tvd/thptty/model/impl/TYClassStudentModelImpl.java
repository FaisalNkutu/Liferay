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

package org.tvd.thptty.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;

import org.tvd.thptty.model.TYClassStudent;
import org.tvd.thptty.model.TYClassStudentModel;
import org.tvd.thptty.service.persistence.TYClassStudentPK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

/**
 * The base model implementation for the TYClassStudent service. Represents a row in the &quot;TY_TYClassStudent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.tvd.thptty.model.TYClassStudentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TYClassStudentImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a t y class student model instance should use the {@link org.tvd.thptty.model.TYClassStudent} interface instead.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYClassStudentImpl
 * @see org.tvd.thptty.model.TYClassStudent
 * @see org.tvd.thptty.model.TYClassStudentModel
 * @generated
 */
public class TYClassStudentModelImpl extends BaseModelImpl<TYClassStudent>
	implements TYClassStudentModel {
	public static final String TABLE_NAME = "TY_TYClassStudent";
	public static final Object[][] TABLE_COLUMNS = {
			{ "courses", new Integer(Types.INTEGER) },
			{ "studentId", new Integer(Types.BIGINT) },
			{ "classId", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table TY_TYClassStudent (courses INTEGER not null,studentId LONG not null,classId LONG,primary key (courses, studentId))";
	public static final String TABLE_SQL_DROP = "drop table TY_TYClassStudent";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.tvd.thptty.model.TYClassStudent"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.tvd.thptty.model.TYClassStudent"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.tvd.thptty.model.TYClassStudent"));

	public TYClassStudentModelImpl() {
	}

	public TYClassStudentPK getPrimaryKey() {
		return new TYClassStudentPK(_courses, _studentId);
	}

	public void setPrimaryKey(TYClassStudentPK pk) {
		setCourses(pk.courses);
		setStudentId(pk.studentId);
	}

	public Serializable getPrimaryKeyObj() {
		return new TYClassStudentPK(_courses, _studentId);
	}

	public int getCourses() {
		return _courses;
	}

	public void setCourses(int courses) {
		if (!_setOriginalCourses) {
			_setOriginalCourses = true;

			_originalCourses = _courses;
		}

		_courses = courses;
	}

	public int getOriginalCourses() {
		return _originalCourses;
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		if (!_setOriginalStudentId) {
			_setOriginalStudentId = true;

			_originalStudentId = _studentId;
		}

		_studentId = studentId;
	}

	public long getOriginalStudentId() {
		return _originalStudentId;
	}

	public long getClassId() {
		return _classId;
	}

	public void setClassId(long classId) {
		_classId = classId;
	}

	public TYClassStudent toEscapedModel() {
		if (isEscapedModel()) {
			return (TYClassStudent)this;
		}
		else {
			return (TYClassStudent)Proxy.newProxyInstance(TYClassStudent.class.getClassLoader(),
				new Class[] { TYClassStudent.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYClassStudentImpl tyClassStudentImpl = new TYClassStudentImpl();

		tyClassStudentImpl.setCourses(getCourses());

		TYClassStudentModelImpl tyClassStudentModelImpl = tyClassStudentImpl;

		tyClassStudentModelImpl._originalCourses = tyClassStudentModelImpl._courses;

		tyClassStudentModelImpl._setOriginalCourses = false;
		tyClassStudentImpl.setStudentId(getStudentId());

		tyClassStudentModelImpl._originalStudentId = tyClassStudentModelImpl._studentId;

		tyClassStudentModelImpl._setOriginalStudentId = false;
		tyClassStudentImpl.setClassId(getClassId());

		return tyClassStudentImpl;
	}

	public int compareTo(TYClassStudent tyClassStudent) {
		TYClassStudentPK pk = tyClassStudent.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYClassStudent tyClassStudent = null;

		try {
			tyClassStudent = (TYClassStudent)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		TYClassStudentPK pk = tyClassStudent.getPrimaryKey();

		if (getPrimaryKey().equals(pk)) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return getPrimaryKey().hashCode();
	}

	public String toString() {
		StringBundler sb = new StringBundler(7);

		sb.append("{courses=");
		sb.append(getCourses());
		sb.append(", studentId=");
		sb.append(getStudentId());
		sb.append(", classId=");
		sb.append(getClassId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(13);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYClassStudent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courses</column-name><column-value><![CDATA[");
		sb.append(getCourses());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentId</column-name><column-value><![CDATA[");
		sb.append(getStudentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>classId</column-name><column-value><![CDATA[");
		sb.append(getClassId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _courses;
	private int _originalCourses;
	private boolean _setOriginalCourses;
	private long _studentId;
	private long _originalStudentId;
	private boolean _setOriginalStudentId;
	private long _classId;
}