package J2;

import s2.AbstractC5530A;
import y2.SurfaceHolder$CallbackC6500C;
import z2.C6757b;

/* loaded from: classes.dex */
public final /* synthetic */ class t implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8826Y = 0;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ w f8827Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ long f8828h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ int f8829i0;

    public /* synthetic */ t(w wVar, int i10, long j6) {
        this.f8827Z = wVar;
        this.f8829i0 = i10;
        this.f8828h0 = j6;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f8826Y;
        w wVar = this.f8827Z;
        wVar.getClass();
        switch (i10) {
            case 0:
                int i11 = AbstractC5530A.f45131a;
                z2.w wVar2 = (z2.w) ((SurfaceHolder$CallbackC6500C) wVar.f8837b).f50334Y.f50379r;
                C6757b J10 = wVar2.J(wVar2.f51539i0.f51534e);
                wVar2.N(J10, 1018, new z2.o(this.f8829i0, this.f8828h0, J10));
                return;
            default:
                int i12 = AbstractC5530A.f45131a;
                z2.w wVar3 = (z2.w) ((SurfaceHolder$CallbackC6500C) wVar.f8837b).f50334Y.f50379r;
                C6757b J11 = wVar3.J(wVar3.f51539i0.f51534e);
                wVar3.N(J11, 1021, new z2.o(this.f8829i0, 1, this.f8828h0, J11));
                return;
        }
    }

    public /* synthetic */ t(w wVar, long j6, int i10) {
        this.f8827Z = wVar;
        this.f8828h0 = j6;
        this.f8829i0 = i10;
    }
}
