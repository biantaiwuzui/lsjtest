package edu.ezd.control;

import edu.ezd.model.PositionName;
import edu.ezd.service.PositionNameService;
import edu.ezd.util.GsonUtil;
import org.springframework.stereotype.Controller;
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
@RequestMapping("/positionName")
public class PositionNameControler {
    @Resource
    private PositionNameService positionNameService;


    @GetMapping(value = "/{industryId}" ,produces = {"application/json;charset=UTF-8"})
    @ResponseBody
    public String getIndustry(@PathVariable int industryId){
        List<PositionName> positionNames = positionNameService.getPositionName(industryId);
        String json = GsonUtil.toJson(positionNames);
        return json;
    }

}
