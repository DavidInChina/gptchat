package g2;

import Ng.AbstractC1070k;
import Ng.C1072l;
import java.util.concurrent.CancellationException;

/* renamed from: g2.o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC3157o implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31119Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ AbstractC1070k f31120Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ A8.a f31121h0;

    public /* synthetic */ RunnableC3157o(C1072l c1072l, W3.i iVar, int i10) {
        this.f31119Y = i10;
        this.f31120Z = c1072l;
        this.f31121h0 = iVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f31119Y;
        A8.a aVar = this.f31121h0;
        AbstractC1070k abstractC1070k = this.f31120Z;
        switch (i10) {
            case 0:
                try {
                    abstractC1070k.resumeWith(aVar.get());
                    return;
                } catch (Throwable th2) {
                    Throwable cause = th2.getCause();
                    if (cause == null) {
                        cause = th2;
                    }
                    if (th2 instanceof CancellationException) {
                        abstractC1070k.s(cause);
                        return;
                    } else {
                        abstractC1070k.resumeWith(com.google.android.gms.internal.play_billing.N.w(cause));
                        return;
                    }
                }
            default:
                try {
                    abstractC1070k.resumeWith(aVar.get());
                    return;
                } catch (Throwable th3) {
                    Throwable cause2 = th3.getCause();
                    if (cause2 == null) {
                        cause2 = th3;
                    }
                    if (th3 instanceof CancellationException) {
                        abstractC1070k.s(cause2);
                        return;
                    } else {
                        abstractC1070k.resumeWith(com.google.android.gms.internal.play_billing.N.w(cause2));
                        return;
                    }
                }
        }
    }
}
