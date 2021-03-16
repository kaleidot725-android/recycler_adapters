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
                User("first", "second", 100),
                User("first", "second", 100),
                User("first", "second", 100),
                User("first", "second", 100),
                User("first", "second", 100),
                User("first", "second", 100),
                User("first", "second", 100),
                User("first", "second", 100)
            )
        )
    }
}
