package A2;

import s2.AbstractC5530A;
import y2.SurfaceHolder$CallbackC6500C;
import z2.C6757b;

/* renamed from: A2.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0066j implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f561Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ U3.l f562Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Exception f563h0;

    public /* synthetic */ RunnableC0066j(U3.l lVar, Exception exc, int i10) {
        this.f561Y = i10;
        this.f562Z = lVar;
        this.f563h0 = exc;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f561Y;
        Exception exc = this.f563h0;
        U3.l lVar = this.f562Z;
        switch (i10) {
            case 0:
                int i11 = AbstractC5530A.f45131a;
                z2.w wVar = (z2.w) ((SurfaceHolder$CallbackC6500C) lVar.f17424h0).f50334Y.f50379r;
                C6757b M10 = wVar.M();
                wVar.N(M10, 1029, new z2.m(M10, exc, 1));
                return;
            default:
                int i12 = AbstractC5530A.f45131a;
                z2.w wVar2 = (z2.w) ((SurfaceHolder$CallbackC6500C) lVar.f17424h0).f50334Y.f50379r;
                C6757b M11 = wVar2.M();
                wVar2.N(M11, 1014, new z2.m(M11, exc, 2));
                return;
        }
    }
}
