package test.com.abin.lee.spring.redis.dao.impl; 

import com.abin.lee.spring.redis.dao.UserDao;
import com.abin.lee.spring.redis.pojo.User;
import org.junit.Test;
import org.junit.Before; 
import org.junit.After;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

/** 
* UserDaoImpl Tester. 
* 
* @author <Authors name> 
* @since <pre>Jan 29, 2014</pre> 
* @version 1.0 
*/
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations={"classpath:spring-redis.xml"})
//@ContextConfiguration(locations={"file:src/main/webapp/WEB-INF/applicationContext.xml"})
//@ContextConfiguration(locations={"file:src/main/com/abin/lee/spring/redis/spring-redis.xml"})
@ContextConfiguration(locations={"classpath:com/abin/lee/spring/redis/spring-redis.xml"})
public class UserDaoImplTest {

    //private ApplicationContext app;
    @Autowired
    private UserDao userDao;
    @Before
    public void before() throws Exception {
        //app = new FileSystemXmlApplicationContext("/home/vuclip123/workspace/idea_web/spring/src/main/java/com/abin/lee/spring/redis/spring-redis.xml");
        //app = new ClassPathXmlApplicationContext("com/abin/lee/spring/redis/spring-redis.xml");
        //userDao = (UserDao) app.getBean("userDao");
    }


    @Test
    public void crud() throws Exception {
        // -------------- Create ---------------
        String uid = "u123456";
        String address1 = "上海";
        User user = new User();
        user.setAddress(address1);
        user.setUid(uid);
        userDao.save(user);
        // ---------------Read ---------------
        user = userDao.read(uid);
        System.out.println("address1="+user.getAddress());
        assertEquals(address1, user.getAddress());
        // --------------Update ------------
        String address2 = "北京";
        user.setAddress(address2);
        userDao.save(user);
        user = userDao.read(uid);
        System.out.println("address2Save="+user.getAddress());
        assertEquals(address2, user.getAddress());
        // --------------Delete ------------
        userDao.delete(uid);
        user = userDao.read(uid);
        System.out.println("addressdel="+user.getAddress());
        assertNull(user);
    }

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: save(final User user) 
* 
*/ 
@Test
public void testSave() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: read(final String uid) 
* 
*/ 
@Test
public void testRead() throws Exception { 
//TODO: TestRedis goes here...
} 

/** 
* 
* Method: delete(final String uid) 
* 
*/ 
@Test
public void testDelete() throws Exception { 
//TODO: TestRedis goes here...
} 


} 
