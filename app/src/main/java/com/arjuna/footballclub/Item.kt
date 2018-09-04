package com.arjuna.footballclub

import android.annotation.SuppressLint
import android.os.Parcelable
import kotlinx.android.parcel.Parcelize

/**
 * Created by arjuna on 31/08/18.
 */

@Parcelize
data class Item (val name: String, val image: Int, val keterangan: String): Parcelable