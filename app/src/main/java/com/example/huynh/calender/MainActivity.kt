package com.example.huynh.calender

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.widget.LinearLayout

class MainActivity : AppCompatActivity() {

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_main)

    val mRecyclerView = findViewById<RecyclerView>(R.id.recyclerView)
    mRecyclerView.layoutManager = LinearLayoutManager(this, LinearLayout.VERTICAL, false)

    val events = ArrayList<EventTest>()
    events.add(EventTest("1 Thông báo"))
    events.add(EventTest("2 Thông báo"))
    events.add(EventTest("3 Thông báo"))
    events.add(EventTest("4 Thông báo"))
    events.add(EventTest("5 Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))
    events.add(EventTest("Thông báo"))

    val mAdapter = CalendarEventAdapter(events)
    mRecyclerView.adapter = mAdapter
  }
}
