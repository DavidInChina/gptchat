package S4;

import Bg.A;
import Bg.AbstractC0227u;
import Bg.C0213f;
import Bg.D;
import Bg.Q;
import Bg.Y;
import Bg.d0;
import Bg.m0;
import Bg.o0;
import D1.I;
import D1.Z;
import Df.v;
import E1.B;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.b0;
import Rh.AbstractC1337y0;
import Rh.G;
import Yf.C1697i;
import android.gov.nist.core.Separators;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.View;
import cg.AbstractC2428s;
import cg.AbstractC2429t;
import cg.C2412c;
import cg.C2414e;
import cg.EnumC2413d;
import cg.EnumC2415f;
import cg.EnumC2426q;
import com.google.android.gms.auth.api.signin.internal.SignInHubActivity;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.protobuf.AbstractC2504f1;
import com.google.protobuf.AbstractC2534q;
import com.google.protobuf.AbstractC2536r0;
import com.google.protobuf.AbstractC2549y;
import com.google.protobuf.M0;
import id.AbstractC3557B;
import io.sentry.protocol.r;
import io.sentry.protocol.x;
import io.sentry.s1;
import java.io.BufferedWriter;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.Socket;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collection;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kg.C4291c;
import kg.C4293e;
import m.C4528h;
import ng.AbstractC4838e;
import o8.t;
import r9.y;
import rg.AbstractC5493d;
import u8.AbstractC5856f;
import u8.AbstractC5857g;
import yf.AbstractC6583a;

/* loaded from: classes2.dex */
public final class o implements B, AbstractC5856f, C8.g, K8.n, Ig.a, G {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16183Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f16184Z;

