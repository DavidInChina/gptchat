package z1;

import android.os.Process;

/* renamed from: z1.i  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6750i extends Thread {

    /* renamed from: Y  reason: collision with root package name */
    public final int f51458Y;

    public C6750i(Runnable runnable, String str, int i10) {
        super(runnable, str);
        this.f51458Y = i10;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(this.f51458Y);
        super.run();
    }
}
