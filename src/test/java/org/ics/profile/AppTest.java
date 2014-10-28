package org.ics.profile;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**       
 * @Project：ics-profile   
 * @Package org.ics.profile
 * @Title: AppTest.java 
 * @Description: TODO
 * @Author jiangzhihu  
 * @CreateDate：2014年10月28日 上午11:59:38    
 * @Modifier：jiangzhihu    
 * @ModifyDate：2014年10月28日 上午11:59:38    
 * @ModifyNote：    
 * @version  V1.0.0 
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class AppTest {
    @Autowired
    private App app;
    
    @Test
    public void testGetEnvironment() {
        System.out.println(app.getEnvironment());
    }

}
