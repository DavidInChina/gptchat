package ed;

import Ng.Q;
import Qg.F0;
import Qg.s0;
import android.app.Application;
import dd.AbstractC2625a;
import jf.y;
import kf.x;
import nf.AbstractC4825e;
import o9.C4959g;
import od.AbstractC4991b;
import od.EnumC4990a;

/* renamed from: ed.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2877c implements AbstractC4991b, AbstractC2625a {

    /* renamed from: a  reason: collision with root package name */
    public final Application f29279a;

    /* renamed from: b  reason: collision with root package name */
    public final F0 f29280b;

    /* renamed from: c  reason: collision with root package name */
    public final C4959g f29281c;

    /* renamed from: d  reason: collision with root package name */
    public final EnumC4990a f29282d = EnumC4990a.f41298Z;

    public C2877c(Application application) {
        this.f29279a = application;
        F0 c10 = s0.c(x.f37485Y);
        this.f29280b = c10;
        this.f29281c = new C4959g(C2876b.f29278Y, c10);
    }

    @Override // od.AbstractC4991b
    public final EnumC4990a a() {
        return this.f29282d;
    }

    @Override // od.AbstractC4991b
    public final Object b(AbstractC4825e abstractC4825e) {
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final Tg.e c() {
        return Q.f12904a;
    }

    @Override // od.AbstractC4991b
    public final Object d(AbstractC4825e abstractC4825e) {
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final void e() {
        this.f29279a.registerActivityLifecycleCallbacks(new C2879e(new Jb.c(11, this)));
    }
}
