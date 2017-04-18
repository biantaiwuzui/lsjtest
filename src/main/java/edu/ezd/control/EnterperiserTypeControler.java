package edu.ezd.control;

import com.google.gson.Gson;
import edu.ezd.model.EnterpriseType;
import edu.ezd.service.EnterpriseTypeService;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Method;
import java.util.List;

/**
 * Created by JayJay on 2017/4/17.
 */
@Controller
@RequestMapping("/type")
public class EnterperiserTypeControler {
    private static final Logger log = Logger.getLogger(EnterperiserTypeControler.class);

    @Resource
    private EnterpriseTypeService enterpriseTypeService;

    @RequestMapping(value = "/getType", produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getType(HttpServletResponse response) throws UnsupportedEncodingException {
        List<EnterpriseType> list =  enterpriseTypeService.getEnterpriseList();
        Gson gson = new Gson();
        String json = gson.toJson(list);
        return json;
    }
    @GetMapping
    public String getEnterpriseType(Model model){
        model.addAttribute("enterpriseList",enterpriseTypeService.getEnterpriseList());
        return "test";
    }
}
