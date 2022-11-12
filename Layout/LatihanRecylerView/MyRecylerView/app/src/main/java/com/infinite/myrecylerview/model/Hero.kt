package com.infinite.myrecylerview.model

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
 * Created by andikakurniasandiyuda on 10/02/21.
 */

@Parcelize
data class Hero(
    var name: String,
    var description: String,
    var photo: Int
) : Parcelable
