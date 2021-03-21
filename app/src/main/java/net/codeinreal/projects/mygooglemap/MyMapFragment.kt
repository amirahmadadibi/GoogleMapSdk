package net.codeinreal.projects.mygooglemap

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.google.android.gms.maps.CameraUpdateFactory
import com.google.android.gms.maps.SupportMapFragment
import com.google.android.gms.maps.model.LatLng
import com.google.android.gms.maps.model.LatLngBounds
import com.google.android.gms.maps.model.MarkerOptions


class MyMapFragment : Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        var view = inflater.inflate(R.layout.fragment_my_map, container, false)
        var supportMapFragment =
            childFragmentManager.findFragmentById(R.id.myFramgmentMap) as SupportMapFragment

        supportMapFragment.getMapAsync { googleMap ->
            googleMap.setOnMapClickListener { latlng ->
                var marker = MarkerOptions()
                marker.position(latlng)

                marker.title("پارک لاله")

                googleMap.clear()

                googleMap.animateCamera(CameraUpdateFactory.newLatLngZoom(latlng, 20f))


                googleMap.addMarker(marker)

            }
        }
        return view
    }
}