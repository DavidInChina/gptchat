package A;

import B.AbstractC0168u1;
import B.C0108a0;
import Z.C1720k0;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import w.C6077x;

/* loaded from: classes2.dex */
public final class Z0 implements AbstractC0168u1 {

    /* renamed from: i  reason: collision with root package name */
    public static final i0.r f150i;

    /* renamed from: a  reason: collision with root package name */
    public final C1720k0 f151a;

    /* renamed from: e  reason: collision with root package name */
    public float f155e;

    /* renamed from: b  reason: collision with root package name */
    public final C1720k0 f152b = U3.f.h0(0);

    /* renamed from: c  reason: collision with root package name */
    public final D.n f153c = kotlin.jvm.internal.m.d();

    /* renamed from: d  reason: collision with root package name */
    public final C1720k0 f154d = U3.f.h0(Integer.MAX_VALUE);

    /* renamed from: f  reason: collision with root package name */
    public final C0108a0 f156f = new C0108a0(new C6077x(6, this));

    /* renamed from: g  reason: collision with root package name */
    public final Z.I f157g = AbstractC4828h.E(new W0(this, 3));

    /* renamed from: h  reason: collision with root package name */
    public final Z.I f158h = AbstractC4828h.E(new W0(this, 2));

    static {
        Y0 y02 = Y0.f142Y;
        C0041s c0041s = C0041s.f293k0;
        i0.r rVar = i0.s.f32436a;
        f150i = new i0.r(y02, c0041s);
    }

    public Z0(int i10) {
        this.f151a = U3.f.h0(i10);
    }

    @Override // B.AbstractC0168u1
    public final boolean a() {
        return this.f156f.a();
    }

    @Override // B.AbstractC0168u1
    public final boolean b() {
        return ((Boolean) this.f158h.getValue()).booleanValue();
    }

    @Override // B.AbstractC0168u1
    public final Object c(B0 b02, wf.n nVar, AbstractC4825e abstractC4825e) {
        Object c10 = this.f156f.c(b02, nVar, abstractC4825e);
        if (c10 == EnumC5000a.f41328Y) {
            return c10;
        }
        return jf.y.f36177a;
    }

    @Override // B.AbstractC0168u1
    public final boolean d() {
        return ((Boolean) this.f157g.getValue()).booleanValue();
    }

    @Override // B.AbstractC0168u1
    public final float e(float f6) {
        return this.f156f.e(f6);
    }

    public final int f() {
        return this.f151a.h();
    }
}
