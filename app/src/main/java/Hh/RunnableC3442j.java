package hh;

import android.os.SystemClock;
import leakcanary.KeyedWeakReference;

/* renamed from: hh.j  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class RunnableC3442j implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C3443k f32360Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ String f32361Z;

    public RunnableC3442j(C3443k c3443k, String str) {
        this.f32360Y = c3443k;
        this.f32361Z = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        KeyedWeakReference keyedWeakReference;
        C3443k c3443k = this.f32360Y;
        String str = this.f32361Z;
        synchronized (c3443k) {
            do {
                keyedWeakReference = (KeyedWeakReference) c3443k.f32364c.poll();
                if (keyedWeakReference != null) {
                    c3443k.f32363b.remove(keyedWeakReference.getKey());
                    continue;
                }
            } while (keyedWeakReference != null);
            KeyedWeakReference keyedWeakReference2 = (KeyedWeakReference) c3443k.f32363b.get(str);
            if (keyedWeakReference2 != null) {
                c3443k.f32365d.getClass();
                keyedWeakReference2.setRetainedUptimeMillis(SystemClock.uptimeMillis());
                for (AbstractC3444l abstractC3444l : c3443k.f32362a) {
                    abstractC3444l.getClass();
                }
            }
        }
    }
}
