package Pf;

import Mf.AbstractC1003l;
import Mf.i0;
import java.util.Collections;
import java.util.List;
import kg.C4294f;

/* loaded from: classes.dex */
public abstract class c0 extends AbstractC1159q implements i0 {

    /* renamed from: j0  reason: collision with root package name */
    public Bg.A f14087j0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(AbstractC1003l abstractC1003l, Nf.i iVar, C4294f c4294f, Bg.A a5, Mf.V v10) {
        super(abstractC1003l, iVar, c4294f, v10);
        if (abstractC1003l != null) {
            if (iVar != null) {
                if (c4294f != null) {
                    if (v10 != null) {
                        this.f14087j0 = a5;
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
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
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
            case 7:
            case 8:
            case 9:
            case 10:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
            default:
                objArr[0] = "containingDeclaration";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getType";
                break;
            case 5:
                objArr[1] = "getOriginal";
                break;
            case 6:
                objArr[1] = "getValueParameters";
                break;
            case 7:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 8:
                objArr[1] = "getTypeParameters";
                break;
            case 9:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 10:
                objArr[1] = "getReturnType";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/VariableDescriptorImpl";
                break;
        }
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Mf.AbstractC0993b
    public boolean B() {
        return false;
    }

    @Override // Mf.AbstractC0993b
    public final List S() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        C(6);
        throw null;
    }

    public AbstractC1146d W() {
        return null;
    }

    public AbstractC1146d Z() {
        return null;
    }

    public Bg.A getReturnType() {
        Bg.A type = getType();
        if (type != null) {
            return type;
        }
        C(10);
        throw null;
    }

    @Override // Mf.g0
    public final Bg.A getType() {
        Bg.A a5 = this.f14087j0;
        if (a5 != null) {
            return a5;
        }
        C(4);
        throw null;
    }

    public List getTypeParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        C(8);
        throw null;
    }
}
