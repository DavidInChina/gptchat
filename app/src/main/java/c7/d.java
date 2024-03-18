package c7;

import M3.H;
import S4.o;
import android.content.Context;
import android.content.pm.PackageManager;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.SparseArray;
import d7.AbstractC2601a;
import d7.C2602b;
import d7.C2603c;
import d7.C2604d;
import d7.e;
import d7.f;
import d7.g;
import d7.i;
import d7.j;
import d7.k;
import d7.l;
import d7.m;
import d7.p;
import d7.r;
import d7.s;
import d7.t;
import d7.u;
import d7.v;
import d7.w;
import f7.h;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Calendar;
import java.util.Locale;
import java.util.Map;
import java.util.TimeZone;
import m7.AbstractC4565a;
import q.C5241w;

/* loaded from: classes.dex */
public final class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public final o f26338a;

    /* renamed from: b  reason: collision with root package name */
    public final ConnectivityManager f26339b;

    /* renamed from: c  reason: collision with root package name */
    public final Context f26340c;

    /* renamed from: e  reason: collision with root package name */
    public final AbstractC4565a f26342e;

    /* renamed from: f  reason: collision with root package name */
    public final AbstractC4565a f26343f;

    /* renamed from: d  reason: collision with root package name */
    public final URL f26341d = b(C2303a.f26327c);

    /* renamed from: g  reason: collision with root package name */
    public final int f26344g = 130000;

    public d(Context context, AbstractC4565a abstractC4565a, AbstractC4565a abstractC4565a2) {
        G8.d dVar = new G8.d();
        C2603c c2603c = C2603c.f28048a;
        dVar.a(p.class, c2603c);
        dVar.a(j.class, c2603c);
        f fVar = f.f28061a;
        dVar.a(t.class, fVar);
        dVar.a(m.class, fVar);
        C2604d c2604d = C2604d.f28050a;
        dVar.a(r.class, c2604d);
        dVar.a(k.class, c2604d);
        C2602b c2602b = C2602b.f28035a;
        dVar.a(AbstractC2601a.class, c2602b);
        dVar.a(i.class, c2602b);
        e eVar = e.f28053a;
        dVar.a(s.class, eVar);
        dVar.a(l.class, eVar);
        g gVar = g.f28069a;
        dVar.a(w.class, gVar);
        dVar.a(d7.o.class, gVar);
        dVar.f6083d = true;
        this.f26338a = new o(10, dVar);
        this.f26340c = context;
        this.f26339b = (ConnectivityManager) context.getSystemService("connectivity");
        this.f26342e = abstractC4565a2;
        this.f26343f = abstractC4565a;
    }

    public static URL b(String str) {
        try {
            return new URL(str);
        } catch (MalformedURLException e10) {
            throw new IllegalArgumentException(R.a.r("Invalid url: ", str), e10);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a7, code lost:
        if (((d7.u) d7.u.f28118Y.get(r0)) != null) goto L21;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00af  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x010a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final e7.h a(e7.h hVar) {
        int i10;
        int i11;
        Map map;
        NetworkInfo activeNetworkInfo = this.f26339b.getActiveNetworkInfo();
        C5241w c10 = hVar.c();
        int i12 = Build.VERSION.SDK_INT;
        Map map2 = (Map) c10.f43578f;
        if (map2 != null) {
            map2.put("sdk-version", String.valueOf(i12));
            c10.c("model", Build.MODEL);
            c10.c("hardware", Build.HARDWARE);
            c10.c("device", Build.DEVICE);
            c10.c("product", Build.PRODUCT);
            c10.c("os-uild", Build.ID);
            c10.c("manufacturer", Build.MANUFACTURER);
            c10.c("fingerprint", Build.FINGERPRINT);
            Calendar.getInstance();
            long offset = TimeZone.getDefault().getOffset(Calendar.getInstance().getTimeInMillis()) / 1000;
            Map map3 = (Map) c10.f43578f;
            if (map3 != null) {
                map3.put("tz-offset", String.valueOf(offset));
                int i13 = -1;
                if (activeNetworkInfo == null) {
                    SparseArray sparseArray = v.f28120Y;
                    i10 = -1;
                } else {
                    i10 = activeNetworkInfo.getType();
                }
                Map map4 = (Map) c10.f43578f;
                if (map4 != null) {
                    map4.put("net-type", String.valueOf(i10));
                    if (activeNetworkInfo == null) {
                        SparseArray sparseArray2 = u.f28118Y;
                    } else {
                        i11 = activeNetworkInfo.getSubtype();
                        if (i11 == -1) {
                            SparseArray sparseArray3 = u.f28118Y;
                            i11 = 100;
                        }
                        map = (Map) c10.f43578f;
                        if (map == null) {
                            map.put("mobile-subtype", String.valueOf(i11));
                            c10.c("country", Locale.getDefault().getCountry());
                            c10.c("locale", Locale.getDefault().getLanguage());
                            Context context = this.f26340c;
                            c10.c("mcc_mnc", ((TelephonyManager) context.getSystemService("phone")).getSimOperator());
                            try {
                                i13 = context.getPackageManager().getPackageInfo(context.getPackageName(), 0).versionCode;
                            } catch (PackageManager.NameNotFoundException e10) {
                                H.N("CctTransportBackend", "Unable to find version code for package", e10);
                            }
                            c10.c("application_build", Integer.toString(i13));
                            return c10.e();
                        }
                        throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                    }
                    i11 = 0;
                    map = (Map) c10.f43578f;
                    if (map == null) {
                    }
                } else {
                    throw new IllegalStateException("Property \"autoMetadata\" has not been set");
                }
            } else {
                throw new IllegalStateException("Property \"autoMetadata\" has not been set");
            }
        } else {
            throw new IllegalStateException("Property \"autoMetadata\" has not been set");
        }
    }
}
