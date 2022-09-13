package kr.edcan.recyclerpractice.recycler

import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import kr.edcan.recyclerpractice.R

// TODO 5. RecyclerView.ViewHolder 상속 받기
class ListViewHolder(val view : View) : RecyclerView.ViewHolder(view) {
    // TODO 6. row_recycler_item.xml에서 만든 TextView 가져오기
    val textContent = view.findViewById<TextView>(R.id.txt_recyclerItem_content)

    // TODO 9. onBind 함수 작성하기
    fun onBind(content : Int){
        textContent.text = "Items $content"
    }

    // TODO 10. 리스트 아이템 클릭 이벤트
    init {
        view.setOnClickListener {
            Toast.makeText(view.context, "아이템 클릭 : ${textContent.text}", Toast.LENGTH_SHORT).show()
        }
    }
}