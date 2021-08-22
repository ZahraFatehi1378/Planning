package com.example.myapplication;

import androidx.activity.OnBackPressedCallback;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;

import com.example.myapplication.model.Course;
import com.example.myapplication.model.Planning;
import com.example.myapplication.storage.shared_prefrences.SharedPreferencesClass;
import com.example.myapplication.storage.shared_prefrences.Utils;
import com.example.myapplication.ui.dialogs.InfoDialog;
import com.example.myapplication.ui.dialogs.PaxesDialog;
import com.google.android.material.navigation.NavigationView;

import java.util.ArrayList;

import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;


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

        OnBackPressedCallback callback = new OnBackPressedCallback(true) {
            @Override
            public void handleOnBackPressed() {
                Intent intent = new Intent(Intent.ACTION_MAIN);
                intent.addCategory(Intent.CATEGORY_HOME);
                intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
            }
        };
        this.getOnBackPressedDispatcher().addCallback(this, callback);

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
                InfoDialog infoDialog = new InfoDialog(this);
                break;
            }
            case R.id.paxs: {
                PaxesDialog paxesDialog = new PaxesDialog(this ,industrialCourses);
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

        Course course2581152 = new Course(
                2581152 ,
                2,
                " روش تحقیق و گزارش نویسی" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(45);}}
        );
        industrialCourses.add(course2581152);

        Course course2533843 = new Course(
                2533843 ,
                3,
                " بهینه سازی ۱" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(2533103);add(2500133);}}
        );
        industrialCourses.add(course2533843);

        Course course2533840 = new Course(
                2533840 ,
                0,
                " تدریسیار بهینه سازی ۱" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(2533103);add(2500133);}}
        );
        industrialCourses.add(course2533840);


        Course course2515273 = new Course(
                2515273 ,
                3,
                " آمار مهندسی" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(2500133);}}
        );
        industrialCourses.add(course2515273);

        Course course2510391 = new Course(
                2510391 ,
                1,
                " آز ارزیابی کار و زمان" ,
                "دانشکده صنایع",
                "تخصصی : بسته مهندسی صنایع",
                new ArrayList<Integer>()
                {{add(2515393);}}
        );
        industrialCourses.add(course2510391);


        Course course2512342 = new Course(
                2512342 ,
                2,
                " آز اندازه گیری دقیق و کنترل کیفیت" ,
                "دانشکده صنایع",
                "تخصصی : بسته مهندسی صنایع",
                new ArrayList<Integer>()
                {{add(1011053);add(2513303);}}
        );
        industrialCourses.add(course2512342);


        Course course2515483 = new Course(
                2515483 ,
                3,
                " طرح ریزی واحدهای صنعتی" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(2515393);}}
        );
        industrialCourses.add(course2515483);


        Course course2515683 = new Course(
                2515683 ,
                3,
                " مدیریت و کنترل پروژه" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(2533843);}}
        );
        industrialCourses.add(course2515683);


        Course course2515723 = new Course(
                2515723 ,
                3,
                " برنامه ریزی نگهداری و تعمیرات" ,
                "دانشکده صنایع",
                "تخصصی",
                new ArrayList<Integer>()
                {{add(2515023);}}
        );
        industrialCourses.add(course2515723);

        Course course2515713 = new Course(
                2515713 ,
                3,
                " طراحی ایجاد صنایع" ,
                "صنعتی",
                "" ,
                new ArrayList<Integer>()
                {{add(2515023);add(2515483);add(2500123);}}
        );
        industrialCourses.add(course2515713);

        Course course2516153 = new Course(
                2516153 ,
                3,
                " مهندسی فاکتورهای انسانی" ,
                "دانشکده صنایع",
                "تخصصی:بسته مهندسی صنایع",
                new ArrayList<Integer>()
                {{add(2515393);}}
        );
        industrialCourses.add(course2516153);


        Course course2519213 = new Course(
                2519213 ,
                3,
                " سیستمهای پرداخت حقوق و دستمزد" ,
                "دانشکده صنایع",
                "بسته مدیریت اجرایی",
                new ArrayList<Integer>()
                {{add(2500123);add(75);}}
        );
        industrialCourses.add(course2519213);


        Course course2519293 = new Course(
                2519293 ,
                3,
                " اصول شبیه سازی" ,
                "دانشکده صنایع",
                "تخصصی",
                new ArrayList<Integer>()
                {{add(1011353);add(2515273);}}
        );
        industrialCourses.add(course2519293);

        Course course2515543 = new Course(
                2515543 ,
                3,
                " کنترل کیفیت آماری" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(2515273);}}
        );
        industrialCourses.add(course2515543);

        Course course2526103 = new Course(
                2526103 ,
                3,
                " تحلیل سیستم ها" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(1011253);}}
        );
        industrialCourses.add(course2526103);

        Course course2010712 = new Course(
                2010712 ,
                2,
                " نقشه کشی صنعتی" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(0);}}
        );
        industrialCourses.add(course2010712);

        Course course2505833 = new Course(
                2505833 ,
                3,
                " استاتیک و مقاومت مصالح" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(1011053);add(1021303);}}
        );
        industrialCourses.add(course2505833);


        Course course2513303 = new Course(
                2513303 ,
                3,
                " روشهای تولید" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(2515153);}}
        );
        industrialCourses.add(course2513303);

        Course course2013721 = new Course(
                2013721 ,
                1,
                " کارگاه ماشین ابزار 1" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(0);}}
        );
        industrialCourses.add(course2013721);

        Course course2013731 = new Course(
                2013731 ,
                1,
                " کارگاه ریخته گری،ذوب و مدلسازی" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(0);}}
        );
        industrialCourses.add(course2013731);

        Course course2533111 = new Course(
                2533111 ,
                1,
                " کارآموزی" ,
                "دانشکده صنایع",
                "اصلی",
                new ArrayList<Integer>()
                {{add(2581152);add(70);}}
        );
        industrialCourses.add(course2533111);





        Course course2524153 = new Course(
                2524153 ,
                3,
                " برنامه ریزی حمل و نقل و لجستیک" ,
                "دانشکده صنایع",
                "تخصصی",
                new ArrayList<Integer>()
                {{add(2533843);}}
        );
        industrialCourses.add(course2524153);


        Course course2529253 = new Course(
                2529253 ,
                3,
                " برنامه ریزی تولید" ,
                "دانشکده صنایع",
                "تخصصی",
                new ArrayList<Integer>()
                {{add(2515423);}}
        );
        industrialCourses.add(course2529253);


        Course course2533183 = new Course(
                2533183 ,
                3,
                " تحلیل داده و اطلاعات" ,
                "دانشکده صنایع",
                "تخصصی",
                new ArrayList<Integer>()
                {{add(1011353);add(2515273);}}
        );
        industrialCourses.add(course2533183);


        Course course2547510 = new Course(
                2547510 ,
                0,
                " پروژه مهندسی صنایع" ,
                "دانشکده صنایع",
                "تخصصی",
                new ArrayList<Integer>()
                {{add(2581152);add(100);}}
        );
        industrialCourses.add(course2547510);


        Course course2515733 = new Course(
                2515733 ,
                3,
                "سیستمهای اطلاعات مدیریت" ,
                "دانشکده صنایع",
                "تخصصی" ,
                new ArrayList<Integer>()
                {{add(1011353);add(2526103);add(1011253);add(1011103);add(1011053);}}
        );
        industrialCourses.add(course2515733);

        Course course2515572 = new Course(
                2515572 ,
                2,
                "اصول مدیریت و تئوری سازمان" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(50);add(2500123);add(2533153);add(1011053);}}
        );
        industrialCourses.add(course2515572);

        Course course2515423 = new Course(
                2515423 ,
                3,
                "برنامه ریزی و کنترل موجودی 1" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(2533843);add(2533103);add(2500133);add(1011103);add(1011053);}}
        );
        industrialCourses.add(course2515423);

        Course course2515420 = new Course(
                2515420 ,
                0,
                "تدریسیار کنترل موجودی 1" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(0);}}
        );
        industrialCourses.add(course2515420);

        Course course2515393 = new Course(
                2515393 ,
                3,
                "ارزیابی کار و زمان" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(30);add(2513303);add(2515153);}}
        );
        industrialCourses.add(course2515393);

        Course course2515063 = new Course(
                2515063 ,
                3,
                "مباحث ویژه (تحلیل و هوشمندی کسب وکار)" ,
                "دانشکده صنایع",
                "بسته سیستم های اطلاعاتی" ,
                new ArrayList<Integer>()
                {{add(1011353);add(2515273);add(2500133);add(1011103);}}
        );
        industrialCourses.add(course2515063);

        Course course2500143 = new Course(
                2500143 ,
                3,
                "بهینه سازی 2" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(2533843);add(2533103);add(2500133);add(1011103);add(1011053);}}
        );
        industrialCourses.add(course2500143);

        Course course2500123 = new Course(
                2500123 ,
                3,
                "اصول حسابداری" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(2533153);add(30);}}
        );
        industrialCourses.add(course2500123);

        Course course2500130 = new Course(
                2500130 ,
                0,
                "تدریس یار نظریه احتمال و کاربرد ها" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1011103);}}
        );
        industrialCourses.add(course2500130);

        Course course2500133 = new Course(
                2500133 ,
                3,
                "نظریه احتمال و کاربرد ها" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1011103);}}
        );
        industrialCourses.add(course2500133);

        Course course2515023 = new Course(
                2515023 ,
                3,
                "اقتصاد مهندسی" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(2533153);}}
        );
        industrialCourses.add(course2515023);

        Course course2515153 = new Course(
                2515153 ,
                3,
                "علم مواد" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(30);}}
        );
        industrialCourses.add(course2515153);

        Course course2533153 = new Course(
                2533153 ,
                3,
                "مبانی اقتصاد" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1011053);}}
        );
        industrialCourses.add(course2533153);

        Course course2533103 = new Course(
                2533103 ,
                3,
                " جبر خطی" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1011053);}}
        );
        industrialCourses.add(course2533103);

        Course course2021723 = new Course(
                2021723 ,
                3,
                "مبانی برق 2" ,
                "دانشکده صنایع",
                "اصلی" ,
                new ArrayList<Integer>()
                {{add(1021353);}}
        );
        industrialCourses.add(course2021723);

        Course course2021720 = new Course(
                2021720 ,
                0,
                "تدریس یار مبانی برق 2" ,
                "دانشکده صنایع",
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