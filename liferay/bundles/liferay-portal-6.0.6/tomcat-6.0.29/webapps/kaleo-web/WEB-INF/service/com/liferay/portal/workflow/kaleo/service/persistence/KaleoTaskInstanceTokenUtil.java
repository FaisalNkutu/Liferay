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

package com.liferay.portal.workflow.kaleo.service.persistence;

import com.liferay.portal.kernel.bean.PortletBeanLocatorUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken;

import java.util.List;

/**
 * The persistence utility for the kaleo task instance token service. This utility wraps {@link KaleoTaskInstanceTokenPersistenceImpl} and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
 * </p>
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see KaleoTaskInstanceTokenPersistence
 * @see KaleoTaskInstanceTokenPersistenceImpl
 * @generated
 */
public class KaleoTaskInstanceTokenUtil {
	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#clearCache(com.liferay.portal.model.BaseModel)
	 */
	public static void clearCache(KaleoTaskInstanceToken kaleoTaskInstanceToken) {
		getPersistence().clearCache(kaleoTaskInstanceToken);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public long countWithDynamicQuery(DynamicQuery dynamicQuery)
		throws SystemException {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<KaleoTaskInstanceToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery) throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<KaleoTaskInstanceToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end)
		throws SystemException {
		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<KaleoTaskInstanceToken> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		return getPersistence()
				   .findWithDynamicQuery(dynamicQuery, start, end,
			orderByComparator);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#remove(com.liferay.portal.model.BaseModel)
	 */
	public static KaleoTaskInstanceToken remove(
		KaleoTaskInstanceToken kaleoTaskInstanceToken)
		throws SystemException {
		return getPersistence().remove(kaleoTaskInstanceToken);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean)
	 */
	public static KaleoTaskInstanceToken update(
		KaleoTaskInstanceToken kaleoTaskInstanceToken, boolean merge)
		throws SystemException {
		return getPersistence().update(kaleoTaskInstanceToken, merge);
	}

	/**
	 * @see com.liferay.portal.service.persistence.BasePersistence#update(com.liferay.portal.model.BaseModel, boolean, ServiceContext)
	 */
	public static KaleoTaskInstanceToken update(
		KaleoTaskInstanceToken kaleoTaskInstanceToken, boolean merge,
		ServiceContext serviceContext) throws SystemException {
		return getPersistence()
				   .update(kaleoTaskInstanceToken, merge, serviceContext);
	}

	/**
	* Caches the kaleo task instance token in the entity cache if it is enabled.
	*
	* @param kaleoTaskInstanceToken the kaleo task instance token to cache
	*/
	public static void cacheResult(
		com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken kaleoTaskInstanceToken) {
		getPersistence().cacheResult(kaleoTaskInstanceToken);
	}

	/**
	* Caches the kaleo task instance tokens in the entity cache if it is enabled.
	*
	* @param kaleoTaskInstanceTokens the kaleo task instance tokens to cache
	*/
	public static void cacheResult(
		java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> kaleoTaskInstanceTokens) {
		getPersistence().cacheResult(kaleoTaskInstanceTokens);
	}

	/**
	* Creates a new kaleo task instance token with the primary key. Does not add the kaleo task instance token to the database.
	*
	* @param kaleoTaskInstanceTokenId the primary key for the new kaleo task instance token
	* @return the new kaleo task instance token
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken create(
		long kaleoTaskInstanceTokenId) {
		return getPersistence().create(kaleoTaskInstanceTokenId);
	}

	/**
	* Removes the kaleo task instance token with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param kaleoTaskInstanceTokenId the primary key of the kaleo task instance token to remove
	* @return the kaleo task instance token that was removed
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a kaleo task instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken remove(
		long kaleoTaskInstanceTokenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence().remove(kaleoTaskInstanceTokenId);
	}

	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken updateImpl(
		com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken kaleoTaskInstanceToken,
		boolean merge)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().updateImpl(kaleoTaskInstanceToken, merge);
	}

	/**
	* Finds the kaleo task instance token with the primary key or throws a {@link com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException} if it could not be found.
	*
	* @param kaleoTaskInstanceTokenId the primary key of the kaleo task instance token to find
	* @return the kaleo task instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a kaleo task instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken findByPrimaryKey(
		long kaleoTaskInstanceTokenId)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence().findByPrimaryKey(kaleoTaskInstanceTokenId);
	}

	/**
	* Finds the kaleo task instance token with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param kaleoTaskInstanceTokenId the primary key of the kaleo task instance token to find
	* @return the kaleo task instance token, or <code>null</code> if a kaleo task instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken fetchByPrimaryKey(
		long kaleoTaskInstanceTokenId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().fetchByPrimaryKey(kaleoTaskInstanceTokenId);
	}

	/**
	* Finds all the kaleo task instance tokens where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findByCompanyId(
		long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId);
	}

	/**
	* Finds a range of all the kaleo task instance tokens where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of kaleo task instance tokens to return
	* @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	* @return the range of matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findByCompanyId(
		long companyId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByCompanyId(companyId, start, end);
	}

	/**
	* Finds an ordered range of all the kaleo task instance tokens where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param start the lower bound of the range of kaleo task instance tokens to return
	* @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findByCompanyId(
		long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByCompanyId(companyId, start, end, orderByComparator);
	}

	/**
	* Finds the first kaleo task instance token in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching kaleo task instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a matching kaleo task instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken findByCompanyId_First(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence()
				   .findByCompanyId_First(companyId, orderByComparator);
	}

	/**
	* Finds the last kaleo task instance token in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching kaleo task instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a matching kaleo task instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken findByCompanyId_Last(
		long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence()
				   .findByCompanyId_Last(companyId, orderByComparator);
	}

	/**
	* Finds the kaleo task instance tokens before and after the current kaleo task instance token in the ordered set where companyId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoTaskInstanceTokenId the primary key of the current kaleo task instance token
	* @param companyId the company id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next kaleo task instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a kaleo task instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken[] findByCompanyId_PrevAndNext(
		long kaleoTaskInstanceTokenId, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence()
				   .findByCompanyId_PrevAndNext(kaleoTaskInstanceTokenId,
			companyId, orderByComparator);
	}

	/**
	* Finds all the kaleo task instance tokens where kaleoDefinitionId = &#63;.
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @return the matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findByKaleoDefinitionId(
		long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Finds a range of all the kaleo task instance tokens where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @param start the lower bound of the range of kaleo task instance tokens to return
	* @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	* @return the range of matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findByKaleoDefinitionId(
		long kaleoDefinitionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByKaleoDefinitionId(kaleoDefinitionId, start, end);
	}

	/**
	* Finds an ordered range of all the kaleo task instance tokens where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @param start the lower bound of the range of kaleo task instance tokens to return
	* @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findByKaleoDefinitionId(
		long kaleoDefinitionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByKaleoDefinitionId(kaleoDefinitionId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first kaleo task instance token in the ordered set where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching kaleo task instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a matching kaleo task instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken findByKaleoDefinitionId_First(
		long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence()
				   .findByKaleoDefinitionId_First(kaleoDefinitionId,
			orderByComparator);
	}

	/**
	* Finds the last kaleo task instance token in the ordered set where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching kaleo task instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a matching kaleo task instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken findByKaleoDefinitionId_Last(
		long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence()
				   .findByKaleoDefinitionId_Last(kaleoDefinitionId,
			orderByComparator);
	}

	/**
	* Finds the kaleo task instance tokens before and after the current kaleo task instance token in the ordered set where kaleoDefinitionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoTaskInstanceTokenId the primary key of the current kaleo task instance token
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next kaleo task instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a kaleo task instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken[] findByKaleoDefinitionId_PrevAndNext(
		long kaleoTaskInstanceTokenId, long kaleoDefinitionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence()
				   .findByKaleoDefinitionId_PrevAndNext(kaleoTaskInstanceTokenId,
			kaleoDefinitionId, orderByComparator);
	}

	/**
	* Finds all the kaleo task instance tokens where kaleoInstanceId = &#63;.
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @return the matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findByKaleoInstanceId(
		long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findByKaleoInstanceId(kaleoInstanceId);
	}

	/**
	* Finds a range of all the kaleo task instance tokens where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @param start the lower bound of the range of kaleo task instance tokens to return
	* @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	* @return the range of matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findByKaleoInstanceId(
		long kaleoInstanceId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByKaleoInstanceId(kaleoInstanceId, start, end);
	}

	/**
	* Finds an ordered range of all the kaleo task instance tokens where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @param start the lower bound of the range of kaleo task instance tokens to return
	* @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findByKaleoInstanceId(
		long kaleoInstanceId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .findByKaleoInstanceId(kaleoInstanceId, start, end,
			orderByComparator);
	}

	/**
	* Finds the first kaleo task instance token in the ordered set where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the first matching kaleo task instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a matching kaleo task instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken findByKaleoInstanceId_First(
		long kaleoInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence()
				   .findByKaleoInstanceId_First(kaleoInstanceId,
			orderByComparator);
	}

	/**
	* Finds the last kaleo task instance token in the ordered set where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the last matching kaleo task instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a matching kaleo task instance token could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken findByKaleoInstanceId_Last(
		long kaleoInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence()
				   .findByKaleoInstanceId_Last(kaleoInstanceId,
			orderByComparator);
	}

	/**
	* Finds the kaleo task instance tokens before and after the current kaleo task instance token in the ordered set where kaleoInstanceId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param kaleoTaskInstanceTokenId the primary key of the current kaleo task instance token
	* @param kaleoInstanceId the kaleo instance id to search with
	* @param orderByComparator the comparator to order the set by
	* @return the previous, current, and next kaleo task instance token
	* @throws com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException if a kaleo task instance token with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public static com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken[] findByKaleoInstanceId_PrevAndNext(
		long kaleoTaskInstanceTokenId, long kaleoInstanceId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			com.liferay.portal.workflow.kaleo.NoSuchTaskInstanceTokenException {
		return getPersistence()
				   .findByKaleoInstanceId_PrevAndNext(kaleoTaskInstanceTokenId,
			kaleoInstanceId, orderByComparator);
	}

	/**
	* Finds all the kaleo task instance tokens.
	*
	* @return the kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll();
	}

	/**
	* Finds a range of all the kaleo task instance tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo task instance tokens to return
	* @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	* @return the range of kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end);
	}

	/**
	* Finds an ordered range of all the kaleo task instance tokens.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param start the lower bound of the range of kaleo task instance tokens to return
	* @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskInstanceToken> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	* Removes all the kaleo task instance tokens where companyId = &#63; from the database.
	*
	* @param companyId the company id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByCompanyId(companyId);
	}

	/**
	* Removes all the kaleo task instance tokens where kaleoDefinitionId = &#63; from the database.
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByKaleoDefinitionId(long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Removes all the kaleo task instance tokens where kaleoInstanceId = &#63; from the database.
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @throws SystemException if a system exception occurred
	*/
	public static void removeByKaleoInstanceId(long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeByKaleoInstanceId(kaleoInstanceId);
	}

	/**
	* Removes all the kaleo task instance tokens from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public static void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		getPersistence().removeAll();
	}

	/**
	* Counts all the kaleo task instance tokens where companyId = &#63;.
	*
	* @param companyId the company id to search with
	* @return the number of matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByCompanyId(long companyId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByCompanyId(companyId);
	}

	/**
	* Counts all the kaleo task instance tokens where kaleoDefinitionId = &#63;.
	*
	* @param kaleoDefinitionId the kaleo definition id to search with
	* @return the number of matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByKaleoDefinitionId(long kaleoDefinitionId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByKaleoDefinitionId(kaleoDefinitionId);
	}

	/**
	* Counts all the kaleo task instance tokens where kaleoInstanceId = &#63;.
	*
	* @param kaleoInstanceId the kaleo instance id to search with
	* @return the number of matching kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static int countByKaleoInstanceId(long kaleoInstanceId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countByKaleoInstanceId(kaleoInstanceId);
	}

	/**
	* Counts all the kaleo task instance tokens.
	*
	* @return the number of kaleo task instance tokens
	* @throws SystemException if a system exception occurred
	*/
	public static int countAll()
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().countAll();
	}

