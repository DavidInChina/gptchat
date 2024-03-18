package Pf;

import Bg.j0;
import Mf.AbstractC0994c;
import Mf.AbstractC1003l;
import Mf.AbstractC1007p;
import Mf.AbstractC1013w;
import Mf.C1008q;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kg.C4294f;

/* loaded from: classes.dex */
public abstract class M extends AbstractC1159q implements Mf.O {

    /* renamed from: j0  reason: collision with root package name */
    public boolean f14016j0;

    /* renamed from: k0  reason: collision with root package name */
    public final boolean f14017k0;

    /* renamed from: l0  reason: collision with root package name */
    public final Mf.A f14018l0;

    /* renamed from: m0  reason: collision with root package name */
    public final Mf.P f14019m0;

    /* renamed from: n0  reason: collision with root package name */
    public final boolean f14020n0;

    /* renamed from: o0  reason: collision with root package name */
    public final int f14021o0;

    /* renamed from: p0  reason: collision with root package name */
    public AbstractC1007p f14022p0;

    /* renamed from: q0  reason: collision with root package name */
    public AbstractC1013w f14023q0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(Mf.A a5, AbstractC1007p abstractC1007p, Mf.P p10, Nf.i iVar, C4294f c4294f, boolean z10, boolean z11, boolean z12, int i10, Mf.V v10) {
        super(p10.mo20k(), iVar, c4294f, v10);
        if (a5 != null) {
            if (abstractC1007p != null) {
                if (iVar != null) {
                    if (v10 != null) {
                        this.f14023q0 = null;
                        this.f14018l0 = a5;
                        this.f14022p0 = abstractC1007p;
                        this.f14019m0 = p10;
                        this.f14016j0 = z10;
                        this.f14017k0 = z11;
                        this.f14020n0 = z12;
                        this.f14021o0 = i10;
                        return;
                    }
                    C(5);
                    throw null;
                }
                C(3);
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
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                str = "@NotNull method %s.%s must not return null";
                break;
            case 7:
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                i11 = 2;
                break;
            case 7:
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "visibility";
                break;
            case 2:
                objArr[0] = "correspondingProperty";
                break;
            case 3:
                objArr[0] = "annotations";
                break;
            case 4:
                objArr[0] = "name";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 7:
                objArr[0] = "substitutor";
                break;
            case 16:
                objArr[0] = "overriddenDescriptors";
                break;
            default:
                objArr[0] = "modality";
                break;
        }
        switch (i10) {
            case 6:
                objArr[1] = "getKind";
                break;
            case 7:
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyAccessorDescriptorImpl";
                break;
            case 8:
                objArr[1] = "substitute";
                break;
            case 9:
                objArr[1] = "getTypeParameters";
                break;
            case 10:
                objArr[1] = "getModality";
                break;
            case 11:
                objArr[1] = "getVisibility";
                break;
            case 12:
                objArr[1] = "getCorrespondingVariable";
                break;
            case 13:
                objArr[1] = "getCorrespondingProperty";
                break;
            case 14:
                objArr[1] = "getContextReceiverParameters";
                break;
            case 15:
                objArr[1] = "getOverriddenDescriptors";
                break;
        }
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                break;
            case 7:
                objArr[2] = "substitute";
                break;
            case 16:
                objArr[2] = "setOverriddenDescriptors";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 6:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                throw new IllegalStateException(format);
            case 7:
            default:
                throw new IllegalArgumentException(format);
        }
    }

    @Override // Mf.AbstractC0993b
    public final boolean B() {
        return false;
    }

    @Override // Mf.AbstractC0994c
    public final AbstractC0994c D(AbstractC1003l abstractC1003l, Mf.A a5, C1008q c1008q) {
        throw new UnsupportedOperationException("Accessors must be copied by the corresponding property");
    }

    @Override // Mf.AbstractC1016z
    public final boolean H() {
        return false;
    }

    @Override // Mf.AbstractC1013w
    public final boolean L() {
        return false;
    }

    @Override // Mf.AbstractC1013w
    public final AbstractC1013w V() {
        return this.f14023q0;
    }

    @Override // Mf.AbstractC0993b
    public final AbstractC1146d W() {
        return w0().W();
    }

    @Override // Mf.AbstractC0993b
    public final AbstractC1146d Z() {
        return w0().Z();
    }

    @Override // Mf.AbstractC1013w, Mf.X
    public final AbstractC1013w c(j0 j0Var) {
        if (j0Var != null) {
            return this;
        }
        C(7);
        throw null;
    }

    @Override // Mf.AbstractC0993b
    public final List d0() {
        List d02 = w0().d0();
        if (d02 != null) {
            return d02;
        }
        C(14);
        throw null;
    }

    @Override // Mf.AbstractC0994c
    public final int e() {
        int i10 = this.f14021o0;
        if (i10 != 0) {
            return i10;
        }
        C(6);
        throw null;
    }

    @Override // Mf.AbstractC1013w
    public final boolean g0() {
        return false;
    }

    @Override // Mf.AbstractC0993b
    public final List getTypeParameters() {
        List emptyList = Collections.emptyList();
        if (emptyList != null) {
            return emptyList;
        }
        C(9);
        throw null;
    }

    @Override // Mf.AbstractC1006o, Mf.AbstractC1016z
    public final AbstractC1007p getVisibility() {
        AbstractC1007p abstractC1007p = this.f14022p0;
        if (abstractC1007p != null) {
            return abstractC1007p;
        }
        C(11);
        throw null;
    }

    @Override // Mf.AbstractC1016z
    public final Mf.A h() {
        Mf.A a5 = this.f14018l0;
        if (a5 != null) {
            return a5;
        }
        C(10);
        throw null;
    }

    @Override // Mf.AbstractC0994c
    public final void h0(Collection collection) {
        if (collection != null) {
            return;
        }
        C(16);
        throw null;
    }

    @Override // Mf.AbstractC1016z
    public final boolean isExternal() {
        return this.f14017k0;
    }

    @Override // Mf.AbstractC1013w
    public final boolean isInfix() {
        return false;
    }

    @Override // Mf.AbstractC1013w
    public final boolean isInline() {
        return this.f14020n0;
    }

    @Override // Mf.AbstractC1013w
    public final boolean isOperator() {
        return false;
    }

    @Override // Mf.AbstractC1013w
    public final boolean isSuspend() {
        return false;
    }

    @Override // Mf.AbstractC1013w
    public final boolean l0() {
        return false;
    }

    @Override // Mf.AbstractC1016z
    public final boolean o0() {
        return false;
    }

    @Override // Mf.AbstractC0993b
    public final Object q0(Wf.e eVar) {
        return null;
    }

    public final Mf.P w0() {
        Mf.P p10 = this.f14019m0;
        if (p10 != null) {
            return p10;
        }
        C(13);
        throw null;
    }

    public final ArrayList x0(boolean z10) {
        Object obj;
        ArrayList arrayList = new ArrayList(0);
        for (Mf.P p10 : w0().m()) {
            if (z10) {
                obj = p10.d();
            } else {
                obj = p10.b();
            }
            if (obj != null) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }
}
