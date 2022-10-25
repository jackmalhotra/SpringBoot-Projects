package webapp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import webapp.Dao.WebappDao;
import webapp.model.Product;

@Controller
public class Maincontoller
{
	
	@Autowired
	private WebappDao dao;
	
	@RequestMapping("/")
	public String home()
	{	
		return "index";
	}
	
	@RequestMapping("/add")
	public String addProduct(@ModelAttribute Product p,Model m)
	{
		System.out.println(p);
		m.addAttribute(p);
		this.dao.webapp(p);
		return "add_product_form";
	}
}
