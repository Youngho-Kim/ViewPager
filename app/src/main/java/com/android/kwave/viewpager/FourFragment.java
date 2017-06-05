package com.android.kwave.viewpager;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.SupportMapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;


/**
 * A simple {@link Fragment} subclass.
 */
public class FourFragment extends Fragment implements OnMapReadyCallback {

    GoogleMap googleMap;

    public FourFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_four, container, false);

        // 프래그먼트에서 map(아이디) 호출하기
        // SupportMapFragment : 버튼 같은 타입형태
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);

        // 맵이 사용할 준비가 되면 onMapReady 함수가 자동으로 호출된다.
        mapFragment.getMapAsync(this);




        return view;


    }

    // 이 함수에서부터 맵을 그리기 시작
    @Override
    public void onMapReady(GoogleMap googleMap) {   // 인자의 googleMap은 R.id.map의 맵

        // 좌표만 생성
        LatLng sinsa = new LatLng(37.516066,127.019361);

        // 좌표를 적용
        // 1.1 마커를 생성하고
        MarkerOptions marker = new MarkerOptions();
        marker.position(sinsa);     // 좌표
        marker.title("신사역");
        // 1.2 마케를 화면에 그린다.
        googleMap.addMarker(marker);

        // 2. 맵의 중심을 해당 좌표로 이동시킨다.            // 좌표  줌레벨
        googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sinsa, 17));



    }
}
