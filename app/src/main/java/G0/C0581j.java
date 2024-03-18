package G0;

import H0.AbstractC0701r0;
import H0.Y0;
import Z.m1;
import b0.C2104h;
import h0.C3291d;
import l0.AbstractC4325q;
import l0.AbstractC4326r;

/* renamed from: G0.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0581j extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Z  reason: collision with root package name */
    public static final C0581j f5793Z = new C0581j(0);

    /* renamed from: h0  reason: collision with root package name */
    public static final C0581j f5794h0 = new C0581j(3);

    /* renamed from: i0  reason: collision with root package name */
    public static final C0581j f5795i0 = new C0581j(4);

    /* renamed from: j0  reason: collision with root package name */
    public static final C0581j f5796j0 = new C0581j(5);

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f5797Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0581j(int i10) {
        super(2);
        this.f5797Y = i10;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f5797Y) {
            case 0:
                ((Number) obj2).intValue();
                ((AbstractC0584m) obj).getClass();
                return yVar;
            case 1:
                ((androidx.compose.ui.node.a) ((AbstractC0584m) obj)).t0((Z0.b) obj2);
                return yVar;
            case 2:
                Z0.l lVar = (Z0.l) obj2;
                androidx.compose.ui.node.a aVar = (androidx.compose.ui.node.a) ((AbstractC0584m) obj);
                if (aVar.f24860x0 != lVar) {
                    aVar.f24860x0 = lVar;
                    aVar.O();
                    androidx.compose.ui.node.a E10 = aVar.E();
                    if (E10 != null) {
                        E10.M();
                    }
                    aVar.N();
                }
                return yVar;
            case 3:
                ((androidx.compose.ui.node.a) ((AbstractC0584m) obj)).v0((E0.N) obj2);
                return yVar;
            case 4:
                ((androidx.compose.ui.node.a) ((AbstractC0584m) obj)).w0((AbstractC4326r) obj2);
                return yVar;
            case 5:
                Z.B b10 = (Z.B) obj2;
                androidx.compose.ui.node.a aVar2 = (androidx.compose.ui.node.a) ((AbstractC0584m) obj);
                aVar2.f24862z0 = b10;
                m1 m1Var = AbstractC0701r0.f7002e;
                C3291d c3291d = (C3291d) b10;
                c3291d.getClass();
                aVar2.t0((Z0.b) r9.y.T0(c3291d, m1Var));
                Z0.l lVar2 = (Z0.l) r9.y.T0(c3291d, AbstractC0701r0.f7008k);
                if (aVar2.f24860x0 != lVar2) {
                    aVar2.f24860x0 = lVar2;
                    aVar2.O();
                    androidx.compose.ui.node.a E11 = aVar2.E();
                    if (E11 != null) {
                        E11.M();
                    }
                    aVar2.N();
                }
                aVar2.x0((Y0) r9.y.T0(c3291d, AbstractC0701r0.f7013p));
                AbstractC4325q abstractC4325q = aVar2.f24831B0.f5704e;
                if ((abstractC4325q.f37723i0 & 32768) != 0) {
                    while (abstractC4325q != null) {
                        if ((abstractC4325q.f37722h0 & 32768) != 0) {
                            AbstractC4325q abstractC4325q2 = abstractC4325q;
                            C2104h c2104h = null;
                            while (abstractC4325q2 != null) {
                                if (abstractC4325q2 instanceof AbstractC0585n) {
                                    AbstractC4325q abstractC4325q3 = ((AbstractC4325q) ((AbstractC0585n) abstractC4325q2)).f37720Y;
                                    if (abstractC4325q3.f37732r0) {
                                        AbstractC0579h.k(abstractC4325q3);
                                    } else {
                                        abstractC4325q3.f37729o0 = true;
                                    }
                                } else if ((abstractC4325q2.f37722h0 & 32768) != 0 && (abstractC4325q2 instanceof AbstractC0587p)) {
                                    int i10 = 0;
                                    for (AbstractC4325q abstractC4325q4 = ((AbstractC0587p) abstractC4325q2).f5816t0; abstractC4325q4 != null; abstractC4325q4 = abstractC4325q4.f37725k0) {
                                        if ((abstractC4325q4.f37722h0 & 32768) != 0) {
                                            i10++;
                                            if (i10 == 1) {
                                                abstractC4325q2 = abstractC4325q4;
                                            } else {
                                                if (c2104h == null) {
                                                    c2104h = new C2104h(new AbstractC4325q[16]);
                                                }
                                                if (abstractC4325q2 != null) {
                                                    c2104h.b(abstractC4325q2);
                                                    abstractC4325q2 = null;
                                                }
                                                c2104h.b(abstractC4325q4);
                                            }
                                        }
                                    }
                                    if (i10 == 1) {
                                    }
                                }
                                abstractC4325q2 = AbstractC0579h.f(c2104h);
                            }
                        }
                        if ((abstractC4325q.f37723i0 & 32768) != 0) {
                            abstractC4325q = abstractC4325q.f37725k0;
                        }
                    }
                }
                return yVar;
            default:
                ((androidx.compose.ui.node.a) ((AbstractC0584m) obj)).x0((Y0) obj2);
                return yVar;
        }
    }
}
