package ee;

import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class z extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ C2881B f29366Y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(C2881B c2881b, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f29366Y = c2881b;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new z(this.f29366Y, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        Float valueOf = Float.valueOf(((Number) obj).floatValue());
        jf.y yVar = jf.y.f36177a;
        ((z) create(valueOf, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f29366Y.c();
        return jf.y.f36177a;
    }
}
