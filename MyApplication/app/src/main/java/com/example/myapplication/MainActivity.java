package com.example.myapplication;

import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.model.Course;
import com.example.myapplication.model.Planning;
import com.example.myapplication.storage.shared_prefrences.SharedPreferencesClass;
import com.example.myapplication.storage.shared_prefrences.Utils;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;


public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {

    private ArrayList<Course> mathCourses;
    private ArrayList<Course> physicCourses;
    private ArrayList<Course> generalCourses;
    private ArrayList<Course> industrialCourses;
    private ArrayList<Course> englishCourses;
    private ArrayList<Course> sportCourses;

    private DrawerLayout drawerLayout;
    private ImageView theme;
    private NavigationView navigationView;
    public static SharedPreferencesClass sharedPreferencesClass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sharedPreferencesClass = new SharedPreferencesClass();
        sharedPreferencesClass.getThemeOnMainActivityCreate(this);
        Utils.onActivityCreateThemeForMainActivity(this);
        setContentView(R.layout.activity_main);

        init();
        setBg(Utils.sTheme);
        addListener();
        addMathCourses();
        addPhysicCourses();
        addGeneralCourses();
        addIndustrialCourses();
        addEnglishCourses();
        addSportCourses();
    }

    private void setBg(String sTheme) {
        switch (sTheme) {
            case "dark":
                drawerLayout.setBackgroundResource(R.drawable.main_bg_dark);
                break;
            case "bright":
                drawerLayout.setBackgroundResource(R.drawable.main_bg_bright);
                break;
        }
    }

    private void init() {
        mathCourses = new ArrayList<>();
        physicCourses = new ArrayList<>();
        generalCourses = new ArrayList<>();
        industrialCourses = new ArrayList<>();
        englishCourses = new ArrayList<>();
        sportCourses = new ArrayList<>();

        drawerLayout = findViewById(R.id.drawerLayout);
        Toolbar toolbar = findViewById(R.id.toolbar_main);
        navigationView = findViewById(R.id.main_menu);//menu drawer in ui
        navigationView.setNavigationItemSelectedListener(this);

        setSupportActionBar(toolbar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(this, drawerLayout, toolbar,
                R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        toggle.setDrawerIndicatorEnabled(true);
        toggle.syncState();

        drawerLayout.addDrawerListener(toggle);

        View header = navigationView.getHeaderView(0);
        theme = header.findViewById(R.id.theme);
        if (Utils.sTheme.equals("dark")){
            theme.setImageResource(R.drawable.ic_sun);
        }else {
            theme.setImageResource(R.drawable.ic_night_mode);
        }

    }

    private void addListener() {
        theme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (Utils.sTheme.equals("bright")) {
                    changeThemeToDark();
                } else if (Utils.sTheme.equals("dark")) {
                    changeThemeToBright();
                }
            }
        });
    }

    public void allCoursesClicked(View view) {
        Intent intent = new Intent(getApplicationContext(), AllCoursesActivity.class);
        intent.putExtra("math" , mathCourses);
        intent.putExtra("physic" , physicCourses);
        intent.putExtra("general" , generalCourses);
        intent.putExtra("industrial" , industrialCourses);
        intent.putExtra("english" , englishCourses);
        intent.putExtra("sport" , sportCourses);

        startActivity(intent);
    }

    public void planningClicked(View view) {
        Intent intent = new Intent(getApplicationContext(), PlaningActivity.class);
        intent.putExtra("math" , mathCourses);
        intent.putExtra("physic" , physicCourses);
        intent.putExtra("general" , generalCourses);
        intent.putExtra("industrial" , industrialCourses);
        intent.putExtra("english" , englishCourses);
        intent.putExtra("sport" , sportCourses);
        startActivity(intent);
    }


    @SuppressLint("NonConstantResourceId")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        switch (id) {
            case R.id.settings: {
            //    startActivity(new Intent(getApplicationContext(), SettingActivity.class));
                break;
            }
            case R.id.information: {
            }
        }
        return true;
    }

    private void changeThemeToDark() {
        Utils.changeToTheme(this, "dark");
        sharedPreferencesClass.changeTheTheme(this);
    }

    private void changeThemeToBright() {
        Utils.changeToTheme(this, "bright");
        sharedPreferencesClass.changeTheTheme(this);
    }

    private void addSportCourses() {
        Course course1040211 = new Course(
                1040211 ,
                1,
                " تربیت بدنی ۱ «آمادگی جسمانی»" ,
                "تربیت بدنی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        sportCourses.add(course1040211);

        Course course1040201 = new Course(
                1040201 ,
                1,
                " تربیت بدنی ۲ «هندبال»" ,
                "تربیت بدنی",
                "" ,
                new ArrayList<Integer>()
                {{add(1040211);}}
        );
        sportCourses.add(course1040201);

        Course course1040151 = new Course(
                1040151 ,
                1,
                " تربیت بدنی ۲ «تنیس روی میز»" ,
                "تربیت بدنی",
                "" ,
                new ArrayList<Integer>()
                {{add(1040211);}}
        );
        sportCourses.add(course1040151);

        Course course1040141 = new Course(
                1040141 ,
                1,
                " تربیت بدنی ۲ «بسکتبال»" ,
                "تربیت بدنی",
                "" ,
                new ArrayList<Integer>()
                {{add(1040211);}}
        );
        sportCourses.add(course1040141);

        Course course1040131 = new Course(
                1040131 ,
                1,
                " تربیت بدنی ۲ «بدمینتون»" ,
                "تربیت بدنی",
                "" ,
                new ArrayList<Integer>()
                {{add(1040211);}}
        );
        sportCourses.add(course1040131);

        Course course1040121 = new Course(
                1040121 ,
                1,
                " تربیت بدنی ۲ «فوتبال»" ,
                "تربیت بدنی",
                "" ,
                new ArrayList<Integer>()
                {{add(1040211);}}
        );
        sportCourses.add(course1040121);

        Course course1040111 = new Course(
                1040111 ,
                1,
                " تربیت بدنی ۲ «شنا»" ,
                "تربیت بدنی",
                "" ,
                new ArrayList<Integer>()
                {{add(1040211);}}
        );
        sportCourses.add(course1040111);

        Course course1040101 = new Course(
                1040101 ,
                1,
                " تربیت بدنی ۲ «والیبال»" ,
                "تربیت بدنی",
                "" ,
                new ArrayList<Integer>()
                {{add(1040211);}}
        );
        sportCourses.add(course1040101);

        Course course1040261 = new Course(
                1040261 ,
                1,
                " تربیت بدنی 2- «بدنسازی»" ,
                " تربیت بدنی",
                "" ,
                new ArrayList<Integer>()
                {{add(1040211);}}
        );
        sportCourses.add(course1040261);

        Course course1040271 = new Course(
                1040271 ,
                1,
                " تربیت بدنی 2- «ووشو»" ,
                " تربیت بدنی",
                "" ,
                new ArrayList<Integer>()
                {{add(1040211);}}
        );
        sportCourses.add(course1040271);

    }

    private void addEnglishCourses() {
        Course course1061021 = new Course(
                1061021 ,
                1,
                " زبان (1)" ,
                " زبان",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        englishCourses.add(course1061021);

        Course course1061032 = new Course(
                1061032 ,
                2,
                " زبان (2) مهندسی" ,
                " زبان",
                "" ,
                new ArrayList<Integer>()
                {{add(1061021);}}
        );
        englishCourses.add(course1061032);

        Course course1061042 = new Course(
                1061042 ,
                2,
                " زبان (2) علوم" ,
                " زبان",
                "" ,
                new ArrayList<Integer>()
                {{add(1061021);}}
        );
        englishCourses.add(course1061042);
    }

    private void addIndustrialCourses() {

        Course course2500123 = new Course(
                2500123 ,
                3,
                "اصول حسابداری" ,
                "دانشکده",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(2533153);add(30);}}
        );
        industrialCourses.add(course2500123);

        Course course2500130 = new Course(
                2500130 ,
                0,
                "تدریس یار نظریه احتمال و کاربرد ها" ,
                "دانشکده",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1011103);}}
        );
        industrialCourses.add(course2500130);

        Course course2500133 = new Course(
                2500133 ,
                3,
                "نظریه احتمال و کاربرد ها" ,
                "دانشکده",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1011103);}}
        );
        industrialCourses.add(course2500133);

        Course course2515023 = new Course(
                2515023 ,
                3,
                "اقتصاد مهندسی" ,
                "دانشکده",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(2533153);}}
        );
        industrialCourses.add(course2515023);

        Course course2515153 = new Course(
                2515153 ,
                3,
                "علم مواد" ,
                "دانشکده",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(30);}}
        );
        industrialCourses.add(course2515153);

        Course course2533153 = new Course(
                2533153 ,
                3,
                "مبانی اقتصاد" ,
                "دانشکده",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1011053);}}
        );
        industrialCourses.add(course2533153);

        Course course2533103 = new Course(
                2533103 ,
                3,
                " جبر خطی" ,
                "دانشکده",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1011053);}}
        );
        industrialCourses.add(course2533103);

        Course course2021723 = new Course(
                2021723 ,
                3,
                "مبانی برق 2" ,
                "دانشکده",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1021353);}}
        );
        industrialCourses.add(course2021723);

        Course course2021720 = new Course(
                2021720 ,
                0,
                "تدریس یار مبانی برق 2" ,
                "دانشکده",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1021353);}}
        );
        industrialCourses.add(course2021720);



    }

    private void addGeneralCourses() {

        Course course2013731 = new Course(
                2013731 ,
                1,
                "کارگاه ریخته گری" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0); }}
        );
        generalCourses.add(course2013731);

        Course course2013721 = new Course(
                2013721 ,
                1,
                "کارگاه ماشین ابزار 1" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0); }}
        );
        generalCourses.add(course2013721);


        Course course2013711 = new Course(
                2013711 ,
                1,
                "کارگاه جوشکاری و ورقکاری" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0); }}
        );
        generalCourses.add(course2013711);

        Course course2013701 = new Course(
                2013701 ,
                1,
                "کارگاه عمومی " ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0); }}
        );
        generalCourses.add(course2013701);

        Course course2010712 = new Course(
                2010712 ,
                2,
                "نقشه کشی صنعتی 1" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0); }}
        );
        generalCourses.add(course2010712);

        Course course1031103 = new Course(
                1031103 ,
                3,
                "شیمی عمومی 1" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1031103);

        Course course1051012 = new Course(
                1051012 ,
                2,
                "تاریخ تحلیلی صدر اسلام" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051012);

        Course course1051032 = new Course(
                1051032 ,
                2,
                "تاريخ فرهنگ و تمدن اسلامي" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051032);

        Course course1051112 = new Course(
                1051112 ,
                2,
                " انسان در اسلام" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051112);

        Course course1051122 = new Course(
                1051122 ,
                2,
                " انديشه اسلامي 1" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051122);

        Course course1051132 = new Course(
                1051132 ,
                2,
                " انديشه اسلامي 2" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051132);

        Course course1051203 = new Course(
                1051203 ,
                3,
                " فارسي" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051203);


        Course course1051312 = new Course(
                1051312 ,
                2,
                " فلسفه اخلاق" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051312);

        Course course1051322 = new Course(
                1051322 ,
                2,
                " عرفان عملي در اسلام" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051322);

        Course course1051412 = new Course(
                1051412 ,
                2,
                " انقلاب اسلامي ايران" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051412);


        Course course1051432 = new Course(
                1051432 ,
                2,
                " انديشه سياسي امام خميني" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051432);


        Course course1051522 = new Course(
                1051522 ,
                2,
                " تفسير موضوعي نهج البلاغه" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051522);

        Course course1051532 = new Course(
                1051532 ,
                2,
                " تفسير موضوعي قرآن" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051532);

        Course course1051622 = new Course(
                1051622 ,
                2,
                " اخلاق مهندسي" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course1051622);

        Course course2013741 = new Course(
                2013741 ,
                1,
                " کارگاه ماشین ابزار ۲" ,
                "عمومی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        generalCourses.add(course2013741);
    }

    private void addPhysicCourses() {
        Course course1022391 = new Course(
                1022391 ,
                1,
                "آز فیزیک عمومی 2" ,
                "فیزیک",
                "" ,
                new ArrayList<Integer>()
                {{add(1021353);add(1021303);}}
        );
        physicCourses.add(course1022391);


        Course course1022371 = new Course(
                1022371,
                1,
                " آز فیزیک عمومی ۱" ,
                "فیزیک",
                "" ,
                new ArrayList<Integer>()
                {{add(1021303);}}
        );
        physicCourses.add(course1022371);


        Course course1021303 = new Course(
                1021303 ,
                3,
                " فیزیک عمومی ۱" ,
                "فیزیک",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        physicCourses.add(course1021303);

        Course course1021350 = new Course(
                1021350 ,
                0,
                " تدریسیار فیزیک عمومی ۲" ,
                "فیزیک",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        physicCourses.add(course1021350);

        Course course1021353= new Course(
                1021353 ,
                3,
                " فیزیک عمومی ۲" ,
                "فیزیک",
                "" ,
                new ArrayList<Integer>()
                {{add(1021303);}}
        );
        physicCourses.add(course1021353);

        Course course2021723 = new Course(
                2021723 ,
                3,
                "مبانی برق2" ,
                "فیزیک",
                "" ,
                new ArrayList<Integer>()
                {{add(1021353); }}
        );
        physicCourses.add(course2021723);

    }

    private void addMathCourses() {
        Course course1011250 = new Course(
                1011250 ,
                0,
                "تدریسیار معادلات دیفرانسیل" ,
                "ریاضی",
                "" ,
                new ArrayList<Integer>()
                {{add(1011053);}}
        );
        mathCourses.add(course1011250);

        Course course1011050 = new Course(
                1011050 ,
                0,
                "تدریسیار ریاضی عمومی 1" ,
                "ریاضی",
                "" ,
                new ArrayList<Integer>()
                {{add(1011053);}}
        );
        mathCourses.add(course1011050);

        Course course1011053 = new Course(
                1011053 ,
                3,
                "ریاضی عمومی 1" ,
                "ریاضی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        mathCourses.add(course1011053);

        Course course1011100 = new Course(
                1011100 ,
                0,
                "تدریسیار ریاضی عمومی 2" ,
                "ریاضی",
                "" ,
                new ArrayList<Integer>()
                {{add(1011103);}}
        );
        mathCourses.add(course1011100);

        Course course1011103 = new Course(
                1011103 ,
                3,
                "ریاضی عمومی 2" ,
                "ریاضی",
                "" ,
                new ArrayList<Integer>()
                {{add(1011053);}}
        );
        mathCourses.add(course1011103);

        Course course1011253 = new Course(
                1011253 ,
                3,
                "معادلات دیفرانسیل" ,
                "ریاضی",
                "" ,
                new ArrayList<Integer>()
                {{add(1011053);add(1011103);}}
        );
        mathCourses.add(course1011253);

        Course course1011353 = new Course(
                1011353 ,
                3,
                "برنامه نویسی کامپیوتر" ,
                "ریاضی",
                "" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        mathCourses.add(course1011353);

        Course course1011402 = new Course(
                1011402 ,
                2,
                "محاسبات عددی" ,
                "ریاضی",
                "" ,
                new ArrayList<Integer>()
                {{add(1011353);add(1011253);add(1011103);add(1011053);}}
        );
        mathCourses.add(course1011402);

    }
}