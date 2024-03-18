package g2;

import android.content.Context;
import androidx.glance.session.SessionWorker;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;

/* loaded from: classes.dex */
public final class w extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f31143Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f31144Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ SessionWorker f31145h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w(SessionWorker sessionWorker, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f31145h0 = sessionWorker;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        w wVar = new w(this.f31145h0, abstractC4825e);
        wVar.f31144Z = obj;
        return wVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((w) create((L) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f31143Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            L l10 = (L) this.f31144Z;
            SessionWorker sessionWorker = this.f31145h0;
            Context context = sessionWorker.f10725Y;
            u uVar = new u(sessionWorker, l10, null);
            v vVar = new v(sessionWorker, l10, null);
            this.f31143Y = 1;
            obj = Ad.l.e0(new C3149g(context, vVar, uVar, null), this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
