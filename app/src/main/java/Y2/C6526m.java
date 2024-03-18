package y2;

import android.content.Context;
import android.os.Handler;
import java.util.ArrayList;
import jh.H1;

/* renamed from: y2.m  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6526m implements k0 {

    /* renamed from: a  reason: collision with root package name */
    public final Context f50654a;

    /* renamed from: b  reason: collision with root package name */
    public final H1 f50655b = new H1();

    public C6526m(Context context) {
        this.f50654a = context;
    }

    @Override // y2.k0
    public final AbstractC6519f[] c(Handler handler, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C2, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C3, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C4) {
        ArrayList arrayList = new ArrayList();
        H1 h12 = this.f50655b;
        Context context = this.f50654a;
        arrayList.add(new J2.j(context, h12, handler, surfaceHolder$CallbackC6500C));
        A2.I i10 = new A2.I(context);
        i10.f395a = false;
        i10.f396b = false;
        A2.S a5 = i10.a();
        arrayList.add(new A2.V(this.f50654a, this.f50655b, handler, surfaceHolder$CallbackC6500C2, a5));
        arrayList.add(new G2.g(surfaceHolder$CallbackC6500C3, handler.getLooper()));
        arrayList.add(new D2.b(surfaceHolder$CallbackC6500C4, handler.getLooper()));
        arrayList.add(new K2.a());
        return (AbstractC6519f[]) arrayList.toArray(new AbstractC6519f[0]);
    }
}
