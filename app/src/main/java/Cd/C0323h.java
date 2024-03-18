package Cd;

import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import java.util.List;
import q9.AbstractC5288e;

/* renamed from: Cd.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0323h {

    /* renamed from: a  reason: collision with root package name */
    public final List f3056a;

    /* renamed from: b  reason: collision with root package name */
    public final long f3057b;

    /* renamed from: c  reason: collision with root package name */
    public final long f3058c;

    public C0323h(List list) {
        this(list, AbstractC5288e.f43998a, AbstractC5288e.f43999b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C0323h)) {
            return false;
        }
        C0323h c0323h = (C0323h) obj;
        if (AbstractC3557B.K(this.f3056a, c0323h.f3056a) && Mg.b.d(this.f3057b, c0323h.f3057b) && Mg.b.d(this.f3058c, c0323h.f3058c)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int g10 = Mg.b.g(this.f3057b);
        return Mg.b.g(this.f3058c) + ((g10 + (this.f3056a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        String m10 = Mg.b.m(this.f3057b);
        String m11 = Mg.b.m(this.f3058c);
        StringBuilder sb2 = new StringBuilder("HintState(states=");
        sb2.append(this.f3056a);
        sb2.append(", animationStartDelay=");
        sb2.append(m10);
        sb2.append(", animationInterval=");
        return R.a.t(sb2, m11, Separators.RPAREN);
    }

    public C0323h(List list, long j6, long j10) {
        this.f3056a = list;
        this.f3057b = j6;
        this.f3058c = j10;
    }
}
