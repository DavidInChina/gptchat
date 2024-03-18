package t0;

import nf.AbstractC4828h;
import q0.C5251c;
import q0.C5254f;
import r0.AbstractC5352p;

/* renamed from: t0.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5645d {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ C5643b f45615a;

    public C5645d(C5643b c5643b) {
        this.f45615a = c5643b;
    }

    public final void a(float f6, float f10, float f11, float f12, int i10) {
        this.f45615a.a().o(f6, f10, f11, f12, i10);
    }

    public final void b(float f6, float f10, float f11, float f12) {
        C5643b c5643b = this.f45615a;
        AbstractC5352p a5 = c5643b.a();
        long i10 = AbstractC4828h.i(C5254f.d(c5643b.b()) - (f11 + f6), C5254f.b(c5643b.b()) - (f12 + f10));
        if (C5254f.d(i10) >= 0.0f && C5254f.b(i10) >= 0.0f) {
            c5643b.c(i10);
            a5.p(f6, f10);
            return;
        }
        throw new IllegalArgumentException("Width and height must be greater than or equal to zero".toString());
    }

    public final void c(float f6, long j6) {
        AbstractC5352p a5 = this.f45615a.a();
        a5.p(C5251c.d(j6), C5251c.e(j6));
        a5.b(f6);
        a5.p(-C5251c.d(j6), -C5251c.e(j6));
    }

    public final void d(float f6, float f10, long j6) {
        AbstractC5352p a5 = this.f45615a.a();
        a5.p(C5251c.d(j6), C5251c.e(j6));
        a5.a(f6, f10);
        a5.p(-C5251c.d(j6), -C5251c.e(j6));
    }

    public final void e(float f6, float f10) {
        this.f45615a.a().p(f6, f10);
    }
}
