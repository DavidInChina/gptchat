package h;

import B2.n;
import C2.x;
import C2.y;
import D1.AbstractC0347e;
import D1.C0345d;
import D1.C0349f;
import D1.Z;
import J2.s;
import L2.AbstractC0886g;
import L2.v;
import M3.H;
import V1.e0;
import Z.l1;
import android.content.ClipData;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Log;
import android.view.Display;
import android.view.View;
import com.revenuecat.purchases.common.networking.RCHTTPStatusCodes;
import g3.AbstractC3166i;
import g3.C3158a;
import h7.C3327a;
import i7.C3482a;
import id.AbstractC3557B;
import io.sentry.android.core.AbstractC3612c;
import j.AbstractC3873c;
import j7.C3914d;
import j7.C3919i;
import j7.C3922l;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.UnknownHostException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Pattern;
import java.util.zip.GZIPInputStream;
import java.util.zip.GZIPOutputStream;
import k7.AbstractC4202c;
import l7.AbstractC4341b;
import m7.C4567c;
import p2.C5061n;
import p2.C5065s;
import p2.M;
import p2.V;
import p2.r0;
import s2.AbstractC5530A;
import s2.AbstractC5535e;
import s2.p;
import x8.K;
import y1.AbstractC6496f;
import y2.C6504G;
import y2.SurfaceHolder$CallbackC6500C;

