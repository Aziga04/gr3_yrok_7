package com.example.gr3_yrok_7

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.gr3_yrok_7.databinding.ItemBinding
import kotlin.reflect.KFunction1

class Adaptor(
    private var list: List<Madel>, val onClick: KFunction1<Int, Unit>

) : RecyclerView.Adapter<Adaptor.ViewHoldelr>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHoldelr {
        return ViewHoldelr(ItemBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: ViewHoldelr, position: Int) {
        holder.onBind(list[position], position)
    }

    override fun getItemCount() = list.size

    inner class ViewHoldelr(private val binding: ItemBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun onBind(madel: Madel, position: Int) {
            itemView.setOnClickListener {
                onClick(position)
            }
            binding.ivAvatar.setImageResource(madel.image)
            binding.tvName.text = madel.name
            binding.tvStatus.text = madel.alive

        }
    }
}