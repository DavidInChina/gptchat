package Z;

import android.os.Looper;

/* renamed from: Z.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1703c {

    /* renamed from: a  reason: collision with root package name */
    public static final long f22605a;

    /* renamed from: b  reason: collision with root package name */
    public static final /* synthetic */ int f22606b = 0;

    static {
        long j6;
        R4.b.D1(C1701b.f22600Y);
        try {
            j6 = Looper.getMainLooper().getThread().getId();
        } catch (Exception unused) {
            j6 = -1;
        }
        f22605a = j6;
    }
}
