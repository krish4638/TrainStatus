package cubex.mahesh.railwayapi_trainstatus_oct7am.beans

import com.google.gson.annotations.SerializedName

data class ClassesItem(@SerializedName("code")
                       val code: String = "",
                       @SerializedName("available")
                       val available: String = "",
                       @SerializedName("name")
                       val name: String = "")