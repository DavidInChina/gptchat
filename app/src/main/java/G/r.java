package G;

import Z.C1718j0;
import Z.C1724m0;
import Z.o1;
import nf.AbstractC4828h;
import z.AbstractC6652A0;
import z.AbstractC6659E;
import z.C6694e;

/* loaded from: classes2.dex */
public final class r {

    /* renamed from: m  reason: collision with root package name */
    public static final long f5549m = kotlin.jvm.internal.m.c(Integer.MAX_VALUE, Integer.MAX_VALUE);

    /* renamed from: n  reason: collision with root package name */
    public static final /* synthetic */ int f5550n = 0;

    /* renamed from: a  reason: collision with root package name */
    public final Ng.F f5551a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractC6659E f5552b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC6659E f5553c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f5554d;

    /* renamed from: e  reason: collision with root package name */
    public final C1724m0 f5555e;

    /* renamed from: f  reason: collision with root package name */
    public long f5556f;

    /* renamed from: g  reason: collision with root package name */
    public final C6694e f5557g;

    /* renamed from: i  reason: collision with root package name */
    public final C1724m0 f5559i;

    /* renamed from: l  reason: collision with root package name */
    public long f5562l;

    /* renamed from: h  reason: collision with root package name */
    public final C6694e f5558h = new C6694e(Float.valueOf(1.0f), AbstractC6652A0.f51116a, null, 12);

    /* renamed from: j  reason: collision with root package name */
    public final C1718j0 f5560j = Df.H.h0(1.0f);

    /* renamed from: k  reason: collision with root package name */
    public final C0557l f5561k = new C0557l(this, 1);

    public r(Ng.F f6) {
        this.f5551a = f6;
        Boolean bool = Boolean.FALSE;
        o1 o1Var = o1.f22665a;
        this.f5554d = AbstractC4828h.Z(bool, o1Var);
        this.f5555e = AbstractC4828h.Z(bool, o1Var);
        long j6 = f5549m;
        this.f5556f = j6;
        long j10 = Z0.i.f22797b;
        this.f5557g = new C6694e(new Z0.i(j10), AbstractC6652A0.f51122g, null, 12);
        this.f5559i = AbstractC4828h.Z(new Z0.i(j10), o1Var);
        this.f5562l = j6;
    }

    public final void a(boolean z10) {
        this.f5555e.setValue(Boolean.valueOf(z10));
    }

    public final void b(boolean z10) {
        this.f5554d.setValue(Boolean.valueOf(z10));
    }

    public final void c(long j6) {
        this.f5559i.setValue(new Z0.i(j6));
    }

    public final void d() {
        boolean booleanValue = ((Boolean) this.f5554d.getValue()).booleanValue();
        Ng.F f6 = this.f5551a;
        if (booleanValue) {
            b(false);
            Ad.l.O0(f6, null, null, new C0561p(this, null), 3);
        }
        if (((Boolean) this.f5555e.getValue()).booleanValue()) {
            a(false);
            Ad.l.O0(f6, null, null, new C0562q(this, null), 3);
        }
        c(Z0.i.f22797b);
        this.f5556f = f5549m;
        this.f5560j.i(1.0f);
    }
}
