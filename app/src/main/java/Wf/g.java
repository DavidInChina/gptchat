package Wf;

import Bg.m0;
import Jf.l;
import Jf.p;
import Jf.u;
import Mf.A;
import Mf.AbstractC0992a;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.P;
import Mf.U;
import Mf.V;
import Mf.h0;
import Nf.i;
import Nf.j;
import Pf.AbstractC1159q;
import Pf.M;
import Pf.O;
import Pf.Q;
import Pf.S;
import Uf.D;
import cg.AbstractC2429t;
import id.AbstractC3557B;
import java.util.ArrayList;
import jf.C3959i;
import kf.v;
import kg.C4291c;
import kg.C4294f;
import wf.AbstractC6216a;

/* loaded from: classes2.dex */
public class g extends O implements a {

    /* renamed from: G0  reason: collision with root package name */
    public final boolean f21086G0;

    /* renamed from: H0  reason: collision with root package name */
    public final C3959i f21087H0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(AbstractC1003l abstractC1003l, i iVar, A a5, AbstractC1007p abstractC1007p, boolean z10, C4294f c4294f, V v10, P p10, int i10, boolean z11, C3959i c3959i) {
        super(abstractC1003l, p10, iVar, a5, abstractC1007p, z10, c4294f, i10, v10, false, false, false, false, false, false);
        if (abstractC1003l != null) {
            if (iVar != null) {
                if (a5 != null) {
                    if (abstractC1007p != null) {
                        if (c4294f != null) {
                            if (v10 != null) {
                                if (i10 != 0) {
                                    this.f21086G0 = z11;
                                    this.f21087H0 = c3959i;
                                    return;
                                }
                                C(6);
                                throw null;
                            }
                            C(5);
                            throw null;
                        }
                        C(4);
                        throw null;
                    }
                    C(3);
                    throw null;
                }
                C(2);
                throw null;
            }
            C(1);
            throw null;
        }
        C(0);
        throw null;
    }

