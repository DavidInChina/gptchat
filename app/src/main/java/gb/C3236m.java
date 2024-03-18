package gb;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;

/* renamed from: gb.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3236m extends AbstractC3237n {

    /* renamed from: a  reason: collision with root package name */
    public final String f31485a;

    /* renamed from: b  reason: collision with root package name */
    public final int f31486b;

    /* renamed from: c  reason: collision with root package name */
    public final int f31487c;

    public C3236m(String str, int i10, int i11) {
        this.f31485a = str;
        this.f31486b = i10;
        this.f31487c = i11;
    }

    @Override // gb.AbstractC3237n
    public final int a() {
        return this.f31487c;
    }

    @Override // gb.AbstractC3237n
    public final int b() {
        return this.f31486b;
    }

    @Override // gb.AbstractC3237n
    public final String c() {
        return this.f31485a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3236m)) {
            return false;
        }
        C3236m c3236m = (C3236m) obj;
        if (AbstractC3557B.K(this.f31485a, c3236m.f31485a) && this.f31486b == c3236m.f31486b && this.f31487c == c3236m.f31487c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        String str = this.f31485a;
        if (str == null) {
            i10 = 0;
        } else {
            i10 = str.hashCode();
        }
        return (((i10 * 31) + this.f31486b) * 31) + this.f31487c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Placeholder(prompt=");
        sb2.append(this.f31485a);
        sb2.append(", declaredWidth=");
        sb2.append(this.f31486b);
        sb2.append(", declaredHeight=");
        return android.gov.nist.core.a.l(sb2, this.f31487c, Separators.RPAREN);
    }
}
