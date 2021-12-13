package com.nanda.submissiondicoding.Club

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Club(

    var name: String = "",
    var detail : String = "",
    var photo : Int = 0

) : Parcelable
