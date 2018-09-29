package com.test;

import com.alibaba.druid.filter.config.ConfigTools;

public class TestUnit {

//    public static void main(String[] args) throws Exception {
//    	jdbc.publicKey=
//    	MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJ5y2f8BRji226Sk0XUhVGQtExAf0gEbFs1nm/VgJV9fkGyI0num2GPTh+qGY2CNRc8MKTfxc0fHGycYqZqT0TcCAwEAAQ==
//    			jdbc.password=
//    	BWH2lq0ZBFAZrd05XAJv2jOKkq15cfj8NK/ytxDyKMwvF95ZFTLtJ/ftnVmN+2djuwzrwLcU1lJxyKEJqAaiSA==    	
    	
    	
//    	store.jdbc.url=jdbc:mysql://10.124.145.174:3306/testgdhb_dhb_gd?autoReconnect=true&rewriteBatchedStatements=true&socketTimeout=30000&connectTimeout=3000
//    		store.jdbc.user=testgdhb_dhb_gd
//    		store.jdbc.publicKey=
    	
//    		store.jdbc.password=NobjnRMShmbAHuj6xM6IydOzZ0EHbVsNFcRqfKHiGR62mi4nPLUje6jN/lsdfMUKFHF8XPxPkyn/5tBkU47PGw==
//    	jdbc.publicKey=MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJ5y2f8BRji226Sk0XUhVGQtExAf0gEbFs1nm/VgJV9fkGyI0num2GPTh+qGY2CNRc8MKTfxc0fHGycYqZqT0TcCAwEAAQ==
//    	jdbc.password=BWH2lq0ZBFAZrd05XAJv2jOKkq15cfj8NK/ytxDyKMwvF95ZFTLtJ/ftnVmN+2djuwzrwLcU1lJxyKEJqAaiSA==

//    	String publickey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALt2MwX2lITv3ciYLuQJzaO8E0su1bQWCXazMxRqC/I9gk9hQz1bv3uYSYD65vsZWGaL7P0muReoORCCIaSHqYsCAwEAAQ==";
//    	String password = "NobjnRMShmbAHuj6xM6IydOzZ0EHbVsNFcRqfKHiGR62mi4nPLUje6jN/lsdfMUKFHF8XPxPkyn/5tBkU47PGw==";
//    	String publickey = "MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBAJ5y2f8BRji226Sk0XUhVGQtExAf0gEbFs1nm/VgJV9fkGyI0num2GPTh+qGY2CNRc8MKTfxc0fHGycYqZqT0TcCAwEAAQ==";
//        String password = "BWH2lq0ZBFAZrd05XAJv2jOKkq15cfj8NK/ytxDyKMwvF95ZFTLtJ/ftnVmN+2djuwzrwLcU1lJxyKEJqAaiSA==";
//        store.jdbc.publicKey=MFwwDQYJKoZIhvcNAQEBBQADSwAwSAJBALt2MwX2lITv3ciYLuQJzaO8E0su1bQWCXazMxRqC/I9gk9hQz1bv3uYSYD65vsZWGaL7P0muReoORCCIaSHqYsCAwEAAQ==
//        store.jdbc.password=NobjnRMShmbAHuj6xM6IydOzZ0EHbVsNFcRqfKHiGR62mi4nPLUje6jN/lsdfMUKFHF8XPxPkyn/5tBkU47PGw==

        
//        System.out.println(ConfigTools.decrypt(publickey, password));
        
//    }
    
    public static void main(String[] args) throws Exception {
      //加密生成公钥和密钥
      //密码明文
      
      String password = "devgdhb_dhb_gd";
   
   
      System.out.println("密码[ "+password+" ]的加密信息如下：\n");
   
   
   
      String [] keyPair = ConfigTools.genKeyPair(512);
   
      //私钥
   
      String privateKey = keyPair[0];
   
      //公钥
   
      String publicKey = keyPair[1];
   
      //用私钥加密后的密文
   
      password = ConfigTools.encrypt(privateKey, password);
   
   
   
      System.out.println("privateKey:"+privateKey);
   
      System.out.println("publicKey:"+publicKey);
   
      System.out.println("password:"+password); 
      
      System.out.println("======================解密=========================");
   
      String decryptPassword=ConfigTools.decrypt(publicKey, password);
   
      System.out.println("decryptPassword："+decryptPassword);
    }
}
