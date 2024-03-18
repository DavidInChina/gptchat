package w7;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import io.sentry.android.core.AbstractC3612c;

/* loaded from: classes2.dex */
public final class H implements Handler.Callback {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ I f48094Y;

    public /* synthetic */ H(I i10) {
        this.f48094Y = i10;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f48094Y.f48098a) {
                try {
                    C6128F c6128f = (C6128F) message.obj;
                    G g10 = (G) this.f48094Y.f48098a.get(c6128f);
                    if (g10 != null && g10.f48088b == 3) {
                        AbstractC3612c.d("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(c6128f)), new Exception());
                        ComponentName componentName = g10.f48092f;
                        if (componentName == null) {
                            c6128f.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = c6128f.f48085b;
                            A7.b.k0(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        g10.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (this.f48094Y.f48098a) {
            try {
                C6128F c6128f2 = (C6128F) message.obj;
                G g11 = (G) this.f48094Y.f48098a.get(c6128f2);
                if (g11 != null && g11.f48087a.isEmpty()) {
                    if (g11.f48089c) {
                        g11.f48093g.f48100c.removeMessages(1, g11.f48091e);
                        I i11 = g11.f48093g;
                        i11.f48101d.b(i11.f48099b, g11);
                        g11.f48089c = false;
                        g11.f48088b = 2;
                    }
                    this.f48094Y.f48098a.remove(c6128f2);
                }
            } finally {
            }
        }
        return true;
    }
}
