package uc;

import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import rb.C5426p;
import rc.C5451O;
import wd.C6189g;
import wd.EnumC6181c;

/* renamed from: uc.l  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5894l extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f46644Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f46645Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ xd.g f46646h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5900r f46647i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5894l(xd.g gVar, C5900r c5900r, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f46646h0 = gVar;
        this.f46647i0 = c5900r;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5894l c5894l = new C5894l(this.f46646h0, this.f46647i0, abstractC4825e);
        c5894l.f46645Z = obj;
        return c5894l;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5894l) create((C6189g) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f46644Y;
        if (i10 != 0) {
            if (i10 != 1 && i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            boolean contains = ((C6189g) this.f46645Z).f48415f.contains(EnumC6181c.f48386i0);
            C5900r c5900r = this.f46647i0;
            if (contains) {
                C5426p c5426p = new C5426p(((C5451O) this.f46646h0).f44814c, 7);
                C5891i c5891i = new C5891i(c5900r, null);
                this.f46644Y = 1;
                if (L4.a.b0(c5426p, c5891i, this) == enumC5000a) {
                    return enumC5000a;
                }
            } else {
                C5889g c5889g = c5900r.f46668d;
                C5892j c5892j = C5892j.f46640Y;
                this.f46644Y = 2;
                if (c5889g.b(c5892j, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        return y.f36177a;
    }
}
