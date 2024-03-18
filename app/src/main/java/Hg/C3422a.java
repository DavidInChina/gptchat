package hg;

import Ad.l;
import Ag.u;
import Bg.A;
import Bg.AbstractC0210c;
import Bg.AbstractC0227u;
import Bg.C0224q;
import Bg.L;
import Bg.U;
import Bg.Y;
import Bg.m0;
import Bg.o0;
import Mf.AbstractC1000i;
import Mf.B;
import Mf.a0;
import Mf.b0;
import Pf.AbstractC1149g;
import Pf.Z;
import androidx.datastore.preferences.protobuf.n0;
import com.google.protobuf.AbstractC2515j0;
import com.google.protobuf.AbstractC2518k0;
import fg.C3033a;
import fg.E;
import gg.AbstractC3271b;
import gg.C3270a;
import id.AbstractC3557B;
import ig.EnumC3582h;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import jh.C1;
import jh.D0;
import jh.EnumC3975C;
import jh.EnumC3984a0;
import jh.EnumC3985a1;
import jh.EnumC4008f;
import jh.EnumC4050n1;
import jh.EnumC4058p;
import jh.EnumC4078t0;
import jh.EnumC4104y1;
import jh.W0;
import kf.AbstractC4268D;
import kf.s;
import kf.t;
import kg.C4291c;
import lg.C4461f;
import lg.C4464i;
import lg.p;
import lg.r;
import ug.C5920b;
import ug.m;
import ug.n;
import ug.w;
import xg.q;
import yf.AbstractC6583a;
import yg.C6587d;

/* renamed from: hg.a */
/* loaded from: classes2.dex */
public final class C3422a implements r, Cg.c, AbstractC2518k0 {

    /* renamed from: Y */
    public final /* synthetic */ int f32289Y;

    public /* synthetic */ C3422a(int i10) {
        this.f32289Y = i10;
    }

    public static /* synthetic */ void b(int i10) {
        Object[] objArr = new Object[3];
        if (i10 != 1) {
            objArr[0] = "a";
        } else {
            objArr[0] = "b";
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/resolve/OverridingUtil$1";
        objArr[2] = "equals";
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static /* synthetic */ void c(int i10) {
        Object[] objArr = new Object[3];
        switch (i10) {
            case 1:
            case 4:
                objArr[0] = "b";
                break;
            case 2:
            case 7:
                objArr[0] = "typeCheckingProcedure";
                break;
            case 3:
            default:
                objArr[0] = "a";
                break;
            case 5:
            case 10:
                objArr[0] = "subtype";
                break;
            case 6:
            case 11:
                objArr[0] = "supertype";
                break;
            case 8:
                objArr[0] = "type";
                break;
            case 9:
                objArr[0] = "typeProjection";
                break;
        }
        objArr[1] = "kotlin/reflect/jvm/internal/impl/types/checker/TypeCheckerProcedureCallbacksImpl";
        switch (i10) {
            case 3:
            case 4:
                objArr[2] = "assertEqualTypeConstructors";
                break;
            case 5:
            case 6:
            case 7:
                objArr[2] = "assertSubtype";
                break;
            case 8:
            case 9:
                objArr[2] = "capture";
                break;
            case 10:
            case 11:
                objArr[2] = "noCorrespondingSupertype";
                break;
            default:
                objArr[2] = "assertEqualTypes";
                break;
        }
        throw new IllegalArgumentException(String.format("Argument for @NotNull parameter '%s' of %s.%s must not be null", objArr));
    }

    public static L e(L l10, a0 a0Var, List list) {
        AbstractC3557B.c0("typeAliasDescriptor", a0Var);
        List<b0> parameters = ((AbstractC1149g) a0Var).f14094m0.getParameters();
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(parameters, 10));
        for (b0 b0Var : parameters) {
            arrayList.add(b0Var.mo24a());
        }
        return new L(l10, a0Var, list, AbstractC4268D.k1(t.S2(arrayList, list)));
    }

    public static n f(String str, Collection collection) {
        AbstractC3557B.c0("message", str);
        AbstractC3557B.c0("types", collection);
        Collection<A> collection2 = collection;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(collection2, 10));
        for (A a5 : collection2) {
            arrayList.add(a5.R());
        }
        Ig.f k12 = A7.b.k1(arrayList);
        n i10 = i(str, k12);
        if (k12.f8600Y <= 1) {
            return i10;
        }
        return new w(i10);
    }

