package iducs.springboot.bootjpa.controller;

import iducs.springboot.bootjpa.domain.Memo;
import iducs.springboot.bootjpa.service.MemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class MemoController {
    final MemoService memoService;

    public MemoController(MemoService memoService) {
        this.memoService = memoService;
    }
    @GetMapping("/memos/regform")
    public String getRegform(Model model) {
        model.addAttribute("memo", Memo.builder().build());
        return "/memos/create";
    }
    @PostMapping("/memos")
    public String postMemos(@ModelAttribute("memo") Memo memo, Model model) {
        memoService.create(memo);
        model.addAttribute("memo", memo);
        return "/memos/read-seq";
    }
    @GetMapping("/memos")
    public String getMemos(Model model) {
        List<Memo> list = memoService.readAll();
        model.addAttribute("list", list);
        return "/memos/read-list";
    }
    @GetMapping("/memos/{idx}")
    public String getMemoBySeq(@PathVariable("idx") Long seq, Model model) {
        Memo memo = memoService.readById(seq);
        model.addAttribute("memo", memo);
        return "/memos/read-seq";
    }

    @GetMapping("/memos/{idx}/upform")
    public String getUpform(@PathVariable("idx") Long seq, Model model) {
        Memo memo = memoService.readById(Long.valueOf(seq));
        model.addAttribute("memo" ,memo);
        return "/memos/update";
    }
    @PutMapping("/memos/{idx}")
    public String putMemos(@ModelAttribute("memo") Memo memo, Model model) {
        memoService.update(memo);
        model.addAttribute("memo", memo);
        return "/memos/read-seq";
    }
    @GetMapping("/memos/{idx}/delform")
    public String getDelform(@PathVariable("idx") Long seq, Model model) {
        Memo memo = memoService.readById(Long.valueOf(seq));
        model.addAttribute("memo" ,memo);
        return "/memos/delete";
    }
    @DeleteMapping("/memos/{idx}")
    public String deleteMemos(@ModelAttribute("memo") Memo memo) {
        memoService.delete(memo);
        return "redirect:/memos";
    }

}

