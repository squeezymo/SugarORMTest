package model

import com.orm.SugarRecord
import com.orm.dsl.Ignore

class KotlinUser1 : SugarRecord() {
    var login: String = "login"
    @Ignore @JvmField var password: String = "password"
}

class KotlinUser2 : SugarRecord() {
    var login: String = "login"
    @field:Ignore var password: String = "password"
}