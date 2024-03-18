package og;

import Bg.A;
import Bg.d0;
import Bg.p0;
import Cg.l;
import Mf.AbstractC1000i;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.List;
import kf.v;
import l8.AbstractC4344b;

/* renamed from: og.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5007c implements AbstractC5006b {

    /* renamed from: a  reason: collision with root package name */
    public final d0 f41342a;

    /* renamed from: b  reason: collision with root package name */
    public l f41343b;

    public C5007c(d0 d0Var) {
        AbstractC3557B.c0("projection", d0Var);
        this.f41342a = d0Var;
        d0Var.b();
        p0 p0Var = p0.f2146h0;
    }

    @Override // og.AbstractC5006b
    public final d0 a() {
        return this.f41342a;
    }

    @Override // Bg.Y
    public final List getParameters() {
        return v.f37483Y;
    }

    @Override // Bg.Y
    public final Jf.l j() {
        Jf.l j6 = this.f41342a.getType().y0().j();
        AbstractC3557B.b0("getBuiltIns(...)", j6);
        return j6;
    }

    @Override // Bg.Y
    public final /* bridge */ /* synthetic */ AbstractC1000i k() {
        return null;
    }

    @Override // Bg.Y
    public final Collection l() {
        A a5;
        d0 d0Var = this.f41342a;
        if (d0Var.b() == p0.f2148j0) {
            a5 = d0Var.getType();
        } else {
            a5 = j().o();
        }
        AbstractC3557B.Z(a5);
        return AbstractC4344b.F0(a5);
    }

    @Override // Bg.Y
    public final boolean m() {
        return false;
    }

    public final String toString() {
        return "CapturedTypeConstructor(" + this.f41342a + ')';
    }
}
