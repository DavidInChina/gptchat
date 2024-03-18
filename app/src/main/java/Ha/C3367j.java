package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import wd.C6209w;

@AbstractC1998i
/* renamed from: ha.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3367j implements AbstractC3371n {
    public static final C3366i Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f32068a;

    public C3367j(int i10, String str) {
        if (1 == (i10 & 1)) {
            this.f32068a = str;
        } else {
            R4.b.e2(i10, 1, C3365h.f32067b);
            throw null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3367j)) {
            return false;
        }
        if (AbstractC3557B.K(this.f32068a, ((C3367j) obj).f32068a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f32068a.hashCode();
    }

    public final String toString() {
        return android.gov.nist.core.a.A("File(file=", C6209w.a(this.f32068a), Separators.RPAREN);
    }

    public C3367j(String str) {
        this.f32068a = str;
    }
}
