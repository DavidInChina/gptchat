package cd;

import Ng.Q;
import Qg.F0;
import Qg.n0;
import Qg.s0;
import Tg.e;
import android.app.Application;
import android.net.ConnectivityManager;
import android.net.NetworkRequest;
import dd.AbstractC2625a;
import ed.C2877c;
import jf.y;
import nf.AbstractC4825e;
import od.AbstractC4991b;
import od.EnumC4990a;
import of.EnumC5000a;

/* renamed from: cd.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2393c implements bd.d, AbstractC4991b {

    /* renamed from: a  reason: collision with root package name */
    public final Application f26588a;

    /* renamed from: b  reason: collision with root package name */
    public final AbstractC2625a f26589b;

    /* renamed from: c  reason: collision with root package name */
    public final F0 f26590c;

    /* renamed from: d  reason: collision with root package name */
    public final n0 f26591d;

    public C2393c(Application application, AbstractC2625a abstractC2625a) {
        this.f26588a = application;
        this.f26589b = abstractC2625a;
        F0 c10 = s0.c(Boolean.FALSE);
        this.f26590c = c10;
        this.f26591d = new n0(c10);
    }

    @Override // od.AbstractC4991b
    public final EnumC4990a a() {
        return null;
    }

    @Override // od.AbstractC4991b
    public final Object b(AbstractC4825e abstractC4825e) {
        Object b02 = L4.a.b0(((C2877c) this.f26589b).f29281c, new C2392b((ConnectivityManager) this.f26588a.getSystemService(ConnectivityManager.class), new NetworkRequest.Builder().addCapability(12).build(), this, null), abstractC4825e);
        if (b02 == EnumC5000a.f41328Y) {
            return b02;
        }
        return y.f36177a;
    }

    @Override // od.AbstractC4991b
    public final e c() {
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
