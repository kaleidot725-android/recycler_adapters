package jp.kaleidot725.sample

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.kaleidot725.sample.databinding.LayoutRecyclerViewItemBinding

class ItemViewHolder(
    private val binding: LayoutRecyclerViewItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(message: String) {
        binding.messageTextView.text = message
    }
}

class CustomListAdapter : ListAdapter<String, ItemViewHolder>(DIFF_UTIL_ITEM_CALLBACK) {
    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        holder.bind(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        return ItemViewHolder(
            LayoutRecyclerViewItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    companion object {
        val DIFF_UTIL_ITEM_CALLBACK = object : DiffUtil.ItemCallback<String>() {
            override fun areContentsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: String, newItem: String): Boolean {
                return oldItem == newItem
            }
        }
    }
}