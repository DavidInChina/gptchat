package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: cb.P  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2347P implements AbstractC2338G {
    public static final C2346O Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f26481a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26482b;

    public C2347P(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C2345N.f26480b);
            throw null;
        }
        this.f26481a = str;
        this.f26482b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2347P)) {
            return false;
        }
        C2347P c2347p = (C2347P) obj;
        if (AbstractC3557B.K(this.f26481a, c2347p.f26481a) && AbstractC3557B.K(this.f26482b, c2347p.f26482b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26482b.hashCode() + (this.f26481a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GizmoAboutRating(rating=");
        sb2.append(this.f26481a);
        sb2.append(", count=");
        return R.a.t(sb2, this.f26482b, Separators.RPAREN);
    }

    public C2347P(String str, String str2) {
        AbstractC3557B.c0("rating", str);
        AbstractC3557B.c0("count", str2);
        this.f26481a = str;
        this.f26482b = str2;
    }
}
