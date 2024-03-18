package Pf;

import Bg.j0;
import Bg.p0;
import Mf.AbstractC0996e;
import Mf.AbstractC0997f;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kg.AbstractC4295g;
import kg.C4294f;
import l8.AbstractC4344b;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final class F extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f13991Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1158p f13992Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ F(AbstractC1158p abstractC1158p, int i10) {
        super(0);
        this.f13991Y = i10;
        this.f13992Z = abstractC1158p;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0194  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0197 A[SYNTHETIC] */
    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object mo122invoke() {
        j0 j0Var;
        Y y10;
        AbstractC0996e c10;
        S s10;
        j0 j0Var2;
        Y y11;
        kf.v vVar;
        int i10 = this.f13991Y;
        int i11 = 10;
        AbstractC1158p abstractC1158p = this.f13992Z;
        switch (i10) {
            case 0:
                G g10 = (G) abstractC1158p;
                E e10 = g10.f13997l0;
                if (e10 != null) {
                    g10.p0();
                    List<G> list = e10.f13988a;
                    list.contains(g10);
                    for (G g11 : list) {
                        g11.getClass();
                    }
                    ArrayList arrayList = new ArrayList(AbstractC6583a.H1(list, 10));
                    for (G g12 : list) {
                        Mf.H h10 = g12.f13998m0;
                        AbstractC3557B.Z(h10);
                        arrayList.add(h10);
                    }
                    return new C1157o("CompositeProvider@ModuleDescriptor for " + g10.getName(), arrayList);
                }
                StringBuilder sb2 = new StringBuilder("Dependencies of module ");
                String str = g10.getName().f37507Y;
                AbstractC3557B.b0("toString(...)", str);
                sb2.append(str);
                sb2.append(" were not set before querying module content");
                throw new AssertionError(sb2.toString());
            case 1:
                AbstractC1149g abstractC1149g = (AbstractC1149g) abstractC1158p;
                abstractC1149g.getClass();
                zg.t tVar = (zg.t) abstractC1149g;
                AbstractC0997f w02 = tVar.w0();
                kf.v vVar2 = kf.v.f37483Y;
                if (w02 != null) {
                    Collection<AbstractC0996e> u10 = w02.u();
                    AbstractC3557B.b0("getConstructors(...)", u10);
                    ArrayList arrayList2 = new ArrayList();
                    for (AbstractC0996e abstractC0996e : u10) {
                        W w10 = Y.f14067M0;
                        AbstractC3557B.Z(abstractC0996e);
                        w10.getClass();
                        Ag.u uVar = abstractC1149g.f14091j0;
                        AbstractC3557B.c0("storageManager", uVar);
                        if (tVar.w0() == null) {
                            j0Var = null;
                        } else {
                            j0Var = j0.d(tVar.x0());
                        }
                        if (j0Var != null && (c10 = ((C1154l) abstractC0996e).c(j0Var)) != null) {
                            Nf.i annotations = ((Nf.b) abstractC0996e).getAnnotations();
                            AbstractC1165x abstractC1165x = (AbstractC1165x) abstractC0996e;
                            int e11 = abstractC1165x.e();
                            AbstractC2469q0.u("getKind(...)", e11);
                            Mf.V g13 = abstractC1149g.g();
                            AbstractC3557B.b0("getSource(...)", g13);
                            j0 j0Var3 = j0Var;
                            Y y12 = new Y(uVar, abstractC1149g, c10, null, annotations, e11, g13);
                            List S = abstractC1165x.S();
                            if (S != null) {
                                ArrayList A02 = AbstractC1165x.A0(y12, S, j0Var3, false, false, null);
                                if (A02 != null) {
                                    Bg.D o22 = R4.b.o2(Ad.l.Q0(((AbstractC1165x) c10).f14171l0.B0()), tVar.n());
                                    AbstractC1146d abstractC1146d = abstractC1165x.f14174o0;
                                    Nf.g gVar = Nf.h.f12822a;
                                    if (abstractC1146d != null) {
                                        j0Var2 = j0Var3;
                                        y11 = y12;
                                        s10 = R4.b.h0(y11, j0Var2.h(abstractC1146d.getType(), p0.f2146h0), gVar);
                                    } else {
                                        j0Var2 = j0Var3;
                                        y11 = y12;
                                        s10 = null;
                                    }
                                    AbstractC0997f w03 = tVar.w0();
                                    if (w03 != null) {
                                        List d02 = abstractC1165x.d0();
                                        AbstractC3557B.b0("getContextReceiverParameters(...)", d02);
                                        ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(d02, i11));
                                        int i12 = 0;
                                        for (Object obj : d02) {
                                            int i13 = i12 + 1;
                                            if (i12 >= 0) {
                                                AbstractC1146d abstractC1146d2 = (AbstractC1146d) obj;
                                                Bg.A h11 = j0Var2.h(abstractC1146d2.getType(), p0.f2146h0);
                                                vg.f p02 = abstractC1146d2.p0();
                                                AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.resolve.scopes.receivers.ImplicitContextReceiver", p02);
                                                vg.b bVar = new vg.b(w03, h11, ((vg.b) ((vg.e) p02)).f47529h0);
                                                Lg.i iVar = AbstractC4295g.f37509a;
                                                arrayList3.add(new S(w03, bVar, gVar, C4294f.e(AbstractC4295g.f37510b + '_' + i12)));
                                                i12 = i13;
                                            } else {
                                                AbstractC4344b.d1();
                                                throw null;
                                            }
                                        }
                                        vVar = arrayList3;
                                    } else {
                                        vVar = vVar2;
                                    }
                                    y11.B0(s10, null, vVar, abstractC1149g.o(), A02, o22, Mf.A.f12051Z, abstractC1149g.f14092k0);
                                    y10 = y11;
                                    if (y10 == null) {
                                        arrayList2.add(y10);
                                    }
                                    i11 = 10;
                                }
                            } else {
                                AbstractC1165x.C(28);
                                throw null;
                            }
                        }
                        y10 = null;
                        if (y10 == null) {
                        }
                        i11 = 10;
                    }
                    return arrayList2;
                }
                return vVar2;
            default:
                return (List) ((a0) abstractC1158p).f14076q0.getValue();
        }
    }
}
