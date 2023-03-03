package hackerRank;

public abstract class Employee {

        abstract void setSalary(int salary);

        abstract int getSalary();

        abstract void setGrade(String grade);

        abstract String getGrade();

        void label() {
            System.out.println("Employee's data:");

    }

    class Engineer extends Employee {
        private int salary;
        private String grade;

        public Engineer(int salary, String grade) {
            this.salary = salary;
            this.grade = grade;
        }

        @Override
        void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        int getSalary() {
            return salary;
        }

        @Override
        void setGrade(String grade) {
            this.grade = grade;
        }

        @Override
        String getGrade() {
            return grade;
        }
    }

    class Manager extends Employee {
        private int salary;
        private String grade;

        public Manager(int salary, String grade) {
            this.salary = salary;
            this.grade = grade;
        }

        @Override
        void setSalary(int salary) {
            this.salary = salary;
        }

        @Override
        int getSalary() {
            return salary;
        }

        @Override
        void setGrade(String grade) {
            this.grade = grade;
        }

        @Override
        String getGrade() {
            return grade;
        }
    }
}
