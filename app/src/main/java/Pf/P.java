package Pf;

import Gf.C0631e;
import Mf.AbstractC1007p;
import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kg.C4294f;

/* loaded from: classes.dex */
public final class P extends M implements Mf.Q {

    /* renamed from: r0  reason: collision with root package name */
    public Bg.A f14057r0;

    /* renamed from: s0  reason: collision with root package name */
    public final Mf.Q f14058s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public P(Mf.P p10, Nf.i iVar, Mf.A a5, AbstractC1007p abstractC1007p, boolean z10, boolean z11, boolean z12, int i10, Mf.Q q10, Mf.V v10) {
        super(a5, abstractC1007p, p10, iVar, C4294f.g("<get-" + p10.getName() + Separators.GREATER_THAN), z10, z11, z12, i10, v10);
        P p11;
        P p12;
        if (iVar != null) {
            if (a5 != null) {
                if (abstractC1007p != null) {
                    if (i10 != 0) {
                        if (v10 != null) {
                            if (q10 != 0) {
                                p11 = this;
                                p12 = q10;
                            } else {
                                p12 = this;
                                p11 = p12;
                            }
                            p11.f14058s0 = p12;
                            return;
                        }
                        C(5);
                        throw null;
                    }
                    C(4);
                    throw null;
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

    public static /* synthetic */ void C(int i10) {
        String str;
        int i11;
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
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
                objArr[0] = "modality";
                break;
            case 3:
                objArr[0] = "visibility";
                break;
            case 4:
                objArr[0] = "kind";
                break;
            case 5:
                objArr[0] = "source";
                break;
            case 6:
            case 7:
            case 8:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        if (i10 != 6) {
            if (i10 != 7) {
                if (i10 != 8) {
                    objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertyGetterDescriptorImpl";
                } else {
                    objArr[1] = "getOriginal";
                }
            } else {
                objArr[1] = "getValueParameters";
            }
        } else {
            objArr[1] = "getOverriddenDescriptors";
        }
        if (i10 != 6 && i10 != 7 && i10 != 8) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 6 || i10 == 7 || i10 == 8) {
            throw new IllegalStateException(format);
        }
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
    public final Bg.A getReturnType() {
        return this.f14057r0;
    }

    @Override // Mf.AbstractC0994c, Mf.AbstractC0993b
    public final Collection m() {
        return x0(true);
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        switch (c0631e.f6407a) {
            case 0:
                return c0631e.c(this, obj);
            default:
                c0631e.e(this, (StringBuilder) obj, "getter");
                return jf.y.f36177a;
        }
    }

    /* renamed from: y0 */
    public final Mf.Q p0() {
        Mf.Q q10 = this.f14058s0;
        if (q10 != null) {
            return q10;
        }
        C(8);
        throw null;
    }

    public final void z0(Bg.A a5) {
        if (a5 == null) {
            a5 = w0().getType();
        }
        this.f14057r0 = a5;
    }
}
