package Pf;

import Mf.AbstractC1003l;
import Mf.AbstractC1004m;
import kg.C4294f;

/* renamed from: Pf.q  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1159q extends AbstractC1158p implements AbstractC1004m {

    /* renamed from: h0  reason: collision with root package name */
    public final AbstractC1003l f14121h0;

    /* renamed from: i0  reason: collision with root package name */
    public final Mf.V f14122i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractC1159q(AbstractC1003l abstractC1003l, Nf.i iVar, C4294f c4294f, Mf.V v10) {
        super(iVar, c4294f);
        if (abstractC1003l != null) {
            if (iVar != null) {
                if (c4294f != null) {
                    if (v10 != null) {
                        this.f14121h0 = abstractC1003l;
                        this.f14122i0 = v10;
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
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "annotations";
                break;
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "source";
                break;
            case 4:
            case 5:
            case 6:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                if (i10 != 6) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/DeclarationDescriptorNonRootImpl";
                } else {
                    objArr[1] = "getSource";
                }
            } else {
                objArr[1] = "getContainingDeclaration";
            }
        } else {
            objArr[1] = "getOriginal";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5 || i10 == 6) {
            throw new IllegalStateException(format);
        }
    }

    public Mf.V g() {
        Mf.V v10 = this.f14122i0;
        if (v10 != null) {
            return v10;
        }
        C(6);
        throw null;
    }

    /* renamed from: k */
    public AbstractC1003l mo20k() {
        AbstractC1003l abstractC1003l = this.f14121h0;
        if (abstractC1003l != null) {
            return abstractC1003l;
        }
        C(5);
        throw null;
    }

    /* renamed from: p0 */
    public AbstractC1004m mo24a() {
        return this;
    }
}
