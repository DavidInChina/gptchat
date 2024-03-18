package mb;

import Ng.D0;
import Ng.Q;
import android.net.Uri;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;
import y2.C6504G;

/* renamed from: mb.m  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4600m extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C4603p f39073Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Uri f39074Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4600m(C4603p c4603p, Uri uri, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39073Y = c4603p;
        this.f39074Z = uri;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4600m(this.f39073Y, this.f39074Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C4600m) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C4603p c4603p = this.f39073Y;
        D0 d02 = c4603p.f39084f;
        if (d02 != null) {
            d02.k(null);
        }
        Tg.e eVar = Q.f12904a;
        c4603p.f39084f = Ad.l.O0(c4603p.f39079a, Sg.u.f16684a, null, new C4601n(c4603p, null), 2);
        Pc.c a5 = Pc.e.a();
        StringBuilder sb2 = new StringBuilder("setAndPlay uri: ");
        Uri uri = this.f39074Z;
        sb2.append(uri);
        W.F(a5, sb2.toString(), null, 6);
        p2.H b10 = p2.H.b(uri);
        C6504G c6504g = c4603p.f39085g;
        c6504g.b(b10);
        c6504g.u();
        c6504g.x(true);
        return jf.y.f36177a;
    }
}
