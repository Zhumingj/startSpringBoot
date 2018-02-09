package com.zmj.learnspringboot.controller;

import com.zmj.learnspringboot.pojo.BookInfo;
import com.zmj.learnspringboot.service.BookInfoService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/book")
public class BookInfoController {

    private static Logger logger = LogManager.getLogger(BookInfoController.class);

    @Autowired
    private BookInfoService bookInfoService;

    @RequestMapping("/findAllBookInfo")
    public List<BookInfo> findAllBookInfo() {

        List<BookInfo> bookInfoList = bookInfoService.selectAllBookInfo();
        logger.debug("book info ==== : {}", bookInfoList.get(0).getAuthor());

        return bookInfoList;
    }

    @RequestMapping(value = "/findBookInfoById")
    public BookInfo findBookInfoById(@RequestParam Integer id) {

        BookInfo bookInfo = bookInfoService.selectBookInfoById(id);
        logger.debug("book info ====  : {}", bookInfo.getAuthor());

        return bookInfo;
    }

    @RequestMapping(value = "/findBookInfoById1")
    public BookInfo findBookInfoById1(@RequestBody Map<String,Object> params) {

        //@RequestBody 传json等形式的数据
        BookInfo bookInfo = bookInfoService.selectBookInfoById(Integer.parseInt(String.valueOf(params.get("id"))));
        logger.debug("book info ====  : {}", bookInfo.getAuthor());

        return bookInfo;
    }

    @RequestMapping("/test")
    public List<Map<String,Object>> test() {

        return bookInfoService.test();
    }


}
