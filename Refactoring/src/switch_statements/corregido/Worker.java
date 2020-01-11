/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package switch_statements.corregido;

/**
 *
 * @author Josue Cabezas
 */
public class Worker extends Employee {

    public Worker(float salary, float bonusPercentage) {
        super(salary, bonusPercentage);
    }

    @Override
    public float CalculateSalary() {
        return salary;
    }
}
