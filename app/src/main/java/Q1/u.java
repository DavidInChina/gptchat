package Q1;

import A.AbstractC0044t0;
import android.gov.nist.core.Separators;
import android.os.Process;
import android.text.TextUtils;
import android.util.Log;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j$.util.Objects;
import java.io.IOException;
import java.util.AbstractCollection;
import java.util.IllegalFormatException;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class u implements s, K8.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f14349Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f14350Z;

    public static String e(String str, String str2, Object... objArr) {
        if (objArr.length > 0) {
            try {
                str2 = String.format(Locale.US, str2, objArr);
            } catch (IllegalFormatException e10) {
                AbstractC3612c.d("PlayCore", "Unable to format ".concat(str2), e10);
                str2 = str2 + " [" + TextUtils.join(", ", objArr) + "]";
            }
        }
        return android.gov.nist.core.a.j(str, " : ", str2);
    }

    @Override // Q1.s
    public final boolean a(CharSequence charSequence, int i10, int i11, D d10) {
        if (TextUtils.equals(charSequence.subSequence(i10, i11), this.f14350Z)) {
            d10.f14307c = (d10.f14307c & 3) | 4;
            return false;
        }
        return true;
    }

    public final void c(StringBuilder sb2, AbstractCollection abstractCollection) {
        CharSequence charSequence;
        CharSequence charSequence2;
        Iterator it = abstractCollection.iterator();
        try {
            if (it.hasNext()) {
                Object next = it.next();
                Objects.requireNonNull(next);
                if (next instanceof CharSequence) {
                    charSequence = (CharSequence) next;
                } else {
                    charSequence = next.toString();
                }
                sb2.append(charSequence);
                while (it.hasNext()) {
                    sb2.append((CharSequence) this.f14350Z);
                    Object next2 = it.next();
                    Objects.requireNonNull(next2);
                    if (next2 instanceof CharSequence) {
                        charSequence2 = (CharSequence) next2;
                    } else {
                        charSequence2 = next2.toString();
                    }
                    sb2.append(charSequence2);
                }
            }
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }

    public final void d(String str, Object... objArr) {
        if (Log.isLoggable("PlayCore", 4)) {
            Log.i("PlayCore", e(this.f14350Z, str, objArr));
        }
    }

    @Override // K8.n
    public final Object i() {
        throw new RuntimeException(this.f14350Z);
    }

    public final String toString() {
        switch (this.f14349Y) {
            case 8:
                return this.f14350Z;
            case 9:
                return android.gov.nist.core.a.n(new StringBuilder(Separators.LESS_THAN), this.f14350Z, '>');
            default:
                return super.toString();
        }
    }

    public u(String str, int i10) {
        this.f14349Y = i10;
        if (i10 == 6) {
            str.getClass();
            this.f14350Z = str;
        } else if (i10 != 8) {
            this.f14350Z = AbstractC0044t0.y("UID: [", Process.myUid(), "]  PID: [", Process.myPid(), "] ").concat(str);
        } else {
            AbstractC3557B.c0("name", str);
            this.f14350Z = str;
        }
    }

    public /* synthetic */ u(String str, int i10, int i11) {
        this.f14349Y = i10;
        this.f14350Z = str;
    }

    @Override // Q1.s
    public final Object b() {
        return this;
    }
}
