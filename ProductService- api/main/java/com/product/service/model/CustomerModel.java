/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.product.service.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;

import java.util.Date;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The base model interface for the Customer service. Represents a row in the &quot;SP_Customer&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation <code>com.product.service.model.impl.CustomerModelImpl</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in <code>com.product.service.model.impl.CustomerImpl</code>.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Customer
 * @generated
 */
@ProviderType
public interface CustomerModel
	extends BaseModel<Customer>, GroupedModel, ShardedModel,
			StagedAuditedModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a customer model instance should use the {@link Customer} interface instead.
	 */

	/**
	 * Returns the primary key of this customer.
	 *
	 * @return the primary key of this customer
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this customer.
	 *
	 * @param primaryKey the primary key of this customer
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this customer.
	 *
	 * @return the uuid of this customer
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this customer.
	 *
	 * @param uuid the uuid of this customer
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the customer ID of this customer.
	 *
	 * @return the customer ID of this customer
	 */
	public long getCustomerId();

	/**
	 * Sets the customer ID of this customer.
	 *
	 * @param customerId the customer ID of this customer
	 */
	public void setCustomerId(long customerId);

	/**
	 * Returns the customer name of this customer.
	 *
	 * @return the customer name of this customer
	 */
	@AutoEscape
	public String getCustomerName();

	/**
	 * Sets the customer name of this customer.
	 *
	 * @param customerName the customer name of this customer
	 */
	public void setCustomerName(String customerName);

	/**
	 * Returns the customer email of this customer.
	 *
	 * @return the customer email of this customer
	 */
	@AutoEscape
	public String getCustomerEmail();

	/**
	 * Sets the customer email of this customer.
	 *
	 * @param customerEmail the customer email of this customer
	 */
	public void setCustomerEmail(String customerEmail);

	/**
	 * Returns the customer address of this customer.
	 *
	 * @return the customer address of this customer
	 */
	@AutoEscape
	public String getCustomerAddress();

	/**
	 * Sets the customer address of this customer.
	 *
	 * @param customerAddress the customer address of this customer
	 */
	public void setCustomerAddress(String customerAddress);

	/**
	 * Returns the customer valid ID of this customer.
	 *
	 * @return the customer valid ID of this customer
	 */
	@AutoEscape
	public String getCustomerValidId();

	/**
	 * Sets the customer valid ID of this customer.
	 *
	 * @param customerValidId the customer valid ID of this customer
	 */
	public void setCustomerValidId(String customerValidId);

	/**
	 * Returns the customer con no of this customer.
	 *
	 * @return the customer con no of this customer
	 */
	@AutoEscape
	public String getCustomerConNo();

	/**
	 * Sets the customer con no of this customer.
	 *
	 * @param customerConNo the customer con no of this customer
	 */
	public void setCustomerConNo(String customerConNo);

	/**
	 * Returns the products ID of this customer.
	 *
	 * @return the products ID of this customer
	 */
	public long getProductsId();

	/**
	 * Sets the products ID of this customer.
	 *
	 * @param productsId the products ID of this customer
	 */
	public void setProductsId(long productsId);

	/**
	 * Returns the group ID of this customer.
	 *
	 * @return the group ID of this customer
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this customer.
	 *
	 * @param groupId the group ID of this customer
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this customer.
	 *
	 * @return the company ID of this customer
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this customer.
	 *
	 * @param companyId the company ID of this customer
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this customer.
	 *
	 * @return the user ID of this customer
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this customer.
	 *
	 * @param userId the user ID of this customer
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this customer.
	 *
	 * @return the user uuid of this customer
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this customer.
	 *
	 * @param userUuid the user uuid of this customer
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this customer.
	 *
	 * @return the user name of this customer
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this customer.
	 *
	 * @param userName the user name of this customer
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this customer.
	 *
	 * @return the create date of this customer
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this customer.
	 *
	 * @param createDate the create date of this customer
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this customer.
	 *
	 * @return the modified date of this customer
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this customer.
	 *
	 * @param modifiedDate the modified date of this customer
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	@Override
	public Customer cloneWithOriginalValues();

}