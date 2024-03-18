package Xb;

import android.app.Application;
import android.content.Intent;
import com.google.android.gms.internal.play_billing.N;
import com.openai.chatgpt.R;
import id.AbstractC3557B;
import jf.y;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pd.x;
import pf.AbstractC5163j;
import x8.W;

/* loaded from: classes.dex */
public final class k extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public /* synthetic */ Object f21827Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Application f21828Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ n f21829h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(Application application, n nVar, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f21828Z = application;
        this.f21829h0 = nVar;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        k kVar = new k(this.f21828Z, this.f21829h0, abstractC4825e);
        kVar.f21827Y = obj;
        return kVar;
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        y yVar = y.f36177a;
        ((k) create((x) obj, (AbstractC4825e) obj2)).invokeSuspend(yVar);
        return yVar;
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        Intent intent;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        N.B0(obj);
        x xVar = (x) this.f21827Y;
        String a5 = xVar.a();
        Application application = this.f21828Z;
        if (a5 == null) {
            a5 = application.getString(R.string.failwhale_default_error_message);
            AbstractC3557B.b0("getString(...)", a5);
        }
        String c10 = xVar.c();
        String str = null;
        if (c10 != null) {
            try {
                intent = new Intent();
                A7.b.G0(intent, c10);
            } catch (Exception e10) {
                W.G(Pc.e.a(), "Failed to parse failwhale info url: ".concat(c10), e10, 4);
            }
            if (intent != null && (str = xVar.b()) == null) {
                str = application.getString(R.string.failwhale_default_more_info_button);
                AbstractC3557B.b0("getString(...)", str);
            }
            this.f21829h0.l(new C6.a(a5, str, intent, 13));
            return y.f36177a;
        }
        intent = null;
        if (intent != null) {
            str = application.getString(R.string.failwhale_default_more_info_button);
            AbstractC3557B.b0("getString(...)", str);
        }
        this.f21829h0.l(new C6.a(a5, str, intent, 13));
        return y.f36177a;
    }
}
