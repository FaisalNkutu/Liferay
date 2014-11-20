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

package com.inkwell.internet.productregistration.model.impl;

import com.inkwell.internet.productregistration.model.PRUser;
import com.inkwell.internet.productregistration.model.PRUserModel;

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

import java.io.Serializable;

import java.lang.reflect.Proxy;

import java.sql.Types;

import java.util.Date;

/**
 * The base model implementation for the PRUser service. Represents a row in the &quot;PR_PRUser&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.inkwell.internet.productregistration.model.PRUserModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link PRUserImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this class directly. All methods that expect a p r user model instance should use the {@link com.inkwell.internet.productregistration.model.PRUser} interface instead.
 * </p>
 *
 * @author Rich Sezov
 * @see PRUserImpl
 * @see com.inkwell.internet.productregistration.model.PRUser
 * @see com.inkwell.internet.productregistration.model.PRUserModel
 * @generated
 */
public class PRUserModelImpl extends BaseModelImpl<PRUser>
	implements PRUserModel {
	public static final String TABLE_NAME = "PR_PRUser";
	public static final Object[][] TABLE_COLUMNS = {
			{ "prUserId", new Integer(Types.BIGINT) },
			{ "firstName", new Integer(Types.VARCHAR) },
			{ "lastName", new Integer(Types.VARCHAR) },
			{ "address1", new Integer(Types.VARCHAR) },
			{ "address2", new Integer(Types.VARCHAR) },
			{ "city", new Integer(Types.VARCHAR) },
			{ "state", new Integer(Types.VARCHAR) },
			{ "postalCode", new Integer(Types.VARCHAR) },
			{ "country", new Integer(Types.VARCHAR) },
			{ "phoneNumber", new Integer(Types.VARCHAR) },
			{ "email", new Integer(Types.VARCHAR) },
			{ "birthDate", new Integer(Types.TIMESTAMP) },
			{ "male", new Integer(Types.BOOLEAN) },
			{ "userId", new Integer(Types.BIGINT) },
			{ "companyId", new Integer(Types.BIGINT) },
			{ "groupId", new Integer(Types.BIGINT) }
		};
	public static final String TABLE_SQL_CREATE = "create table PR_PRUser (prUserId LONG not null primary key,firstName VARCHAR(75) null,lastName VARCHAR(75) null,address1 VARCHAR(75) null,address2 VARCHAR(75) null,city VARCHAR(75) null,state VARCHAR(75) null,postalCode VARCHAR(75) null,country VARCHAR(75) null,phoneNumber VARCHAR(75) null,email VARCHAR(75) null,birthDate DATE null,male BOOLEAN,userId LONG,companyId LONG,groupId LONG)";
	public static final String TABLE_SQL_DROP = "drop table PR_PRUser";
	public static final String ORDER_BY_JPQL = " ORDER BY prUser.lastName ASC";
	public static final String ORDER_BY_SQL = " ORDER BY PR_PRUser.lastName ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.inkwell.internet.productregistration.model.PRUser"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.inkwell.internet.productregistration.model.PRUser"),
			true);
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.inkwell.internet.productregistration.model.PRUser"));

	public PRUserModelImpl() {
	}

	public long getPrimaryKey() {
		return _prUserId;
	}

	public void setPrimaryKey(long pk) {
		setPrUserId(pk);
	}

	public Serializable getPrimaryKeyObj() {
		return new Long(_prUserId);
	}

	public long getPrUserId() {
		return _prUserId;
	}

	public void setPrUserId(long prUserId) {
		_prUserId = prUserId;
	}

	public String getPrUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getPrUserId(), "uuid", _prUserUuid);
	}

	public void setPrUserUuid(String prUserUuid) {
		_prUserUuid = prUserUuid;
	}

	public String getFirstName() {
		if (_firstName == null) {
			return StringPool.BLANK;
		}
		else {
			return _firstName;
		}
	}

	public void setFirstName(String firstName) {
		_firstName = firstName;
	}

	public String getLastName() {
		if (_lastName == null) {
			return StringPool.BLANK;
		}
		else {
			return _lastName;
		}
	}

	public void setLastName(String lastName) {
		_lastName = lastName;
	}

	public String getAddress1() {
		if (_address1 == null) {
			return StringPool.BLANK;
		}
		else {
			return _address1;
		}
	}

	public void setAddress1(String address1) {
		_address1 = address1;
	}

	public String getAddress2() {
		if (_address2 == null) {
			return StringPool.BLANK;
		}
		else {
			return _address2;
		}
	}

	public void setAddress2(String address2) {
		_address2 = address2;
	}

	public String getCity() {
		if (_city == null) {
			return StringPool.BLANK;
		}
		else {
			return _city;
		}
	}

	public void setCity(String city) {
		_city = city;
	}

	public String getState() {
		if (_state == null) {
			return StringPool.BLANK;
		}
		else {
			return _state;
		}
	}

	public void setState(String state) {
		_state = state;
	}

	public String getPostalCode() {
		if (_postalCode == null) {
			return StringPool.BLANK;
		}
		else {
			return _postalCode;
		}
	}

	public void setPostalCode(String postalCode) {
		_postalCode = postalCode;
	}

	public String getCountry() {
		if (_country == null) {
			return StringPool.BLANK;
		}
		else {
			return _country;
		}
	}

	public void setCountry(String country) {
		_country = country;
	}

	public String getPhoneNumber() {
		if (_phoneNumber == null) {
			return StringPool.BLANK;
		}
		else {
			return _phoneNumber;
		}
	}

	public void setPhoneNumber(String phoneNumber) {
		_phoneNumber = phoneNumber;
	}

	public String getEmail() {
		if (_email == null) {
			return StringPool.BLANK;
		}
		else {
			return _email;
		}
	}

	public void setEmail(String email) {
		_email = email;
	}

	public Date getBirthDate() {
		return _birthDate;
	}

	public void setBirthDate(Date birthDate) {
		_birthDate = birthDate;
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

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public PRUser toEscapedModel() {
		if (isEscapedModel()) {
			return (PRUser)this;
		}
		else {
			return (PRUser)Proxy.newProxyInstance(PRUser.class.getClassLoader(),
				new Class[] { PRUser.class }, new AutoEscapeBeanHandler(this));
		}
	}

	public ExpandoBridge getExpandoBridge() {
		if (_expandoBridge == null) {
			_expandoBridge = ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
					PRUser.class.getName(), getPrimaryKey());
		}

		return _expandoBridge;
	}

	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		getExpandoBridge().setAttributes(serviceContext);
	}

	public Object clone() {
		PRUserImpl prUserImpl = new PRUserImpl();

		prUserImpl.setPrUserId(getPrUserId());

		prUserImpl.setFirstName(getFirstName());

		prUserImpl.setLastName(getLastName());

		prUserImpl.setAddress1(getAddress1());

		prUserImpl.setAddress2(getAddress2());

		prUserImpl.setCity(getCity());

		prUserImpl.setState(getState());

		prUserImpl.setPostalCode(getPostalCode());

		prUserImpl.setCountry(getCountry());

		prUserImpl.setPhoneNumber(getPhoneNumber());

		prUserImpl.setEmail(getEmail());

		prUserImpl.setBirthDate(getBirthDate());

		prUserImpl.setMale(getMale());

		prUserImpl.setUserId(getUserId());

		prUserImpl.setCompanyId(getCompanyId());

		prUserImpl.setGroupId(getGroupId());

		return prUserImpl;
	}

	public int compareTo(PRUser prUser) {
		int value = 0;

		value = getLastName().toLowerCase()
					.compareTo(prUser.getLastName().toLowerCase());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	public boolean equals(Object obj) {
		if (obj == null) {
			return false;
		}

		PRUser prUser = null;

		try {
			prUser = (PRUser)obj;
		}
		catch (ClassCastException cce) {
			return false;
		}

		long pk = prUser.getPrimaryKey();

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
		StringBundler sb = new StringBundler(33);

		sb.append("{prUserId=");
		sb.append(getPrUserId());
		sb.append(", firstName=");
		sb.append(getFirstName());
		sb.append(", lastName=");
		sb.append(getLastName());
		sb.append(", address1=");
		sb.append(getAddress1());
		sb.append(", address2=");
		sb.append(getAddress2());
		sb.append(", city=");
		sb.append(getCity());
		sb.append(", state=");
		sb.append(getState());
		sb.append(", postalCode=");
		sb.append(getPostalCode());
		sb.append(", country=");
		sb.append(getCountry());
		sb.append(", phoneNumber=");
		sb.append(getPhoneNumber());
		sb.append(", email=");
		sb.append(getEmail());
		sb.append(", birthDate=");
		sb.append(getBirthDate());
		sb.append(", male=");
		sb.append(getMale());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append("}");

		return sb.toString();
	}

	public String toXmlString() {
		StringBundler sb = new StringBundler(52);

		sb.append("<model><model-name>");
		sb.append("com.inkwell.internet.productregistration.model.PRUser");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>prUserId</column-name><column-value><![CDATA[");
		sb.append(getPrUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>firstName</column-name><column-value><![CDATA[");
		sb.append(getFirstName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>lastName</column-name><column-value><![CDATA[");
		sb.append(getLastName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address1</column-name><column-value><![CDATA[");
		sb.append(getAddress1());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>address2</column-name><column-value><![CDATA[");
		sb.append(getAddress2());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>city</column-name><column-value><![CDATA[");
		sb.append(getCity());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>state</column-name><column-value><![CDATA[");
		sb.append(getState());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>postalCode</column-name><column-value><![CDATA[");
		sb.append(getPostalCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>country</column-name><column-value><![CDATA[");
		sb.append(getCountry());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>phoneNumber</column-name><column-value><![CDATA[");
		sb.append(getPhoneNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>email</column-name><column-value><![CDATA[");
		sb.append(getEmail());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>birthDate</column-name><column-value><![CDATA[");
		sb.append(getBirthDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>male</column-name><column-value><![CDATA[");
		sb.append(getMale());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _prUserId;
	private String _prUserUuid;
	private String _firstName;
	private String _lastName;
	private String _address1;
	private String _address2;
	private String _city;
	private String _state;
	private String _postalCode;
	private String _country;
	private String _phoneNumber;
	private String _email;
	private Date _birthDate;
	private boolean _male;
	private long _userId;
	private String _userUuid;
	private long _companyId;
	private long _groupId;
	private transient ExpandoBridge _expandoBridge;
}