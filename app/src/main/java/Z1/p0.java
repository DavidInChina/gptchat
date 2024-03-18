package Z1;

import M1.C0923d;
import Sg.C1394f;
import android.content.Context;
import b2.C2118m;
import h2.AbstractC3310g;
import java.io.File;
import l8.AbstractC4344b;

/* loaded from: classes.dex */
public final class p0 implements AbstractC3310g {

    /* renamed from: a  reason: collision with root package name */
    public static final p0 f23050a = new Object();

    @Override // h2.AbstractC3310g
    public final File a(Context context, String str) {
        return R4.b.n0(context, str);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [R4.a, java.lang.Object] */
    @Override // h2.AbstractC3310g
    public final Object b(Context context, String str) {
        C2118m c2118m = C2118m.f25613a;
        o0 o0Var = new o0(0, context, str);
        kf.v vVar = kf.v.f37483Y;
        C1394f g10 = Ad.l.g(Ng.Q.f12906c.plus(Bi.c.z()));
        return new M1.J(o0Var, c2118m, AbstractC4344b.F0(new C0923d(vVar, null)), new Object(), g10);
    }
}
