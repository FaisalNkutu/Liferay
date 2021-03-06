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
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import org.tvd.thptty.model.TYStudentPointReserve;
import org.tvd.thptty.model.TYStudentPointReserveModel;
import org.tvd.thptty.service.persistence.TYStudentPointReservePK;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the TYStudentPointReserve service. Represents a row in the &quot;TY_TYStudentPointReserve&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.tvd.thptty.model.TYStudentPointReserveModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TYStudentPointReserveImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a t y student point reserve model instance should use the {@link org.tvd.thptty.model.TYStudentPointReserve} interface instead.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentPointReserveImpl
 * @see org.tvd.thptty.model.TYStudentPointReserve
 * @see org.tvd.thptty.model.TYStudentPointReserveModel
 * @generated
 */
public class TYStudentPointReserveModelImpl extends BaseModelImpl<TYStudentPointReserve>
	implements TYStudentPointReserveModel {
	public static final String TABLE_NAME = "TY_TYStudentPointReserve";
	public static final Object[][] TABLE_COLUMNS = {
			{ "courses", new Integer(Types.INTEGER) },
			{ "semester", new Integer(Types.INTEGER) },
			{ "studentId", new Integer(Types.BIGINT) },
			{ "subjectId", new Integer(Types.BIGINT) },
			{ "pointType", new Integer(Types.INTEGER) },
			{ "pointIndex", new Integer(Types.INTEGER) },
			{ "pointFactor", new Integer(Types.INTEGER) },
			{ "point", new Integer(Types.DOUBLE) },
			{ "modifiedDate", new Integer(Types.TIMESTAMP) },
			{ "userId", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table TY_TYStudentPointReserve (courses INTEGER not null,semester INTEGER not null,studentId LONG not null,subjectId LONG not null,pointType INTEGER not null,pointIndex INTEGER not null,pointFactor INTEGER not null,point DOUBLE,modifiedDate DATE null,userId LONG,primary key (courses, semester, studentId, subjectId, pointType, pointIndex, pointFactor))";
	public static final String TABLE_SQL_DROP = "drop table TY_TYStudentPointReserve";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.tvd.thptty.model.TYStudentPointReserve"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.tvd.thptty.model.TYStudentPointReserve"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.tvd.thptty.model.TYStudentPointReserve"));

	public TYStudentPointReserveModelImpl() {
	}

	public TYStudentPointReservePK getPrimaryKey() {
		return new TYStudentPointReservePK(_courses, _semester, _studentId,
			_subjectId, _pointType, _pointIndex, _pointFactor);
	}

	public void setPrimaryKey(TYStudentPointReservePK pk) {
		setCourses(pk.courses);
		setSemester(pk.semester);
		setStudentId(pk.studentId);
		setSubjectId(pk.subjectId);
		setPointType(pk.pointType);
		setPointIndex(pk.pointIndex);
		setPointFactor(pk.pointFactor);
	}

	public Serializable getPrimaryKeyObj() {
		return new TYStudentPointReservePK(_courses, _semester, _studentId,
			_subjectId, _pointType, _pointIndex, _pointFactor);
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

	public int getSemester() {
		return _semester;
	}

	public void setSemester(int semester) {
		if (!_setOriginalSemester) {
			_setOriginalSemester = true;

			_originalSemester = _semester;
		}

		_semester = semester;
	}

	public int getOriginalSemester() {
		return _originalSemester;
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

	public long getSubjectId() {
		return _subjectId;
	}

	public void setSubjectId(long subjectId) {
		if (!_setOriginalSubjectId) {
			_setOriginalSubjectId = true;

			_originalSubjectId = _subjectId;
		}

		_subjectId = subjectId;
	}

	public long getOriginalSubjectId() {
		return _originalSubjectId;
	}

	public int getPointType() {
		return _pointType;
	}

	public void setPointType(int pointType) {
		if (!_setOriginalPointType) {
			_setOriginalPointType = true;

			_originalPointType = _pointType;
		}

		_pointType = pointType;
	}

	public int getOriginalPointType() {
		return _originalPointType;
	}

	public int getPointIndex() {
		return _pointIndex;
	}

	public void setPointIndex(int pointIndex) {
		if (!_setOriginalPointIndex) {
			_setOriginalPointIndex = true;

			_originalPointIndex = _pointIndex;
		}

		_pointIndex = pointIndex;
	}

	public int getOriginalPointIndex() {
		return _originalPointIndex;
	}

	public int getPointFactor() {
		return _pointFactor;
	}

	public void setPointFactor(int pointFactor) {
		if (!_setOriginalPointFactor) {
			_setOriginalPointFactor = true;

			_originalPointFactor = _pointFactor;
		}

		_pointFactor = pointFactor;
	}

	public int getOriginalPointFactor() {
		return _originalPointFactor;
	}

	public double getPoint() {
		return _point;
	}

	public void setPoint(double point) {
		_point = point;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	public TYStudentPointReserve toEscapedModel() {
		if (isEscapedModel()) {
			return (TYStudentPointReserve)this;
		}
		else {
			return (TYStudentPointReserve)Proxy.newProxyInstance(TYStudentPointReserve.class.getClassLoader(),
				new Class[] { TYStudentPointReserve.class },
				new AutoEscapeBeanHandler(this));
		}
	}

	public Object clone() {
		TYStudentPointReserveImpl tyStudentPointReserveImpl = new TYStudentPointReserveImpl();

		tyStudentPointReserveImpl.setCourses(getCourses());

		TYStudentPointReserveModelImpl tyStudentPointReserveModelImpl = tyStudentPointReserveImpl;

		tyStudentPointReserveModelImpl._originalCourses = tyStudentPointReserveModelImpl._courses;

		tyStudentPointReserveModelImpl._setOriginalCourses = false;
		tyStudentPointReserveImpl.setSemester(getSemester());

		tyStudentPointReserveModelImpl._originalSemester = tyStudentPointReserveModelImpl._semester;

		tyStudentPointReserveModelImpl._setOriginalSemester = false;
		tyStudentPointReserveImpl.setStudentId(getStudentId());

		tyStudentPointReserveModelImpl._originalStudentId = tyStudentPointReserveModelImpl._studentId;

		tyStudentPointReserveModelImpl._setOriginalStudentId = false;
		tyStudentPointReserveImpl.setSubjectId(getSubjectId());

		tyStudentPointReserveModelImpl._originalSubjectId = tyStudentPointReserveModelImpl._subjectId;

		tyStudentPointReserveModelImpl._setOriginalSubjectId = false;
		tyStudentPointReserveImpl.setPointType(getPointType());

		tyStudentPointReserveModelImpl._originalPointType = tyStudentPointReserveModelImpl._pointType;

		tyStudentPointReserveModelImpl._setOriginalPointType = false;
		tyStudentPointReserveImpl.setPointIndex(getPointIndex());

		tyStudentPointReserveModelImpl._originalPointIndex = tyStudentPointReserveModelImpl._pointIndex;

		tyStudentPointReserveModelImpl._setOriginalPointIndex = false;
		tyStudentPointReserveImpl.setPointFactor(getPointFactor());

		tyStudentPointReserveModelImpl._originalPointFactor = tyStudentPointReserveModelImpl._pointFactor;

		tyStudentPointReserveModelImpl._setOriginalPointFactor = false;
		tyStudentPointReserveImpl.setPoint(getPoint());

		tyStudentPointReserveImpl.setModifiedDate(getModifiedDate());

		tyStudentPointReserveImpl.setUserId(getUserId());

		return tyStudentPointReserveImpl;
	}

	public int compareTo(TYStudentPointReserve tyStudentPointReserve) {
		TYStudentPointReservePK pk = tyStudentPointReserve.getPrimaryKey();

		return getPrimaryKey().compareTo(pk);
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYStudentPointReserve tyStudentPointReserve = null;

		try {
			tyStudentPointReserve = (TYStudentPointReserve)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		TYStudentPointReservePK pk = tyStudentPointReserve.getPrimaryKey();

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
		StringBundler sb = new StringBundler(21);

		sb.append("{courses=");
		sb.append(getCourses());
		sb.append(", semester=");
		sb.append(getSemester());
		sb.append(", studentId=");
		sb.append(getStudentId());
		sb.append(", subjectId=");
		sb.append(getSubjectId());
		sb.append(", pointType=");
		sb.append(getPointType());
		sb.append(", pointIndex=");
		sb.append(getPointIndex());
		sb.append(", pointFactor=");
		sb.append(getPointFactor());
		sb.append(", point=");
		sb.append(getPoint());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYStudentPointReserve");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>courses</column-name><column-value><![CDATA[");
		sb.append(getCourses());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>semester</column-name><column-value><![CDATA[");
		sb.append(getSemester());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentId</column-name><column-value><![CDATA[");
		sb.append(getStudentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>subjectId</column-name><column-value><![CDATA[");
		sb.append(getSubjectId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pointType</column-name><column-value><![CDATA[");
		sb.append(getPointType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pointIndex</column-name><column-value><![CDATA[");
		sb.append(getPointIndex());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>pointFactor</column-name><column-value><![CDATA[");
		sb.append(getPointFactor());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>point</column-name><column-value><![CDATA[");
		sb.append(getPoint());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private int _courses;
	private int _originalCourses;
	private boolean _setOriginalCourses;
	private int _semester;
	private int _originalSemester;
	private boolean _setOriginalSemester;
	private long _studentId;
	private long _originalStudentId;
	private boolean _setOriginalStudentId;
	private long _subjectId;
	private long _originalSubjectId;
	private boolean _setOriginalSubjectId;
	private int _pointType;
	private int _originalPointType;
	private boolean _setOriginalPointType;
	private int _pointIndex;
	private int _originalPointIndex;
	private boolean _setOriginalPointIndex;
	private int _pointFactor;
	private int _originalPointFactor;
	private boolean _setOriginalPointFactor;
	private double _point;
	private Date _modifiedDate;
	private long _userId;
	private String _userUuid;
}