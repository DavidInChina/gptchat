package Lb;

import I9.B;
import Pg.A;
import android.content.Context;
import android.content.IntentFilter;
import com.google.android.gms.internal.play_billing.N;
import jf.y;
import m.C4507D;
import nf.AbstractC4825e;
import of.EnumC5000a;
import p1.AbstractC5042g;
import pf.AbstractC5163j;
import wf.n;

/* loaded from: classes.dex */
public final class b extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public int f10976Y;

    /* renamed from: Z  reason: collision with root package name */
    public /* synthetic */ Object f10977Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f10978h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f10978h0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        b bVar = new b(this.f10978h0, abstractC4825e);
        bVar.f10977Z = obj;
        return bVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((b) create((A) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f10976Y;
        if (i10 != 0) {
            if (i10 == 1) {
                N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            N.B0(obj);
            A a5 = (A) this.f10977Z;
            C4507D c4507d = new C4507D(5, a5);
            IntentFilter intentFilter = new IntentFilter("com.google.android.gms.auth.api.phone.SMS_RETRIEVED");
            Context context = this.f10978h0;
            AbstractC5042g.d(context, c4507d, intentFilter, 2);
            B b10 = new B(context, 19, c4507d);
            this.f10976Y = 1;
            if (A7.b.d0(a5, b10, this) == enumC5000a) {
                return enumC5000a;
            }
        }
        return y.f36177a;
    }
}
