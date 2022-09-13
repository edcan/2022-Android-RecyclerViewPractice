package kr.edcan.recyclerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ListView

class ListViewActivity : AppCompatActivity() {
    lateinit var list : ListView
    lateinit var addBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        list = findViewById(R.id.list_listView)
        addBtn = findViewById(R.id.btn_listView_addItem)

        val dataList = mutableListOf<String>("Item 1", "Item 2", "Item 3", "Item 4", "Item 5")
        
        //TODO 1. 어댑터 만들기
        
        //TODO 2. 어댑터와 연결 해주기
        
        
        addBtn.setOnClickListener {
            // TODO 3. 버튼 클릭할때 아이템 추가하기  
        }
    }
}