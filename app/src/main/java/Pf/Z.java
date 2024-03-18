package Pf;

import Bg.p0;
import Mf.AbstractC1003l;
import java.util.ArrayList;
import java.util.List;
import kg.C4294f;
import ng.AbstractC4838e;
import rg.AbstractC5493d;

/* loaded from: classes2.dex */
public final class Z extends AbstractC1153k {

    /* renamed from: p0  reason: collision with root package name */
    public final wf.k f14071p0;

    /* renamed from: q0  reason: collision with root package name */
    public final ArrayList f14072q0;

    /* renamed from: r0  reason: collision with root package name */
    public boolean f14073r0;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Z(AbstractC1003l abstractC1003l, Nf.i iVar, boolean z10, p0 p0Var, C4294f c4294f, int i10, Ag.u uVar) {
        super(uVar, abstractC1003l, iVar, c4294f, p0Var, z10, i10, r8);
        Mf.Y y10 = Mf.Y.f12077a;
        if (abstractC1003l != null) {
            if (iVar != null) {
                if (p0Var != null) {
                    if (c4294f != null) {
                        if (uVar != null) {
                            this.f14072q0 = new ArrayList(1);
                            this.f14073r0 = false;
                            this.f14071p0 = null;
                            return;
                        }
                        C(25);
                        throw null;
                    }
                    C(22);
                    throw null;
                }
                C(21);
                throw null;
            }
            C(20);
            throw null;
        }
        C(19);
        throw null;
    }

    public static Z A0(AbstractC1003l abstractC1003l, p0 p0Var, C4294f c4294f, int i10, Ag.u uVar) {
        Nf.g gVar = Nf.h.f12822a;
        if (abstractC1003l != null) {
            if (uVar != null) {
                Z z02 = z0(abstractC1003l, gVar, false, p0Var, c4294f, i10, uVar);
                Bg.D m10 = AbstractC5493d.e(abstractC1003l).m();
                if (!z02.f14073r0) {
                    if (!Bi.c.g1(m10)) {
                        z02.f14072q0.add(m10);
                    }
                    if (!z02.f14073r0) {
                        z02.f14073r0 = true;
                        return z02;
                    }
                    throw new IllegalStateException("Type parameter descriptor is already initialized: " + z02.B0());
                }
                throw new IllegalStateException("Type parameter descriptor is already initialized: " + z02.B0());
            }
            C(4);
            throw null;
        }
        C(0);
        throw null;
    }

    public static /* synthetic */ void C(int i10) {
        String str;
        int i11;
        if (i10 != 5 && i10 != 28) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 5 && i10 != 28) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 7:
            case 13:
            case 20:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 14:
            case 21:
                objArr[0] = "variance";
                break;
            case 3:
            case 9:
            case 15:
            case 22:
                objArr[0] = "name";
                break;
            case 4:
            case 11:
            case 18:
            case 25:
                objArr[0] = "storageManager";
                break;
            case 5:
            case 28:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
                break;
            case 6:
            case 12:
            case 19:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 10:
            case 16:
            case 23:
                objArr[0] = "source";
                break;
            case 17:
                objArr[0] = "supertypeLoopsResolver";
                break;
            case 24:
                objArr[0] = "supertypeLoopsChecker";
                break;
            case 26:
                objArr[0] = "bound";
                break;
            case 27:
                objArr[0] = "type";
                break;
        }
        if (i10 != 5) {
            if (i10 != 28) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/TypeParameterDescriptorImpl";
            } else {
                objArr[1] = "resolveUpperBounds";
            }
        } else {
            objArr[1] = "createWithDefaultBound";
        }
        switch (i10) {
            case 5:
            case 28:
                break;
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
            case 18:
                objArr[2] = "createForFurtherModification";
                break;
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
                objArr[2] = "<init>";
                break;
            case 26:
                objArr[2] = "addUpperBound";
                break;
            case 27:
                objArr[2] = "reportSupertypeLoopError";
                break;
            default:
                objArr[2] = "createWithDefaultBound";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 5 || i10 == 28) {
            throw new IllegalStateException(format);
        }
    }

    public static Z z0(AbstractC1003l abstractC1003l, Nf.i iVar, boolean z10, p0 p0Var, C4294f c4294f, int i10, Ag.u uVar) {
        if (abstractC1003l != null) {
            if (iVar != null) {
                if (p0Var != null) {
                    if (c4294f != null) {
                        if (uVar != null) {
                            return new Z(abstractC1003l, iVar, z10, p0Var, c4294f, i10, uVar);
                        }
                        C(11);
                        throw null;
                    }
                    C(9);
                    throw null;
                }
                C(8);
                throw null;
            }
            C(7);
            throw null;
        }
        C(6);
        throw null;
    }

    public final String B0() {
        return getName() + " declared in " + AbstractC4838e.g(mo20k());
    }

    @Override // Pf.AbstractC1153k
    public final void x0(Bg.A a5) {
        if (a5 != null) {
            wf.k kVar = this.f14071p0;
            if (kVar == null) {
                return;
            }
            kVar.invoke(a5);
            return;
        }
        C(27);
        throw null;
    }

    @Override // Pf.AbstractC1153k
    public final List y0() {
        if (this.f14073r0) {
            ArrayList arrayList = this.f14072q0;
            if (arrayList != null) {
                return arrayList;
            }
            C(28);
            throw null;
        }
        throw new IllegalStateException("Type parameter descriptor is not initialized: " + B0());
    }
}
