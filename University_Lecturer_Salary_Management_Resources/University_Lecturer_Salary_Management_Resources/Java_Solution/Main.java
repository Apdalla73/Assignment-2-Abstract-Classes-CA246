public class Main {

    public static void main(String[] args) {
        UniversityPayrollSystem payroll = new UniversityPayrollSystem();

        Lecturer lecturer1 = new FullTimeLecturer(
                "FT001", "Ahmed Ali", 1800, 300, 250);
        Lecturer lecturer2 = new FullTimeLecturer(
                "FT002", "Fatima Hassan", 1500, 200, 150);

        Lecturer lecturer3 = new PartTimeLecturer(
                "PT001", "Mohamed Omar", 60, 40);
        Lecturer lecturer4 = new PartTimeLecturer(
                "PT002", "Amina Yusuf", 45, 35);
        Lecturer lecturer5 = new PartTimeLecturer(
                "PT003", "Abdi Ahmed", 50, 45);

        payroll.addLecturer(lecturer1);
        payroll.addLecturer(lecturer2);
        payroll.addLecturer(lecturer3);
        payroll.addLecturer(lecturer4);
        payroll.addLecturer(lecturer5);

        System.out.println("\n=== ALL LECTURERS ===");
        payroll.displayAllLecturers();

        payroll.displayHighestPaidLecturer();

        System.out.println("\n=== PAYROLL SUMMARY ===");
        System.out.printf("Full-Time Payroll: $%,.2f%n",
                payroll.calculateFullTimePayroll());
        System.out.printf("Part-Time Payroll: $%,.2f%n",
                payroll.calculatePartTimePayroll());
        System.out.printf("Total Payroll: $%,.2f%n",
                payroll.calculateFullTimePayroll()
                        + payroll.calculatePartTimePayroll());

        payroll.displayLecturersEarningMoreThan(2000);
    }
}
