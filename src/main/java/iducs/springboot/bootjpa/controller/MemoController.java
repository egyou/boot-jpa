package iducs.springboot.bootjpa.controller;

import iducs.springboot.bootjpa.entity.MemoEntity;
import iducs.springboot.bootjpa.service.MemoService;
import iducs.springboot.bootjpa.service.MemoServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Optional;

@Controller
public class MemoController {
    @Autowired
    MemoService memoService;

    @GetMapping("/memos")
    public String getMemos(Model model) {
        List<MemoEntity> list = memoService.findAll();
        model.addAttribute("list", list);
        return "/memos/list";
    }
    @GetMapping("/memos/{idx}")
    public String getMemoBySeq(@PathVariable("idx") Long seq, Model model) {
        Optional<MemoEntity> result = memoService.findById(seq);
        if(result.isPresent()) {
            MemoEntity memo = result.get();
            model.addAttribute("memo", memo);
        }
        else
            System.out.println("not found");
        return "/memos/find-seq";
    }
}

