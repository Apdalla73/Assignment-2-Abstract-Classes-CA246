# University Lecturer Salary Management System

Resources for the 45-minute Java assignment covering classes and objects, encapsulation, inheritance, polymorphism, and abstract classes.

## Contents

- `UML/University_Lecturer_Salary_Management_UML.drawio` — editable UML diagram.
- `UML/University_Lecturer_Salary_Management_UML.png` — high-resolution PNG diagram.
- `UML/University_Lecturer_Salary_Management_UML.svg` — scalable vector diagram.
- `Java_Solution/` — expected Java solution, split into five source files.

## Assignment requirements

- `Lecturer` is an abstract superclass.
- `FullTimeLecturer` salary = basic salary + research allowance + administrative allowance.
- `PartTimeLecturer` salary = teaching hours × hourly rate.
- Both concrete lecturer types implement `calculateSalary()` and `displayInformation()`.
- The payroll system displays all lecturers, the highest-paid lecturer, payroll totals by employment type, and lecturers earning more than $2,000.
- The implementation uses a fixed-size `Lecturer[]` array, not `List` or `ArrayList`.

## Compile and run

From the `Java_Solution` directory, run:

```bash
javac *.java
java Main
```

The payroll array has a capacity of 100 lecturer objects. The demonstration data is included in `Main.java`; instructors may adjust the sample values as needed.
