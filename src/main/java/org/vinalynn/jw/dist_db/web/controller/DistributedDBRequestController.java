/**
 * 
 */
package org.vinalynn.jw.dist_db.web.controller;

import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author caiwm
 *
 */
@Controller
public class DistributedDBRequestController {
	
	@RequestMapping(value="/sayhello.html")
	public String sayHello(Model model) throws Exception{
		model.addAttribute("str", RandomStringUtils.random(20, Boolean.TRUE, Boolean.TRUE));
		return "common/stringTemplate";
	}
	
	@RequestMapping(value = "/rand_number.request")
	public String getRandomNumber(Model model) throws Exception{
		model.addAttribute("str", RandomStringUtils.random(20, Boolean.FALSE, Boolean.TRUE));
		return "common/stringTemplate";
	}
}
