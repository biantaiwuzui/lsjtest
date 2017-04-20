package edu.ezd.control.types;

import edu.ezd.model.RecruitmentDetailsType;
import edu.ezd.service.RecruitmentDetailsTypeService;
import edu.ezd.util.JsonUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by JayJay on 2017/4/20.
 */
@Controller
@RequestMapping("/rdType")
public class RecruitmentDetailsTypeControler {
    @Resource
    private RecruitmentDetailsTypeService recruitmentDetailsTypeService;

    @GetMapping
    public String index(){
        return "index";
    }
    @GetMapping(value = "/findAll",produces = "application/json;charset=UTF-8")
    @ResponseBody
    public String findAll(){
        List<RecruitmentDetailsType> recruitmentDetailsTypes = recruitmentDetailsTypeService.findAll();
        String json = JsonUtils.responseArraySuccess(recruitmentDetailsTypes);
        return json;
    }
    @PostMapping("/{name}")
    public String save(@PathVariable String name){
        RecruitmentDetailsType recruitmentDetailsType = new RecruitmentDetailsType();
        recruitmentDetailsType.setRecruitmentDetailsTypeName(name);
        System.out.println("Controller前:>>>"+recruitmentDetailsType.getRecruitmentDetailsTypeId());
        recruitmentDetailsTypeService.save(recruitmentDetailsType);
        System.out.println("Controller后:>>>"+recruitmentDetailsType.getRecruitmentDetailsTypeId());
        return "index";
    }

    @PutMapping("/edit")
    public String edit(RecruitmentDetailsType recruitmentDetailsType){
        recruitmentDetailsTypeService.update(recruitmentDetailsType);
        return "redirect:/rdType";
    }
}
