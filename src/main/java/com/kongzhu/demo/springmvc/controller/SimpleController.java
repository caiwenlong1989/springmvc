package com.kongzhu.demo.springmvc;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SimpleController {

    @RequestMapping("/simple")
    public @ResponseBody String simple() {
        return "Hello world!";
    }

    /**
     * 请求中文示例：
     * 1. Tomcat 服务器上配置 URIEncoding
     * 2. springmvc 当前项目配置 characterEncodingFilter
     * 3. appServlet-servlet.xml 配置 StringHttpMessageConverter
     * @return
     */
    @RequestMapping("/requestBody")
    public @ResponseBody String requestBody(Locale locale, Model model, String msg) {
        System.out.printf("请求参数msg内容是：%s\n", msg);
        return msg;
    }

    /**
     * 响应中文示例：
     * @return
     */
    @RequestMapping("/responseBody")
    public @ResponseBody String responseBody(Locale locale, Model model) {
        return "这是响应中文";
    }

    /**
     * 响应JSON示例：
     * 4. appServlet-servlet.xml 配置 MappingJackson2HttpMessageConverter
     * @return
     */
    @RequestMapping("/responseJson")
    public @ResponseBody Map<String, Object> responseJson(Locale locale, Model model) {
        Map<String, Object> map = new HashMap<>();
        map.put("success", true);
        map.put("msg", "操作成功");
        return map;
    }
}
