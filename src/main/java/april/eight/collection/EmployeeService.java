package april.eight.collection;

public interface EmployeeService {
    String addEmployee(String fio, int dep, int salary);
    String findEmployee(String fio);
    String deleteEmployee(String fio);

}
