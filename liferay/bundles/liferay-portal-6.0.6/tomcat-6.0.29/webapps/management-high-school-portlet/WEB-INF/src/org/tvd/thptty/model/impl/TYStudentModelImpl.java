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
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import org.tvd.thptty.model.TYStudent;
import org.tvd.thptty.model.TYStudentModel;

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the TYStudent service. Represents a row in the &quot;TY_TYStudent&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link org.tvd.thptty.model.TYStudentModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link TYStudentImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a t y student model instance should use the {@link org.tvd.thptty.model.TYStudent} interface instead.
 * </p>
 *
 * @author Ta Van Dung
 * @see TYStudentImpl
 * @see org.tvd.thptty.model.TYStudent
 * @see org.tvd.thptty.model.TYStudentModel
 * @generated
 */
public class TYStudentModelImpl extends BaseModelImpl<TYStudent>
	implements TYStudentModel {
	public static final String TABLE_NAME = "TY_TYStudent";
	public static final Object[][] TABLE_COLUMNS = {
			{ "studentId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "groupId", new Integer(Types.BIGINT) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "studentLastName", new Integer(Types.VARCHAR) },
			{ "studentFirstName", new Integer(Types.VARCHAR) },
			{ "studentGroup1", new Integer(Types.INTEGER) },
			{ "studentGroup2", new Integer(Types.INTEGER) },
			{ "studentGroup3", new Integer(Types.INTEGER) },
			{ "male", new Integer(Types.BOOLEAN) },
			{ "birthDay", new Integer(Types.TIMESTAMP) },
			{ "emailAddress", new Integer(Types.VARCHAR) },
			{ "emailPassword", new Integer(Types.VARCHAR) },
			{ "address", new Integer(Types.VARCHAR) },
			{ "fatherName", new Integer(Types.VARCHAR) },
			{ "fatherPhone", new Integer(Types.VARCHAR) },
			{ "motherName", new Integer(Types.VARCHAR) },
			{ "motherPhone", new Integer(Types.VARCHAR) },
			{ "studentCode", new Integer(Types.VARCHAR) },
			{ "loginCount", new Integer(Types.INTEGER) },
			{ "dateLogin", new Integer(Types.TIMESTAMP) },
			{ "passwordEncrypt", new Integer(Types.BOOLEAN) },
			{ "question", new Integer(Types.VARCHAR) },
			{ "answer", new Integer(Types.VARCHAR) },
			{ "regId", new Integer(Types.VARCHAR) }
		};
	public static final String TABLE_SQL_CREATE = "create table TY_TYStudent (studentId LONG not null primary key,companyId LONG,groupId LONG,userId LONG,studentLastName VARCHAR(75) null,studentFirstName VARCHAR(75) null,studentGroup1 INTEGER,studentGroup2 INTEGER,studentGroup3 INTEGER,male BOOLEAN,birthDay DATE null,emailAddress VARCHAR(75) null,emailPassword VARCHAR(75) null,address VARCHAR(75) null,fatherName VARCHAR(75) null,fatherPhone VARCHAR(75) null,motherName VARCHAR(75) null,motherPhone VARCHAR(75) null,studentCode VARCHAR(75) null,loginCount INTEGER,dateLogin DATE null,passwordEncrypt BOOLEAN,question VARCHAR(75) null,answer VARCHAR(75) null,regId VARCHAR(75) null)";
	public static final String TABLE_SQL_DROP = "drop table TY_TYStudent";
	public static final String ORDER_BY_JPQL = " ORDER BY tyStudent.studentLastName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY TY_TYStudent.studentLastName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.org.tvd.thptty.model.TYStudent"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.org.tvd.thptty.model.TYStudent"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.org.tvd.thptty.model.TYStudent"));

	public TYStudentModelImpl() {
	}

	public long getPrimaryKey() {
		return _studentId;
	}

	public void setPrimaryKey(long pk) {
		setStudentId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_studentId);
	}

	public long getStudentId() {
		return _studentId;
	}

	public void setStudentId(long studentId) {
		_studentId = studentId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
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

	public String getStudentLastName() {
		if (_studentLastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _studentLastName;
		}
	}

	public void setStudentLastName(String studentLastName) {
		_studentLastName = studentLastName;
	}

	public String getStudentFirstName() {
		if (_studentFirstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _studentFirstName;
		}
	}

	public void setStudentFirstName(String studentFirstName) {
		_studentFirstName = studentFirstName;
	}

	public int getStudentGroup1() {
		return _studentGroup1;
	}

	public void setStudentGroup1(int studentGroup1) {
		_studentGroup1 = studentGroup1;
	}

	public int getStudentGroup2() {
		return _studentGroup2;
	}

	public void setStudentGroup2(int studentGroup2) {
		_studentGroup2 = studentGroup2;
	}

	public int getStudentGroup3() {
		return _studentGroup3;
	}

	public void setStudentGroup3(int studentGroup3) {
		_studentGroup3 = studentGroup3;
	}

	public boolean getMale() {
		return _male;
	}

	public boolean isMale() {
		return _male;
	}

	public void setMale(boolean male) {
		_male = male;
	}

	public Date getBirthDay() {
		return _birthDay;
	}

	public void setBirthDay(Date birthDay) {
		_birthDay = birthDay;
	}

	public String getEmailAddress() {
		if (_emailAddress == null) {
			return StringPool.BLANK;
		}
		else {
			return _emailAddress;
		}
	}

	public void setEmailAddress(String emailAddress) {
		if (_originalEmailAddress == null) {
			_originalEmailAddress = _emailAddress;
		}

		_emailAddress = emailAddress;
	}

	public String getOriginalEmailAddress() {
		return GetterUtil.getString(_originalEmailAddress);
	}

	public String getEmailPassword() {
		if (_emailPassword == null) {
			return StringPool.BLANK;
		}
		else {
			return _emailPassword;
		}
	}

	public void setEmailPassword(String emailPassword) {
		_emailPassword = emailPassword;
	}

	public String getAddress() {
		if (_address == null) {
			return StringPool.BLANK;
		}
		else {
			return _address;
		}
	}

	public void setAddress(String address) {
		_address = address;
	}

	public String getFatherName() {
		if (_fatherName == null) {
			return StringPool.BLANK;
		}
		else {
			return _fatherName;
		}
	}

	public void setFatherName(String fatherName) {
		_fatherName = fatherName;
	}

	public String getFatherPhone() {
		if (_fatherPhone == null) {
			return StringPool.BLANK;
		}
		else {
			return _fatherPhone;
		}
	}

	public void setFatherPhone(String fatherPhone) {
		_fatherPhone = fatherPhone;
	}

	public String getMotherName() {
		if (_motherName == null) {
			return StringPool.BLANK;
		}
		else {
			return _motherName;
		}
	}

	public void setMotherName(String motherName) {
		_motherName = motherName;
	}

	public String getMotherPhone() {
		if (_motherPhone == null) {
			return StringPool.BLANK;
		}
		else {
			return _motherPhone;
		}
	}

	public void setMotherPhone(String motherPhone) {
		_motherPhone = motherPhone;
	}

	public String getStudentCode() {
		if (_studentCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _studentCode;
		}
	}

	public void setStudentCode(String studentCode) {
		_studentCode = studentCode;
	}

	public int getLoginCount() {
		return _loginCount;
	}

	public void setLoginCount(int loginCount) {
		_loginCount = loginCount;
	}

	public Date getDateLogin() {
		return _dateLogin;
	}

	public void setDateLogin(Date dateLogin) {
		_dateLogin = dateLogin;
	}

	public boolean getPasswordEncrypt() {
		return _passwordEncrypt;
	}

	public boolean isPasswordEncrypt() {
		return _passwordEncrypt;
	}

	public void setPasswordEncrypt(boolean passwordEncrypt) {
		_passwordEncrypt = passwordEncrypt;
	}

	public String getQuestion() {
		if (_question == null) {
			return StringPool.BLANK;
		}
		else {
			return _question;
		}
	}

	public void setQuestion(String question) {
		_question = question;
	}

	public String getAnswer() {
		if (_answer == null) {
			return StringPool.BLANK;
		}
		else {
			return _answer;
		}
	}

	public void setAnswer(String answer) {
		_answer = answer;
	}

	public String getRegId() {
		if (_regId == null) {
			return StringPool.BLANK;
		}
		else {
			return _regId;
		}
	}

	public void setRegId(String regId) {
		_regId = regId;
	}

	public TYStudent toEscapedModel() {
		if (isEscapedModel()) {
			return (TYStudent)this;
		}
		else {
			return (TYStudent)Proxy.newProxyInstance(TYStudent.class.getClassLoader(),
				new Class[] { TYStudent.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					TYStudent.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		TYStudentImpl tyStudentImpl = new TYStudentImpl();

		tyStudentImpl.setStudentId(getStudentId());

		tyStudentImpl.setCompanyId(getCompanyId());

		TYStudentModelImpl tyStudentModelImpl = tyStudentImpl;

		tyStudentModelImpl._originalCompanyId = tyStudentModelImpl._companyId;

		tyStudentModelImpl._setOriginalCompanyId = false;
		tyStudentImpl.setGroupId(getGroupId());

		tyStudentModelImpl._originalGroupId = tyStudentModelImpl._groupId;

		tyStudentModelImpl._setOriginalGroupId = false;
		tyStudentImpl.setUserId(getUserId());

		tyStudentImpl.setStudentLastName(getStudentLastName());

		tyStudentImpl.setStudentFirstName(getStudentFirstName());

		tyStudentImpl.setStudentGroup1(getStudentGroup1());

		tyStudentImpl.setStudentGroup2(getStudentGroup2());

		tyStudentImpl.setStudentGroup3(getStudentGroup3());

		tyStudentImpl.setMale(getMale());

		tyStudentImpl.setBirthDay(getBirthDay());

		tyStudentImpl.setEmailAddress(getEmailAddress());

		tyStudentModelImpl._originalEmailAddress = tyStudentModelImpl._emailAddress;

		tyStudentImpl.setEmailPassword(getEmailPassword());

		tyStudentImpl.setAddress(getAddress());

		tyStudentImpl.setFatherName(getFatherName());

		tyStudentImpl.setFatherPhone(getFatherPhone());

		tyStudentImpl.setMotherName(getMotherName());

		tyStudentImpl.setMotherPhone(getMotherPhone());

		tyStudentImpl.setStudentCode(getStudentCode());

		tyStudentImpl.setLoginCount(getLoginCount());

		tyStudentImpl.setDateLogin(getDateLogin());

		tyStudentImpl.setPasswordEncrypt(getPasswordEncrypt());

		tyStudentImpl.setQuestion(getQuestion());

		tyStudentImpl.setAnswer(getAnswer());

		tyStudentImpl.setRegId(getRegId());

		return tyStudentImpl;
	}

	public int compareTo(TYStudent tyStudent) {
		int value = 0;

		value = getStudentLastName().compareTo(tyStudent.getStudentLastName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		TYStudent tyStudent = null;

		try {
			tyStudent = (TYStudent)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = tyStudent.getPrimaryKey();

		if (getPrimaryKey() == pk) {
			return true;
		}
		else {
			return false;
		}
	}

	public int hashCode() {
		return (int)getPrimaryKey();
	}

	public String toString() {
		StringBundler sb = new StringBundler(51);

		sb.append("{studentId=");
		sb.append(getStudentId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", studentLastName=");
		sb.append(getStudentLastName());
		sb.append(", studentFirstName=");
		sb.append(getStudentFirstName());
		sb.append(", studentGroup1=");
		sb.append(getStudentGroup1());
		sb.append(", studentGroup2=");
		sb.append(getStudentGroup2());
		sb.append(", studentGroup3=");
		sb.append(getStudentGroup3());
		sb.append(", male=");
		sb.append(getMale());
		sb.append(", birthDay=");
		sb.append(getBirthDay());
		sb.append(", emailAddress=");
		sb.append(getEmailAddress());
		sb.append(", emailPassword=");
		sb.append(getEmailPassword());
		sb.append(", address=");
		sb.append(getAddress());
		sb.append(", fatherName=");
		sb.append(getFatherName());
		sb.append(", fatherPhone=");
		sb.append(getFatherPhone());
		sb.append(", motherName=");
		sb.append(getMotherName());
		sb.append(", motherPhone=");
		sb.append(getMotherPhone());
		sb.append(", studentCode=");
		sb.append(getStudentCode());
		sb.append(", loginCount=");
		sb.append(getLoginCount());
		sb.append(", dateLogin=");
		sb.append(getDateLogin());
		sb.append(", passwordEncrypt=");
		sb.append(getPasswordEncrypt());
		sb.append(", question=");
		sb.append(getQuestion());
		sb.append(", answer=");
		sb.append(getAnswer());
		sb.append(", regId=");
		sb.append(getRegId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(79);

		sb.append("<model><model-name>");
		sb.append("org.tvd.thptty.model.TYStudent");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>studentId</column-name><column-value><![CDATA[");
		sb.append(getStudentId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentLastName</column-name><column-value><![CDATA[");
		sb.append(getStudentLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentFirstName</column-name><column-value><![CDATA[");
		sb.append(getStudentFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentGroup1</column-name><column-value><![CDATA[");
		sb.append(getStudentGroup1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentGroup2</column-name><column-value><![CDATA[");
		sb.append(getStudentGroup2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentGroup3</column-name><column-value><![CDATA[");
		sb.append(getStudentGroup3());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>male</column-name><column-value><![CDATA[");
		sb.append(getMale());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthDay</column-name><column-value><![CDATA[");
		sb.append(getBirthDay());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailAddress</column-name><column-value><![CDATA[");
		sb.append(getEmailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailPassword</column-name><column-value><![CDATA[");
		sb.append(getEmailPassword());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address</column-name><column-value><![CDATA[");
		sb.append(getAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fatherName</column-name><column-value><![CDATA[");
		sb.append(getFatherName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fatherPhone</column-name><column-value><![CDATA[");
		sb.append(getFatherPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>motherName</column-name><column-value><![CDATA[");
		sb.append(getMotherName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>motherPhone</column-name><column-value><![CDATA[");
		sb.append(getMotherPhone());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>studentCode</column-name><column-value><![CDATA[");
		sb.append(getStudentCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>loginCount</column-name><column-value><![CDATA[");
		sb.append(getLoginCount());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateLogin</column-name><column-value><![CDATA[");
		sb.append(getDateLogin());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>passwordEncrypt</column-name><column-value><![CDATA[");
		sb.append(getPasswordEncrypt());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>question</column-name><column-value><![CDATA[");
		sb.append(getQuestion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>answer</column-name><column-value><![CDATA[");
		sb.append(getAnswer());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>regId</column-name><column-value><![CDATA[");
		sb.append(getRegId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _studentId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _userId;
	private String _userUuid;
	private String _studentLastName;
	private String _studentFirstName;
	private int _studentGroup1;
	private int _studentGroup2;
	private int _studentGroup3;
	private boolean _male;
	private Date _birthDay;
	private String _emailAddress;
	private String _originalEmailAddress;
	private String _emailPassword;
	private String _address;
	private String _fatherName;
	private String _fatherPhone;
	private String _motherName;
	private String _motherPhone;
	private String _studentCode;
	private int _loginCount;
	private Date _dateLogin;
	private boolean _passwordEncrypt;
	private String _question;
	private String _answer;
	private String _regId;
	private transient ExpandoBridge _expandoBridge;
}