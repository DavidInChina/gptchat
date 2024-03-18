package Pf;

import Gf.C0631e;
import Mf.AbstractC1007p;
import Mf.h0;
import android.gov.nist.core.Separators;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import kg.AbstractC4296h;
import kg.C4294f;
import rg.AbstractC5493d;

/* loaded from: classes.dex */
public final class Q extends M implements Mf.S {

    /* renamed from: r0 */
    public h0 f14059r0;

    /* renamed from: s0 */
    public final Mf.S f14060s0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Q(Mf.P p10, Nf.i iVar, Mf.A a5, AbstractC1007p abstractC1007p, boolean z10, boolean z11, boolean z12, int i10, Mf.S s10, Mf.V v10) {
        super(a5, abstractC1007p, p10, iVar, C4294f.g("<set-" + p10.getName() + Separators.GREATER_THAN), z10, z11, z12, i10, v10);
        Q q10;
        Q q11;
        if (iVar != null) {
            if (a5 != null) {
                if (abstractC1007p != null) {
                    if (i10 != 0) {
                        if (v10 != null) {
                            if (s10 != 0) {
                                q10 = this;
                                q11 = s10;
                            } else {
                                q11 = this;
                                q10 = q11;
                            }
                            q10.f14060s0 = q11;
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
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                str = "@NotNull method %s.%s must not return null";
                break;
            default:
                str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
                break;
        }
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                i11 = 2;
                break;
            default:
                i11 = 3;
                break;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 9:
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
                objArr[0] = "parameter";
                break;
            case 7:
                objArr[0] = "setterDescriptor";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
            default:
                objArr[0] = "correspondingProperty";
                break;
        }
        switch (i10) {
            case 10:
                objArr[1] = "getOverriddenDescriptors";
                break;
            case 11:
                objArr[1] = "getValueParameters";
                break;
            case 12:
                objArr[1] = "getReturnType";
                break;
            case 13:
                objArr[1] = "getOriginal";
                break;
            default:
                objArr[1] = "kotlin/reflect/jvm/internal/impl/descriptors/impl/PropertySetterDescriptorImpl";
                break;
        }
        switch (i10) {
            case 6:
                objArr[2] = "initialize";
                break;
            case 7:
            case 8:
            case 9:
                objArr[2] = "createSetterParameter";
                break;
            case 10:
            case 11:
            case 12:
            case 13:
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        switch (i10) {
            case 10:
            case 11:
            case 12:
            case 13:
                throw new IllegalStateException(format);
            default:
                throw new IllegalArgumentException(format);
        }
    }

    public static b0 y0(Q q10, Bg.A a5, Nf.i iVar) {
        if (a5 != null) {
            if (iVar != null) {
                return new b0(q10, null, 0, iVar, AbstractC4296h.f37517g, a5, false, false, false, null, Mf.V.f12075a);
            }
            C(9);
            throw null;
        }
        C(8);
        throw null;
    }

    @Override // Mf.AbstractC0993b
    public final List S() {
        h0 h0Var = this.f14059r0;
        if (h0Var != null) {
            List singletonList = Collections.singletonList(h0Var);
            if (singletonList != null) {
                return singletonList;
            }
            C(11);
            throw null;
        }
        throw new IllegalStateException();
    }

    @Override // Mf.AbstractC0993b
    public final Bg.A getReturnType() {
        Bg.D w10 = AbstractC5493d.e(this).w();
        if (w10 != null) {
            return w10;
        }
        C(12);
        throw null;
    }

    @Override // Mf.AbstractC0994c, Mf.AbstractC0993b
    public final Collection m() {
        return x0(false);
    }

    @Override // Mf.AbstractC1003l
    public final Object u0(C0631e c0631e, Object obj) {
        switch (c0631e.f6407a) {
            case 0:
                return c0631e.c(this, obj);
            default:
                c0631e.e(this, (StringBuilder) obj, "setter");
                return jf.y.f36177a;
        }
    }

    /* renamed from: z0 */
    public final Mf.S p0() {
        Mf.S s10 = this.f14060s0;
        if (s10 != null) {
            return s10;
        }
        C(13);
        throw null;
    }
}
