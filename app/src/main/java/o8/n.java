package o8;

import android.os.Bundle;
import u8.C5865o;

/* loaded from: classes.dex */
public final class n extends l {

    /* renamed from: d  reason: collision with root package name */
    public final C5865o f40968d = new C5865o("OnWarmUpIntegrityTokenCallback");

    /* renamed from: e  reason: collision with root package name */
    public final /* synthetic */ p f40969e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(p pVar, N7.f fVar) {
        super(pVar, fVar);
        this.f40969e = pVar;
    }

    @Override // o8.l, u8.AbstractC5864n
    public final void f(Bundle bundle) {
        super.f(bundle);
        this.f40968d.b("onWarmUpExpressIntegrityToken", new Object[0]);
        this.f40969e.f40975e.getClass();
        int i10 = bundle.getInt("error");
        C4948a c4948a = null;
        if (i10 != 0) {
            c4948a = new C4948a(i10, null);
        }
        N7.f fVar = this.f40963b;
        if (c4948a != null) {
            fVar.a(c4948a);
        } else {
            fVar.b(Long.valueOf(bundle.getLong("warm.up.sid")));
        }
    }
}
