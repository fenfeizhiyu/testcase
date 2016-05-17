package com.testframe.core;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.UrlResource;
import org.springframework.web.context.support.ServletContextResource;

import com.testframe.util.PrintUtil;

public class ResurceTest {

	public static void main(String[] args) throws Exception{
		String path1="http://www.springframework.org/dtd/spring-beans-2.0.dtd";
		String path2="file:D:/log/2016-1-20.txt";
		String cpath1="com/testframe/util/testfile.txt";
		String spath1="";
		/**
		 * Spring Url资源定位
		 */
		//UrlResource urlResource=new UrlResource(path1);
		//PrintUtil.printFileInputStream(urlResource.getInputStream(),"UTF-8");
		/**
		 *类加载路径里资源
		 */
		//ClassPathResource cpr=new ClassPathResource(cpath1);
		//PrintUtil.printFileInputStream(cpr.getInputStream(),"UTF-8");
		//ServletContextResource scr=new ServletContextResource(spath1);
	}
}
