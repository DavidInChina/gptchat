package io.sentry;

import java.util.TimerTask;

/* loaded from: classes2.dex */
public final class u1 extends TimerTask {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f34770Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ w1 f34771Z;

    public /* synthetic */ u1(w1 w1Var, int i10) {
        this.f34770Y = i10;
        this.f34771Z = w1Var;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        boolean z10;
        int i10 = this.f34770Y;
        w1 w1Var = this.f34771Z;
        switch (i10) {
            case 0:
                C1 a5 = w1Var.a();
                if (a5 == null) {
                    a5 = C1.OK;
                }
                w1Var.u(a5, null);
                w1Var.f34812k.set(false);
                return;
            default:
                C1 a10 = w1Var.a();
                if (a10 == null) {
                    a10 = C1.DEADLINE_EXCEEDED;
                }
                if (w1Var.f34819r.f33812g != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                w1Var.g(a10, z10, null);
                w1Var.f34813l.set(false);
                return;
        }
    }
}
