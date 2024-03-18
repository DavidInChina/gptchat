package a7;

import Z.M;
import Z.N;
import h.C3287m;
import id.AbstractC3557B;
import kotlin.jvm.internal.o;

/* loaded from: classes2.dex */
public final class f extends o implements wf.k {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f23913Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ g f23914Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C3287m f23915h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ f(g gVar, C3287m c3287m, int i10) {
        super(1);
        this.f23913Y = i10;
        this.f23914Z = gVar;
        this.f23915h0 = c3287m;
    }

    public final M a(N n10) {
        int i10 = this.f23913Y;
        C3287m c3287m = this.f23915h0;
        g gVar = this.f23914Z;
        switch (i10) {
            case 0:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                gVar.f23920e = c3287m;
                return new e(gVar, 0);
            default:
                AbstractC3557B.c0("$this$DisposableEffect", n10);
                gVar.f23920e = c3287m;
                return new e(gVar, 1);
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        switch (this.f23913Y) {
            case 0:
                return a((N) obj);
            default:
                return a((N) obj);
        }
    }
}
