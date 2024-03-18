package hh;

import android.os.Handler;
import java.util.concurrent.Executor;

/* renamed from: hh.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class ExecutorC3436d implements Executor {

    /* renamed from: Y  reason: collision with root package name */
    public static final ExecutorC3436d f32350Y = new Object();

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        if (AbstractC3438f.f32355b != null) {
            ((Handler) ih.c.f33250a.getValue()).postDelayed(runnable, AbstractC3438f.f32354a);
            return;
        }
        throw new IllegalStateException("AppWatcher not installed".toString());
    }
}
