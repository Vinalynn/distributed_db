/**
 * 
 */
package org.vinalynn.jw.dist_db.dao.impl;

import java.util.Date;

import org.apache.commons.lang3.StringUtils;
import org.springframework.jdbc.core.JdbcTemplate;
import org.vinalynn.jw.dist_db.dao.interfaces.ICustomerDao;

/**
 * @author caiwm
 * 
 */
public class CustomerDaoImpl implements ICustomerDao {

	private JdbcTemplate jdbcTemplateA;
	private JdbcTemplate jdbcTemplateB;

	public void setJdbcTemplateA(JdbcTemplate jdbcTemplateA) {
		this.jdbcTemplateA = jdbcTemplateA;
	}

	public void setJdbcTemplateB(JdbcTemplate jdbcTemplateB) {
		this.jdbcTemplateB = jdbcTemplateB;
	}

	@Override
	public void saveCustomer(String ds, String customerName, String address,
			String code, Date currentDate) throws Exception {
		//Date currentDate = new Date(System.currentTimeMillis());
		String sql = "insert into customer(code, cust_name, address, state,CREATE_DATE) values (?,?,?,?,?)";
		if (StringUtils.equalsIgnoreCase(ds, "A")) {
			jdbcTemplateA.update(sql, new Object[] { code, customerName,
					address, "U", currentDate });
		} else if (StringUtils.equalsIgnoreCase(ds, "B")) {
			jdbcTemplateB.update(sql, new Object[] { code, customerName,
					address, "U", currentDate });
			//unblock the code line below,
			//the transaction of distributed database will be rolled back
			/*throw new Exception("give me five.");*/
		} else {
			throw new Exception("data source[" + ds + "] is not defined.");
		}
	}

}
