import org.sql2o.Sql2o;

/**
 * Created by michaelsmith on 12/9/16.
 * Copyright Acceptto Corporation.
 */
public class DB {

    public static Sql2o sql2o = new Sql2o("jdbc:postgresql://localhost:5432/to_do", null, null);
}
