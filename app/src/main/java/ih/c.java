package ih;

import android.os.Looper;
import id.AbstractC3557B;
import jf.C3963m;

/* loaded from: classes2.dex */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    public static final C3963m f33250a = R4.b.D1(C3585b.f33247Z);

    public static final void a() {
        boolean z10;
        Looper mainLooper = Looper.getMainLooper();
        AbstractC3557B.Y("Looper.getMainLooper()", mainLooper);
        if (mainLooper.getThread() == Thread.currentThread()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (z10) {
            return;
        }
        throw new IllegalStateException(("Should be called from the main thread, not " + Thread.currentThread()).toString());
    }
}
