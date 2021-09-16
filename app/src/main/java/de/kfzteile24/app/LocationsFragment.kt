package de.kfzteile24.app

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.fragment_locations.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview

class LocationsFragment : Fragment(
  R.layout.fragment_locations
) {

  override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
    super.onViewCreated(view, savedInstanceState)

    setupRecyclerView()
  }

  private fun setupRecyclerView() {
    val data = listOf(
      LocationModel("1", "name1"),
      LocationModel("2", "name2"),
      LocationModel("3", "name3"),
      LocationModel("4", "name4"),
      LocationModel("5", "name5"),
      LocationModel("6", "name6"),
    )

    val adapter = LocationsAdapter(data)
    rvList.adapter = adapter
  }
}