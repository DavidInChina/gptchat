package w7;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import io.sentry.android.core.AbstractC3612c;
import java.util.Arrays;

/* renamed from: w7.F  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6128F {

    /* renamed from: d  reason: collision with root package name */
    public static final Uri f48083d = new Uri.Builder().scheme("content").authority("com.google.android.gms.chimera").build();

    /* renamed from: a  reason: collision with root package name */
    public final String f48084a;

    /* renamed from: b  reason: collision with root package name */
    public final String f48085b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f48086c;

    public C6128F(String str, String str2, boolean z10) {
        A7.b.i0(str);
        this.f48084a = str;
        A7.b.i0(str2);
        this.f48085b = str2;
        this.f48086c = z10;
    }

    public final Intent a(Context context) {
        Bundle bundle;
        Intent intent = null;
        String str = this.f48084a;
        if (str != null) {
            if (this.f48086c) {
                Bundle bundle2 = new Bundle();
                bundle2.putString("serviceActionBundleKey", str);
                try {
                    bundle = context.getContentResolver().call(f48083d, "serviceIntentCall", (String) null, bundle2);
                } catch (IllegalArgumentException e10) {
                    AbstractC3612c.r("ConnectionStatusConfig", "Dynamic intent resolution failed: ".concat(e10.toString()));
                    bundle = null;
                }
                if (bundle != null) {
                    intent = (Intent) bundle.getParcelable("serviceResponseIntentKey");
                }
                if (intent == null) {
                    AbstractC3612c.r("ConnectionStatusConfig", "Dynamic lookup for intent failed for action: ".concat(String.valueOf(str)));
                }
            }
            if (intent == null) {
                return new Intent(str).setPackage(this.f48085b);
            }
            return intent;
        }
        return new Intent().setComponent(null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6128F)) {
            return false;
        }
        C6128F c6128f = (C6128F) obj;
        if (M3.H.P(this.f48084a, c6128f.f48084a) && M3.H.P(this.f48085b, c6128f.f48085b) && M3.H.P(null, null) && this.f48086c == c6128f.f48086c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f48084a, this.f48085b, null, 4225, Boolean.valueOf(this.f48086c)});
    }

    public final String toString() {
        String str = this.f48084a;
        if (str != null) {
            return str;
        }
        A7.b.k0(null);
        throw null;
    }
}
