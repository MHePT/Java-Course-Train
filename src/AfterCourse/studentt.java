/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfterCourse;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
  


public class studentt extends Thread {
    
    @Override
    public void run()
    {
        try {
            FileOutputStream f1=new FileOutputStream("/Users/dodo/Desktop/Students.txt",true);
            DataOutputStream d1=new DataOutputStream(f1);
            for(int i=0;i<AfterCourse.students.size();i++)
            {
                d1.writeUTF(AfterCourse.students.get(i).Name+"\n");
                d1.writeUTF(String.valueOf(AfterCourse.students.get(i).Id)+"\n");
                d1.writeUTF(AfterCourse.students.get(i).level+"\n");
                d1.writeUTF(String.valueOf(AfterCourse.students.get(i).paid)+"\n");
                d1.writeUTF(String.valueOf(AfterCourse.students.get(i).left)+"\n");
            }
            d1.close();
            f1.close();
        } catch (Exception e) {
            
        }
        
    }
    
}
