package Chapter20;

import oracle.jdbc.OracleDriver;

import java.sql.*;

public class JDBCProgramming {
    public static void main(String[] args) throws Exception {

        // 1. 드라이버 등록(Reflection)
        Class.forName("oracle.jdbc.OracleDriver");
//        DriverManager.registerDriver(new OracleDriver());

        // 2. DBMS 접속 정보를 가지고 접속
        Connection connection = DriverManager.getConnection("jdbc:oracle:thin:@192.168.0.50:1521:xe", "java", "oracle21c");

        // 3. SQL 을 작성할 workSheet 생성, createStatement() = workSheet 생성
        Statement statement = connection.createStatement();

        // 4. 쿼리 작성
        String sql = "select * from employees";

        // 5. 쿼리 실행
        ResultSet resultSet = statement.executeQuery(sql);

        // 5. 결과 가져오기
        while (resultSet.next()) {                   // next() = has.next 랑 비슷함 꺼내올 데이터가 있으면 꺼내온다.
            int employeeId = resultSet.getInt("employee_id");
            String empName = resultSet.getString("emp_name");
            String phoneNumber = resultSet.getString("phone_number");
            Date hireDate = resultSet.getDate("hire_date");
            int salary = resultSet.getInt("salary");
            System.out.printf("%d\t%s\t%s\t%s\t%d\n", employeeId, empName, phoneNumber, hireDate, salary);
        }

        // 7. 자원종료
        resultSet.close();
        statement.close();
        connection.close();

        // 횡단 관심사 = AOP 기술, 나중에는 같은 거끼리 묶어주는것도 같이 즉 심화 과정을 통한 간결하게 나타내줘야한다.
    }
}