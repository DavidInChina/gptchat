package p2;

import android.os.Bundle;
import s2.AbstractC5530A;

/* loaded from: classes.dex */
public abstract class Q extends Exception implements AbstractC5057j {

    /* renamed from: h0  reason: collision with root package name */
    public static final String f41924h0 = Integer.toString(0, 36);

    /* renamed from: i0  reason: collision with root package name */
    public static final String f41925i0 = Integer.toString(1, 36);

    /* renamed from: j0  reason: collision with root package name */
    public static final String f41926j0 = Integer.toString(2, 36);

    /* renamed from: k0  reason: collision with root package name */
    public static final String f41927k0 = Integer.toString(3, 36);

    /* renamed from: l0  reason: collision with root package name */
    public static final String f41928l0 = Integer.toString(4, 36);

    /* renamed from: Y  reason: collision with root package name */
    public final int f41929Y;

    /* renamed from: Z  reason: collision with root package name */
    public final long f41930Z;

    static {
        int i10 = AbstractC5530A.f45131a;
    }

    public Q(String str, Throwable th2, int i10, long j6) {
        super(str, th2);
        this.f41929Y = i10;
        this.f41930Z = j6;
    }

    @Override // p2.AbstractC5057j
    public Bundle a() {
        Bundle bundle = new Bundle();
        bundle.putInt(f41924h0, this.f41929Y);
        bundle.putLong(f41925i0, this.f41930Z);
        bundle.putString(f41926j0, getMessage());
        Throwable cause = getCause();
        if (cause != null) {
            bundle.putString(f41927k0, cause.getClass().getName());
            bundle.putString(f41928l0, cause.getMessage());
        }
        return bundle;
    }
}
