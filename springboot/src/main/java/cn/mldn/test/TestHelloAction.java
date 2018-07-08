package cn.mldn.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.StartBootMain;
import cn.mldn.action.HelloAction;
import junit.framework.TestCase;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootApplication
@SpringBootTest(classes=StartBootMain.class)
public class TestHelloAction {
	private static final Logger LOG = LoggerFactory.getLogger(TestHelloAction.class);
	@Autowired
	private HelloAction helloAction;
	@Test
	public void testHelloAction() {
		String info = helloAction.info();
		LOG.info("info  = " + info );
		TestCase.assertEquals(info, "www.mldn.cn");
	}
	
}
