# ViewPager


#### View Pager 만들기
[전체코드보기](https://github.com/Youngho-Kim/ViewPager/blob/master/app/src/main/java/com/android/kwave/viewpager/MainActivity.java)
```java
       // 1. ViewPager 위젯 연결
        pager = (ViewPager) findViewById(R.id.pager);  
        
        // 2. Fragment 생성
        one = new OneFragment();
        two = new TwoFragment();
        three = new ThreeFragment();
        four = new FourFragment();  
        
        // 3. Fragment를 datas 저장소에 담은 후
        List<Fragment> datas = new ArrayList<>();
        datas.add(one);
        datas.add(two);
        datas.add(three);
        datas.add(four);  
        
       // 4. Fragment Manager와 함께 adapter에 전달
        PagerAdapter adapter = new PagerAdapter(getSupportFragmentManager(), datas);  
        
        // 5. adapter를 pager 위젯에 연결
        pager.setAdapter(adapter);  
        
        // 6. 페이저가 변경 되었을 때 탭을 변경해주는 리스너
        pager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tab));  
        
        // 7. 탭이 변경되었을 때 탭을 변경해주는 리스너
        tab.addOnTabSelectedListener(new TabLayout.ViewPagerOnTabSelectedListener(pager));
```

#### Google Map 적용하기
[전체코드보기]()
```java
 https://console.developers.google.com/flows/enableapi?apiid=maps_android_backend&keyType=CLIENT_SIDE_ANDROID&r=D2:BB:86:6C:E3:1B:63:0D:76:EF:A9:4C:12:9B:F0:C0:B9:98:69:9A%3Bcom.android.kwave.viewpager
위 코드를 인터넷에 치면 구글맵 API를 생성하는 키를 만들 수 있다.
먼저 구글맵 API 키를 준비한다.
        
        // 프래그먼트에서 map(아이디) 호출하기
        // SupportMapFragment : 버튼 같은 타입형태
        SupportMapFragment mapFragment = (SupportMapFragment) getChildFragmentManager().findFragmentById(R.id.map);

        // 맵이 사용할 준비가 되면 onMapReady 함수가 자동으로 호출된다.
        mapFragment.getMapAsync(this);
        
                // 좌표만 생성
                LatLng sinsa = new LatLng(37.516066,127.019361);
                // 맵의 중심을 해당 좌표로 이동시킨다.            // 좌표  줌레벨
                googleMap.moveCamera(CameraUpdateFactory.newLatLngZoom(sinsa, 17));
```