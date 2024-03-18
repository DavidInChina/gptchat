package rb;

import android.content.Intent;
import ca.C2325q;
import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import x8.W;

/* renamed from: rb.h  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5418h extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f44690Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C5436z f44691Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ wf.k f44692h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C2325q f44693i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5418h(C2325q c2325q, C5436z c5436z, AbstractC4825e abstractC4825e, wf.k kVar) {
        super(2, abstractC4825e);
        this.f44691Z = c5436z;
        this.f44692h0 = kVar;
        this.f44693i0 = c2325q;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5418h c5418h = new C5418h(this.f44693i0, this.f44691Z, abstractC4825e, this.f44692h0);
        c5418h.f44690Y = obj;
        return c5418h;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5418h) create((Intent) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        Intent intent = (Intent) this.f44690Y;
        this.f44691Z.f44770c.getClass();
        AbstractC3557B.c0("intent", intent);
        Pc.c a5 = Pc.e.a();
        W.M(a5, "resolveIntent " + intent, null, 6);
        this.f44692h0.invoke(intent);
        return true;
    }
}
