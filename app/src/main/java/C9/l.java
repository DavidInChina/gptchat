package C9;

import A.C0039q0;
import Ng.Q;
import Qg.F0;
import Qg.s0;
import Vc.y;
import Z8.AbstractC1805k0;
import Z8.AbstractC1809m0;
import Z8.C1814p;
import Z8.C1816q;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sdp.fields.SDPKeywords;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.text.TextUtils;
import b9.C2134c;
import b9.C2135d;
import b9.C2136e;
import b9.C2137f;
import b9.C2138g;
import b9.C2140i;
import b9.C2141j;
import b9.C2142k;
import b9.EnumC2132a;
import b9.p;
import c9.AbstractC2307a;
import c9.C2308b;
import com.auth0.android.result.Credentials;
import com.google.android.gms.internal.play_billing.N;
import g5.C3199a;
import g5.C3200b;
import h5.C3324b;
import h5.C3325c;
import i5.C3477c;
import i5.C3478d;
import i5.C3479e;
import id.AbstractC3557B;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import k5.C4184j;
import k5.C4186l;
import k5.M;
import k5.O;
import k5.P;
import kf.AbstractC4268D;
import kf.t;
import kf.w;
import l8.AbstractC4344b;
import ld.C4431d;
import nf.AbstractC4825e;
import nf.C4832l;
import of.EnumC5000a;
import u7.C5848d;
import vd.AbstractC6030e;
import vd.EnumC6026a;
import wd.p0;
import wd.q0;
import wd.u0;
import wd.v0;
import x8.W;

/* loaded from: classes.dex */
public final class l extends AbstractC2307a {

    /* renamed from: k  reason: collision with root package name */
    public static final List f2792k = AbstractC4344b.G0("openid", "email", "profile", "offline_access", "model.request", "model.read", "organization.read", "organization.write");

    /* renamed from: l  reason: collision with root package name */
    public static final C4186l f2793l = new C4186l(false, 0, new C4184j((List) null));

    /* renamed from: m  reason: collision with root package name */
    public static final C4186l f2794m = new C4186l(false, 0, new C4184j(AbstractC2307a.f26367c));

    /* renamed from: d  reason: collision with root package name */
    public final C3199a f2795d;

    /* renamed from: e  reason: collision with root package name */
    public final C3324b f2796e;

    /* renamed from: g  reason: collision with root package name */
    public final C3477c f2798g;

    /* renamed from: h  reason: collision with root package name */
    public final String f2799h;

    /* renamed from: i  reason: collision with root package name */
    public final F0 f2800i;

    /* renamed from: f  reason: collision with root package name */
    public final Wg.d f2797f = Wg.e.a();

    /* renamed from: j  reason: collision with root package name */
    public final F0 f2801j = s0.c(b9.l.f25668a);

    static {
        AbstractC2307a.f26366b.getClass();
    }

