package demo.anirbanm.pojo.view.bean;

import demo.anirbanm.pojo.view.viewmodel.Employee;

import java.io.Serializable;

public class SourceManager implements Serializable {
    
    @SuppressWarnings("compatibility:-625565373012529941")
    private static final long serialVersionUID = -7373387897323599740L;
    
    private Employee employeeInSource;

    public SourceManager() {
        super();
    }
    
    public void initSource() {
        System.out.println("-------------------------------------------");
        System.out.println("Pass by reference");
        System.out.println("employeeInSource: " + getEmployeeInSource());
    }
    
    public String toTarget() {
        setEmployeeInSource(new Employee());
        System.out.println("Calling target-flow");
        System.out.println("employeeInSource: " + getEmployeeInSource());
        return "toTarget";
    }

    public void setEmployeeInSource(Employee employeeInSource) {
        this.employeeInSource = employeeInSource;
    }

    public Employee getEmployeeInSource() {
        return employeeInSource;
    }
}
