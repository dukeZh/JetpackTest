package com.startcat.databinding;

/**
 * @author duke_zh
 */
public class StartUtils {
     public static String getStar(int star){
         String starName = "";
         switch (star){
             case 1:
                 starName ="一星";
                 break;
             default:
                 break;

         }
         return starName;
     }
}
