package B6;

import A.AbstractC0044t0;
import I8.w;
import android.gov.nist.core.Separators;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.gov.nist.javax.sip.header.extensions.ReferencesHeader;
import android.gov.nist.javax.sip.stack.SIPServerTransaction;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import java.util.List;
import z.AbstractC6708l;

/* loaded from: classes.dex */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final I2.i f1930a;

    /* renamed from: b  reason: collision with root package name */
    public final long f1931b;

    /* renamed from: d  reason: collision with root package name */
    public final int f1933d;

    /* renamed from: e  reason: collision with root package name */
    public final String f1934e;

    /* renamed from: f  reason: collision with root package name */
    public final b f1935f;

    /* renamed from: g  reason: collision with root package name */
    public final e f1936g;

    /* renamed from: h  reason: collision with root package name */
    public final g f1937h;

    /* renamed from: i  reason: collision with root package name */
    public final a f1938i;

    /* renamed from: k  reason: collision with root package name */
    public final f f1940k;

    /* renamed from: c  reason: collision with root package name */
    public final String f1932c = "dd-sdk-android";

    /* renamed from: j  reason: collision with root package name */
    public final List f1939j = null;

    /* renamed from: l  reason: collision with root package name */
    public final String f1941l = "telemetry";

    public h(I2.i iVar, long j6, int i10, String str, b bVar, e eVar, g gVar, a aVar, f fVar) {
        AbstractC2469q0.q("source", i10);
        AbstractC3557B.c0(ParameterNames.VERSION, str);
        this.f1930a = iVar;
        this.f1931b = j6;
        this.f1933d = i10;
        this.f1934e = str;
        this.f1935f = bVar;
        this.f1936g = eVar;
        this.f1937h = gVar;
        this.f1938i = aVar;
        this.f1940k = fVar;
    }

    public final I8.u a() {
        I8.u uVar = new I8.u();
        uVar.U("_dd", this.f1930a.b());
        uVar.m0("type", this.f1941l);
        uVar.V(Long.valueOf(this.f1931b), "date");
        uVar.m0(ReferencesHeader.SERVICE, this.f1932c);
        uVar.U("source", new w(AbstractC0044t0.l(this.f1933d)));
        uVar.m0(ParameterNames.VERSION, this.f1934e);
        b bVar = this.f1935f;
        if (bVar != null) {
            I8.u uVar2 = new I8.u();
            uVar2.m0(ParameterNames.ID, bVar.f1873a);
            uVar.U(SIPServerTransaction.CONTENT_TYPE_APPLICATION, uVar2);
        }
        e eVar = this.f1936g;
        if (eVar != null) {
            I8.u uVar3 = new I8.u();
            uVar3.m0(ParameterNames.ID, eVar.f1926a);
            uVar.U(ParameterNames.SESSION, uVar3);
        }
        g gVar = this.f1937h;
        if (gVar != null) {
            I8.u uVar4 = new I8.u();
            uVar4.m0(ParameterNames.ID, gVar.f1929a);
            uVar.U("view", uVar4);
        }
        a aVar = this.f1938i;
        if (aVar != null) {
            I8.u uVar5 = new I8.u();
            uVar5.m0(ParameterNames.ID, aVar.f1872a);
            uVar.U("action", uVar5);
        }
        List<String> list = this.f1939j;
        if (list != null) {
            I8.p pVar = new I8.p(list.size());
            for (String str : list) {
                pVar.V(str);
            }
            uVar.U("experimental_features", pVar);
        }
        f fVar = this.f1940k;
        fVar.getClass();
        I8.u uVar6 = new I8.u();
        uVar6.m0("type", fVar.f1928b);
        c cVar = fVar.f1927a;
        cVar.getClass();
        I8.u uVar7 = new I8.u();
        Long l10 = cVar.f1896a;
        if (l10 != null) {
            AbstractC0044t0.C(l10, uVar7, "session_sample_rate");
        }
        Long l11 = cVar.f1898b;
        if (l11 != null) {
            AbstractC0044t0.C(l11, uVar7, "telemetry_sample_rate");
        }
        Long l12 = cVar.f1900c;
        if (l12 != null) {
            AbstractC0044t0.C(l12, uVar7, "telemetry_configuration_sample_rate");
        }
        Long l13 = cVar.f1901d;
        if (l13 != null) {
            AbstractC0044t0.C(l13, uVar7, "trace_sample_rate");
        }
        Long l14 = cVar.f1902e;
        if (l14 != null) {
            AbstractC0044t0.C(l14, uVar7, "premium_sample_rate");
        }
        Long l15 = cVar.f1903f;
        if (l15 != null) {
            AbstractC0044t0.C(l15, uVar7, "replay_sample_rate");
        }
        Long l16 = cVar.f1904g;
        if (l16 != null) {
            AbstractC0044t0.C(l16, uVar7, "session_replay_sample_rate");
        }
        Boolean bool = cVar.f1905h;
        if (bool != null) {
            uVar7.i0("start_session_replay_recording_manually", bool);
        }
        Boolean bool2 = cVar.f1906i;
        if (bool2 != null) {
            uVar7.i0("use_proxy", bool2);
        }
        Boolean bool3 = cVar.f1907j;
        if (bool3 != null) {
            uVar7.i0("use_before_send", bool3);
        }
        Boolean bool4 = cVar.f1908k;
        if (bool4 != null) {
            uVar7.i0("silent_multiple_init", bool4);
        }
        Boolean bool5 = cVar.f1909l;
        if (bool5 != null) {
            uVar7.i0("track_session_across_subdomains", bool5);
        }
        Boolean bool6 = cVar.f1910m;
        if (bool6 != null) {
            uVar7.i0("track_resources", bool6);
        }
        Boolean bool7 = cVar.f1911n;
        if (bool7 != null) {
            uVar7.i0("track_long_task", bool7);
        }
        Boolean bool8 = cVar.f1912o;
        if (bool8 != null) {
            uVar7.i0("use_cross_site_session_cookie", bool8);
        }
        Boolean bool9 = cVar.f1913p;
        if (bool9 != null) {
            uVar7.i0("use_secure_session_cookie", bool9);
        }
        Boolean bool10 = cVar.f1914q;
        if (bool10 != null) {
            uVar7.i0("allow_fallback_to_local_storage", bool10);
        }
        Boolean bool11 = cVar.f1915r;
        if (bool11 != null) {
            uVar7.i0("store_contexts_across_pages", bool11);
        }
        Boolean bool12 = cVar.f1916s;
        if (bool12 != null) {
            uVar7.i0("allow_untrusted_events", bool12);
        }
        String str2 = cVar.f1917t;
        if (str2 != null) {
            uVar7.m0("action_name_attribute", str2);
        }
        Boolean bool13 = cVar.f1918u;
        if (bool13 != null) {
            uVar7.i0("use_allowed_tracing_origins", bool13);
        }
        Boolean bool14 = cVar.f1919v;
        if (bool14 != null) {
            uVar7.i0("use_allowed_tracing_urls", bool14);
        }
        List<d> list2 = cVar.f1920w;
        if (list2 != null) {
            I8.p pVar2 = new I8.p(list2.size());
            for (d dVar : list2) {
                pVar2.U(new w(dVar.f1925Y));
            }
            uVar7.U("selected_tracing_propagators", pVar2);
        }
        String str3 = cVar.f1921x;
        if (str3 != null) {
            uVar7.m0("default_privacy_level", str3);
        }
        Boolean bool15 = cVar.f1922y;
        if (bool15 != null) {
            uVar7.i0("use_excluded_activity_urls", bool15);
        }
        Boolean bool16 = cVar.f1923z;
        if (bool16 != null) {
            uVar7.i0("use_worker_url", bool16);
        }
        Boolean bool17 = cVar.f1874A;
        if (bool17 != null) {
            uVar7.i0("track_frustrations", bool17);
        }
        Boolean bool18 = cVar.f1875B;
        if (bool18 != null) {
            uVar7.i0("track_views_manually", bool18);
        }
        Boolean bool19 = cVar.f1876C;
        if (bool19 != null) {
            uVar7.i0("track_interactions", bool19);
        }
        Boolean bool20 = cVar.f1877D;
        if (bool20 != null) {
            uVar7.i0("track_user_interactions", bool20);
        }
        Boolean bool21 = cVar.f1878E;
        if (bool21 != null) {
            uVar7.i0("forward_errors_to_logs", bool21);
        }
        List<String> list3 = cVar.f1879F;
        if (list3 != null) {
            I8.p pVar3 = new I8.p(list3.size());
            for (String str4 : list3) {
                pVar3.V(str4);
            }
            uVar7.U("forward_console_logs", pVar3);
        }
        List<String> list4 = cVar.f1880G;
        if (list4 != null) {
            I8.p pVar4 = new I8.p(list4.size());
            for (String str5 : list4) {
                pVar4.V(str5);
            }
            uVar7.U("forward_reports", pVar4);
        }
        Boolean bool22 = cVar.f1881H;
        if (bool22 != null) {
            uVar7.i0("use_local_encryption", bool22);
        }
        int i10 = cVar.f1899b0;
        if (i10 != 0) {
            uVar7.U("view_tracking_strategy", new w(AbstractC0044t0.m(i10)));
        }
        Boolean bool23 = cVar.f1882I;
        if (bool23 != null) {
            uVar7.i0("track_background_events", bool23);
        }
        Long l17 = cVar.f1883J;
        if (l17 != null) {
            AbstractC0044t0.C(l17, uVar7, "mobile_vitals_update_period");
        }
        Boolean bool24 = cVar.f1884K;
        if (bool24 != null) {
            uVar7.i0("track_errors", bool24);
        }
        Boolean bool25 = cVar.f1885L;
        if (bool25 != null) {
            uVar7.i0("track_network_requests", bool25);
        }
        Boolean bool26 = cVar.f1886M;
        if (bool26 != null) {
            uVar7.i0("use_tracing", bool26);
        }
        Boolean bool27 = cVar.f1887N;
        if (bool27 != null) {
            uVar7.i0("track_native_views", bool27);
        }
        Boolean bool28 = cVar.f1888O;
        if (bool28 != null) {
            uVar7.i0("track_native_errors", bool28);
        }
        Boolean bool29 = cVar.P;
        if (bool29 != null) {
            uVar7.i0("track_native_long_tasks", bool29);
        }
        Boolean bool30 = cVar.Q;
        if (bool30 != null) {
            uVar7.i0("track_cross_platform_long_tasks", bool30);
        }
        Boolean bool31 = cVar.f1889R;
        if (bool31 != null) {
            uVar7.i0("use_first_party_hosts", bool31);
        }
        String str6 = cVar.S;
        if (str6 != null) {
            uVar7.m0("initialization_type", str6);
        }
        Boolean bool32 = cVar.T;
        if (bool32 != null) {
            uVar7.i0("track_flutter_performance", bool32);
        }
        Long l18 = cVar.f1890U;
        if (l18 != null) {
            AbstractC0044t0.C(l18, uVar7, "batch_size");
        }
        Long l19 = cVar.f1891V;
        if (l19 != null) {
            AbstractC0044t0.C(l19, uVar7, "batch_upload_frequency");
        }
        Long l20 = cVar.f1892W;
        if (l20 != null) {
            AbstractC0044t0.C(l20, uVar7, "batch_processing_level");
        }
        Boolean bool33 = cVar.f1893X;
        if (bool33 != null) {
            uVar7.i0("background_tasks_enabled", bool33);
        }
        String str7 = cVar.f1894Y;
        if (str7 != null) {
            uVar7.m0("react_version", str7);
        }
        String str8 = cVar.f1895Z;
        if (str8 != null) {
            uVar7.m0("react_native_version", str8);
        }
        String str9 = cVar.f1897a0;
        if (str9 != null) {
            uVar7.m0("dart_version", str9);
        }
        uVar6.U("configuration", uVar7);
        uVar.U("telemetry", uVar6);
        return uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        if (AbstractC3557B.K(this.f1930a, hVar.f1930a) && this.f1931b == hVar.f1931b && AbstractC3557B.K(this.f1932c, hVar.f1932c) && this.f1933d == hVar.f1933d && AbstractC3557B.K(this.f1934e, hVar.f1934e) && AbstractC3557B.K(this.f1935f, hVar.f1935f) && AbstractC3557B.K(this.f1936g, hVar.f1936g) && AbstractC3557B.K(this.f1937h, hVar.f1937h) && AbstractC3557B.K(this.f1938i, hVar.f1938i) && AbstractC3557B.K(this.f1939j, hVar.f1939j) && AbstractC3557B.K(this.f1940k, hVar.f1940k)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int i13;
        long j6 = this.f1931b;
        int v10 = E9.f.v(this.f1934e, AbstractC6708l.d(this.f1933d, E9.f.v(this.f1932c, ((this.f1930a.hashCode() * 31) + ((int) (j6 ^ (j6 >>> 32)))) * 31, 31), 31), 31);
        int i14 = 0;
        b bVar = this.f1935f;
        if (bVar == null) {
            i10 = 0;
        } else {
            i10 = bVar.f1873a.hashCode();
        }
        int i15 = (v10 + i10) * 31;
        e eVar = this.f1936g;
        if (eVar == null) {
            i11 = 0;
        } else {
            i11 = eVar.f1926a.hashCode();
        }
        int i16 = (i15 + i11) * 31;
        g gVar = this.f1937h;
        if (gVar == null) {
            i12 = 0;
        } else {
            i12 = gVar.f1929a.hashCode();
        }
        int i17 = (i16 + i12) * 31;
        a aVar = this.f1938i;
        if (aVar == null) {
            i13 = 0;
        } else {
            i13 = aVar.f1872a.hashCode();
        }
        int i18 = (i17 + i13) * 31;
        List list = this.f1939j;
        if (list != null) {
            i14 = list.hashCode();
        }
        return this.f1940k.f1927a.hashCode() + ((i18 + i14) * 31);
    }

    public final String toString() {
        return "TelemetryConfigurationEvent(dd=" + this.f1930a + ", date=" + this.f1931b + ", service=" + this.f1932c + ", source=" + AbstractC0044t0.H(this.f1933d) + ", version=" + this.f1934e + ", application=" + this.f1935f + ", session=" + this.f1936g + ", view=" + this.f1937h + ", action=" + this.f1938i + ", experimentalFeatures=" + this.f1939j + ", telemetry=" + this.f1940k + Separators.RPAREN;
    }
}
