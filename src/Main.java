public class Main {
    public static void main(String[] args) {
        Employee[] employees = new Employee[]{
        new Employee("Гракович", "Анатолий", "Сергеевич", 1, 21000),
        new Employee("Волкова", "Виктория", "Викторовна", 2, 20000),
        new Employee("Черкасов", "Тимофей", "Арсентьевич", 3, 45000),
        new Employee("Егоров", "Александр", "Тимофеевич", 4, 40000),
        new Employee("Волков", "Иван", "Миронович", 5, 35000),
        new Employee("Ларин", "Арсений", "Германович", 3, 25000),
        new Employee("Громов", "Александр", "Максимович", 4, 95000),
        new Employee("Литвинов", "Фёдор", "Александрович", 2, 80000),
        new Employee("Прохоров", "Олег", "Дмитриевич", 1, 57000),
        new Employee("Михайлов", "Антон", "Максимович", 5, 75000),
        };
        Employee.getAList(employees);
        Employee.calculatedMonthlySalaryExpenses(employees);
        Employee.foundAnEmployeeWithAMinimumWage(employees);
        Employee.foundAnEmployeeWithTheMaximumSalary(employees);
        Employee.CalculatedTheAverageValueOfEmployeeSalaries(employees);
        Employee.GotAllTheNamesOfTheEmployees(employees);
    }
}