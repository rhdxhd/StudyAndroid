package com.example.sinhansol.benefits;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.sinhansol.R;
import com.example.sinhansol.databinding.FragmentBenefitsRecommendBinding;

import java.util.ArrayList;


public class BenefitsRecommendFragment extends Fragment {

    private Handler slideHandler = new Handler();

    FragmentBenefitsRecommendBinding binding;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
       binding = FragmentBenefitsRecommendBinding.inflate(inflater, container, false);

       binding.pager2Benefits.setAdapter(new BenefitsRecommendAdapter(inflater, recommendGetList(), getContext()));
       binding.pager2Benefits.setOrientation(ViewPager2.ORIENTATION_HORIZONTAL);

       binding.pager2Benefits.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
           @Override
           public void onPageSelected(int i) {
               super.onPageSelected(i);
               binding.pager2RecommendPageNow.setText((i%5+1)+"");
           }
       });

       binding.pager2Benefits.setCurrentItem(1000);


        return inflater.inflate(R.layout.fragment_benefits_recommend_, container, false);
    }











    ArrayList<BenefitsRecommendDTO> recommendGetList() {
        ArrayList<BenefitsRecommendDTO> list = new ArrayList<>();
        new BenefitsRecommendDTO(R.drawable.ic_launcher_foreground, "연말 전시", "<이경준 사진전>","초대 이벤트");
        new BenefitsRecommendDTO(R.drawable.ic_launcher_foreground, "신한 슈퍼SOL", "사전예약하면","100만 포인트의 기회가");
        new BenefitsRecommendDTO(R.drawable.ic_launcher_foreground, "가입 시 100% 경품", "SOL SOL한","신탁 이벤트");
        new BenefitsRecommendDTO(R.drawable.ic_launcher_foreground, "나는 쏠로 연말정산", "연말정산 미리보고","선물 받기");
        new BenefitsRecommendDTO(R.drawable.ic_launcher_foreground, "아이행복바우처로", "주택청약/적금","무료 가입 하자!");

        return list;
    }
}















