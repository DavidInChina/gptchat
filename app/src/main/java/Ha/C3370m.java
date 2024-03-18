package ha;

import ah.AbstractC1998i;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;

@AbstractC1998i
/* renamed from: ha.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3370m implements AbstractC3371n {
    public static final C3369l Companion = new Object();

    /* renamed from: a  reason: collision with root package name */
    public final String f32071a;

    /* renamed from: b  reason: collision with root package name */
    public final String f32072b;

    public C3370m(int i10, String str, String str2) {
        if (1 != (i10 & 1)) {
            R4.b.e2(i10, 1, C3368k.f32070b);
            throw null;
        }
        this.f32071a = str;
        if ((i10 & 2) == 0) {
            this.f32072b = null;
        } else {
            this.f32072b = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3370m)) {
            return false;
        }
        C3370m c3370m = (C3370m) obj;
        if (AbstractC3557B.K(this.f32071a, c3370m.f32071a) && AbstractC3557B.K(this.f32072b, c3370m.f32072b)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = this.f32071a.hashCode() * 31;
        String str = this.f32072b;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return hashCode + i10;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Url(url=");
        sb2.append(this.f32071a);
        sb2.append(", title=");
        return R.a.t(sb2, this.f32072b, Separators.RPAREN);
    }

    public C3370m(String str, String str2) {
        AbstractC3557B.c0("url", str);
        this.f32071a = str;
        this.f32072b = str2;
    }
}
