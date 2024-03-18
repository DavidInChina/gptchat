package p2;

import android.net.Uri;
import android.os.Bundle;
import io.sentry.C3636c1;
import s2.AbstractC5530A;

/* renamed from: p2.u  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5067u implements AbstractC5057j {

    /* renamed from: h0  reason: collision with root package name */
    public static final String f42334h0 = Integer.toString(0, 36);

    /* renamed from: i0  reason: collision with root package name */
    public static final A9.a f42335i0 = new A9.a(16);

    /* renamed from: Y  reason: collision with root package name */
    public final Uri f42336Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f42337Z;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public C5067u(C3636c1 c3636c1) {
        this.f42336Y = (Uri) c3636c1.f34285Z;
        this.f42337Z = c3636c1.f34286h0;
    }

    @Override // p2.AbstractC5057j
    public final Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putParcelable(f42334h0, this.f42336Y);
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5067u)) {
            return false;
        }
        C5067u c5067u = (C5067u) obj;
        if (this.f42336Y.equals(c5067u.f42336Y) && AbstractC5530A.a(this.f42337Z, c5067u.f42337Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f42336Y.hashCode() * 31;
        Object obj = this.f42337Z;
        if (obj != null) {
            i10 = obj.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
