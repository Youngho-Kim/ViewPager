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

