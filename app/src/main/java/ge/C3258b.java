package ge;

import Ii.q;
import Ng.AbstractC1073l0;
import Ng.AbstractC1085t;
import Ng.C1071k0;
import Ng.C1079o0;
import Ng.C1087v;
import Ng.y0;
import Sg.p;
import com.google.android.gms.internal.play_billing.N;
import he.C3418c;
import id.AbstractC3557B;
import je.j;
import jf.y;
import me.AbstractC4625H;
import me.C4641n;
import nf.AbstractC4825e;
import nf.AbstractC4829i;
import of.EnumC5000a;
import pf.AbstractC5163j;
import te.C5760d;
import ve.C6035d;
import we.AbstractC6214b;
import wf.o;

/* renamed from: ge.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3258b extends AbstractC5163j implements o {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31585Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f31586Z;

    /* renamed from: h0  reason: collision with root package name */
    public /* synthetic */ Object f31587h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ d f31588i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3258b(d dVar, AbstractC4825e abstractC4825e, int i10) {
        super(3, abstractC4825e);
        this.f31585Y = i10;
        this.f31588i0 = dVar;
    }

    @Override // wf.o
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        y yVar = y.f36177a;
        int i10 = this.f31585Y;
        d dVar = this.f31588i0;
        switch (i10) {
            case 0:
                C6035d c6035d = (C6035d) obj2;
                C3258b c3258b = new C3258b(dVar, (AbstractC4825e) obj3, 0);
                c3258b.f31587h0 = (Ie.e) obj;
                return c3258b.invokeSuspend(yVar);
            default:
                C3258b c3258b2 = new C3258b(dVar, (AbstractC4825e) obj3, 1);
                c3258b2.f31587h0 = (Ie.e) obj;
                return c3258b2.invokeSuspend(yVar);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v13 */
    /* JADX WARN: Type inference failed for: r1v17 */
    /* JADX WARN: Type inference failed for: r1v20, types: [Ng.t] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Throwable th2;
        Ie.e eVar;
        Throwable th3;
        ?? r12;
        C1079o0 c1079o0;
        y yVar = y.f36177a;
        int i10 = this.f31585Y;
        d dVar = this.f31588i0;
        switch (i10) {
            case 0:
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                int i11 = this.f31586Z;
                if (i11 != 0) {
                    if (i11 == 1) {
                        eVar = (Ie.e) this.f31587h0;
                        try {
                            N.B0(obj);
                            return yVar;
                        } catch (Throwable th4) {
                            th2 = th4;
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Ie.e eVar2 = (Ie.e) this.f31587h0;
                    try {
                        this.f31587h0 = eVar2;
                        this.f31586Z = 1;
                        if (eVar2.c(this) == enumC5000a) {
                            return enumC5000a;
                        }
                        return yVar;
                    } catch (Throwable th5) {
                        eVar = eVar2;
                        th2 = th5;
                    }
                }
                y7.b bVar = dVar.f31603p0;
                q qVar = AbstractC6214b.f48498d;
                ((C3418c) eVar.f8578Y).d();
                bVar.getClass();
                y0 y0Var = (y0) ((Ge.c) bVar.f50831Z).a(qVar);
                if (y0Var != null) {
                    Object i12 = y0Var.i();
                    AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", i12);
                    for (p pVar = (p) i12; !AbstractC3557B.K(pVar, y0Var); pVar = pVar.j()) {
                    }
                }
                throw th2;
            default:
                EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
                int i13 = this.f31586Z;
                if (i13 != 0) {
                    if (i13 == 1) {
                        r12 = (AbstractC1085t) this.f31587h0;
                        try {
                            N.B0(obj);
                            c1079o0 = r12;
                        } catch (Throwable th6) {
                            th3 = th6;
                            try {
                                C1079o0 c1079o02 = r12;
                                c1079o02.getClass();
                                c1079o02.b0(new C1087v(th3, false));
                                throw th3;
                            } finally {
                                ((C1079o0) r12).q0();
                            }
                        }
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    Ie.e eVar3 = (Ie.e) this.f31587h0;
                    C1079o0 c1079o03 = new C1079o0(((C5760d) eVar3.f8578Y).f46129e);
                    AbstractC4829i abstractC4829i = dVar.f31597j0.get(C1071k0.f12951Y);
                    AbstractC3557B.Z(abstractC4829i);
                    Ei.a aVar = AbstractC4625H.f39160a;
                    c1079o03.V(new j(((AbstractC1073l0) abstractC4829i).V(new C4641n(c1079o03, 1)), 1));
                    try {
                        C5760d c5760d = (C5760d) eVar3.f8578Y;
                        c5760d.getClass();
                        c5760d.f46129e = c1079o03;
                        this.f31587h0 = c1079o03;
                        this.f31586Z = 1;
                        if (eVar3.c(this) == enumC5000a2) {
                            return enumC5000a2;
                        }
                        c1079o0 = c1079o03;
                    } catch (Throwable th7) {
                        th3 = th7;
                        r12 = c1079o03;
                        C1079o0 c1079o022 = r12;
                        c1079o022.getClass();
                        c1079o022.b0(new C1087v(th3, false));
                        throw th3;
                    }
                }
                return yVar;
        }
    }
}
