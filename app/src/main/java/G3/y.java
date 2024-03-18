package G3;

import android.os.Build;

/* loaded from: classes2.dex */
public abstract class y {

    /* renamed from: a  reason: collision with root package name */
    public static final boolean f5978a = true;

    /* renamed from: b  reason: collision with root package name */
    public static final boolean f5979b = true;

    /* renamed from: c  reason: collision with root package name */
    public static final boolean f5980c;

    static {
        boolean z10 = true;
        if (Build.VERSION.SDK_INT < 28) {
            z10 = false;
        }
        f5980c = z10;
    }
}
