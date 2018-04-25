package notice.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author 刘晨
 * @create 2018-04-25 21:57
 * To change this template use File | Settings | Editor | File and Code Templates.
 **/
@Controller
public class IndexController {

    @RequestMapping("/toIndex")
    public String toIndex(){
        return "/template/common/index.html";
    }
}
