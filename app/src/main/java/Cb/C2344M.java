package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: cb.M  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2344M implements AbstractC2338G {
    public static final C2343L Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f26477a;

    /* renamed from: b  reason: collision with root package name */
    public final String f26478b;

    public C2344M(int i10, String str, String str2) {
        if (3 != (i10 & 3)) {
            R4.b.e2(i10, 3, C2342K.f26476b);
            throw null;
        }
        this.f26477a = str;
        this.f26478b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2344M)) {
            return false;
        }
        C2344M c2344m = (C2344M) obj;
        if (AbstractC3557B.K(this.f26477a, c2344m.f26477a) && AbstractC3557B.K(this.f26478b, c2344m.f26478b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return this.f26478b.hashCode() + (this.f26477a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GizmoAboutGeneric(title=");
        sb2.append(this.f26477a);
        sb2.append(", subtitle=");
        return R.a.t(sb2, this.f26478b, Separators.RPAREN);
    }

    public C2344M(String str, String str2) {
        AbstractC3557B.c0("title", str);
        AbstractC3557B.c0("subtitle", str2);
        this.f26477a = str;
        this.f26478b = str2;
    }
}
