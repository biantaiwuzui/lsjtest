package edu.ezd.control;

import com.google.gson.Gson;
import edu.ezd.model.Industry;
import edu.ezd.service.IndustryService;
import edu.ezd.util.GsonUtil;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * Created by JayJay on 2017/4/17.
 */
@Controller
@RequestMapping("/industry")
public class IndustryControler {
    @Resource
    private IndustryService industryService;

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("industryList",industryService.findAll());
        return "industry";
    }

    @GetMapping("/{industryId}")
    public String getIndustry(@PathVariable int industryId){
        Industry industry = industryService.getIndustry(industryId);
        String json = GsonUtil.toJson(industry);
        return json;
    }

}
