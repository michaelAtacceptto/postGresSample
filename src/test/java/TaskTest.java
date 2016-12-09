import org.junit.After;
import org.junit.Before;
import org.sql2o.Connection;
import org.sql2o.Sql2o;

/**
 * Created by michaelsmith on 12/9/16.
 * Copyright Acceptto Corporation.
 */
public class TaskTest {

    @Before
    public void setUp(){
        DB.sql2o = new Sql2o("jdbc:postgresql://localhost:5432/to_do_test", null, null);

    }

    //sql20 is the same thing as hibernate
    @After
    public void tearDown(){
        try(Connection con = DB.sql2o.open()){
            String sql = "DELETE FROM tasks *;";
            con.createQuery(sql).executeUpdate();
        }
    }
}
