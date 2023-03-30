/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AfterCourse;

import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class coursefile extends Thread{
    
    @Override
    public void run()
    {
        try {
            int counter=0;
            FileOutputStream f2=new FileOutputStream("/Users/dodo/Desktop/Courses.txt",true);
            DataOutputStream d2=new DataOutputStream(f2);
            for(int i=0;i<AfterCourse.course.size();i++)
            {
                d2.writeUTF(AfterCourse.course.get(i).name+"\n");
                d2.writeUTF(String.valueOf(AfterCourse.course.get(i).ID)+"\n");
                d2.writeUTF(String.valueOf(AfterCourse.course.get(i).price)+"\n");
                d2.writeUTF(String.valueOf(AfterCourse.course.get(i).hours)+"\n");
            }
            d2.close();
            f2.close();
            counter=AfterCourse.course.size();
        } catch (Exception e) {
            
        }  
    }
    
}
