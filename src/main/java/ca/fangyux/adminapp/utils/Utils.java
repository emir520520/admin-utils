package ca.fangyux.adminapp.utils;

import javax.servlet.http.HttpServletRequest;
import java.math.BigInteger;
import java.net.http.HttpRequest;
import java.security.MessageDigest;

public class Utils {

    public static boolean detectRequestTypeForExceptionHandling(HttpServletRequest request){
        /*判断普通请求还是Ajax请求
         *我们可以通过请求头中的Accept和X-Requested-With属性来判断
         */

        //获取请求消息头属性
        String requestHeader=request.getHeader("Accept");
        String requestX=request.getHeader("X-Requested-With");

        if((requestHeader!=null && requestHeader.contains("application/json")) ||
                (requestX!=null && requestX.equals("XMLHttpRequest"))){
            return true;
        }else{
            return false;
        }
    }

    public static String MD5(String data) throws Exception {
        //判断data是否有效
        if(data==null || data.length()==0){
            throw new Exception(Props.STRING_FORMAT_INVALID);
        }

        //用异常捕捉来让JDK处理异常，否则抛异常我们还得自己处理
        try{
            //利用MessageDigest对象进行数据加密,这个对象由JDK提供
            String algorithm="md5";

            MessageDigest md=MessageDigest.getInstance(algorithm);

            //获取需加密数据的字节数组
            byte[] dataBytes=data.getBytes();

            //执行加密
            byte[] encryptedData=md.digest(dataBytes);

            //创建BigInteger对象
            int signum=1;   //BigInteger需要传入标记位数来标识正负
            BigInteger bi=new BigInteger(signum,encryptedData);

            //按照16进制将BigInteger的值转换成字符串
            int base=16;
            String result=bi.toString(base).toUpperCase();

            return result;
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}