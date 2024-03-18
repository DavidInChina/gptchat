package i9;

import Ng.Q;
import id.AbstractC3557B;
import io.sentry.L0;
import jf.y;
import mc.AbstractC4617d;
import nf.AbstractC4825e;
import od.AbstractC4991b;
import od.EnumC4990a;
import of.EnumC5000a;

/* renamed from: i9.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3517i implements AbstractC4991b {

    /* renamed from: a  reason: collision with root package name */
    public final AbstractC4617d f32898a;

    static {
        int i10 = AbstractC4617d.f39129g;
    }

    public C3517i(AbstractC4617d abstractC4617d) {
        AbstractC3557B.c0("developerSettingsStore", abstractC4617d);
        this.f32898a = abstractC4617d;
    }

    @Override // od.AbstractC4991b
    public final EnumC4990a a() {
        return null;
    }

    @Override // od.AbstractC4991b
    public final Object b(AbstractC4825e abstractC4825e) {
        L0.h("buildType", "release");
        L0.h("flavor", "googlePlay");
        L0.h("debug", "false");
        L0.h("isInternal", "false");
        Object b10 = this.f32898a.f44961e.b(C3516h.f32897Y, abstractC4825e);
        if (b10 == EnumC5000a.f41328Y) {
            return b10;
        }
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
    }
}
