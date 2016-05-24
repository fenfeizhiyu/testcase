package org.c3p0;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	while(true){
    		for(int i=0;i<10;i++){
    			Connection con=ConnectionPool.getConnection();
    			Thread.sleep(1000);
    			if(con!=null)
    				con.close();
        		ConnectionPool.printPoolInfo();
        		Thread.sleep(1000*5);
    		}
    		ConnectionPool.printPoolInfo();
    		Thread.sleep(1000*5);
    	}
    }
}
