package kr.edcan.recyclerpractice.recycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kr.edcan.recyclerpractice.R

class RecyclerViewActivity : AppCompatActivity() {
    lateinit var recyclerView : RecyclerView
    lateinit var addBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recycler)

        recyclerView = findViewById(R.id.recyclerList)
        addBtn = findViewById(R.id.btn_recyclerView_addItem)

        val dataList = mutableListOf<Int>(1, 2, 3, 4, 5, 6)

        // TODO 11. 어댑터 만들기
        val adapter = ListAdapter(dataList)

        // TODO 12. 어댑터 연결 해주기
        recyclerView.adapter = adapter

        // TODO 13. Layout Manager 만들어주기
        recyclerView.layoutManager = LinearLayoutManager(this)


        addBtn.setOnClickListener {
            // TODO 14. 버튼 클릭할때 아이템 추가해주기
            dataList.add(dataList.size + 1)
            adapter.notifyDataSetChanged()
        }

    }
}