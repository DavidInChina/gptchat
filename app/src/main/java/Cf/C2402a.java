package cf;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: cf.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2402a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f26605Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ long f26606Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ n f26607h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ Object f26608i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2402a(long j6, n nVar, Object obj, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f26606Z = j6;
        this.f26607h0 = nVar;
        this.f26608i0 = obj;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C2402a(this.f26606Z, this.f26607h0, this.f26608i0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2402a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f26605Y;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    return obj;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            N.B0(obj);
        } else {
            N.B0(obj);
            this.f26605Y = 1;
            if (R4.b.p0(this.f26606Z, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        this.f26605Y = 2;
        obj = this.f26607h0.invoke(this.f26608i0, this);
        if (obj == enumC5000a) {
            return enumC5000a;
        }
        return obj;
    }
}