    public static n g(String str, List list) {
        AbstractC3557B.c0("debugName", str);
        Ig.f fVar = new Ig.f();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (nVar != m.f46797b) {
                if (nVar instanceof C5920b) {
                    s.O1(fVar, ((C5920b) nVar).f46766c);
                } else {
                    fVar.add(nVar);
                }
            }
        }
        return i(str, fVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x002e, code lost:
        if (r0 <= r2) goto L10;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007b  */
    /* JADX WARN: Type inference failed for: r10v1, types: [xg.q, yg.d] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C6587d h(C4291c c4291c, u uVar, B b10, InputStream inputStream) {
        Object obj;
        AbstractC3557B.c0("fqName", c4291c);
        AbstractC3557B.c0("storageManager", uVar);
        AbstractC3557B.c0("module", b10);
        try {
            C3270a c3270a = C3270a.f31619f;
            C3270a p10 = Cf.k.p(inputStream);
            C3270a c3270a2 = C3270a.f31619f;
            AbstractC3557B.c0("ourVersion", c3270a2);
            int i10 = p10.f32292c;
            int i11 = c3270a2.f32292c;
            int i12 = c3270a2.f32291b;
            int i13 = p10.f32291b;
            Throwable th2 = null;
            if (i13 == 0) {
                if (i12 == 0 && i10 == i11) {
                    C4464i c4464i = new C4464i();
                    AbstractC3271b.a(c4464i);
                    C3033a c3033a = E.f30284p0;
                    c3033a.getClass();
                    C4461f c4461f = new C4461f(inputStream);
                    p b11 = c3033a.b(c4461f, c4464i);
                    try {
                        c4461f.a(0);
                        if (b11.isInitialized()) {
                            obj = (E) b11;
                            if (obj != null) {
                                return new q(c4291c, uVar, b10, obj, p10);
                            }
                            throw new UnsupportedOperationException("Kotlin built-in definition format version is not supported: expected " + c3270a2 + ", actual " + p10 + ". Please update Kotlin");
                        }
                        lg.t tVar = new lg.t(new n0().getMessage());
                        tVar.f38415Y = b11;
                        throw tVar;
                    } catch (lg.t e10) {
                        e10.f38415Y = b11;
                        throw e10;
                    }
                }
                obj = th2;
                if (obj != null) {
                }
            } else {
                if (i13 == i12) {
                }
                obj = th2;
                if (obj != null) {
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } finally {
                l.S(inputStream, th3);
            }
        }
    }

    public static n i(String str, Ig.f fVar) {
        AbstractC3557B.c0("debugName", str);
        int i10 = fVar.f8600Y;
        if (i10 != 0) {
            if (i10 != 1) {
                return new C5920b(str, (n[]) fVar.toArray(new n[0]));
            }
            return (n) fVar.get(0);
        }
        return m.f46797b;
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0067, code lost:
        if (r0 != false) goto L22;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static C0224q j(o0 o0Var, boolean z10) {
        Z z11;
        boolean z12;
        int i10 = C0224q.f2152i0;
        AbstractC3557B.c0("type", o0Var);
        if (o0Var instanceof C0224q) {
            return (C0224q) o0Var;
        }
        o0Var.y0();
        if ((o0Var.y0().k() instanceof b0) || (o0Var instanceof Cg.k)) {
            AbstractC1000i k10 = o0Var.y0().k();
            if (k10 instanceof Z) {
                z11 = (Z) k10;
            } else {
                z11 = null;
            }
            if (z11 == null || z11.f14073r0) {
                if (z10 && (o0Var.y0().k() instanceof b0)) {
                    z12 = m0.f(o0Var);
                } else {
                    z12 = !AbstractC0210c.a(AbstractC3557B.q0(false, true, Cg.p.f3146a, null, null, 24), l.Q0(o0Var), U.f2088a);
                }
            }
            if (o0Var instanceof AbstractC0227u) {
                AbstractC0227u abstractC0227u = (AbstractC0227u) o0Var;
                AbstractC3557B.K(abstractC0227u.f2158Z.y0(), abstractC0227u.f2159h0.y0());
            }
            return new C0224q(l.Q0(o0Var).C0(false), z10);
        }
        return null;
    }

    public static mg.m k(wf.k kVar) {
        mg.s sVar = new mg.s();
        kVar.invoke(sVar);
        sVar.f39342a = true;
        return new mg.m(sVar);
    }

    @Override // lg.r
    /* renamed from: a */
    public final AbstractC2515j0 mo76a(int i10) {
        switch (this.f32289Y) {
            case 18:
                if (i10 == 0) {
                    return EnumC4008f.JS_UNKNOWN;
                }
                if (i10 == 1) {
                    return EnumC4008f.JS_SUCCESS;
                }
                if (i10 == 2) {
                    return EnumC4008f.JS_FAILED;
                }
                return null;
            case 19:
                if (i10 == 0) {
                    return EnumC4058p.WS_AVAILABLE;
                }
                if (i10 == 1) {
                    return EnumC4058p.WS_FULL;
                }
                return null;
            case 20:
                if (i10 == 0) {
                    return EnumC3975C.UPSTREAM;
                }
                if (i10 == 1) {
                    return EnumC3975C.DOWNSTREAM;
                }
                return null;
            case 21:
                if (i10 == 0) {
                    return jh.U.DEFAULT_FILETYPE;
                }
                if (i10 == 1) {
                    return jh.U.MP4;
                }
                if (i10 == 2) {
                    return jh.U.OGG;
                }
                return null;
            case 22:
                if (i10 == 0) {
                    return EnumC3984a0.IMAGE_SUFFIX_INDEX;
                }
                if (i10 == 1) {
                    return EnumC3984a0.IMAGE_SUFFIX_TIMESTAMP;
                }
                return null;
            case 23:
                if (i10 == 0) {
                    return EnumC4078t0.INDEX;
                }
                if (i10 == 1) {
                    return EnumC4078t0.TIMESTAMP;
                }
                return null;
            case 24:
                if (i10 == 0) {
                    return D0.DEFAULT_PROTOCOL;
                }
                if (i10 == 1) {
                    return D0.RTMP;
                }
                return null;
            case 25:
                return W0.b(i10);
            case 26:
                return EnumC3985a1.b(i10);
            case 27:
                if (i10 == 0) {
                    return EnumC4050n1.STARTING_UP;
                }
                if (i10 == 1) {
                    return EnumC4050n1.SERVING;
                }
                if (i10 == 2) {
                    return EnumC4050n1.SHUTTING_DOWN;
                }
                return null;
            case 28:
                return EnumC4104y1.b(i10);
            default:
                return C1.b(i10);
        }
    }

    @Override // Cg.c
    public final boolean d(Y y10, Y y11) {
        if (y10 != null) {
            if (y11 != null) {
                return y10.equals(y11);
            }
            b(1);
            throw null;
        }
        b(0);
        throw null;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C3422a(int i10, int i11) {
        this(0);
        this.f32289Y = i10;
        switch (i10) {
            case 2:
                this(2);
                return;
            case 3:
                this(3);
                return;
            case 4:
            case 13:
            default:
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
            case 14:
                this(14);
                return;
            case 15:
                this(15);
                return;
            case 16:
                this(16);
                return;
            case 17:
                this(17);
                return;
        }
    }

    @Override // lg.r
    /* renamed from: a */
    public final lg.q mo76a(int i10) {
        if (i10 != 0) {
            if (i10 == 1) {
                return EnumC3582h.INTERNAL_TO_CLASS_ID;
            }
            if (i10 == 2) {
                return EnumC3582h.DESC_TO_CLASS_ID;
            }
            return null;
        }
        return EnumC3582h.NONE;
    }
}
