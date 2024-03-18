package mh;

import A.B0;
import nf.AbstractC4825e;
import of.EnumC5000a;
import oh.C5018e;
import pf.AbstractC5163j;

/* renamed from: mh.K  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4666K extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39413Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4670O f39414Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4666K(C4670O c4670o, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39414Z = c4670o;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C4666K(this.f39414Z, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C4666K) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f39413Y;
        jf.y yVar = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            C5018e c5018e = this.f39414Z.f39423u0.f39497q;
            B0 b02 = B0.f14Y;
            this.f39413Y = 1;
            Object a5 = c5018e.a(b02, new AbstractC5163j(2, null), this);
            if (a5 != enumC5000a) {
                a5 = yVar;
            }
            if (a5 == enumC5000a) {
                return enumC5000a;
            }
        }
        return yVar;
    }
}
