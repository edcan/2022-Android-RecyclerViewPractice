package kr.edcan.recyclerpractice.recycler

import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kr.edcan.recyclerpractice.R

// TODO 5. RecyclerView.ViewHolder 상속 받기
class ListViewHolder(val view : View) : RecyclerView.ViewHolder(view){
    // TODO 6. row_recycler_item.xml에서 만든 TextView 가져오기
    val itemContent = view.findViewById<TextView>(R.id.txt_recyclerItem_content)

    // TODO 7. onBind 함수 작성하
    fun onBind(content : Int){
        itemContent.text = "Item $content"
    }
}