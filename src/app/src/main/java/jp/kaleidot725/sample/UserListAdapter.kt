package jp.kaleidot725.sample

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import jp.kaleidot725.sample.databinding.LayoutUserItemBinding

class UserItemViewHolder(
    private val binding: LayoutUserItemBinding
) : RecyclerView.ViewHolder(binding.root) {
    fun bind(user: User) {
        binding.firstNameTextView.text = user.firstName
        binding.lastNameTextView.text = user.lastName
        binding.ageTextView.text = user.age.toString()
    }
}

class UserListAdapter : ListAdapter<User, UserItemViewHolder>(DIFF_UTIL_ITEM_CALLBACK) {

    override fun onBindViewHolder(holderUser: UserItemViewHolder, position: Int) {
        holderUser.bind(getItem(position))
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserItemViewHolder {
        return UserItemViewHolder(
            LayoutUserItemBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            )
        )
    }

    companion object {
        val DIFF_UTIL_ITEM_CALLBACK = object : DiffUtil.ItemCallback<User>() {
            override fun areContentsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem == newItem
            }

            override fun areItemsTheSame(oldItem: User, newItem: User): Boolean {
                return oldItem == newItem
            }
        }
    }
}