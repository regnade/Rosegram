package ir.telgeram.Adel;

import android.content.Context;

public class AccountUtil {
    private static AccountUtil instance = new AccountUtil();

    public static AccountUtil getInstance(Context context) {
        return instance;
    }

    public static boolean getLoginFlag() {
        return false;
    }

    public static void switchToLastAccount() {
    }

    public static void setCurrentAccountName(String name) {
    }

    public static int getEnableAccountsCount() {
        return 0;
    }

    public static String getEnableAccountName(int index) {
        return "";
    }

    public static int getEnableAccountId(int index) {
        return 0;
    }

    public void addNewAccount() {
    }

    public void switchAccount(int id) {
    }
}
