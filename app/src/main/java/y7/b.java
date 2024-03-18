package y7;

import Bg.A;
import Bg.Y;
import Bg.m0;
import Bg.p0;
import Cg.p;
import Eg.j;
import G7.g;
import I8.r;
import Ii.q;
import K4.J;
import K8.n;
import L8.v;
import Mf.AbstractC0994c;
import Mf.AbstractC0997f;
import Mf.AbstractC1000i;
import Mf.AbstractC1003l;
import Mf.AbstractC1013w;
import Mf.b0;
import Mf.h0;
import N7.f;
import Nf.h;
import Nf.i;
import Ng.y0;
import Pf.AbstractC1146d;
import Pf.c0;
import Rh.AbstractC1297e;
import Rh.AbstractC1337y0;
import Rh.G;
import Rh.P;
import Rh.o1;
import S4.o;
import U3.u;
import Uf.C1442d;
import Uf.E;
import Uf.EnumC1440b;
import Uf.I;
import Uf.s;
import Uf.y;
import Yf.C1694f;
import Yf.C1697i;
import android.content.Context;
import android.os.Parcel;
import bg.AbstractC2193a;
import cg.AbstractC2418i;
import cg.C2410a;
import cg.C2412c;
import cg.C2414e;
import cg.C2416g;
import cg.C2419j;
import cg.C2420k;
import cg.C2421l;
import cg.C2422m;
import cg.C2425p;
import cg.C2427r;
import cg.EnumC2413d;
import cg.EnumC2415f;
import com.google.android.gms.internal.play_billing.N;
import com.google.android.material.behavior.SwipeDismissBehavior;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.gson.reflect.TypeToken;
import id.AbstractC3557B;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.EnumC3642e1;
import io.sentry.H;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.Field;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.net.InetAddress;
import java.net.URI;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.BitSet;
import java.util.Calendar;
import java.util.Collection;
import java.util.Currency;
import java.util.Date;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.Stack;
import java.util.TimeZone;
import java.util.UUID;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicIntegerArray;
import jf.C3959i;
import k6.AbstractC4194d;
import kf.t;
import kg.C4291c;
import kotlin.jvm.internal.C;
import l8.AbstractC4344b;
import l8.C4346d;
import l8.C4348f;
import l8.C4351i;
import lg.AbstractC4460e;
import lg.C4443A;
import m.C4528h;
import q.D1;
import qg.AbstractC5326c;
import s3.z;
import v7.AbstractC5992j;
import w7.AbstractC6134f;
import w7.l;
import wf.k;
import y.AbstractC6463a;
import yf.AbstractC6583a;