	/**
	* Gets all the kaleo task assignment instances associated with the kaleo task instance token.
	*
	* @param pk the primary key of the kaleo task instance token to get the associated kaleo task assignment instances for
	* @return the kaleo task assignment instances associated with the kaleo task instance token
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance> getKaleoTaskAssignmentInstances(
		long pk) throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getKaleoTaskAssignmentInstances(pk);
	}

	/**
	* Gets a range of all the kaleo task assignment instances associated with the kaleo task instance token.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the kaleo task instance token to get the associated kaleo task assignment instances for
	* @param start the lower bound of the range of kaleo task instance tokens to return
	* @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	* @return the range of kaleo task assignment instances associated with the kaleo task instance token
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance> getKaleoTaskAssignmentInstances(
		long pk, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getKaleoTaskAssignmentInstances(pk, start, end);
	}

	/**
	* Gets an ordered range of all the kaleo task assignment instances associated with the kaleo task instance token.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set.
	* </p>
	*
	* @param pk the primary key of the kaleo task instance token to get the associated kaleo task assignment instances for
	* @param start the lower bound of the range of kaleo task instance tokens to return
	* @param end the upper bound of the range of kaleo task instance tokens to return (not inclusive)
	* @param orderByComparator the comparator to order the results by
	* @return the ordered range of kaleo task assignment instances associated with the kaleo task instance token
	* @throws SystemException if a system exception occurred
	*/
	public static java.util.List<com.liferay.portal.workflow.kaleo.model.KaleoTaskAssignmentInstance> getKaleoTaskAssignmentInstances(
		long pk, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .getKaleoTaskAssignmentInstances(pk, start, end,
			orderByComparator);
	}

