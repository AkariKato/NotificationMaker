package com.push.notificationmaker.Config;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Akari Kato on 2017/10/22.
 */

public class Func {


    public static Date strToDateYYYYMMDDHHMM(String dateStr) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm");
        return sdf.parse(dateStr);
    }
}
