package com.tangxb.demo

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

/**
 * Created by Taxngb on 2017/11/13.
 */
class PersonAdapter(val list: ArrayList<Person>) : RecyclerView.Adapter<PersonViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): PersonViewHolder {
        var itemView: View = LayoutInflater.from(parent?.context).inflate(R.layout.item_rv, parent, false)
        return PersonViewHolder(itemView!!)
    }

    override fun onBindViewHolder(holder: PersonViewHolder, position: Int) {
        holder.textView?.setText(list.get(position).name)
    }

    override fun getItemCount(): Int {
        return list?.size ?: 0
    }
}