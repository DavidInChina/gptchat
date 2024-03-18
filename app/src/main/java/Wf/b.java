package Wf;

import Bg.A;
import Mf.AbstractC0992a;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.V;
import Nf.i;
import Pf.AbstractC1165x;
import Pf.C1154l;
import Pf.S;
import id.AbstractC3557B;
import java.util.ArrayList;
import jf.C3959i;
import kf.v;
import kg.C4294f;

/* loaded from: classes2.dex */
public final class b extends C1154l implements a {

    /* renamed from: K0  reason: collision with root package name */
    public Boolean f21080K0;

    /* renamed from: L0  reason: collision with root package name */
    public Boolean f21081L0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(AbstractC0997f abstractC0997f, b bVar, i iVar, boolean z10, int i10, V v10) {
        super(abstractC0997f, bVar, iVar, z10, i10, v10);
        if (abstractC0997f != null) {
            if (iVar != null) {
                if (i10 != 0) {
                    if (v10 != null) {
                        this.f21080K0 = null;
                        this.f21081L0 = null;
                        return;
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
        if (i10 != 11 && i10 != 18) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 11 && i10 != 18) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 5:
            case 9:
            case 15:
                objArr[0] = "annotations";
                break;
            case 2:
            case 8:
            case 13:
                objArr[0] = "kind";
                break;
            case 3:
            case 6:
            case 10:
                objArr[0] = "source";
                break;
            case 4:
            default:
                objArr[0] = "containingDeclaration";
                break;
            case 7:
            case 12:
                objArr[0] = "newOwner";
                break;
            case 11:
            case 18:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
                break;
            case 14:
                objArr[0] = "sourceElement";
                break;
            case 16:
                objArr[0] = "enhancedValueParameterTypes";
                break;
            case 17:
                objArr[0] = "enhancedReturnType";
                break;
        }
        if (i10 != 11) {
            if (i10 != 18) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/descriptors/JavaClassConstructorDescriptor";
            } else {
                objArr[1] = "enhance";
            }
        } else {
            objArr[1] = "createSubstitutedCopy";
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
                objArr[2] = "createJavaConstructor";
                break;
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[2] = "createSubstitutedCopy";
                break;
            case 11:
            case 18:
                break;
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[2] = "createDescriptor";
                break;
            case 16:
            case 17:
                objArr[2] = "enhance";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 11 || i10 == 18) {
            throw new IllegalStateException(format);
        }
    }

    public static b N0(AbstractC0997f abstractC0997f, i iVar, boolean z10, Rf.h hVar) {
        if (abstractC0997f != null) {
            return new b(abstractC0997f, null, iVar, z10, 1, hVar);
        }
        C(4);
        throw null;
    }

    @Override // Pf.AbstractC1165x, Mf.AbstractC0993b
    public final boolean B() {
        return this.f21081L0.booleanValue();
    }

    @Override // Pf.AbstractC1165x
    public final void E0(boolean z10) {
        this.f21080K0 = Boolean.valueOf(z10);
    }

    @Override // Pf.AbstractC1165x
    public final void F0(boolean z10) {
        this.f21081L0 = Boolean.valueOf(z10);
    }

    @Override // Wf.a
    public final a G(A a5, ArrayList arrayList, A a10, C3959i c3959i) {
        S h02;
        AbstractC0997f mo20k = mo20k();
        b O02 = O0(e(), mo20k, null, g(), getAnnotations());
        if (a5 == null) {
            h02 = null;
        } else {
            h02 = R4.b.h0(O02, a5, Nf.h.f12822a);
        }
        O02.B0(h02, this.f14174o0, v.f37483Y, getTypeParameters(), AbstractC3557B.p0(arrayList, S(), O02), a10, h(), getVisibility());
        if (c3959i != null) {
            O02.D0((AbstractC0992a) c3959i.f36155Y, c3959i.f36156Z);
        }
        return O02;
    }

    @Override // Pf.C1154l
    public final /* bridge */ /* synthetic */ C1154l H0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, V v10, i iVar, C4294f c4294f) {
        return O0(i10, abstractC1003l, abstractC1013w, v10, iVar);
    }

    public final b O0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, V v10, i iVar) {
        if (abstractC1003l != null) {
            if (i10 != 0) {
                if (iVar != null) {
                    if (v10 != null) {
                        if (i10 != 1 && i10 != 4) {
                            throw new IllegalStateException("Attempt at creating a constructor that is not a declaration: \ncopy from: " + this + "\nnewOwner: " + abstractC1003l + "\nkind: " + E9.f.S(i10));
                        }
                        AbstractC0997f abstractC0997f = (AbstractC0997f) abstractC1003l;
                        b bVar = (b) abstractC1013w;
                        if (i10 != 0) {
                            b bVar2 = new b(abstractC0997f, bVar, iVar, this.f14108J0, i10, v10);
                            Boolean bool = this.f21080K0;
                            bool.getClass();
                            bVar2.f21080K0 = bool;
                            Boolean bool2 = this.f21081L0;
                            bool2.getClass();
                            bVar2.f21081L0 = bool2;
                            return bVar2;
                        }
                        C(13);
                        throw null;
                    }
                    C(10);
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

    @Override // Pf.C1154l, Pf.AbstractC1165x
    public final /* bridge */ /* synthetic */ AbstractC1165x y0(int i10, AbstractC1003l abstractC1003l, AbstractC1013w abstractC1013w, V v10, i iVar, C4294f c4294f) {
        return O0(i10, abstractC1003l, abstractC1013w, v10, iVar);
    }
}
