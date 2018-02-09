package com.zmj.learnspringboot.service.impl;

import com.zmj.learnspringboot.mapper.BookInfoMapper;
import com.zmj.learnspringboot.pojo.BookInfo;
import com.zmj.learnspringboot.service.BookInfoService;
import org.apache.ibatis.session.SqlSession;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

@Service
public class BookInfoServiceImpl implements BookInfoService {


    @Resource
    private BookInfoMapper bookInfoDao;

    @Resource
    private SqlSession sqlSession;

    private static Logger logger = LogManager.getLogger(BookInfoServiceImpl.class);

    @Override
    public List<BookInfo> selectAllBookInfo(){

        return bookInfoDao.findAllBookInfo();
    }

    @Override
    public BookInfo selectBookInfoById(int id) {
        return bookInfoDao.findBookInfoById(id);
    }

    @Override
    public List<Map<String, Object>> test() {
        return sqlSession.selectList("TestMapper.test");
    }
}
