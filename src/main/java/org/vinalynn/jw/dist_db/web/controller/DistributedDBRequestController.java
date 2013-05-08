/**
 * 
 */
package org.vinalynn.jw.dist_db.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author caiwm
 *
 */
@Controller
public class DistributedDBRequestController {
	
	@RequestMapping(value="/sayhello.html")
	public String sayHello() throws Exception{
		return "Hello World!";
	}
}
