package A2;

import s2.AbstractC5530A;
import y2.C6504G;
import y2.C6520g;
import y2.SurfaceHolder$CallbackC6500C;
import z2.C6757b;
import z2.C6759d;

/* renamed from: A2.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0065i implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f558Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U3.l f559Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C6520g f560h0;

    public /* synthetic */ RunnableC0065i(U3.l lVar, C6520g c6520g, int i10) {
        this.f558Y = i10;
        this.f559Z = lVar;
        this.f560h0 = c6520g;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f558Y) {
            case 0:
                int i10 = AbstractC5530A.f45131a;
                C6504G c6504g = ((SurfaceHolder$CallbackC6500C) this.f559Z.f17424h0).f50334Y;
                c6504g.getClass();
                z2.w wVar = (z2.w) c6504g.f50379r;
                C6757b M10 = wVar.M();
                wVar.N(M10, 1007, new C6759d(M10, this.f560h0, 2));
                return;
            default:
                U3.l lVar = this.f559Z;
                C6520g c6520g = this.f560h0;
                lVar.getClass();
                synchronized (c6520g) {
                }
                int i11 = AbstractC5530A.f45131a;
                z2.w wVar2 = (z2.w) ((SurfaceHolder$CallbackC6500C) lVar.f17424h0).f50334Y.f50379r;
                C6757b J10 = wVar2.J(wVar2.f51539i0.f51534e);
                wVar2.N(J10, 1013, new C6759d(J10, c6520g, 3));
                return;
        }
    }
}
