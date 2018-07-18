package com.yj.banner.xxxbanner

import android.content.Context
import android.graphics.Color
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import kotlinx.android.synthetic.main.text_item.view.*


class SampleAdapter(private val context: Context, private val mDataSet: Array<String>) : BaseAdapter() {

    override fun getCount(): Int {
        return mDataSet.size
    }

    override fun getItem(position: Int): Any {
        return position
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View, parent: ViewGroup): View {
        val convertView = View.inflate(context, R.layout.text_item, null)
        convertView.apply {
            text.text = mDataSet[position]
            if (position % 2 == 0) {
                text.setBackgroundColor(Color.parseColor("#f5f5f5"))
            } else {
                text.setBackgroundColor(Color.WHITE)
            }
        }
        return convertView
    }

}
