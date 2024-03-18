package io.sentry;

import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import java.util.concurrent.Callable;
import livekit.org.webrtc.WebrtcBuildVersion;

/* loaded from: classes.dex */
public final class B0 implements AbstractC3656j0 {

    /* renamed from: A0  reason: collision with root package name */
    public String f33724A0;

    /* renamed from: B0  reason: collision with root package name */
    public String f33725B0;

    /* renamed from: C0  reason: collision with root package name */
    public String f33726C0;

    /* renamed from: D0  reason: collision with root package name */
    public String f33727D0;

    /* renamed from: E0  reason: collision with root package name */
    public final Map f33728E0;

    /* renamed from: G0  reason: collision with root package name */
    public Map f33730G0;

    /* renamed from: Y  reason: collision with root package name */
    public final File f33731Y;

    /* renamed from: Z  reason: collision with root package name */
    public final Callable f33732Z;

    /* renamed from: h0  reason: collision with root package name */
    public int f33733h0;

    /* renamed from: j0  reason: collision with root package name */
    public String f33735j0;

    /* renamed from: k0  reason: collision with root package name */
    public String f33736k0;

    /* renamed from: l0  reason: collision with root package name */
    public String f33737l0;

    /* renamed from: m0  reason: collision with root package name */
    public String f33738m0;

    /* renamed from: n0  reason: collision with root package name */
    public String f33739n0;

    /* renamed from: o0  reason: collision with root package name */
    public boolean f33740o0;

    /* renamed from: p0  reason: collision with root package name */
    public String f33741p0;

    /* renamed from: r0  reason: collision with root package name */
    public String f33743r0;

    /* renamed from: s0  reason: collision with root package name */
    public String f33744s0;

    /* renamed from: t0  reason: collision with root package name */
    public String f33745t0;

    /* renamed from: u0  reason: collision with root package name */
    public final List f33746u0;

    /* renamed from: v0  reason: collision with root package name */
    public String f33747v0;

    /* renamed from: w0  reason: collision with root package name */
    public String f33748w0;

    /* renamed from: x0  reason: collision with root package name */
    public String f33749x0;

    /* renamed from: y0  reason: collision with root package name */
    public String f33750y0;

    /* renamed from: z0  reason: collision with root package name */
    public String f33751z0;

    /* renamed from: q0  reason: collision with root package name */
    public List f33742q0 = new ArrayList();

    /* renamed from: F0  reason: collision with root package name */
    public String f33729F0 = null;

    /* renamed from: i0  reason: collision with root package name */
    public String f33734i0 = Locale.getDefault().toString();

    public B0(File file, ArrayList arrayList, String str, String str2, String str3, String str4, int i10, String str5, CallableC3688v callableC3688v, String str6, String str7, String str8, Boolean bool, String str9, String str10, String str11, String str12, String str13, Map map) {
        this.f33731Y = file;
        this.f33741p0 = str5;
        this.f33732Z = callableC3688v;
        this.f33733h0 = i10;
        String str14 = "";
        this.f33735j0 = str6 != null ? str6 : str14;
        this.f33736k0 = str7 != null ? str7 : str14;
        this.f33739n0 = str8 != null ? str8 : str14;
        this.f33740o0 = bool != null ? bool.booleanValue() : false;
        this.f33743r0 = str9 != null ? str9 : WebrtcBuildVersion.maint_version;
        this.f33737l0 = str14;
        this.f33738m0 = "android";
        this.f33744s0 = "android";
        this.f33745t0 = str10 != null ? str10 : str14;
        this.f33746u0 = arrayList;
        this.f33747v0 = str;
        this.f33748w0 = str4;
        this.f33749x0 = str14;
        this.f33750y0 = str11 != null ? str11 : str14;
        this.f33751z0 = str2;
        this.f33724A0 = str3;
        this.f33725B0 = UUID.randomUUID().toString();
        this.f33726C0 = str12 != null ? str12 : "production";
        this.f33727D0 = str13;
        if (!str13.equals("normal") && !this.f33727D0.equals("timeout") && !this.f33727D0.equals("backgrounded")) {
            this.f33727D0 = "normal";
        }
        this.f33728E0 = map;
    }

    @Override // io.sentry.AbstractC3656j0
    public final void serialize(AbstractC3693x0 abstractC3693x0, H h10) {
        C3636c1 c3636c1 = (C3636c1) abstractC3693x0;
        c3636c1.d();
        c3636c1.n("android_api_level");
        c3636c1.v(h10, Integer.valueOf(this.f33733h0));
        c3636c1.n("device_locale");
        c3636c1.v(h10, this.f33734i0);
        c3636c1.n("device_manufacturer");
        c3636c1.t(this.f33735j0);
        c3636c1.n("device_model");
        c3636c1.t(this.f33736k0);
        c3636c1.n("device_os_build_number");
        c3636c1.t(this.f33737l0);
        c3636c1.n("device_os_name");
        c3636c1.t(this.f33738m0);
        c3636c1.n("device_os_version");
        c3636c1.t(this.f33739n0);
        c3636c1.n("device_is_emulator");
        c3636c1.u(this.f33740o0);
        c3636c1.n("architecture");
        c3636c1.v(h10, this.f33741p0);
        c3636c1.n("device_cpu_frequencies");
        c3636c1.v(h10, this.f33742q0);
        c3636c1.n("device_physical_memory_bytes");
        c3636c1.t(this.f33743r0);
        c3636c1.n("platform");
        c3636c1.t(this.f33744s0);
        c3636c1.n("build_id");
        c3636c1.t(this.f33745t0);
        c3636c1.n("transaction_name");
        c3636c1.t(this.f33747v0);
        c3636c1.n("duration_ns");
        c3636c1.t(this.f33748w0);
        c3636c1.n("version_name");
        c3636c1.t(this.f33750y0);
        c3636c1.n("version_code");
        c3636c1.t(this.f33749x0);
        List list = this.f33746u0;
        if (!list.isEmpty()) {
            c3636c1.n("transactions");
            c3636c1.v(h10, list);
        }
        c3636c1.n("transaction_id");
        c3636c1.t(this.f33751z0);
        c3636c1.n("trace_id");
        c3636c1.t(this.f33724A0);
        c3636c1.n("profile_id");
        c3636c1.t(this.f33725B0);
        c3636c1.n("environment");
        c3636c1.t(this.f33726C0);
        c3636c1.n("truncation_reason");
        c3636c1.t(this.f33727D0);
        if (this.f33729F0 != null) {
            c3636c1.n("sampled_profile");
            c3636c1.t(this.f33729F0);
        }
        c3636c1.n("measurements");
        c3636c1.v(h10, this.f33728E0);
        Map map = this.f33730G0;
        if (map != null) {
            for (String str : map.keySet()) {
                AbstractC2469q0.r(this.f33730G0, str, c3636c1, str, h10);
            }
        }
        c3636c1.j();
    }
}
