package R3;

import Pg.A;
import Pg.z;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ d f15029a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ A f15030b;

    public b(d dVar, A a5) {
        this.f15029a = dVar;
        this.f15030b = a5;
    }

    public final void a(Object obj) {
        Object obj2;
        d dVar = this.f15029a;
        if (dVar.c(obj)) {
            obj2 = new Q3.b(dVar.a());
        } else {
            obj2 = Q3.a.f14402a;
        }
        z zVar = (z) this.f15030b;
        zVar.getClass();
        zVar.t(obj2);
    }
}
