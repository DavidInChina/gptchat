package j2;

import android.content.Context;
import jf.C3970t;
import r0.r;

/* renamed from: j2.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3906h implements AbstractC3899a {

    /* renamed from: a  reason: collision with root package name */
    public final long f36008a;

    public C3906h(long j6) {
        this.f36008a = j6;
    }

    @Override // j2.AbstractC3899a
    public final long a(Context context) {
        return this.f36008a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof C3906h) && r.c(this.f36008a, ((C3906h) obj).f36008a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = r.f44264l;
        return C3970t.a(this.f36008a);
    }

    public final String toString() {
        return "FixedColorProvider(color=" + ((Object) r.i(this.f36008a)) + ')';
    }
}
