package J2;

import android.view.Surface;
import p2.Y;
import s2.AbstractC5530A;
import y2.C6504G;
import y2.SurfaceHolder$CallbackC6500C;
import z2.C6757b;

/* loaded from: classes.dex */
public final /* synthetic */ class u implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ w f8830Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f8831Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f8832h0;

    public /* synthetic */ u(w wVar, Surface surface, long j6) {
        this.f8830Y = wVar;
        this.f8831Z = surface;
        this.f8832h0 = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w wVar = this.f8830Y;
        wVar.getClass();
        int i10 = AbstractC5530A.f45131a;
        C6504G c6504g = ((SurfaceHolder$CallbackC6500C) wVar.f8837b).f50334Y;
        z2.w wVar2 = (z2.w) c6504g.f50379r;
        C6757b M10 = wVar2.M();
        long j6 = this.f8832h0;
        Object obj = this.f8831Z;
        wVar2.N(M10, 26, new z2.s(j6, M10, obj));
        if (c6504g.f50353L == obj) {
            c6504g.f50373l.l(26, new Y(17));
        }
    }
}
