package Xe;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;

/* loaded from: classes.dex */
public final class C {

    /* renamed from: a  reason: collision with root package name */
    public final int f21850a;

    /* renamed from: b  reason: collision with root package name */
    public final int f21851b;

    /* renamed from: c  reason: collision with root package name */
    public final int f21852c;

    public C(int i10, int i11, int i12) {
        this.f21850a = i10;
        this.f21851b = i11;
        this.f21852c = i12;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C)) {
            return false;
        }
        C c10 = (C) obj;
        if (this.f21850a == c10.f21850a && this.f21851b == c10.f21851b && this.f21852c == c10.f21852c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((this.f21850a * 31) + this.f21851b) * 31) + this.f21852c;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VideoCaptureParameter(width=");
        sb2.append(this.f21850a);
        sb2.append(", height=");
        sb2.append(this.f21851b);
        sb2.append(", maxFps=");
        return AbstractC2469q0.j(sb2, this.f21852c, ')');
    }
}
