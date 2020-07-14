package com.imooc.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestDemo {
    @Resource(name = "productDao")
    private ProductDao productDao;

    @Test
    public void test() {
        productDao.delete();
        productDao.findAll();
        productDao.save();
        productDao.update();
        productDao.findOne();
    }

    @Test
    public void i() {
        String s = "                ";
        String s1=s.trim();
        int s2=s1.length();
        if(s.length()==0 || s.equals(" ")) {
            System.out.println(0);
            return;
        }
        String[] str=s1.split(" +");
        System.out.println(str);
    }

    @Test
    public void h() {
        String s = "cbaebabacd";
        String p = "abc";
        List<Integer> list=new ArrayList<Integer>();
        boolean flag=true;
        int index=0;
        byte[] sb=s.getBytes();
        for(int i=0;i<=s.length()-p.length();i++){
            byte[] pb=p.getBytes();
            for(int j=0;j<p.length();j++){
                for(int h=0;h<pb.length;h++){
                    if(pb[h]!=0){
                        if(pb[h]==sb[i+j]) {
                            pb[h]=0;
                            continue;
                        }
                        if(h==pb.length-1 && sb[i+j]!=pb[h]){
                            flag=false;
                            index=j;
                        }
                    }
                }
                if(!flag){
                    break;
                }
            }
            if(flag){
                list.add(i);
            }else{
                flag=true;
                i=i+index;
            }
        }
        System.out.println(list);
    }
}
