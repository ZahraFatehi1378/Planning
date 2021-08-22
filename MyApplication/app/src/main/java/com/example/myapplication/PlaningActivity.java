package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.model.Course;
import com.example.myapplication.model.Planning;
import com.example.myapplication.storage.shared_prefrences.Utils;

import java.util.ArrayList;

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
    public ArrayList<Planning> SportPlannings;


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
        SportPlannings = new ArrayList<>();

        addGeneralPlannings();
        addPhysicPlannings();
        addIndustrialPlannings();
        addEnglishPlannings();
        addMathPlannings();
        addSportPlannings();


    }

    private void addSportPlannings() {
        Planning planning10401011 = new Planning(
                10401011 ,
                1040101 ,
                "اله یاری بلداجی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401011);

        Planning planning10401012 = new Planning(
                10401012 ,
                1040101 ,
                "شفیعی زاده کرده کوهی",
                new ArrayList<String>(){{add("چهار شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401012);


        Planning planning10401111 = new Planning(
                10401111 ,
                1040111 ,
                "میراخوری",
                new ArrayList<String>(){{add("یک شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401111);


        Planning planning10401112 = new Planning(
                10401112 ,
                1040111 ,
                "میراخوری",
                new ArrayList<String>(){{add("یک شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401112);


        Planning planning10401113 = new Planning(
                10401113 ,
                1040111 ,
                "میراخوری",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401113);


        Planning planning10401114 = new Planning(
                10401114 ,
                1040111 ,
                "حمزه علیپور",
                new ArrayList<String>(){{add("دو شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401114);


        Planning planning10401115 = new Planning(
                10401115 ,
                1040111 ,
                "حمزه علیپور",
                new ArrayList<String>(){{add("دو شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401115);


        Planning planning10401116 = new Planning(
                10401116 ,
                1040111 ,
                "حمزه علیپور",
                new ArrayList<String>(){{add("دو شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401116);


        Planning planning10401117 = new Planning(
                10401117 ,
                1040111 ,
                "میراخوری",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401117);


        Planning planning10401118 = new Planning(
                10401118 ,
                1040111 ,
                "میراخوری",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401118);


        Planning planning10401119 = new Planning(
                10401119 ,
                1040111 ,
                "میراخوری",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401119);


        Planning planning104011110 = new Planning(
                104011110 ,
                1040111 ,
                "قلعه",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning104011110);


        Planning planning104011111 = new Planning(
                104011111 ,
                1040111 ,
                "قلعه",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning104011111);


        Planning planning10401211= new Planning(
                10401211 ,
                1040121 ,
                "میلائی",
                new ArrayList<String>(){{add(" شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401211);


        Planning planning10401212 = new Planning(
                10401212 ,
                1040121 ,
                "میری",
                new ArrayList<String>(){{add("چهار شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401212);


        Planning planning10401213 = new Planning(
                10401213 ,
                1040121 ,
                "میری",
                new ArrayList<String>(){{add("چهار شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401213);


        Planning planning10401214 = new Planning(
                10401214 ,
                1040121 ,
                "میری",
                new ArrayList<String>(){{add("چهار شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401214);


        Planning planning10401311 = new Planning(
                10401311 ,
                1040131 ,
                "میلائی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401311);


        Planning planning10401312 = new Planning(
                10401312 ,
                1040131 ,
                "میلائی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401312);


        Planning planning10401313 = new Planning(
                10401313 ,
                1040131 ,
                "میلائی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401313);


        Planning planning10401411 = new Planning(
                10401411 ,
                1040141 ,
                "شفیعی زاده کرده کوهی",
                new ArrayList<String>(){{add("چهار شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401411);


        Planning planning10401412 = new Planning(
                10401412 ,
                1040141 ,
                "شفیعی زاده کرده کوهی",
                new ArrayList<String>(){{add("چهار شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401412);


        Planning planning10401511 = new Planning(
                10401511 ,
                1040151 ,
                "کیوانی",
                new ArrayList<String>(){{add(" شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401511);


        Planning planning10401512 = new Planning(
                10401512 ,
                1040151 ,
                "کیوانی",
                new ArrayList<String>(){{add(" شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401512);


        Planning planning10401513 = new Planning(
                10401513 ,
                1040151 ,
                "کیوانی",
                new ArrayList<String>(){{add(" شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401513);


        Planning planning10401514 = new Planning(
                10401514 ,
                1040151 ,
                "قلعه",
                new ArrayList<String>(){{add("دو شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401514);


        Planning planning10401515 = new Planning(
                10401515 ,
                1040151 ,
                "قلعه",
                new ArrayList<String>(){{add("دو شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"خانمها"
        );

        SportPlannings.add(planning10401515);

        Planning planning10401516 = new Planning(
                10401516 ,
                1040151 ,
                "آهنجان",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401516);



        Planning planning10401517 = new Planning(
                10401517 ,
                1040151 ,
                "آهنجان",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10401517);


        Planning planning10402011 = new Planning(
                10402011 ,
                1040201 ,
                "آهنجان",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10402011);


        Planning planning10402012 = new Planning(
                10402012 ,
                1040201 ,
                "آهنجان",
                new ArrayList<String>(){{add("شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"آقایان"
        );

        SportPlannings.add(planning10402012);


        Planning planning10402111 = new Planning(
                10402111 ,
                1040211 ,
                "میلائی",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning10402111);


        Planning planning10402112 = new Planning(
                10402112 ,
                1040211 ,
                "میلائی",
                new ArrayList<String>(){{add("شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning10402112);


        Planning planning10402113 = new Planning(
                10402113 ,
                1040211 ,
                "میری",
                new ArrayList<String>(){{add("شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning10402113);


        Planning planning10402114 = new Planning(
                10402114 ,
                1040211 ,
                "عرب",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning10402114);


        Planning planning10402115 = new Planning(
                10402115 ,
                1040211 ,
                "عرب",
                new ArrayList<String>(){{add("شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning10402115);


        Planning planning10402116 = new Planning(
                10402116 ,
                1040211 ,
                "عرب",
                new ArrayList<String>(){{add("شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning10402116);


        Planning planning10402117 = new Planning(
                10402117 ,
                1040211 ,
                "اقارضی درمنی",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning10402117);


        Planning planning10402118 = new Planning(
                10402118 ,
                1040211 ,
                "اقارضی درمنی",
                new ArrayList<String>(){{add("شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning10402118);


        Planning planning10402119 = new Planning(
                10402119 ,
                1040211 ,
                "اقارضی درمنی",
                new ArrayList<String>(){{add("شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning10402119);


        Planning planning104021110 = new Planning(
                104021110 ,
                1040211 ,
                "آهنجان",
                new ArrayList<String>(){{add("یک شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021110);


        Planning planning104021111 = new Planning(
                104021111 ,
                1040211 ,
                "آهنجان",
                new ArrayList<String>(){{add("یک شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021111);


        Planning planning104021112 = new Planning(
                104021112 ,
                1040211 ,
                "نجفی رباطی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021112);


        Planning planning104021113 = new Planning(
                104021113 ,
                1040211 ,
                "میری",
                new ArrayList<String>(){{add("یک شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021113);


        Planning planning104021114 = new Planning(
                104021114 ,
                1040211 ,
                "احسانی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021114);


        Planning planning104021115 = new Planning(
                104021115 ,
                1040211 ,
                "احسانی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021115);


        Planning planning104021116 = new Planning(
                104021116 ,
                1040211 ,
                "احسانی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021116);


        Planning planning104021117 = new Planning(
                104021117 ,
                1040211 ,
                "روفه گری نژاد",
                new ArrayList<String>(){{add("یک شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021117);


        Planning planning104021118 = new Planning(
                104021118 ,
                1040211 ,
                "روفه گری نژاد",
                new ArrayList<String>(){{add("یک شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021118);


        Planning planning104021119 = new Planning(
                104021119 ,
                1040211 ,
                "روفه گری نژاد",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021119);


        Planning planning104021120= new Planning(
                104021120 ,
                1040211 ,
                "قلعه",
                new ArrayList<String>(){{add("یک شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021120);


        Planning planning104021121= new Planning(
                104021121 ,
                1040211 ,
                "قلعه",
                new ArrayList<String>(){{add("یک شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021121);


        Planning planning104021122= new Planning(
                104021122 ,
                1040211 ,
                "قلعه",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021122);


        Planning planning104021123= new Planning(
                104021123 ,
                1040211 ,
                "میلائی",
                new ArrayList<String>(){{add("دو شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021123);


        Planning planning104021124= new Planning(
                104021124 ,
                1040211 ,
                "میلائی",
                new ArrayList<String>(){{add("دو شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021124);


        Planning planning104021125= new Planning(
                104021125 ,
                1040211 ,
                "سودمند",
                new ArrayList<String>(){{add("دو شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021125);


        Planning planning104021126= new Planning(
                104021126 ,
                1040211 ,
                "مرادیان",
                new ArrayList<String>(){{add("دو شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021126);


        Planning planning104021127= new Planning(
                104021127 ,
                1040211 ,
                "مرادیان",
                new ArrayList<String>(){{add("دو شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021127);


        Planning planning104021128= new Planning(
                104021128 ,
                1040211 ,
                "مرادیان",
                new ArrayList<String>(){{add("دو شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021128);


        Planning planning104021129= new Planning(
                104021129 ,
                1040211 ,
                "میراخوری",
                new ArrayList<String>(){{add("دو شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021129);


        Planning planning104021130= new Planning(
                104021130 ,
                1040211 ,
                "میراخوری",
                new ArrayList<String>(){{add("دو شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021130);


        Planning planning104021131= new Planning(
                104021131 ,
                1040211 ,
                "میراخوری",
                new ArrayList<String>(){{add("دو شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021131);


        Planning planning104021132 = new Planning(
                104021132 ,
                1040211 ,
                "میری",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021132);


        Planning planning104021133 = new Planning(
                104021133 ,
                1040211 ,
                "میری",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021133);


        Planning planning104021134 = new Planning(
                104021134 ,
                1040211 ,
                "میری",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021134);


        Planning planning104021135 = new Planning(
                104021135 ,
                1040211 ,
                "احسانی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021135);


        Planning planning104021136 = new Planning(
                104021136 ,
                1040211 ,
                "احسانی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021136);


        Planning planning104021137 = new Planning(
                104021137 ,
                1040211 ,
                "مرادیان",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021137);


        Planning planning104021138 = new Planning(
                104021138 ,
                1040211 ,
                "نوروزیان",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021138);


        Planning planning104021139 = new Planning(
                104021139 ,
                1040211 ,
                "نوروزیان",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021139);


        Planning planning104021140 = new Planning(
                104021140 ,
                1040211 ,
                "نوروزیان",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021140);


        Planning planning104021141 = new Planning(
                104021141 ,
                1040211 ,
                "مکرمی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021141);


        Planning planning104021142 = new Planning(
                104021142 ,
                1040211 ,
                "مکرمی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021142);


        Planning planning104021143 = new Planning(
                104021143 ,
                1040211 ,
                "مکرمی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "15" ,
                "16" ,
                19 ,
                10 ,"خانمها"
        );

        SportPlannings.add(planning104021143);


        Planning planning104021144 = new Planning(
                104021144 ,
                1040211 ,
                "مرادیان",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021144);

        Planning planning104021145 = new Planning(
                104021145 ,
                1040211 ,
                "مرادیان",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "15" ,
                "16" ,
                19 ,
                10 ,"آقایان"
        );

        SportPlannings.add(planning104021145);


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

        Planning planning10110537 = new Planning(
                10110537 ,
                1011053 ,
                "خسروی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "8",
                "10",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10110537);

        Planning planning10110538 = new Planning(
                10110538 ,
                1011053 ,
                "خسروی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "10",
                "12",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10110538);

        Planning planning10110539 = new Planning(
                10110539 ,
                1011053 ,
                "اخلاقی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "15",
                "17",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10110539);

        Planning planning101105310 = new Planning(
                101105310 ,
                1011053 ,
                "بروجردیان",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "15",
                "17",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101105310);

        Planning planning101105311 = new Planning(
                101105311 ,
                1011053 ,
                "رستمی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "13",
                "15",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101105311);

        Planning planning101105312 = new Planning(
                101105312 ,
                1011053 ,
                "رستمی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "15",
                "17",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101105312);


        Planning planning101105034 = new Planning(
                10105034 ,
                101150 ,
                "پاشایی",
                new ArrayList<String>(){{add("پنج شنبه");}},
                "13",
                "15",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101105034);

        Planning planning10110531 = new Planning(
                10110531 ,
                1011053 ,
                "سعیدی مدنی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "8",
                "10",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10110531);

        Planning planning10110532 = new Planning(
                10110532 ,
                1011053 ,
                "سعیدی مدنی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "10",
                "12",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10110532);

        Planning planning10110533 = new Planning(
                10110533 ,
                1011053 ,
                "کیانی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "8",
                "10",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10110533);

        Planning planning10110534 = new Planning(
                10110534 ,
                1011053 ,
                "روشندل توانا",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "10",
                "12",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10110534);

        Planning planning10110535 = new Planning(
                10110535 ,
                1011053 ,
                "نجفی سقزچی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "8",
                "10",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10110535);

        Planning planning1011056 = new Planning(
                10110536 ,
                1011053 ,
                "نجفی سقزچی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "10",
                "12",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning1011056);


        Planning planning101125011 = new Planning(
                101125011 ,
                1011250 ,
                "لجمیری",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        Planning planning101105313 = new Planning(
                101105313 ,
                1011053 ,
                "پیربداقی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "13",
                "15",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101105313);

        Planning planning101105314 = new Planning(
                101105314 ,
                1011053 ,
                "هنری",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "15",
                "17",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101105314);

        Planning planning101105315 = new Planning(
                101105315 ,
                1011053 ,
                "ساکی",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "13",
                "15",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101105315);

        Planning planning101105316 = new Planning(
                101105316 ,
                1011053 ,
                "ایمان فر",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "15",
                "17",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101105316);

        Planning planning101105317 = new Planning(
                101105317 ,
                1011053 ,
                "علی",
                new ArrayList<String>(){{add("سه شنبه");add("یکشنبه");}},
                "8",
                "10",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101105317);

        Planning planning10110518 = new Planning(
                101105318 ,
                1011053 ,
                "پورعباس",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "10",
                "12",
                "9",
                "11",
                19 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10110518);

        Planning planning10111001 = new Planning(
                10111001 ,
                1011100 ,
                "فتحی",
                new ArrayList<String>(){{add("شنبه");}},
                "13",
                "15",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10111001);

        Planning planning10111002 = new Planning(
                10111002 ,
                1011100 ,
                "فتحی",
                new ArrayList<String>(){{add("دوشنبه");}},
                "15",
                "17",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10111002);

        Planning planning10111003 = new Planning(
                10111003 ,
                1011100 ,
                "طباطبایی فر",
                new ArrayList<String>(){{add("یکشنبه");}},
                "13",
                "15",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10111003);

        Planning planning10111004 = new Planning(
                10111004 ,
                1011100 ,
                "طباطبایی فر",
                new ArrayList<String>(){{add("سه شنبه");}},
                "15",
                "17",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10111004);

        Planning planning10111005 = new Planning(
                10111005 ,
                1011100 ,
                "جلیلی قلعه",
                new ArrayList<String>(){{add("شنبه");}},
                "15",
                "17",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10111005);

        Planning planning10111006 = new Planning(
                10111006 ,
                1011100 ,
                "جلیلی قلعه",
                new ArrayList<String>(){{add("دوشنبه");}},
                "13",
                "15",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10111006);

        Planning planning10111031 = new Planning(
                10111031 ,
                1011103 ,
                "بیدآباد",
                new ArrayList<String>(){{add("سه شنبه");add("یکشنبه");}},
                "8",
                "10",
                "9",
                "11",
                26,
                10 ,"هردو"
        );

        mathPlannings.add(planning10111031);

        Planning planning10111032 = new Planning(
                10111032 ,
                1011103 ,
                "میرمحمدرضایی",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "15",
                "17",
                "9",
                "11",
                26,
                10 ,"هردو"
        );

        mathPlannings.add(planning10111032);

        Planning planning10111033 = new Planning(
                10111033 ,
                1011103 ,
                "شجاعی",
                new ArrayList<String>(){{add("سه شنبه");add("یکشنبه");}},
                "15",
                "17",
                "9",
                "11",
                26,
                10 ,"هردو"
        );

        mathPlannings.add(planning10111033);

        Planning planning10112501 = new Planning(
                10112501 ,
                1011250 ,
                "حبیب پور حیران",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10112501);

        Planning planning10112502 = new Planning(
                10112502 ,
                1011250 ,
                "حبیب پور حیران",
                new ArrayList<String>(){{add("پنج شنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10112502);

        Planning planning10112503 = new Planning(
                10112503 ,
                1011250 ,
                "میرهادی تفرشی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10112503);

        Planning planning10112504 = new Planning(
                10112504 ,
                1011250 ,
                "اعتباری گوهرریزی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10112504);

        Planning planning10112505 = new Planning(
                10112505 ,
                1011250 ,
                "اعتباری گوهرریزی",
                new ArrayList<String>(){{add("پنج شنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10112505);

        Planning planning10112506 = new Planning(
                10112506 ,
                1011250 ,
                "شفیعی ابیانه",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10112506);

        Planning planning10112507 = new Planning(
                10112507 ,
                1011250 ,
                "شفیعی ابیانه",
                new ArrayList<String>(){{add("پنج شنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10112507);

        Planning planning10112508 = new Planning(
                10112508 ,
                1011250 ,
                "کاظمی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10112508);

        Planning planning10112509 = new Planning(
                10112509 ,
                1011250 ,
                "کاظمی",
                new ArrayList<String>(){{add("پنج شنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning10112509);

        Planning planning101125010 = new Planning(
                101125010 ,
                1011250 ,
                "تقیلی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101125010);
        mathPlannings.add(planning101125011);

        Planning planning101125012 = new Planning(
                101125012 ,
                1011250 ,
                "ابراهیمی جهان ",
                new ArrayList<String>(){{add("پنج شنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101125012);

        Planning planning101125013 = new Planning(
                101125011 ,
                1011250 ,
                "شیری لرد",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101125013);

        Planning planning101125014 = new Planning(
                101125014 ,
                1011250 ,
                "شیری لرد ",
                new ArrayList<String>(){{add("پنج شنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101125014);

        Planning planning101125015 = new Planning(
                101125015 ,
                1011250 ,
                "میری چشمه گچی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101125015);

        Planning planning101125016 = new Planning(
                101125016 ,
                1011250 ,
                "تقیلی ",
                new ArrayList<String>(){{add("پنج شنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101125016);

        Planning planning101125017 = new Planning(
                101125017 ,
                1011250 ,
                "غریبی",
                new ArrayList<String>(){{add("پنج شنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101125017);

        Planning planning101125019 = new Planning(
                101125019 ,
                1011250 ,
                "مشایخی ",
                new ArrayList<String>(){{add("پنج شنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101125019);

        Planning planning101125018 = new Planning(
                101125018 ,
                1011250 ,
                "مشایخی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101125018);

        Planning planning101125020 = new Planning(
                101125020 ,
                1011250 ,
                "تمرزاده",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning101125020);

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

        Planning planning10112538 = new Planning(
                10112538 ,
                1011253 ,
                "پیرباوفا",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "13",
                "14:30",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10112538);

        Planning planning10112539 = new Planning(
                10112539 ,
                1011253 ,
                "پیرباوفا",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "15",
                "16:30",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10112539);

        Planning planning101125310 = new Planning(
                101125310 ,
                1011253 ,
                "خاکسارعشاق",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "9:15",
                "10:45",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101125310);

        Planning planning101125311 = new Planning(
                101125311 ,
                1011253 ,
                "رمضانی",
                new ArrayList<String>(){{add("شنبه");add("چهارشنبه");}},
                "10:45",
                "12:15",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101125311);

        Planning planning101125312 = new Planning(
                101125312 ,
                1011253 ,
                "رمضانی",
                new ArrayList<String>(){{add("شنبه");add("چهارشنبه");}},
                "13",
                "14:30",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101125312);

        Planning planning1011250121 = new Planning(
                101125021 ,
                1011250 ,
                "فلاح اسلاملو",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "16:30",
                "0",
                "0",
                0,
                0 ,"هردو"
        );

        mathPlannings.add(planning1011250121);

        Planning planning10112531 = new Planning(
                10112531 ,
                1011250 ,
                "بنی فاطمی",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "7:45",
                "9:15",
                "9",
                "11",
                28,
                10 ,"هردو"
        );

        mathPlannings.add(planning10112531);

        Planning planning10112532 = new Planning(
                10112532 ,
                1011250 ,
                "طباطبایی فر",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "9:15",
                "10:45",
                "9",
                "11",
                28,
                10 ,"هردو"
        );

        mathPlannings.add(planning10112532);

        Planning planning10112533 = new Planning(
                10112533 ,
                1011253 ,
                "فخارایزدی",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "10:45",
                "12:15",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10112533);

        Planning planning10112534 = new Planning(
                10112534 ,
                1011253 ,
                "خاکسارعشاق",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "7:45",
                "9:15",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10112534);

        Planning planning101125335 = new Planning(
                10112535 ,
                1011253 ,
                "واعظ پور",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "10:45",
                "12:15",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning101125335);

        Planning planning10112536 = new Planning(
                10112536 ,
                1011253 ,
                "بنی فاطمی",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "13",
                "14:30",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10112536);

        Planning planning10112537 = new Planning(
                10112537 ,
                1011253 ,
                "رحیمی",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "15",
                "16:30",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        mathPlannings.add(planning10112537);
    }

    private void addEnglishPlannings() {

    }

    private void addIndustrialPlannings() {

        Planning planning25150231 = new Planning(
                25150231 ,
                2515023 ,
                "اصفهانی پور",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "10:45",
                "12:15",
                "15" ,
                "17" ,
                19 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25150231);

        Planning planning25133031 = new Planning(
                25133031 ,
                2513303 ,
                "منصور",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "9:15",
                "10:45",
                "13" ,
                "15" ,
                21 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25133031);




        Planning planning25103912 = new Planning(
                25103912 ,
                2510391 ,
                "نوروزی",
                new ArrayList<String>(){{add("دوشنبه");}},
                "13:30",
                "15:30",
                "9" ,
                "11" ,
                22 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25103912);

        Planning planning25103911 = new Planning(
                25103911 ,
                2510391 ,
                "نوروزی",
                new ArrayList<String>(){{add("دوشنبه");}},
                "7:45",
                "9:15",
                "9" ,
                "11" ,
                22 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25103911);

        Planning planning25001432 = new Planning(
                25001432 ,
                2500143 ,
                "مصدق",
                new ArrayList<String>(){{add("یکشنبه");add("سه شنبه");}},
                "10:45",
                "12:15",
                "13" ,
                "15" ,
                28 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25001432);

        Planning planning25001431 = new Planning(
                25001431 ,
                2500143 ,
                "سیفی",
                new ArrayList<String>(){{add("یکشنبه");add("سه شنبه");}},
                "10:45",
                "12:15",
                "13" ,
                "15" ,
                28 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25001431);

        Planning planning25001302 = new Planning(
                25001302 ,
                2500130 ,
                "احمدی جاوید",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "10:45",
                "12:15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        industrialPlannings.add(planning25001302);

        Planning planning25001332 = new Planning(
                25001332 ,
                2500133 ,
                "احمدی جاوید",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "13:30",
                "15",
                "13" ,
                "15" ,
                23 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25001332);
        Planning planning25001301 = new Planning(
                25001301 ,
                2500130 ,
                "امین نیری",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "10:45",
                "12:15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        industrialPlannings.add(planning25001301);

        Planning planning25001331 = new Planning(
                25001331 ,
                2500133 ,
                "امین نیری",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "13:30",
                "15",
                "13" ,
                "15" ,
                23 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25001331);

        Planning planning25001231 = new Planning(
                25001231 ,
                2500123 ,
                "شهابی حقیقی",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "9:15",
                "10:45",
                "9" ,
                "11" ,
                25 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25001231);

        Planning planning25157231 = new Planning(
                25157231 ,
                2515723 ,
                "شیخ سجادیه",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "7:45",
                "9:15",
                "15" ,
                "17" ,
                19 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25157231);

        Planning planning25157331 = new Planning(
                25157331 ,
                2515723 ,
                "حاجی زاده",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "13:30",
                "15",
                "9" ,
                "11" ,
                28 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25157331);

        Planning planning25161531 = new Planning(
                25161531 ,
                2516153 ,
                "شیخ علیشاهی",
                new ArrayList<String>(){{add("یکشنبه");add("سه شنبه");}},
                "17",
                "18:30",
                "13" ,
                "15" ,
                18 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25161531);

        Planning planning25192131 = new Planning(
                25192131 ,
                2519213 ,
                "اسماعیلی نژاد",
                new ArrayList<String>(){{add("یکشنبه");add("سه شنبه");}},
                "15",
                "16:30",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25192131);

        Planning planning25192931 = new Planning(
                25192931 ,
                2519293 ,
                "احمدی",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "9:15",
                "10:45",
                "9" ,
                "11" ,
                25 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25192931);

        Planning planning25241531 = new Planning(
                25241531 ,
                2524153 ,
                "میردارهریجانی",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "17",
                "18:30",
                "15" ,
                "17" ,
                29 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25241531);

        Planning planning25261031 = new Planning(
                25261031 ,
                2526103 ,
                "اکبرپورشیرازی",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "7:45",
                "9:15",
                "15" ,
                "17" ,
                27 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25261031);

        Planning planning25292531 = new Planning(
                25292531 ,
                2529253 ,
                "فاطمی قمی",
                new ArrayList<String>(){{add("یکشنبه");add("سه شنبه");}},
                "9:15",
                "10:45",
                "9" ,
                "11" ,
                18 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25292531);

        Planning planning25292532 = new Planning(
                25292532 ,
                2529253 ,
                "مصدق(انگلیسی)",
                new ArrayList<String>(){{add("یکشنبه");add("سه شنبه");}},
                "9:15",
                "10:45",
                "9" ,
                "11" ,
                18 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25292532);

        Planning planning25331031 = new Planning(
                25331031 ,
                2533103 ,
                "حسین پور",
                new ArrayList<String>(){{add("یکشنبه");add("سه شنبه");}},
                "10:45",
                "12:15",
                "13" ,
                "15" ,
                18 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25331031);
        Planning planning25331831 = new Planning(
                25331831 ,
                2533183 ,
                "حسین پور",
                new ArrayList<String>(){{add("یکشنبه");add("سه شنبه");}},
                "7:45",
                "9:15",
                "9" ,
                "11" ,
                21 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25331831);

        Planning planning25338431 = new Planning(
                25338431 ,
                2533843 ,
                "میرزاپور آلهاشم",
                new ArrayList<String>(){{add("دوشنبه");add("چهارشنبه");}},
                "10:45",
                "12:15",
                "9" ,
                "11" ,
                18 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25338431);

        Planning planning25811521 = new Planning(
                25811521 ,
                2581152 ,
                "شمس قارنه",
                new ArrayList<String>(){{add("شنبه");}},
                "17",
                "18:30",
                "9" ,
                "11" ,
                18 ,
                10 ,"هردو"
        );

        industrialPlannings.add(planning25811521);

        Planning planning25338401 = new Planning(
                25338401 ,
                2533840 ,
                "حسن نیاکلایی",
                new ArrayList<String>(){{add("شنبه");}},
                "10:45",
                "12:15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        industrialPlannings.add(planning25338401);

    }

    private void addPhysicPlannings() {
        Planning planning10213507 = new Planning(
                10213507 ,
                1021350 ,
                "صنایعی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10213507);

        Planning planning10213531 = new Planning(
                10213531 ,
                1021353 ,
                "نوشاد",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "10",
                "12",
                "9" ,
                "11" ,
                22 ,
                10 ,"هردو"
        );

        physicPlannings.add(planning10213531);

        Planning planning10213532 = new Planning(
                10213532 ,
                1021353 ,
                "شمسائی زفرقندی",
                new ArrayList<String>(){{add("شنبه");add("دوشنبه");}},
                "13",
                "15",
                "9" ,
                "11" ,
                22 ,
                10 ,"هردو"
        );

        physicPlannings.add(planning10213532);

        Planning planning10213533 = new Planning(
                10213533 ,
                1021353 ,
                "سرآمد",
                new ArrayList<String>(){{add("یکشنبه");add("سه شنبه");}},
                "10",
                "12",
                "9" ,
                "11" ,
                22 ,
                10 ,"هردو"
        );

        physicPlannings.add(planning10213533);

        Planning planning10213534 = new Planning(
                10213534 ,
                1021353 ,
                "شایگان فر",
                new ArrayList<String>(){{add("یکشنبه");add("سه شنبه");}},
                "13",
                "15",
                "9" ,
                "11" ,
                22 ,
                10 ,"هردو"
        );

        physicPlannings.add(planning10213534);

        Planning planning10223711 = new Planning(
                10223711 ,
                1022371 ,
                "دهمرده",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223711);

        Planning planning10223712 = new Planning(
                10223712 ,
                1022371 ,
                "زارع",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223712);

        Planning planning10223713 = new Planning(
                10223713 ,
                1022371 ,
                "محمدزاده",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223713);

        Planning planning10223714 = new Planning(
                10223714 ,
                1022371 ,
                "دهمرده",
                new ArrayList<String>(){{add("یکشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223714);
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

        Planning planning10223715 = new Planning(
                10223715 ,
                1022371 ,
                "خزایی",
                new ArrayList<String>(){{add("یکشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223715);

        Planning planning10223716 = new Planning(
                10223716 ,
                1022371 ,
                "حیدری",
                new ArrayList<String>(){{add("یکشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223716);

        Planning planning10223717 = new Planning(
                10223717 ,
                1022371 ,
                "متولیان",
                new ArrayList<String>(){{add("دوشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223717);

        Planning planning10223718 = new Planning(
                10223718 ,
                1022371 ,
                "حسینی",
                new ArrayList<String>(){{add("دوشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223718);

        Planning planning10223719 = new Planning(
                10223719 ,
                1022371 ,
                "شاهی",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223719);

        Planning planning102237110 = new Planning(
                102237110 ,
                1022371 ,
                "ابن الرسول",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237110);

        Planning planning102237111 = new Planning(
                102237111 ,
                1022371 ,
                "حیدری",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237111);

        Planning planning102237112 = new Planning(
                102237112 ,
                1022371 ,
                "پورهاشمی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237112);

        Planning planning102237113 = new Planning(
                102237113 ,
                1022371 ,
                "اوجاقلو",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237113);

        Planning planning102237114 = new Planning(
                102237114 ,
                1022371 ,
                "باقرزاده فاروجی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237114);

        Planning planning102237115 = new Planning(
                102237115 ,
                1022371 ,
                "ابراهیم نسب نویری",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237115);


        Planning planning102237116 = new Planning(
                102237116 ,
                1022371 ,
                "دهمرده",
                new ArrayList<String>(){{add("شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237116);

        Planning planning102237117 = new Planning(
                102237117 ,
                1022371 ,
                "زارع",
                new ArrayList<String>(){{add("شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237117);

        Planning planning102237118 = new Planning(
                102237118 ,
                1022371 ,
                "محمدزاده",
                new ArrayList<String>(){{add("شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237118);

        Planning planning102237119 = new Planning(
                102237119 ,
                1022371 ,
                "شریعت بهادری",
                new ArrayList<String>(){{add("یکشنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237119);

        Planning planning102237120 = new Planning(
                102237120 ,
                1022371 ,
                "خزایی",
                new ArrayList<String>(){{add("یکشنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237120);


        Planning planning102237121 = new Planning(
                102237121 ,
                1022371 ,
                "حیدری",
                new ArrayList<String>(){{add("یکشنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237121);

        Planning planning102237122 = new Planning(
                102237122 ,
                1022371 ,
                "متولیان",
                new ArrayList<String>(){{add("دوشنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237122);

        Planning planning102237123 = new Planning(
                102237123 ,
                1022371 ,
                "حسینی",
                new ArrayList<String>(){{add("دوشنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237123);

        Planning planning102237124 = new Planning(
                102237124 ,
                1022371 ,
                "شاهی",
                new ArrayList<String>(){{add("دوشنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237124);

        Planning planning102237125 = new Planning(
                102237125 ,
                1022371 ,
                "ابن الرسول",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237125);

        Planning planning102237126 = new Planning(
                102237126 ,
                1022371 ,
                "حیدری",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237126);

        Planning planning102237127 = new Planning(
                102237127 ,
                1022371 ,
                "پورهاشمی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237127);

        Planning planning102237128 = new Planning(
                102237128 ,
                1022371 ,
                "اوجاقلو",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237128);

        Planning planning102237129 = new Planning(
                102237129 ,
                1022371 ,
                "باقرزاده فاروجی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237129);

        Planning planning102237131 = new Planning(
                102237131 ,
                1022371 ,
                "محمدی متین",
                new ArrayList<String>(){{add("شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237131);

        Planning planning102237130 = new Planning(
                102237130 ,
                1022371 ,
                "ابراهیم نسب نویری",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "10",
                "12",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237130);

        Planning planning102237132 = new Planning(
                102237132 ,
                1022371 ,
                "موسیوند",
                new ArrayList<String>(){{add("شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237132);

        Planning planning102237133 = new Planning(
                102237133 ,
                1022371 ,
                "محمدزاده",
                new ArrayList<String>(){{add("شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237133);

        Planning planning102237134 = new Planning(
                102237134 ,
                1022371 ,
                "خزایی",
                new ArrayList<String>(){{add("یکشنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237134);

        Planning planning102237135 = new Planning(
                102237135 ,
                1022371 ,
                "شریعت بهادری",
                new ArrayList<String>(){{add("یکشنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237135);

        Planning planning102237136 = new Planning(
                102237136 ,
                1022371 ,
                "حیدری",
                new ArrayList<String>(){{add("یکشنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237136);

        Planning planning102237137 = new Planning(
                102237137 ,
                1022371 ,
                "قدیریان",
                new ArrayList<String>(){{add("دوشنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237137);

        Planning planning102237138 = new Planning(
                102237138 ,
                1022371 ,
                "فتح اله",
                new ArrayList<String>(){{add("دوشنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237138);

        Planning planning102237139 = new Planning(
                102237139 ,
                1022371 ,
                "شاهی",
                new ArrayList<String>(){{add("دوشنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237139);

        Planning planning102237140 = new Planning(
                102237140 ,
                1022371 ,
                "ابن الرسول",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237140);

        Planning planning102237141 = new Planning(
                102237141 ,
                1022371 ,
                "حیدری",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237141);

        Planning planning102237142 = new Planning(
                102237142 ,
                1022371 ,
                "پورهاشمی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237142);

        Planning planning102237143 = new Planning(
                102237143 ,
                1022371 ,
                "غلامی شیخ احمد",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237143);

        Planning planning102237144 = new Planning(
                102237144 ,
                1022371 ,
                "باقرزاده فاروجی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237144);

        Planning planning102237145 = new Planning(
                102237145 ,
                1022371 ,
                "ابراهیم نسب نویری",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "13",
                "15",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237145);

        Planning planning102237146 = new Planning(
                102237146 ,
                1022371 ,
                "محمدی متین",
                new ArrayList<String>(){{add("شنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237146);

        Planning planning102237147 = new Planning(
                102237147 ,
                1022371 ,
                "زارع",
                new ArrayList<String>(){{add("شنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237147);

        Planning planning102237148 = new Planning(
                102237148 ,
                1022371 ,
                "موسیوند",
                new ArrayList<String>(){{add("شنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237148);

        Planning planning102237149 = new Planning(
                102237149 ,
                1022371 ,
                "شریعت بهادری",
                new ArrayList<String>(){{add("یکشنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237149);

        Planning planning102237150 = new Planning(
                102237150 ,
                1022371 ,
                "ابن الرسول",
                new ArrayList<String>(){{add("یکشنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237150);

        Planning planning102237151 = new Planning(
                102237151 ,
                1022371 ,
                "خزائی",
                new ArrayList<String>(){{add("یکشنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237151);

        Planning planning102237152 = new Planning(
                102237152 ,
                1022371 ,
                "حسینی",
                new ArrayList<String>(){{add("دوشنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237152);

        Planning planning102237153 = new Planning(
                102237153 ,
                1022371 ,
                "فتح اله",
                new ArrayList<String>(){{add("دوشنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237153);

        Planning planning102237154 = new Planning(
                102237154 ,
                1022371 ,
                "قدیریان",
                new ArrayList<String>(){{add("دوشنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237154);

        Planning planning102237155 = new Planning(
                102237155 ,
                1022371 ,
                "متولیان",
                new ArrayList<String>(){{add("سه شنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237155);

        Planning planning102237156 = new Planning(
                102237156 ,
                1022371 ,
                "غلامی شیخ احمد",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237156);

        Planning planning102237157 = new Planning(
                102237157 ,
                1022371 ,
                "مشهدی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237157);

        Planning planning102237158 = new Planning(
                102237158 ,
                1022371 ,
                "محمدی متین",
                new ArrayList<String>(){{add("شنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237158);

        Planning planning102237159 = new Planning(
                102237159 ,
                1022371 ,
                "اشرفی بلگاباد",
                new ArrayList<String>(){{add("شنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237159);

        Planning planning102237160 = new Planning(
                102237160 ,
                1022371 ,
                "موسیوند",
                new ArrayList<String>(){{add("شنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237160);

        Planning planning102237161 = new Planning(
                102237161 ,
                1022371 ,
                "ابن الرسول",
                new ArrayList<String>(){{add("یکشنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237161);

        Planning planning102237162 = new Planning(
                102237162 ,
                1022371 ,
                "سعیدی بابی",
                new ArrayList<String>(){{add("یکشنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237162);

        Planning planning102237163 = new Planning(
                102237163 ,
                1022371 ,
                "خزائی",
                new ArrayList<String>(){{add("یکشنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237163);

        Planning planning102237164 = new Planning(
                102237164 ,
                1022371 ,
                "نیازی",
                new ArrayList<String>(){{add("دوشنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237164);

        Planning planning102237165 = new Planning(
                102237165 ,
                1022371 ,
                "فتح اله",
                new ArrayList<String>(){{add("دوشنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237165);


        Planning planning102237166 = new Planning(
                102237166 ,
                1022371 ,
                "قدیریان",
                new ArrayList<String>(){{add("دوشنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237166);

        Planning planning102237167 = new Planning(
                102237167 ,
                1022371 ,
                "سعیدی بابی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237167);

        Planning planning102237168 = new Planning(
                102237168 ,
                1022371 ,
                "مشهدی",
                new ArrayList<String>(){{add("چهارشنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237168);

        Planning planning102237169 = new Planning(
                102237169 ,
                1022371 ,
                "اشرفی بلگاباد",
                new ArrayList<String>(){{add("سه شنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237169);

        Planning planning102237170 = new Planning(
                102237170 ,
                1022371 ,
                "اشرفی بلگاباد",
                new ArrayList<String>(){{add("سه شنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning102237170);

        Planning planning10223911 = new Planning(
                10223911 ,
                1022391 ,
                "صالحیان متی کلائی",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223911);

        Planning planning10223912 = new Planning(
                10223912 ,
                1022391 ,
                "مهری",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223912);

        Planning planning10223913 = new Planning(
                10223913 ,
                1022391 ,
                "موسیوند",
                new ArrayList<String>(){{add("شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223913);

        Planning planning10223914 = new Planning(
                10223914 ,
                1022391 ,
                "صالحیان متی کلائی",
                new ArrayList<String>(){{add("یکشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223914);

        Planning planning10223915 = new Planning(
                10223915 ,
                1022391 ,
                "صالحیان متی کلائی",
                new ArrayList<String>(){{add("دوشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223915);

        Planning planning10223916 = new Planning(
                10223916 ,
                1022391 ,
                "صادقی",
                new ArrayList<String>(){{add("یکشنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223916);

        Planning planning10223917 = new Planning(
                10223917 ,
                1022391 ,
                "نوریان ثمرین",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        physicPlannings.add(planning10223917);

    }

    private void addGeneralPlannings() {
        Planning planning10321013 = new Planning(
                10321013 ,
                1032101 ,
                "رضائی درویشی",
                new ArrayList<String>(){{add("شنبه");}},
                "10",
                "12",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning10321013);

        Planning planning10321014 = new Planning(
                10321014 ,
                1032101 ,
                "تمهیدی",
                new ArrayList<String>(){{add("شنبه");}},
                "10",
                "12",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning10321014);

        Planning planning10321015 = new Planning(
                10321015 ,
                1032101 ,
                "تمهیدی",
                new ArrayList<String>(){{add("شنبه");}},
                "13",
                "15",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning10321015);

        Planning planning10321016 = new Planning(
                10321016 ,
                1032101 ,
                "کریمی",
                new ArrayList<String>(){{add("شنبه");}},
                "13",
                "15",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning10321016);

        Planning planning10321017 = new Planning(
                10321017 ,
                1032101 ,
                "تمهیدی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "8",
                "10",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning10321017);


        Planning planning10321018 = new Planning(
                10321018 ,
                1032101 ,
                "احمدی آشتیاتی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "8",
                "10",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning10321018);

        Planning planning10321019 = new Planning(
                10321019 ,
                1032101 ,
                "تمهیدی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "10",
                "12",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning10321019);

        Planning planning103210110 = new Planning(
                103210110 ,
                1032101 ,
                "احمدی آشتیانی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "10",
                "12",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210110);

        Planning planning103210111 = new Planning(
                103210111 ,
                1032101 ,
                "تمهیدی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13",
                "15",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210111);

        Planning planning103210112 = new Planning(
                103210112 ,
                1032101 ,
                "احمدی آشتیانی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13",
                "15",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210112);

        Planning planning103210114 = new Planning(
                103210114 ,
                1032101 ,
                "احمدی آشتیانی",
                new ArrayList<String>(){{add("دو شنبه");}},
                "8",
                "10",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210114);

        Planning planning103210113 = new Planning(
                103210113 ,
                1032101 ,
                "رضائی درویشی",
                new ArrayList<String>(){{add("دو شنبه");}},
                "8",
                "10",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210113);

        Planning planning103210115 = new Planning(
                103210115 ,
                1032101 ,
                "رضائی درویشی",
                new ArrayList<String>(){{add("دو شنبه");}},
                "10",
                "12",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210115);


        Planning planning103210116 = new Planning(
                103210116 ,
                1032101 ,
                "احمدی آشتیانی",
                new ArrayList<String>(){{add("دو شنبه");}},
                "10",
                "12",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210116);

        Planning planning103210117 = new Planning(
                103210117 ,
                1032101 ,
                "قهرمانی",
                new ArrayList<String>(){{add("دو شنبه");}},
                "13",
                "15",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210117);

        Planning planning103210118 = new Planning(
                103210118 ,
                1032101 ,
                "کریمی",
                new ArrayList<String>(){{add("دو شنبه");}},
                "13",
                "15",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210118);

        Planning planning103210119 = new Planning(
                103210119 ,
                1032101 ,
                "تمهیدی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210119);

        Planning planning103210120 = new Planning(
                103210120 ,
                1032101 ,
                "احمدی آشتیانی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "8",
                "10",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210120);

        Planning planning103210121 = new Planning(
                103210121 ,
                1032101 ,
                "تمهیدی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210121);

        Planning planning103210122 = new Planning(
                103210122 ,
                1032101 ,
                "احمدی آشتیانی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "10",
                "12",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210122);

        Planning planning103210123 = new Planning(
                103210123 ,
                1032101 ,
                "احمدی آشتیانی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210123);

        Planning planning103210124 = new Planning(
                103210124 ,
                1032101 ,
                "قهرمانی",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "15",
                "15" ,
                "17" ,
                21 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning103210124);

        Planning planning20217131 = new Planning(
                20217131 ,
                2021713 ,
                "صراف شیرازی",
                new ArrayList<String>(){{add("یک شنبه");add("سه شنبه");}},
                "13",
                "14:15",
                "13" ,
                "15" ,
                29 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20217131);

        Planning planning20217132 = new Planning(
                20217132 ,
                2021713 ,
                "فصیحی",
                new ArrayList<String>(){{add("یک شنبه");add("سه شنبه");}},
                "13",
                "14:15",
                "13" ,
                "15" ,
                29 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20217132);

        Planning planning20217231 = new Planning(
                20217231 ,
                2021723 ,
                "رضوانی",
                new ArrayList<String>(){{add(" شنبه");add("دو شنبه");}},
                "7:45",
                "9",
                "13" ,
                "15" ,
                29 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20217231);

        Planning planning20217232 = new Planning(
                20217232 ,
                2021723 ,
                "نفیسی",
                new ArrayList<String>(){{add(" شنبه");add("دو شنبه");}},
                "9:15",
                "10:30",
                "13" ,
                "15" ,
                29 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20217232);

        Planning planning20217233 = new Planning(
                20217233 ,
                2021723 ,
                "میلی منفرد",
                new ArrayList<String>(){{add("سه شنبه");add("یک شنبه");}},
                "9:15",
                "10:30",
                "13" ,
                "15" ,
                29 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20217233);

        Planning planning20227111 = new Planning(
                20227111 ,
                2022711 ,
                "رحیم زاده",
                new ArrayList<String>(){{add("سه شنبه");}},
                "13",
                "16",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        generalPlannings.add(planning20227111);

        Planning planning20227112 = new Planning(
                20227112 ,
                2022711 ,
                "دانشور",
                new ArrayList<String>(){{add("چهار شنبه");}},
                "16",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        generalPlannings.add(planning20227112);

        Planning planning20227211 = new Planning(20227211 ,
                2022721 ,
                "موسوی فر",
                new ArrayList<String>(){{add(" شنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        generalPlannings.add(planning20227211);

        Planning planning20227212 = new Planning(
                20227212 ,
                2022721 ,
                "موسوی فر",
                new ArrayList<String>(){{add(" شنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        generalPlannings.add(planning20227212);

        Planning planning20227213 = new Planning(
                20227213 ,
                2022721 ,
                "موسوی فر",
                new ArrayList<String>(){{add("سه شنبه");}},
                "15",
                "17",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        generalPlannings.add(planning20227213);

        Planning planning20227214 = new Planning(
                20227214 ,
                2022721 ,
                "موسوی فر",
                new ArrayList<String>(){{add("سه شنبه");}},
                "17",
                "19",
                "0" ,
                "0" ,
                0 ,
                0 ,"هردو"
        );

        generalPlannings.add(planning20227214);

        Planning planning20107121 = new Planning(
                20107121 ,
                2010712 ,
                "سوری",
                new ArrayList<String>(){{add(" شنبه");}},
                "9:15",
                "12:15",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20107121);

        Planning planning20107122 = new Planning(
                20107122 ,
                2010712 ,
                "احمدوند",
                new ArrayList<String>(){{add(" شنبه");}},
                "9:15",
                "12:15",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20107122);

        Planning planning20107123 = new Planning(
                20107123 ,
                2010712 ,
                "سوری",
                new ArrayList<String>(){{add(" شنبه");}},
                "13:30",
                "16:30",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20107123);

        Planning planning20107124 = new Planning(
                20107124 ,
                2010712 ,
                "صائبی راد",
                new ArrayList<String>(){{add(" شنبه");}},
                "13:30",
                "16:30",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20107124);

        Planning planning20107125 = new Planning(
                20107125 ,
                2010712 ,
                "اکبری بنی",
                new ArrayList<String>(){{add(" شنبه");}},
                "13:30",
                "16:30",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20107125);

        Planning planning20107126 = new Planning(
                20107126 ,
                2010712 ,
                "متقی پور",
                new ArrayList<String>(){{add("یک شنبه");}},
                "9:15",
                "12:15",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20107126);

        Planning planning20107127 = new Planning(
                20107127 ,
                2010712 ,
                "صائبی راد",
                new ArrayList<String>(){{add("یک شنبه");}},
                "9:15",
                "12:15",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20107127);

        Planning planning20107128 = new Planning(
                20107128 ,
                2010712 ,
                "متقی پور",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13:30",
                "16:30",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20107128);

        Planning planning20107129 = new Planning(
                20107129 ,
                2010712 ,
                "مرادی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13:30",
                "16:30",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning20107129);

        Planning planning201071210 = new Planning(
                201071210 ,
                2010712 ,
                "برومندآزاد",
                new ArrayList<String>(){{add("دو شنبه");}},
                "9:15",
                "12:15",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning201071210);

        Planning planning201071211 = new Planning(
                201071211 ,
                2010712 ,
                "فریبرزی",
                new ArrayList<String>(){{add("یک شنبه");}},
                "13:30",
                "16:30",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning201071211);

        Planning planning201071212 = new Planning(
                201071212 ,
                2010712 ,
                "اکبری بنی",
                new ArrayList<String>(){{add("دو شنبه");}},
                "13:30",
                "16:30",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning201071212);

        Planning planning201071213 = new Planning(
                201071213 ,
                2010712 ,
                "برومندآزاد",
                new ArrayList<String>(){{add("دو شنبه");}},
                "13:30",
                "16:30",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning201071213);

        Planning planning201071214 = new Planning(
                201071214 ,
                2010712 ,
                "متقی پور",
                new ArrayList<String>(){{add("سه شنبه");}},
                "9:15",
                "12:15",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );
        generalPlannings.add(planning201071214);

        Planning planning201071215 = new Planning(
                201071215 ,
                2010712 ,
                "متقی پور",
                new ArrayList<String>(){{add("سه شنبه");}},
                "9:15",
                "12:15",
                "13" ,
                "15" ,
                26 ,
                10 ,"هردو"
        );

        generalPlannings.add(planning201071215);




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