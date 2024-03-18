package v7;

import java.util.Collection;
import q.RunnableC5216j;
import t7.C5680b;
import w7.AbstractC6130b;
import w7.AbstractC6134f;

/* loaded from: classes2.dex */
public final class u implements AbstractC6130b {

    /* renamed from: Z  reason: collision with root package name */
    public final Object f47344Z;

    /* renamed from: h0  reason: collision with root package name */
    public final Object f47345h0;

    /* renamed from: k0  reason: collision with root package name */
    public final Object f47348k0;

    /* renamed from: i0  reason: collision with root package name */
    public Object f47346i0 = null;

    /* renamed from: j0  reason: collision with root package name */
    public Collection f47347j0 = null;

    /* renamed from: Y  reason: collision with root package name */
    public boolean f47343Y = false;

    public u(C5987e c5987e, AbstractC6134f abstractC6134f, C5983a c5983a) {
        this.f47348k0 = c5987e;
        this.f47344Z = abstractC6134f;
        this.f47345h0 = c5983a;
    }

    public static /* synthetic */ void a(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
                objArr[0] = "valueParameters";
                break;
            case 2:
                objArr[0] = "typeParameters";
                break;
            case 3:
                objArr[0] = "signatureErrors";
                break;
            case 4:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                break;
            default:
                objArr[0] = "returnType";
                break;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                if (i10 != 6) {
                    if (i10 != 7) {
                        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/SignaturePropagator$PropagatedSignature";
                    } else {
                        objArr[1] = "getErrors";
                    }
                } else {
                    objArr[1] = "getTypeParameters";
                }
            } else {
                objArr[1] = "getValueParameters";
            }
        } else {
            objArr[1] = "getReturnType";
        }
        if (i10 != 4 && i10 != 5 && i10 != 6 && i10 != 7) {
            objArr[2] = "<init>";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5 || i10 == 6 || i10 == 7) {
            throw new IllegalStateException(format);
        }
    }

    public final void b(C5680b c5680b) {
        s sVar = (s) ((C5987e) this.f47348k0).f47310o0.get((C5983a) this.f47345h0);
        if (sVar != null) {
            sVar.o(c5680b);
        }
    }

    @Override // w7.AbstractC6130b
    public final void n(C5680b c5680b) {
        ((C5987e) this.f47348k0).f47313r0.post(new RunnableC5216j(this, 21, c5680b));
    }
}
