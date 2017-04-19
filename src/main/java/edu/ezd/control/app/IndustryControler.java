package edu.ezd.control.app;

import edu.ezd.model.Industry;
import edu.ezd.model.PositionName;
import edu.ezd.service.IndustryService;
import edu.ezd.service.PositionNameService;
import edu.ezd.util.GsonUtil;
import edu.ezd.util.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/4/17.
 */
@Controller
@RequestMapping("/industryType")
public class IndustryControler {
    @Resource
    private IndustryService industryService;
    @Resource
    private PositionNameService positionNameService;
    @GetMapping("/index")
    public String index(){
        return "industry";
    }

    @GetMapping(produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String findAll(){
        List<Industry> industries = industryService.findAll();
        String json = JsonUtils.responseArraySuccess(industries);
        return json;
    }


  @GetMapping(value = "/{industryId}" ,produces = "application/json;charset=UTF-8")
  @ResponseBody
  public String getIndustry(@PathVariable int industryId){
      List<PositionName> positionNames = positionNameService.getPositionName(industryId);
      String json = GsonUtil.toJson(positionNames);
      return json;
  }

}
