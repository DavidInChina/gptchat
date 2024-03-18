package com.google.android.gms.internal.play_billing;

import K4.C0822j;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import io.sentry.android.core.AbstractC3612c;
import org.json.JSONException;

/* renamed from: com.google.android.gms.internal.play_billing.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2468q {

    /* renamed from: a  reason: collision with root package name */
    public static final int f26955a = Runtime.getRuntime().availableProcessors();

    public static int a(Bundle bundle, String str) {
        if (bundle == null) {
            e(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            d(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            e(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            return 6;
        }
    }

    public static C0822j b(Intent intent, String str) {
        if (intent == null) {
            e("BillingHelper", "Got null intent!");
            r2.d a5 = C0822j.a();
            a5.f44376a = 6;
            a5.f44377b = "An internal error occurred.";
            return a5.c();
        }
        r2.d a10 = C0822j.a();
        a10.f44376a = a(intent.getExtras(), str);
        a10.f44377b = c(intent.getExtras(), str);
        return a10.c();
    }

    public static String c(Bundle bundle, String str) {
        if (bundle == null) {
            e(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            d(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            e(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static void d(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (!str2.isEmpty()) {
                int i10 = 40000;
                while (!str2.isEmpty() && i10 > 0) {
                    int min = Math.min(str2.length(), Math.min(4000, i10));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i10 -= min;
                }
                return;
            }
            Log.v(str, str2);
        }
    }

    public static void e(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            AbstractC3612c.r(str, str2);
        }
    }

    public static void f(String str, String str2, Throwable th2) {
        if (Log.isLoggable(str, 5)) {
            AbstractC3612c.s(str, str2, th2);
        }
    }

    public static Purchase g(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e10) {
                e("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e10.toString()));
                return null;
            }
        }
        d("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
