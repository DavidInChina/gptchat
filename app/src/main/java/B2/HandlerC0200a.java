package B2;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.util.Pair;
import java.io.FileNotFoundException;
import java.io.IOException;
import p2.O;

/* renamed from: B2.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class HandlerC0200a extends Handler {

    /* renamed from: a  reason: collision with root package name */
    public boolean f1743a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C0203d f1744b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HandlerC0200a(C0203d c0203d, Looper looper) {
        super(looper);
        this.f1744b = c0203d;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0082 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0083  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(Message message, G g10) {
        Throwable th2;
        long j6;
        C0201b c0201b = (C0201b) message.obj;
        if (!c0201b.f1746b) {
            return false;
        }
        int i10 = c0201b.f1748d + 1;
        c0201b.f1748d = i10;
        if (i10 > this.f1744b.f1759j.a0(3)) {
            return false;
        }
        SystemClock.elapsedRealtime();
        SystemClock.elapsedRealtime();
        if (g10.getCause() instanceof IOException) {
            th2 = (IOException) g10.getCause();
        } else {
            th2 = new IOException(g10.getCause());
        }
        R4.a aVar = this.f1744b.f1759j;
        int i11 = c0201b.f1748d;
        aVar.getClass();
        if (!(th2 instanceof O) && !(th2 instanceof FileNotFoundException) && !(th2 instanceof v2.v) && !(th2 instanceof I2.m)) {
            int i12 = v2.i.f47077Z;
            while (th2 != null) {
                if (!(th2 instanceof v2.i) || ((v2.i) th2).f47078Y != 2008) {
                    th2 = th2.getCause();
                }
            }
            j6 = Math.min((i11 - 1) * 1000, 5000);
            if (j6 != -9223372036854775807L) {
                return false;
            }
            synchronized (this) {
                try {
                    if (this.f1743a) {
                        return false;
                    }
                    sendMessageDelayed(Message.obtain(message), j6);
                    return true;
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }
        j6 = -9223372036854775807L;
        if (j6 != -9223372036854775807L) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Throwable, java.lang.Exception] */
    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        byte[] bArr;
        C0201b c0201b = (C0201b) message.obj;
        try {
            int i10 = message.what;
            if (i10 != 0) {
                if (i10 == 1) {
                    C0203d c0203d = this.f1744b;
                    bArr = c0203d.f1761l.d(c0203d.f1762m, (w) c0201b.f1747c);
                } else {
                    throw new RuntimeException();
                }
            } else {
                bArr = this.f1744b.f1761l.f((x) c0201b.f1747c);
            }
        } catch (G e10) {
            boolean a5 = a(message, e10);
            bArr = e10;
            if (a5) {
                return;
            }
        } catch (Exception e11) {
            s2.p.h("DefaultDrmSession", "Key/provisioning request produced an unexpected exception. Not retrying.", e11);
            bArr = e11;
        }
        R4.a aVar = this.f1744b.f1759j;
        long j6 = c0201b.f1745a;
        aVar.getClass();
        synchronized (this) {
            try {
                if (!this.f1743a) {
                    this.f1744b.f1764o.obtainMessage(message.what, Pair.create(c0201b.f1747c, bArr)).sendToTarget();
                }
            } finally {
            }
        }
    }
}
