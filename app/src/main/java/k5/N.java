package k5;

import Ng.C1072l;
import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.auth0.android.provider.AuthenticationActivity;
import g5.C3199a;
import h5.C3325c;
import i4.C3471d;
import id.AbstractC3557B;
import java.util.HashMap;
import java.util.Map;
import nf.AbstractC4825e;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public final class N extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37050Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ O f37051Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f37052h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public N(O o10, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37051Z = o10;
        this.f37052h0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new N(this.f37051Z, this.f37052h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((N) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37050Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            O o10 = this.f37051Z;
            Context context = this.f37052h0;
            this.f37050Y = 1;
            C1072l c1072l = new C1072l(1, AbstractC5260f.z(this));
            c1072l.u();
            C.b bVar = new C.b(2, c1072l);
            o10.getClass();
            AbstractC3557B.c0("context", context);
            P.f37058b = null;
            if (o10.f37056d.a(context.getPackageManager()) != null) {
                String str = o10.f37055c;
                C3199a c3199a = o10.f37053a;
                if (str == null) {
                    o10.f37055c = R4.b.e1(o10.f37054b, context.getApplicationContext().getPackageName(), String.valueOf(c3199a.f31280b));
                }
                String str2 = o10.f37055c;
                AbstractC3557B.Z(str2);
                u uVar = new u(c3199a, bVar, str2, o10.f37056d);
                P.f37058b = uVar;
                HashMap hashMap = uVar.f37085j;
                C3199a c3199a2 = uVar.f37082g;
                hashMap.put("auth0Client", c3199a2.f31281c.f39618b);
                hashMap.put("client_id", c3199a2.f31279a);
                Wh.s sVar = c3199a2.f31280b;
                AbstractC3557B.Z(sVar);
                Wh.r f6 = sVar.f();
                f6.d("v2", 0, 2, false, true);
                f6.d("logout", 0, 6, false, true);
                Uri.Builder buildUpon = Uri.parse(f6.b().f21257h).buildUpon();
                for (Map.Entry entry : hashMap.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                String str3 = u.f37081l;
                Log.d(str3, "Using the following Logout URI: " + build);
                AbstractC3557B.b0("uri", build);
                int i11 = AuthenticationActivity.f26715h0;
                C3471d.a(context, build, uVar.f37084i, uVar.f37086k);
            } else {
                bVar.d(new C3325c("a0.browser_not_available", "No compatible Browser application is installed."));
            }
            Object t10 = c1072l.t();
            if (t10 == EnumC5000a.f41328Y) {
                com.google.android.gms.internal.play_billing.N.k0(this);
            }
            if (t10 == enumC5000a) {
                return enumC5000a;
            }
        }
        return jf.y.f36177a;
    }
}