    public static /* synthetic */ void C(int i10) {
        String str;
        int i11;
        if (i10 != 21) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 21) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 8:
                objArr[0] = "annotations";
                break;
            case 2:
            case 9:
                objArr[0] = "modality";
                break;
            case 3:
            case 10:
                objArr[0] = "visibility";
                break;
            case 4:
            case 11:
                objArr[0] = "name";
                break;
            case 5:
            case 12:
            case 18:
                objArr[0] = "source";
                break;
            case 6:
            case 16:
                objArr[0] = "kind";
                break;
            case 7:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 13:
                objArr[0] = "newOwner";
                break;
            case 14:
                objArr[0] = "newModality";
                break;
            case 15:
                objArr[0] = "newVisibility";
                break;
            case 17:
                objArr[0] = "newName";
                break;
            case 19:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 20:
                objArr[0] = "enhancedReturnType";
                break;
            case 21:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
                break;
            case 22:
                objArr[0] = "inType";
                break;
        }
        if (i10 != 21) {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaPropertyDescriptor";
        } else {
            objArr[1] = "enhance";
        }
        switch (i10) {
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                objArr[2] = "create";
                break;
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 19:
            case 20:
                objArr[2] = "enhance";
                break;
            case 21:
                break;
            case 22:
                objArr[2] = "setInType";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 != 21) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    public static g F0(AbstractC1003l abstractC1003l, Xf.d dVar, AbstractC1007p abstractC1007p, boolean z10, C4294f c4294f, Rf.h hVar, boolean z11) {
        A a5 = A.f12051Z;
        if (abstractC1003l != null) {
            if (c4294f != null) {
                return new g(abstractC1003l, dVar, a5, abstractC1007p, z10, c4294f, hVar, null, 1, z11, null);
            }
            C(11);
            throw null;
        }
        C(7);
        throw null;
    }

    @Override // Pf.c0, Mf.AbstractC0993b
    public final boolean B() {
        return false;
    }

    @Override // Wf.a
    public final a G(Bg.A a5, ArrayList arrayList, Bg.A a10, C3959i c3959i) {
        P p10;
        Pf.P p11;
        Q q10;
        S s10;
        S s11;
        Mf.S s12;
        Pf.P p12;
        if (p0() == this) {
            p10 = null;
        } else {
            p10 = p0();
        }
        g gVar = new g(mo20k(), getAnnotations(), h(), getVisibility(), this.f14041k0, getName(), g(), p10, e(), this.f21086G0, c3959i);
        Pf.P p13 = this.f14037C0;
        if (p13 != null) {
            i annotations = p13.getAnnotations();
            A h10 = p13.h();
            AbstractC1007p visibility = p13.getVisibility();
            boolean z10 = p13.f14016j0;
            int e10 = e();
            if (p10 == null) {
                p12 = null;
            } else {
                p12 = p10.d();
            }
            p11 = r14;
            Pf.P p14 = new Pf.P(gVar, annotations, h10, visibility, z10, p13.f14017k0, p13.f14020n0, e10, p12, p13.g());
            p11.f14023q0 = p13.f14023q0;
            p11.z0(a10);
        } else {
            p11 = null;
        }
        Mf.S s13 = this.f14038D0;
        if (s13 != null) {
            i annotations2 = ((Nf.b) s13).getAnnotations();
            M m10 = (M) s13;
            A h11 = m10.h();
            AbstractC1007p visibility2 = m10.getVisibility();
            boolean z11 = m10.f14016j0;
            int e11 = e();
            if (p10 == null) {
                s12 = null;
            } else {
                s12 = p10.b();
            }
            q10 = r13;
            Q q11 = new Q(gVar, annotations2, h11, visibility2, z11, m10.f14017k0, m10.f14020n0, e11, s12, ((AbstractC1159q) s13).g());
            q10.f14023q0 = q10.f14023q0;
            h0 h0Var = (h0) ((Q) s13).S().get(0);
            if (h0Var != null) {
                q10.f14059r0 = h0Var;
                s10 = null;
            } else {
                Q.C(6);
                throw null;
            }
        } else {
            s10 = null;
            q10 = null;
        }
        gVar.B0(p11, q10, this.f14039E0, this.f14040F0);
        AbstractC6216a abstractC6216a = this.f14043m0;
        if (abstractC6216a != null) {
            gVar.C0(this.f14042l0, abstractC6216a);
        }
        gVar.h0(m());
        if (a5 == null) {
            s11 = s10;
        } else {
            s11 = R4.b.h0(this, a5, Nf.h.f12822a);
        }
        gVar.E0(a10, getTypeParameters(), this.f14056z0, s11, v.f37483Y);
        return gVar;
    }

    @Override // Pf.O, Mf.AbstractC0993b
    public final Object q0(e eVar) {
        C3959i c3959i = this.f21087H0;
        if (c3959i != null && ((AbstractC0992a) c3959i.f36155Y).equals(eVar)) {
            return c3959i.f36156Z;
        }
        return null;
    }

    @Override // Pf.O, Mf.i0
    public final boolean t() {
        Bg.A type = getType();
        if (this.f21086G0) {
            AbstractC3557B.c0("type", type);
            if (((l.F(type) || u.a(type)) && !m0.f(type)) || l.D(type, p.f9173f)) {
                j jVar = AbstractC2429t.f26660a;
                C4291c c4291c = D.f17741p;
                AbstractC3557B.b0("ENHANCED_NULLABILITY_ANNOTATION", c4291c);
                if (!AbstractC3557B.A1(type, c4291c) || l.D(type, p.f9173f)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // Pf.O
    public final O z0(AbstractC1003l abstractC1003l, A a5, AbstractC1007p abstractC1007p, P p10, int i10, C4294f c4294f) {
        U u10 = V.f12075a;
        if (abstractC1003l != null) {
            if (a5 != null) {
                if (abstractC1007p != null) {
                    if (i10 != 0) {
                        if (c4294f != null) {
                            return new g(abstractC1003l, getAnnotations(), a5, abstractC1007p, this.f14041k0, c4294f, u10, p10, i10, this.f21086G0, this.f21087H0);
                        }
                        C(17);
                        throw null;
                    }
                    C(16);
                    throw null;
                }
                C(15);
                throw null;
            }
            C(14);
            throw null;
        }
        C(13);
        throw null;
    }

    @Override // Pf.O
    public final void D0(Bg.A a5) {
    }
}
