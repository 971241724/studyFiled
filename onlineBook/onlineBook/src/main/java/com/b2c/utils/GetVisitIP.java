package com.b2c.utils;

import javax.servlet.http.HttpServletRequest;

public class GetVisitIP {
	public static String getVisitIp(HttpServletRequest request) {
	    String remoteAddr = request.getRemoteAddr();
	    String forwarded = request.getHeader("X-Forwarded-For");
	    String realIp = request.getHeader("X-Real-IP");

	    String ip = null;
	    if (realIp == null) {
	        if (forwarded == null) {
	            ip = remoteAddr;
	        } else {
	            ip = remoteAddr + "/" + forwarded.split(",")[0];
	        }
	    } else {
	        if (realIp.equals(forwarded)) {
	            ip = realIp;
	        } else {
	            if(forwarded != null){
	                forwarded = forwarded.split(",")[0];
	            }
	            ip = realIp + "/" + forwarded;
	        }
	    }
	    return ip;
	}
}