package sandbox.client;

import com.smartgwt.client.data.DataSource;
import com.smartgwt.client.data.fields.*;

public class EmployeeDS extends DataSource {

    private static EmployeeDS instance = null;

    public static EmployeeDS getInstance() {
        if (instance == null) {
            instance = new EmployeeDS("employeeDS");
        }
        return instance;
    }

    public EmployeeDS(String id) {

        setID(id);
        setRecordXPath("/records/record");
        DataSourceIntegerField pkField = new DataSourceIntegerField("empno");
        pkField.setHidden(true);
        pkField.setPrimaryKey(true);

        DataSourceTextField fname = new DataSourceTextField("fname");
        DataSourceTextField lname = new DataSourceTextField("lname");
        DataSourceTextField title = new DataSourceTextField("title");
        DataSourceTextField salary = new DataSourceTextField("salary");
        setFields(pkField, fname, lname, title, salary);

        setDataURL("employee.data.xml");
        setClientOnly(true);
    }
}
