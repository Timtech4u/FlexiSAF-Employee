/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */package entity;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author timtech
 */
@Entity
@Table(name = "Employee")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Employee.findAll", query = "SELECT e FROM Employee e"),
    @NamedQuery(name = "Employee.findByEmpId", query = "SELECT e FROM Employee e WHERE e.empId = :empId"),
    @NamedQuery(name = "Employee.findByEmpName", query = "SELECT e FROM Employee e WHERE e.empName = :empName"),
    @NamedQuery(name = "Employee.findByEmpAge", query = "SELECT e FROM Employee e WHERE e.empAge = :empAge"),
    @NamedQuery(name = "Employee.findByEmpAddress", query = "SELECT e FROM Employee e WHERE e.empAddress = :empAddress"),
    @NamedQuery(name = "Employee.findByEmpEmail", query = "SELECT e FROM Employee e WHERE e.empEmail = :empEmail"),
    @NamedQuery(name = "Employee.findByEmpTel", query = "SELECT e FROM Employee e WHERE e.empTel = :empTel")})
public class Employee implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "emp_id")
    private Integer empId;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "emp_name")
    private String empName;
    @Basic(optional = false)
    @NotNull
    @Column(name = "emp_age")
    private int empAge;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "emp_address")
    private String empAddress;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "emp_email")
    private String empEmail;
    @Basic(optional = false)
    @NotNull
    @Column(name = "emp_tel")
    private int empTel;

    public Employee() {
    }

    public Employee(Integer empId) {
        this.empId = empId;
    }

    public Employee(Integer empId, String empName, int empAge, String empAddress, String empEmail, int empTel) {
        this.empId = empId;
        this.empName = empName;
        this.empAge = empAge;
        this.empAddress = empAddress;
        this.empEmail = empEmail;
        this.empTel = empTel;
    }

    public Integer getEmpId() {
        return empId;
    }

    public void setEmpId(Integer empId) {
        this.empId = empId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public int getEmpAge() {
        return empAge;
    }

    public void setEmpAge(int empAge) {
        this.empAge = empAge;
    }

    public String getEmpAddress() {
        return empAddress;
    }

    public void setEmpAddress(String empAddress) {
        this.empAddress = empAddress;
    }

    public String getEmpEmail() {
        return empEmail;
    }

    public void setEmpEmail(String empEmail) {
        this.empEmail = empEmail;
    }

    public int getEmpTel() {
        return empTel;
    }

    public void setEmpTel(int empTel) {
        this.empTel = empTel;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (empId != null ? empId.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Employee)) {
            return false;
        }
        Employee other = (Employee) object;
        if ((this.empId == null && other.empId != null) || (this.empId != null && !this.empId.equals(other.empId))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "entity.Employee[ empId=" + empId + " ]";
    }
    
}
