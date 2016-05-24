package org.c3p0;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;
import java.sql.Connection;
import java.sql.SQLException;
import com.mysql.jdbc.Driver;

public class ConnectionPool {

	private static ComboPooledDataSource ds;
	
	private static String jdbcUrl="jdbc:mysql://192. 168.100.60:3306/51fanli_mall?useUnicode=true&characterEncoding=UTF-8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true";
	public synchronized static final Connection getConnection(){
		try{
			if(ds!=null){
				return  ds.getConnection();
			}else{
				ds=new ComboPooledDataSource(true);
				ds.setJdbcUrl(jdbcUrl);
				try{
					ds.setDriverClass("com.mysql.jdbc.Driver");
				}catch(PropertyVetoException e){
					e.printStackTrace();
					return null;
				}
				ds.setUser("root");
				ds.setPassword("root");
				ds.setInitialPoolSize(10);
				ds.setMinPoolSize(2);
				ds.setMaxPoolSize(20);
				ds.setMaxIdleTime(5);
				return ds.getConnection();
				
			}
		}catch(Exception e){
			return null;
		}
	}
	
	
	public static void printPoolInfo() throws SQLException{
		if(ds!=null){
			System.out.println("最大连接数"+ds.getMaxPoolSize());
			System.out.println("最小连接数"+ds.getMinPoolSize());
			System.out.println("空闲连接数"+ds.getNumIdleConnections());
			System.out.println("使用连接数"+ds.getNumBusyConnections());
		}
	}
}
