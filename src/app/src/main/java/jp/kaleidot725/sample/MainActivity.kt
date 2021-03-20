package jp.kaleidot725.sample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import jp.kaleidot725.sample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val listAdapter = UserListAdapter()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.recyclerView.adapter = listAdapter
        binding.recyclerView.layoutManager = LinearLayoutManager(applicationContext, RecyclerView.VERTICAL, false)
        listAdapter.submitList(
            listOf(
                User("あいざわ", "かずき", 29),
                User("ふじくら", "まさひろ", 52),
                User("よしずみ", "ひろゆき", 54),
                User("ほりのうち", "しんいち", 40),
                User("はすぬま", "よしろう", 37),
                User("はなわ", "のぶお", 38),
                User("おじま", "おじま", 31),
                User("しんざき", "くにひと", 35)
            )
        )
    }
}
