package Pf;

import Bg.h0;
import Bg.j0;
import Gf.C0631e;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import java.util.Collections;
import java.util.List;
import kg.C4294f;
import ng.AbstractC4838e;
import rg.AbstractC5493d;

/* renamed from: Pf.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1144b extends D {

    /* renamed from: Y  reason: collision with root package name */
    public final C4294f f14077Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Ag.l f14078Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Ag.l f14079h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Ag.l f14080i0;

    public AbstractC1144b(Ag.u uVar, C4294f c4294f) {
        if (uVar != null) {
            if (c4294f != null) {
                this.f14077Y = c4294f;
                Ag.q qVar = (Ag.q) uVar;
                this.f14078Z = new Ag.l(qVar, new C1143a(this, 0));
                this.f14079h0 = new Ag.l(qVar, new C1143a(this, 1));
                this.f14080i0 = new Ag.l(qVar, new C1143a(this, 2));
                return;
            }
            p0(1);
            throw null;
        }
        p0(0);
        throw null;
    }

    public static /* synthetic */ void p0(int i10) {
        String str;
        int i11;
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 6 && i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16 && i10 != 17 && i10 != 19 && i10 != 20) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "name";
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                break;
            case 7:
            case 13:
                objArr[0] = "typeArguments";
                break;
            case 8:
            case 11:
                objArr[0] = "kotlinTypeRefiner";
                break;
            case 10:
            case 15:
                objArr[0] = "typeSubstitution";
                break;
            case 18:
                objArr[0] = "substitutor";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 4) {
                    if (i10 != 5) {
                        if (i10 != 6) {
                            if (i10 != 9 && i10 != 12 && i10 != 14 && i10 != 16) {
                                if (i10 != 17) {
                                    if (i10 != 19) {
                                        if (i10 != 20) {
                                            objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractClassDescriptor";
                                        } else {
                                            objArr[1] = "getDefaultType";
                                        }
                                    } else {
                                        objArr[1] = "substitute";
                                    }
                                } else {
                                    objArr[1] = "getUnsubstitutedMemberScope";
                                }
                            } else {
                                objArr[1] = "getMemberScope";
                            }
                        } else {
                            objArr[1] = "getContextReceivers";
                        }
                    } else {
                        objArr[1] = "getThisAsReceiverParameter";
                    }
                } else {
                    objArr[1] = "getUnsubstitutedInnerClassesScope";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        switch (i10) {
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 9:
            case 12:
            case 14:
            case 16:
            case 17:
            case 19:
            case 20:
                break;
            case 7:
            case 8:
            case 10:
            case 11:
            case 13:
            case 15:
                objArr[2] = "getMemberScope";
                break;
            case 18:
                objArr[2] = "substitute";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 6 || i10 == 9 || i10 == 12 || i10 == 14 || i10 == 16 || i10 == 17 || i10 == 19 || i10 == 20) {
            throw new IllegalStateException(format);
        }
    }

    @Override // Pf.D
    public ug.n C(h0 h0Var, Cg.i iVar) {
        if (h0Var != null) {
            if (h0Var.e()) {
                ug.n k02 = k0(iVar);
                if (k02 != null) {
                    return k02;
                }
                p0(12);
                throw null;
            }
            return new ug.s(k0(iVar), j0.e(h0Var));
        }
        p0(10);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public final ug.n E(h0 h0Var) {
        if (h0Var != null) {
            AbstractC5493d.i(AbstractC4838e.d(this));
            ug.n C10 = C(h0Var, Cg.h.f3127a);
            if (C10 != null) {
                return C10;
            }
            p0(16);
            throw null;
        }
        p0(15);
        throw null;
    }

    @Override // Pf.D, Mf.AbstractC0997f, Mf.AbstractC1003l
    /* renamed from: a */
    public final AbstractC0997f mo24a() {
        return this;
    }

    @Override // Mf.AbstractC1003l
    public final C4294f getName() {
        C4294f c4294f = this.f14077Y;
        if (c4294f != null) {
            return c4294f;
        }
        p0(2);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public ug.n i0() {
        ug.n nVar = (ug.n) this.f14079h0.mo122invoke();
        if (nVar != null) {
            return nVar;
        }
        p0(4);
        throw null;
    }

    @Override // Mf.AbstractC0997f, Mf.AbstractC1000i
    public final Bg.D n() {
        Bg.D d10 = (Bg.D) this.f14078Z.mo122invoke();
        if (d10 != null) {
            return d10;
        }
        p0(20);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public ug.n n0() {
        AbstractC5493d.i(AbstractC4838e.d(this));
        ug.n k02 = k0(Cg.h.f3127a);
        if (k02 != null) {
            return k02;
        }
        p0(17);
        throw null;
    }

    @Override // Mf.AbstractC0997f
    public List r0() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        p0(6);
        throw null;
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        return c0631e.b(this, obj);
    }

    @Override // Mf.AbstractC0997f
    public final AbstractC1146d v0() {
        AbstractC1146d abstractC1146d = (AbstractC1146d) this.f14080i0.mo122invoke();
        if (abstractC1146d != null) {
            return abstractC1146d;
        }
        p0(5);
        throw null;
    }

    /* renamed from: w0 */
    public AbstractC0997f c(j0 j0Var) {
        if (j0Var != null) {
            if (j0Var.f2128a.e()) {
                return this;
            }
            return new C(this, j0Var);
        }
        p0(18);
        throw null;
    }

    @Override // Pf.D, Mf.AbstractC0997f, Mf.AbstractC1003l
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC1000i mo24a() {
        return this;
    }

    @Override // Pf.D, Mf.AbstractC0997f, Mf.AbstractC1003l
    /* renamed from: a */
    public final AbstractC1003l mo24a() {
        return this;
    }
}
