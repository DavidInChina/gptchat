package u4;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import f4.q;
import java.lang.ref.WeakReference;
import jf.AbstractC3957g;
import jf.y;

/* loaded from: classes2.dex */
public final class k implements ComponentCallbacks2, p4.e {

    /* renamed from: Y  reason: collision with root package name */
    public final WeakReference f46405Y;

    /* renamed from: Z  reason: collision with root package name */
    public Context f46406Z;

    /* renamed from: h0  reason: collision with root package name */
    public p4.f f46407h0;

    /* renamed from: i0  reason: collision with root package name */
    public boolean f46408i0;

    /* renamed from: j0  reason: collision with root package name */
    public boolean f46409j0 = true;

    public k(q qVar) {
        this.f46405Y = new WeakReference(qVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final synchronized void a() {
        y yVar;
        p4.f fVar;
        try {
            q qVar = (q) this.f46405Y.get();
            if (qVar != null) {
                if (this.f46407h0 == null) {
                    if (qVar.f29636e.f46399b) {
                        fVar = U3.f.d(qVar.f29632a, this);
                    } else {
                        fVar = new Object();
                    }
                    this.f46407h0 = fVar;
                    this.f46409j0 = fVar.c();
                }
                yVar = y.f36177a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void b() {
        try {
            if (this.f46408i0) {
                return;
            }
            this.f46408i0 = true;
            Context context = this.f46406Z;
            if (context != null) {
                context.unregisterComponentCallbacks(this);
            }
            p4.f fVar = this.f46407h0;
            if (fVar != null) {
                fVar.shutdown();
            }
            this.f46405Y.clear();
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onConfigurationChanged(Configuration configuration) {
        y yVar;
        try {
            if (((q) this.f46405Y.get()) != null) {
                yVar = y.f36177a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // android.content.ComponentCallbacks
    public final synchronized void onLowMemory() {
        onTrimMemory(80);
    }

    @Override // android.content.ComponentCallbacks2
    public final synchronized void onTrimMemory(int i10) {
        y yVar;
        o4.f fVar;
        try {
            q qVar = (q) this.f46405Y.get();
            if (qVar != null) {
                AbstractC3957g abstractC3957g = qVar.f29634c;
                if (abstractC3957g != null && (fVar = (o4.f) abstractC3957g.getValue()) != null) {
                    fVar.f40586a.b(i10);
                    fVar.f40587b.b(i10);
                }
                yVar = y.f36177a;
            } else {
                yVar = null;
            }
            if (yVar == null) {
                b();
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }
}
