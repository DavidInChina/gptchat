package f4;

import android.content.Context;
import jf.C3963m;
import kf.v;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final Context f29602a;

    /* renamed from: b  reason: collision with root package name */
    public final q4.c f29603b = u4.d.f46387a;

    /* renamed from: c  reason: collision with root package name */
    public C3963m f29604c = null;

    /* renamed from: d  reason: collision with root package name */
    public c f29605d = null;

    /* renamed from: e  reason: collision with root package name */
    public final u4.i f29606e = new u4.i();

    public h(Context context) {
        this.f29602a = context.getApplicationContext();
    }

    public final q a() {
        C3963m D12 = R4.b.D1(new f(this, 0));
        C3963m c3963m = this.f29604c;
        if (c3963m == null) {
            c3963m = R4.b.D1(new f(this, 1));
        }
        C3963m c3963m2 = c3963m;
        C3963m D13 = R4.b.D1(g.f29601Y);
        c cVar = this.f29605d;
        if (cVar == null) {
            v vVar = v.f37483Y;
            cVar = new c(vVar, vVar, vVar, vVar, vVar);
        }
        u4.i iVar = this.f29606e;
        return new q(this.f29602a, this.f29603b, D12, c3963m2, D13, cVar, iVar);
    }
}
