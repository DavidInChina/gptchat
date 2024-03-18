package I8;

import L8.C0894a;
import com.google.gson.reflect.TypeToken;
import j$.util.Objects;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.EOFException;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.lang.reflect.Type;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicLongArray;
import n2.C4711b;

/* loaded from: classes.dex */
public final class n {

    /* renamed from: a  reason: collision with root package name */
    public final ThreadLocal f8106a;

    /* renamed from: b  reason: collision with root package name */
    public final ConcurrentHashMap f8107b;

    /* renamed from: c  reason: collision with root package name */
    public final C4711b f8108c;

    /* renamed from: d  reason: collision with root package name */
    public final L8.b f8109d;

    /* renamed from: e  reason: collision with root package name */
    public final List f8110e;

    /* renamed from: f  reason: collision with root package name */
    public final Map f8111f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f8112g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f8113h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f8114i;

    /* renamed from: j  reason: collision with root package name */
    public final boolean f8115j;

    /* renamed from: k  reason: collision with root package name */
    public final boolean f8116k;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public n() {
        this(r1, r2, r3, true, true, 1, Collections.emptyList(), C.f8095Y, C.f8096Z, Collections.emptyList());
        K8.f fVar = K8.f.f9547h0;
        C0739a c0739a = h.f8099Y;
        Map emptyMap = Collections.emptyMap();
        Collections.emptyList();
        Collections.emptyList();
    }

