package com.bzy.template.controller;

import com.google.common.collect.Maps;
import com.bzy.template.vo.Listing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Controller
public class TemplateController {

	/**
	 * beetl 测试
	 * @param model
	 * @return
	 */
	
	@RequestMapping("/beetl/test1")
	public String bettl1(Model model){
		Map user = Maps.newHashMap();
		user.put("id", 1);
		user.put("name", "曹操");
		user.put("description", "一代枭雄");
		model.addAttribute("user", user);
		return "/beetl/index";
	}

	/**
	 * beetl 测试
	 * @param model
	 * @return
	 */
	@RequestMapping("/beetl/test2")
	public Object bettl2(Model  model){
		List<Integer> integerList =  new ArrayList<>();
		integerList.add(45);
		integerList.add(145);
		integerList.add(245);
		integerList.add(345);
		model.addAttribute("integerList",integerList);
		return  "/beetl/test1";
	}
	/**
	 * beetl 测试
	 * @param model
	 * @return
	 */
	@RequestMapping("/beetl/test3")
	public Object bettl3(Model  model){
		List<Listing> lists= new ArrayList<>();
		for (int i=0 ; i<10 ;i++) {
			Listing listing = new Listing();
			listing.setListId(1245L+i);
			listing.setListName("测试室"+i);
			listing.setMerchantId(4545L+i);
			listing.setStoreName("店铺"+i);
			listing.setPrdId(65L+i);
			listing.setTimeDate(new Date());
			listing.setPrice(12.1F+i);
			listing.setCreatTime(1512035816);
			lists.add(listing);
		}
		model.addAttribute("lists",lists);
		return  "/beetl/listing";
	}

	
	

	/**
	 *  httl 测试
	 * @param model
	 * @return
	 */
	
	@RequestMapping("/httl/test1")
	public Object httl(Model  model){
		Map user = Maps.newHashMap();
	
		user.put("name", "曹操");
		
		model.addAttribute("user", user);
		return "/httl/testHttl";
	}
	/**
	 *  httl 测试
	 * @param 
	 * @return
	 */
	
	@RequestMapping("/httl/test2")
	public Object httl2(Map<String, Object> context){
		List<Listing> lists= new ArrayList<>();
		for (int i=0 ; i<10 ;i++) {
			Listing listing = new Listing();
			listing.setListId(1245L+i);
			listing.setListName("测试室"+i);
			listing.setMerchantId(4545L+i);
			listing.setStoreName("店铺"+i);
			listing.setPrdId(65L+i);
			listing.setTimeDate(new Date());
			listing.setPrice(12.1F+i);
			listing.setCreatTime(1512035816);
			lists.add(listing);
		}
		context.put("lists", lists);
		return "/httl/listing";
	}
	
	


	/**
	 * freemarker测试
	 * @param model
	 * @return
	 */
	@RequestMapping("/freemarker/test1")
	public String freemarker1(Model  model){
		Map user = Maps.newHashMap();
		user.put("name", "[Angel -- 守护天使]");
		model.addAttribute("user", user);
		return "/freemarker/free";
	}



	/*@Autowired
    private  Configuration configuration; //freeMarker configuration  

	@RequestMapping("/test4")
	public void sendHtmlMailUsingFreeMarker() throws Exception {
		Map<String, Object> model = new HashMap<String, Object>();
		model.put("time", new Date());
		model.put("message", "这是测试的内容。。。");
		model.put("toUserName", "张三");
		model.put("fromUserName", "老许");

		Template t = configuration.getTemplate("welcome.ftl"); // freeMarker template  
		String content = FreeMarkerTemplateUtils.processTemplateIntoString(t, model);
		
	}*/

	@RequestMapping("/freemarker/tes2")
	public String freemarker2(Map<String, Object> model) {
		model.put("time", new Date());
		model.put("message", "这是测试的内容。。。");
		model.put("toUserName", "张三");
		model.put("fromUserName", "白爷");
		return "/freemarker/welcome"; 
	}
	
	@RequestMapping("/freemarker/tes3")
	public String freemarker2(Model model) {
			List<Listing> lists= new ArrayList<>();
			for (int i=0 ; i<10 ;i++) {
				Listing listing = new Listing();
				listing.setListId(1245L+i);
				listing.setListName("测试室"+i);
				listing.setMerchantId(4545L+i);
				listing.setStoreName("店铺"+i);
				listing.setPrdId(65L+i);
				listing.setTimeDate(new Date());
				listing.setPrice(12.1F+i);
				listing.setCreatTime(1512035816);
				lists.add(listing);
			}
			model.addAttribute("lists",lists);
		return  "/freemarker/listing";
	}

	
	
}
