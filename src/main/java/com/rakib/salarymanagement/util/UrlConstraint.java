package com.rakib.salarymanagement.util;

public final class UrlConstraint {
    private UrlConstraint() {
    }

    private static final String VERSION = "/v1";
    private static final String API = "/api";

    public static class BankManagement {
        public static final String ROOT = VERSION + API + "/banks";
        public static final String DELETE = "/{bankId}";
        public static final String GET = "/{bankId}";
        public static final String PUT = "/{bankId}";
    }
}