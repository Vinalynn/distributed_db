/**
 * 
 */
package org.vinalynn.jw.dist_db.service.impl;

import java.util.Date;

import org.apache.commons.lang3.RandomStringUtils;
import org.vinalynn.jw.dist_db.dao.interfaces.ICustomerDao;
import org.vinalynn.jw.dist_db.service.interfaces.ICustomerSV;

/**
 * @author caiwm
 * 
 */
public class CustomerSVImpl implements ICustomerSV {

	private ICustomerDao customerDao;

	public void setCustomerDao(ICustomerDao customerDao) {
		this.customerDao = customerDao;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.vinalynn.jw.dist_db.service.interfaces.ICustomerSV#createCustomer()
	 */
	@Override
	public void createCustomer() throws Exception {
		Date date;
		// A
		customerDao.saveCustomer("A",
				RandomStringUtils.random(5, Boolean.TRUE, Boolean.FALSE),
				RandomStringUtils.random(10, Boolean.TRUE, Boolean.FALSE),
				"A" + RandomStringUtils.random(10, Boolean.TRUE, Boolean.FALSE), date = new Date(System.currentTimeMillis()));
		
		//B
		customerDao.saveCustomer("B",
				RandomStringUtils.random(5, Boolean.TRUE, Boolean.FALSE),
				RandomStringUtils.random(10, Boolean.TRUE, Boolean.FALSE),
				"B" + RandomStringUtils.random(10, Boolean.TRUE, Boolean.FALSE), date);

	}
}
