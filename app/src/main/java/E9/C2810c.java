package e9;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p9.s;
import pf.AbstractC5163j;
import wd.EnumC6206t;
import wd.q0;

/* renamed from: e9.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2810c extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f29049Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C2815h f29050Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ s f29051h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ EnumC6206t f29052i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2810c(C2815h c2815h, s sVar, EnumC6206t enumC6206t, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29050Z = c2815h;
        this.f29051h0 = sVar;
        this.f29052i0 = enumC6206t;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C2810c c2810c = new C2810c(this.f29050Z, this.f29051h0, this.f29052i0, abstractC4825e);
        c2810c.f29049Y = obj;
        return c2810c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((C2810c) create((q0) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f29050Z.f(new pd.b(A7.b.G1((q0) this.f29049Y, this.f29051h0, this.f29052i0)));
        return y.f36177a;
    }
}
