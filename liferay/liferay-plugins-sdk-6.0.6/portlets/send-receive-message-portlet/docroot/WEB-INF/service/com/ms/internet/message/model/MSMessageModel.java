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

package com.ms.internet.message.model;

import com.liferay.portal.kernel.annotation.AutoEscape;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the MSMessage service. Represents a row in the &quot;MS_MSMessage&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.ms.internet.message.model.impl.MSMessageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.ms.internet.message.model.impl.MSMessageImpl}.
 * </p>
 *
 * <p>
 * Never modify or reference this interface directly. All methods that expect a m s message model instance should use the {@link MSMessage} interface instead.
 * </p>
 *
 * @author I Am Dung
 * @see MSMessage
 * @see com.ms.internet.message.model.impl.MSMessageImpl
 * @see com.ms.internet.message.model.impl.MSMessageModelImpl
 * @generated
 */
public interface MSMessageModel extends BaseModel<MSMessage> {
	/**
	 * Gets the primary key of this m s message.
	 *
	 * @return the primary key of this m s message
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this m s message
	 *
	 * @param pk the primary key of this m s message
	 */
	public void setPrimaryKey(long pk);

	/**
	 * Gets the message id of this m s message.
	 *
	 * @return the message id of this m s message
	 */
	public long getMessageId();

	/**
	 * Sets the message id of this m s message.
	 *
	 * @param messageId the message id of this m s message
	 */
	public void setMessageId(long messageId);

	/**
	 * Gets the message of this m s message.
	 *
	 * @return the message of this m s message
	 */
	@AutoEscape
	public String getMessage();

	/**
	 * Sets the message of this m s message.
	 *
	 * @param message the message of this m s message
	 */
	public void setMessage(String message);

	/**
	 * Gets the date created of this m s message.
	 *
	 * @return the date created of this m s message
	 */
	public Date getDateCreated();

	/**
	 * Sets the date created of this m s message.
	 *
	 * @param dateCreated the date created of this m s message
	 */
	public void setDateCreated(Date dateCreated);

	/**
	 * Gets a copy of this m s message as an escaped model instance by wrapping it with an {@link com.liferay.portal.kernel.bean.AutoEscapeBeanHandler}.
	 *
	 * @return the escaped model instance
	 * @see com.liferay.portal.kernel.bean.AutoEscapeBeanHandler
	 */
	public MSMessage toEscapedModel();

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

	public int compareTo(MSMessage msMessage);

	public int hashCode();

	public String toString();

	public String toXmlString();
}