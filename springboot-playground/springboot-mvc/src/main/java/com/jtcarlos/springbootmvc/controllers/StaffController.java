package com.jtcarlos.springbootmvc.controllers;

import com.jtcarlos.springbootmvc.models.Staff;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/staffs")
public class StaffController {
    private static final List<Staff> staffs = new ArrayList<>();
    static {
        for (int counter = 1; counter <= 4; counter++) {
            staffs.add(new Staff(counter, "F" + counter, "L" + counter, "P" + counter));
        }
    }

    @GetMapping
    public String getAllStaffs(Model model) {
        model.addAttribute("staffs", staffs);
        return "staffs";
    }
}
