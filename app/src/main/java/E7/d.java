package e7;

import m.C4528h;

/* loaded from: classes2.dex */
public final class d implements E8.d {

    /* renamed from: a  reason: collision with root package name */
    public static final d f28990a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final E8.c f28991b;

    /* renamed from: c  reason: collision with root package name */
    public static final E8.c f28992c;

    /* JADX WARN: Type inference failed for: r0v0, types: [e7.d, java.lang.Object] */
    static {
        U3.l a5 = E8.c.a("logSource");
        C4528h j6 = C4528h.j();
        j6.f38769Y = 1;
        a5.q(j6.i());
        f28991b = a5.f();
        U3.l a10 = E8.c.a("logEventDropped");
        C4528h j10 = C4528h.j();
        j10.f38769Y = 2;
        a10.q(j10.i());
        f28992c = a10.f();
    }

    @Override // E8.a
    public final void a(Object obj, Object obj2) {
        h7.e eVar = (h7.e) obj;
        E8.e eVar2 = (E8.e) obj2;
        eVar2.a(f28991b, eVar.f31938a);
        eVar2.a(f28992c, eVar.f31939b);
    }
}
