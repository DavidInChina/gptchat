package e7;

import h7.C3327a;
import m.C4528h;

/* renamed from: e7.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2806a implements E8.d {

    /* renamed from: a  reason: collision with root package name */
    public static final C2806a f28980a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final E8.c f28981b;

    /* renamed from: c  reason: collision with root package name */
    public static final E8.c f28982c;

    /* renamed from: d  reason: collision with root package name */
    public static final E8.c f28983d;

    /* renamed from: e  reason: collision with root package name */
    public static final E8.c f28984e;

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, e7.a] */
    static {
        U3.l a5 = E8.c.a("window");
        C4528h j6 = C4528h.j();
        j6.f38769Y = 1;
        a5.q(j6.i());
        f28981b = a5.f();
        U3.l a10 = E8.c.a("logSourceMetrics");
        C4528h j10 = C4528h.j();
        j10.f38769Y = 2;
        a10.q(j10.i());
        f28982c = a10.f();
        U3.l a11 = E8.c.a("globalMetrics");
        C4528h j11 = C4528h.j();
        j11.f38769Y = 3;
        a11.q(j11.i());
        f28983d = a11.f();
        U3.l a12 = E8.c.a("appNamespace");
        C4528h j12 = C4528h.j();
        j12.f38769Y = 4;
        a12.q(j12.i());
        f28984e = a12.f();
    }

    @Override // E8.a
    public final void a(Object obj, Object obj2) {
        C3327a c3327a = (C3327a) obj;
        E8.e eVar = (E8.e) obj2;
        eVar.a(f28981b, c3327a.f31921a);
        eVar.a(f28982c, c3327a.f31922b);
        eVar.a(f28983d, c3327a.f31923c);
        eVar.a(f28984e, c3327a.f31924d);
    }
}
