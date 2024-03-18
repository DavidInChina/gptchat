package s2;

import android.os.Handler;
import java.util.ArrayList;

/* loaded from: classes2.dex */
public final class y implements j {

    /* renamed from: b  reason: collision with root package name */
    public static final ArrayList f45200b = new ArrayList(50);

    /* renamed from: a  reason: collision with root package name */
    public final Handler f45201a;

    public y(Handler handler) {
        this.f45201a = handler;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static x b() {
        x xVar;
        ArrayList arrayList = f45200b;
        synchronized (arrayList) {
            try {
                if (arrayList.isEmpty()) {
                    xVar = new Object();
                } else {
                    xVar = (x) arrayList.remove(arrayList.size() - 1);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return xVar;
    }

    public final x a(int i10, Object obj) {
        x b10 = b();
        b10.f45199a = this.f45201a.obtainMessage(i10, obj);
        return b10;
    }

    public final boolean c(Runnable runnable) {
        return this.f45201a.post(runnable);
    }

    public final boolean d(int i10) {
        return this.f45201a.sendEmptyMessage(i10);
    }
}
