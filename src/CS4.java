public class CS4 {

        static class employ{
            int nEmp;
            String sName;
            void mCalIncomeTax(long nSalary){
                System.out.println("tax is "+nSalary*0.1);
            }

        }

        public static void main(String[] args) {
            employ emp = new employ();
            emp.nEmp=12340;
            emp.sName="Tanya";
            emp.mCalIncomeTax(1234);
            System.out.println("Employee name is "+emp.sName);
            System.out.println("Employee id is "+emp.nEmp);
            employ emp2 = new employ();
            emp2.sName="Sudiksha";

        }
    }

