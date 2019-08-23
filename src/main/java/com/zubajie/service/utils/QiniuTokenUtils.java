package com.zubajie.service.utils;

import com.qiniu.util.Auth;

public class QiniuTokenUtils {
    public static String createQiniuToken() {
        String accessKey = "60OHq1E4s3hcEQfCdyxCIGcKTdGkpm6LLzFolCR3";
        String secretKey = "8hNraClAx9rVrl6UKBpo1NGQzzbCMzvOankFtHrx";
        String bucket = "sweet-potato-clock";
        Auth auth = Auth.create(accessKey, secretKey);
        String upToken = auth.uploadToken(bucket);
        System.out.println(upToken);
        return upToken;
    }
}
