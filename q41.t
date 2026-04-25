package q41;

import java.util.Optional;

@RestController
public class q41 {

    
EmployeeService employeeService;  

q41(EmployeeService employeeService){
    this.employeeService = employeeService;
}

@GetMapping("/employee")
public ResponseEntity<?> getEmployees(){
    Optional<?> result = employeeService.findAll();
    return  ResponseEntity.status(HttpStatus.ok).body(result.get());
}

@PostMapping("/save")
public ResponseEntity<String> saveEmployees(List<Employees> employees){
    try{
    employeeService.saveEmployees(employees);
    return ResponseEntity.status(HttpStatus.CREATED).body("Employees saves successfully");
    }catch(RuntimeException e){
         return ResponseEntity.status(HttpStatus.500).body("employee saving failed");
    }  
}
    
}
