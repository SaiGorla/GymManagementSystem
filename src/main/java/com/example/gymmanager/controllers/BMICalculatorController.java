package com.example.gymmanager.controllers;

import com.example.gymmanager.models.BMI;
import com.example.gymmanager.models.Schedule;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping(path = "bmi")
public class BMICalculatorController {

    @GetMapping()
    public String showBMIPage(BMI bmi, Model model) {

        model.addAttribute("bmi", bmi);
        return "bmi";
    }

    @PostMapping("/calc")
    public String addSchedule(@Valid BMI bmi, BindingResult result, Model model) {

        if (result.hasErrors()) {
            model.addAttribute("bmi", bmi);
            return "bmi";
        }
        double bmiValue = bmi.getWeight() / (bmi.getHeight() * bmi.getHeight());
        model.addAttribute("result", String.format("%.2f",bmiValue));
        return "bmiResults";
    }
}
