package com.example.yourskin;

public interface ListURL {
    public static final String FETCH_URL = "http://172.20.10.6/fetch/fetch_skincare.php?skin=";
    public static final String LIST_URL = "http://172.20.10.6/fetch/listProduct.php?skin=";
    public static final String ADMIN_URL = "https://172.20.10.6/admin/login.php";
    public static final String INSERT_URL = "http://172.20.10.6/admin/insert.php?id_skin=";
    public static final String UPDATE_URL = "http://172.20.10.6/admin/update.php?name_skin=";
    public static final String DELETE_URL = "http://172.20.10.6/admin/delete.php?id_skin=";
    public static final String MATCH_URL = "http://172.20.10.6/fetch/match.php?skin=";
}