    public o() {
        Xf.b bVar = Xf.b.f21976a;
        this.f16183Y = 21;
        this.f16184Z = bVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [io.sentry.protocol.r, java.lang.Object] */
    public static r n(Throwable th2, io.sentry.protocol.k kVar, Long l10, List list, boolean z10) {
        String str;
        Package r02 = th2.getClass().getPackage();
        String name = th2.getClass().getName();
        ?? obj = new Object();
        String message = th2.getMessage();
        if (r02 != null) {
            name = name.replace(r02.getName() + Separators.DOT, "");
        }
        if (r02 != null) {
            str = r02.getName();
        } else {
            str = null;
        }
        if (list != null && !list.isEmpty()) {
            x xVar = new x(list);
            if (z10) {
                xVar.f34661h0 = Boolean.TRUE;
            }
            obj.f34616j0 = xVar;
        }
        obj.f34615i0 = l10;
        obj.f34612Y = name;
        obj.f34617k0 = kVar;
        obj.f34614h0 = str;
        obj.f34613Z = message;
        return obj;
    }

    public final void A(int i10, AbstractC2504f1 abstractC2504f1, Object obj) {
        ((AbstractC2549y) this.f16184Z).G0(i10, (M0) obj, abstractC2504f1);
    }

    public final void B(int i10, int i11) {
        ((AbstractC2549y) this.f16184Z).A0(i10, i11);
    }

    public final void C(int i10, long j6) {
        ((AbstractC2549y) this.f16184Z).C0(i10, j6);
    }

    public final void D(int i10, int i11) {
        ((AbstractC2549y) this.f16184Z).N0(i10, (i11 >> 31) ^ (i11 << 1));
    }

    public final void E(int i10, long j6) {
        ((AbstractC2549y) this.f16184Z).P0(i10, (j6 >> 63) ^ (j6 << 1));
    }

    public final void F(int i10, int i11) {
        ((AbstractC2549y) this.f16184Z).N0(i10, i11);
    }

    public final void G(int i10, long j6) {
        ((AbstractC2549y) this.f16184Z).P0(i10, j6);
    }

    @Override // u8.AbstractC5857g
    public final /* bridge */ /* synthetic */ Object a() {
        return new t((o8.p) ((AbstractC5857g) this.f16184Z).a());
    }

    @Override // E1.B
    public final boolean b(View view) {
        int i10;
        boolean z10 = false;
        if (!((SwipeDismissBehavior) this.f16184Z).r(view)) {
            return false;
        }
        WeakHashMap weakHashMap = Z.f3247a;
        if (I.d(view) == 1) {
            z10 = true;
        }
        int i11 = ((SwipeDismissBehavior) this.f16184Z).f27014d;
        if ((i11 == 0 && z10) || (i11 == 1 && !z10)) {
            i10 = -view.getWidth();
        } else {
            i10 = view.getWidth();
        }
        view.offsetLeftAndRight(i10);
        view.setAlpha(0.0f);
        ((SwipeDismissBehavior) this.f16184Z).getClass();
        return true;
    }

    @Override // Ig.a
    public final Iterable c(Object obj) {
        AbstractC1000i abstractC1000i;
        AbstractC0997f abstractC0997f;
        Lf.q qVar = (Lf.q) this.f16184Z;
        v[] vVarArr = Lf.q.f11113i;
        AbstractC3557B.c0("this$0", qVar);
        Collection<A> l10 = ((AbstractC0997f) obj).f().l();
        AbstractC3557B.b0("getSupertypes(...)", l10);
        ArrayList arrayList = new ArrayList();
        for (A a5 : l10) {
            AbstractC1000i k10 = a5.y0().k();
            C1697i c1697i = null;
            if (k10 != null) {
                abstractC1000i = k10.mo24a();
            } else {
                abstractC1000i = null;
            }
            if (abstractC1000i instanceof AbstractC0997f) {
                abstractC0997f = (AbstractC0997f) abstractC1000i;
            } else {
                abstractC0997f = null;
            }
            if (abstractC0997f != null && (c1697i = qVar.f(abstractC0997f)) == null) {
                c1697i = abstractC0997f;
            }
            if (c1697i != null) {
                arrayList.add(c1697i);
            }
        }
        return arrayList;
    }

    @Override // Rh.G
    public final void d(AbstractC1337y0 abstractC1337y0) {
        this.f16184Z = abstractC1337y0;
    }

    @Override // C8.g
    public final Object e() {
        return ((C8.i) this.f16184Z).f(null);
    }

    public final y7.b f() {
        return new y7.b(this, 0);
    }

    public final void g(char c10) {
        if (c10 <= '\u007f') {
            ((BitSet) this.f16184Z).set(c10);
            return;
        }
        throw new IllegalArgumentException("Can only match ASCII characters");
    }

    public final void h(d7.p pVar, BufferedWriter bufferedWriter) {
        G8.d dVar = (G8.d) this.f16184Z;
        G8.e eVar = new G8.e(bufferedWriter, dVar.f6080a, dVar.f6081b, dVar.f6082c, dVar.f6083d);
        eVar.e(pVar);
        eVar.g();
        eVar.f6085b.flush();
    }

    @Override // K8.n
    public final Object i() {
        switch (this.f16183Y) {
            case 11:
                Type type = (Type) this.f16184Z;
                if (type instanceof ParameterizedType) {
                    Type type2 = ((ParameterizedType) type).getActualTypeArguments()[0];
                    if (type2 instanceof Class) {
                        return EnumSet.noneOf((Class) type2);
                    }
                    throw new RuntimeException("Invalid EnumSet type: " + ((Type) this.f16184Z).toString());
                }
                throw new RuntimeException("Invalid EnumSet type: " + ((Type) this.f16184Z).toString());
            default:
                try {
                    return ((Constructor) this.f16184Z).newInstance(new Object[0]);
                } catch (IllegalAccessException e10) {
                    y yVar = N8.c.f12745a;
                    throw new RuntimeException("Unexpected IllegalAccessException occurred (Gson 2.10.1). Certain ReflectionAccessFilter features require Java >= 9 to work correctly. If you are not using ReflectionAccessFilter, report this to the Gson maintainers.", e10);
                } catch (InstantiationException e11) {
                    throw new RuntimeException("Failed to invoke constructor '" + N8.c.b((Constructor) this.f16184Z) + "' with no args", e11);
                } catch (InvocationTargetException e12) {
                    throw new RuntimeException("Failed to invoke constructor '" + N8.c.b((Constructor) this.f16184Z) + "' with no args", e12.getCause());
                }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:103:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0201  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0204  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0296  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0192  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x01c3 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final B1.a j(D d10, Oc.c cVar, int i10, EnumC2426q enumC2426q, boolean z10, boolean z11) {
        Object[] objArr;
        Object[] objArr2;
        AbstractC0997f abstractC0997f;
        Object[] objArr3;
        Boolean bool;
        Y y10;
        int i11;
        Iterator it;
        ArrayList arrayList;
        Nf.j jVar;
        int size;
        Nf.i iVar;
        boolean z12;
        C4528h c4528h;
        A a5;
        Bg.I i12;
        int i13;
        Oc.c cVar2 = cVar;
        EnumC2426q enumC2426q2 = EnumC2426q.f26656h0;
        boolean z13 = false;
        if (enumC2426q != enumC2426q2) {
            objArr = 1;
        } else {
            objArr = null;
        }
        if (z11 && z10) {
            objArr2 = null;
        } else {
            objArr2 = 1;
        }
        Object obj = null;
        if (objArr == null && d10.w0().isEmpty()) {
            return new B1.a(null, 1, false);
        }
        AbstractC1000i k10 = d10.y0().k();
        if (k10 == null) {
            return new B1.a(null, 1, false);
        }
        C2412c c2412c = (C2412c) cVar2.invoke(Integer.valueOf(i10));
        Nf.j jVar2 = AbstractC2429t.f26660a;
        if (enumC2426q != enumC2426q2 && (k10 instanceof AbstractC0997f)) {
            if (c2412c.f26621b == EnumC2413d.f26624Y && enumC2426q == EnumC2426q.f26654Y) {
                AbstractC0997f abstractC0997f2 = (AbstractC0997f) k10;
                String str = Lf.d.f11067a;
                C4293e g10 = AbstractC4838e.g(abstractC0997f2);
                HashMap hashMap = Lf.d.f11076j;
                if (hashMap.containsKey(g10)) {
                    C4291c c4291c = (C4291c) hashMap.get(AbstractC4838e.g(abstractC0997f2));
                    if (c4291c != null) {
                        abstractC0997f = AbstractC5493d.e(abstractC0997f2).i(c4291c);
                        if (enumC2426q != enumC2426q2) {
                            objArr3 = 1;
                        } else {
                            objArr3 = null;
                        }
                        if (objArr3 != null) {
                            EnumC2415f enumC2415f = c2412c.f26620a;
                            if (enumC2415f == null) {
                                i13 = -1;
                            } else {
                                i13 = AbstractC2428s.f26659a[enumC2415f.ordinal()];
                            }
                            if (i13 != 1) {
                                if (i13 == 2) {
                                    bool = Boolean.FALSE;
                                }
                            } else {
                                bool = Boolean.TRUE;
                            }
                            if (abstractC0997f != null || (y10 = abstractC0997f.f()) == null) {
                                y10 = d10.y0();
                            }
                            AbstractC3557B.Z(y10);
                            i11 = i10 + 1;
                            List w02 = d10.w0();
                            List parameters = y10.getParameters();
                            AbstractC3557B.b0("getParameters(...)", parameters);
                            it = parameters.iterator();
                            arrayList = new ArrayList(Math.min(AbstractC6583a.H1(w02, 10), AbstractC6583a.H1(parameters, 10)));
                            while (r15.hasNext() && it.hasNext()) {
                                b0 b0Var = (b0) it.next();
                                d0 d0Var = (d0) r13;
                                if (objArr2 != null) {
                                    int i14 = z13 ? 1 : 0;
                                    int i15 = z13 ? 1 : 0;
                                    c4528h = new C4528h(i14, obj);
                                } else if (!d0Var.c()) {
                                    c4528h = k(d0Var.getType().B0(), cVar2, i11, z11);
                                } else if (((C2412c) cVar2.invoke(Integer.valueOf(i11))).f26620a == EnumC2415f.f26628Y) {
                                    o0 B02 = d0Var.getType().B0();
                                    c4528h = new C4528h(1, C0213f.f(Ad.l.Q0(B02).C0(z13), Ad.l.m1(B02).C0(true)));
                                } else {
                                    c4528h = new C4528h(1, (Object) null);
                                }
                                i11 += c4528h.f38769Y;
                                a5 = (A) c4528h.f38770Z;
                                if (a5 == null) {
                                    i12 = Bi.c.I0(a5, d0Var.b(), b0Var);
                                } else if (abstractC0997f != null && !d0Var.c()) {
                                    A type = d0Var.getType();
                                    AbstractC3557B.b0("getType(...)", type);
                                    i12 = Bi.c.I0(type, d0Var.b(), b0Var);
                                } else if (abstractC0997f != null) {
                                    i12 = m0.k(b0Var);
                                } else {
                                    i12 = null;
                                }
                                arrayList.add(i12);
                                cVar2 = cVar;
                                z13 = false;
                                obj = null;
                            }
                            int i16 = i11 - i10;
                            if (abstractC0997f != null && bool == null) {
                                if (!arrayList.isEmpty()) {
                                    Iterator it2 = arrayList.iterator();
                                    while (it2.hasNext()) {
                                        if (((d0) it2.next()) != null) {
                                            boolean z14 = false;
                                            Nf.i[] iVarArr = new Nf.i[3];
                                            iVarArr[0] = d10.getAnnotations();
                                            Nf.j jVar3 = AbstractC2429t.f26661b;
                                            if (abstractC0997f == null) {
                                            }
                                            iVarArr[1] = jVar3;
                                            Nf.j jVar4 = AbstractC2429t.f26660a;
                                            if (bool != null) {
                                            }
                                            iVarArr[2] = jVar;
                                            ArrayList h32 = kf.q.h3(iVarArr);
                                            size = h32.size();
                                            if (size != 0) {
                                            }
                                        }
                                    }
                                }
                                return new B1.a(null, i16, false);
                            }
                            boolean z142 = false;
                            Nf.i[] iVarArr2 = new Nf.i[3];
                            iVarArr2[0] = d10.getAnnotations();
                            Nf.j jVar32 = AbstractC2429t.f26661b;
                            if (abstractC0997f == null) {
                                jVar32 = null;
                            }
                            iVarArr2[1] = jVar32;
                            Nf.j jVar42 = AbstractC2429t.f26660a;
                            if (bool != null) {
                                jVar = jVar42;
                            } else {
                                jVar = null;
                            }
                            iVarArr2[2] = jVar;
                            ArrayList h322 = kf.q.h3(iVarArr2);
                            size = h322.size();
                            if (size != 0) {
                                if (size != 1) {
                                    iVar = new Nf.j(1, kf.t.K2(h322));
                                } else {
                                    iVar = (Nf.i) kf.t.B2(h322);
                                }
                                Q P12 = A7.b.P1(iVar);
                                List w03 = d10.w0();
                                Iterator it3 = arrayList.iterator();
                                Iterator it4 = w03.iterator();
                                ArrayList arrayList2 = new ArrayList(Math.min(AbstractC6583a.H1(arrayList, 10), AbstractC6583a.H1(w03, 10)));
                                while (it3.hasNext() && it4.hasNext()) {
                                    Object next = it3.next();
                                    d0 d0Var2 = (d0) it4.next();
                                    d0 d0Var3 = (d0) next;
                                    if (d0Var3 != null) {
                                        d0Var2 = d0Var3;
                                    }
                                    arrayList2.add(d0Var2);
                                }
                                if (bool != null) {
                                    z12 = bool.booleanValue();
                                } else {
                                    z12 = d10.z0();
                                }
                                D m10 = C0213f.m(P12, y10, arrayList2, z12);
                                if (c2412c.f26622c) {
                                    ((Xf.c) this.f16184Z).getClass();
                                    m10 = new C2414e(m10);
                                }
                                if (bool != null && c2412c.f26623d) {
                                    z142 = true;
                                }
                                return new B1.a(m10, i16, z142);
                            }
                            throw new IllegalStateException("At least one Annotations object expected".toString());
                        }
                        bool = null;
                        if (abstractC0997f != null) {
                        }
                        y10 = d10.y0();
                        AbstractC3557B.Z(y10);
                        i11 = i10 + 1;
                        List w022 = d10.w0();
                        List parameters2 = y10.getParameters();
                        AbstractC3557B.b0("getParameters(...)", parameters2);
                        it = parameters2.iterator();
                        arrayList = new ArrayList(Math.min(AbstractC6583a.H1(w022, 10), AbstractC6583a.H1(parameters2, 10)));
                        for (Object obj2 : w022) {
                            b0 b0Var2 = (b0) it.next();
                            d0 d0Var4 = (d0) obj2;
                            if (objArr2 != null) {
                            }
                            i11 += c4528h.f38769Y;
                            a5 = (A) c4528h.f38770Z;
                            if (a5 == null) {
                            }
                            arrayList.add(i12);
                            cVar2 = cVar;
                            z13 = false;
                            obj = null;
                        }
                        int i162 = i11 - i10;
                        if (abstractC0997f != null) {
                        }
                        boolean z1422 = false;
                        Nf.i[] iVarArr22 = new Nf.i[3];
                        iVarArr22[0] = d10.getAnnotations();
                        Nf.j jVar322 = AbstractC2429t.f26661b;
                        if (abstractC0997f == null) {
                        }
                        iVarArr22[1] = jVar322;
                        Nf.j jVar422 = AbstractC2429t.f26660a;
                        if (bool != null) {
                        }
                        iVarArr22[2] = jVar;
                        ArrayList h3222 = kf.q.h3(iVarArr22);
                        size = h3222.size();
                        if (size != 0) {
                        }
                    } else {
                        throw new IllegalArgumentException("Given class " + abstractC0997f2 + " is not a mutable collection");
                    }
                }
            }
            if (c2412c.f26621b == EnumC2413d.f26625Z && enumC2426q == EnumC2426q.f26655Z) {
                AbstractC0997f abstractC0997f3 = (AbstractC0997f) k10;
                String str2 = Lf.d.f11067a;
                if (Lf.d.f11077k.containsKey(AbstractC4838e.g(abstractC0997f3))) {
                    abstractC0997f = Lf.e.a(abstractC0997f3);
                    if (enumC2426q != enumC2426q2) {
                    }
                    if (objArr3 != null) {
                    }
                    bool = null;
                    if (abstractC0997f != null) {
                    }
                    y10 = d10.y0();
                    AbstractC3557B.Z(y10);
                    i11 = i10 + 1;
                    List w0222 = d10.w0();
                    List parameters22 = y10.getParameters();
                    AbstractC3557B.b0("getParameters(...)", parameters22);
                    it = parameters22.iterator();
                    arrayList = new ArrayList(Math.min(AbstractC6583a.H1(w0222, 10), AbstractC6583a.H1(parameters22, 10)));
                    while (r15.hasNext()) {
                    }
                    int i1622 = i11 - i10;
                    if (abstractC0997f != null) {
                    }
                    boolean z14222 = false;
                    Nf.i[] iVarArr222 = new Nf.i[3];
                    iVarArr222[0] = d10.getAnnotations();
                    Nf.j jVar3222 = AbstractC2429t.f26661b;
                    if (abstractC0997f == null) {
                    }
                    iVarArr222[1] = jVar3222;
                    Nf.j jVar4222 = AbstractC2429t.f26660a;
                    if (bool != null) {
                    }
                    iVarArr222[2] = jVar;
                    ArrayList h32222 = kf.q.h3(iVarArr222);
                    size = h32222.size();
                    if (size != 0) {
                    }
                }
            }
        }
        abstractC0997f = null;
        if (enumC2426q != enumC2426q2) {
        }
        if (objArr3 != null) {
        }
        bool = null;
        if (abstractC0997f != null) {
        }
        y10 = d10.y0();
        AbstractC3557B.Z(y10);
        i11 = i10 + 1;
        List w02222 = d10.w0();
        List parameters222 = y10.getParameters();
        AbstractC3557B.b0("getParameters(...)", parameters222);
        it = parameters222.iterator();
        arrayList = new ArrayList(Math.min(AbstractC6583a.H1(w02222, 10), AbstractC6583a.H1(parameters222, 10)));
        while (r15.hasNext()) {
        }
        int i16222 = i11 - i10;
        if (abstractC0997f != null) {
        }
        boolean z142222 = false;
        Nf.i[] iVarArr2222 = new Nf.i[3];
        iVarArr2222[0] = d10.getAnnotations();
        Nf.j jVar32222 = AbstractC2429t.f26661b;
        if (abstractC0997f == null) {
        }
        iVarArr2222[1] = jVar32222;
        Nf.j jVar42222 = AbstractC2429t.f26660a;
        if (bool != null) {
        }
        iVarArr2222[2] = jVar;
        ArrayList h322222 = kf.q.h3(iVarArr2222);
        size = h322222.size();
        if (size != 0) {
        }
    }

    public final C4528h k(o0 o0Var, Oc.c cVar, int i10, boolean z10) {
        Object obj;
        A a5;
        Object obj2 = null;
        if (Bi.c.g1(o0Var)) {
            return new C4528h(1, (Object) null);
        }
        if (o0Var instanceof AbstractC0227u) {
            boolean z11 = o0Var instanceof Zf.f;
            AbstractC0227u abstractC0227u = (AbstractC0227u) o0Var;
            B1.a j6 = j(abstractC0227u.f2158Z, cVar, i10, EnumC2426q.f26654Y, z11, z10);
            B1.a j10 = j(abstractC0227u.f2159h0, cVar, i10, EnumC2426q.f26655Z, z11, z10);
            A a10 = (D) j6.f1706c;
            if (a10 != null || ((D) j10.f1706c) != null) {
                if (!j6.f1705b && !j10.f1705b) {
                    D d10 = abstractC0227u.f2159h0;
                    D d11 = abstractC0227u.f2158Z;
                    D d12 = a10;
                    if (z11) {
                        D d13 = a10;
                        if (a10 == null) {
                            d13 = d11;
                        }
                        D d14 = (D) j10.f1706c;
                        if (d14 != null) {
                            d10 = d14;
                        }
                        obj2 = new Zf.f(d13, d10);
                    } else {
                        if (a10 == null) {
                            d12 = d11;
                        }
                        D d15 = (D) j10.f1706c;
                        if (d15 != null) {
                            d10 = d15;
                        }
                        obj2 = C0213f.f(d12, d10);
                    }
                } else {
                    D d16 = (D) j10.f1706c;
                    D d17 = a10;
                    if (d16 != null) {
                        if (a10 == null) {
                            d17 = d16;
                        }
                        a5 = C0213f.f(d17, d16);
                    } else {
                        AbstractC3557B.Z(a10);
                        a5 = a10;
                    }
                    obj2 = L4.a.Z0(o0Var, a5);
                }
            }
            return new C4528h(j6.f1704a, obj2);
        } else if (o0Var instanceof D) {
            B1.a j11 = j((D) o0Var, cVar, i10, EnumC2426q.f26656h0, false, z10);
            if (j11.f1705b) {
                obj = L4.a.Z0(o0Var, (D) j11.f1706c);
            } else {
                obj = (D) j11.f1706c;
            }
            return new C4528h(j11.f1704a, obj);
        } else {
            throw new RuntimeException();
        }
    }

    public final void l() {
        Socket socket;
        ai.n nVar = (ai.n) this.f16184Z;
        Iterator it = nVar.f24298e.iterator();
        AbstractC3557B.b0("connections.iterator()", it);
        while (it.hasNext()) {
            ai.m mVar = (ai.m) it.next();
            AbstractC3557B.b0("connection", mVar);
            synchronized (mVar) {
                if (mVar.f24292p.isEmpty()) {
                    it.remove();
                    mVar.f24286j = true;
                    socket = mVar.f24280d;
                    AbstractC3557B.Z(socket);
                } else {
                    socket = null;
                }
            }
            if (socket != null) {
                Xh.b.d(socket);
            }
        }
        if (nVar.f24298e.isEmpty()) {
            nVar.f24296c.a();
        }
    }

    public final Q3.j m() {
        yi.a aVar = (yi.a) this.f16184Z;
        if (aVar instanceof ti.q) {
            ArrayList arrayList = ((ti.q) aVar).f46316b.f46299b;
            Q3.j jVar = new Q3.j(6);
            jVar.f14418b.addAll(arrayList);
            return jVar;
        }
        return new Q3.j(6);
    }

    public final void o(char c10, char c11) {
        while (c10 <= c11) {
            g(c10);
            c10 = (char) (c10 + 1);
        }
    }

    public final synchronized void p(Z4.g gVar) {
        AbstractC3557B.c0("thread", gVar);
        Object obj = this.f16184Z;
        ReentrantLock reentrantLock = ((Z4.l) obj).f23193p0;
        Z4.l lVar = (Z4.l) obj;
        reentrantLock.lock();
        if (lVar.getEnableLogThreads$lib_release()) {
            String str = "exiting tid=" + gVar.getId();
            AbstractC3557B.c0("message", str);
            if (Ad.l.f821g) {
                Log.i("GLThreadManager", str);
            }
        }
        gVar.f23163Z = true;
        lVar.f23194q0.signalAll();
        reentrantLock.unlock();
    }

    public final void q(int i10, boolean z10) {
        ((AbstractC2549y) this.f16184Z).w0(i10, z10);
    }

    public final void r(int i10, AbstractC2534q abstractC2534q) {
        ((AbstractC2549y) this.f16184Z).y0(i10, abstractC2534q);
    }

    public final void s(int i10, double d10) {
        AbstractC2549y abstractC2549y = (AbstractC2549y) this.f16184Z;
        abstractC2549y.getClass();
        abstractC2549y.C0(i10, Double.doubleToRawLongBits(d10));
    }

    public final void t(int i10, int i11) {
        ((AbstractC2549y) this.f16184Z).E0(i10, i11);
    }

    public final void u(int i10, int i11) {
        ((AbstractC2549y) this.f16184Z).A0(i10, i11);
    }

    public final void v(int i10, long j6) {
        ((AbstractC2549y) this.f16184Z).C0(i10, j6);
    }

    public final void w(int i10, float f6) {
        AbstractC2549y abstractC2549y = (AbstractC2549y) this.f16184Z;
        abstractC2549y.getClass();
        abstractC2549y.A0(i10, Float.floatToRawIntBits(f6));
    }

    public final void x(int i10, AbstractC2504f1 abstractC2504f1, Object obj) {
        AbstractC2549y abstractC2549y = (AbstractC2549y) this.f16184Z;
        abstractC2549y.M0(i10, 3);
        abstractC2504f1.j(abstractC2549y.f27644c, (M0) obj);
        abstractC2549y.M0(i10, 4);
    }

    public final void y(int i10, int i11) {
        ((AbstractC2549y) this.f16184Z).E0(i10, i11);
    }

    public final void z(int i10, long j6) {
        ((AbstractC2549y) this.f16184Z).P0(i10, j6);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(int i10) {
        this(TimeUnit.MINUTES);
        this.f16183Y = i10;
        if (i10 == 17) {
            this(Looper.getMainLooper());
        } else if (i10 == 23) {
        } else {
            if (i10 != 24) {
                this.f16184Z = new HashMap(50);
            }
        }
    }

    public /* synthetic */ o(int i10, Object obj) {
        this.f16183Y = i10;
        this.f16184Z = obj;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(C8.i iVar) {
        this(9, iVar);
        this.f16183Y = 9;
    }

    public /* synthetic */ o(SignInHubActivity signInHubActivity) {
        this.f16183Y = 3;
        this.f16184Z = signInHubActivity;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(BitSet bitSet) {
        this(26, bitSet);
        this.f16183Y = 26;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public o(TimeUnit timeUnit) {
        this(new ai.n(Zh.f.f23776i, timeUnit));
        this.f16183Y = 24;
        AbstractC3557B.c0("timeUnit", timeUnit);
    }

    public o(n6.g gVar) {
        this.f16183Y = 2;
        this.f16184Z = gVar;
    }

    public o(Looper looper) {
        this.f16183Y = 17;
        this.f16184Z = new Handler(looper);
    }

    public o(ai.n nVar) {
        this.f16183Y = 24;
        this.f16184Z = nVar;
    }

    public o(s1 s1Var) {
        this.f16183Y = 16;
        this.f16184Z = s1Var;
    }

    public o(AbstractC2549y abstractC2549y) {
        this.f16183Y = 13;
        AbstractC2536r0.a("output", abstractC2549y);
        this.f16184Z = abstractC2549y;
        abstractC2549y.f27644c = this;
    }

    public o(Z4.l lVar) {
        this.f16183Y = 1;
        AbstractC3557B.c0("this$0", lVar);
        this.f16184Z = lVar;
    }
}
