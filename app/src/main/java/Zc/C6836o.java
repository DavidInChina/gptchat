package zc;

import java.util.Map;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: zc.o  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6836o extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f51921Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Q f51922Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6836o(Q q10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f51922Z = q10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C6836o c6836o = new C6836o(this.f51922Z, abstractC4825e);
        c6836o.f51921Y = obj;
        return c6836o;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C6836o) create((Map) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        long j6;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        com.google.android.gms.internal.play_billing.N.B0(obj);
        Map map = (Map) this.f51921Y;
        Long l10 = (Long) map.get("Connection Latency");
        long j10 = 0;
        if (l10 != null) {
            j6 = l10.longValue();
        } else {
            j6 = 0;
        }
        Long l11 = (Long) map.get("First Listening Latency");
        if (l11 != null) {
            j10 = l11.longValue();
        }
        this.f51922Z.l(new C6835n(j6, j10));
        return jf.y.f36177a;
    }
}
