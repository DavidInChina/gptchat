package i5;

import Lg.n;
import Ng.C1072l;
import android.content.SharedPreferences;
import android.gov.nist.core.Separators;
import android.text.TextUtils;
import com.auth0.android.result.Credentials;
import com.google.android.gms.internal.play_billing.N;
import g5.C3200b;
import h5.C3324b;
import h5.C3325c;
import i4.C3471d;
import id.AbstractC3557B;
import j5.AbstractC3910a;
import java.util.Arrays;
import java.util.Date;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import kf.w;
import nf.AbstractC4828h;
import of.EnumC5000a;
import pf.AbstractC5156c;
import q1.AbstractC5260f;

/* renamed from: i5.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3477c extends AbstractC3475a {

    /* renamed from: d  reason: collision with root package name */
    public final Executor f32714d;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public C3477c(C3324b c3324b, C3479e c3479e) {
        super(c3324b, c3479e, r0);
        C3471d c3471d = new C3471d(17);
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        AbstractC3557B.b0("newSingleThreadExecutor()", newSingleThreadExecutor);
        this.f32714d = newSingleThreadExecutor;
    }

    public final Object b(AbstractC5156c abstractC5156c) {
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC5156c));
        c1072l.u();
        final C.b bVar = new C.b(0, c1072l);
        this.f32714d.execute(new Runnable(this) { // from class: i5.b

            /* renamed from: Y  reason: collision with root package name */
            public final /* synthetic */ C3477c f32708Y;

            /* renamed from: h0  reason: collision with root package name */
            public final /* synthetic */ int f32710h0 = 0;

            /* renamed from: i0  reason: collision with root package name */
            public final /* synthetic */ String f32711i0 = null;

            /* renamed from: j0  reason: collision with root package name */
            public final /* synthetic */ boolean f32712j0 = false;

            /* renamed from: k0  reason: collision with root package name */
            public final /* synthetic */ Map f32713k0;

            {
                w wVar = w.f37484Y;
                this.f32708Y = this;
                this.f32713k0 = wVar;
            }

            @Override // java.lang.Runnable
            public final void run() {
                Long l10;
                long j6;
                int i10;
                boolean z10;
                int i11;
                String str;
                String str2;
                String str3;
                C3477c c3477c = this.f32708Y;
                AbstractC3557B.c0("this$0", c3477c);
                AbstractC3910a abstractC3910a = bVar;
                AbstractC3557B.c0("$callback", abstractC3910a);
                Map map = this.f32713k0;
                AbstractC3557B.c0("$parameters", map);
                C3479e c3479e = (C3479e) c3477c.f32706b;
                String b10 = c3479e.b("com.auth0.access_token");
                String b11 = c3479e.b("com.auth0.refresh_token");
                String b12 = c3479e.b("com.auth0.id_token");
                String b13 = c3479e.b("com.auth0.token_type");
                SharedPreferences sharedPreferences = c3479e.f32715a;
                if (!sharedPreferences.contains("com.auth0.expires_at")) {
                    l10 = null;
                } else {
                    l10 = Long.valueOf(sharedPreferences.getLong("com.auth0.expires_at", 0L));
                }
                String b14 = c3479e.b("com.auth0.scope");
                if ((TextUtils.isEmpty(b10) && TextUtils.isEmpty(b12)) || l10 == null) {
                    abstractC3910a.d(new C3200b("No Credentials were previously set.", null));
                    return;
                }
                long longValue = l10.longValue();
                int i12 = this.f32710h0;
                long j10 = i12;
                boolean a5 = c3477c.a(longValue, j10);
                String str4 = this.f32711i0;
                if (str4 == null) {
                    i10 = i12;
                    j6 = j10;
                    z10 = false;
                } else {
                    if (b14 == null) {
                        str3 = "";
                    } else {
                        str3 = b14;
                    }
                    i10 = i12;
                    j6 = j10;
                    String[] strArr = (String[]) n.G2(str3, new String[]{Separators.SP}).toArray(new String[0]);
                    Arrays.sort(strArr);
                    String[] strArr2 = (String[]) n.G2(str4, new String[]{Separators.SP}).toArray(new String[0]);
                    Arrays.sort(strArr2);
                    z10 = !Arrays.equals(strArr, strArr2);
                }
                if (!this.f32712j0 && !a5 && !z10) {
                    if (b12 == null) {
                        b12 = "";
                    }
                    if (b10 == null) {
                        str = "";
                    } else {
                        str = b10;
                    }
                    if (b13 == null) {
                        str2 = "";
                    } else {
                        str2 = b13;
                    }
                    abstractC3910a.a(new Credentials(b12, str, str2, b11, new Date(l10.longValue()), b14));
                } else if (b11 == null) {
                    abstractC3910a.d(new C3200b("Credentials need to be renewed but no Refresh Token is available to renew them.", null));
                } else {
                    com.auth0.android.request.internal.b a10 = c3477c.f32705a.a(b11);
                    a10.a(map);
                    if (str4 != null) {
                        if (AbstractC3557B.K("scope", "scope")) {
                            str4 = AbstractC4828h.S(str4);
                        }
                        AbstractC3557B.c0("value", str4);
                        ((Map) a10.f26724f.f17493h0).put("scope", str4);
                    }
                    try {
                        Credentials credentials = (Credentials) a10.b();
                        long time = credentials.b().getTime();
                        if (c3477c.a(time, j6)) {
                            c3477c.f32707c.getClass();
                            abstractC3910a.d(new C3200b(String.format(Locale.getDefault(), "The lifetime of the renewed Access Token (%d) is less than the minTTL requested (%d). Increase the 'Token Expiration' setting of your Auth0 API in the dashboard, or request a lower minTTL.", Arrays.copyOf(new Object[]{Long.valueOf(((time - System.currentTimeMillis()) - (i11 * 1000)) / (-1000)), Integer.valueOf(i10)}, 2)), null));
                            return;
                        }
                        if (!TextUtils.isEmpty(credentials.d())) {
                            b11 = credentials.d();
                        }
                        Credentials credentials2 = new Credentials(credentials.c(), credentials.a(), credentials.f(), b11, credentials.b(), credentials.e());
                        c3477c.c(credentials2);
                        abstractC3910a.a(credentials2);
                    } catch (C3325c e10) {
                        abstractC3910a.d(new C3200b("An error occurred while trying to use the Refresh Token to renew the Credentials.", e10));
                    }
                }
            }
        });
        Object t10 = c1072l.t();
        if (t10 == EnumC5000a.f41328Y) {
            N.k0(abstractC5156c);
        }
        return t10;
    }

    public final void c(Credentials credentials) {
        AbstractC3557B.c0("credentials", credentials);
        if (TextUtils.isEmpty(credentials.a()) && TextUtils.isEmpty(credentials.c())) {
            throw new C3200b("Credentials must have a valid date of expiration and a valid access_token or id_token value.", null);
        }
        String a5 = credentials.a();
        C3479e c3479e = (C3479e) this.f32706b;
        c3479e.d("com.auth0.access_token", a5);
        c3479e.d("com.auth0.refresh_token", credentials.d());
        c3479e.d("com.auth0.id_token", credentials.c());
        c3479e.d("com.auth0.token_type", credentials.f());
        c3479e.c("com.auth0.expires_at", Long.valueOf(credentials.b().getTime()));
        c3479e.d("com.auth0.scope", credentials.e());
        c3479e.c("com.auth0.cache_expires_at", Long.valueOf(credentials.b().getTime()));
    }
}
