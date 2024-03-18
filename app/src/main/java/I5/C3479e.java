package i5;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import id.AbstractC3557B;

/* renamed from: i5.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3479e implements AbstractC3480f {

    /* renamed from: a  reason: collision with root package name */
    public final SharedPreferences f32715a;

    public C3479e(Context context) {
        if (!TextUtils.isEmpty("com.auth0.authentication.storage")) {
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.auth0.authentication.storage", 0);
            AbstractC3557B.b0("context.getSharedPrefere\u2026me, Context.MODE_PRIVATE)", sharedPreferences);
            this.f32715a = sharedPreferences;
            return;
        }
        throw new IllegalArgumentException("The SharedPreferences name is invalid.".toString());
    }

    public final void a(String str) {
        this.f32715a.edit().remove(str).apply();
    }

    public final String b(String str) {
        SharedPreferences sharedPreferences = this.f32715a;
        if (!sharedPreferences.contains(str)) {
            return null;
        }
        return sharedPreferences.getString(str, null);
    }

    public final void c(String str, Long l10) {
        this.f32715a.edit().putLong(str, l10.longValue()).apply();
    }

    public final void d(String str, String str2) {
        SharedPreferences sharedPreferences = this.f32715a;
        if (str2 == null) {
            sharedPreferences.edit().remove(str).apply();
        } else {
            sharedPreferences.edit().putString(str, str2).apply();
        }
    }
}
