package april.eight.collection;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
    private final EmployeeService employeeService;

    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }


    @GetMapping(path = "/add")
    public String addEmployee(@RequestParam("fio") String fio, @RequestParam("dep") int dep, @RequestParam("salary") int salary) {
        return employeeService.addEmployee(fio, dep, salary);
    }

    @GetMapping(path = "/find")
    public String addEmployee(@RequestParam("fio") String fio) {
        return employeeService.findEmployee(fio);
    }

    @GetMapping(path = "/del")
    public String deleteEmployee(@RequestParam("fio") String fio) {
        return employeeService.deleteEmployee(fio);
    }

}