    public l(Application application, p pVar, C4431d c4431d, y yVar) {
        super(pVar);
        Long l10;
        F0 f02;
        C3199a c3199a = new C3199a(yVar.f18578m, yVar.f18575j);
        this.f2795d = c3199a;
        C3324b c3324b = new C3324b(c3199a);
        this.f2796e = c3324b;
        C3479e c3479e = new C3479e(application);
        C3477c c3477c = new C3477c(c3324b, c3479e);
        this.f2798g = c3477c;
        this.f2799h = android.gov.nist.core.a.A("com.openai.chatgpt://auth0.openai.com/android/", application.getPackageName(), "/callback");
        k9.c a5 = ((k9.d) AbstractC6030e.a()).a(EnumC6026a.f47471Z);
        a5.b();
        String b10 = c3479e.b("com.auth0.access_token");
        String b11 = c3479e.b("com.auth0.refresh_token");
        String b12 = c3479e.b("com.auth0.id_token");
        SharedPreferences sharedPreferences = c3479e.f32715a;
        if (!sharedPreferences.contains("com.auth0.expires_at")) {
            l10 = null;
        } else {
            l10 = Long.valueOf(sharedPreferences.getLong("com.auth0.expires_at", 0L));
        }
        if ((TextUtils.isEmpty(b10) && TextUtils.isEmpty(b12)) || l10 == null || (c3477c.a(l10.longValue(), 0L) && b11 == null)) {
            this.f2800i = s0.c(nd.j.f40291a);
        } else {
            Ad.l.O0(c4431d, null, null, new a(this, null), 3);
            nd.h hVar = (nd.h) Ad.l.a1(C4832l.f40334Y, new h(a5, pVar, null));
            if (hVar != null) {
                f02 = s0.c(hVar);
            } else {
                f02 = s0.c(nd.i.f40290a);
            }
            this.f2800i = f02;
        }
        a5.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0050  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00f5 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc A[Catch: b -> 0x0039, c -> 0x003c, d -> 0x0143, TryCatch #2 {c -> 0x003c, d -> 0x0143, b -> 0x0039, blocks: (B:12:0x0034, B:18:0x004b, B:20:0x0053, B:22:0x0075, B:24:0x007c, B:26:0x0084, B:28:0x008b, B:29:0x008e, B:30:0x0090, B:32:0x00ac, B:36:0x00e7, B:39:0x00f6, B:41:0x00fc, B:42:0x010b, B:45:0x0111, B:48:0x0117, B:49:0x011c), top: B:72:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x010b A[Catch: b -> 0x0039, c -> 0x003c, d -> 0x0143, TryCatch #2 {c -> 0x003c, d -> 0x0143, b -> 0x0039, blocks: (B:12:0x0034, B:18:0x004b, B:20:0x0053, B:22:0x0075, B:24:0x007c, B:26:0x0084, B:28:0x008b, B:29:0x008e, B:30:0x0090, B:32:0x00ac, B:36:0x00e7, B:39:0x00f6, B:41:0x00fc, B:42:0x010b, B:45:0x0111, B:48:0x0117, B:49:0x011c), top: B:72:0x002e }] */
    @Override // c9.AbstractC2307a
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, EnumC2132a enumC2132a, String str, String str2, String str3, boolean z10, AbstractC4825e abstractC4825e) {
        i iVar;
        Object obj;
        EnumC5000a enumC5000a;
        int i10;
        String str4;
        String str5;
        Object s0Var;
        v0 v0Var;
        l lVar;
        EnumC2132a enumC2132a2;
        C4186l c4186l;
        try {
            if (abstractC4825e instanceof i) {
                iVar = (i) abstractC4825e;
                int i11 = iVar.f2783j0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    iVar.f2783j0 = i11 - Integer.MIN_VALUE;
                    obj = iVar.f2781h0;
                    enumC5000a = EnumC5000a.f41328Y;
                    i10 = iVar.f2783j0;
                    str4 = "";
                    str5 = null;
                    if (i10 == 0) {
                        if (i10 != 1) {
                            if (i10 == 2) {
                                N.B0(obj);
                                v0Var = (v0) obj;
                                if (v0Var instanceof u0) {
                                    C2308b c2308b = (C2308b) ((u0) v0Var).f48468a;
                                    return new u0(jf.y.f36177a);
                                }
                                if (!(v0Var instanceof p0) && !(v0Var instanceof q0)) {
                                    throw new RuntimeException();
                                }
                                return v0Var;
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        enumC2132a2 = iVar.f2780Z;
                        lVar = iVar.f2779Y;
                        N.B0(obj);
                    } else {
                        N.B0(obj);
                        LinkedHashMap c12 = AbstractC4268D.c1(new C3959i(SDPKeywords.PROMPT, "login"), new C3959i("android_device_id", str3));
                        String U10 = R4.a.U(enumC2132a);
                        if (U10 != null) {
                            c12.put("screen_hint", U10);
                        }
                        if (str != null) {
                            c12.put("preauth_cookie", str);
                        } else if (str2 != null) {
                            c12.put("preauth_cookie_failed", str2);
                        }
                        if (z10) {
                            c4186l = f2794m;
                        } else {
                            c4186l = f2793l;
                        }
                        M a5 = P.a(this.f2795d);
                        a5.d();
                        String m22 = t.m2(f2792k, Separators.SP, null, null, null, 62);
                        LinkedHashMap linkedHashMap = a5.f37045b;
                        linkedHashMap.put("scope", m22);
                        String str6 = this.f2799h;
                        AbstractC3557B.c0("redirectUri", str6);
                        a5.f37048e = str6;
                        AbstractC2307a.f26366b.getClass();
                        a5.b(C5848d.c(enumC2132a));
                        linkedHashMap.put("audience", "https://api.openai.com/v1");
                        a5.c(c12);
                        AbstractC3557B.c0("options", c4186l);
                        a5.f37049f = c4186l;
                        iVar.f2779Y = this;
                        enumC2132a2 = enumC2132a;
                        iVar.f2780Z = enumC2132a2;
                        iVar.f2783j0 = 1;
                        obj = a5.a(context, iVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                        lVar = this;
                    }
                    iVar.f2779Y = null;
                    iVar.f2780Z = null;
                    iVar.f2783j0 = 2;
                    obj = lVar.d((Credentials) obj, enumC2132a2, iVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    v0Var = (v0) obj;
                    if (v0Var instanceof u0) {
                    }
                }
            }
            if (i10 == 0) {
            }
            iVar.f2779Y = null;
            iVar.f2780Z = null;
            iVar.f2783j0 = 2;
            obj = lVar.d((Credentials) obj, enumC2132a2, iVar);
            if (obj == enumC5000a) {
            }
            v0Var = (v0) obj;
            if (v0Var instanceof u0) {
            }
        } catch (C3325c e10) {
            String str7 = e10.f31910Y;
            if (AbstractC3557B.K("a0.authentication_canceled", str7)) {
                s0Var = p0.f48449a;
            } else {
                Pc.c a10 = Pc.e.a();
                C3959i[] c3959iArr = new C3959i[4];
                c3959iArr[0] = new C3959i("description", e10.b());
                c3959iArr[1] = new C3959i("code", e10.a());
                c3959iArr[2] = new C3959i("statusCode", Integer.valueOf(e10.f31912h0));
                Throwable cause = e10.getCause();
                if (cause != null) {
                    str5 = cause.getMessage();
                }
                if (str5 != null) {
                    str4 = str5;
                }
                c3959iArr[3] = new C3959i(ParameterNames.CAUSE, str4);
                a10.b("Login failed", e10, AbstractC4268D.a1(c3959iArr));
                if (AbstractC3557B.K("a0.browser_not_available", str7)) {
                    s0Var = new wd.s0(0, C2134c.f25660Y);
                } else if (AbstractC3557B.K(e10.a(), "a0.sdk.internal_error.unknown")) {
                    s0Var = new wd.s0(0, C2137f.f25663Y);
                } else {
                    s0Var = new wd.s0(0, new C2138g(e10.b()));
                }
            }
            return s0Var;
        } catch (C3478d unused) {
            return new wd.s0(1, C2136e.f25662Y);
        } catch (C3200b e11) {
            Pc.c a11 = Pc.e.a();
            String message = e11.getMessage();
            if (message != null) {
                str4 = message;
            }
            a11.b("Login failed", e11, P4.a.o0(new C3959i("message", str4)));
            return new wd.s0(0, new C2138g(null));
        }
        iVar = new i(this, abstractC4825e);
        obj = iVar.f2781h0;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = iVar.f2783j0;
        str4 = "";
        str5 = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0077 A[Catch: c -> 0x0043, TRY_ENTER, TryCatch #0 {c -> 0x0043, blocks: (B:17:0x003f, B:31:0x0077, B:35:0x009e), top: B:48:0x0026 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x00cf A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00d0 A[PHI: r0 
      PHI: (r0v6 java.lang.Object) = (r0v9 java.lang.Object), (r0v1 java.lang.Object) binds: [B:41:0x00cd, B:13:0x002e] A[DONT_GENERATE, DONT_INLINE], RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(AbstractC4825e abstractC4825e) {
        c cVar;
        int i10;
        l lVar;
        String str;
        String d10;
        String str2;
        l lVar2;
        String d11;
        try {
            try {
                if (abstractC4825e instanceof c) {
                    cVar = (c) abstractC4825e;
                    int i11 = cVar.f2756j0;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        cVar.f2756j0 = i11 - Integer.MIN_VALUE;
                        Object obj = cVar.f2754h0;
                        EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                        i10 = cVar.f2756j0;
                        if (i10 == 0) {
                            if (i10 != 1) {
                                if (i10 != 2) {
                                    if (i10 == 3) {
                                        N.B0(obj);
                                        return obj;
                                    }
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                str = cVar.f2753Z;
                                lVar = cVar.f2752Y;
                                N.B0(obj);
                                Credentials credentials = (Credentials) obj;
                                String c10 = credentials.c();
                                String a5 = credentials.a();
                                String f6 = credentials.f();
                                d10 = credentials.d();
                                if (d10 != null) {
                                    str2 = str;
                                } else {
                                    str2 = d10;
                                }
                                Credentials credentials2 = new Credentials(c10, a5, f6, str2, credentials.b(), credentials.e());
                                cVar.f2752Y = null;
                                cVar.f2753Z = null;
                                cVar.f2756j0 = 3;
                                obj = lVar.d(credentials2, null, cVar);
                                if (obj != enumC5000a) {
                                    return enumC5000a;
                                }
                                return obj;
                            }
                            lVar2 = cVar.f2752Y;
                            N.B0(obj);
                        } else {
                            N.B0(obj);
                            W.M(Pc.e.a(), "Forcing credentials renewal", null, 6);
                            C3477c c3477c = this.f2798g;
                            cVar.f2752Y = this;
                            cVar.f2756j0 = 1;
                            obj = c3477c.b(cVar);
                            if (obj == enumC5000a) {
                                return enumC5000a;
                            }
                            lVar2 = this;
                        }
                        d11 = ((Credentials) obj).d();
                        if (d11 != null) {
                            return new wd.s0(1, C2135d.f25661Y);
                        }
                        com.auth0.android.request.internal.b a10 = lVar2.f2796e.a(d11);
                        cVar.f2752Y = lVar2;
                        cVar.f2753Z = d11;
                        cVar.f2756j0 = 2;
                        Object n12 = Ad.l.n1(cVar, Q.f12906c, new com.auth0.android.request.internal.a(new X0.b(14, a10), null));
                        if (n12 == enumC5000a) {
                            return enumC5000a;
                        }
                        l lVar3 = lVar2;
                        str = d11;
                        obj = n12;
                        lVar = lVar3;
                        Credentials credentials3 = (Credentials) obj;
                        String c102 = credentials3.c();
                        String a52 = credentials3.a();
                        String f62 = credentials3.f();
                        d10 = credentials3.d();
                        if (d10 != null) {
                        }
                        Credentials credentials22 = new Credentials(c102, a52, f62, str2, credentials3.b(), credentials3.e());
                        cVar.f2752Y = null;
                        cVar.f2753Z = null;
                        cVar.f2756j0 = 3;
                        obj = lVar.d(credentials22, null, cVar);
                        if (obj != enumC5000a) {
                        }
                    }
                }
                if (i10 == 0) {
                }
                d11 = ((Credentials) obj).d();
                if (d11 != null) {
                }
            } catch (C3325c e10) {
                Pc.e.a().b("Renew credentials failed", e10, P4.a.o0(new C3959i("description", e10.b())));
                return new wd.s0(0, new C2138g(e10.b()));
            }
        } catch (C3478d unused) {
            return new wd.s0(1, C2135d.f25661Y);
        }
        cVar = new c(this, abstractC4825e);
        Object obj2 = cVar.f2754h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = cVar.f2756j0;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(22:2|(2:4|(19:6|8|(1:(1:11)(2:12|13))(5:14|57|15|16|(2:18|(1:20)(1:21))(16:23|(1:25)(1:26)|27|55|28|(1:30)(1:31)|32|(1:34)(1:37)|38|(1:40)(1:41)|(1:43)(1:44)|45|(1:47)(1:48)|49|51|52))|22|(0)(0)|27|55|28|(0)(0)|32|(0)(0)|38|(0)(0)|(0)(0)|45|(0)(0)|49|51|52))|7|8|(0)(0)|22|(0)(0)|27|55|28|(0)(0)|32|(0)(0)|38|(0)(0)|(0)(0)|45|(0)(0)|49|51|52|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00f9, code lost:
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x011a, code lost:
        x8.W.W(Pc.e.a(), "Failed to decode profile claim for token: " + r6, null, null, 6);
        r0 = new c9.C2308b(null, null, null);
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00df A[Catch: c -> 0x00f9, TryCatch #0 {c -> 0x00f9, blocks: (B:28:0x00c7, B:31:0x00df, B:32:0x00e4, B:34:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0106, B:45:0x010e, B:47:0x0112, B:49:0x0116), top: B:55:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00f2 A[Catch: c -> 0x00f9, TryCatch #0 {c -> 0x00f9, blocks: (B:28:0x00c7, B:31:0x00df, B:32:0x00e4, B:34:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0106, B:45:0x010e, B:47:0x0112, B:49:0x0116), top: B:55:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0100 A[Catch: c -> 0x00f9, TryCatch #0 {c -> 0x00f9, blocks: (B:28:0x00c7, B:31:0x00df, B:32:0x00e4, B:34:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0106, B:45:0x010e, B:47:0x0112, B:49:0x0116), top: B:55:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0106 A[Catch: c -> 0x00f9, TryCatch #0 {c -> 0x00f9, blocks: (B:28:0x00c7, B:31:0x00df, B:32:0x00e4, B:34:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0106, B:45:0x010e, B:47:0x0112, B:49:0x0116), top: B:55:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0112 A[Catch: c -> 0x00f9, TryCatch #0 {c -> 0x00f9, blocks: (B:28:0x00c7, B:31:0x00df, B:32:0x00e4, B:34:0x00f2, B:38:0x00fc, B:40:0x0100, B:43:0x0106, B:45:0x010e, B:47:0x0112, B:49:0x0116), top: B:55:0x00c7 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0115  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(Credentials credentials, EnumC2132a enumC2132a, AbstractC4825e abstractC4825e) {
        d dVar;
        int i10;
        Object obj;
        l lVar;
        Map map;
        Object obj2;
        String str;
        Object obj3;
        Boolean bool;
        String str2;
        Credentials credentials2;
        if (abstractC4825e instanceof d) {
            dVar = (d) abstractC4825e;
            int i11 = dVar.f2763l0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f2763l0 = i11 - Integer.MIN_VALUE;
                Object obj4 = dVar.f2761j0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = dVar.f2763l0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        str2 = dVar.f2760i0;
                        enumC2132a = dVar.f2759h0;
                        credentials2 = dVar.f2758Z;
                        lVar = dVar.f2757Y;
                        N.B0(obj4);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj4);
                    try {
                        this.f2798g.c(credentials);
                        this.f2801j.setValue(new C2140i(credentials.a()));
                        String L10 = W.L(credentials);
                        if (L10 != null) {
                            C0039q0 c0039q0 = new C0039q0(L10, 8);
                            dVar.f2757Y = this;
                            dVar.f2758Z = credentials;
                            dVar.f2759h0 = enumC2132a;
                            dVar.f2760i0 = L10;
                            dVar.f2763l0 = 1;
                            if (this.f25672a.b(c0039q0, dVar) == enumC5000a) {
                                return enumC5000a;
                            }
                            lVar = this;
                            credentials2 = credentials;
                            str2 = L10;
                        } else {
                            obj = nd.i.f40290a;
                            lVar = this;
                            if (enumC2132a == null) {
                                AbstractC1809m0.a().b(C1814p.f23398c, w.f37484Y);
                            } else {
                                AbstractC1805k0 a5 = AbstractC1809m0.a();
                                C1814p c1814p = C1814p.f23398c;
                                AbstractC2307a.f26366b.getClass();
                                a5.b(c1814p, P4.a.o0(new C3959i("connection", C5848d.c(enumC2132a))));
                            }
                            W.M(Pc.e.a(), "Updated credentials, new session " + obj, null, 6);
                            lVar.f2800i.setValue(obj);
                            AbstractC3557B.c0("<this>", credentials);
                            com.auth0.android.jwt.a aVar = (com.auth0.android.jwt.a) new com.auth0.android.jwt.d(credentials.a()).f26712h0.f26714a.get("https://api.openai.com/profile");
                            map = (Map) (aVar != null ? aVar : new Object()).a();
                            String L11 = W.L(credentials);
                            if (map != null) {
                                obj2 = map.get("email");
                            } else {
                                obj2 = null;
                            }
                            if (obj2 instanceof String) {
                                str = (String) obj2;
                            } else {
                                str = null;
                            }
                            if (map != null) {
                                obj3 = map.get("email_verified");
                            } else {
                                obj3 = null;
                            }
                            if (obj3 instanceof Boolean) {
                                bool = (Boolean) obj3;
                            } else {
                                bool = null;
                            }
                            C2308b c2308b = new C2308b(L11, str, bool);
                            return new u0(c2308b);
                        }
                    } catch (C3478d unused) {
                        return new wd.s0(1, C2136e.f25662Y);
                    }
                }
                obj = new nd.h(str2, false);
                credentials = credentials2;
                if (enumC2132a == null) {
                }
                W.M(Pc.e.a(), "Updated credentials, new session " + obj, null, 6);
                lVar.f2800i.setValue(obj);
                AbstractC3557B.c0("<this>", credentials);
                com.auth0.android.jwt.a aVar2 = (com.auth0.android.jwt.a) new com.auth0.android.jwt.d(credentials.a()).f26712h0.f26714a.get("https://api.openai.com/profile");
                map = (Map) (aVar2 != null ? aVar2 : new Object()).a();
                String L112 = W.L(credentials);
                if (map != null) {
                }
                if (obj2 instanceof String) {
                }
                if (map != null) {
                }
                if (obj3 instanceof Boolean) {
                }
                C2308b c2308b2 = new C2308b(L112, str, bool);
                return new u0(c2308b2);
            }
        }
        dVar = new d(this, abstractC4825e);
        Object obj42 = dVar.f2761j0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = dVar.f2763l0;
        if (i10 == 0) {
        }
        obj = new nd.h(str2, false);
        credentials = credentials2;
        if (enumC2132a == null) {
        }
        W.M(Pc.e.a(), "Updated credentials, new session " + obj, null, 6);
        lVar.f2800i.setValue(obj);
        AbstractC3557B.c0("<this>", credentials);
        com.auth0.android.jwt.a aVar22 = (com.auth0.android.jwt.a) new com.auth0.android.jwt.d(credentials.a()).f26712h0.f26714a.get("https://api.openai.com/profile");
        map = (Map) (aVar22 != null ? aVar22 : new Object()).a();
        String L1122 = W.L(credentials);
        if (map != null) {
        }
        if (obj2 instanceof String) {
        }
        if (map != null) {
        }
        if (obj3 instanceof Boolean) {
        }
        C2308b c2308b22 = new C2308b(L1122, str, bool);
        return new u0(c2308b22);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00c0 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00ce A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:61:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(Context context, AbstractC4825e abstractC4825e) {
        e eVar;
        EnumC5000a enumC5000a;
        int i10;
        l lVar;
        Throwable th2;
        C3325c e10;
        l lVar2;
        if (abstractC4825e instanceof e) {
            eVar = (e) abstractC4825e;
            int i11 = eVar.f2767i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                eVar.f2767i0 = i11 - Integer.MIN_VALUE;
                Object obj = eVar.f2765Z;
                enumC5000a = EnumC5000a.f41328Y;
                i10 = eVar.f2767i0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2 && i10 != 3) {
                            if (i10 != 4) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            Throwable th3 = (Throwable) eVar.f2764Y;
                            N.B0(obj);
                            throw th3;
                        }
                        N.B0(obj);
                        return jf.y.f36177a;
                    }
                    lVar2 = (l) eVar.f2764Y;
                    try {
                        try {
                            N.B0(obj);
                        } catch (C3325c e11) {
                            e10 = e11;
                            Pc.e.a().b("Logout failed", e10, P4.a.o0(new C3959i("description", e10.b())));
                            eVar.f2764Y = null;
                            eVar.f2767i0 = 3;
                            if (lVar2.g(eVar) == enumC5000a) {
                                return enumC5000a;
                            }
                            return jf.y.f36177a;
                        }
                    } catch (Throwable th4) {
                        lVar = lVar2;
                        th2 = th4;
                        eVar.f2764Y = th2;
                        eVar.f2767i0 = 4;
                        if (lVar.g(eVar) != enumC5000a) {
                        }
                    }
                } else {
                    N.B0(obj);
                    AbstractC1809m0.a().b(C1816q.f23401c, w.f37484Y);
                    try {
                        try {
                            C3199a c3199a = this.f2795d;
                            try {
                                String str = P.f37057a;
                                AbstractC3557B.c0("account", c3199a);
                                O o10 = new O(c3199a);
                                o10.b();
                                String str2 = this.f2799h;
                                try {
                                    AbstractC3557B.c0("returnToUrl", str2);
                                    o10.f37055c = str2;
                                    eVar.f2764Y = this;
                                    eVar.f2767i0 = 1;
                                    if (o10.a(context, eVar) == enumC5000a) {
                                        return enumC5000a;
                                    }
                                    lVar2 = this;
                                } catch (C3325c e12) {
                                    e = e12;
                                    e10 = e;
                                    lVar2 = this;
                                    Pc.e.a().b("Logout failed", e10, P4.a.o0(new C3959i("description", e10.b())));
                                    eVar.f2764Y = null;
                                    eVar.f2767i0 = 3;
                                    if (lVar2.g(eVar) == enumC5000a) {
                                    }
                                    return jf.y.f36177a;
                                }
                            } catch (C3325c e13) {
                                e = e13;
                            }
                        } catch (C3325c e14) {
                            e10 = e14;
                        }
                    } catch (Throwable th5) {
                        th2 = th5;
                        lVar = this;
                        eVar.f2764Y = th2;
                        eVar.f2767i0 = 4;
                        if (lVar.g(eVar) != enumC5000a) {
                            return enumC5000a;
                        }
                        throw th2;
                    }
                }
                eVar.f2764Y = null;
                eVar.f2767i0 = 2;
                if (lVar2.g(eVar) == enumC5000a) {
                    return enumC5000a;
                }
                return jf.y.f36177a;
            }
        }
        eVar = new e(this, abstractC4825e);
        Object obj2 = eVar.f2765Z;
        enumC5000a = EnumC5000a.f41328Y;
        i10 = eVar.f2767i0;
        if (i10 == 0) {
        }
        eVar.f2764Y = null;
        eVar.f2767i0 = 2;
        if (lVar2.g(eVar) == enumC5000a) {
        }
        return jf.y.f36177a;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(AbstractC4825e abstractC4825e) {
        f fVar;
        int i10;
        try {
            if (abstractC4825e instanceof f) {
                fVar = (f) abstractC4825e;
                int i11 = fVar.f2770h0;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    fVar.f2770h0 = i11 - Integer.MIN_VALUE;
                    Object obj = fVar.f2768Y;
                    EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                    i10 = fVar.f2770h0;
                    if (i10 == 0) {
                        if (i10 == 1) {
                            N.B0(obj);
                        } else {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                    } else {
                        N.B0(obj);
                        C3477c c3477c = this.f2798g;
                        fVar.f2770h0 = 1;
                        obj = c3477c.b(fVar);
                        if (obj == enumC5000a) {
                            return enumC5000a;
                        }
                    }
                    return new C2140i(((Credentials) obj).a());
                }
            }
            if (i10 == 0) {
            }
            return new C2140i(((Credentials) obj).a());
        } catch (C3478d e10) {
            W.G(Pc.e.a(), "Failed to refresh credentials", e10, 4);
            return C2141j.f25666a;
        }
        fVar = new f(this, abstractC4825e);
        Object obj2 = fVar.f2768Y;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = fVar.f2770h0;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0021  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0031  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(AbstractC4825e abstractC4825e) {
        g gVar;
        int i10;
        l lVar;
        if (abstractC4825e instanceof g) {
            gVar = (g) abstractC4825e;
            int i11 = gVar.f2774i0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                gVar.f2774i0 = i11 - Integer.MIN_VALUE;
                Object obj = gVar.f2772Z;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = gVar.f2774i0;
                if (i10 == 0) {
                    if (i10 == 1) {
                        lVar = gVar.f2771Y;
                        N.B0(obj);
                    } else {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                } else {
                    N.B0(obj);
                    this.f2801j.setValue(b9.l.f25668a);
                    C3479e c3479e = (C3479e) this.f2798g.f32706b;
                    c3479e.a("com.auth0.access_token");
                    c3479e.a("com.auth0.refresh_token");
                    c3479e.a("com.auth0.id_token");
                    c3479e.a("com.auth0.token_type");
                    c3479e.a("com.auth0.expires_at");
                    c3479e.a("com.auth0.scope");
                    c3479e.a("com.auth0.cache_expires_at");
                    gVar.f2771Y = this;
                    gVar.f2774i0 = 1;
                    if (this.f25672a.a(gVar) == enumC5000a) {
                        return enumC5000a;
                    }
                    lVar = this;
                }
                lVar.f2800i.setValue(nd.j.f40291a);
                lVar.f2801j.setValue(C2142k.f25667a);
                return jf.y.f36177a;
            }
        }
        gVar = new g(this, abstractC4825e);
        Object obj2 = gVar.f2772Z;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = gVar.f2774i0;
        if (i10 == 0) {
        }
        lVar.f2800i.setValue(nd.j.f40291a);
        lVar.f2801j.setValue(C2142k.f25667a);
        return jf.y.f36177a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x009d A[Catch: all -> 0x0032, TRY_LEAVE, TryCatch #0 {all -> 0x0032, blocks: (B:14:0x002e, B:36:0x0092, B:38:0x009d), top: B:46:0x002e }] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00a2  */
    /* JADX WARN: Type inference failed for: r2v6, types: [Wg.a] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(AbstractC4825e abstractC4825e) {
        k kVar;
        int i10;
        Wg.d dVar;
        l lVar;
        Wg.d dVar2;
        Throwable th2;
        Object f6;
        l lVar2;
        b9.m mVar;
        String str;
        b9.m mVar2;
        if (abstractC4825e instanceof k) {
            kVar = (k) abstractC4825e;
            int i11 = kVar.f2791j0;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                kVar.f2791j0 = i11 - Integer.MIN_VALUE;
                Object obj = kVar.f2789h0;
                EnumC5000a enumC5000a = EnumC5000a.f41328Y;
                i10 = kVar.f2791j0;
                if (i10 == 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 == 3) {
                                dVar2 = kVar.f2788Z;
                                lVar2 = kVar.f2787Y;
                                try {
                                    N.B0(obj);
                                    mVar = (b9.m) obj;
                                    lVar2.f2801j.setValue(mVar);
                                    if (!(mVar instanceof C2140i)) {
                                        str = ((C2140i) mVar).f25665a;
                                    } else {
                                        str = null;
                                    }
                                    ((Wg.d) dVar2).g(null);
                                    return str;
                                } catch (Throwable th3) {
                                    th2 = th3;
                                    dVar2.g(null);
                                    throw th2;
                                }
                            }
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        ?? r22 = kVar.f2788Z;
                        l lVar3 = kVar.f2787Y;
                        N.B0(obj);
                        dVar = r22;
                        lVar = lVar3;
                        try {
                            kVar.f2787Y = lVar;
                            kVar.f2788Z = dVar;
                            kVar.f2791j0 = 3;
                            f6 = lVar.f(kVar);
                            if (f6 != enumC5000a) {
                                return enumC5000a;
                            }
                            dVar2 = dVar;
                            obj = f6;
                            lVar2 = lVar;
                            mVar = (b9.m) obj;
                            lVar2.f2801j.setValue(mVar);
                            if (!(mVar instanceof C2140i)) {
                            }
                            ((Wg.d) dVar2).g(null);
                            return str;
                        } catch (Throwable th4) {
                            dVar2 = dVar;
                            th2 = th4;
                            dVar2.g(null);
                            throw th2;
                        }
                    }
                    lVar = kVar.f2787Y;
                    N.B0(obj);
                } else {
                    N.B0(obj);
                    M1.w wVar = new M1.w(this.f2801j, 4);
                    kVar.f2787Y = this;
                    kVar.f2791j0 = 1;
                    obj = L4.a.m0(wVar, kVar);
                    if (obj == enumC5000a) {
                        return enumC5000a;
                    }
                    lVar = this;
                }
                mVar2 = (b9.m) obj;
                if (!(mVar2 instanceof C2140i)) {
                    return ((C2140i) mVar2).f25665a;
                }
                if (!(mVar2 instanceof C2141j)) {
                    return null;
                }
                dVar = lVar.f2797f;
                kVar.f2787Y = lVar;
                kVar.f2788Z = dVar;
                kVar.f2791j0 = 2;
                if (dVar.e(null, kVar) == enumC5000a) {
                    return enumC5000a;
                }
                kVar.f2787Y = lVar;
                kVar.f2788Z = dVar;
                kVar.f2791j0 = 3;
                f6 = lVar.f(kVar);
                if (f6 != enumC5000a) {
                }
            }
        }
        kVar = new k(this, abstractC4825e);
        Object obj2 = kVar.f2789h0;
        EnumC5000a enumC5000a2 = EnumC5000a.f41328Y;
        i10 = kVar.f2791j0;
        if (i10 == 0) {
        }
        mVar2 = (b9.m) obj2;
        if (!(mVar2 instanceof C2140i)) {
        }
    }
}
