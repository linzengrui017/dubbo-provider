package com.linzengrui;

import org.springframework.stereotype.Service;

/**
 * Created by lzr on 2017/4/8.
 */
@Service("person")
public class PersonImpl implements Person {
    @Override
    public String talk() {
        return "Provider personImpl method";
    }
}
