package mh;

import nf.AbstractC4825e;
import of.EnumC5000a;
import oh.C5017d;
import pf.AbstractC5163j;
import z.AbstractC6696f;
import z.C6697f0;
import z.C6716p;

/* renamed from: mh.n  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4684n extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39471Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4672b f39472Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4672b f39473h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C4674d f39474i0;

    /* renamed from: j0  reason: collision with root package name */
    public final /* synthetic */ long f39475j0;

    /* renamed from: k0  reason: collision with root package name */
    public final /* synthetic */ C4686p f39476k0;

    /* renamed from: l0  reason: collision with root package name */
    public final /* synthetic */ long f39477l0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4684n(C4672b c4672b, C4672b c4672b2, C4674d c4674d, long j6, C4686p c4686p, long j10, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39472Z = c4672b;
        this.f39473h0 = c4672b2;
        this.f39474i0 = c4674d;
        this.f39475j0 = j6;
        this.f39476k0 = c4686p;
        this.f39477l0 = j10;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4684n(this.f39472Z, this.f39473h0, this.f39474i0, this.f39475j0, this.f39476k0, this.f39477l0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4684n) create((C5017d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39471Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C6716p b10 = AbstractC6696f.b(0.0f, 0.0f, 30);
            Float f6 = new Float(1.0f);
            C6697f0 u10 = AbstractC6696f.u(0.0f, 400.0f, new Float(1.0E-4f), 1);
            C4683m c4683m = new C4683m(this.f39472Z, this.f39473h0, this.f39474i0, this.f39475j0, this.f39476k0, this.f39477l0);
            this.f39471Y = 1;
            if (AbstractC6696f.h(b10, f6, u10, false, c4683m, this, 4) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
