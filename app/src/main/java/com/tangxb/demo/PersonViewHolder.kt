package com.tangxb.demo

import android.support.v7.widget.RecyclerView
import android.view.View
import android.widget.TextView

/**
 * Created by Taxngb on 2017/11/13.
 */
class PersonViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var textView: TextView? = null

    init {
        textView = itemView.findViewById(R.id.tv)
    }
}