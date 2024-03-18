package mh;

import nf.AbstractC4825e;
import of.EnumC5000a;
import oh.C5017d;
import pf.AbstractC5163j;
import z.AbstractC6696f;
import z.C6697f0;
import z.C6716p;

/* renamed from: mh.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4682l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39461Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f39462Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ C4674d f39463h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ float f39464i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4682l(C4674d c4674d, float f6, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39463h0 = c4674d;
        this.f39464i0 = f6;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C4682l c4682l = new C4682l(this.f39463h0, this.f39464i0, abstractC4825e);
        c4682l.f39462Z = obj;
        return c4682l;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4682l) create((C5017d) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, kotlin.jvm.internal.y] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39461Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            ?? obj2 = new Object();
            C4674d c4674d = this.f39463h0;
            float f6 = c4674d.f39438b;
            obj2.f37646Y = f6;
            C6716p b10 = AbstractC6696f.b(f6, 0.0f, 30);
            Float f10 = new Float(this.f39464i0);
            C6697f0 u10 = AbstractC6696f.u(0.0f, 0.0f, null, 7);
            C6.a aVar = new C6.a(c4674d, (Object) obj2, (C5017d) this.f39462Z, 29);
            this.f39461Y = 1;
            if (AbstractC6696f.h(b10, f10, u10, false, aVar, this, 4) == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
