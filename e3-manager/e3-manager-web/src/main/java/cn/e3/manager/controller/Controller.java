package cn.e3.manager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import cn.e3.manager.service.ItemService;
import cn.e3.pojo.TbItem;

@RestController
public class Controller {
	
	@Autowired
	private ItemService itemService;
	
	@RequestMapping("item/{id}")
	//当使用@RequestMapping URI template 样式映射时， 即 someUrl/{paramId}, 
	//这时的paramId可通过 @Pathvariable注解绑定它传过来的值到方法的参数上。
	public TbItem findItemById(@PathVariable Long id){
		
		TbItem Item=itemService.findItemById(id);
		
		
		return Item;
		
		
	}
	

}
