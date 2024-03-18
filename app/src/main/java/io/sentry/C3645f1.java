package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.util.Arrays;
import java.util.Map;

/* renamed from: io.sentry.f1  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3645f1 implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public int f34335Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34336Z;

    /* renamed from: h0  reason: collision with root package name */
    public String f34337h0;

    /* renamed from: i0  reason: collision with root package name */
    public String f34338i0;

    /* renamed from: j0  reason: collision with root package name */
    public Long f34339j0;

    /* renamed from: k0  reason: collision with root package name */
    public Map f34340k0;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C3645f1.class == obj.getClass()) {
            return Ad.l.j0(this.f34336Z, ((C3645f1) obj).f34336Z);
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34336Z});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("type");
        c3636c1.q(this.f34335Y);
        if (this.f34336Z != null) {
            c3636c1.n("address");
            c3636c1.t(this.f34336Z);
        }
        if (this.f34337h0 != null) {
            c3636c1.n("package_name");
            c3636c1.t(this.f34337h0);
        }
        if (this.f34338i0 != null) {
            c3636c1.n("class_name");
            c3636c1.t(this.f34338i0);
        }
        if (this.f34339j0 != null) {
            c3636c1.n("thread_id");
            c3636c1.s(this.f34339j0);
        }
        Map map = this.f34340k0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34340k0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
