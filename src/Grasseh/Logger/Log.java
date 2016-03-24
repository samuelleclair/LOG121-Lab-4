package Grasseh.Logger;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Static class that allows easy printing to the console, with formatted data
 * NOTE : This class was written in the LOG100 class. The point of this class
 * is to facilitate software development and debug. The use of this class
 * was allowed, for this project, by teacher Yvan Ross on March 24th, 2016.
 * It is does not affect the functions of the software in any other way.
 * 
 * @version 0.2
 * @author Steve Gagné
 * @since 2015-09-18
 */ 
public final class Log {
    //Sets the default_user used in logging (V0.1)
    private static final String user = System.getProperty("user.name");

    /**
     * Outputs the received data to the console, with a timestamp.
     * 
     * @since 2015-09-18
     * @param message
     * Contains the outputted message
     * @param type
     * Contains the type of message
     * @param user
     * Contains the user to be displayed
     */
    private static void log(String message,String type,String user){
        System.out.println(new SimpleDateFormat("dd-MM-yyyy HH:mm:ss.SSS").format(new Date()) + " -- " + user + " -- " + type + " : " + message);
    }

    /**
     * Logs an error message
     * 
     * @param message
     * Contains the outputted message
     */
    public static void error(String message){
        log(message,"ERROR",user);
    }

    /**
     * Logs a warning message
     * 
     * @param message
     * Contains the outputted message
     */
    public static void warn(String message){
        log(message,"WARNING",user);
    }
    
    /**
     * Logs a test message
     * 
     * @param message
     * Contains the outputted message
     */
    public static void test(String message){
        log(message,"TEST",user);
    }
    
    /**
     * Logs an informational message
     * 
     * @param message
     * Contains the outputted message
     */
    public static void test(int message){
        log(String.valueOf(message),"TEST",user);
    }

    /**
     * Logs an informationnal message
     * 
     * @param message
     * Contains the outputted message
     */
    public static void info(String message){
        log(message,"INFO",user);
    }
    
    /**
     * Logs an informational message
     * 
     * @param message
     * Contains the outputted message
     */
    public static void info(int message){
        log(String.valueOf(message),"INFO",user);
    }
    
    /**
     * Logs an informational message
     * 
     * @param message
     * Contains the outputted message
     */
    public static void info(double message){
        log(String.valueOf(message),"INFO",user);
    }
    
    /**
     * Logs an informational message
     * 
     * @param message
     * Contains the outputted message
     */
    public static void info(boolean message){
        log(String.valueOf(message),"INFO",user);
    }

    /**
     * Logs a critical message
     * 
     * @param message
     * Contains the outputted message
     */
    public static void critical(String message){
        log(message,"CRITICAL",user);
    }
	
}
