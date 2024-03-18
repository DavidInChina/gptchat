package N;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import nf.AbstractC4828h;

/* renamed from: N.q  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1033q {

    /* renamed from: a  reason: collision with root package name */
    public final long f12395a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12396b;

    /* renamed from: c  reason: collision with root package name */
    public final int f12397c;

    /* renamed from: d  reason: collision with root package name */
    public final int f12398d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12399e;

    /* renamed from: f  reason: collision with root package name */
    public final N0.C f12400f;

    public C1033q(long j6, int i10, int i11, int i12, int i13, N0.C c10) {
        this.f12395a = j6;
        this.f12396b = i10;
        this.f12397c = i11;
        this.f12398d = i12;
        this.f12399e = i13;
        this.f12400f = c10;
    }

    public final r a(int i10) {
        return new r(AbstractC4828h.P(this.f12400f, i10), i10, this.f12395a);
    }

    public final int b() {
        int i10 = this.f12397c;
        int i11 = this.f12398d;
        if (i10 < i11) {
            return 2;
        }
        if (i10 > i11) {
            return 1;
        }
        return 3;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=");
        sb2.append(this.f12395a);
        sb2.append(", range=(");
        int i10 = this.f12397c;
        sb2.append(i10);
        sb2.append('-');
        N0.C c10 = this.f12400f;
        sb2.append(AbstractC4828h.P(c10, i10));
        sb2.append(',');
        int i11 = this.f12398d;
        sb2.append(i11);
        sb2.append('-');
        sb2.append(AbstractC4828h.P(c10, i11));
        sb2.append("), prevOffset=");
        return AbstractC2469q0.j(sb2, this.f12399e, ')');
    }
}
