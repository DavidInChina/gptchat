package Pf;

import Bg.AbstractC0218k;
import Mf.AbstractC1000i;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import ng.C4835b;
import ng.C4836c;
import rg.AbstractC5493d;

/* renamed from: Pf.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1152j extends AbstractC0218k {

    /* renamed from: c  reason: collision with root package name */
    public final Mf.Z f14100c;

    /* renamed from: d  reason: collision with root package name */
    public final /* synthetic */ AbstractC1153k f14101d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1152j(AbstractC1153k abstractC1153k, Ag.u uVar, Mf.Z z10) {
        super(uVar);
        if (uVar != null) {
            this.f14101d = abstractC1153k;
            this.f14100c = z10;
            return;
        }
        p(0);
        throw null;
    }

    public static /* synthetic */ void p(int i10) {
        String str;
        int i11;
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 1 && i10 != 2 && i10 != 3 && i10 != 4 && i10 != 5 && i10 != 8) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                break;
            case 6:
                objArr[0] = "type";
                break;
            case 7:
                objArr[0] = "supertypes";
                break;
            case 9:
                objArr[0] = "classifier";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 4) {
                        if (i10 != 5) {
                            if (i10 != 8) {
                                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractTypeParameterDescriptor$TypeParameterTypeConstructor";
                            } else {
                                objArr[1] = "processSupertypesWithoutCycles";
                            }
                        } else {
                            objArr[1] = "getSupertypeLoopChecker";
                        }
                    } else {
                        objArr[1] = "getBuiltIns";
                    }
                } else {
                    objArr[1] = "getDeclarationDescriptor";
                }
            } else {
                objArr[1] = "getParameters";
            }
        } else {
            objArr[1] = "computeSupertypes";
        }
        switch (i10) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
                break;
            case 6:
                objArr[2] = "reportSupertypeLoopError";
                break;
            case 7:
                objArr[2] = "processSupertypesWithoutCycles";
                break;
            case 9:
                objArr[2] = "isSameClassifier";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i10 == 1 || i10 == 2 || i10 == 3 || i10 == 4 || i10 == 5 || i10 == 8) {
            throw new IllegalStateException(format);
        }
    }

    @Override // Bg.AbstractC0218k
    public final Collection b() {
        List y02 = this.f14101d.y0();
        if (y02 != null) {
            return y02;
        }
        p(1);
        throw null;
    }

    @Override // Bg.AbstractC0218k
    public final Bg.A c() {
        return Dg.m.c(Dg.l.f3692l0, new String[0]);
    }

    @Override // Bg.AbstractC0218k
    public final Mf.Z f() {
        Mf.Z z10 = this.f14100c;
        if (z10 != null) {
            return z10;
        }
        p(5);
        throw null;
    }

    @Override // Bg.Y
    public final List getParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        p(2);
        throw null;
    }

    @Override // Bg.AbstractC0218k
    public final boolean i(AbstractC1000i abstractC1000i) {
        if (abstractC1000i instanceof Mf.b0) {
            AbstractC1153k abstractC1153k = this.f14101d;
            AbstractC3557B.c0("a", abstractC1153k);
            if (C4836c.f40338a.b(abstractC1153k, (Mf.b0) abstractC1000i, true, C4835b.f40337Y)) {
                return true;
            }
        }
        return false;
    }

    @Override // Bg.Y
    public final Jf.l j() {
        Jf.l e10 = AbstractC5493d.e(this.f14101d);
        if (e10 != null) {
            return e10;
        }
        p(4);
        throw null;
    }

    @Override // Bg.Y
    public final AbstractC1000i k() {
        AbstractC1153k abstractC1153k = this.f14101d;
        if (abstractC1153k != null) {
            return abstractC1153k;
        }
        p(3);
        throw null;
    }

    @Override // Bg.Y
    public final boolean m() {
        return true;
    }

    @Override // Bg.AbstractC0218k
    public final List n(List list) {
        List w02 = this.f14101d.w0(list);
        if (w02 != null) {
            return w02;
        }
        p(8);
        throw null;
    }

    @Override // Bg.AbstractC0218k
    public final void o(Bg.A a5) {
        if (a5 != null) {
            this.f14101d.x0(a5);
        } else {
            p(6);
            throw null;
        }
    }

    public final String toString() {
        return this.f14101d.getName().f37507Y;
    }
}
