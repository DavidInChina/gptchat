package o8;

import android.os.Bundle;
import u8.C5865o;

/* loaded from: classes.dex */
public final class m extends l {

    /* renamed from: d  reason: collision with root package name */
    public final C5865o f40965d = new C5865o("OnRequestIntegrityTokenCallback");

    /* renamed from: e  reason: collision with root package name */
    public final long f40966e;

    /* renamed from: f  reason: collision with root package name */
    public final /* synthetic */ p f40967f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(p pVar, N7.f fVar, long j6) {
        super(pVar, fVar);
        this.f40967f = pVar;
        this.f40966e = j6;
    }

    @Override // o8.l, u8.AbstractC5864n
    public final void d(Bundle bundle) {
        super.d(bundle);
        this.f40965d.b("onRequestExpressIntegrityToken", new Object[0]);
        p pVar = this.f40967f;
        pVar.f40975e.getClass();
        int i10 = bundle.getInt("error");
        C4948a c4948a = null;
        if (i10 != 0) {
            c4948a = new C4948a(i10, null);
        }
        N7.f fVar = this.f40963b;
        if (c4948a != null) {
            fVar.a(c4948a);
            return;
        }
        androidx.appcompat.view.m mVar = new androidx.appcompat.view.m(this, pVar.f40972b, bundle.getLong("request.token.sid"));
        U3.e eVar = new U3.e(15);
        String string = bundle.getString("token");
        if (string != null) {
            eVar.f17400Y = string;
            eVar.f17401Z = mVar;
            fVar.b(new r(string, mVar));
            return;
        }
        throw new NullPointerException("Null token");
    }
}
