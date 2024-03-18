package N;

import id.AbstractC3557B;
import jf.AbstractC3953c;
import q0.C5251c;
import wf.AbstractC6216a;

/* loaded from: classes.dex */
public final /* synthetic */ class G implements AbstractC1031o, kotlin.jvm.internal.h {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC6216a f12205Y;

    public G(AbstractC6216a abstractC6216a) {
        this.f12205Y = abstractC6216a;
    }

    @Override // kotlin.jvm.internal.h
    public final AbstractC3953c a() {
        return this.f12205Y;
    }

    @Override // N.AbstractC1031o
    public final /* synthetic */ long b() {
        return ((C5251c) this.f12205Y.mo122invoke()).f43623a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC1031o) || !(obj instanceof kotlin.jvm.internal.h)) {
            return false;
        }
        return AbstractC3557B.K(this.f12205Y, ((kotlin.jvm.internal.h) obj).a());
    }

    public final int hashCode() {
        return this.f12205Y.hashCode();
    }
}
