package view.beans;

public class ExecuteWithParamsBean {
    private Number empIdVal;

    public ExecuteWithParamsBean() {
    }

    public void setEmpIdVal(Number empIdVal) {
        System.out.println("ID Value in set Method is" + empIdVal);
        this.empIdVal = empIdVal;
    }

    public Number getEmpIdVal() {
        System.out.println("ID Value in Get Method is" + empIdVal);
        return empIdVal;
    }//testing git
}
