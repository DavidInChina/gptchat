package g9;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nd.AbstractC4815d;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: g9.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3212c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f31312Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C3213d f31313Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3212c(C3213d c3213d, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31313Z = c3213d;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C3212c c3212c = new C3212c(this.f31313Z, abstractC4825e);
        c3212c.f31312Y = obj;
        return c3212c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C3212c) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        F f6 = (F) this.f31312Y;
        for (AbstractC4815d abstractC4815d : this.f31313Z.f31314a) {
            Ad.l.O0(f6, abstractC4815d.c(), null, new C3211b(abstractC4815d, null), 2);
        }
        return y.f36177a;
    }
}
