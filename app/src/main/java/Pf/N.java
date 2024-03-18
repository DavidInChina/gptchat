package Pf;

import Bg.h0;
import Bg.j0;
import Bg.p0;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kg.C4294f;
import rg.AbstractC5493d;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final class N {

    /* renamed from: a */
    public AbstractC1003l f14024a;

    /* renamed from: b */
    public Mf.A f14025b;

    /* renamed from: c */
    public AbstractC1007p f14026c;

    /* renamed from: e */
    public int f14028e;

    /* renamed from: h */
    public final AbstractC1146d f14031h;

    /* renamed from: i */
    public final C4294f f14032i;

    /* renamed from: j */
    public final Bg.A f14033j;

    /* renamed from: k */
    public final /* synthetic */ O f14034k;

    /* renamed from: d */
    public Mf.P f14027d = null;

    /* renamed from: f */
    public h0 f14029f = h0.f2123a;

    /* renamed from: g */
    public boolean f14030g = true;

    public N(O o10) {
        this.f14034k = o10;
        this.f14024a = o10.mo20k();
        this.f14025b = o10.h();
        this.f14026c = o10.getVisibility();
        this.f14028e = o10.e();
        this.f14031h = o10.f14056z0;
        this.f14032i = o10.getName();
        this.f14033j = o10.getType();
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 5 && i10 != 7 && i10 != 9 && i10 != 11 && i10 != 19 && i10 != 13 && i10 != 14 && i10 != 16 && i10 != 17) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                break;
            case 4:
                objArr[0] = "type";
                break;
            case 6:
                objArr[0] = "modality";
                break;
            case 8:
                objArr[0] = "visibility";
                break;
            case 10:
                objArr[0] = "kind";
                break;
            case 12:
                objArr[0] = "typeParameters";
                break;
            case 15:
                objArr[0] = "substitution";
                break;
            case 18:
                objArr[0] = "name";
                break;
            default:
                objArr[0] = "owner";
                break;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                            if (i10 != 9) {
                                if (i10 != 11) {
                                    if (i10 != 19) {
                                        if (i10 != 13) {
                                            if (i10 != 14) {
                                                if (i10 != 16) {
                                                    if (i10 != 17) {
                                                        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyDescriptorImpl$CopyConfiguration";
                                                    } else {
                                                        objArr[1] = "setCopyOverrides";
                                                    }
                                                } else {
                                                    objArr[1] = "setSubstitution";
                                                }
                                            } else {
                                                objArr[1] = "setDispatchReceiverParameter";
                                            }
                                        } else {
                                            objArr[1] = "setTypeParameters";
                                        }
                                    } else {
                                        objArr[1] = "setName";
                                    }
                                } else {
                                    objArr[1] = "setKind";
                                }
                            } else {
                                objArr[1] = "setVisibility";
                            }
                        } else {
                            objArr[1] = "setModality";
                        }
                    } else {
                        objArr[1] = "setReturnType";
                    }
                } else {
                    objArr[1] = "setPreserveSourceElement";
                }
            } else {
                objArr[1] = "setOriginal";
            }
        } else {
            objArr[1] = "setOwner";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 5:
            case 7:
            case 9:
            case 11:
            case 13:
            case 14:
            case 16:
            case 17:
            case 19:
                break;
            case 4:
                objArr[2] = "setReturnType";
                break;
            case 6:
                objArr[2] = "setModality";
                break;
            case 8:
                objArr[2] = "setVisibility";
                break;
            case 10:
                objArr[2] = "setKind";
                break;
            case 12:
                objArr[2] = "setTypeParameters";
                break;
            case 15:
                objArr[2] = "setSubstitution";
                break;
            case 18:
                objArr[2] = "setName";
                break;
            default:
                objArr[2] = "setOwner";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 5 || i10 == 7 || i10 == 9 || i10 == 11 || i10 == 19 || i10 == 13 || i10 == 14 || i10 == 16 || i10 == 17) {
            throw new IllegalStateException(format);
        }
    }

    public final O b() {
        AbstractC1146d abstractC1146d;
        S s10;
        P p10;
        Q q10;
        C1163v c1163v;
        AbstractC6216a abstractC6216a;
        Mf.S s11;
        Bg.A a5;
        P p11;
        S s12;
        S s13;
        O o10 = this.f14034k;
        o10.getClass();
        AbstractC1003l abstractC1003l = this.f14024a;
        Mf.A a10 = this.f14025b;
        AbstractC1007p abstractC1007p = this.f14026c;
        Mf.P p12 = this.f14027d;
        int i10 = this.f14028e;
        Mf.U u10 = Mf.V.f12075a;
        O z02 = o10.z0(abstractC1003l, a10, abstractC1007p, p12, i10, this.f14032i);
        List typeParameters = o10.getTypeParameters();
        ArrayList arrayList = new ArrayList(((ArrayList) typeParameters).size());
        j0 J02 = P4.a.J0(typeParameters, this.f14029f, z02, arrayList);
        p0 p0Var = p0.f2148j0;
        Bg.A a11 = this.f14033j;
        Bg.A j6 = J02.j(a11, p0Var);
        if (j6 != null) {
            p0 p0Var2 = p0.f2147i0;
            Bg.A j10 = J02.j(a11, p0Var2);
            if (j10 != null) {
                z02.D0(j10);
            }
            AbstractC1146d abstractC1146d2 = this.f14031h;
            if (abstractC1146d2 != null) {
                AbstractC1146d c10 = abstractC1146d2.c(J02);
                if (c10 != null) {
                    abstractC1146d = c10;
                }
            } else {
                abstractC1146d = null;
            }
            AbstractC1146d abstractC1146d3 = o10.f14035A0;
            if (abstractC1146d3 != null) {
                Bg.A j11 = J02.j(abstractC1146d3.getType(), p0Var2);
                if (j11 == null) {
                    s13 = null;
                } else {
                    abstractC1146d3.p0();
                    s13 = new S(z02, new vg.c(z02, j11), abstractC1146d3.getAnnotations());
                }
                s10 = s13;
            } else {
                s10 = null;
            }
            ArrayList arrayList2 = new ArrayList();
            for (AbstractC1146d abstractC1146d4 : o10.f14055y0) {
                Bg.A j12 = J02.j(abstractC1146d4.getType(), p0.f2147i0);
                if (j12 == null) {
                    s12 = null;
                } else {
                    vg.b bVar = (vg.b) ((vg.e) abstractC1146d4.p0());
                    int i11 = bVar.f47528Z;
                    abstractC1146d4.p0();
                    s12 = new S(z02, new vg.b(z02, j12, bVar.f47529h0), abstractC1146d4.getAnnotations());
                }
                if (s12 != null) {
                    arrayList2.add(s12);
                }
            }
            z02.E0(j6, arrayList, abstractC1146d, s10, arrayList2);
            P p13 = o10.f14037C0;
            if (p13 == null) {
                p10 = null;
            } else {
                Nf.i annotations = p13.getAnnotations();
                Mf.A a12 = this.f14025b;
                AbstractC1007p visibility = o10.f14037C0.getVisibility();
                if (this.f14028e == 2 && Mf.r.e(Mf.r.g(visibility.f12097a.c()))) {
                    visibility = Mf.r.f12108h;
                }
                AbstractC1007p abstractC1007p2 = visibility;
                P p14 = o10.f14037C0;
                boolean z10 = p14.f14016j0;
                int i12 = this.f14028e;
                Mf.P p15 = this.f14027d;
                if (p15 == null) {
                    p11 = null;
                } else {
                    p11 = p15.d();
                }
                p10 = new P(z02, annotations, a12, abstractC1007p2, z10, p14.f14017k0, p14.f14020n0, i12, p11, u10);
            }
            if (p10 != null) {
                P p16 = o10.f14037C0;
                Bg.A a13 = p16.f14057r0;
                p10.f14023q0 = O.A0(J02, p16);
                if (a13 != null) {
                    a5 = J02.j(a13, p0.f2148j0);
                } else {
                    a5 = null;
                }
                p10.z0(a5);
            }
            Mf.S s14 = o10.f14038D0;
            if (s14 == null) {
                q10 = null;
            } else {
                Nf.i annotations2 = ((Nf.b) s14).getAnnotations();
                Mf.A a14 = this.f14025b;
                AbstractC1007p visibility2 = ((M) o10.f14038D0).getVisibility();
                if (this.f14028e == 2 && Mf.r.e(Mf.r.g(visibility2.f12097a.c()))) {
                    visibility2 = Mf.r.f12108h;
                }
                AbstractC1007p abstractC1007p3 = visibility2;
                M m10 = (M) o10.f14038D0;
                boolean z11 = m10.f14016j0;
                int i13 = this.f14028e;
                Mf.P p17 = this.f14027d;
                if (p17 == null) {
                    s11 = null;
                } else {
                    s11 = p17.b();
                }
                q10 = new Q(z02, annotations2, a14, abstractC1007p3, z11, m10.f14017k0, m10.f14020n0, i13, s11, u10);
            }
            if (q10 != null) {
                List A02 = AbstractC1165x.A0(q10, ((Q) o10.f14038D0).S(), J02, false, false, null);
                if (A02 == null) {
                    A02 = Collections.singletonList(Q.y0(q10, AbstractC5493d.e(this.f14024a).n(), ((Nf.b) ((Mf.h0) ((Q) o10.f14038D0).S().get(0))).getAnnotations()));
                }
                if (A02.size() == 1) {
                    q10.f14023q0 = O.A0(J02, o10.f14038D0);
                    Mf.h0 h0Var = (Mf.h0) A02.get(0);
                    if (h0Var != null) {
                        q10.f14059r0 = h0Var;
                    } else {
                        Q.C(6);
                        throw null;
                    }
                } else {
                    throw new IllegalStateException();
                }
            }
            C1163v c1163v2 = null;
            C1163v c1163v3 = o10.f14039E0;
            if (c1163v3 == null) {
                c1163v = null;
            } else {
                c1163v = new C1163v(z02, c1163v3.getAnnotations());
            }
            C1163v c1163v4 = o10.f14040F0;
            if (c1163v4 != null) {
                c1163v2 = new C1163v(z02, c1163v4.getAnnotations());
            }
            z02.B0(p10, q10, c1163v, c1163v2);
            if (this.f14030g) {
                Ig.g gVar = new Ig.g();
                for (Mf.P p18 : o10.m()) {
                    gVar.add(p18.c(J02));
                }
                z02.h0(gVar);
            }
            if (o10.t() && (abstractC6216a = o10.f14043m0) != null) {
                z02.C0(o10.f14042l0, abstractC6216a);
                return z02;
            }
            return z02;
        }
        return null;
    }
}
