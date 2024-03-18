package e7;

import m.C4528h;

/* loaded from: classes2.dex */
public final class g implements E8.d {

    /* renamed from: a  reason: collision with root package name */
    public static final g f28997a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final E8.c f28998b;

    /* renamed from: c  reason: collision with root package name */
    public static final E8.c f28999c;

    /* JADX WARN: Type inference failed for: r0v0, types: [e7.g, java.lang.Object] */
    static {
        U3.l a5 = E8.c.a("startMs");
        C4528h j6 = C4528h.j();
        j6.f38769Y = 1;
        a5.q(j6.i());
        f28998b = a5.f();
        U3.l a10 = E8.c.a("endMs");
        C4528h j10 = C4528h.j();
        j10.f38769Y = 2;
        a10.q(j10.i());
        f28999c = a10.f();
    }

    @Override // E8.a
    public final void a(Object obj, Object obj2) {
        h7.g gVar = (h7.g) obj;
        E8.e eVar = (E8.e) obj2;
        eVar.b(f28998b, gVar.f31942a);
        eVar.b(f28999c, gVar.f31943b);
    }
}
