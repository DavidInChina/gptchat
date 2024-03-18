package Li;

import com.google.android.gms.internal.play_billing.N;
import id.AbstractC3557B;
import jf.y;
import kotlin.jvm.internal.B;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public final class i extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ B f11229Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ a f11230Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ c f11231h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(B b10, a aVar, c cVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f11229Y = b10;
        this.f11230Z = aVar;
        this.f11231h0 = cVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        AbstractC3557B.c0("completion", abstractC4825e);
        return new i(this.f11229Y, this.f11230Z, this.f11231h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((i) create(obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        B b10 = this.f11229Y;
        b a5 = this.f11230Z.a((b) b10.f37622Y);
        b10.f37622Y = a5;
        c cVar = this.f11231h0;
        cVar.getClass();
        cVar.f11211a = a5;
        return y.f36177a;
    }
}
