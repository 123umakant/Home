package com.test.database;

import com.googlecode.objectify.Objectify;
import com.googlecode.objectify.ObjectifyFactory;
import com.googlecode.objectify.ObjectifyService;
import com.test.entity.MainHrEntity;
import com.test.entity.StudentDetail;
import com.test.entity.ReviewCredit;
import com.test.entity.CallLog;

public class OfyService {
	static {
		
		     factory().register(StudentDetail.class);
		     factory().register(ReviewCredit.class);
		     factory().register(MainHrEntity.class);
		    factory().register(CallLog.class);
		}
public static Objectify ofy()
{
	 return ObjectifyService.ofy();
  
}
	private static ObjectifyFactory factory() {
		// TODO Auto-generated method stub
		return ObjectifyService.factory();
	}
	
}
