package U;

import A.F0;
import Df.H;
import Ng.F;
import Z.AbstractC1710f0;
import Z.C1718j0;
import Z.C1724m0;
import Z.I;
import Z.l1;
import Z.o1;
import nf.AbstractC4828h;

/* loaded from: classes2.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final F f17365a;

    /* renamed from: b  reason: collision with root package name */
    public final l1 f17366b;

    /* renamed from: g  reason: collision with root package name */
    public final C1718j0 f17371g;

    /* renamed from: h  reason: collision with root package name */
    public final C1718j0 f17372h;

    /* renamed from: c  reason: collision with root package name */
    public final I f17367c = AbstractC4828h.E(new c(this, 1));

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f17368d = AbstractC4828h.Z(Boolean.FALSE, o1.f22665a);

    /* renamed from: e  reason: collision with root package name */
    public final C1718j0 f17369e = H.h0(0.0f);

    /* renamed from: f  reason: collision with root package name */
    public final C1718j0 f17370f = H.h0(0.0f);

    /* renamed from: i  reason: collision with root package name */
    public final F0 f17373i = new F0();

    public n(F f6, AbstractC1710f0 abstractC1710f0, float f10, float f11) {
        this.f17365a = f6;
        this.f17366b = abstractC1710f0;
        this.f17371g = H.h0(f11);
        this.f17372h = H.h0(f10);
    }

    public final float a() {
        return ((Number) this.f17367c.getValue()).floatValue();
    }

    public final float b() {
        return this.f17371g.h();
    }

    public final boolean c() {
        return ((Boolean) this.f17368d.getValue()).booleanValue();
    }
}
