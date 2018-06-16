package com.kei.mailfactorykotlin.presetList

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.kei.mailfactorykotlin.databinding.PresetListRowBinding
import com.kei.mailfactorykotlin.model.MailData


class PresetListAdapter(var list: List<MailData>) : RecyclerView.Adapter<PresetListAdapter.ViewHolder>() {
    lateinit var listener: OnItemClickListener

    override fun onCreateViewHolder(parent: ViewGroup?, viewType: Int): ViewHolder {
        val binding = PresetListRowBinding.inflate(LayoutInflater.from(parent?.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.binding.mailData = list[position]
        holder.binding.title.setOnClickListener {
            listener.onClick(it, list[position])
        }
    }

    fun setOnItemClickListener(listener: OnItemClickListener) {
        this.listener = listener
    }

    interface OnItemClickListener {
        fun onClick(view: View, data: MailData)
    }

    class ViewHolder(var binding: PresetListRowBinding) : RecyclerView.ViewHolder(binding.root)
}