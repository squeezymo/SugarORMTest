package model;

import com.orm.SugarRecord;
import com.orm.dsl.Ignore;

public class JavaUser extends SugarRecord {
    public String login = "login";
    @Ignore public String password = "password";
}