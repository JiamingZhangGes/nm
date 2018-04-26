package cn.ges.nm.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author gespent@163.com
 */
@Controller
public class GuideController {

    /**
     * 导航Controller，所有未映射的页面均以此处理
     *
     * @return
     */

    /**
     * 返回的页面后缀
     */
    @Value("${PAGE_SUFFIX}")
    private String pageSuffix;

    @RequestMapping("/ui/{path}")
    public String guide(@PathVariable() String path) {

        return "redirect:" +"/"+ path + pageSuffix;
    }
}