/* loaded from: classes.dex */
public final /* synthetic */ class b implements AbstractC5992j, T7.a, m8.c, n, AbstractC1297e, G {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f50830Y;

    /* renamed from: Z  reason: collision with root package name */
    public Object f50831Z;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b() {
        this(17);
        this.f50830Y = 17;
    }

    public static o e() {
        return new o(new BitSet());
    }

    public static void f(Object... objArr) {
        b[] bVarArr;
        AbstractC3557B.c0("args", objArr);
        for (b bVar : Mi.a.f12184b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            bVar.getClass();
            f(copyOf);
        }
    }

    public static void k(Object... objArr) {
        b[] bVarArr;
        AbstractC3557B.c0("args", objArr);
        for (b bVar : Mi.a.f12184b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            bVar.getClass();
            k(copyOf);
        }
    }

    public static void o(Object... objArr) {
        b[] bVarArr;
        AbstractC3557B.c0("args", objArr);
        for (b bVar : Mi.a.f12184b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            bVar.getClass();
            o(copyOf);
        }
    }

    public static void u(Object... objArr) {
        b[] bVarArr;
        AbstractC3557B.c0("args", objArr);
        for (b bVar : Mi.a.f12184b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            bVar.getClass();
            u(copyOf);
        }
    }

    public static void v(Object... objArr) {
        b[] bVarArr;
        AbstractC3557B.c0("args", objArr);
        for (b bVar : Mi.a.f12184b) {
            Object[] copyOf = Arrays.copyOf(objArr, objArr.length);
            bVar.getClass();
            v(copyOf);
        }
    }

    @Override // Rh.AbstractC1297e
    public final o1 a(String str) {
        return (o1) ((ConcurrentMap) this.f50831Z).get(str);
    }

    @Override // v7.AbstractC5992j
    public final void b(AbstractC6134f abstractC6134f, Object obj) {
        Parcel obtain;
        switch (this.f50830Y) {
            case 0:
                f fVar = (f) obj;
                a aVar = (a) ((d) abstractC6134f).l();
                l lVar = (l) this.f50831Z;
                obtain = Parcel.obtain();
                obtain.writeInterfaceToken(aVar.f5064b);
                int i10 = H7.a.f7474a;
                if (lVar == null) {
                    obtain.writeInt(0);
                } else {
                    obtain.writeInt(1);
                    lVar.writeToParcel(obtain, 0);
                }
                try {
                    aVar.f5063a.transact(1, obtain, null, 1);
                    obtain.recycle();
                    fVar.f12723a.g(null);
                    return;
                } finally {
                    obtain.recycle();
                }
            default:
                G7.d dVar = (G7.d) ((G7.f) abstractC6134f).l();
                g gVar = new g((f) obj);
                Parcel obtain2 = Parcel.obtain();
                obtain2.writeInterfaceToken("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverApiService");
                int i11 = G7.c.f6070a;
                obtain2.writeStrongBinder(gVar);
                obtain = Parcel.obtain();
                try {
                    dVar.f6071a.transact(1, obtain2, obtain, 0);
                    obtain.readException();
                    return;
                } finally {
                    obtain2.recycle();
                }
        }
    }

    @Override // Rh.AbstractC1297e
    public final o1 c(String str, o1 o1Var) {
        o1 o1Var2 = (o1) ((ConcurrentMap) this.f50831Z).putIfAbsent(str, o1Var);
        if (o1Var2 != null) {
            return o1Var2;
        }
        return o1Var;
    }

    @Override // Rh.G
    public final void d(AbstractC1337y0 abstractC1337y0) {
        switch (this.f50830Y) {
            case 20:
                this.f50831Z = abstractC1337y0;
                return;
            default:
                ((C4.g) this.f50831Z).f2681Z.add(new P(abstractC1337y0));
                return;
        }
    }

    @Override // m8.c
    public final Object g() {
        Context context = ((C4348f) ((m8.c) this.f50831Z)).f37872Y.f24351a;
        if (context != null) {
            return new C4351i(context);
        }
        throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
    }

    public final Object h(r rVar, Type type) {
        I8.n nVar = ((v) this.f50831Z).f10843b;
        nVar.getClass();
        return nVar.b(rVar, TypeToken.get(type));
    }

    @Override // K8.n
    public final Object i() {
        Object obj = this.f50831Z;
        if (((Type) obj) instanceof ParameterizedType) {
            Type type = ((ParameterizedType) ((Type) obj)).getActualTypeArguments()[0];
            if (type instanceof Class) {
                return new EnumMap((Class) type);
            }
            throw new RuntimeException("Invalid EnumMap type: " + ((Type) this.f50831Z).toString());
        }
        throw new RuntimeException("Invalid EnumMap type: " + ((Type) this.f50831Z).toString());
    }

    public final void j(AbstractC4460e abstractC4460e) {
        if (abstractC4460e.M()) {
            int size = abstractC4460e.size();
            int[] iArr = C4443A.f38330m0;
            int binarySearch = Arrays.binarySearch(iArr, size);
            if (binarySearch < 0) {
                binarySearch = (-(binarySearch + 1)) - 1;
            }
            int i10 = iArr[binarySearch + 1];
            if (!((Stack) this.f50831Z).isEmpty() && ((AbstractC4460e) ((Stack) this.f50831Z).peek()).size() < i10) {
                int i11 = iArr[binarySearch];
                AbstractC4460e abstractC4460e2 = (AbstractC4460e) ((Stack) this.f50831Z).pop();
                while (!((Stack) this.f50831Z).isEmpty() && ((AbstractC4460e) ((Stack) this.f50831Z).peek()).size() < i11) {
                    abstractC4460e2 = new C4443A((AbstractC4460e) ((Stack) this.f50831Z).pop(), abstractC4460e2);
                }
                C4443A c4443a = new C4443A(abstractC4460e2, abstractC4460e);
                while (!((Stack) this.f50831Z).isEmpty()) {
                    int[] iArr2 = C4443A.f38330m0;
                    int binarySearch2 = Arrays.binarySearch(iArr2, c4443a.f38331Z);
                    if (binarySearch2 < 0) {
                        binarySearch2 = (-(binarySearch2 + 1)) - 1;
                    }
                    if (((AbstractC4460e) ((Stack) this.f50831Z).peek()).size() >= iArr2[binarySearch2 + 1]) {
                        break;
                    }
                    c4443a = new C4443A((AbstractC4460e) ((Stack) this.f50831Z).pop(), c4443a);
                }
                ((Stack) this.f50831Z).push(c4443a);
                return;
            }
            ((Stack) this.f50831Z).push(abstractC4460e);
        } else if (abstractC4460e instanceof C4443A) {
            C4443A c4443a2 = (C4443A) abstractC4460e;
            j(c4443a2.f38332h0);
            j(c4443a2.f38333i0);
        } else {
            String valueOf = String.valueOf(abstractC4460e.getClass());
            throw new IllegalArgumentException(R.a.t(new StringBuilder(valueOf.length() + 49), "Has a new type of ByteString been created? Found ", valueOf));
        }
    }

    public final A l(AbstractC0994c abstractC0994c, Nf.a aVar, boolean z10, z zVar, EnumC1440b enumC1440b, C2427r c2427r, boolean z11, k kVar) {
        C2425p c2425p = new C2425p(aVar, z10, zVar, enumC1440b, false);
        A a5 = (A) kVar.invoke(abstractC0994c);
        Collection m10 = abstractC0994c.m();
        AbstractC3557B.b0("getOverriddenDescriptors(...)", m10);
        Collection<AbstractC0994c> collection = m10;
        ArrayList arrayList = new ArrayList(AbstractC6583a.H1(collection, 10));
        for (AbstractC0994c abstractC0994c2 : collection) {
            AbstractC3557B.Z(abstractC0994c2);
            arrayList.add((A) kVar.invoke(abstractC0994c2));
        }
        return m(c2425p, a5, arrayList, c2427r, z11);
    }

    /* JADX WARN: Code restructure failed: missing block: B:163:0x02be, code lost:
        if (r2.compareTo(r4) <= 0) goto L164;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x02e8  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0369  */
    /* JADX WARN: Removed duplicated region for block: B:224:0x0389  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03a7  */
    /* JADX WARN: Removed duplicated region for block: B:233:0x03a9  */
    /* JADX WARN: Removed duplicated region for block: B:236:0x03af  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x03ee  */
    /* JADX WARN: Removed duplicated region for block: B:251:0x03fe  */
    /* JADX WARN: Removed duplicated region for block: B:256:0x041e A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:263:0x042c  */
    /* JADX WARN: Removed duplicated region for block: B:275:0x0450 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final A m(C2425p c2425p, A a5, List list, C2427r c2427r, boolean z10) {
        int i10;
        Nf.a aVar;
        C2412c[] c2412cArr;
        o oVar;
        z zVar;
        int i11;
        ArrayList arrayList;
        EnumC2415f enumC2415f;
        boolean z11;
        C2412c c2412c;
        Iterator it;
        boolean z12;
        boolean z13;
        Iterator it2;
        boolean z14;
        EnumC2415f enumC2415f2;
        EnumC2415f enumC2415f3;
        EnumC2415f enumC2415f4;
        Iterator it3;
        boolean z15;
        boolean z16;
        EnumC2415f enumC2415f5;
        Object obj;
        Eg.f fVar;
        EnumC2415f enumC2415f6;
        EnumC2413d enumC2413d;
        boolean z17;
        boolean z18;
        boolean z19;
        Iterable iterable;
        b0 b0Var;
        boolean z20;
        EnumC1440b enumC1440b;
        C2416g c2416g;
        EnumC1440b enumC1440b2;
        s sVar;
        C2416g c2416g2;
        C2416g c2416g3;
        EnumC2415f enumC2415f7;
        boolean z21;
        C2416g c2416g4;
        EnumC2415f enumC2415f8;
        boolean z22;
        C2416g b10;
        boolean z23;
        C1442d c1442d;
        boolean z24;
        EnumC2413d enumC2413d2;
        Iterable iterable2;
        Y e10;
        Eg.l lVar;
        Eg.f fVar2;
        C2425p c2425p2 = c2425p;
        o oVar2 = (o) this.f50831Z;
        AbstractC3557B.c0("<this>", a5);
        ArrayList e11 = c2425p.e(a5);
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(list, 10));
        Iterator it4 = list.iterator();
        while (it4.hasNext()) {
            arrayList2.add(c2425p2.e((Eg.f) it4.next()));
        }
        z zVar2 = c2425p2.f26651c;
        boolean z25 = c2425p2.f26650b;
        if (z25 && !list.isEmpty()) {
            Iterator it5 = list.iterator();
            while (it5.hasNext()) {
                AbstractC3557B.c0("other", (Eg.f) it5.next());
                if (!((Cg.o) ((Xf.a) zVar2.f45394a).f21972u).a(a5, (A) fVar2)) {
                    i10 = 1;
                    break;
                }
            }
        }
        i10 = e11.size();
        C2412c[] c2412cArr2 = new C2412c[i10];
        int i12 = 0;
        while (i12 < i10) {
            C2410a c2410a = (C2410a) e11.get(i12);
            Eg.f fVar3 = c2410a.f26615a;
            p pVar = p.f3146a;
            Nf.a aVar2 = c2425p2.f26649a;
            j jVar = c2410a.f26617c;
            if (fVar3 == null) {
                if (jVar != null) {
                    if (jVar instanceof b0) {
                        p0 J10 = ((b0) jVar).J();
                        AbstractC3557B.b0("getVariance(...)", J10);
                        lVar = Ad.l.c0(J10);
                    } else {
                        StringBuilder sb2 = new StringBuilder("ClassicTypeSystemContext couldn't handle: ");
                        sb2.append(jVar);
                        sb2.append(", ");
                        throw new IllegalArgumentException(AbstractC6463a.m(C.f37623a, jVar.getClass(), sb2).toString());
                    }
                } else {
                    lVar = null;
                }
                if (lVar == Eg.l.f4734Z) {
                    c2412c = C2412c.f26619e;
                    oVar = oVar2;
                    arrayList = e11;
                    aVar = aVar2;
                    i11 = i10;
                    zVar = zVar2;
                    c2412cArr = c2412cArr2;
                    z11 = true;
                    enumC2415f = null;
                    ArrayList arrayList3 = new ArrayList();
                    it = arrayList2.iterator();
                    while (it.hasNext()) {
                        C2410a c2410a2 = (C2410a) t.i2(i12, (List) it.next());
                        if (c2410a2 != null && (fVar = c2410a2.f26615a) != null) {
                            EnumC2415f d10 = C2425p.d(fVar);
                            if (d10 == null) {
                                A u02 = L4.a.u0((A) fVar);
                                if (u02 != null) {
                                    enumC2415f6 = C2425p.d(u02);
                                } else {
                                    enumC2415f6 = enumC2415f;
                                }
                            } else {
                                enumC2415f6 = d10;
                            }
                            String str = Lf.d.f11067a;
                            if (Lf.d.f11077k.containsKey(C2425p.c(pVar.d(fVar)))) {
                                enumC2413d = EnumC2413d.f26624Y;
                            } else if (Lf.d.f11076j.containsKey(C2425p.c(pVar.N(fVar)))) {
                                enumC2413d = EnumC2413d.f26625Z;
                            } else {
                                enumC2413d = enumC2415f;
                            }
                            if (!pVar.L(fVar) && !(((A) fVar).B0() instanceof C2414e)) {
                                z17 = false;
                            } else {
                                z17 = z11;
                            }
                            if (enumC2415f6 != d10) {
                                z18 = z11;
                            } else {
                                z18 = false;
                            }
                            obj = new C2412c(enumC2415f6, enumC2413d, z17, z18);
                        } else {
                            obj = enumC2415f;
                        }
                        if (obj != null) {
                            arrayList3.add(obj);
                        }
                    }
                    if (i12 != 0 && z25) {
                        z12 = z11;
                    } else {
                        z12 = false;
                    }
                    if (i12 == 0) {
                        Nf.a aVar3 = aVar;
                        if ((aVar3 instanceof h0) && ((Pf.b0) ((h0) aVar3)).f14085o0 != null) {
                            z13 = z11;
                            ArrayList arrayList4 = new ArrayList();
                            it2 = arrayList3.iterator();
                            while (it2.hasNext()) {
                                C2412c c2412c2 = (C2412c) it2.next();
                                if (c2412c2.f26623d) {
                                    enumC2415f5 = enumC2415f;
                                } else {
                                    enumC2415f5 = c2412c2.f26620a;
                                }
                                if (enumC2415f5 != null) {
                                    arrayList4.add(enumC2415f5);
                                }
                            }
                            Set P22 = t.P2(arrayList4);
                            z14 = c2412c.f26623d;
                            EnumC2415f enumC2415f9 = c2412c.f26620a;
                            if (z14) {
                                enumC2415f2 = enumC2415f;
                            } else {
                                enumC2415f2 = enumC2415f9;
                            }
                            enumC2415f3 = EnumC2415f.f26628Y;
                            if (enumC2415f2 != enumC2415f3) {
                                enumC2415f3 = (EnumC2415f) N.x0(P22, EnumC2415f.f26630h0, EnumC2415f.f26629Z, enumC2415f2, z12);
                            }
                            if (enumC2415f3 == null) {
                                ArrayList arrayList5 = new ArrayList();
                                Iterator it6 = arrayList3.iterator();
                                while (it6.hasNext()) {
                                    EnumC2415f enumC2415f10 = ((C2412c) it6.next()).f26620a;
                                    if (enumC2415f10 != null) {
                                        arrayList5.add(enumC2415f10);
                                    }
                                }
                                Set P23 = t.P2(arrayList5);
                                enumC2415f4 = EnumC2415f.f26628Y;
                                if (enumC2415f9 != enumC2415f4) {
                                    enumC2415f4 = (EnumC2415f) N.x0(P23, EnumC2415f.f26630h0, EnumC2415f.f26629Z, enumC2415f9, z12);
                                }
                            } else {
                                enumC2415f4 = enumC2415f3;
                            }
                            ArrayList arrayList6 = new ArrayList();
                            it3 = arrayList3.iterator();
                            while (it3.hasNext()) {
                                EnumC2413d enumC2413d3 = ((C2412c) it3.next()).f26621b;
                                if (enumC2413d3 != null) {
                                    arrayList6.add(enumC2413d3);
                                }
                            }
                            EnumC2413d enumC2413d4 = (EnumC2413d) N.x0(t.P2(arrayList6), EnumC2413d.f26625Z, EnumC2413d.f26624Y, c2412c.f26621b, z12);
                            if (enumC2415f4 != null && !z10 && (!z13 || enumC2415f4 != EnumC2415f.f26629Z)) {
                                enumC2415f = enumC2415f4;
                            }
                            if (enumC2415f == EnumC2415f.f26630h0) {
                                if (!c2412c.f26622c) {
                                    if (!arrayList3.isEmpty()) {
                                        Iterator it7 = arrayList3.iterator();
                                        while (it7.hasNext()) {
                                            if (((C2412c) it7.next()).f26622c) {
                                                z15 = z11;
                                                break;
                                            }
                                        }
                                    }
                                } else {
                                    z15 = z11;
                                    if (enumC2415f == null && enumC2415f3 != enumC2415f4) {
                                        z16 = z11;
                                    } else {
                                        z16 = false;
                                    }
                                    c2412cArr[i12] = new C2412c(enumC2415f, enumC2413d4, z15, z16);
                                    i12++;
                                    c2425p2 = c2425p;
                                    e11 = arrayList;
                                    i10 = i11;
                                    zVar2 = zVar;
                                    oVar2 = oVar;
                                    c2412cArr2 = c2412cArr;
                                }
                            }
                            z15 = false;
                            if (enumC2415f == null) {
                            }
                            z16 = false;
                            c2412cArr[i12] = new C2412c(enumC2415f, enumC2413d4, z15, z16);
                            i12++;
                            c2425p2 = c2425p;
                            e11 = arrayList;
                            i10 = i11;
                            zVar2 = zVar;
                            oVar2 = oVar;
                            c2412cArr2 = c2412cArr;
                        }
                    }
                    z13 = false;
                    ArrayList arrayList42 = new ArrayList();
                    it2 = arrayList3.iterator();
                    while (it2.hasNext()) {
                    }
                    Set P222 = t.P2(arrayList42);
                    z14 = c2412c.f26623d;
                    EnumC2415f enumC2415f92 = c2412c.f26620a;
                    if (z14) {
                    }
                    enumC2415f3 = EnumC2415f.f26628Y;
                    if (enumC2415f2 != enumC2415f3) {
                    }
                    if (enumC2415f3 == null) {
                    }
                    ArrayList arrayList62 = new ArrayList();
                    it3 = arrayList3.iterator();
                    while (it3.hasNext()) {
                    }
                    EnumC2413d enumC2413d42 = (EnumC2413d) N.x0(t.P2(arrayList62), EnumC2413d.f26625Z, EnumC2413d.f26624Y, c2412c.f26621b, z12);
                    if (enumC2415f4 != null) {
                        enumC2415f = enumC2415f4;
                    }
                    if (enumC2415f == EnumC2415f.f26630h0) {
                    }
                    z15 = false;
                    if (enumC2415f == null) {
                    }
                    z16 = false;
                    c2412cArr[i12] = new C2412c(enumC2415f, enumC2413d42, z15, z16);
                    i12++;
                    c2425p2 = c2425p;
                    e11 = arrayList;
                    i10 = i11;
                    zVar2 = zVar;
                    oVar2 = oVar;
                    c2412cArr2 = c2412cArr;
                }
            }
            if (jVar == null) {
                z19 = true;
            } else {
                z19 = false;
            }
            Iterable iterable3 = kf.v.f37483Y;
            Eg.f fVar4 = c2410a.f26615a;
            if (fVar4 != null) {
                arrayList = e11;
                iterable = ((A) fVar4).getAnnotations();
            } else {
                arrayList = e11;
                iterable = iterable3;
            }
            if (fVar4 != null && (e10 = pVar.e(fVar4)) != null) {
                b0Var = AbstractC3557B.w1(e10);
                i11 = i10;
            } else {
                i11 = i10;
                b0Var = null;
            }
            EnumC1440b enumC1440b3 = EnumC1440b.f17807k0;
            EnumC1440b enumC1440b4 = c2425p2.f26652d;
            if (enumC1440b4 == enumC1440b3) {
                z20 = true;
            } else {
                z20 = false;
            }
            if (!z19) {
                enumC1440b = enumC1440b4;
            } else {
                enumC1440b = enumC1440b4;
                if (!z20) {
                    ((Xf.a) zVar2.f45394a).f21971t.getClass();
                }
                if (aVar2 == null || (iterable2 = aVar2.getAnnotations()) == null) {
                    iterable2 = iterable3;
                }
                iterable = t.u2(iterable2, iterable);
            }
            C1442d c1442d2 = ((Xf.a) zVar2.f45394a).f21968q;
            c1442d2.getClass();
            Iterator it8 = iterable.iterator();
            oVar = oVar2;
            EnumC2413d enumC2413d5 = null;
            while (true) {
                if (it8.hasNext()) {
                    c2412cArr = c2412cArr2;
                    C4291c d11 = c1442d2.d(it8.next());
                    C1442d c1442d3 = c1442d2;
                    if (E.f17757o.contains(d11)) {
                        enumC2413d2 = EnumC2413d.f26624Y;
                    } else if (E.f17758p.contains(d11)) {
                        enumC2413d2 = EnumC2413d.f26625Z;
                    } else {
                        continue;
                        c2412cArr2 = c2412cArr;
                        c1442d2 = c1442d3;
                    }
                    if (enumC2413d5 != null && enumC2413d5 != enumC2413d2) {
                        enumC2413d5 = null;
                        break;
                    }
                    enumC2413d5 = enumC2413d2;
                    c2412cArr2 = c2412cArr;
                    c1442d2 = c1442d3;
                } else {
                    c2412cArr = c2412cArr2;
                    break;
                }
            }
            C1442d c1442d4 = ((Xf.a) zVar2.f45394a).f21968q;
            zVar = zVar2;
            Oc.c cVar = new Oc.c(c2425p2, 23, c2410a);
            c1442d4.getClass();
            Iterator it9 = iterable.iterator();
            C2416g c2416g5 = null;
            while (it9.hasNext()) {
                Object next = it9.next();
                Iterator it10 = it9;
                C2416g g10 = c1442d4.g(next, ((Boolean) cVar.invoke(next)).booleanValue());
                if (g10 != null) {
                    aVar = aVar2;
                    c1442d = c1442d4;
                } else {
                    Object i13 = c1442d4.i(next);
                    if (i13 == null) {
                        aVar = aVar2;
                    } else {
                        I h10 = c1442d4.h(next);
                        if (h10 == null) {
                            h10 = c1442d4.f17801a.f17848a.f17720a;
                        }
                        h10.getClass();
                        aVar = aVar2;
                        if (h10 != I.f17765Z) {
                            C2416g g11 = c1442d4.g(i13, ((Boolean) cVar.invoke(i13)).booleanValue());
                            if (g11 != null) {
                                c1442d = c1442d4;
                                if (h10 == I.f17766h0) {
                                    z24 = true;
                                } else {
                                    z24 = false;
                                }
                                enumC2415f = null;
                                g10 = C2416g.a(g11, null, z24, 1);
                            } else {
                                c1442d = c1442d4;
                                enumC2415f = null;
                                g10 = null;
                            }
                            if (c2416g5 != null) {
                                if (g10 != null && !AbstractC3557B.K(g10, c2416g5)) {
                                    boolean z26 = c2416g5.f26633b;
                                    boolean z27 = g10.f26633b;
                                    if (!z27 || z26) {
                                        if (z27 || !z26) {
                                            c2416g = enumC2415f;
                                            break;
                                        }
                                    }
                                }
                                c1442d4 = c1442d;
                                aVar2 = aVar;
                                it9 = it10;
                            }
                            c2416g5 = g10;
                            c1442d4 = c1442d;
                            aVar2 = aVar;
                            it9 = it10;
                        }
                    }
                    c1442d = c1442d4;
                    g10 = null;
                }
                enumC2415f = null;
                if (c2416g5 != null) {
                }
                c2416g5 = g10;
                c1442d4 = c1442d;
                aVar2 = aVar;
                it9 = it10;
            }
            aVar = aVar2;
            enumC2415f = null;
            c2416g = c2416g5;
            if (c2416g != 0) {
                EnumC2415f enumC2415f11 = EnumC2415f.f26630h0;
                EnumC2415f enumC2415f12 = c2416g.f26632a;
                if (enumC2415f12 == enumC2415f11 && b0Var != null) {
                    z23 = true;
                } else {
                    z23 = false;
                }
                c2412c = new C2412c(enumC2415f12, enumC2413d5, z23, c2416g.f26633b);
                z11 = true;
            } else {
                if (!z19 && !z20) {
                    enumC1440b2 = EnumC1440b.f17806j0;
                } else {
                    enumC1440b2 = enumC1440b;
                }
                Uf.z zVar3 = c2410a.f26616b;
                if (zVar3 != null) {
                    sVar = (s) zVar3.f17851a.get(enumC1440b2);
                } else {
                    sVar = enumC2415f;
                }
                if (b0Var != null) {
                    c2416g2 = C2425p.b(b0Var);
                } else {
                    c2416g2 = enumC2415f;
                }
                if (c2416g2 != 0) {
                    c2416g3 = C2416g.a(c2416g2, EnumC2415f.f26630h0, false, 2);
                } else if (sVar != 0) {
                    c2416g3 = sVar.f17831a;
                } else {
                    c2416g3 = enumC2415f;
                }
                if (c2416g2 != 0) {
                    enumC2415f7 = c2416g2.f26632a;
                } else {
                    enumC2415f7 = enumC2415f;
                }
                if (enumC2415f7 != EnumC2415f.f26630h0 && (b0Var == null || sVar == 0 || !sVar.f17833c)) {
                    z21 = false;
                } else {
                    z21 = true;
                }
                if (jVar != null && (b10 = C2425p.b(jVar)) != null) {
                    EnumC2415f enumC2415f13 = EnumC2415f.f26629Z;
                    EnumC2415f enumC2415f14 = b10.f26632a;
                    c2416g4 = b10;
                    if (enumC2415f14 == enumC2415f13) {
                        c2416g4 = C2416g.a(b10, EnumC2415f.f26628Y, false, 2);
                    }
                } else {
                    c2416g4 = enumC2415f;
                }
                if (c2416g4 != 0) {
                    if (c2416g3 != 0) {
                        boolean z28 = c2416g3.f26633b;
                        boolean z29 = c2416g4.f26633b;
                        if (!z29 || z28) {
                            if (z29 || !z28) {
                                EnumC2415f enumC2415f15 = c2416g4.f26632a;
                                EnumC2415f enumC2415f16 = c2416g3.f26632a;
                                if (enumC2415f15.compareTo(enumC2415f16) >= 0) {
                                }
                            }
                        }
                    }
                    c2416g3 = c2416g4;
                }
                if (c2416g3 != 0) {
                    enumC2415f8 = c2416g3.f26632a;
                } else {
                    enumC2415f8 = enumC2415f;
                }
                if (c2416g3 != 0) {
                    boolean z30 = c2416g3.f26633b;
                    z11 = true;
                    if (z30) {
                        z22 = true;
                        c2412c = new C2412c(enumC2415f8, enumC2413d5, z21, z22);
                    }
                } else {
                    z11 = true;
                }
                z22 = false;
                c2412c = new C2412c(enumC2415f8, enumC2413d5, z21, z22);
            }
            ArrayList arrayList32 = new ArrayList();
            it = arrayList2.iterator();
            while (it.hasNext()) {
            }
            if (i12 != 0) {
            }
            z12 = false;
            if (i12 == 0) {
            }
            z13 = false;
            ArrayList arrayList422 = new ArrayList();
            it2 = arrayList32.iterator();
            while (it2.hasNext()) {
            }
            Set P2222 = t.P2(arrayList422);
            z14 = c2412c.f26623d;
            EnumC2415f enumC2415f922 = c2412c.f26620a;
            if (z14) {
            }
            enumC2415f3 = EnumC2415f.f26628Y;
            if (enumC2415f2 != enumC2415f3) {
            }
            if (enumC2415f3 == null) {
            }
            ArrayList arrayList622 = new ArrayList();
            it3 = arrayList32.iterator();
            while (it3.hasNext()) {
            }
            EnumC2413d enumC2413d422 = (EnumC2413d) N.x0(t.P2(arrayList622), EnumC2413d.f26625Z, EnumC2413d.f26624Y, c2412c.f26621b, z12);
            if (enumC2415f4 != null) {
            }
            if (enumC2415f == EnumC2415f.f26630h0) {
            }
            z15 = false;
            if (enumC2415f == null) {
            }
            z16 = false;
            c2412cArr[i12] = new C2412c(enumC2415f, enumC2413d422, z15, z16);
            i12++;
            c2425p2 = c2425p;
            e11 = arrayList;
            i10 = i11;
            zVar2 = zVar;
            oVar2 = oVar;
            c2412cArr2 = c2412cArr;
        }
        o oVar3 = oVar2;
        Oc.c cVar2 = new Oc.c(c2427r, 22, c2412cArr2);
        oVar3.getClass();
        return (A) oVar3.k(a5.B0(), cVar2, 0, c2425p.f26653e).f38770Z;
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0223  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0227  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0248  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x029b A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a4  */
    /* JADX WARN: Removed duplicated region for block: B:131:0x02ba  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x02bf  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x02e4  */
    /* JADX WARN: Removed duplicated region for block: B:150:0x030f  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x014c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x016f  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01ab  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x020f  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0212  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final ArrayList n(z zVar, Collection collection) {
        int i10;
        i iVar;
        Pf.P p10;
        Wf.a aVar;
        int i11;
        AbstractC0994c abstractC0994c;
        A a5;
        z zVar2;
        Wf.f fVar;
        C2419j c2419j;
        y yVar;
        int i12;
        ArrayList arrayList;
        C2419j c2419j2;
        Mf.P p11;
        EnumC1440b enumC1440b;
        C2427r c2427r;
        A l10;
        A returnType;
        C2420k c2420k;
        C3959i c3959i;
        A a10;
        Iterator it;
        AbstractC1146d Z10;
        A type;
        C2427r c2427r2;
        z zVar3;
        List list;
        AbstractC1013w abstractC1013w;
        h0 h0Var;
        z zVar4;
        Pf.P p12;
        C1697i c1697i;
        List<AbstractC2193a> list2;
        AbstractC3557B.c0("c", zVar);
        Collection<AbstractC0994c> collection2 = collection;
        int i13 = 10;
        ArrayList arrayList2 = new ArrayList(AbstractC6583a.H1(collection2, 10));
        for (AbstractC0994c abstractC0994c2 : collection2) {
            if (abstractC0994c2 instanceof Wf.a) {
                Wf.a aVar2 = (Wf.a) abstractC0994c2;
                if (aVar2.e() != 2 || aVar2.mo24a().m().size() != 1) {
                    AbstractC1000i a02 = P4.a.a0(abstractC0994c2);
                    if (a02 == null) {
                        iVar = abstractC0994c2.getAnnotations();
                    } else {
                        if (a02 instanceof C1697i) {
                            c1697i = (C1697i) a02;
                        } else {
                            c1697i = null;
                        }
                        if (c1697i != null) {
                            list2 = (List) c1697i.f22348q0.getValue();
                        } else {
                            list2 = null;
                        }
                        if (list2 != null && !list2.isEmpty()) {
                            ArrayList arrayList3 = new ArrayList(AbstractC6583a.H1(list2, i13));
                            for (AbstractC2193a abstractC2193a : list2) {
                                arrayList3.add(new C1694f(zVar, abstractC2193a, true));
                            }
                            ArrayList u22 = t.u2(abstractC0994c2.getAnnotations(), arrayList3);
                            if (u22.isEmpty()) {
                                iVar = h.f12822a;
                            } else {
                                iVar = new Nf.j(0, u22);
                            }
                        } else {
                            iVar = abstractC0994c2.getAnnotations();
                        }
                    }
                    z Z11 = R4.b.Z(zVar, iVar);
                    if ((abstractC0994c2 instanceof Wf.g) && (p12 = ((Wf.g) abstractC0994c2).f14037C0) != null && !p12.f14016j0) {
                        p10 = p12;
                    } else {
                        p10 = abstractC0994c2;
                    }
                    Wf.a aVar3 = (Wf.a) abstractC0994c2;
                    if (aVar3.Z() != null) {
                        if (p10 instanceof AbstractC1013w) {
                            abstractC1013w = (AbstractC1013w) p10;
                        } else {
                            abstractC1013w = null;
                        }
                        if (abstractC1013w != null) {
                            h0Var = (h0) abstractC1013w.q0(Wf.f.f21082L0);
                        } else {
                            h0Var = null;
                        }
                        C2421l c2421l = C2421l.f26643Y;
                        if (h0Var != null) {
                            zVar4 = R4.b.Z(Z11, ((Nf.b) h0Var).getAnnotations());
                        } else {
                            zVar4 = Z11;
                        }
                        aVar = aVar3;
                        abstractC0994c = p10;
                        zVar2 = Z11;
                        i11 = false;
                        a5 = l(abstractC0994c2, h0Var, false, zVar4, EnumC1440b.f17804h0, null, false, c2421l);
                    } else {
                        aVar = aVar3;
                        abstractC0994c = p10;
                        zVar2 = Z11;
                        i11 = false;
                        a5 = null;
                    }
                    if (abstractC0994c2 instanceof Wf.f) {
                        fVar = (Wf.f) abstractC0994c2;
                    } else {
                        fVar = null;
                    }
                    if (fVar != null) {
                        AbstractC1003l mo20k = fVar.mo20k();
                        AbstractC3557B.a0("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.ClassDescriptor", mo20k);
                        String d02 = J.d0((AbstractC0997f) mo20k, L4.a.e0(fVar, 3));
                        if (d02 != null) {
                            c2419j = (C2419j) AbstractC2418i.f26639d.get(d02);
                            if (c2419j != null) {
                                c2419j.f26641b.size();
                                aVar.S().size();
                            }
                            yVar = ((Xf.a) zVar.f45394a).f21973v;
                            AbstractC3557B.c0("javaTypeEnhancementState", yVar);
                            if (yVar.f17849b.invoke(Uf.v.f17838a) != I.f17767i0) {
                                if ((abstractC0994c2 instanceof AbstractC1013w) && AbstractC3557B.K(abstractC0994c2.q0(Wf.f.f21083M0), Boolean.TRUE)) {
                                    i12 = true;
                                    List<h0> S = abstractC0994c.S();
                                    String str = "getValueParameters(...)";
                                    AbstractC3557B.b0(str, S);
                                    ArrayList arrayList4 = new ArrayList(AbstractC6583a.H1(S, i13));
                                    for (h0 h0Var2 : S) {
                                        if (c2419j != null && (list = c2419j.f26641b) != null) {
                                            c2427r2 = (C2427r) t.i2(((Pf.b0) h0Var2).f14081k0, list);
                                        } else {
                                            c2427r2 = null;
                                        }
                                        Xf.f fVar2 = new Xf.f(4, h0Var2);
                                        if (h0Var2 != null) {
                                            zVar3 = R4.b.Z(zVar2, ((Nf.b) h0Var2).getAnnotations());
                                        } else {
                                            zVar3 = zVar2;
                                        }
                                        ArrayList arrayList5 = arrayList4;
                                        arrayList5.add(l(abstractC0994c2, h0Var2, false, zVar3, EnumC1440b.f17804h0, c2427r2, i12, fVar2));
                                        arrayList4 = arrayList5;
                                        str = str;
                                        c2419j = c2419j;
                                    }
                                    arrayList = arrayList4;
                                    String str2 = str;
                                    c2419j2 = c2419j;
                                    if (abstractC0994c2 instanceof Mf.P) {
                                        p11 = (Mf.P) abstractC0994c2;
                                    } else {
                                        p11 = null;
                                    }
                                    if (p11 == null && Ad.l.K0(p11)) {
                                        enumC1440b = EnumC1440b.f17805i0;
                                    } else {
                                        enumC1440b = EnumC1440b.f17803Z;
                                    }
                                    EnumC1440b enumC1440b2 = enumC1440b;
                                    if (c2419j2 != null) {
                                        c2427r = c2419j2.f26640a;
                                    } else {
                                        c2427r = null;
                                    }
                                    l10 = l(abstractC0994c2, abstractC0994c, true, zVar2, enumC1440b2, c2427r, false, C2422m.f26644Y);
                                    returnType = aVar.getReturnType();
                                    AbstractC3557B.Z(returnType);
                                    c2420k = C2420k.f26642Y;
                                    if (m0.d(returnType, c2420k, null) && ((Z10 = aVar.Z()) == null || (type = Z10.getType()) == null || !m0.d(type, c2420k, null))) {
                                        List<h0> S10 = aVar.S();
                                        AbstractC3557B.b0(str2, S10);
                                        if (!S10.isEmpty()) {
                                            for (h0 h0Var3 : S10) {
                                                A type2 = ((c0) h0Var3).getType();
                                                AbstractC3557B.b0("getType(...)", type2);
                                                if (m0.d(type2, c2420k, null)) {
                                                    c3959i = new C3959i(AbstractC5326c.f44136a, new Object());
                                                    break;
                                                }
                                            }
                                        }
                                        c3959i = null;
                                    } else {
                                        c3959i = new C3959i(AbstractC5326c.f44136a, new Object());
                                        break;
                                    }
                                    if (a5 == null && l10 == null) {
                                        if (!arrayList.isEmpty()) {
                                            Iterator it2 = arrayList.iterator();
                                            while (it2.hasNext()) {
                                                if (((A) it2.next()) != null) {
                                                    break;
                                                }
                                            }
                                        }
                                        if (c3959i == null) {
                                            i10 = 10;
                                            arrayList2.add(abstractC0994c2);
                                            i13 = i10;
                                        }
                                    }
                                    if (a5 == null) {
                                        AbstractC1146d Z12 = aVar.Z();
                                        if (Z12 != null) {
                                            a5 = Z12.getType();
                                        } else {
                                            a10 = null;
                                            i10 = 10;
                                            ArrayList arrayList6 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                                            it = arrayList.iterator();
                                            int i14 = i11;
                                            while (it.hasNext()) {
                                                Object next = it.next();
                                                int i15 = i14 + 1;
                                                if (i14 >= 0) {
                                                    A a11 = (A) next;
                                                    if (a11 == null) {
                                                        a11 = ((c0) ((h0) aVar.S().get(i14))).getType();
                                                        AbstractC3557B.b0("getType(...)", a11);
                                                    }
                                                    arrayList6.add(a11);
                                                    i14 = i15;
                                                } else {
                                                    AbstractC4344b.d1();
                                                    throw null;
                                                }
                                            }
                                            if (l10 == null) {
                                                l10 = aVar.getReturnType();
                                                AbstractC3557B.Z(l10);
                                            }
                                            abstractC0994c2 = aVar.G(a10, arrayList6, l10, c3959i);
                                            arrayList2.add(abstractC0994c2);
                                            i13 = i10;
                                        }
                                    }
                                    a10 = a5;
                                    i10 = 10;
                                    ArrayList arrayList62 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                                    it = arrayList.iterator();
                                    int i142 = i11;
                                    while (it.hasNext()) {
                                    }
                                    if (l10 == null) {
                                    }
                                    abstractC0994c2 = aVar.G(a10, arrayList62, l10, c3959i);
                                    arrayList2.add(abstractC0994c2);
                                    i13 = i10;
                                }
                            } else {
                                ((Xf.a) zVar2.f45394a).f21971t.getClass();
                            }
                            i12 = i11;
                            List<h0> S11 = abstractC0994c.S();
                            String str3 = "getValueParameters(...)";
                            AbstractC3557B.b0(str3, S11);
                            ArrayList arrayList42 = new ArrayList(AbstractC6583a.H1(S11, i13));
                            while (r21.hasNext()) {
                            }
                            arrayList = arrayList42;
                            String str22 = str3;
                            c2419j2 = c2419j;
                            if (abstractC0994c2 instanceof Mf.P) {
                            }
                            if (p11 == null) {
                            }
                            enumC1440b = EnumC1440b.f17803Z;
                            EnumC1440b enumC1440b22 = enumC1440b;
                            if (c2419j2 != null) {
                            }
                            l10 = l(abstractC0994c2, abstractC0994c, true, zVar2, enumC1440b22, c2427r, false, C2422m.f26644Y);
                            returnType = aVar.getReturnType();
                            AbstractC3557B.Z(returnType);
                            c2420k = C2420k.f26642Y;
                            if (m0.d(returnType, c2420k, null)) {
                            }
                            c3959i = new C3959i(AbstractC5326c.f44136a, new Object());
                            if (a5 == null) {
                                if (!arrayList.isEmpty()) {
                                }
                                if (c3959i == null) {
                                }
                            }
                            if (a5 == null) {
                            }
                            a10 = a5;
                            i10 = 10;
                            ArrayList arrayList622 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                            it = arrayList.iterator();
                            int i1422 = i11;
                            while (it.hasNext()) {
                            }
                            if (l10 == null) {
                            }
                            abstractC0994c2 = aVar.G(a10, arrayList622, l10, c3959i);
                            arrayList2.add(abstractC0994c2);
                            i13 = i10;
                        }
                    }
                    c2419j = null;
                    if (c2419j != null) {
                    }
                    yVar = ((Xf.a) zVar.f45394a).f21973v;
                    AbstractC3557B.c0("javaTypeEnhancementState", yVar);
                    if (yVar.f17849b.invoke(Uf.v.f17838a) != I.f17767i0) {
                    }
                    i12 = i11;
                    List<h0> S112 = abstractC0994c.S();
                    String str32 = "getValueParameters(...)";
                    AbstractC3557B.b0(str32, S112);
                    ArrayList arrayList422 = new ArrayList(AbstractC6583a.H1(S112, i13));
                    while (r21.hasNext()) {
                    }
                    arrayList = arrayList422;
                    String str222 = str32;
                    c2419j2 = c2419j;
                    if (abstractC0994c2 instanceof Mf.P) {
                    }
                    if (p11 == null) {
                    }
                    enumC1440b = EnumC1440b.f17803Z;
                    EnumC1440b enumC1440b222 = enumC1440b;
                    if (c2419j2 != null) {
                    }
                    l10 = l(abstractC0994c2, abstractC0994c, true, zVar2, enumC1440b222, c2427r, false, C2422m.f26644Y);
                    returnType = aVar.getReturnType();
                    AbstractC3557B.Z(returnType);
                    c2420k = C2420k.f26642Y;
                    if (m0.d(returnType, c2420k, null)) {
                    }
                    c3959i = new C3959i(AbstractC5326c.f44136a, new Object());
                    if (a5 == null) {
                    }
                    if (a5 == null) {
                    }
                    a10 = a5;
                    i10 = 10;
                    ArrayList arrayList6222 = new ArrayList(AbstractC6583a.H1(arrayList, 10));
                    it = arrayList.iterator();
                    int i14222 = i11;
                    while (it.hasNext()) {
                    }
                    if (l10 == null) {
                    }
                    abstractC0994c2 = aVar.G(a10, arrayList6222, l10, c3959i);
                    arrayList2.add(abstractC0994c2);
                    i13 = i10;
                }
            }
            i10 = i13;
            arrayList2.add(abstractC0994c2);
            i13 = i10;
        }
        return arrayList2;
    }

    public final o p() {
        return new o((BitSet) ((BitSet) this.f50831Z).clone());
    }

    public final void q(q qVar) {
        AbstractC3557B.c0("definition", qVar);
        y0 y0Var = (y0) ((Ge.c) this.f50831Z).a(qVar);
        if (y0Var != null) {
            Object i10 = y0Var.i();
            AbstractC3557B.a0("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode{ kotlinx.coroutines.internal.LockFreeLinkedListKt.Node }", i10);
            for (Sg.p pVar = (Sg.p) i10; !AbstractC3557B.K(pVar, y0Var); pVar = pVar.j()) {
            }
        }
    }

    public final void r(AbstractC3693x0 abstractC3693x0, H h10, Object obj) {
        if (obj == null) {
            ((io.sentry.vendor.gson.stream.b) ((C3636c1) abstractC3693x0).f34285Z).j();
        } else if (obj instanceof Character) {
            ((C3636c1) abstractC3693x0).t(Character.toString(((Character) obj).charValue()));
        } else if (obj instanceof String) {
            ((C3636c1) abstractC3693x0).t((String) obj);
        } else if (obj instanceof Boolean) {
            ((C3636c1) abstractC3693x0).u(((Boolean) obj).booleanValue());
        } else if (obj instanceof Number) {
            ((C3636c1) abstractC3693x0).s((Number) obj);
        } else if (obj instanceof Date) {
            try {
                ((C3636c1) abstractC3693x0).t(r.f.K((Date) obj));
            } catch (Exception e10) {
                h10.d(EnumC3642e1.ERROR, "Error when serializing Date", e10);
                ((io.sentry.vendor.gson.stream.b) ((C3636c1) abstractC3693x0).f34285Z).j();
            }
        } else if (obj instanceof TimeZone) {
            try {
                ((C3636c1) abstractC3693x0).t(((TimeZone) obj).getID());
            } catch (Exception e11) {
                h10.d(EnumC3642e1.ERROR, "Error when serializing TimeZone", e11);
                ((io.sentry.vendor.gson.stream.b) ((C3636c1) abstractC3693x0).f34285Z).j();
            }
        } else if (obj instanceof AbstractC3656j0) {
            ((AbstractC3656j0) obj).serialize(abstractC3693x0, h10);
        } else if (obj instanceof Collection) {
            s(abstractC3693x0, h10, (Collection) obj);
        } else if (obj.getClass().isArray()) {
            s(abstractC3693x0, h10, Arrays.asList((Object[]) obj));
        } else if (obj instanceof Map) {
            t(abstractC3693x0, h10, (Map) obj);
        } else if (obj instanceof Locale) {
            ((C3636c1) abstractC3693x0).t(obj.toString());
        } else if (obj instanceof AtomicIntegerArray) {
            AtomicIntegerArray atomicIntegerArray = (AtomicIntegerArray) obj;
            Charset charset = io.sentry.util.b.f34772a;
            int length = atomicIntegerArray.length();
            ArrayList arrayList = new ArrayList(length);
            for (int i10 = 0; i10 < length; i10++) {
                arrayList.add(Integer.valueOf(atomicIntegerArray.get(i10)));
            }
            s(abstractC3693x0, h10, arrayList);
        } else if (obj instanceof AtomicBoolean) {
            ((C3636c1) abstractC3693x0).u(((AtomicBoolean) obj).get());
        } else if (obj instanceof URI) {
            ((C3636c1) abstractC3693x0).t(obj.toString());
        } else if (obj instanceof InetAddress) {
            ((C3636c1) abstractC3693x0).t(obj.toString());
        } else if (obj instanceof UUID) {
            ((C3636c1) abstractC3693x0).t(obj.toString());
        } else if (obj instanceof Currency) {
            ((C3636c1) abstractC3693x0).t(obj.toString());
        } else if (obj instanceof Calendar) {
            t(abstractC3693x0, h10, io.sentry.util.b.a((Calendar) obj));
        } else if (obj.getClass().isEnum()) {
            ((C3636c1) abstractC3693x0).t(obj.toString());
        } else {
            try {
                r(abstractC3693x0, h10, ((C4528h) this.f50831Z).v(h10, obj));
            } catch (Exception e12) {
                h10.d(EnumC3642e1.ERROR, "Failed serializing unknown object.", e12);
                ((C3636c1) abstractC3693x0).t("[OBJECT]");
            }
        }
    }

    public final void s(AbstractC3693x0 abstractC3693x0, H h10, Collection collection) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        io.sentry.vendor.gson.stream.b bVar = (io.sentry.vendor.gson.stream.b) c3636c1.f34285Z;
        bVar.p();
        bVar.a();
        int i10 = bVar.f34794h0;
        int[] iArr = bVar.f34793Z;
        if (i10 == iArr.length) {
            bVar.f34793Z = Arrays.copyOf(iArr, i10 * 2);
        }
        int[] iArr2 = bVar.f34793Z;
        int i11 = bVar.f34794h0;
        bVar.f34794h0 = i11 + 1;
        iArr2[i11] = 1;
        bVar.f34792Y.write(91);
        for (Object obj : collection) {
            r(abstractC3693x0, h10, obj);
        }
        ((io.sentry.vendor.gson.stream.b) c3636c1.f34285Z).h(']', 1, 2);
    }

    public final void t(AbstractC3693x0 abstractC3693x0, H h10, Map map) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        for (Object obj : map.keySet()) {
            if (obj instanceof String) {
                c3636c1.n((String) obj);
                r(c3636c1, h10, map.get(obj));
            }
        }
        c3636c1.j();
    }

    public final String toString() {
        switch (this.f50830Y) {
            case 7:
                return ((Field) this.f50831Z).toString();
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, q.D1] */
    public final D1 w() {
        androidx.appcompat.view.a aVar = (androidx.appcompat.view.a) this.f50831Z;
        if (aVar != null) {
            ?? obj = new Object();
            obj.f43261a = obj;
            C4348f c4348f = new C4348f(aVar);
            obj.f43262b = c4348f;
            m8.c a5 = m8.b.a(new b(6, c4348f));
            obj.f43263c = a5;
            obj.f43264d = m8.b.a(new U3.l((m8.c) obj.f43262b, 16, a5));
            m8.c a10 = m8.b.a(new C4346d((m8.c) obj.f43262b, 0));
            obj.f43265e = a10;
            m8.c a11 = m8.b.a(new u((m8.c) obj.f43264d, a10, (m8.c) obj.f43262b, 27));
            obj.f43266f = a11;
            obj.f43267g = m8.b.a(new C4346d(a11, 1));
            return obj;
        }
        throw new IllegalStateException(String.valueOf(androidx.appcompat.view.a.class.getCanonicalName()).concat(" must be set"));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public b(int i10) {
        this(19, new ConcurrentHashMap());
        this.f50830Y = i10;
        if (i10 == 15) {
            this(0, 15);
        } else if (i10 == 17) {
            this.f50831Z = new Stack();
        } else if (i10 == 19) {
        } else if (i10 != 24) {
            this.f50831Z = new Ge.c();
        } else {
            this.f50831Z = new ThreadLocal();
        }
    }

    public b(int i10, int i11) {
        this.f50830Y = i11;
        if (i11 != 15) {
            this.f50831Z = new C4528h(i10, 10);
        } else if (i10 >= 0) {
            this.f50831Z = new io.sentry.transport.p(i10);
        } else {
            throw new IllegalArgumentException(AbstractC4194d.v("negative initial count '", i10, "' is not allowed"));
        }
    }

    public /* synthetic */ b(int i10, Object obj) {
        this.f50830Y = i10;
        this.f50831Z = obj;
    }

    public /* synthetic */ b(int i10, AbstractC6463a abstractC6463a) {
        this.f50830Y = i10;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(v vVar) {
        this(9, vVar);
        this.f50830Y = 9;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(o oVar, int i10) {
        this(oVar, (Object) null);
        this.f50830Y = 22;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(MaterialButtonToggleGroup materialButtonToggleGroup) {
        this(2, materialButtonToggleGroup);
        this.f50830Y = 2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(Object obj) {
        this(24);
        this.f50830Y = 24;
    }

    public /* synthetic */ b(AbstractC6463a abstractC6463a) {
        this.f50830Y = 5;
    }

    public b(o oVar, Object obj) {
        this.f50830Y = 22;
        this.f50831Z = (BitSet) oVar.f16184Z;
    }

    public b(o oVar) {
        this.f50830Y = 16;
        this.f50831Z = oVar;
    }

    public b(SwipeDismissBehavior swipeDismissBehavior) {
        this.f50830Y = 4;
        swipeDismissBehavior.getClass();
        swipeDismissBehavior.f27016f = Math.min(Math.max(0.0f, 0.1f), 1.0f);
        swipeDismissBehavior.f27017g = Math.min(Math.max(0.0f, 0.6f), 1.0f);
        swipeDismissBehavior.f27014d = 0;
    }
}
