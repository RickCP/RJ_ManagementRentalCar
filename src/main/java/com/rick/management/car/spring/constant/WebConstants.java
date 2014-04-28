package com.rick.management.car.spring.constant;

public interface WebConstants {
	public static final String ROLE_ADMIN = "Admin";
	public interface Views {
		public static final String PAGE_NOT_FOUND = "pageNotFound";
		public static final String ERROR = "error";
		public static final String SIGN_IN = "security/login";
        public static final String SIGN_UP = "security/register";
        public static final String SIGN_IN_SUCCESS="security/sign_up_success";
        public static final String CLIENT_INDEX="client";
        public static final String ADMIN_PAGE="manager/admin";
        public static final String LIST_DMXE="manager/listDMXe";
		public static final String MANAGER_MEMBER = "manager/manager_member";
		public static final String ADD_ACCOUNT = "manager/addAccount";
		public static final String FORGOTPASS = "security/forgotpass";
		public static final String MANAGER_PAGE = "manager/manager_index";
		
		public static final String LOGIN_PAGE = "/taikhoan/login";
		public static final String INDEX_PAGE = "index";
		public static final String CONTACT_PAGE = "public/contact";
		public static final String REGISTER_PAGE = "public/register";
		public static final String DETAIL_XE_PAGE = "public/detail";
		
		public static final String ADMINPAGE = "admin/admin_index";
		public static final String INDEX_PAGE_LOGED = "index_loged";
		public static final String DAT_THUE = "public/datthue";
		public static final String ERROR_PAGE = "public/errors";
		
	
	}

}
