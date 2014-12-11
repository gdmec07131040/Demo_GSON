package cn.edu.gdmec.s07131040.demo_gson;

import java.util.ArrayList;
import java.util.List;

import cn.edu.gdmec.s07131040.demo_gson.Person;

import com.google.gson.Gson;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        List<String> phones=new ArrayList<String>();
        
        phones.add("1111111111");
        phones.add("2222222222");
        phones.add("3333333333");
        
        
        Person person = new Person("zhangsan",18,phones);
        
        Gson gson = new Gson();
        
        String s = gson.toJson(person);
        Log.i("info", s);
    }

    
}
