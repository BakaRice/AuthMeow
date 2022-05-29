package com.ricemarch.authmoew.mapper;

import com.ricemarch.authmoew.dao.LoginInfo;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;

class LoginInfoMapperTest {

    @Test
    void findById() throws IOException {
        String resource = "mybatis-config.xml";
        InputStream inputStream = Resources.getResourceAsStream(resource);
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        LoginInfoMapper loginInfoMapper = sqlSession.getMapper(LoginInfoMapper.class);
        LoginInfo loginInfo = loginInfoMapper.findById(1);
        System.out.println(loginInfo.toString());
        sqlSession.close();
    }
}