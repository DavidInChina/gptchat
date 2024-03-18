package mh;

import A.B0;
import E0.C0453l;
import id.AbstractC3557B;
import l0.C4310b;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q0.C5254f;
import u0.AbstractC5824b;

/* loaded from: classes2.dex */
public final class y extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f39511Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ C4663H f39512Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC5824b f39513h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(C4663H c4663h, AbstractC5824b abstractC5824b, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f39512Z = c4663h;
        this.f39513h0 = abstractC5824b;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new y(this.f39512Z, this.f39513h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((y) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0060, code lost:
        if (r9 == r0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0064, code lost:
        if (r9 == r0) goto L21;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v4, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        Object obj3;
        Object obj4 = EnumC5000a.f41328Y;
        int i10 = this.f39511Y;
        Object obj5 = jf.y.f36177a;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            P p10 = this.f39512Z.f39404a;
            long h10 = this.f39513h0.h();
            if (h10 == C5254f.f43638c) {
                obj2 = t.f39507a;
            } else {
                obj2 = new C4687q(h10, C0453l.f4075c, C4310b.f37697j0);
            }
            this.f39511Y = 1;
            C4686p c4686p = (C4686p) p10;
            if (!AbstractC3557B.K(c4686p.i(), obj2)) {
                c4686p.f39490j.setValue(obj2);
                if (c4686p.k()) {
                    obj3 = c4686p.f39497q.a(B0.f16h0, new AbstractC5163j(2, null), this);
                }
                obj3 = obj5;
            }
            obj3 = obj5;
            if (obj3 == obj4) {
                return obj4;
            }
        }
        return obj5;
    }
}
