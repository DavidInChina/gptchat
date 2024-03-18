package f9;

import androidx.lifecycle.AbstractC2066a;
import androidx.lifecycle.P;
import androidx.lifecycle.Y;
import id.AbstractC3557B;

/* renamed from: f9.C  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2947C extends AbstractC2066a {

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Ad.m f29767i0;

    public C2947C(Ad.m mVar) {
        this.f29767i0 = mVar;
    }

    @Override // androidx.lifecycle.AbstractC2066a
    public final Y c(String str, Class cls, P p10) {
        Y y10;
        AbstractC3557B.c0("handle", p10);
        p000if.a aVar = (p000if.a) this.f29767i0.f823d.get(cls);
        if (aVar != null) {
            y10 = (Y) aVar.get();
        } else {
            y10 = null;
        }
        if (y10 != null) {
            return y10;
        }
        throw new IllegalStateException(cls.getSimpleName().concat(" injection failed. Try rebuilding the app. Anvil fails silently generating multibinding entries, so check for other causes such as not exposing the necessary types required for injection to the app module.").toString());
    }
}
