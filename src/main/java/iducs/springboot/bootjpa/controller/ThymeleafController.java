package iducs.springboot.bootjpa.controller;

import iducs.springboot.bootjpa.domain.Member;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

@Controller
public class ThymeleafController {
    @GetMapping("/thymeleaf/link")
    public String testLink(Model model) {
        List<Member> list = IntStream.rangeClosed(1, 10).asLongStream().mapToObj(i ->  {
            return Member.builder().seq(i)
                    .id("id : " + i)
                    .pw("pw : " + i)
                    .build();
        }).collect(Collectors.toList());
        model.addAttribute("list", list);
        return "/thymeleaf/test-link";
    }
}
