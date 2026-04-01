package com.clx.xiaochangshu.auth;

import com.clx.xiaochangshu.auth.domain.dataobject.UserDO;
import com.clx.xiaochangshu.auth.domain.mapper.UserDOMapper;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;

@SpringBootTest
@Slf4j
class XiaochangshuAuthApplicationTests {

    @Resource
    private UserDOMapper userDOMapper;

    /**
     * 测试插入数据
     */
    @Test
    void testInsert() {
        UserDO userDO = UserDO.builder()
                .username("clx")
                .createTime(LocalDateTime.now())
                .updateTime(LocalDateTime.now())
                .build();

        userDOMapper.insert(userDO);
    }

}