/* renamed from: h.b  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3276b implements AbstractC3873c, AbstractC6496f, s2.m, AbstractC5535e, x, AbstractC0886g, d5.c, AbstractC4341b, k7.i {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f31646Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f31647Z;

    public /* synthetic */ C3276b(int i10, Object obj) {
        this.f31646Y = i10;
        this.f31647Z = obj;
    }

    @Override // d5.c
    public final Object a() {
        int i10 = this.f31646Y;
        d5.b bVar = (d5.b) this.f31647Z;
        switch (i10) {
            case 20:
                return bVar.w0();
            default:
                return bVar.w0();
        }
    }

    @Override // s2.AbstractC5535e
    public final void accept(Object obj) {
        int i10 = this.f31646Y;
        Object obj2 = this.f31647Z;
        switch (i10) {
            case 11:
                ((n) obj).e((Exception) obj2);
                return;
            case 16:
                AbstractC3166i abstractC3166i = (AbstractC3166i) obj2;
                abstractC3166i.getClass();
                long j6 = ((C3158a) obj).f31163b;
                abstractC3166i.getClass();
                throw null;
            default:
                ((K) obj2).d0((C3158a) obj);
                return;
        }
    }

    @Override // k7.i
    public final Object apply(Object obj) {
        URL url;
        InputStream inputStream;
        int i10 = this.f31646Y;
        Object obj2 = this.f31647Z;
        switch (i10) {
            case 22:
                c7.d dVar = (c7.d) obj2;
                c7.b bVar = (c7.b) obj;
                dVar.getClass();
                URL url2 = bVar.f26332a;
                String W6 = H.W("CctTransportBackend");
                if (Log.isLoggable(W6, 4)) {
                    Log.i(W6, String.format("Making request to: %s", url2));
                }
                HttpURLConnection httpURLConnection = (HttpURLConnection) bVar.f26332a.openConnection();
                httpURLConnection.setConnectTimeout(30000);
                httpURLConnection.setReadTimeout(dVar.f26344g);
                httpURLConnection.setDoOutput(true);
                httpURLConnection.setInstanceFollowRedirects(false);
                httpURLConnection.setRequestMethod("POST");
                httpURLConnection.setRequestProperty(SIPHeaderNames.USER_AGENT, "datatransport/3.1.8 android/");
                httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_ENCODING, "gzip");
                httpURLConnection.setRequestProperty(SIPHeaderNames.CONTENT_TYPE, "application/json");
                httpURLConnection.setRequestProperty(SIPHeaderNames.ACCEPT_ENCODING, "gzip");
                String str = bVar.f26334c;
                if (str != null) {
                    httpURLConnection.setRequestProperty("X-Goog-Api-Key", str);
                }
                try {
                    try {
                        try {
                            OutputStream outputStream = httpURLConnection.getOutputStream();
                            try {
                                GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(outputStream);
                                dVar.f26338a.h(bVar.f26333b, new BufferedWriter(new OutputStreamWriter(gZIPOutputStream)));
                                gZIPOutputStream.close();
                                if (outputStream != null) {
                                    outputStream.close();
                                }
                                int responseCode = httpURLConnection.getResponseCode();
                                Integer valueOf = Integer.valueOf(responseCode);
                                String W10 = H.W("CctTransportBackend");
                                if (Log.isLoggable(W10, 4)) {
                                    Log.i(W10, String.format("Status Code: %d", valueOf));
                                }
                                H.M("CctTransportBackend", "Content-Type: %s", httpURLConnection.getHeaderField(SIPHeaderNames.CONTENT_TYPE));
                                H.M("CctTransportBackend", "Content-Encoding: %s", httpURLConnection.getHeaderField(SIPHeaderNames.CONTENT_ENCODING));
                                if (responseCode != 302 && responseCode != 301 && responseCode != 307) {
                                    if (responseCode != 200) {
                                        return new c7.c(responseCode, null, 0L);
                                    }
                                    InputStream inputStream2 = httpURLConnection.getInputStream();
                                    try {
                                        if ("gzip".equals(httpURLConnection.getHeaderField(SIPHeaderNames.CONTENT_ENCODING))) {
                                            inputStream = new GZIPInputStream(inputStream2);
                                        } else {
                                            inputStream = inputStream2;
                                        }
                                        c7.c cVar = new c7.c(responseCode, null, d7.n.a(new BufferedReader(new InputStreamReader(inputStream))).f28113a);
                                        if (inputStream != null) {
                                            inputStream.close();
                                        }
                                        if (inputStream2 != null) {
                                            inputStream2.close();
                                        }
                                        return cVar;
                                    } catch (Throwable th2) {
                                        if (inputStream2 != null) {
                                            try {
                                                inputStream2.close();
                                            } catch (Throwable th3) {
                                                th2.addSuppressed(th3);
                                            }
                                        }
                                        throw th2;
                                    }
                                }
                                return new c7.c(responseCode, new URL(httpURLConnection.getHeaderField("Location")), 0L);
                            } catch (Throwable th4) {
                                if (outputStream != null) {
                                    try {
                                        outputStream.close();
                                    } catch (Throwable th5) {
                                        th4.addSuppressed(th5);
                                    }
                                }
                                throw th4;
                            }
                        } catch (ConnectException | UnknownHostException e10) {
                            e = e10;
                            url = null;
                            H.N("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                            return new c7.c(500, url, 0L);
                        }
                    } catch (E8.b | IOException e11) {
                        H.N("CctTransportBackend", "Couldn't encode request, returning with 400", e11);
                        return new c7.c(RCHTTPStatusCodes.BAD_REQUEST, null, 0L);
                    }
                } catch (ConnectException | UnknownHostException e12) {
                    e = e12;
                    url = null;
                    H.N("CctTransportBackend", "Couldn't open connection, returning with 500", e);
                    return new c7.c(500, url, 0L);
                }
            default:
                Map map = (Map) obj2;
                Cursor cursor = (Cursor) obj;
                b7.b bVar2 = k7.k.f37187k0;
                while (cursor.moveToNext()) {
                    long j6 = cursor.getLong(0);
                    Set set = (Set) map.get(Long.valueOf(j6));
                    if (set == null) {
                        set = new HashSet();
                        map.put(Long.valueOf(j6), set);
                    }
                    set.add(new k7.j(cursor.getString(1), cursor.getString(2)));
                }
                return null;
        }
    }

    @Override // y1.AbstractC6496f
    public final void b() {
        e0 e0Var = (e0) this.f31647Z;
        AbstractC3557B.c0("this$0", e0Var);
        e0Var.a();
    }

    @Override // l7.AbstractC4341b
    public final Object c() {
        int i10 = this.f31646Y;
        Object obj = this.f31647Z;
        switch (i10) {
            case 23:
                k7.k kVar = (k7.k) ((k7.d) obj);
                Integer num = (Integer) kVar.i(new z2.g(kVar, ((C4567c) kVar.f37189Z).a() - kVar.f37191i0.f37170d, 1));
                num.getClass();
                return num;
            case 24:
                k7.k kVar2 = (k7.k) ((C3919i) obj).f36063i;
                kVar2.getClass();
                kVar2.i(new k7.g(kVar2, 0));
                return null;
            case 25:
                k7.k kVar3 = (k7.k) ((AbstractC4202c) obj);
                kVar3.getClass();
                int i11 = C3327a.f31920e;
                U3.n nVar = new U3.n(8);
                HashMap hashMap = new HashMap();
                SQLiteDatabase a5 = kVar3.a();
                a5.beginTransaction();
                try {
                    C3327a c3327a = (C3327a) k7.k.p(a5.rawQuery("SELECT log_source, reason, events_dropped_count FROM log_event_dropped", new String[0]), new C3482a(kVar3, hashMap, nVar, 4));
                    a5.setTransactionSuccessful();
                    return c3327a;
                } finally {
                    a5.endTransaction();
                }
            default:
                C3922l c3922l = (C3922l) obj;
                k7.k kVar4 = (k7.k) c3922l.f36076b;
                kVar4.getClass();
                for (e7.i iVar : (Iterable) kVar4.i(new A9.a(9))) {
                    ((C3914d) c3922l.f36077c).a(iVar, 1, false);
                }
                return null;
        }
    }

    @Override // j.AbstractC3873c
    public final void d(Object obj) {
        ((wf.k) ((l1) this.f31647Z).getValue()).invoke(obj);
    }

    @Override // L2.AbstractC0886g
    public final long e(long j6) {
        v vVar = (v) this.f31647Z;
        return AbstractC5530A.j((j6 * vVar.f10646e) / 1000000, 0L, vVar.f10651j - 1);
    }

    @Override // C2.x
    public final int f(Object obj) {
        boolean z10;
        C5065s c5065s = (C5065s) this.f31647Z;
        C2.m mVar = (C2.m) obj;
        Pattern pattern = y.f2635a;
        mVar.getClass();
        String str = c5065s.f42319q0;
        String str2 = mVar.f2548b;
        if (!str2.equals(str) && !str2.equals(y.b(c5065s))) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (z10 && mVar.c(c5065s, false)) {
            return 1;
        }
        return 0;
    }

    public final boolean g(F4.a aVar, int i10, Bundle bundle) {
        AbstractC0347e abstractC0347e;
        View view = (View) this.f31647Z;
        int i11 = Build.VERSION.SDK_INT;
        if (i11 >= 25 && (i10 & 1) != 0) {
            try {
                ((G1.g) aVar.f5033Z).d();
                Parcelable parcelable = (Parcelable) ((G1.g) aVar.f5033Z).f();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception e10) {
                AbstractC3612c.s("InputConnectionCompat", "Can't insert content from IME; requestPermission() failed", e10);
                return false;
            }
        }
        ClipData clipData = new ClipData(((G1.g) aVar.f5033Z).getDescription(), new ClipData.Item(((G1.g) aVar.f5033Z).a()));
        if (i11 >= 31) {
            abstractC0347e = new C0345d(clipData, 2);
        } else {
            abstractC0347e = new C0349f(clipData, 2);
        }
        abstractC0347e.j(((G1.g) aVar.f5033Z).e());
        abstractC0347e.i(bundle);
        if (Z.h(view, abstractC0347e.f()) != null) {
            return false;
        }
        return true;
    }

    public final void h(Display display) {
        s sVar = (s) this.f31647Z;
        sVar.getClass();
        if (display != null) {
            long refreshRate = (long) (1.0E9d / display.getRefreshRate());
            sVar.f8819k = refreshRate;
            sVar.f8820l = (refreshRate * 80) / 100;
            return;
        }
        p.g("VideoFrameReleaseHelper", "Unable to query display refresh rate");
        sVar.f8819k = -9223372036854775807L;
        sVar.f8820l = -9223372036854775807L;
    }

    @Override // s2.m
    public final void invoke(Object obj) {
        int i10 = this.f31646Y;
        Object obj2 = this.f31647Z;
        switch (i10) {
            case 4:
                int i11 = C6504G.f50341Z;
                ((V) obj).r((p2.K) obj2);
                return;
            case 5:
                ((V) obj).m((r2.c) obj2);
                return;
            case 6:
                ((V) obj).r(((SurfaceHolder$CallbackC6500C) obj2).f50334Y.f50351J);
                return;
            case 7:
                ((V) obj).l((M) obj2);
                return;
            case 8:
                ((V) obj).z((List) obj2);
                return;
            case 9:
                ((V) obj).q((r0) obj2);
                return;
            default:
                ((V) obj).G((C5061n) obj2);
                return;
        }
    }
}
