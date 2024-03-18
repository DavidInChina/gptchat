package S0;

import android.os.Build;

/* loaded from: classes2.dex */
public final class F {

    /* renamed from: a  reason: collision with root package name */
    public final f8.e f15978a;

    public F() {
        f8.e eVar;
        if (Build.VERSION.SDK_INT >= 28) {
            eVar = new f8.e(0);
        } else {
            eVar = new f8.e(1);
        }
        this.f15978a = eVar;
    }
}
