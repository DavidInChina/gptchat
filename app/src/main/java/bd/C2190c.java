package bd;

import Qg.n0;
import cd.C2393c;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import wf.n;

/* renamed from: bd.c  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2190c extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f25936Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ int f25937Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ d f25938h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ n f25939i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2190c(d dVar, n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f25938h0 = dVar;
        this.f25939i0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C2190c c2190c = new C2190c(this.f25938h0, this.f25939i0, abstractC4825e);
        c2190c.f25937Z = ((Number) obj).intValue();
        return c2190c;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C2190c) create(Integer.valueOf(((Number) obj).intValue()), (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [pf.j, wf.n] */
    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        int i10;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i11 = this.f25936Y;
        if (i11 != 0) {
            if (i11 != 1) {
                if (i11 == 2) {
                    N.B0(obj);
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i10 = this.f25937Z;
            N.B0(obj);
        } else {
            N.B0(obj);
            i10 = this.f25937Z;
            if (i10 > 0) {
                n0 n0Var = ((C2393c) this.f25938h0).f26591d;
                ?? abstractC5163j = new AbstractC5163j(2, null);
                this.f25937Z = i10;
                this.f25936Y = 1;
                if (L4.a.n0(n0Var, abstractC5163j, this) == enumC5000a) {
                    return enumC5000a;
                }
            }
        }
        Integer num = new Integer(i10);
        this.f25936Y = 2;
        if (this.f25939i0.invoke(num, this) == enumC5000a) {
            return enumC5000a;
        }
        return y.f36177a;
    }
}
