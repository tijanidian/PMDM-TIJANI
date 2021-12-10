package com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.LinearLayoutManager
import com.google.gson.Gson
import com.tijanidian.pmpd_playground.commons.serializer.GsonSerializer
import com.tijanidian.pmpd_playground.databinding.ActivityListFragmentBinding
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.PlayerDataRepository
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.data.local.file.PlayerFileLocalSource
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.domain.GetPlayerUseCase
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.ryceclerview.PlayerAdapter
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.ryceclerview.PlayerViewState
import com.tijanidian.pmpd_playground.ut2.ut02ex06form.presentation.viewmodel.ListFragmentViewModel

class ListFragment : Fragment() {

    private lateinit var binding: ActivityListFragmentBinding

    private val viewModel: ListFragmentViewModel by lazy {
        ListFragmentViewModel(
            GetPlayerUseCase(
                PlayerDataRepository(
                    PlayerFileLocalSource(
                        requireContext(),
                        GsonSerializer(Gson())
                    )
                )
            )
        )
    }

    private val playerAdapter = PlayerAdapter()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = ActivityListFragmentBinding.inflate(inflater, container, false)
        setUpView()
        setUpViewStateObserver()
        return binding.root
    }

    private fun setUpView() {
        binding.playerList.adapter = playerAdapter
        binding.playerList.layoutManager =
            LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)
    }

    private fun setUpViewStateObserver() {
        val observer = Observer<List<PlayerViewState>> {
            playerAdapter.setItems(it)
        }
        viewModel.playerViewState.observe(viewLifecycleOwner, observer)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        viewModel.getPlayer()
    }

    companion object {
        val TAG: String = Ut02ex06Activity::class.java.simpleName
        fun createInstance() = ListFragment()

    }
}