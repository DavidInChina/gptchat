package k5;

import Ng.C1072l;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.auth0.android.provider.AuthenticationActivity;
import g5.C3199a;
import h5.C3324b;
import h5.C3325c;
import i4.C3471d;
import id.AbstractC3557B;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import kf.AbstractC4268D;
import nf.AbstractC4825e;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5163j;
import q1.AbstractC5260f;

/* loaded from: classes2.dex */
public final class L extends AbstractC5163j implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public int f37041Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ M f37042Z;

    /* renamed from: h0  reason: collision with root package name */
    public final /* synthetic */ Context f37043h0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(M m10, Context context, AbstractC4825e abstractC4825e) {
        super(2, abstractC4825e);
        this.f37042Z = m10;
        this.f37043h0 = context;
    }

    @Override // pf.AbstractC5154a
    public final AbstractC4825e create(Object obj, AbstractC4825e abstractC4825e) {
        return new L(this.f37042Z, this.f37043h0, abstractC4825e);
    }

    @Override // wf.n
    public final Object invoke(Object obj, Object obj2) {
        return ((L) create((Ng.F) obj, (AbstractC4825e) obj2)).invokeSuspend(jf.y.f36177a);
    }

    @Override // pf.AbstractC5154a
    public final Object invokeSuspend(Object obj) {
        String str;
        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
        int i10 = this.f37041Y;
        if (i10 != 0) {
            if (i10 == 1) {
                com.google.android.gms.internal.play_billing.N.B0(obj);
            } else {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
        } else {
            com.google.android.gms.internal.play_billing.N.B0(obj);
            M m10 = this.f37042Z;
            Context context = this.f37043h0;
            this.f37041Y = 1;
            C1072l c1072l = new C1072l(1, AbstractC5260f.z(this));
            c1072l.u();
            C.b bVar = new C.b(1, c1072l);
            m10.getClass();
            AbstractC3557B.c0("context", context);
            String str2 = null;
            P.f37058b = null;
            if (m10.f37049f.a(context.getPackageManager()) != null) {
                LinkedHashMap linkedHashMap = m10.f37045b;
                C4186l c4186l = m10.f37049f;
                C3199a c3199a = m10.f37044a;
                z zVar = new z(c3199a, bVar, linkedHashMap, c4186l);
                LinkedHashMap linkedHashMap2 = m10.f37046c;
                AbstractC3557B.c0("headers", linkedHashMap2);
                HashMap hashMap = zVar.f37099k;
                hashMap.putAll(linkedHashMap2);
                zVar.f37102n = null;
                zVar.f37103o = null;
                boolean isEmpty = TextUtils.isEmpty(null);
                C3324b c3324b = zVar.f37101m;
                if (isEmpty) {
                    str2 = String.valueOf(c3324b.f31907a.f31280b);
                }
                zVar.f37104p = str2;
                P.f37058b = zVar;
                if (m10.f37048e == null) {
                    m10.f37048e = R4.b.e1(m10.f37047d, context.getApplicationContext().getPackageName(), String.valueOf(c3199a.f31280b));
                }
                String str3 = m10.f37048e;
                AbstractC3557B.Z(str3);
                LinkedHashMap linkedHashMap3 = zVar.f37098j;
                AbstractC3557B.c0("parameters", linkedHashMap3);
                if (linkedHashMap3.containsKey("scope")) {
                    str = AbstractC4828h.S((String) AbstractC4268D.Z0("scope", linkedHashMap3));
                } else {
                    str = "openid profile email";
                }
                linkedHashMap3.put("scope", str);
                if (zVar.f37102n == null) {
                    zVar.f37102n = new E(c3324b, str3, hashMap);
                }
                E e10 = zVar.f37102n;
                AbstractC3557B.Z(e10);
                String str4 = e10.f37039d;
                AbstractC3557B.b0("codeChallenge", str4);
                linkedHashMap3.put("code_challenge", str4);
                linkedHashMap3.put("code_challenge_method", "S256");
                String str5 = z.f37094q;
                Log.v(str5, "Using PKCE authentication flow");
                C3199a c3199a2 = zVar.f37095g;
                linkedHashMap3.put("auth0Client", c3199a2.f31281c.f39618b);
                linkedHashMap3.put("client_id", c3199a2.f31279a);
                linkedHashMap3.put("redirect_uri", str3);
                String str6 = (String) linkedHashMap3.get("state");
                if (str6 == null) {
                    byte[] bArr = new byte[32];
                    new SecureRandom().nextBytes(bArr);
                    str6 = Base64.encodeToString(bArr, 11);
                    AbstractC3557B.b0("encodeToString(\n        \u2026.NO_PADDING\n            )", str6);
                }
                String str7 = (String) linkedHashMap3.get("nonce");
                if (str7 == null) {
                    byte[] bArr2 = new byte[32];
                    new SecureRandom().nextBytes(bArr2);
                    str7 = Base64.encodeToString(bArr2, 11);
                    AbstractC3557B.b0("encodeToString(\n        \u2026.NO_PADDING\n            )", str7);
                }
                linkedHashMap3.put("state", str6);
                linkedHashMap3.put("nonce", str7);
                Wh.s sVar = c3199a2.f31280b;
                AbstractC3557B.Z(sVar);
                Wh.r f6 = sVar.f();
                f6.d("authorize", 0, 9, false, true);
                Uri.Builder buildUpon = Uri.parse(f6.b().f21257h).buildUpon();
                for (Map.Entry entry : linkedHashMap3.entrySet()) {
                    buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                }
                Uri build = buildUpon.build();
                Log.d(str5, "Using the following Authorize URI: " + build);
                AbstractC3557B.b0("uri", build);
                int i11 = AuthenticationActivity.f26715h0;
                C3471d.a(context, build, zVar.f37097i, zVar.f37100l);
            } else {
                bVar.d(new C3325c("a0.browser_not_available", "No compatible Browser application is installed."));
            }
            obj = c1072l.t();
            if (obj == EnumC5000a.f41328Y) {
                com.google.android.gms.internal.play_billing.N.k0(this);
            }
            if (obj == enumC5000a) {
                return enumC5000a;
            }
        }
        return obj;
    }
}