	/**
	* Gets the number of kaleo task assignment instances associated with the kaleo task instance token.
	*
	* @param pk the primary key of the kaleo task instance token to get the number of associated kaleo task assignment instances for
	* @return the number of kaleo task assignment instances associated with the kaleo task instance token
	* @throws SystemException if a system exception occurred
	*/
	public static int getKaleoTaskAssignmentInstancesSize(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().getKaleoTaskAssignmentInstancesSize(pk);
	}

	/**
	* Determines if the kaleo task assignment instance is associated with the kaleo task instance token.
	*
	* @param pk the primary key of the kaleo task instance token
	* @param kaleoTaskAssignmentInstancePK the primary key of the kaleo task assignment instance
	* @return <code>true</code> if the kaleo task assignment instance is associated with the kaleo task instance token; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsKaleoTaskAssignmentInstance(long pk,
		long kaleoTaskAssignmentInstancePK)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence()
				   .containsKaleoTaskAssignmentInstance(pk,
			kaleoTaskAssignmentInstancePK);
	}

	/**
	* Determines if the kaleo task instance token has any kaleo task assignment instances associated with it.
	*
	* @param pk the primary key of the kaleo task instance token to check for associations with kaleo task assignment instances
	* @return <code>true</code> if the kaleo task instance token has any kaleo task assignment instances associated with it; <code>false</code> otherwise
	* @throws SystemException if a system exception occurred
	*/
	public static boolean containsKaleoTaskAssignmentInstances(long pk)
		throws com.liferay.portal.kernel.exception.SystemException {
		return getPersistence().containsKaleoTaskAssignmentInstances(pk);
	}

	public static KaleoTaskInstanceTokenPersistence getPersistence() {
		if (_persistence == null) {
			_persistence = (KaleoTaskInstanceTokenPersistence)PortletBeanLocatorUtil.locate(com.liferay.portal.workflow.kaleo.service.ClpSerializer.SERVLET_CONTEXT_NAME,
					KaleoTaskInstanceTokenPersistence.class.getName());
		}

		return _persistence;
	}

	public void setPersistence(KaleoTaskInstanceTokenPersistence persistence) {
		_persistence = persistence;
	}

	private static KaleoTaskInstanceTokenPersistence _persistence;
}