package com.zmj.learnspringboot.service;

import com.zmj.learnspringboot.pojo.BookInfo;

import java.util.List;
import java.util.Map;

public interface BookInfoService {

   List<BookInfo> selectAllBookInfo();

   BookInfo selectBookInfoById(int id);

   List<Map<String,Object>> test();
}
