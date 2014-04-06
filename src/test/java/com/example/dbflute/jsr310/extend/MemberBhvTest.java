package com.example.dbflute.jsr310.extend;

import static org.hamcrest.Matchers.*;
import static org.junit.Assert.*;

import com.example.dbflute.jsr310.exbhv.*;
import com.example.dbflute.jsr310.exentity.*;

import java.time.LocalDateTime;
import javax.inject.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Transactional;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:jdbcBeans.xml", "classpath:dbfluteBeans.xml" })
@Transactional
public class MemberBhvTest {
    @Inject
    MemberBhv memberBhv;

    @Test
    public void testSelect() {
        Member member = memberBhv.selectByPKValue(1);
        assertThat(member, is(notNullValue()));

        LocalDateTime updateDatetime = member.getUpdateDatetime();
        System.out.println(updateDatetime.toString());
    }
}
