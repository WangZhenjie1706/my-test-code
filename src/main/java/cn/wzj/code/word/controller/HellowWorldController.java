package cn.wzj.code.word.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @version 1.0 created by wangzhenjie_fh on 2018年9月26日 下午3:27:50
 */
@RestController
public class HellowWorldController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String action() {
        return "你好";
    }
}
