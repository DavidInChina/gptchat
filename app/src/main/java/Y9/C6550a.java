package y9;

import K4.B;
import N7.f;
import N7.m;
import Ng.F;
import Pc.e;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.N;
import com.google.android.play.core.common.PlayCoreDialogWrapperActivity;
import com.revenuecat.purchases.amazon.purchasing.ProxyAmazonBillingActivity;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import r8.AbstractC5372a;
import r8.C5373b;
import r8.C5374c;
import r8.C5376e;
import wf.n;
import x8.W;

/* renamed from: y9.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6550a extends AbstractC5163j implements n {

    /* renamed from: Y  reason: collision with root package name */
    public C5374c f50838Y;

    /* renamed from: Z  reason: collision with root package name */
    public int f50839Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Activity f50840h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C6550a(Activity activity, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f50840h0 = activity;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new C6550a(this.f50840h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((C6550a) create((F) obj, (AbstractC4825e) obj2)).invokeSuspend(y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        C5374c c5374c;
        m mVar;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f50839Z;
        y yVar = y.f36177a;
        Activity activity = this.f50840h0;
        if (i10 != 0) {
            if (i10 != 1) {
                if (i10 == 2) {
                    N.B0(obj);
                    W.F(e.a(), "Prompted for app review", null, 6);
                    return yVar;
                }
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c5374c = this.f50838Y;
            N.B0(obj);
        } else {
            N.B0(obj);
            Context applicationContext = activity.getApplicationContext();
            if (applicationContext == null) {
                applicationContext = activity;
            }
            c5374c = new C5374c(new C5376e(applicationContext));
            this.f50838Y = c5374c;
            this.f50839Z = 1;
            obj = A7.b.x1(c5374c, this);
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        this.f50838Y = null;
        this.f50839Z = 2;
        c5374c.getClass();
        C5373b c5373b = (C5373b) ((AbstractC5372a) obj);
        if (c5373b.f44462Z) {
            mVar = new m();
            mVar.g(null);
        } else {
            Intent intent = new Intent(activity, PlayCoreDialogWrapperActivity.class);
            intent.putExtra("confirmation_intent", c5373b.f44461Y);
            intent.putExtra("window_flags", activity.getWindow().getDecorView().getWindowSystemUiVisibility());
            f fVar = new f();
            intent.putExtra(ProxyAmazonBillingActivity.EXTRAS_RESULT_RECEIVER, new B(c5374c.f44464b, fVar, 2));
            activity.startActivity(intent);
            mVar = fVar.f12723a;
        }
        AbstractC3557B.b0("launchReviewFlow(activity, reviewInfo)", mVar);
        Object A12 = A7.b.A1(mVar, this);
        if (A12 != enumC5000a) {
            A12 = yVar;
        }
        if (A12 == enumC5000a) {
            return enumC5000a;
        }
        W.F(e.a(), "Prompted for app review", null, 6);
        return yVar;
    }
}
