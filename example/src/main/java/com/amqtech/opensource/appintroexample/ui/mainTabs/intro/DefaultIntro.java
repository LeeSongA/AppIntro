package com.amqtech.opensource.appintroexample.ui.mainTabs.intro;

import android.graphics.Color;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.github.paolorotolo.appintro.AppIntro;
import com.github.paolorotolo.appintro.AppIntroFragment;
import com.github.paolorotolo.appintro.model.SliderPage;
import com.github.paolorotolo.appintroexample.R;

public class DefaultIntro extends AppIntro {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        SliderPage sliderPage1 = new SliderPage();
        sliderPage1.setTitle("눈누난나를 소개해요!");
        sliderPage1.setDescription("눈누난나는 황반변성 의심증상을 조기에 확인할 수 있는 앱이에요.");
        sliderPage1.setImageDrawable(R.drawable.component_1);
        sliderPage1.setBgColor(Color.TRANSPARENT);
        addSlide(AppIntroFragment.newInstance(sliderPage1));

        SliderPage sliderPage2 = new SliderPage();
        sliderPage2.setTitle("정확한 검사거리와 검사화면 크기");
        sliderPage2.setDescription("적정검사거리를 음성으로 조절해드려요. 기종에 상관없이 정확한 크기의 검사화면을 보여드리구요.");
        sliderPage2.setImageDrawable(R.drawable.component_2);
        sliderPage2.setBgColor(Color.TRANSPARENT);
        addSlide(AppIntroFragment.newInstance(sliderPage2));

        SliderPage sliderPage3 = new SliderPage();
        sliderPage3.setTitle("정기적인 검사를 도와드려요");
        sliderPage3.setDescription("검사 날짜를 기억할 필요가 없ㅇ어요. 정기적으로 검사시기를 알려드리니, 꾸준히 검사해보세요.");
        sliderPage3.setImageDrawable(R.drawable.component_3);
        sliderPage3.setBgColor(Color.TRANSPARENT);
        addSlide(AppIntroFragment.newInstance(sliderPage3));

        SliderPage sliderPage4 = new SliderPage();
        sliderPage4.setTitle("유용한 그래프");
        sliderPage4.setDescription("나의 기록들을 그래프로 볼 수 있어요. 두 날짜간 자세한 영역비교도 가능해요. 지금 시작해보세요!");
        sliderPage4.setImageDrawable(R.drawable.component_4);
        sliderPage4.setBgColor(Color.TRANSPARENT);
        addSlide(AppIntroFragment.newInstance(sliderPage4));
    }

    @Override
    public void onSkipPressed(Fragment currentFragment) {
        super.onSkipPressed(currentFragment);
        finish();
    }

    @Override
    public void onDonePressed(Fragment currentFragment) {
        super.onDonePressed(currentFragment);
        finish();
    }
}
