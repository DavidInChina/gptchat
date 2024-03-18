package Pf;

import Bg.j0;
import Bg.p0;
import Gf.C0631e;
import Mf.AbstractC0993b;
import Mf.AbstractC0997f;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.C1008q;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import vg.AbstractC6047a;

/* renamed from: Pf.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC1146d extends AbstractC1158p implements Mf.N {
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
            case 11:
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
            case 11:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 2:
                objArr[0] = "name";
                break;
            case 3:
                objArr[0] = "substitutor";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
            default:
                objArr[0] = "annotations";
                break;
        }
        switch (i10) {
            case 4:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 5:
                objArr[1] = "getTypeParameters";
                break;
            case 6:
                objArr[1] = "getType";
                break;
            case 7:
                objArr[1] = "getValueParameters";
                break;
            case 8:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 9:
                objArr[1] = "getVisibility";
                break;
            case 10:
                objArr[1] = "getOriginal";
                break;
            case 11:
                objArr[1] = "getSource";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/AbstractReceiverParameterDescriptor";
                break;
        }
        switch (i10) {
            case 3:
                objArr[2] = "substitute";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
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
            case 11:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Mf.AbstractC0993b
    public final boolean B() {
        return false;
    }

    @Override // Mf.AbstractC0993b
    public final List S() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        C(7);
        throw null;
    }

    @Override // Mf.AbstractC0993b
    public final AbstractC1146d W() {
        return null;
    }

    @Override // Mf.AbstractC0993b
    public final AbstractC1146d Z() {
        return null;
    }

    @Override // Pf.AbstractC1158p, Mf.AbstractC1003l
    /* renamed from: a */
    public final AbstractC0993b mo24a() {
        return this;
    }

    @Override // Mf.AbstractC1004m
    public final Mf.V g() {
        return Mf.V.f12075a;
    }

    @Override // Mf.AbstractC0993b
    public final Bg.A getReturnType() {
        return getType();
    }

    @Override // Mf.g0
    public final Bg.A getType() {
        Bg.A type = p0().getType();
        if (type != null) {
            return type;
        }
        C(6);
        throw null;
    }

    @Override // Mf.AbstractC0993b
    public final List getTypeParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        C(5);
        throw null;
    }

    @Override // Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        C1008q c1008q = Mf.r.f12106f;
        if (c1008q != null) {
            return c1008q;
        }
        C(9);
        throw null;
    }

    @Override // Mf.AbstractC0993b
    public final Collection m() {
        Set emptySet = Collections.emptySet();
        if (emptySet != null) {
            return emptySet;
        }
        C(8);
        throw null;
    }

    public abstract vg.f p0();

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        switch (c0631e.f6407a) {
            case 0:
                return null;
            default:
                ((StringBuilder) obj).append(getName());
                return jf.y.f36177a;
        }
    }

    /* renamed from: w0 */
    public final AbstractC1146d c(j0 j0Var) {
        Bg.A a5;
        if (j0Var != null) {
            if (j0Var.f2128a.e()) {
                return this;
            }
            if (mo20k() instanceof AbstractC0997f) {
                a5 = j0Var.j(getType(), p0.f2148j0);
            } else {
                a5 = j0Var.j(getType(), p0.f2146h0);
            }
            if (a5 == null) {
                return null;
            }
            if (a5 == getType()) {
                return this;
            }
            return new S(mo20k(), new AbstractC6047a(a5), getAnnotations());
        }
        C(3);
        throw null;
    }

    @Override // Pf.AbstractC1158p, Mf.AbstractC1003l
    /* renamed from: a  reason: collision with other method in class */
    public final AbstractC1003l mo24a() {
        return this;
    }
}
