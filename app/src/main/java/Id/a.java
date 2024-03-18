package Id;

import Kd.C0828d;
import Kd.C0830f;
import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C0830f f8543Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ int f8544Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C0830f c0830f, int i10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f8543Y = c0830f;
        this.f8544Z = i10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new a(this.f8543Y, this.f8544Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        C0830f c0830f = this.f8543Y;
        c0830f.getClass();
        Ad.l.O0(c0830f.f9733a, null, null, new C0828d(c0830f, this.f8544Z, null), 3);
        return y.f36177a;
    }
}
