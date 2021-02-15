package com.montrealcollege.exercise11.controller;

import com.montrealcollege.exercise11.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/create")
public class EmployeeController {

    @Autowired
    private Employee employee;

    @RequestMapping(path = "/{name}", method = RequestMethod.GET)
    public String createEmployee(@PathVariable String name, ModelMap modelMap) {
        employee.setFirstName(name);
        modelMap.addAttribute("message", "Employee created with name " + employee.getFirstName());
        return "hello";
    }

    @GetMapping("/salary")
    public String createEmployee(@RequestParam("firstname") String name,
                                 @RequestParam("lastname") String lastName,
                                 @RequestParam("salary") Integer salary,
                                 ModelMap modelMap) {
        employee.setFirstName(name);
        employee.setLastName(lastName);
        employee.setSalary(salary);

        modelMap.addAttribute("message",
                "Employee created with name " + employee.getFirstName() + " " +
                        employee.getLastName());
        modelMap.addAttribute("salarymessage", " and salary $" + employee.getSalary() + ".00");
        return "hello";
    }

    @ModelAttribute("employee")
    public Employee getEmployee() {
        return employee;
    }
}
