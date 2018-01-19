package check;  

/** 
 * 
 * @author itwang 
 */  
public class Check {  
    public static boolean checkreturn(String account,String password){  
     boolean checkbool = false;  
    if("root".equals(account)&&"123456".equals(password)){  
       checkbool = true;  
    }  
    return checkbool;  
    }  
}  