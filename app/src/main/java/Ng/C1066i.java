package Ng;

import java.util.concurrent.Future;

/* renamed from: Ng.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1066i extends AbstractC1068j {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f12945Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Object f12946Z;

    public C1066i(int i10, Object obj) {
        this.f12945Y = i10;
        this.f12946Z = obj;
    }

    @Override // Ng.AbstractC1068j
    public final void a(Throwable th2) {
        int i10 = this.f12945Y;
        Object obj = this.f12946Z;
        switch (i10) {
            case 0:
                if (th2 != null) {
                    ((Future) obj).cancel(false);
                    return;
                }
                return;
            case 1:
                ((T) obj).dispose();
                return;
            default:
                ((wf.k) obj).invoke(th2);
                return;
        }
    }

    @Override // wf.k
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        jf.y yVar = jf.y.f36177a;
        switch (this.f12945Y) {
            case 0:
                a((Throwable) obj);
                return yVar;
            case 1:
                a((Throwable) obj);
                return yVar;
            default:
                a((Throwable) obj);
                return yVar;
        }
    }

    public final String toString() {
        int i10 = this.f12945Y;
        Object obj = this.f12946Z;
        switch (i10) {
            case 0:
                return "CancelFutureOnCancel[" + ((Future) obj) + ']';
            case 1:
                return "DisposeOnCancel[" + ((T) obj) + ']';
            default:
                return "InvokeOnCancel[" + ((wf.k) obj).getClass().getSimpleName() + '@' + H.q(this) + ']';
        }
    }
}
