package Ve;

import Qg.AbstractC1207j;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* loaded from: classes2.dex */
public final class m0 implements AbstractC1207j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f18825Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ r0 f18826Z;

    public /* synthetic */ m0(r0 r0Var, int i10) {
        this.f18825Y = i10;
        this.f18826Z = r0Var;
    }

    @Override // Qg.AbstractC1207j
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        Object a5;
        Object b10;
        jf.y yVar = jf.y.f36177a;
        int i10 = this.f18825Y;
        r0 r0Var = this.f18826Z;
        switch (i10) {
            case 0:
                Te.m mVar = (Te.m) obj;
                if (mVar instanceof Te.i) {
                    Te.i iVar = (Te.i) mVar;
                    a5 = r0.a(r0Var, new Te.n(r0Var, iVar.f17191c, iVar.f17190b, 1), abstractC4825e);
                    if (a5 != EnumC5000a.f41328Y) {
                        return yVar;
                    }
                } else if (mVar instanceof Te.g) {
                    We.w X10 = mVar.X();
                    Te.g gVar = (Te.g) mVar;
                    a5 = r0.a(r0Var, new Te.t(r0Var, X10), abstractC4825e);
                    if (a5 != EnumC5000a.f41328Y) {
                        return yVar;
                    }
                } else if (mVar instanceof Te.e) {
                    We.w X11 = mVar.X();
                    Te.e eVar = (Te.e) mVar;
                    a5 = r0.a(r0Var, new Te.n(r0Var, X11, 0), abstractC4825e);
                    if (a5 != EnumC5000a.f41328Y) {
                        return yVar;
                    }
                } else if (mVar instanceof Te.f) {
                    We.w X12 = mVar.X();
                    Te.f fVar = (Te.f) mVar;
                    a5 = r0.a(r0Var, new Te.n(r0Var, X12, 1), abstractC4825e);
                    if (a5 != EnumC5000a.f41328Y) {
                        return yVar;
                    }
                } else {
                    return yVar;
                }
                return a5;
            default:
                Te.m mVar2 = (Te.m) obj;
                if (mVar2 instanceof Te.i) {
                    if (r0Var.g() == k0.f18807Z) {
                        Te.i iVar2 = (Te.i) mVar2;
                        b10 = r0Var.f18873l.b(new Te.n(r0Var, iVar2.f17191c, iVar2.f17190b, 1), abstractC4825e);
                        if (b10 != EnumC5000a.f41328Y) {
                            return yVar;
                        }
                    } else {
                        return yVar;
                    }
                } else if (mVar2 instanceof Te.j) {
                    Te.b bVar = r0Var.f18873l;
                    Te.j jVar = (Te.j) mVar2;
                    AbstractC3557B.c0("trackPublication", jVar.f17193c);
                    AbstractC3557B.c0("streamState", jVar.f17194d);
                    b10 = bVar.b(new Te.w(r0Var), abstractC4825e);
                    if (b10 != EnumC5000a.f41328Y) {
                        return yVar;
                    }
                } else if (mVar2 instanceof Te.l) {
                    Te.b bVar2 = r0Var.f18873l;
                    Te.l lVar = (Te.l) mVar2;
                    AbstractC3557B.c0("participant", lVar.f17196b);
                    AbstractC3557B.c0("trackPublication", lVar.f17197c);
                    b10 = bVar2.b(new Te.w(r0Var), abstractC4825e);
                    if (b10 != EnumC5000a.f41328Y) {
                        return yVar;
                    }
                } else if (mVar2 instanceof Te.e) {
                    We.w X13 = mVar2.X();
                    Te.e eVar2 = (Te.e) mVar2;
                    b10 = r0.a(r0Var, new Te.n(r0Var, X13, 0), abstractC4825e);
                    if (b10 != EnumC5000a.f41328Y) {
                        return yVar;
                    }
                } else if (mVar2 instanceof Te.f) {
                    We.w X14 = mVar2.X();
                    Te.f fVar2 = (Te.f) mVar2;
                    b10 = r0.a(r0Var, new Te.n(r0Var, X14, 1), abstractC4825e);
                    if (b10 != EnumC5000a.f41328Y) {
                        return yVar;
                    }
                } else if (mVar2 instanceof Te.g) {
                    Te.b bVar3 = r0Var.f18873l;
                    We.w X15 = mVar2.X();
                    Te.g gVar2 = (Te.g) mVar2;
                    b10 = bVar3.b(new Te.t(r0Var, X15), abstractC4825e);
                    if (b10 != EnumC5000a.f41328Y) {
                        return yVar;
                    }
                } else {
                    return yVar;
                }
                return b10;
        }
    }
}
