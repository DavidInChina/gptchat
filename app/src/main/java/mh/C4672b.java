package mh;

import E0.j0;
import android.gov.nist.core.Separators;
import id.AbstractC3557B;
import jh.L1;

/* renamed from: mh.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4672b {

    /* renamed from: a  reason: collision with root package name */
    public final long f39434a;

    /* renamed from: b  reason: collision with root package name */
    public final float f39435b;

    public C4672b(long j6, float f6) {
        this.f39434a = j6;
        this.f39435b = f6;
    }

    public final C4672b a(r rVar, float f6, float f10) {
        AbstractC3557B.c0("range", rVar);
        long j6 = this.f39434a;
        C4672b n10 = L1.n(j6, rVar);
        float f11 = 1;
        return new C4672b(j6, com.google.android.gms.internal.play_billing.N.o(this.f39435b, (f11 - f6) * n10.f39435b, (f11 + f10) * L1.m(j6, rVar).f39435b));
    }

    public final long b() {
        long j6 = this.f39434a;
        float a5 = j0.a(j6);
        float f6 = this.f39435b;
        return androidx.compose.ui.layout.a.a(a5 * f6, j0.b(j6) * f6);
    }

    public final boolean c(r rVar) {
        AbstractC3557B.c0("range", rVar);
        long b10 = L1.m(this.f39434a, rVar).b();
        float max = Math.max(j0.a(b10), j0.b(b10));
        long b11 = b();
        if (max - Math.max(j0.a(b11), j0.b(b11)) < 0.01f) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C4672b)) {
            return false;
        }
        C4672b c4672b = (C4672b) obj;
        long j6 = c4672b.f39434a;
        int i10 = j0.f4070b;
        if (this.f39434a == j6 && Float.compare(this.f39435b, c4672b.f39435b) == 0) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10 = j0.f4070b;
        long j6 = this.f39434a;
        return Float.floatToIntBits(this.f39435b) + (((int) (j6 ^ (j6 >>> 32))) * 31);
    }

    public final String toString() {
        return "ContentZoomFactor(baseZoom=" + android.gov.nist.core.a.A("BaseZoomFactor(value=", j0.c(this.f39434a), Separators.RPAREN) + ", userZoom=" + ("UserZoomFactor(value=" + this.f39435b + Separators.RPAREN) + Separators.RPAREN;
    }
}
