package J2;

import s2.AbstractC5530A;
import y2.C6504G;
import y2.C6520g;
import y2.SurfaceHolder$CallbackC6500C;
import z2.C6757b;
import z2.C6759d;

/* loaded from: classes.dex */
public final /* synthetic */ class v implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8833Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ w f8834Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6520g f8835h0;

    public /* synthetic */ v(w wVar, C6520g c6520g, int i10) {
        this.f8833Y = i10;
        this.f8834Z = wVar;
        this.f8835h0 = c6520g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f8833Y) {
            case 0:
                w wVar = this.f8834Z;
                wVar.getClass();
                int i10 = AbstractC5530A.f45131a;
                C6504G c6504g = ((SurfaceHolder$CallbackC6500C) wVar.f8837b).f50334Y;
                c6504g.getClass();
                z2.w wVar2 = (z2.w) c6504g.f50379r;
                C6757b M10 = wVar2.M();
                wVar2.N(M10, 1015, new C6759d(M10, this.f8835h0, 1));
                return;
            default:
                w wVar3 = this.f8834Z;
                C6520g c6520g = this.f8835h0;
                wVar3.getClass();
                synchronized (c6520g) {
                }
                x xVar = wVar3.f8837b;
                int i11 = AbstractC5530A.f45131a;
                z2.w wVar4 = (z2.w) ((SurfaceHolder$CallbackC6500C) xVar).f50334Y.f50379r;
                C6757b J10 = wVar4.J(wVar4.f51539i0.f51534e);
                wVar4.N(J10, 1020, new C6759d(J10, c6520g, 0));
                return;
        }
    }
}
