package Pf;

import Gf.C0631e;
import Mf.AbstractC1003l;
import id.AbstractC3557B;
import kg.C4291c;

/* loaded from: classes.dex */
public abstract class I extends AbstractC1159q implements Mf.G {

    /* renamed from: j0  reason: collision with root package name */
    public final C4291c f14010j0;

    /* renamed from: k0  reason: collision with root package name */
    public final String f14011k0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public I(Mf.B b10, C4291c c4291c) {
        super(b10, Nf.h.f12822a, c4291c.g(), Mf.V.f12075a);
        AbstractC3557B.c0("module", b10);
        AbstractC3557B.c0("fqName", c4291c);
        this.f14010j0 = c4291c;
        this.f14011k0 = "package " + c4291c + " of " + b10;
    }

    @Override // Pf.AbstractC1159q, Mf.AbstractC1004m
    public Mf.V g() {
        return Mf.V.f12075a;
    }

    @Override // Pf.AbstractC1158p
    public String toString() {
        return this.f14011k0;
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        switch (c0631e.f6407a) {
            case 0:
                return null;
            default:
                StringBuilder sb2 = (StringBuilder) obj;
                mg.m mVar = (mg.m) c0631e.f6408b;
                mg.m mVar2 = mg.m.f39296c;
                mVar.getClass();
                mVar.T(this.f14010j0, "package-fragment", sb2);
                if (mVar.f39299a.k()) {
                    sb2.append(" in ");
                    mVar.P(mo20k(), sb2, false);
                }
                return jf.y.f36177a;
        }
    }

    /* renamed from: w0 */
    public final Mf.B mo20k() {
        AbstractC1003l mo20k = super.mo20k();
        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ModuleDescriptor", mo20k);
        return (Mf.B) mo20k;
    }
}
