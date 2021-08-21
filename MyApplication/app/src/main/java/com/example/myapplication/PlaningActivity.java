package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.model.Course;
import com.example.myapplication.model.Planning;
import com.example.myapplication.storage.shared_prefrences.Utils;

import java.util.ArrayList;
import java.util.Collection;

public class PlaningActivity extends AppCompatActivity {

    public ArrayList<Course> mathCourses;
    public ArrayList<Course> physicCourses;
    public ArrayList<Course> generalCourses;
    public ArrayList<Course> industrialCourses;
    public ArrayList<Course> englishCourses;
    public ArrayList<Course> sportCourses;

    public ArrayList<Planning> generalPlannings;
    public ArrayList<Planning> physicPlannings;
    public ArrayList<Planning> industrialPlannings;
    public ArrayList<Planning> englishPlannings;
    public ArrayList<Planning> mathPlannings;
    public ArrayList<Planning> sportPlannings;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_planing);
        getSupportActionBar().hide();
        Utils.onActivityCreateSetTheme(this, getSupportActionBar());

        mathCourses = (ArrayList<Course>) getIntent().getSerializableExtra("math");
        physicCourses = (ArrayList<Course>) getIntent().getSerializableExtra("physic");
        generalCourses = (ArrayList<Course>) getIntent().getSerializableExtra("general");
        industrialCourses = (ArrayList<Course>) getIntent().getSerializableExtra("industrial");
        englishCourses = (ArrayList<Course>) getIntent().getSerializableExtra("english");
        sportCourses = (ArrayList<Course>) getIntent().getSerializableExtra("sport");

        generalPlannings = new ArrayList();
        physicPlannings = new ArrayList<>();
        industrialPlannings = new ArrayList<>();
        englishPlannings = new ArrayList<>();
        mathPlannings = new ArrayList<>();
        sportPlannings = new ArrayList<>();

        addGeneralPlannings();
        addPhysicPlannings();
        addIndustrialPlannings();
        addEnglishPlannings();
        addMathPlannings();
        addSportPlannings();


    }

    private void addSportPlannings() {

    }

    private void addMathPlannings() {


        Planning planning101125313 = new Planning(
                101125313,
                1011253,
                "ادیبی",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "10:45",
                "12:15",
                "9",
                "11",
                28,
                10, "هردو"
        );

        mathPlannings.add(planning101125313);

        Planning planning10113531 = new Planning(
                10113531,
                1011353,
                "علی آبادی",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "9:15",
                "10:45",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning10113531);

        Planning planning10113532 = new Planning(
                10113532,
                1011353,
                "علی آبادی",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "10:45",
                "12:15",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning10113532);

        Planning planning10113533 = new Planning(
                10113533,
                1011353,
                "منظمی",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "13",
                "14:30",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning10113533);

        Planning planning10113534 = new Planning(
                10113534,
                1011353,
                "جعفرقلی",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "10:45",
                "12:15",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning10113534);


        Planning planning10113535 = new Planning(
                10113535,
                1011353,
                "شیرعلی شهرضا",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "9:15",
                "10:45",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning10113535);

        Planning planning10113536 = new Planning(
                10113536,
                1011353,
                "مکرمی",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "9:15",
                "10:45",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning10113536);

        Planning planning10113537 = new Planning(
                10113537,
                1011353,
                "مکرمی",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "10:45",
                "12:15",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning10113537);

        Planning planning10113538 = new Planning(
                10113538,
                1011353,
                "محمدزاده",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "16:30",
                "18",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning10113538);

        Planning planning10113539 = new Planning(
                10113539,
                1011353,
                "میرزاخواه",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "9:15",
                "10:45",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning10113539);

        Planning planning101135310 = new Planning(
                101135310,
                1011353,
                "میرزاخواه",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "10:45",
                "12:15",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135310);

        Planning planning101135311 = new Planning(
                101135311,
                1011353,
                "اشجری",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "10:45",
                "12:15",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135311);

        Planning planning101135312 = new Planning(
                101135312,
                1011353,
                "اشجری",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "13",
                "14:30",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135312);

        Planning planning101135313 = new Planning(
                101135313,
                1011353,
                "اکبری",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "7:45",
                "9:15",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135313);

        Planning planning101135314 = new Planning(
                101135314,
                1011353,
                "نقوی",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "15",
                "16:30",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135314);

        Planning planning10114025 = new Planning(
                10114025,
                1011402,
                "حاتم",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "13",
                "15",
                "9",
                "11",
                20,
                10, "هردو"
        );

        mathPlannings.add(planning10114025);

        Planning planning10114026 = new Planning(
                10114026,
                1011402,
                "حاتم",
                new ArrayList<String>() {{
                    add("دو شنبه");
                }},
                "13",
                "15",
                "9",
                "11",
                20,
                10, "هردو"
        );

        mathPlannings.add(planning10114026);

        Planning planning10114027 = new Planning(
                10114027,
                1011402,
                "شمسی",
                new ArrayList<String>() {{
                    add("دو شنبه");
                }},
                "15",
                "17",
                "9",
                "11",
                20,
                10, "هردو"
        );

        mathPlannings.add(planning10114027);

        Planning planning10114028 = new Planning(
                10114028,
                1011402,
                "هوشمند خلیق",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "15",
                "17",
                "9",
                "11",
                20,
                10, "هردو"
        );

        mathPlannings.add(planning10114028);

        Planning planning101135315 = new Planning(
                101135315,
                1011353,
                "نقوی",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "16:30",
                "18",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135315);

        Planning planning101135316 = new Planning(
                101135316,
                1011353,
                "فلاح اسلاملو",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "13",
                "14:30",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135316);

        Planning planning101135317 = new Planning(
                101135317,
                1011353,
                "فلاح اسلاملو",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "15",
                "16:30",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135317);

        Planning planning101135318 = new Planning(
                101135318,
                1011353,
                "محمدزاده",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "15",
                "16:30",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135318);

        Planning planning101135319 = new Planning(
                101135319,
                1011353,
                "جعفرقلی",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "13",
                "14:30",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135319);

        Planning planning101135320 = new Planning(
                101135320,
                1011353,
                "رحمتی",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "15",
                "16:30",
                "9",
                "11",
                29,
                10, "هردو"
        );

        mathPlannings.add(planning101135320);

        Planning planning10114021 = new Planning(
                10114021,
                1011402,
                "شاکری",
                new ArrayList<String>() {{
                    add("یکشنبه");
                }},
                "13",
                "15",
                "9",
                "11",
                20,
                10, "هردو"
        );

        mathPlannings.add(planning10114021);

        Planning planning10114022 = new Planning(
                10114022,
                1011402,
                "شاکری",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "13",
                "15",
                "9",
                "11",
                20,
                10, "هردو"
        );

        mathPlannings.add(planning10114022);

        Planning planning10114023 = new Planning(
                10114023,
                1011402,
                "عباس زاده",
                new ArrayList<String>() {{
                    add("یکشنبه");
                }},
                "13",
                "15",
                "9",
                "11",
                20,
                10, "هردو"
        );

        mathPlannings.add(planning10114023);

        Planning planning10114024 = new Planning(
                10114024,
                1011402,
                "شمسی",
                new ArrayList<String>() {{
                    add("یکشنبه");
                }},
                "15",
                "17",
                "9",
                "11",
                20,
                10, "هردو"
        );

        mathPlannings.add(planning10114024);
    }

    private void addEnglishPlannings() {

    }

    private void addIndustrialPlannings() {
    }

    private void addPhysicPlannings() {
    }

    private void addGeneralPlannings() {

        Planning planning105120315 = new Planning(
                105120315,
                1051203,
                " فروزانفر",
                new ArrayList<String>() {{
                    add("سه شنبه");
                    add("يکشنبه");
                }},
                "16:30",
                "18",
                "9",
                "11",
                23,
                10, "آقایان"
        );

        physicPlannings.add(planning105120315);

        Planning planning10513121 = new Planning(
                10513121,
                1051312,
                "بوسليکي",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                28,
                10, "هردو"
        );

        generalPlannings.add(planning10513121);

        Planning planning10513122 = new Planning(
                10513122,
                1051312,
                "بوسليکي",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "15",
                "17",
                "13",
                "15",
                28,
                10, "هردو"
        );

        generalPlannings.add(planning10513122);


        Planning planning10513123 = new Planning(
                10513123,
                1051312,
                " کياشمشکي",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                28,
                10, "آقایان"
        );

        generalPlannings.add(planning10513123);

        Planning planning10513124 = new Planning(
                10513124,
                1051312,
                " ميرمحمدي",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                28,
                10, "آقایان"
        );

        generalPlannings.add(planning10513124);

        Planning planning10513125 = new Planning(
                10513125,
                1051312,
                " ميرمحمدي",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                28,
                10, "آقایان"
        );

        generalPlannings.add(planning10513125);


        Planning planning10513221 = new Planning(
                10513221,
                1051322,
                " خداورديان",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "8",
                "10",
                "15",
                "17",
                28,
                10, "هردو"
        );

        generalPlannings.add(planning10513221);

        Planning planning10513222 = new Planning(
                10513222,
                1051322,
                " خداورديان",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "10",
                "12",
                "15",
                "17",
                28,
                10, "هردو"
        );

        generalPlannings.add(planning10513222);

        Planning planning10514121 = new Planning(
                10514121,
                1051412,
                " رحيمي کلاريجاني",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "8",
                "10",
                "13",
                "15",
                19,
                10, "هردو"
        );

        generalPlannings.add(planning10514121);


        Planning planning10514122 = new Planning(
                10514122,
                1051412,
                " رحيمي کلاريجاني",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                19,
                10, "هردو"
        );

        generalPlannings.add(planning10514122);


        Planning planning10514123 = new Planning(
                10514123,
                1051412,
                " رحيمي کلاريجاني",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "8",
                "10",
                "13",
                "15",
                19,
                10, "هردو"
        );

        generalPlannings.add(planning10514123);

        Planning planning10514124 = new Planning(
                10514124,
                1051412,
                " رحيمي کلاريجاني",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                19,
                10, "هردو"
        );

        generalPlannings.add(planning10514124);


        Planning planning10514125 = new Planning(
                10514125,
                1051412,
                " ميرخليلي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                19,
                10, "هردو"
        );

        generalPlannings.add(planning10514125);

        Planning planning10514126 = new Planning(
                10514126,
                1051412,
                " ميرخليلي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                19,
                10, "هردو"
        );

        generalPlannings.add(planning10514126);

        Planning planning10514127 = new Planning(
                10514127,
                1051412,
                " ميرخليلي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "15",
                "17",
                "13",
                "15",
                19,
                10, "هردو"
        );

        generalPlannings.add(planning10514127);


        Planning planning10514321 = new Planning(
                10514321,
                1051432,
                " ميرخليلي",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "10",
                "12",
                "15",
                "17",
                18,
                10, "هردو"
        );

        generalPlannings.add(planning10514321);

        Planning planning10514322 = new Planning(
                10514322,
                1051432,
                " ميرخليلي",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "13",
                "15",
                "15",
                "17",
                18,
                10, "هردو"
        );

        generalPlannings.add(planning10514322);

        Planning planning10515221 = new Planning(
                10515221,
                1051522,
                " حاجي ابراهيم ",
                new ArrayList<String>() {{
                    add("سه شنبه ");
                }},
                "10",
                "12",
                "15",
                "17",
                22,
                10, "هردو"
        );

        generalPlannings.add(planning10515221);


        Planning planning10515222 = new Planning(
                10515222,
                1051522,
                " حاجي ابراهيم ",
                new ArrayList<String>() {
                    {
                        add("چهارشنبه");
                    }
                },
                "10",
                "12",
                "15",
                "17",
                22,
                10, "هردو"
        );

        generalPlannings.add(planning10515222);

        Planning planning10515321 = new Planning(
                10515321,
                1051532,
                " خداورديان",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "8",
                "10",
                "13",
                "15",
                22,
                10, "آقایان"
        );

        generalPlannings.add(planning10515321);

        Planning planning10515322 = new Planning(
                10515322,
                1051532,
                " خداورديان",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                22,
                10, "آقایان"
        );

        generalPlannings.add(planning10515322);


        Planning planning10515323 = new Planning(
                10515323,
                1051532,
                " پارچه باف دولتي",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                22,
                10, "آقایان"
        );

        generalPlannings.add(planning10515323);

        Planning planning10515324 = new Planning(
                10515324,
                1051532,
                " پارچه باف دولتي",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "15",
                "17",
                "13",
                "15",
                22,
                10, "آقایان"
        );

        generalPlannings.add(planning10515324);

        Planning planning10515325 = new Planning(
                10515325,
                1051532,
                " پارچه باف دولتي",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "17",
                "19",
                "13",
                "15",
                22,
                10, "آقایان"
        );

        generalPlannings.add(planning10515325);


        Planning planning10515326 = new Planning(
                10515326,
                1051532,
                " پاينده آشتياني",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                22,
                10, "خانمها"
        );

        generalPlannings.add(planning10515326);

        Planning planning10515327 = new Planning(
                10515327,
                1051532,
                " پاينده آشتياني",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "15",
                "17",
                "13",
                "15",
                22,
                10, "خانمها"
        );

        generalPlannings.add(planning10515327);

        Planning planning10515328 = new Planning(
                10515328,
                1051532,
                " پاينده آشتياني",
                new ArrayList<String>() {{
                    add("يکشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                22,
                10, "خانمها"
        );

        generalPlannings.add(planning10515328);


        Planning planning10515329 = new Planning(
                10515329,
                1051532,
                " پاينده آشتياني",
                new ArrayList<String>() {{
                    add("يکشنبه");
                }},
                "15",
                "17",
                "13",
                "15",
                22,
                10, "خانمها"
        );

        generalPlannings.add(planning10515329);

        Planning planning10516221 = new Planning(
                10516221,
                1051622,
                " ديزاني",
                new ArrayList<String>() {{
                    add("يکشنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                28,
                10, "آقایان"
        );

        generalPlannings.add(planning10516221);

        Planning planning10516222 = new Planning(
                10516222,
                1051622,
                " ديزاني",
                new ArrayList<String>() {{
                    add("يکشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                28,
                10, "آقایان"
        );

        generalPlannings.add(planning10516222);


        Planning planning201071216 = new Planning(
                201071216,
                2010712,
                " متقي پور",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "13:30",
                "16:30",
                "13",
                "15",
                26,
                10, "هردو"
        );

        generalPlannings.add(planning201071216);

        Planning planning201071217 = new Planning(
                201071217,
                2010712,
                " مرادي",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "13:30",
                "16:30",
                "13",
                "15",
                26,
                10, "هردو"
        );

        generalPlannings.add(planning201071217);

        Planning planning201071218 = new Planning(
                201071218,
                2010712,
                " اسماعيلي کراتي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "9:15",
                "12:15",
                "13",
                "15",
                26,
                10, "هردو"
        );

        generalPlannings.add(planning201071218);


        Planning planning201071219 = new Planning(
                201071219,
                2010712,
                " اسماعيلي کراتي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "13:30",
                "16:30",
                "13",
                "15",
                26,
                10, "هردو"
        );

        generalPlannings.add(planning201071219);

        Planning planning20107221 = new Planning(
                20107221,
                2010722,
                " احمدوند",
                new ArrayList<String>() {{
                    add("يکشنبه");
                }},
                "9:15",
                "12:15",
                "15",
                "17",
                26,
                10, "هردو"
        );

        generalPlannings.add(planning20107221);

        Planning planning20107223 = new Planning(
                20107223,
                2010722,
                " احمدوند",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "9:15",
                "12:15",
                "15",
                "17",
                26,
                10, "هردو"
        );

        generalPlannings.add(planning20107223);


        Planning planning20107224 = new Planning(
                20107224,
                2010722,
                " متقي پور",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "13:30",
                "16:30",
                "15",
                "17",
                26,
                10, "هردو"
        );

        generalPlannings.add(planning20107224);

        Planning planning20107225 = new Planning(
                20107225,
                2010722,
                " احمدوند",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "9:15",
                "12:15",
                "15",
                "17",
                26,
                10, "هردو"
        );

        generalPlannings.add(planning20107225);

        Planning planning20107226 = new Planning(
                20107226,
                2010722,
                " فريبرزي",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "13:30",
                "16:30",
                "15",
                "17",
                26,
                10, "هردو"
        );

        generalPlannings.add(planning20107226);


        Planning planning20137011 = new Planning(
                20137011,
                2013701,
                " حبيب الهي محمدزاده محسني حسين زاده ",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137011);

        Planning planning20137012 = new Planning(
                20137012,
                2013701,
                " حبيب الهي محمدزاده محسني حسين زاده ",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "10",
                "12:15",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137012);

        Planning planning20137013 = new Planning(
                20137013,
                2013701,
                " حبيب الهي محمدزاده جمالفر حسين زاده ",
                new ArrayList<String>() {{
                    add("يکشنبه");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137013);


        Planning planning20137014 = new Planning(
                20137014,
                2013701,
                " حبيب الهي محمدزاده جمالفر حسين زاده ",
                new ArrayList<String>() {{
                    add("يکشنبه");
                }},
                "10",
                "12:15",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137014);

        Planning planning20137111 = new Planning(
                20137111,
                2013711,
                " حبيب الهي محمدزاده جودت کردلر حسين زاده ",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137111);

        Planning planning20137112 = new Planning(
                20137112,
                2013711,
                " حبيب الهي محمدزاده جودت کردلر حسين زاده ",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "10",
                "12:15",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137112);


        Planning planning20137113 = new Planning(
                20137113,
                2013711,
                " حبيب الهي جمالفر جودت کردلر حسين زاده ",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137113);

        Planning planning20137114 = new Planning(
                20137114,
                2013711,
                " حبيب الهي جمالفر جودت کردلر حسين زاده ",
                new ArrayList<String>() {{
                    add("سه شنبه ");
                }},
                "10",
                "12:15",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137114);

        Planning planning20137211 = new Planning(
                20137211,
                2013721,
                " جمالفر افشاري",
                new ArrayList<String>() {{
                    add("دوشنبه ");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137211);

        Planning planning20137212 = new Planning(
                20137212,
                2013721,
                " جمالفر افشاري",
                new ArrayList<String>() {{
                    add("دوشنبه ");
                }},
                "10",
                "12:15",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137212);

        Planning planning20137213 = new Planning(
                20137213,
                2013721,
                " برجي فلاح افشاري",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137213);

        Planning planning20137214 = new Planning(
                20137214,
                2013721,
                " برجي فلاح افشاري",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "10",
                "12:15",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137214);


        Planning planning20137215 = new Planning(
                20137215,
                2013721,
                " برجي فلاح حبيب الهي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137215);

        Planning planning20137216 = new Planning(
                20137216,
                2013721,
                " برجي فلاح حبيب الهي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "10",
                "12:15",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137216);

        Planning planning20137217 = new Planning(
                20137217,
                2013721,
                " مهدوي سعدلو",
                new ArrayList<String>() {{
                    add("يکشنبه");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137217);


        Planning planning20137218 = new Planning(
                20137218,
                2013721,
                " رحماني",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137218);

        Planning planning20137219 = new Planning(
                20137219,
                2013721,
                " رحماني",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "10",
                "12:15",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137219);

        Planning planning201372110 = new Planning(
                201372110,
                2013721,
                " رحماني",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning201372110);


        Planning planning201372111 = new Planning(
                201372111,
                2013721,
                " رحماني",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "10",
                "12:15",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning201372111);

        Planning planning20137311 = new Planning(
                20137311,
                2013731,
                " ساعي فر",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "16:30",
                "19:30",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137311);

        Planning planning20137312 = new Planning(
                20137312,
                2013731,
                " ساعي فر",
                new ArrayList<String>() {{
                    add("يکشنبه");
                }},
                "16:30",
                "19:30",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137312);


        Planning planning10510326 = new Planning(
                10510326,
                1051032,
                " رباني زاده",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "15",
                "17",
                "13",
                "15",
                20,
                10, "آقایان"
        );

        generalPlannings.add(planning10510326);


        Planning planning10511121 = new Planning(
                10511121,
                1051112,
                " کرمي ورنامخواستي",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "15",
                "17",
                "15",
                "17",
                18,
                10, "هردو"
        );

        generalPlannings.add(planning10511121);

        Planning planning10511122 = new Planning(
                10511122,
                1051112,
                " کياشمشکي",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "8",
                "10",
                "15",
                "17",
                18,
                10, "هردو"
        );

        generalPlannings.add(planning10511122);


        Planning planning10510323 = new Planning(
                10510323,
                1051032,
                " پروندی",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                20,
                10, "خانمها"
        );

        generalPlannings.add(planning10510323);


        Planning planning10510324 = new Planning(
                10510324,
                1051032,
                " پروندی",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                20,
                10, "خانمها"
        );

        generalPlannings.add(planning10510324);

        Planning planning10510325 = new Planning(
                10510325,
                1051032,
                " رباني زاده",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                20,
                10, "هردو"
        );

        generalPlannings.add(planning10510325);


        Planning planning10510125 = new Planning(
                10510125,
                1051012,
                " موسوي قدمگاهي",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "15",
                "17",
                "15",
                "17",
                20,
                10, "هردو"
        );

        generalPlannings.add(planning10510125);


        Planning planning10510321 = new Planning(
                10510321,
                1051032,
                " پروندی",
                new ArrayList<String>() {{
                    add("یکشنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                20,
                10, "خانمها"
        );

        generalPlannings.add(planning10510321);

        Planning planning10510322 = new Planning(
                10510322,
                1051032,
                " پروندی",
                new ArrayList<String>() {{
                    add("یکشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                20,
                10, "خانمها"
        );

        generalPlannings.add(planning10510322);


        Planning planning10510122 = new Planning(
                10510122,
                1051012,
                "ططری",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "15",
                "17",
                "15",
                "17",
                20,
                10, "هردو"
        );

        generalPlannings.add(planning10510122);


        Planning planning10510123 = new Planning(
                10510123,
                1051012,
                "ططری",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "17",
                "19",
                "15",
                "17",
                20,
                10, "آقایان"
        );

        generalPlannings.add(planning10510123);

        Planning planning10510124 = new Planning(
                10510124,
                1051012,
                " موسوي قدمگاهي",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "13",
                "15",
                "15",
                "17",
                20,
                10, "هردو"
        );

        generalPlannings.add(planning10510124);


        Planning planning10510121 = new Planning(
                10510121,
                1051012,
                "ططری",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "13",
                "15",
                "15",
                "17",
                20,
                10, "هردو"
        );

        generalPlannings.add(planning10510121);

        Planning planning20137313 = new Planning(
                20137313,
                2013731,
                "ساعی فر",
                new ArrayList<String>() {{
                    add("دو شنبه");
                }},
                "16:30",
                "19:30",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137313);


        Planning planning20137314 = new Planning(
                20137314,
                2013731,
                "ساعی فر",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "16:30",
                "19:30",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137314);


        Planning planning20137315 = new Planning(
                20137315,
                2013731,
                "ساعی فر",
                new ArrayList<String>() {{
                    add("چهار شنبه");
                }},
                "16:30",
                "19:30",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137315);

        Planning planning20137316 = new Planning(
                20137316,
                2013731,
                "ساعی فر",
                new ArrayList<String>() {{
                    add("پنج شنبه");
                }},
                "13",
                "16",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137316);

        Planning planning20137411 = new Planning(
                20137411,
                2013741,
                "رحمانی",
                new ArrayList<String>() {{
                    add("چهار شنبه");
                }},
                "7",
                "10",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137411);

        Planning planning20137412 = new Planning(
                20137412,
                2013741,
                "رحمانی",
                new ArrayList<String>() {{
                    add("چهار شنبه");
                }},
                "10",
                "12:15",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137412);

        Planning planning20137413 = new Planning(
                20137413,
                2013741,
                "رحمانی",
                new ArrayList<String>() {{
                    add("یک شنبه");
                }},
                "16",
                "19",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137413);

        Planning planning20137414 = new Planning(
                20137414,
                2013741,
                "رحمانی",
                new ArrayList<String>() {{
                    add("چهار شنبه");
                }},
                "13",
                "16",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137414);

        Planning planning20137415 = new Planning(
                20137415,
                2013741,
                "رحمانی",
                new ArrayList<String>() {{
                    add("چهار شنبه");
                }},
                "16",
                "19",
                "0",
                "0",
                0,
                0, "هردو"
        );

        generalPlannings.add(planning20137415);

        Planning planning10311031 = new Planning(
                10311031,
                1031103,
                "عبدوس",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "7:45",
                "9:15",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning10311031);

        Planning planning10311032 = new Planning(
                10311032,
                1031103,
                "عبدوس",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "7:45",
                "9:15",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning10311032);

        Planning planning10311033 = new Planning(
                10311033,
                1031103,
                "موسی زاده",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "9:15",
                "10:45",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning10311033);

        Planning planning10311034 = new Planning(
                10311034,
                1031103,
                "شریعتی نیا",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "10:45",
                "12:15",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning10311034);

        Planning planning10311035 = new Planning(
                10311035,
                1031103,
                "عبدوس",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "10:45",
                "12:15",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning10311035);


        Planning planning10311036 = new Planning(
                10311036,
                1031103,
                "شریعتی نیا",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "10:45",
                "12:15",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning10311036);

        Planning planning10311037 = new Planning(
                10311037,
                1031103,
                "ناجی",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "10:45",
                "12:15",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning10311037);

        Planning planning10311038 = new Planning(
                10311038,
                1031103,
                "سرآبادانی تفرشی",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("یکشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning10311038);

        Planning planning10311039 = new Planning(
                10311039,
                1031103,
                "سرآبادانی تفرشی",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("یکشنبه");
                }},
                "15",
                "17",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning10311039);

        Planning planning103110310 = new Planning(
                103110310,
                1031103,
                "جوانبخت",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("دوشنبه");
                }},
                "7:45",
                "9:15",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning103110310);

        Planning planning103110314 = new Planning(
                103110314,
                1031103,
                "حسینی منفرد",
                new ArrayList<String>() {{
                    add("شنبه");
                    add("دوشنبه");
                }},
                "7:45",
                "9:15",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning103110314);

        Planning planning103110315 = new Planning(
                103110315,
                1031103,
                "حسینی منفرد",
                new ArrayList<String>() {{
                    add("یکشنبه");
                    add("سه شنبه");
                }},
                "7:45",
                "9:15",
                "13",
                "15",
                25,
                10, "هردو"
        );

        generalPlannings.add(planning103110315);


        Planning planning10511123 = new Planning(10511123,
                1051112,
                " مدني",
                new ArrayList<String>() {{
                    add("یکشنبه");
                }},
                "10",
                "12",
                "15",
                "17",
                18,
                10, "خانمها"
        );

        generalPlannings.add(planning10511123);

        Planning planning10511124 = new Planning(
                10511124,
                1051112,
                " مدني",
                new ArrayList<String>() {{
                    add("یکشنبه");
                }},
                "13",
                "15",
                "15",
                "17",
                18,
                10, "خانمها"
        );

        generalPlannings.add(planning10511124);

        Planning planning10511125 = new Planning(
                10511125,
                1051112,
                " مدني",
                new ArrayList<String>() {{
                    add("یکشنبه");
                }},
                "15",
                "17",
                "15",
                "17",
                18,
                10, "خانمها"
        );

        generalPlannings.add(planning10511125);


        Planning planning10511221 = new Planning(
                10511221,
                1051112,
                " کرمي ورنامخواستي",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                18,
                10, "هردو"
        );

        generalPlannings.add(planning10511221);

        Planning planning10511222 = new Planning(
                10511222,
                1051112,
                " کرمي ورنامخواستي",
                new ArrayList<String>() {{
                    add("سه شنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                18,
                10, "هردو"
        );

        generalPlannings.add(planning10511222);

        Planning planning10511223 = new Planning(
                10511223,
                1051112,
                " کياشمشکي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "8",
                "10",
                "13",
                "15",
                18,
                10, "هردو"
        );

        generalPlannings.add(planning10511223);


        Planning planning10511224 = new Planning(
                10511224,
                1051112,
                " کياشمشکي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                18,
                10, "آقایان"
        );

        generalPlannings.add(planning10511224);

        Planning planning10511225 = new Planning(
                10511225,
                1051112,
                " ياوري",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                18,
                10, "خانمها"
        );

        generalPlannings.add(planning10511225);

        Planning planning10511226 = new Planning(
                10511226,
                1051112,
                " ياوري",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "13",
                "15",
                "13",
                "15",
                18,
                10, "خانمها"
        );

        generalPlannings.add(planning10511226);


        Planning planning10511227 = new Planning(
                10511227,
                1051112,
                " اردستاني",
                new ArrayList<String>() {{
                    add("دوشنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                18,
                10, "خانمها"
        );

        generalPlannings.add(planning10511227);

        Planning planning10511321 = new Planning(
                10511321,
                1051132,
                " موسوي قدمگاهي",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "8",
                "10",
                "13",
                "15",
                27,
                10, "آقایان"
        );

        generalPlannings.add(planning10511321);

        Planning planning10511322 = new Planning(
                10511322,
                1051132,
                " موسوي قدمگاهي",
                new ArrayList<String>() {{
                    add("شنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                27,
                10, "آقایان"
        );

        generalPlannings.add(planning10511322);


        Planning planning10511323 = new Planning(
                10511323,
                1051132,
                " اردستاني",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "8",
                "10",
                "13",
                "15",
                27,
                10, "خانمها"
        );

        generalPlannings.add(planning10511323);

        Planning planning10511324 = new Planning(
                10511324,
                1051132,
                " اردستاني",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                }},
                "10",
                "12",
                "13",
                "15",
                27,
                10, "خانمها"
        );

        generalPlannings.add(planning10511324);


        Planning planning10512032 = new Planning(
                10512032,
                1051203,
                "مقصودي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                    add("دوشنبه");
                }},
                "9:15",
                "10:45",
                "9",
                "11",
                23,
                10, "هردو"
        );

        generalPlannings.add(planning10512032);

        Planning planning10512031 = new Planning(
                10512031,
                1051203,
                "مقصودي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                    add("دوشنبه");
                }},
                "7:45",
                "9:15",
                "9",
                "11",
                23,
                10, "هردو"
        );

        generalPlannings.add(planning10512031);

        Planning planning10512033 = new Planning(
                10512033,
                1051203,
                "مقصودي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                    add("دوشنبه");
                }},
                "10:45",
                "12:15",
                "9",
                "11",
                23,
                10, "هردو"
        );

        generalPlannings.add(planning10512033);

        Planning planning10512034 = new Planning(
                10512034,
                1051203,
                "مقصودي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                    add("دوشنبه");
                }},
                "13:30",
                "15",
                "9",
                "11",
                23,
                10, "هردو"
        );

        generalPlannings.add(planning10512034);


        Planning planning10512035 = new Planning(
                10512035,
                1051203,
                "مقصودي",
                new ArrayList<String>() {{
                    add("چهارشنبه");
                    add("دوشنبه");
                }},
                "15",
                "16:30",
                "9",
                "11",
                23,
                10, "آقایان"
        );

        generalPlannings.add(planning10512035);

        Planning planning10512036 = new Planning(
                10512036,
                1051203,
                " کيوانفر",
                new ArrayList<String>() {{
                    add("سه شنبه");
                    add("يکشنبه");
                }},
                "13:30",
                "15",
                "9",
                "11",
                23,
                10, "هردو"
        );

        generalPlannings.add(planning10512036);

        Planning planning10512037 = new Planning(
                10512037,
                1051203,
                " کيوانفر",
                new ArrayList<String>() {{
                    add("سه شنبه");
                    add("يکشنبه");
                }},
                "15",
                "16:30",
                "9",
                "11",
                23,
                10, "هردو"
        );

        generalPlannings.add(planning10512037);


        Planning planning10512038 = new Planning(
                10512038,
                1051203,
                " کيوانفر",
                new ArrayList<String>() {{
                    add("سه شنبه");
                    add("يکشنبه");
                }},
                "16:30",
                "18",
                "9",
                "11",
                23,
                10, "آقایان"
        );

        generalPlannings.add(planning10512038);

        Planning planning10512039 = new Planning(
                10512039,
                1051203,
                " موذني",
                new ArrayList<String>() {{
                    add("سه شنبه");
                    add("يکشنبه");
                }},
                "15",
                "16:30",
                "9",
                "11",
                23,
                10, "هردو"
        );

        generalPlannings.add(planning10512039);

        Planning planning105120310 = new Planning(
                105120310,
                1051203,
                " موذني",
                new ArrayList<String>() {{
                    add("سه شنبه");
                    add("يکشنبه");
                }},
                "16:30",
                "18",
                "9",
                "11",
                23,
                10, "هردو"
        );

        generalPlannings.add(planning105120310);


        Planning planning105120311 = new Planning(
                105120311,
                1051203,
                " ابوحمزه",
                new ArrayList<String>() {{
                    add("دوشنبه");
                    add("شنبه");
                }},
                "15",
                "16:30",
                "9",
                "11",
                23,
                10, " خانمها"
        );

        generalPlannings.add(planning105120311);

        Planning planning105120312 = new Planning(
                105120312,
                1051203,
                " ابوحمزه",
                new ArrayList<String>() {{
                    add("دوشنبه");
                    add("شنبه");
                }},
                "16:30",
                "18",
                "9",
                "11",
                23,
                10, " خانمها"
        );

        generalPlannings.add(planning105120312);

        Planning planning105120313 = new Planning(
                105120313,
                1051203,
                " فروزانفر",
                new ArrayList<String>() {{
                    add("سه شنبه");
                    add("يکشنبه");
                }},
                "13:30",
                "15",
                "9",
                "11",
                23,
                10, "هردو"
        );

        generalPlannings.add(planning105120313);


        Planning planning105120314 = new Planning(
                105120314,
                1051203,
                " فروزانفر",
                new ArrayList<String>() {{
                    add("سه شنبه");
                    add("يکشنبه");
                }},
                "15",
                "16:30",
                "9",
                "11",
                23,
                10, "هردو"
        );

        generalPlannings.add(planning105120314);


    }


}