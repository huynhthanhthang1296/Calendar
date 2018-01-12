package com.example.huynh.calender

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

/**
 * Created by ac13c on 1/12/2018.
 */
class CalendarEventAdapter(val mEvent: List<EventTest>): RecyclerView.Adapter<CalendarEventAdapter.RecyclerViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): RecyclerViewHolder {
        val inflater: LayoutInflater = LayoutInflater.from(parent?.context)
        val view: View = inflater.inflate(R.layout.item_event,parent,false)
        return RecyclerViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerViewHolder?, position: Int) {
        holder?.tvEventName?.text = mEvent[position].mEventName
    }

    override fun getItemCount(): Int {
        return mEvent.size
    }

    class RecyclerViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val tvEventName = itemView.findViewById<TextView>(R.id.tvEventName)
    }

}