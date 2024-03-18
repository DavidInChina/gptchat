package Lg;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import java.util.Iterator;
import java.util.regex.Matcher;
import kf.AbstractC4276a;
import kf.t;

/* loaded from: classes2.dex */
public final class f extends AbstractC4276a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ g f11147Y;

    public f(g gVar) {
        this.f11147Y = gVar;
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj != null && !(obj instanceof d)) {
            return false;
        }
        return super.contains((d) obj);
    }

    @Override // kf.AbstractC4276a, java.util.Collection
    public final boolean isEmpty() {
        return false;
    }

    @Override // java.util.Collection, java.lang.Iterable
    public final Iterator iterator() {
        return new Fe.o(Kg.m.n1(t.V1(new Cf.e(0, size() - 1, 1)), new Xf.f(15, this)));
    }

    @Override // kf.AbstractC4276a
    public final int r() {
        return this.f11147Y.f11148a.groupCount() + 1;
    }

    public final d s(int i10) {
        g gVar = this.f11147Y;
        Matcher matcher = gVar.f11148a;
        Cf.g D02 = N.D0(matcher.start(i10), matcher.end(i10));
        if (D02.f3106Y >= 0) {
            String group = gVar.f11148a.group(i10);
            AbstractC3557B.b0("group(...)", group);
            return new d(group, D02);
        }
        return null;
    }
}
