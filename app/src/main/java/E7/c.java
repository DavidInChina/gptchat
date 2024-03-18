package e7;

import h7.C3330d;
import m.C4528h;

/* loaded from: classes2.dex */
public final class c implements E8.d {

    /* renamed from: a  reason: collision with root package name */
    public static final c f28987a = new Object();

    /* renamed from: b  reason: collision with root package name */
    public static final E8.c f28988b;

    /* renamed from: c  reason: collision with root package name */
    public static final E8.c f28989c;

    /* JADX WARN: Type inference failed for: r0v0, types: [e7.c, java.lang.Object] */
    static {
        U3.l a5 = E8.c.a("eventsDroppedCount");
        C4528h j6 = C4528h.j();
        j6.f38769Y = 1;
        a5.q(j6.i());
        f28988b = a5.f();
        U3.l a10 = E8.c.a("reason");
        C4528h j10 = C4528h.j();
        j10.f38769Y = 3;
        a10.q(j10.i());
        f28989c = a10.f();
    }

    @Override // E8.a
    public final void a(Object obj, Object obj2) {
        C3330d c3330d = (C3330d) obj;
        E8.e eVar = (E8.e) obj2;
        eVar.b(f28988b, c3330d.f31935a);
        eVar.a(f28989c, c3330d.f31936b);
    }
}
