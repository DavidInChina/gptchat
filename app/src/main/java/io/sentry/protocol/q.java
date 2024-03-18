package io.sentry.protocol;

import android.gov.nist.javax.sip.header.ParameterNames;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import io.sentry.AbstractC3656j0;
import io.sentry.AbstractC3693x0;
import io.sentry.C3636c1;
import io.sentry.H;
import java.util.Arrays;
import java.util.Map;
import java.util.Set;

/* loaded from: classes2.dex */
public final class q implements AbstractC3656j0 {

    /* renamed from: Y  reason: collision with root package name */
    public String f34607Y;

    /* renamed from: Z  reason: collision with root package name */
    public String f34608Z;

    /* renamed from: h0  reason: collision with root package name */
    public Set f34609h0;

    /* renamed from: i0  reason: collision with root package name */
    public Set f34610i0;

    /* renamed from: j0  reason: collision with root package name */
    public Map f34611j0;

    public q(String str, String str2) {
        this.f34607Y = str;
        this.f34608Z = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || q.class != obj.getClass()) {
            return false;
        }
        q qVar = (q) obj;
        if (this.f34607Y.equals(qVar.f34607Y) && this.f34608Z.equals(qVar.f34608Z)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f34607Y, this.f34608Z});
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("name");
        c3636c1.t(this.f34607Y);
        c3636c1.n(ParameterNames.VERSION);
        c3636c1.t(this.f34608Z);
        Set set = this.f34609h0;
        if (set == null) {
            set = (Set) C3636c1.l().f34286h0;
        }
        Set set2 = this.f34610i0;
        if (set2 == null) {
            set2 = (Set) C3636c1.l().f34285Z;
        }
        if (!set.isEmpty()) {
            c3636c1.n("packages");
            c3636c1.v(h10, set);
        }
        if (!set2.isEmpty()) {
            c3636c1.n("integrations");
            c3636c1.v(h10, set2);
        }
        Map map = this.f34611j0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f34611j0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
