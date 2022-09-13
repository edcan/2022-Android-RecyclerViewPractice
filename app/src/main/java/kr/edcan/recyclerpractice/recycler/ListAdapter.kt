package kr.edcan.recyclerpractice.recycler

import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ListView
import androidx.recyclerview.widget.RecyclerView
import kr.edcan.recyclerpractice.R

// TODO 7. RecyclerView.Adapter 상속 받기
class ListAdapter(val items : MutableList<Int>) : RecyclerView.Adapter<ListViewHolder>() {
    // TODO 8. 함수들 정의 해주기

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.row_recycler_item, parent, false)

        return ListViewHolder(view)
    }

    override fun onBindViewHolder(holder: ListViewHolder, position: Int) {
        holder.onBind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }


}