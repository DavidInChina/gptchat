package Z1;

import android.content.Context;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* renamed from: Z1.n  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1772n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f23035Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ N f23036Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f23037h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C1754c f23038i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1772n(N n10, Context context, C1754c c1754c, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f23036Z = n10;
        this.f23037h0 = context;
        this.f23038i0 = c1754c;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C1772n(this.f23036Z, this.f23037h0, this.f23038i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C1772n) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f23035Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
                return jf.y.f36177a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        com.google.android.gms.internal.play_billing.N.B0(obj);
        this.f23035Y = 1;
        this.f23036Z.b(this.f23037h0, this);
        return enumC5000a;
    }
}
