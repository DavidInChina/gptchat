package T3;

import android.app.Notification;
import android.os.Build;
import androidx.work.impl.foreground.SystemForegroundService;

/* loaded from: classes2.dex */
public final class d implements Runnable {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f16901Y = 1;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f16902Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ int f16903h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f16904i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ Object f16905j0;

    public d(SystemForegroundService systemForegroundService, int i10, Notification notification, int i11) {
        this.f16905j0 = systemForegroundService;
        this.f16902Z = i10;
        this.f16904i0 = notification;
        this.f16903h0 = i11;
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i10 = this.f16901Y;
        Object obj = this.f16905j0;
        Object obj2 = this.f16904i0;
        int i11 = this.f16903h0;
        int i12 = this.f16902Z;
        switch (i10) {
            case 0:
                int i13 = Build.VERSION.SDK_INT;
                if (i13 >= 31) {
                    g.a((SystemForegroundService) obj, i12, (Notification) obj2, i11);
                    return;
                } else if (i13 >= 29) {
                    f.a((SystemForegroundService) obj, i12, (Notification) obj2, i11);
                    return;
                } else {
                    ((SystemForegroundService) obj).startForeground(i12, (Notification) obj2);
                    return;
                }
        }
        while (i12 < i11) {
            int i14 = i12 * 2;
            int i15 = i14 + 1;
            float[] fArr = (float[]) obj2;
            float f6 = fArr[i14];
            float[] fArr2 = ((Ai.d) obj).f1010s;
            float f10 = fArr2[i15];
            float f11 = fArr[i15];
            float f12 = fArr2[i14];
            fArr[i14] = (f6 * f12) - (f11 * f10);
            fArr[i15] = (f11 * f12) + (f6 * f10);
            i12++;
        }
    }

    public d(Ai.d dVar, int i10, int i11, float[] fArr) {
        this.f16905j0 = dVar;
        this.f16902Z = i10;
        this.f16903h0 = i11;
        this.f16904i0 = fArr;
    }
}
