package E2;

import io.sentry.C3636c1;
import p2.C5065s;

/* renamed from: E2.b  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0470b implements Y {

    /* renamed from: Y  reason: collision with root package name */
    public final Y f4285Y;

    /* renamed from: Z  reason: collision with root package name */
    public boolean f4286Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C0471c f4287h0;

    public C0470b(C0471c c0471c, Y y10) {
        this.f4287h0 = c0471c;
        this.f4285Y = y10;
    }

    @Override // E2.Y
    public final boolean j() {
        if (!this.f4287h0.d() && this.f4285Y.j()) {
            return true;
        }
        return false;
    }

    @Override // E2.Y
    public final void m() {
        this.f4285Y.m();
    }

    @Override // E2.Y
    public final int o(long j6) {
        if (this.f4287h0.d()) {
            return -3;
        }
        return this.f4285Y.o(j6);
    }

    @Override // E2.Y
    public final int q(C3636c1 c3636c1, x2.h hVar, int i10) {
        C0471c c0471c = this.f4287h0;
        if (c0471c.d()) {
            return -3;
        }
        if (this.f4286Z) {
            hVar.f48626Z = 4;
            return -4;
        }
        long x10 = c0471c.x();
        int q10 = this.f4285Y.q(c3636c1, hVar, i10);
        if (q10 == -5) {
            C5065s c5065s = (C5065s) c3636c1.f34286h0;
            c5065s.getClass();
            int i11 = c5065s.f42301H0;
            int i12 = c5065s.f42300G0;
            if (i12 != 0 || i11 != 0) {
                if (c0471c.f4298j0 != 0) {
                    i12 = 0;
                }
                if (c0471c.f4299k0 != Long.MIN_VALUE) {
                    i11 = 0;
                }
                p2.r b10 = c5065s.b();
                b10.f42220A = i12;
                b10.f42221B = i11;
                c3636c1.f34286h0 = b10.a();
            }
            return -5;
        }
        long j6 = c0471c.f4299k0;
        if (j6 != Long.MIN_VALUE && ((q10 == -4 && hVar.f48643l0 >= j6) || (q10 == -3 && x10 == Long.MIN_VALUE && !hVar.f48642k0))) {
            hVar.i();
            hVar.f48626Z = 4;
            this.f4286Z = true;
            return -4;
        }
        return q10;
    }
}
