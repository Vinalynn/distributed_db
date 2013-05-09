/**
 * 
 */
package org.vinalynn.jw.dist_db.dao.interfaces;

import java.util.Date;

/**
 * @author caiwm
 * 
 */
public interface ICustomerDao {

	
	/**
	 * save customer
	 * @param ds			data-source distinguish
	 * @param customerId
	 * @param customerName
	 * @param address
	 * @param code
	 * @throws Exception
	 */
	void saveCustomer(String ds, String customerName,
			String address, String code, Date currentDate) throws Exception;
}
