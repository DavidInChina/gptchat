package Gf;

import Mf.AbstractC0997f;
import Mf.AbstractC1002k;
import Pf.C1156n;
import eg.EnumC2893a;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Collection;
import kg.C4290b;
import kotlin.Metadata;
import o1.C4885I;
import wf.AbstractC6216a;
import yf.AbstractC6583a;

/* renamed from: Gf.u  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0646u extends kotlin.jvm.internal.o implements AbstractC6216a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f6476Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ B f6477Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0646u(B b10, int i10) {
        super(0);
        this.f6476Y = i10;
        this.f6477Z = b10;
    }

    public final Collection a() {
        int i10 = this.f6476Y;
        B b10 = this.f6477Z;
        switch (i10) {
            case 1:
                return b10.m(b10.getDescriptor().n().R(), E.f6338Y);
            case 2:
                ug.n N10 = b10.getDescriptor().N();
                AbstractC3557B.b0("getStaticScope(...)", N10);
                return b10.m(N10, E.f6338Y);
            case 3:
            default:
                ug.n N11 = b10.getDescriptor().N();
                AbstractC3557B.b0("getStaticScope(...)", N11);
                return b10.m(N11, E.f6339Z);
            case 4:
                return b10.m(b10.getDescriptor().n().R(), E.f6339Z);
        }
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final Object mo122invoke() {
        AbstractC0997f abstractC0997f;
        int i10;
        C1156n y10;
        C4885I c4885i;
        int i11 = this.f6476Y;
        EnumC2893a enumC2893a = null;
        B b10 = this.f6477Z;
        switch (i11) {
            case 0:
                Collection<AbstractC1002k> j6 = b10.j();
                ArrayList arrayList = new ArrayList(AbstractC6583a.H1(j6, 10));
                for (AbstractC1002k abstractC1002k : j6) {
                    arrayList.add(new J(b10, abstractC1002k));
                }
                return arrayList;
            case 1:
                return a();
            case 2:
                return a();
            case 3:
                int i12 = B.f6331i0;
                C4290b z10 = b10.z();
                C0649x c0649x = (C0649x) b10.f6333h0.getValue();
                c0649x.getClass();
                Df.v vVar = D.f6336b[0];
                Object mo122invoke = c0649x.f6337a.mo122invoke();
                AbstractC3557B.b0("getValue(...)", mo122invoke);
                Rf.g gVar = (Rf.g) mo122invoke;
                xg.m mVar = gVar.f15506a;
                Mf.B b11 = mVar.f50011b;
                boolean z11 = z10.f37495c;
                Class cls = b10.f6332Z;
                if (z11 && cls.isAnnotationPresent(Metadata.class)) {
                    abstractC0997f = mVar.b(z10);
                } else {
                    abstractC0997f = R4.b.s0(b11, z10);
                }
                if (abstractC0997f == null) {
                    if (cls.isSynthetic()) {
                        y10 = B.y(z10, gVar);
                    } else {
                        Rf.c f6 = Cf.k.f(cls);
                        if (f6 != null && (c4885i = f6.f15500b) != null) {
                            enumC2893a = (EnumC2893a) c4885i.f40437c;
                        }
                        if (enumC2893a == null) {
                            i10 = -1;
                        } else {
                            i10 = AbstractC0650y.f6499a[enumC2893a.ordinal()];
                        }
                        switch (i10) {
                            case -1:
                            case 6:
                                throw new Lc.l("Unresolved class: " + cls + " (kind = " + enumC2893a + ')', 3);
                            case 0:
                            default:
                                throw new RuntimeException();
                            case 1:
                            case 2:
                            case 3:
                            case 4:
                                y10 = B.y(z10, gVar);
                                break;
                            case 5:
                                throw new Lc.l("Unknown class: " + cls + " (kind = " + enumC2893a + ')', 3);
                        }
                    }
                    return y10;
                }
                return abstractC0997f;
            case 4:
                return a();
            case 5:
                return a();
            case 6:
                if (b10.f6332Z.isAnonymousClass()) {
                    return null;
                }
                C4290b z12 = b10.z();
                if (z12.f37495c) {
                    return null;
                }
                return z12.b().b();
            default:
                return new C0649x(b10);
        }
    }
}
