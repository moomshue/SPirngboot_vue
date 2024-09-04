package com.cl.entity.view;

import com.cl.entity.ZhiyuantianbaoEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 志愿填报
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-05-22 14:46:13
 */
@TableName("zhiyuantianbao")
public class ZhiyuantianbaoView  extends ZhiyuantianbaoEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZhiyuantianbaoView(){
	}
 
 	public ZhiyuantianbaoView(ZhiyuantianbaoEntity zhiyuantianbaoEntity){
 	try {
			BeanUtils.copyProperties(this, zhiyuantianbaoEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
