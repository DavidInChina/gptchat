package re;

import Ng.F;
import com.google.android.gms.internal.play_billing.N;
import io.ktor.utils.io.t;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import ve.AbstractC6034c;
import wf.n;

/* renamed from: re.d  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5486d extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f44966Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f44967Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ AbstractC6034c f44968h0;

    /* renamed from: i0  reason: collision with root package name */
    public final /* synthetic */ C5488f f44969i0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5486d(AbstractC6034c abstractC6034c, C5488f c5488f, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f44968h0 = abstractC6034c;
        this.f44969i0 = c5488f;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        C5486d c5486d = new C5486d(this.f44968h0, this.f44969i0, abstractC4825e);
        c5486d.f44967Z = obj;
        return c5486d;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C5486d) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f44966Y;
        AbstractC6034c abstractC6034c = this.f44968h0;
        try {
            try {
            } catch (Throwable th2) {
                N.w(th2);
            }
        } catch (Throwable th3) {
            N.w(th3);
        }
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    new Long(((Number) obj).longValue());
                    return y.f36177a;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            F f6 = (F) this.f44967Z;
            N.B0(obj);
        } else {
            N.B0(obj);
            F f10 = (F) this.f44967Z;
            n nVar = this.f44969i0.f44979a;
            this.f44967Z = f10;
            this.f44966Y = 1;
            if (nVar.invoke(abstractC6034c, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        t tVar = (t) abstractC6034c.c();
        if (!tVar.r()) {
            this.f44967Z = null;
            this.f44966Y = 2;
            obj = tVar.m(this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
            new Long(((Number) obj).longValue());
        }
        return y.f36177a;
    }
}
