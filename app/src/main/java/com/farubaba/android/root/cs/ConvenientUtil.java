package com.farubaba.android.root.cs;

import android.text.TextUtils;

/**
 * @author violet
 * @date 2018/4/25 18:13
 */

public class ConvenientUtil {

    public static boolean isEmpty(String target){
        if(TextUtils.isEmpty(target) || TextUtils.isEmpty(target.trim())){
            return true;
        }
        return false;
    }
}
