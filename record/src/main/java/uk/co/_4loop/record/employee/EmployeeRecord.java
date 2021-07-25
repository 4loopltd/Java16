package uk.co._4loop.record.employee;

import java.io.Serializable;

public record EmployeeRecord(String firstName, String lastName) implements Employee, Serializable {

}
