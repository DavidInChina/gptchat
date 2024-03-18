package Kd;

import A2.V;
import A2.Z;
import android.content.Context;
import android.os.Handler;
import id.AbstractC3557B;
import p2.S;
import q2.AbstractC5264d;
import y2.AbstractC6519f;
import y2.SurfaceHolder$CallbackC6500C;
import y2.k0;

/* loaded from: classes2.dex */
public final class n implements k0, q2.e {

    /* renamed from: a  reason: collision with root package name */
    public final Context f9750a;

    /* renamed from: b  reason: collision with root package name */
    public final Z f9751b;

    public n(Context context, C0832h c0832h) {
        AbstractC3557B.c0("context", context);
        this.f9750a = context;
        this.f9751b = new Z(c0832h);
    }

    @Override // q2.e
    public final S b(S s10) {
        AbstractC3557B.c0("parameters", s10);
        return s10;
    }

    @Override // y2.k0
    public final AbstractC6519f[] c(Handler handler, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C2, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C3, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C4) {
        Context context = this.f9750a;
        A2.I i10 = new A2.I(context);
        i10.f400f = this;
        return new V[]{new V(context, C2.i.f2545f, handler, surfaceHolder$CallbackC6500C2, i10.a())};
    }

    @Override // q2.e
    public final long d() {
        return 0L;
    }

    @Override // q2.e
    public final AbstractC5264d[] f() {
        return new Z[]{this.f9751b};
    }

    @Override // q2.e
    public final long a(long j6) {
        return j6;
    }

    @Override // q2.e
    public final boolean e(boolean z10) {
        return z10;
    }
}
