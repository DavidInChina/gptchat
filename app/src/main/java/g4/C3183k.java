package g4;

import Qg.AbstractC1207j;
import id.AbstractC3557B;
import jf.AbstractC3953c;
import kotlin.jvm.internal.C4302a;
import nf.AbstractC4825e;
import of.EnumC5000a;

/* renamed from: g4.k  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3183k implements AbstractC1207j, kotlin.jvm.internal.h {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C3188p f31227Y;

    public C3183k(C3188p c3188p) {
        this.f31227Y = c3188p;
    }

    @Override // kotlin.jvm.internal.h
    public final AbstractC3953c a() {
        return new C4302a(2, this.f31227Y, C3188p.class, "updateState", "updateState(Lcoil/compose/AsyncImagePainter$State;)V");
    }

    @Override // Qg.AbstractC1207j
    public final Object c(Object obj, AbstractC4825e abstractC4825e) {
        this.f31227Y.k((AbstractC3181i) obj);
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        return jf.y.f36177a;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof AbstractC1207j) || !(obj instanceof kotlin.jvm.internal.h)) {
            return false;
        }
        return AbstractC3557B.K(a(), ((kotlin.jvm.internal.h) obj).a());
    }

    public final int hashCode() {
        return a().hashCode();
    }
}
