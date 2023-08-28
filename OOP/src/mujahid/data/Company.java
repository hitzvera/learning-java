package mujahid.data;

public class Company {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public class Employee {
        String name;

        public String getName() {
            return name;
        }

        public String getCompany() {
            return Company.this.name; // bisa langsung access private fieldnya
        }

        public void setName(String name) {
            this.name = name;
        }
    }

}
