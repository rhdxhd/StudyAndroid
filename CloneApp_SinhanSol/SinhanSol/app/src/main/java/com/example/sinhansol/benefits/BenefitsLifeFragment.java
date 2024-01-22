package com.example.sinhansol.benefits;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.ReadyActivity;
import com.example.sinhansol.databinding.FragmentBenefitsLifeBinding;

import java.util.ArrayList;
import java.util.Timer;
import java.util.TimerTask;


public class BenefitsLifeFragment extends Fragment {
    private Handler slideHandler = new Handler();
    FragmentBenefitsLifeBinding binding;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        binding = FragmentBenefitsLifeBinding.inflate(inflater, container, false);

        binding.pager2.setAdapter(new BenefitsLifeRecvAdapter(getList2(), getContext()));
        binding.pager2.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

        binding.pager2.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int i) {
                super.onPageSelected(i);
                binding.pager2PageNow.setText((i%5+1)+"");
            }
        });
        /*binding.pager2.setScroll*/
        binding.pager2.setCurrentItem(1000);

        binding.recv.setAdapter(new LifeRecvAdapter(getContext(), getList()));
        binding.recv.setLayoutManager(new LinearLayoutManager(getContext()));

        binding.ready1.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ReadyActivity.class);
            startActivity(intent);
        });
        binding.ready2.setOnClickListener(v -> {
            Intent intent = new Intent(getContext(), ReadyActivity.class);
            startActivity(intent);
        });

        return binding.getRoot();
    }

    ArrayList<ArrayList<LifeDTO>> getList(){
        ArrayList<ArrayList<LifeDTO>> list = new ArrayList<>();
        list.add(new ArrayList<LifeDTO>());
        list.get(0).add(new LifeDTO(0, "#쉽고 편하고 쏠쏠한 결제"));
        list.get(0).add(new LifeDTO(0, "쏠편한 결제"));
        list.get(0).add(new LifeDTO(0, "제로페이 상품권"));
        list.get(0).add(new LifeDTO(0, "서울페이+ 상품권"));
        list.get(0).add(new LifeDTO(0, "쏠지갑"));
        list.get(0).add(new LifeDTO(0, "My링크"));
        list.add(new ArrayList<LifeDTO>());
        list.get(1).add(new LifeDTO(0, "#재미있게 즐기자!"));
        list.get(1).add(new LifeDTO(0, "한정판 신발 정보"));
        list.get(1).add(new LifeDTO(0, "운세"));
        list.get(1).add(new LifeDTO(0, "쏠퀴즈"));
        list.get(1).add(new LifeDTO(0, "쏠팁스"));
        list.add(new ArrayList<LifeDTO>());
        list.get(2).add(new LifeDTO(0, "#즐거운 취미 생활 라이프"));
        list.get(2).add(new LifeDTO(0, "해외골프 예약"));
        list.get(2).add(new LifeDTO(0, "자동차 매거진"));
        list.get(2).add(new LifeDTO(0, "스토리뱅크"));
        list.get(2).add(new LifeDTO(0, "내 차 리포트"));
        list.get(2).add(new LifeDTO(0, "쏠야구"));
        list.add(new ArrayList<LifeDTO>());
        list.get(3).add(new LifeDTO(0, "#아는 것이 힘! 실속 라이프"));
        list.get(3).add(new LifeDTO(0, "쏠 생활정보"));
        list.get(3).add(new LifeDTO(0, "여행자 보험"));
        list.get(3).add(new LifeDTO(0, "정부보조금 찾기"));
        list.get(3).add(new LifeDTO(0, "자동차보험"));
        list.get(3).add(new LifeDTO(0, "쿠폰마켓"));
        list.get(3).add(new LifeDTO(0, "의료비청구"));
        list.get(3).add(new LifeDTO(0, "WM레터"));
        list.add(new ArrayList<LifeDTO>());
        list.get(4).add(new LifeDTO(0, "#앱테크로 소확행 라이프"));
        list.get(4).add(new LifeDTO(0, "쏠퀴즈"));
        list.get(4).add(new LifeDTO(0, "쏠테크"));
        list.get(4).add(new LifeDTO(0, "급여클럽"));
        list.get(4).add(new LifeDTO(0, "광고보고 포인트받기"));
        list.get(4).add(new LifeDTO(0, "콘텐츠 소액투자"));

        return list;
    }
    public ArrayList<BenefitsDTO> getList2(){
        ArrayList<BenefitsDTO> list = new ArrayList<>();
        list.add(new BenefitsDTO(R.drawable.ic_launcher_foreground,"콘텐츠 소액투자", "K-콘텐츠", "새롭게 즐기기"));
        list.add(new BenefitsDTO(R.drawable.ic_launcher_foreground,"SOL(쏠) 생활정보", "알아두면 쏠쏠한", "생활정보를 확인해봐요!"));
        list.add(new BenefitsDTO(R.drawable.ic_launcher_foreground,"해외골프 예약", "해외 여행은 골프와 함께!", "특별한 라운딩 즐기기"));
        list.add(new BenefitsDTO(R.drawable.ic_launcher_foreground,"NFT월렛", "나의 금융활동을", "신한 NFT로 기록하다"));
        list.add(new BenefitsDTO(R.drawable.ic_launcher_foreground,"동전기부 서비스", "소액으로 실천하는", "자동기부서비스"));

        return list;
    }
}