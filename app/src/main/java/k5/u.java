package k5;

import g5.C3199a;
import h5.C3325c;
import id.AbstractC3557B;
import j5.AbstractC3910a;
import java.util.HashMap;

/* loaded from: classes2.dex */
public final class u extends com.google.android.gms.internal.play_billing.N {

    /* renamed from: l  reason: collision with root package name */
    public static final String f37081l = u.class.getSimpleName();

    /* renamed from: g  reason: collision with root package name */
    public final C3199a f37082g;

    /* renamed from: h  reason: collision with root package name */
    public final AbstractC3910a f37083h;

    /* renamed from: i  reason: collision with root package name */
    public final boolean f37084i = false;

    /* renamed from: j  reason: collision with root package name */
    public final HashMap f37085j;

    /* renamed from: k  reason: collision with root package name */
    public final C4186l f37086k;

    public u(C3199a c3199a, C.b bVar, String str, C4186l c4186l) {
        AbstractC3557B.c0("account", c3199a);
        AbstractC3557B.c0("ctOptions", c4186l);
        this.f37082g = c3199a;
        this.f37083h = bVar;
        HashMap hashMap = new HashMap();
        this.f37085j = hashMap;
        hashMap.put("returnTo", str);
        this.f37086k = c4186l;
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final void A(C3325c c3325c) {
        this.f37083h.d(c3325c);
    }

    @Override // com.google.android.gms.internal.play_billing.N
    public final boolean v0(C4181g c4181g) {
        boolean a5 = c4181g.a();
        AbstractC3910a abstractC3910a = this.f37083h;
        if (a5) {
            abstractC3910a.d(new C3325c("a0.authentication_canceled", "The user closed the browser app so the logout was cancelled."));
            return true;
        }
        abstractC3910a.a(null);
        return true;
    }
}
