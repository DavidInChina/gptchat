package ub;

import Ng.F;
import Z.AbstractC1710f0;
import com.google.android.gms.internal.play_billing.N;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: ub.A  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5872A extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ AbstractC1710f0 f46509Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ boolean f46510Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5872A(AbstractC1710f0 abstractC1710f0, AbstractC4825e abstractC4825e, boolean z10) {
        super(2, abstractC4825e);
        this.f46509Y = abstractC1710f0;
        this.f46510Z = z10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C5872A(this.f46509Y, abstractC4825e, this.f46510Z);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        jf.y yVar = jf.y.f36177a;
        ((C5872A) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        this.f46509Y.setValue(Boolean.valueOf(this.f46510Z));
        return jf.y.f36177a;
    }
}
