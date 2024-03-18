package Bg;

import id.AbstractC3557B;
import jf.AbstractC3957g;
import jf.EnumC3958h;

/* loaded from: classes2.dex */
public final class I extends e0 {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f2072a;

    /* renamed from: b  reason: collision with root package name */
    public final Object f2073b;

    /* renamed from: c  reason: collision with root package name */
    public final Object f2074c;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public I(A a5) {
        this(a5, p0.f2146h0);
        this.f2072a = 1;
        if (a5 != null) {
        } else {
            d(2);
            throw null;
        }
    }

    public static /* synthetic */ void d(int i10) {
        String str;
        int i11;
        if (i10 != 4 && i10 != 5) {
            str = "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        } else {
            str = "@NotNull method %s.%s must not return null";
        }
        if (i10 != 4 && i10 != 5) {
            i11 = 3;
        } else {
            i11 = 2;
        }
        Object[] objArr = new Object[i11];
        switch (i10) {
            case 1:
            case 2:
            case 3:
                objArr[0] = "type";
                break;
            case 4:
            case 5:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
                break;
            case 6:
                objArr[0] = "kotlinTypeRefiner";
                break;
            default:
                objArr[0] = "projection";
                break;
        }
        if (i10 != 4) {
            if (i10 != 5) {
                objArr[1] = "kotlin/reflect/jvm/internal/impl/types/TypeProjectionImpl";
            } else {
                objArr[1] = "getType";
            }
        } else {
            objArr[1] = "getProjectionKind";
        }
        if (i10 != 3) {
            if (i10 != 4 && i10 != 5) {
                if (i10 != 6) {
                    objArr[2] = "<init>";
                } else {
                    objArr[2] = "refine";
                }
            }
        } else {
            objArr[2] = "replaceType";
        }
        String format = String.format(str, objArr);
        if (i10 == 4 || i10 == 5) {
            throw new IllegalStateException(format);
        }
    }

    @Override // Bg.d0
    public final d0 a(Cg.i iVar) {
        switch (this.f2072a) {
            case 0:
                AbstractC3557B.c0("kotlinTypeRefiner", iVar);
                return this;
            default:
                if (iVar != null) {
                    A a5 = (A) this.f2074c;
                    AbstractC3557B.c0("type", a5);
                    return new I(a5, (p0) this.f2073b);
                }
                d(6);
                throw null;
        }
    }

    @Override // Bg.d0
    public final p0 b() {
        switch (this.f2072a) {
            case 0:
                return p0.f2148j0;
            default:
                p0 p0Var = (p0) this.f2073b;
                if (p0Var != null) {
                    return p0Var;
                }
                d(4);
                throw null;
        }
    }

    @Override // Bg.d0
    public final boolean c() {
        switch (this.f2072a) {
            case 0:
                return true;
            default:
                return false;
        }
    }

    @Override // Bg.d0
    public final A getType() {
        int i10 = this.f2072a;
        Object obj = this.f2074c;
        switch (i10) {
            case 0:
                return (A) ((AbstractC3957g) obj).getValue();
            default:
                A a5 = (A) obj;
                if (a5 != null) {
                    return a5;
                }
                d(5);
                throw null;
        }
    }

    public I(A a5, p0 p0Var) {
        this.f2072a = 1;
        if (p0Var == null) {
            d(0);
            throw null;
        } else if (a5 != null) {
            this.f2073b = p0Var;
            this.f2074c = a5;
        } else {
            d(1);
            throw null;
        }
    }

    public I(Mf.b0 b0Var) {
        this.f2072a = 0;
        AbstractC3557B.c0("typeParameter", b0Var);
        this.f2073b = b0Var;
        this.f2074c = R4.b.C1(EnumC3958h.f36152Y, new Uf.A(15, this));
    }
}
