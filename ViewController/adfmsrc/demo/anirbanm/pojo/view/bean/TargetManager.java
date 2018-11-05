package demo.anirbanm.pojo.view.bean;

import demo.anirbanm.pojo.view.viewmodel.Employee;

import java.io.Serializable;

public class TargetManager implements Serializable {
    
    @SuppressWarnings("compatibility:1723062860563856318")
    private static final long serialVersionUID = 343309166175021746L;
    
    private Employee employeeInTarget;

    public TargetManager() {
        super();
    }
    
    public void initTarget() {
        System.out.println("employeeInTarget: " + getEmployeeInTarget());
    }
    
    public String toSource() {
        System.out.println("Changing employeeInTarget and returning to source-flow");
        employeeInTarget.setId(101);
        return "toSource";
    }

    public void setEmployeeInTarget(Employee employeeInTarget) {
        this.employeeInTarget = employeeInTarget;
    }

    public Employee getEmployeeInTarget() {
        return employeeInTarget;
    }
}
