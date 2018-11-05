package demo.anirbanm.pojo.view.viewmodel;

import java.io.Serializable;

public class Employee implements Serializable {
    
    @SuppressWarnings("compatibility:8575376380041958678")
    private static final long serialVersionUID = 4499831392044269994L;
    
    private Integer id;
    private String name;

    public Employee() {
        this(100, "New Employee");
    }
    
    public Employee(final Integer id, final String name) {
        this.id = id;
        this.name = name;
    }
    
    @Override
    public String toString() {
        return "Employee [id -> "
            + id + ", name -> "
            + name + "]";
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
