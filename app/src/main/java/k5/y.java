package k5;

import com.auth0.android.result.Credentials;
import g5.C3200b;
import h5.C3325c;
import j5.AbstractC3910a;
import java.security.InvalidKeyException;
import java.security.PublicKey;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y implements AbstractC3910a {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f37091Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f37092Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Object f37093h0;

    public /* synthetic */ y(Object obj, int i10, Object obj2) {
        this.f37091Y = i10;
        this.f37092Z = obj;
        this.f37093h0 = obj2;
    }

    @Override // j5.AbstractC3910a
    public final void a(Object obj) {
        int i10 = this.f37091Y;
        Object obj2 = this.f37092Z;
        Object obj3 = this.f37093h0;
        switch (i10) {
            case 0:
                Void r52 = (Void) obj;
                ((z) obj2).f37096h.a((Credentials) obj3);
                return;
            default:
                String str = (String) obj2;
                try {
                    ((AbstractC3910a) obj3).a(new C4175a((PublicKey) ((Map) obj).get(str)));
                    return;
                } catch (InvalidKeyException unused) {
                    ((AbstractC3910a) obj3).d(new G(str));
                    return;
                }
        }
    }

    @Override // j5.AbstractC3910a
    public final void d(C3200b c3200b) {
        int i10 = this.f37091Y;
        Object obj = this.f37092Z;
        switch (i10) {
            case 0:
                ((z) obj).f37096h.d(new C3200b("Could not verify the ID token", c3200b));
                return;
            default:
                C3325c c3325c = (C3325c) c3200b;
                ((AbstractC3910a) this.f37093h0).d(new G((String) obj));
                return;
        }
    }
}
