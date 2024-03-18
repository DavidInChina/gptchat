package Pf;

import Mf.AbstractC1003l;
import android.gov.nist.core.Separators;
import kg.C4294f;

/* renamed from: Pf.p  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1158p extends Nf.b implements AbstractC1003l {

    /* renamed from: Z  reason: collision with root package name */
    public final C4294f f14120Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1158p(Nf.i iVar, C4294f c4294f) {
        super(iVar);
        if (iVar != null) {
            if (c4294f != null) {
                this.f14120Z = c4294f;
                return;
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
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 2 && i10 != 3 && i10 != 5 && i10 != 6) {
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
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                break;
            case 4:
                objArr[0] = "descriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        if (i10 != 2) {
            if (i10 != 3) {
                if (i10 != 5 && i10 != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorImpl";
                } else {
                    objArr[1] = "toString";
                }
            } else {
                objArr[1] = "getOriginal";
            }
        } else {
            objArr[1] = "getName";
        }
        if (i10 != 2 && i10 != 3) {
            if (i10 != 4) {
                if (i10 != 5 && i10 != 6) {
                    objArr[2] = "<init>";
                }
            } else {
                objArr[2] = "toString";
            }
        }
        String format = String.format(str, objArr);
        if (i10 == 2 || i10 == 3 || i10 == 5 || i10 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public static String k0(AbstractC1003l abstractC1003l) {
        if (abstractC1003l != null) {
            try {
                String str = mg.m.f39298e.v(abstractC1003l) + "[" + abstractC1003l.getClass().getSimpleName() + Separators.AT + Integer.toHexString(System.identityHashCode(abstractC1003l)) + "]";
                if (str != null) {
                    return str;
                }
                C(5);
                throw null;
            } catch (Throwable unused) {
                String str2 = abstractC1003l.getClass().getSimpleName() + Separators.SP + abstractC1003l.getName();
                if (str2 != null) {
                    return str2;
                }
                C(6);
                throw null;
            }
        }
        C(4);
        throw null;
    }

    @Override // Mf.AbstractC1003l
    public final C4294f getName() {
        C4294f c4294f = this.f14120Z;
        if (c4294f != null) {
            return c4294f;
        }
        C(2);
        throw null;
    }

    public String toString() {
        return k0(this);
    }

    /* renamed from: a */
    public AbstractC1003l mo24a() {
        return this;
    }
}
