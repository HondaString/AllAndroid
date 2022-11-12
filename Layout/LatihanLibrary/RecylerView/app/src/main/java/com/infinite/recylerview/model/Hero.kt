package com.infinite.recylerview.model

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by AndikaKurniaSandiYuda on 10/02/22.
 */

@Parcelize
data class Hero(
    var name: String,
    var description: String,
    var photo: String
) : Parcelable
