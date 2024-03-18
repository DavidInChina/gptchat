package cb;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: cb.J  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2341J implements AbstractC2338G {
    public static final C2340I Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f26473a;

    /* renamed from: b  reason: collision with root package name */
    public final Integer f26474b;

    public C2341J(int i10, String str, Integer num) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, C2339H.f26472b);
            throw null;
        }
        this.f26473a = str;
        if ((i10 & 2) == 0) {
            this.f26474b = null;
        } else {
            this.f26474b = num;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2341J)) {
            return false;
        }
        C2341J c2341j = (C2341J) obj;
        if (AbstractC3557B.K(this.f26473a, c2341j.f26473a) && AbstractC3557B.K(this.f26474b, c2341j.f26474b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f26473a.hashCode() * 31;
        Integer num = this.f26474b;
        if (num == null) {
            i10 = 0;
        } else {
            i10 = num.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        return "GizmoAboutCategory(title=" + this.f26473a + ", ranking=" + this.f26474b + Separators.RPAREN;
    }

    public C2341J(String str, Integer num) {
        AbstractC3557B.c0("title", str);
        this.f26473a = str;
        this.f26474b = num;
    }
}
