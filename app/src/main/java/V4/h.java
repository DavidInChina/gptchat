package v4;

import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Semaphore;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f47182Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ l f47183Z;

    public /* synthetic */ h(l lVar, int i10) {
        this.f47182Y = i10;
        this.f47183Z = lVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f47182Y;
        l lVar = this.f47183Z;
        switch (i10) {
            case 0:
                Semaphore semaphore = lVar.f47200J0;
                E4.c cVar = lVar.f47219q0;
                if (cVar != null) {
                    try {
                        semaphore.acquire();
                        cVar.o(lVar.f47209Z.d());
                        if (l.f47188R0 && lVar.f47199I0) {
                            if (lVar.f47201K0 == null) {
                                lVar.f47201K0 = new Handler(Looper.getMainLooper());
                                lVar.f47202L0 = new h(lVar, 1);
                            }
                            lVar.f47201K0.post(lVar.f47202L0);
                        }
                    } catch (InterruptedException unused) {
                    } catch (Throwable th2) {
                        semaphore.release();
                        throw th2;
                    }
                    semaphore.release();
                    return;
                }
                return;
            default:
                Drawable.Callback callback = lVar.getCallback();
                if (callback != null) {
                    callback.invalidateDrawable(lVar);
                    return;
                }
                return;
        }
    }
}
