package w7;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import com.openai.chatgpt.R;
import io.sentry.android.core.AbstractC3612c;
import java.util.Locale;
import w.C6049A;

/* loaded from: classes2.dex */
public abstract class n {

    /* renamed from: a  reason: collision with root package name */
    public static final C6049A f48185a = new C6049A();

    /* renamed from: b  reason: collision with root package name */
    public static Locale f48186b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = A7.c.a(context).f45780a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        String a5 = a(context);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                            if (i10 != 9) {
                                if (i10 != 20) {
                                    switch (i10) {
                                        case 16:
                                            return d(context, "common_google_play_services_api_unavailable_text", a5);
                                        case 17:
                                            return d(context, "common_google_play_services_sign_in_failed_text", a5);
                                        case 18:
                                            return resources.getString(R.string.common_google_play_services_updating_text, a5);
                                        default:
                                            return resources.getString(R.string.common_google_play_services_unknown_issue, a5);
                                    }
                                }
                                return d(context, "common_google_play_services_restricted_profile_text", a5);
                            }
                            return resources.getString(R.string.common_google_play_services_unsupported_text, a5);
                        }
                        return d(context, "common_google_play_services_network_error_text", a5);
                    }
                    return d(context, "common_google_play_services_invalid_account_text", a5);
                }
                return resources.getString(R.string.common_google_play_services_enable_text, a5);
            } else if (A7.b.j1(context)) {
                return resources.getString(R.string.common_google_play_services_wear_update_text);
            } else {
                return resources.getString(R.string.common_google_play_services_update_text, a5);
            }
        }
        return resources.getString(R.string.common_google_play_services_install_text, a5);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(R.string.common_google_play_services_install_title);
            case 2:
                return resources.getString(R.string.common_google_play_services_update_title);
            case 3:
                return resources.getString(R.string.common_google_play_services_enable_title);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                AbstractC3612c.c("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return e(context, "common_google_play_services_invalid_account_title");
            case 7:
                AbstractC3612c.c("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return e(context, "common_google_play_services_network_error_title");
            case 8:
                AbstractC3612c.c("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                AbstractC3612c.c("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                AbstractC3612c.c("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                AbstractC3612c.c("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                AbstractC3612c.c("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case 16:
                AbstractC3612c.c("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                AbstractC3612c.c("GoogleApiAvailability", "The specified account could not be signed in.");
                return e(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                AbstractC3612c.c("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return e(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String d(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String e10 = e(context, str);
        if (e10 == null) {
            e10 = resources.getString(R.string.common_google_play_services_unknown_issue);
        }
        return String.format(resources.getConfiguration().locale, e10, str2);
    }

    public static String e(Context context, String str) {
        Resources resources;
        C6049A c6049a = f48185a;
        synchronized (c6049a) {
            try {
                Locale locale = r9.y.n0(context.getResources().getConfiguration()).f50327a.get(0);
                if (!locale.equals(f48186b)) {
                    c6049a.clear();
                    f48186b = locale;
                }
                String str2 = (String) c6049a.get(str);
                if (str2 != null) {
                    return str2;
                }
                int i10 = t7.h.f45774e;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources == null) {
                    return null;
                }
                int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                if (identifier == 0) {
                    AbstractC3612c.r("GoogleApiAvailability", "Missing resource: ".concat(str));
                    return null;
                }
                String string = resources.getString(identifier);
                if (TextUtils.isEmpty(string)) {
                    AbstractC3612c.r("GoogleApiAvailability", "Got empty resource: ".concat(str));
                    return null;
                }
                f48185a.put(str, string);
                return string;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
