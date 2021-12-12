package com.company;

import java.util.ArrayList;
import java.util.List;

public class ZigZagConversion {
    private String str;

   public ZigZagConversion(String str){

      this.str=str;
}
   public String conversion(int numRows) {
       int l = this.str.length();
       List<StringBuffer> zigzag = new ArrayList<StringBuffer>();
       for (int i = 0; i < numRows; i++) {
           zigzag.add(new StringBuffer());
       }

       boolean comingFromTop = true;
       int zig = 0;
       for (int i = 0; i < l; i++) {
           zigzag.get(zig).append(this.str.charAt(i));
           if (zig == numRows - 1) {
               comingFromTop = false;
           } else if (zig == 0) {
               comingFromTop = true;
           }

           zig = comingFromTop ? zig + 1 : zig - 1;
           zig = zig % numRows;
       }
       StringBuffer sb =new StringBuffer();
       for (int i=0; i<numRows; i++){
           sb.append(zigzag.get(i));
       }
       return  sb.toString();
   }

}
