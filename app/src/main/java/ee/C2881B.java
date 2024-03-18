package ee;

import Z.C1724m0;
import Z.o1;
import id.AbstractC3557B;
import nf.AbstractC4828h;
import z.C6694e;

/* renamed from: ee.B  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2881B {

    /* renamed from: a  reason: collision with root package name */
    public final wf.k f29286a;

    /* renamed from: b  reason: collision with root package name */
    public C6694e f29287b;

    /* renamed from: c  reason: collision with root package name */
    public C6694e f29288c;

    /* renamed from: d  reason: collision with root package name */
    public final C1724m0 f29289d = AbstractC4828h.Z(null, o1.f22665a);

    public C2881B(wf.k kVar) {
        AbstractC3557B.c0("initialOffset", kVar);
        this.f29286a = kVar;
    }

    public final C6694e a() {
        C6694e c6694e = this.f29287b;
        if (c6694e != null) {
            return c6694e;
        }
        AbstractC3557B.C2("translateX");
        throw null;
    }

    public final C6694e b() {
        C6694e c6694e = this.f29288c;
        if (c6694e != null) {
            return c6694e;
        }
        AbstractC3557B.C2("translateY");
        throw null;
    }

    public final void c() {
        float f6;
        Float f10;
        Float f11;
        Float f12;
        C1724m0 c1724m0 = this.f29289d;
        if (((r) c1724m0.getValue()) != null) {
            float floatValue = ((Number) a().e()).floatValue();
            r rVar = (r) c1724m0.getValue();
            Float f13 = null;
            if (rVar != null) {
                f10 = Float.valueOf(rVar.f29342a);
            } else {
                f10 = null;
            }
            if (f10 != null && floatValue == f10.floatValue()) {
                float floatValue2 = ((Number) b().e()).floatValue();
                r rVar2 = (r) c1724m0.getValue();
                if (rVar2 != null) {
                    f11 = Float.valueOf(rVar2.f29343b);
                } else {
                    f11 = null;
                }
                if (f11 != null && floatValue2 == f11.floatValue()) {
                    Float f14 = (Float) a().f51234g;
                    r rVar3 = (r) c1724m0.getValue();
                    if (rVar3 != null) {
                        f12 = Float.valueOf(rVar3.f29344c);
                    } else {
                        f12 = null;
                    }
                    if (f14 != null ? !(f12 == null || f14.floatValue() != f12.floatValue()) : f12 == null) {
                        Float f15 = (Float) b().f51234g;
                        r rVar4 = (r) c1724m0.getValue();
                        if (rVar4 != null) {
                            f13 = Float.valueOf(rVar4.f29345d);
                        }
                        if (f15 == null) {
                            if (f13 == null) {
                                return;
                            }
                        } else if (f13 != null && f15.floatValue() == f13.floatValue()) {
                            return;
                        }
                    }
                }
            }
        }
        float floatValue3 = ((Number) a().e()).floatValue();
        float floatValue4 = ((Number) b().e()).floatValue();
        Float f16 = (Float) a().f51234g;
        float f17 = 0.0f;
        if (f16 != null) {
            f6 = f16.floatValue();
        } else {
            f6 = 0.0f;
        }
        Float f18 = (Float) b().f51234g;
        if (f18 != null) {
            f17 = f18.floatValue();
        }
        c1724m0.setValue(new r(floatValue3, floatValue4, f6, f17));
    }
}