    public static void a(double d10) {
        if (!Double.isNaN(d10) && !Double.isInfinite(d10)) {
            return;
        }
        throw new IllegalArgumentException(d10 + " is not a valid double value as per JSON specification. To override this behavior, use GsonBuilder.serializeSpecialFloatingPointValues() method.");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [L8.g, P8.b] */
    public final Object b(r rVar, TypeToken typeToken) {
        if (rVar == null) {
            return null;
        }
        ?? bVar = new P8.b(L8.g.f10790y0);
        bVar.f10792u0 = new Object[32];
        bVar.f10793v0 = 0;
        bVar.f10794w0 = new String[32];
        bVar.f10795x0 = new int[32];
        bVar.f1(rVar);
        return c(bVar, typeToken);
    }

    public final Object c(P8.b bVar, TypeToken typeToken) {
        boolean z10;
        boolean z11 = bVar.f13851Z;
        z11 = true;
        try {
            try {
                try {
                    try {
                        bVar.R0();
                        z10 = false;
                        return f(typeToken).b(bVar);
                    } catch (EOFException e10) {
                        if (z10) {
                            bVar.f13851Z = z11;
                            return null;
                        }
                        throw new RuntimeException(e10);
                    }
                } catch (IllegalStateException e11) {
                    throw new RuntimeException(e11);
                }
            } catch (IOException e12) {
                throw new RuntimeException(e12);
            } catch (AssertionError e13) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e13.getMessage(), e13);
            }
        } finally {
            bVar.f13851Z = z11;
        }
    }

    public final Object d(Reader reader, TypeToken typeToken) {
        P8.b bVar = new P8.b(reader);
        bVar.f13851Z = this.f8116k;
        Object c10 = c(bVar, typeToken);
        if (c10 != null) {
            try {
                if (bVar.R0() != 10) {
                    throw new RuntimeException("JSON document was not fully consumed.");
                }
            } catch (P8.d e10) {
                throw new RuntimeException(e10);
            } catch (IOException e11) {
                throw new RuntimeException(e11);
            }
        }
        return c10;
    }

    public final Object e(Class cls, String str) {
        Object obj;
        TypeToken typeToken = TypeToken.get(cls);
        if (str == null) {
            obj = null;
        } else {
            obj = d(new StringReader(str), typeToken);
        }
        return K8.d.U0(cls).cast(obj);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, I8.m] */
    public final E f(TypeToken typeToken) {
        boolean z10;
        Objects.requireNonNull(typeToken, "type must not be null");
        ConcurrentHashMap concurrentHashMap = this.f8107b;
        E e10 = (E) concurrentHashMap.get(typeToken);
        if (e10 != null) {
            return e10;
        }
        ThreadLocal threadLocal = this.f8106a;
        Map map = (Map) threadLocal.get();
        if (map == null) {
            map = new HashMap();
            threadLocal.set(map);
            z10 = true;
        } else {
            E e11 = (E) map.get(typeToken);
            if (e11 != null) {
                return e11;
            }
            z10 = false;
        }
        try {
            ?? obj = new Object();
            E e12 = null;
            obj.f8105a = null;
            map.put(typeToken, obj);
            Iterator it = this.f8110e.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                }
                e12 = ((F) it.next()).a(this, typeToken);
                if (e12 != null) {
                    if (obj.f8105a == null) {
                        obj.f8105a = e12;
                        map.put(typeToken, e12);
                    } else {
                        throw new AssertionError("Delegate is already set");
                    }
                }
            }
            if (z10) {
                threadLocal.remove();
            }
            if (e12 != null) {
                if (z10) {
                    concurrentHashMap.putAll(map);
                }
                return e12;
            }
            throw new IllegalArgumentException("GSON (2.10.1) cannot handle " + typeToken);
        } catch (Throwable th2) {
            if (z10) {
                threadLocal.remove();
            }
            throw th2;
        }
    }

    public final E g(F f6, TypeToken typeToken) {
        List<F> list = this.f8110e;
        if (!list.contains(f6)) {
            f6 = this.f8109d;
        }
        boolean z10 = false;
        for (F f10 : list) {
            if (!z10) {
                if (f10 == f6) {
                    z10 = true;
                }
            } else {
                E a5 = f10.a(this, typeToken);
                if (a5 != null) {
                    return a5;
                }
            }
        }
        throw new IllegalArgumentException("GSON cannot serialize " + typeToken);
    }

    public final P8.c h(Writer writer) {
        if (this.f8113h) {
            writer.write(")]}'\n");
        }
        P8.c cVar = new P8.c(writer);
        if (this.f8115j) {
            cVar.f13871i0 = "  ";
            cVar.f13872j0 = ": ";
        }
        cVar.f13874l0 = this.f8114i;
        cVar.f13873k0 = this.f8116k;
        cVar.f13876n0 = this.f8112g;
        return cVar;
    }

    public final String i(Object obj) {
        if (obj == null) {
            StringWriter stringWriter = new StringWriter();
            try {
                j(h(stringWriter));
                return stringWriter.toString();
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            }
        }
        Class cls = obj.getClass();
        StringWriter stringWriter2 = new StringWriter();
        try {
            k(obj, cls, h(stringWriter2));
            return stringWriter2.toString();
        } catch (IOException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void j(P8.c cVar) {
        t tVar = t.f8132Y;
        boolean z10 = cVar.f13873k0;
        cVar.f13873k0 = true;
        boolean z11 = cVar.f13874l0;
        cVar.f13874l0 = this.f8114i;
        boolean z12 = cVar.f13876n0;
        cVar.f13876n0 = this.f8112g;
        try {
            try {
                K8.d.V0(tVar, cVar);
            } catch (IOException e10) {
                throw new RuntimeException(e10);
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.f13873k0 = z10;
            cVar.f13874l0 = z11;
            cVar.f13876n0 = z12;
        }
    }

    public final void k(Object obj, Class cls, P8.c cVar) {
        E f6 = f(TypeToken.get((Type) cls));
        boolean z10 = cVar.f13873k0;
        cVar.f13873k0 = true;
        boolean z11 = cVar.f13874l0;
        cVar.f13874l0 = this.f8114i;
        boolean z12 = cVar.f13876n0;
        cVar.f13876n0 = this.f8112g;
        try {
            try {
                try {
                    f6.c(cVar, obj);
                } catch (IOException e10) {
                    throw new RuntimeException(e10);
                }
            } catch (AssertionError e11) {
                throw new AssertionError("AssertionError (GSON 2.10.1): " + e11.getMessage(), e11);
            }
        } finally {
            cVar.f13873k0 = z10;
            cVar.f13874l0 = z11;
            cVar.f13876n0 = z12;
        }
    }

    public final String toString() {
        return "{serializeNulls:" + this.f8112g + ",factories:" + this.f8110e + ",instanceCreators:" + this.f8108c + "}";
    }

    public n(K8.f fVar, C0739a c0739a, Map map, boolean z10, boolean z11, int i10, List list, D d10, z zVar, List list2) {
        L8.l lVar;
        k kVar;
        L8.l lVar2;
        this.f8106a = new ThreadLocal();
        this.f8107b = new ConcurrentHashMap();
        this.f8111f = map;
        C4711b c4711b = new C4711b(list2, map, z11);
        this.f8108c = c4711b;
        this.f8112g = false;
        this.f8113h = false;
        this.f8114i = z10;
        this.f8115j = false;
        this.f8116k = false;
        ArrayList arrayList = new ArrayList();
        arrayList.add(L8.A.f10753A);
        if (d10 == C.f8095Y) {
            lVar = L8.n.f10811c;
        } else {
            lVar = new L8.l(1, d10);
        }
        arrayList.add(lVar);
        arrayList.add(fVar);
        arrayList.addAll(list);
        arrayList.add(L8.A.f10770p);
        arrayList.add(L8.A.f10761g);
        arrayList.add(L8.A.f10758d);
        arrayList.add(L8.A.f10759e);
        arrayList.add(L8.A.f10760f);
        if (i10 == 1) {
            kVar = L8.A.f10765k;
        } else {
            kVar = new k(0);
        }
        arrayList.add(L8.A.b(Long.TYPE, Long.class, kVar));
        arrayList.add(L8.A.b(Double.TYPE, Double.class, new j(0)));
        arrayList.add(L8.A.b(Float.TYPE, Float.class, new j(1)));
        if (zVar == C.f8096Z) {
            lVar2 = L8.m.f10809b;
        } else {
            lVar2 = new L8.l(0, new L8.m(zVar));
        }
        arrayList.add(lVar2);
        arrayList.add(L8.A.f10762h);
        arrayList.add(L8.A.f10763i);
        arrayList.add(L8.A.a(AtomicLong.class, new l(kVar, 0).a()));
        arrayList.add(L8.A.a(AtomicLongArray.class, new l(kVar, 1).a()));
        arrayList.add(L8.A.f10764j);
        arrayList.add(L8.A.f10766l);
        arrayList.add(L8.A.f10771q);
        arrayList.add(L8.A.f10772r);
        arrayList.add(L8.A.a(BigDecimal.class, L8.A.f10767m));
        arrayList.add(L8.A.a(BigInteger.class, L8.A.f10768n));
        arrayList.add(L8.A.a(K8.h.class, L8.A.f10769o));
        arrayList.add(L8.A.f10773s);
        arrayList.add(L8.A.f10774t);
        arrayList.add(L8.A.f10776v);
        arrayList.add(L8.A.f10777w);
        arrayList.add(L8.A.f10779y);
        arrayList.add(L8.A.f10775u);
        arrayList.add(L8.A.f10756b);
        arrayList.add(L8.c.f10786b);
        arrayList.add(L8.A.f10778x);
        if (O8.e.f13435a) {
            arrayList.add(O8.e.f13439e);
            arrayList.add(O8.e.f13438d);
            arrayList.add(O8.e.f13440f);
        }
        arrayList.add(C0894a.f10781c);
        arrayList.add(L8.A.f10755a);
        arrayList.add(new L8.b(c4711b, 0));
        arrayList.add(new L8.k(c4711b));
        L8.b bVar = new L8.b(c4711b, 1);
        this.f8109d = bVar;
        arrayList.add(bVar);
        arrayList.add(L8.A.f10754B);
        arrayList.add(new L8.s(c4711b, c0739a, fVar, bVar, list2));
        this.f8110e = Collections.unmodifiableList(arrayList);
    }
}
