package com.abin.lee.spring.redis.dao.test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.abin.lee.spring.redis.dao.UserDao;
import com.abin.lee.spring.redis.pojo.User;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath:spring-redis.xml"})     //文件在resources下，编译时会拷贝到classes下
public class UserDaoTest {
    //private ApplicationContext app;

    @Autowired
    private UserDao userDao;
    @Before
    public void before() throws Exception {
        //app = new ClassPathXmlApplicationContext("com/abin/lee/spring/redis/spring-redis.xml");
        //userDao = (UserDao) app.getBean("userDao");
    }
    @Test
    public void crud() {
        // -------------- Create ---------------
        String uid = "u123456";
        String address1 = "Beijing.....";
        User user = new User();
        user.setAddress(address1);
        user.setUid(uid);
        userDao.save(user);
        // ---------------Read ---------------
        user = userDao.read(uid);
        System.out.println("address1="+user.getAddress());
        assertEquals(address1, user.getAddress());
        // --------------Update ------------
        String address2 = "ShenZhen.....";
        user.setAddress(address2);
        userDao.save(user);
        user = userDao.read(uid);
        System.out.println("address2Save="+user.getAddress());
        assertEquals(address2, user.getAddress());
        // --------------Delete ------------
        userDao.delete(uid);
        user = userDao.read(uid);
        //System.out.println("addressdel="+user.getAddress());
        assertNull(user);
    }
}
