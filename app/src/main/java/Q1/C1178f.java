package Q1;

import a1.C1915c;
import android.os.Build;
import java.util.Set;

/* renamed from: Q1.f  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1178f extends Bi.c {

    /* renamed from: h  reason: collision with root package name */
    public final /* synthetic */ C1179g f14319h;

    public C1178f(C1179g c1179g) {
        this.f14319h = c1179g;
    }

    @Override // Bi.c
    public final void s1(Throwable th2) {
        ((l) this.f14319h.f5033Z).e(th2);
    }

    @Override // Bi.c
    public final void t1(U3.n nVar) {
        Set<int[]> set;
        C1179g c1179g = this.f14319h;
        c1179g.f14321i0 = nVar;
        U3.n nVar2 = c1179g.f14321i0;
        Object obj = c1179g.f5033Z;
        l lVar = (l) obj;
        C1915c c1915c = lVar.f14333g;
        C1177e c1177e = lVar.f14335i;
        ((l) obj).getClass();
        if (Build.VERSION.SDK_INT >= 34) {
            set = q.a();
        } else {
            set = Df.H.N();
        }
        c1179g.f14320h0 = new V.B(nVar2, c1915c, c1177e, set);
        ((l) c1179g.f5033Z).f();
    }
}
