package com.advancecity.profilpage.Models

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class ResponseFollowersCollection {

    @SerializedName("Result")
    @Expose
    var result: FollowersCollection? = null
    @SerializedName("IsSuccess")
    @Expose
    var isSuccess: Boolean? = null
    @SerializedName("Errors")
    @Expose
    var errors: List<Any>? = null

}