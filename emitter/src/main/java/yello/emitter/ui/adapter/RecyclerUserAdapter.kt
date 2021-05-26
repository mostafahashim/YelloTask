package yello.emitter.ui.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.RecyclerView
import yello.emitter.R
import yello.emitter.databinding.ItemProgressLoadingBinding
import yello.emitter.databinding.ItemRecyclerUserBinding
import yello.emitter.observer.OnRecyclerItemClickListener
import yello.emitter.model.UserModel


class RecyclerUserAdapter(
    var userModels: ArrayList<UserModel>,
    var onRecyclerItemClickListener: OnRecyclerItemClickListener
) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    lateinit var context: Context
    val ItemViewData = 1
    val ItemViewProgress = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val inflater = LayoutInflater.from(parent.context)
        context = parent.context
        if (viewType == ItemViewData) {
            val binding = DataBindingUtil.inflate(
                inflater,
                R.layout.item_recycler_user,
                parent,
                false
            ) as ItemRecyclerUserBinding
            return ViewHolder(binding)
        } else {
            val binding = DataBindingUtil.inflate(
                inflater,
                R.layout.item_progress_loading,
                parent,
                false
            ) as ItemProgressLoadingBinding
            return ProgressViewHolder(binding)
        }
    }

    override fun getItemViewType(position: Int): Int {
        return if (userModels[position].holderType!!.isEmpty()) ItemViewData else ItemViewProgress
    }

    override fun getItemCount() = userModels.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ProgressViewHolder)
            return

        var holder = holder as ViewHolder

        holder.binding.model = userModels[holder.adapterPosition]


        holder.binding.layoutItemRecyclerService.setOnClickListener {
            onRecyclerItemClickListener.onRecyclerItemClickListener(position)
        }

    }

    fun setList(list: ArrayList<UserModel>) {
        this.userModels = list
        notifyDataSetChanged()
    }

    class ViewHolder(var binding: ItemRecyclerUserBinding) :
        RecyclerView.ViewHolder(binding.root)

    class ProgressViewHolder(var binding: ItemProgressLoadingBinding) :
        RecyclerView.ViewHolder(binding.root)

}