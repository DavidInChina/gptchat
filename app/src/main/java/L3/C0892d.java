package L3;

import android.os.Build;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.Set;
import z.AbstractC6708l;

/* renamed from: L3.d  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0892d {

    /* renamed from: i  reason: collision with root package name */
    public static final C0892d f10698i = new C0892d(1, false, false, false, false, -1, -1, kf.x.f37485Y);

    /* renamed from: a  reason: collision with root package name */
    public final int f10699a;

    /* renamed from: b  reason: collision with root package name */
    public final boolean f10700b;

    /* renamed from: c  reason: collision with root package name */
    public final boolean f10701c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f10702d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f10703e;

    /* renamed from: f  reason: collision with root package name */
    public final long f10704f;

    /* renamed from: g  reason: collision with root package name */
    public final long f10705g;

    /* renamed from: h  reason: collision with root package name */
    public final Set f10706h;

    public C0892d(int i10, boolean z10, boolean z11, boolean z12, boolean z13, long j6, long j10, Set set) {
        AbstractC2469q0.q("requiredNetworkType", i10);
        AbstractC3557B.c0("contentUriTriggers", set);
        this.f10699a = i10;
        this.f10700b = z10;
        this.f10701c = z11;
        this.f10702d = z12;
        this.f10703e = z13;
        this.f10704f = j6;
        this.f10705g = j10;
        this.f10706h = set;
    }

    public final boolean a() {
        if (Build.VERSION.SDK_INT < 24 || (!this.f10706h.isEmpty())) {
            return true;
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !AbstractC3557B.K(C0892d.class, obj.getClass())) {
            return false;
        }
        C0892d c0892d = (C0892d) obj;
        if (this.f10700b != c0892d.f10700b || this.f10701c != c0892d.f10701c || this.f10702d != c0892d.f10702d || this.f10703e != c0892d.f10703e || this.f10704f != c0892d.f10704f || this.f10705g != c0892d.f10705g || this.f10699a != c0892d.f10699a) {
            return false;
        }
        return AbstractC3557B.K(this.f10706h, c0892d.f10706h);
    }

    public final int hashCode() {
        long j6 = this.f10704f;
        long j10 = this.f10705g;
        return this.f10706h.hashCode() + (((((((((((((AbstractC6708l.f(this.f10699a) * 31) + (this.f10700b ? 1 : 0)) * 31) + (this.f10701c ? 1 : 0)) * 31) + (this.f10702d ? 1 : 0)) * 31) + (this.f10703e ? 1 : 0)) * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31) + ((int) (j10 ^ (j10 >>> 32)))) * 31);
    }

    public final String toString() {
        return "Constraints{requiredNetworkType=" + E9.f.Q(this.f10699a) + ", requiresCharging=" + this.f10700b + ", requiresDeviceIdle=" + this.f10701c + ", requiresBatteryNotLow=" + this.f10702d + ", requiresStorageNotLow=" + this.f10703e + ", contentTriggerUpdateDelayMillis=" + this.f10704f + ", contentTriggerMaxDelayMillis=" + this.f10705g + ", contentUriTriggers=" + this.f10706h + ", }";
    }

    public C0892d(C0892d c0892d) {
        AbstractC3557B.c0("other", c0892d);
        this.f10700b = c0892d.f10700b;
        this.f10701c = c0892d.f10701c;
        this.f10699a = c0892d.f10699a;
        this.f10702d = c0892d.f10702d;
        this.f10703e = c0892d.f10703e;
        this.f10706h = c0892d.f10706h;
        this.f10704f = c0892d.f10704f;
        this.f10705g = c0892d.f10705g;
    }
}
