package Wh;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;
import wf.AbstractC6216a;

/* renamed from: Wh.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1662g {

    /* renamed from: c  reason: collision with root package name */
    public static final C1662g f21185c = new C1662g(kf.t.P2(new ArrayList()), null);

    /* renamed from: a  reason: collision with root package name */
    public final Set f21186a;

    /* renamed from: b  reason: collision with root package name */
    public final A7.b f21187b;

    public C1662g(Set set, A7.b bVar) {
        AbstractC3557B.c0("pins", set);
        this.f21186a = set;
        this.f21187b = bVar;
    }

    public final void a(String str, AbstractC6216a abstractC6216a) {
        AbstractC3557B.c0("hostname", str);
        Iterator it = this.f21186a.iterator();
        if (!it.hasNext()) {
            return;
        }
        AbstractC2469q0.p(it.next());
        throw null;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C1662g) {
            C1662g c1662g = (C1662g) obj;
            if (AbstractC3557B.K(c1662g.f21186a, this.f21186a) && AbstractC3557B.K(c1662g.f21187b, this.f21187b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int hashCode = (this.f21186a.hashCode() + 1517) * 41;
        A7.b bVar = this.f21187b;
        if (bVar != null) {
            i10 = bVar.hashCode();
        } else {
            i10 = 0;
        }
        return hashCode + i10;
    }
}
