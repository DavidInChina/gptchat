package og;

import Bg.A;
import Bg.d0;
import Bg.h0;
import Bg.p0;
import Mf.AbstractC1000i;
import Mf.b0;
import Nf.i;
import id.AbstractC3557B;

/* renamed from: og.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5008d extends h0 {

    /* renamed from: b  reason: collision with root package name */
    public final h0 f41344b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ boolean f41345c;

    public C5008d(h0 h0Var, boolean z10) {
        this.f41345c = z10;
        this.f41344b = h0Var;
    }

    @Override // Bg.h0
    public final boolean a() {
        return this.f41344b.a();
    }

    @Override // Bg.h0
    public final boolean b() {
        return this.f41345c;
    }

    @Override // Bg.h0
    public final i c(i iVar) {
        AbstractC3557B.c0("annotations", iVar);
        return this.f41344b.c(iVar);
    }

    @Override // Bg.h0
    public final d0 d(A a5) {
        d0 d10 = this.f41344b.d(a5);
        b0 b0Var = null;
        if (d10 == null) {
            return null;
        }
        AbstractC1000i k10 = a5.y0().k();
        if (k10 instanceof b0) {
            b0Var = (b0) k10;
        }
        return P4.a.C(d10, b0Var);
    }

    @Override // Bg.h0
    public final boolean e() {
        return this.f41344b.e();
    }

    @Override // Bg.h0
    public final A f(A a5, p0 p0Var) {
        AbstractC3557B.c0("topLevelType", a5);
        AbstractC3557B.c0("position", p0Var);
        return this.f41344b.f(a5, p0Var);
    }
}
