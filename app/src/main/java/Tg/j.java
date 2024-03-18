package Tg;

import Ng.H;
import jh.H1;

/* loaded from: classes.dex */
public final class j extends i {

    /* renamed from: h0  reason: collision with root package name */
    public final Runnable f17253h0;

    public j(Runnable runnable, long j6, H1 h12) {
        super(j6, h12);
        this.f17253h0 = runnable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.f17253h0.run();
        } finally {
            this.f17252Z.getClass();
        }
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Task[");
        Runnable runnable = this.f17253h0;
        sb2.append(runnable.getClass().getSimpleName());
        sb2.append('@');
        sb2.append(H.q(runnable));
        sb2.append(", ");
        sb2.append(this.f17251Y);
        sb2.append(", ");
        sb2.append(this.f17252Z);
        sb2.append(']');
        return sb2.toString();
    }
}
