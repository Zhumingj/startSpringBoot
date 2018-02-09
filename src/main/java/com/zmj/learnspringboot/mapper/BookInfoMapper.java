package com.zmj.learnspringboot.mapper;

import com.zmj.learnspringboot.pojo.BookInfo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
import java.util.Map;

/**
 * @Mapper
 * 可以不加这个注解，因为在启动类XXXApplication 里已经加了注解 @MapperScan("com.zmj.learnspringboot.mapper")
 * 因此会扫描com.zmj.learnspringboot.mapper包下所有的mapper接口，故此处可以不用加注解@Mapper了
 */
public interface BookInfoMapper {

    List<BookInfo> findAllBookInfo();

    BookInfo findBookInfoById(int id);

}
