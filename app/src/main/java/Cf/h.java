package Cf;

import Df.A;
import Df.w;
import Df.z;
import G0.c0;
import L2.p;
import L2.s;
import Sf.B;
import Sf.D;
import Sf.G;
import fg.EnumC3030A;
import fg.EnumC3035c;
import fg.EnumC3048p;
import fg.EnumC3053v;
import fg.N;
import fg.b0;
import fg.f0;
import id.AbstractC3557B;
import java.lang.reflect.GenericArrayType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import lg.q;
import lg.r;
import qe.AbstractC5314f;
import x8.W;

/* loaded from: classes.dex */
public final class h implements Vf.j, r, c0, s, AbstractC5314f {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f3114Y;

    public /* synthetic */ h(int i10) {
        this.f3114Y = i10;
    }

    public static /* synthetic */ void e(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
                objArr[0] = "member";
                break;
            case 2:
            case 4:
            case 6:
            case 8:
                objArr[0] = "descriptor";
                break;
            case 3:
                objArr[0] = "element";
                break;
            case 5:
                objArr[0] = "field";
                break;
            case 7:
                objArr[0] = "javaClass";
                break;
            default:
                objArr[0] = "fqName";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/load/java/components/JavaResolverCache$1";
        switch (i10) {
            case 1:
            case 2:
                objArr[2] = "recordMethod";
                break;
            case 3:
            case 4:
                objArr[2] = "recordConstructor";
                break;
            case 5:
            case 6:
                objArr[2] = "recordField";
                break;
            case 7:
            case 8:
                objArr[2] = "recordClass";
                break;
            default:
                objArr[2] = "getClassResolvedFromSource";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static D g(Type type) {
        D iVar;
        AbstractC3557B.c0("type", type);
        boolean z10 = type instanceof Class;
        if (z10) {
            Class cls = (Class) type;
            if (cls.isPrimitive()) {
                return new B(cls);
            }
        }
        if (!(type instanceof GenericArrayType) && (!z10 || !((Class) type).isArray())) {
            if (type instanceof WildcardType) {
                iVar = new G((WildcardType) type);
            } else {
                iVar = new Sf.s(type);
            }
        } else {
            iVar = new Sf.i(type);
        }
        return iVar;
    }

    public static z h(w wVar) {
        AbstractC3557B.c0("type", wVar);
        return new z(A.f3618Y, wVar);
    }

    @Override // lg.r
    /* renamed from: a */
    public q mo76a(int i10) {
        switch (this.f3114Y) {
            case 23:
                return EnumC3035c.b(i10);
            case 24:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return EnumC3048p.RETURNS_NOT_NULL;
                    }
                    return EnumC3048p.CALLS;
                }
                return EnumC3048p.RETURNS_CONSTANT;
            case 25:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return EnumC3053v.NULL;
                    }
                    return EnumC3053v.FALSE;
                }
                return EnumC3053v.TRUE;
            case 26:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return null;
                            }
                            return EnumC3030A.SEALED;
                        }
                        return EnumC3030A.ABSTRACT;
                    }
                    return EnumC3030A.OPEN;
                }
                return EnumC3030A.FINAL;
            case 27:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                return null;
                            }
                            return N.STAR;
                        }
                        return N.INV;
                    }
                    return N.OUT;
                }
                return N.IN;
            case 28:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            return null;
                        }
                        return b0.HIDDEN;
                    }
                    return b0.ERROR;
                }
                return b0.WARNING;
            default:
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        return null;
                                    }
                                    return f0.LOCAL;
                                }
                                return f0.PRIVATE_TO_THIS;
                            }
                            return f0.PUBLIC;
                        }
                        return f0.PROTECTED;
                    }
                    return f0.PRIVATE;
                }
                return f0.INTERNAL;
        }
    }

    @Override // L2.s
    public void b(L2.B b10) {
        switch (this.f3114Y) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // qe.AbstractC5314f
    public void c(String str) {
        switch (this.f3114Y) {
            case 0:
                AbstractC3557B.c0("message", str);
                W.F(Pc.e.a(), str, null, 6);
                return;
            default:
                AbstractC3557B.c0("message", str);
                W.F(Pc.e.a(), str, null, 6);
                return;
        }
    }

    @Override // L2.s
    public void d() {
        switch (this.f3114Y) {
            case 0:
                return;
            default:
                throw new UnsupportedOperationException();
        }
    }

    @Override // L2.s
    public L2.G f(int i10, int i11) {
        switch (this.f3114Y) {
            case 0:
                return new p();
            default:
                throw new UnsupportedOperationException();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10, int i11) {
        this(0);
        this.f3114Y = i10;
        switch (i10) {
            case 1:
                this(1);
                return;
            case 2:
                this(2);
                return;
            case 3:
            case 17:
            default:
                return;
            case 4:
                this(4);
                return;
            case 5:
                this(5);
                return;
            case 6:
                this(6);
                return;
            case 7:
                this(7);
                return;
            case 8:
                this(8);
                return;
            case 9:
                this(9);
                return;
            case 10:
                this(10);
                return;
            case 11:
                this(11);
                return;
            case 12:
                this(12);
                return;
            case 13:
                this(13);
                return;
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 18:
                this(18);
                return;
            case 19:
                this(19);
                return;
            case 20:
                this(20);
                return;
            case 21:
                this(21);
                return;
            case 22:
                this(22);
                return;
        }
    }
}
