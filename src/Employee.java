public class Employee {
    private final String name;
    private final String surname;
    private final String middleName;
    private int department;
    private int salary;
    int id ;
    static int counter;

    @Override
    public String toString() {
        return "Id " + id +
                " \nФ.И.О сотрудника - " + surname + " " + name + " " + middleName +
                " \nработает в отделе - " + department +
                " \nЗарплата - " + salary;
    }

    public Employee(String surname, String name, String middleName, int department, int salary) {
        this.name = name;
        this.surname = surname;
        this.middleName = middleName;
        this.department = department;
        this.salary = salary;
        counter++;
        id = counter;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getMiddleName() {
        return middleName;
    }

    public int getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public int getId() {
        return id;
    }

    public static int getCounter() {
        return counter;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void getAList(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee);
        }
    }

    public static int calculatedMonthlySalaryExpenses(Employee[] employees) {
        int summa = 0;
        for (Employee employee : employees) {
            summa += employee.getSalary();
        }
        System.out.println("Сумма затрат на зарплаты в месяц " + summa);
        return summa;
    }

    public static void foundAnEmployeeWithAMinimumWage(Employee[] employees) {
        Employee min = employees[0];
        if (employees[0] != null) {
            int minSalary = employees[0].getSalary();
            for (Employee employee : employees) {
                if (employee.getSalary() < minSalary) {
                    minSalary = employee.getSalary();
                    min = employee;

                }
            }
        }
        System.out.println("\nМинимальная зарплата сотрудника - " + min);
    }

    public static void foundAnEmployeeWithTheMaximumSalary(Employee[] employees) {
        Employee max = employees[0];
        int maxSalary = employees[0].getSalary();
        for (Employee employee : employees) {
            if (employee.getSalary() > maxSalary) {
                maxSalary = employee.getSalary();
                max = employee;
            }
        }
        System.out.println("\nМаксимальная зарплата сотрудника - " + max);
    }

    public static void CalculatedTheAverageValueOfEmployeeSalaries(Employee[] employees) {
        int sum = 0;
        for (Employee employee : employees) {
            sum += employee.getSalary();
        }
        int averageAmount = sum / employees.length;
        System.out.println("Среднее значение зарплат " + averageAmount);
    }

    public static void GotAllTheNamesOfTheEmployees(Employee[] employees) {
        for (Employee employee : employees) {
            System.out.println(employee.getSurname() + " " + employee.getName() + " " + employee.getMiddleName());
        }
    }
}