package u0;

import Ng.H;
import Z0.i;
import Z0.k;
import id.AbstractC3557B;
import l8.AbstractC4344b;
import q0.C5254f;
import r0.C5341e;
import r0.C5347k;
import r0.G;
import r0.z;
import t0.AbstractC5648g;
import t0.AbstractC5650i;

/* renamed from: u0.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5823a extends AbstractC5824b {

    /* renamed from: k0  reason: collision with root package name */
    public final z f46329k0;

    /* renamed from: l0  reason: collision with root package name */
    public final long f46330l0;

    /* renamed from: m0  reason: collision with root package name */
    public final long f46331m0;

    /* renamed from: n0  reason: collision with root package name */
    public int f46332n0 = 1;

    /* renamed from: o0  reason: collision with root package name */
    public final long f46333o0;

    /* renamed from: p0  reason: collision with root package name */
    public float f46334p0;

    /* renamed from: q0  reason: collision with root package name */
    public C5347k f46335q0;

    public C5823a(z zVar, long j6, long j10) {
        int i10;
        int i11;
        this.f46329k0 = zVar;
        this.f46330l0 = j6;
        this.f46331m0 = j10;
        int i12 = i.f22798c;
        if (((int) (j6 >> 32)) >= 0 && ((int) (j6 & 4294967295L)) >= 0 && (i10 = (int) (j10 >> 32)) >= 0 && (i11 = (int) (j10 & 4294967295L)) >= 0) {
            C5341e c5341e = (C5341e) zVar;
            if (i10 <= c5341e.f44234a.getWidth() && i11 <= c5341e.f44234a.getHeight()) {
                this.f46333o0 = j10;
                this.f46334p0 = 1.0f;
                return;
            }
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    @Override // u0.AbstractC5824b
    public final boolean b(float f6) {
        this.f46334p0 = f6;
        return true;
    }

    @Override // u0.AbstractC5824b
    public final boolean e(C5347k c5347k) {
        this.f46335q0 = c5347k;
        return true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5823a)) {
            return false;
        }
        C5823a c5823a = (C5823a) obj;
        if (AbstractC3557B.K(this.f46329k0, c5823a.f46329k0) && i.a(this.f46330l0, c5823a.f46330l0) && k.a(this.f46331m0, c5823a.f46331m0) && G.d(this.f46332n0, c5823a.f46332n0)) {
            return true;
        }
        return false;
    }

    @Override // u0.AbstractC5824b
    public final long h() {
        return H.z(this.f46333o0);
    }

    public final int hashCode() {
        int i10 = i.f22798c;
        long j6 = this.f46330l0;
        int i11 = (int) (j6 ^ (j6 >>> 32));
        long j10 = this.f46331m0;
        return ((((int) ((j10 >>> 32) ^ j10)) + ((i11 + (this.f46329k0.hashCode() * 31)) * 31)) * 31) + this.f46332n0;
    }

    @Override // u0.AbstractC5824b
    public final void i(AbstractC5650i abstractC5650i) {
        long c10 = H.c(AbstractC4344b.Y0(C5254f.d(abstractC5650i.g())), AbstractC4344b.Y0(C5254f.b(abstractC5650i.g())));
        float f6 = this.f46334p0;
        C5347k c5347k = this.f46335q0;
        int i10 = this.f46332n0;
        AbstractC5648g.d(abstractC5650i, this.f46329k0, this.f46330l0, this.f46331m0, c10, f6, c5347k, i10, 328);
    }

    public final String toString() {
        String str;
        StringBuilder sb2 = new StringBuilder("BitmapPainter(image=");
        sb2.append(this.f46329k0);
        sb2.append(", srcOffset=");
        sb2.append((Object) i.b(this.f46330l0));
        sb2.append(", srcSize=");
        sb2.append((Object) k.b(this.f46331m0));
        sb2.append(", filterQuality=");
        int i10 = this.f46332n0;
        if (G.d(i10, 0)) {
            str = "None";
        } else if (G.d(i10, 1)) {
            str = "Low";
        } else if (G.d(i10, 2)) {
            str = "Medium";
        } else if (G.d(i10, 3)) {
            str = "High";
        } else {
            str = "Unknown";
        }
        sb2.append((Object) str);
        sb2.append(')');
        return sb2.toString();
    }
}
