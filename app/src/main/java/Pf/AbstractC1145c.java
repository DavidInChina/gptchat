package Pf;

import Bg.p0;
import Mf.AbstractC1003l;
import android.gov.nist.core.Separators;
import kg.C4294f;

/* renamed from: Pf.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1145c extends AbstractC1153k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1145c(Ag.u uVar, AbstractC1003l abstractC1003l, Nf.i iVar, C4294f c4294f, p0 p0Var, boolean z10, int i10, Mf.Z z11) {
        super(uVar, abstractC1003l, iVar, c4294f, p0Var, z10, i10, z11);
        if (uVar != null) {
            if (abstractC1003l != null) {
                if (z11 != null) {
                    return;
                } else {
                    C(6);
                    throw null;
                }
            }
            C(1);
            throw null;
        }
        C(0);
        throw null;
    }

    public static /* synthetic */ void C(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "containingDeclaration";
                break;
            case 2:
                objArr[0] = "annotations";
                break;
            case 3:
                objArr[0] = "name";
                break;
            case 4:
                objArr[0] = "variance";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
                objArr[0] = "supertypeLoopChecker";
                break;
            default:
                objArr[0] = "storageManager";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractLazyTypeParameterDescriptor";
        objArr[2] = "<init>";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    @Override // Pf.AbstractC1158p
    public final String toString() {
        String str;
        String str2 = "";
        if (this.f14103k0) {
            str = "reified ";
        } else {
            str = str2;
        }
        if (J() != p0.f2146h0) {
            str2 = J() + Separators.SP;
        }
        return str + str2 + getName();
    }
}
