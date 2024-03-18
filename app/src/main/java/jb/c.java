package Jb;

import Cd.V;
import Cd.W;
import E.AbstractC0429m;
import E.AbstractC0440y;
import E0.N;
import G0.AbstractC0584m;
import G0.C0581j;
import G0.C0582k;
import G0.C0583l;
import G0.X;
import H0.W0;
import Kd.C0825a;
import Kd.I;
import Kd.K;
import Ng.AbstractC1073l0;
import Ng.C1071k0;
import Ng.H;
import Rb.C1265k;
import Rg.C;
import Sg.C1394f;
import Uc.EnumC1427l;
import Ve.C1503i0;
import Ve.EnumC1486a;
import Ve.F;
import Ve.k0;
import Ve.r0;
import W.AbstractC1607r1;
import W.j4;
import W.p4;
import W.q4;
import Z.AbstractC1707e;
import Z.AbstractC1725n;
import Z.AbstractC1732q0;
import Z.L0;
import Z8.Y0;
import android.app.Activity;
import android.content.Context;
import android.gov.nist.javax.sip.header.SIPHeaderNames;
import android.media.AudioDeviceInfo;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import cf.AbstractC2408g;
import com.openai.chatgpt.R;
import com.revenuecat.purchases.common.diagnostics.DiagnosticsEntry;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import dh.C2700f0;
import ec.C2873y;
import ed.C2875a;
import ed.C2877c;
import g.AbstractActivityC3122o;
import h0.C3288a;
import hc.L;
import ic.C3551v;
import ic.P;
import id.AbstractC3557B;
import ja.C3931c;
import java.lang.reflect.Proxy;
import java.util.List;
import jc.C3942j;
import jf.C3959i;
import k6.AbstractC4194d;
import kf.AbstractC4268D;
import l0.AbstractC4326r;
import l0.C4310b;
import l0.C4323o;
import l8.AbstractC4344b;
import livekit.org.webrtc.MediaStreamTrack;
import nf.AbstractC4829i;
import nf.AbstractC4830j;
import u0.AbstractC5824b;
import v0.AbstractC5944H;
import v0.C5952e;
import v0.C5953f;
import wd.C6189g;
import xe.AbstractC6435x;
import xe.C6405J;
import y.AbstractC6463a;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public final class c extends kotlin.jvm.internal.o implements wf.n {

    /* renamed from: Y  reason: collision with root package name */
    public final /* synthetic */ int f8969Y;

    /* renamed from: Z  reason: collision with root package name */
    public final /* synthetic */ Object f8970Z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c(int i10, Object obj) {
        super(2);
        this.f8969Y = i10;
        this.f8970Z = obj;
    }

    public final Object a(Class cls, Object obj) {
        int i10 = this.f8969Y;
        Object obj2 = this.f8970Z;
        switch (i10) {
            case 22:
                AbstractC3557B.d0("<anonymous parameter 0>", cls);
                AbstractC3557B.d0("<anonymous parameter 1>", obj);
                return ((C2700f0) obj2).f28449h0;
            default:
                AbstractC3557B.d0("activityManagerInterface", cls);
                AbstractC3557B.d0("activityManagerInstance", obj);
                ((hh.t) obj2).f32386f = new C2700f0(this, 4, obj);
                Object newProxyInstance = Proxy.newProxyInstance(cls.getClassLoader(), new Class[]{cls}, new hh.s(this, obj));
                AbstractC3557B.Y("Proxy.newProxyInstance(\n\u2026ion\n          }\n        }", newProxyInstance);
                return newProxyInstance;
        }
    }

    public final void c(AbstractC1725n abstractC1725n, int i10) {
        AbstractC1725n abstractC1725n2;
        int i11;
        AbstractC1725n abstractC1725n3;
        int i12;
        int i13;
        int i14;
        int i15;
        C5953f c5953f;
        C4323o c4323o = C4323o.f37719b;
        int i16 = this.f8969Y;
        Boolean bool = null;
        Object obj = this.f8970Z;
        switch (i16) {
            case 0:
                AbstractC4326r a5 = io.sentry.compose.b.a("OnboardingToolbar");
                if ((i10 & 11) == 2) {
                    abstractC1725n2 = abstractC1725n;
                    Z.r rVar = (Z.r) abstractC1725n2;
                    if (rVar.B()) {
                        rVar.P();
                        return;
                    }
                } else {
                    abstractC1725n2 = abstractC1725n;
                }
                AbstractC1607r1.a((AbstractC5824b) obj, H.v(R.string.design_up_button, abstractC1725n2), a5, 0L, abstractC1725n, 8, 12);
                return;
            case 1:
                AbstractC4326r a10 = io.sentry.compose.b.a("ReportTextField");
                if ((i10 & 11) == 2) {
                    Z.r rVar2 = (Z.r) abstractC1725n;
                    if (rVar2.B()) {
                        rVar2.P();
                        return;
                    }
                }
                String str = ((C1265k) obj).f15360c;
                if (str == null) {
                    str = "";
                }
                j4.b(str, a10, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 2:
                AbstractC4326r a11 = io.sentry.compose.b.a("DataControlsHistorySwitch");
                if ((i10 & 11) == 2) {
                    Z.r rVar3 = (Z.r) abstractC1725n;
                    if (rVar3.B()) {
                        rVar3.P();
                        return;
                    }
                }
                C6189g c6189g = ((C2873y) obj).f29271f;
                if (c6189g != null && c6189g.b()) {
                    i11 = R.string.settings_data_workspace_history_switch;
                } else {
                    i11 = R.string.settings_data_history_switch;
                }
                j4.b(H.v(i11, abstractC1725n), a11, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 3:
                L0.u uVar = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    Z.r rVar4 = (Z.r) abstractC1725n;
                    if (rVar4.B()) {
                        rVar4.P();
                        return;
                    }
                }
                EnumC1427l enumC1427l = (EnumC1427l) obj;
                Z.r rVar5 = (Z.r) abstractC1725n;
                rVar5.W(-483455358);
                N a12 = AbstractC0440y.a(AbstractC0429m.f3909c, C4310b.f37705r0, rVar5);
                rVar5.W(-1323940314);
                int i17 = rVar5.P;
                AbstractC1732q0 p10 = rVar5.p();
                AbstractC0584m.f5811i.getClass();
                C0582k c0582k = C0583l.f5804b;
                C3288a i18 = androidx.compose.ui.layout.a.i(c4323o);
                if (rVar5.f22696a instanceof AbstractC1707e) {
                    rVar5.Z();
                    if (rVar5.f22695O) {
                        rVar5.o(c0582k);
                    } else {
                        rVar5.k0();
                    }
                    U3.f.n0(rVar5, a12, C0583l.f5808f);
                    U3.f.n0(rVar5, p10, C0583l.f5807e);
                    C0581j c0581j = C0583l.f5809g;
                    if (rVar5.f22695O || !AbstractC3557B.K(rVar5.K(), Integer.valueOf(i17))) {
                        AbstractC6463a.q(i17, rVar5, i17, c0581j);
                    }
                    AbstractC6463a.r(0, i18, new L0(rVar5), rVar5, 2058660585);
                    AbstractC4326r a13 = io.sentry.compose.b.a("CustomInstructionsEditFooter");
                    int ordinal = enumC1427l.ordinal();
                    if (ordinal != 0) {
                        if (ordinal != 1) {
                            rVar5.W(1698937321);
                            rVar5.t(false);
                        } else {
                            rVar5.W(1698936776);
                            j4.c(K8.d.Q0(AbstractC4344b.G0(H.v(R.string.custom_instructions_model_tip1, rVar5), H.v(R.string.custom_instructions_model_tip2, rVar5), H.v(R.string.custom_instructions_model_tip3, rVar5), H.v(R.string.custom_instructions_model_tip4, rVar5))), a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, rVar5, 0, 0, 262142);
                            rVar5.t(false);
                        }
                    } else {
                        rVar5.W(1698936053);
                        j4.c(K8.d.Q0(AbstractC4344b.G0(H.v(R.string.custom_instructions_user_tip1, rVar5), H.v(R.string.custom_instructions_user_tip2, rVar5), H.v(R.string.custom_instructions_user_tip3, rVar5), H.v(R.string.custom_instructions_user_tip4, rVar5), H.v(R.string.custom_instructions_user_tip5, rVar5))), a13, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, null, rVar5, 0, 0, 262142);
                        rVar5.t(false);
                    }
                    AbstractC6463a.v(rVar5, false, true, false, false);
                    return;
                }
                R4.b.r1();
                throw null;
            case 4:
                AbstractC4326r a14 = io.sentry.compose.b.a("CustomInstructionsScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar6 = (Z.r) abstractC1725n;
                    if (rVar6.B()) {
                        rVar6.P();
                        return;
                    }
                }
                if (((L) obj).f32156a) {
                    j4.b(H.v(R.string.custom_instructions_title, abstractC1725n), a14, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                    return;
                }
                return;
            case 5:
                L0.u uVar2 = io.sentry.compose.b.f34309a;
                if ((i10 & 11) == 2) {
                    abstractC1725n3 = abstractC1725n;
                    Z.r rVar7 = (Z.r) abstractC1725n3;
                    if (rVar7.B()) {
                        rVar7.P();
                        return;
                    }
                } else {
                    abstractC1725n3 = abstractC1725n;
                }
                Ba.c cVar = ((C3551v) obj).f33067b;
                if (cVar != null) {
                    bool = Boolean.valueOf(cVar.f2008a);
                }
                if (bool != null) {
                    if (bool.booleanValue()) {
                        i12 = R.string.custom_instructions_on;
                    } else {
                        i12 = R.string.custom_instructions_off;
                    }
                    j4.b(H.v(i12, abstractC1725n3), androidx.compose.foundation.layout.a.t(c4323o, p9.r.f42840d, 0.0f, 2), 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((p4) ((Z.r) abstractC1725n3).m(q4.f20361a)).f20310k, abstractC1725n, 0, 0, 65532);
                    return;
                }
                return;
            case 6:
                AbstractC4326r a15 = io.sentry.compose.b.a("<anonymous>");
                if ((i10 & 11) == 2) {
                    Z.r rVar8 = (Z.r) abstractC1725n;
                    if (rVar8.B()) {
                        rVar8.P();
                        return;
                    }
                }
                j4.b(((C3942j) obj).f36112b, a15, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 7:
                AbstractC4326r a16 = io.sentry.compose.b.a("ViewMemoryResetButton");
                if ((i10 & 11) == 2) {
                    Z.r rVar9 = (Z.r) abstractC1725n;
                    if (rVar9.B()) {
                        rVar9.P();
                        return;
                    }
                }
                if (((P) obj).f32968h != null) {
                    i13 = R.string.settings_memory_reset_gizmo;
                } else {
                    i13 = R.string.settings_memory_reset_default;
                }
                j4.b(H.v(i13, abstractC1725n), a16, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 8:
                AbstractC4326r a17 = io.sentry.compose.b.a("SettingsLanguageItem");
                if ((i10 & 11) == 2) {
                    Z.r rVar10 = (Z.r) abstractC1725n;
                    if (rVar10.B()) {
                        rVar10.P();
                        return;
                    }
                }
                j4.b(H.v(((Ec.o) obj).f4632Z, abstractC1725n), a17, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 9:
                AbstractC4326r a18 = io.sentry.compose.b.a("SettingsNightModeItem");
                if ((i10 & 11) == 2) {
                    Z.r rVar11 = (Z.r) abstractC1725n;
                    if (rVar11.B()) {
                        rVar11.P();
                        return;
                    }
                }
                int ordinal2 = ((zd.d) obj).ordinal();
                if (ordinal2 != 0) {
                    if (ordinal2 != 1) {
                        if (ordinal2 == 2) {
                            i14 = R.string.settings_color_dark;
                        } else {
                            throw new RuntimeException();
                        }
                    } else {
                        i14 = R.string.settings_color_light;
                    }
                } else {
                    i14 = R.string.settings_color_system;
                }
                j4.b(H.v(i14, abstractC1725n), a18, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 10:
                AbstractC4326r a19 = io.sentry.compose.b.a("ShareSummaryMenuDetails");
                if ((i10 & 11) == 2) {
                    Z.r rVar12 = (Z.r) abstractC1725n;
                    if (rVar12.B()) {
                        rVar12.P();
                        return;
                    }
                }
                if (((C3931c) obj) == null) {
                    i15 = R.string.share_screen_share_toggle_your_name;
                } else {
                    i15 = R.string.share_screen_share_toggle_anonymously;
                }
                j4.b(H.v(i15, abstractC1725n), a19, 0L, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 0, 0, 131070);
                return;
            case 11:
            default:
                AbstractC4326r a20 = io.sentry.compose.b.a("VoiceTrainingScreen");
                if ((i10 & 11) == 2) {
                    Z.r rVar13 = (Z.r) abstractC1725n;
                    if (rVar13.B()) {
                        rVar13.P();
                        return;
                    }
                }
                String v10 = H.v(R.string.voice_training_item_3_subtitle, abstractC1725n);
                long j6 = r0.r.f44257e;
                j4.b(v10, a20, j6, 0L, null, null, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 384, 0, 131066);
                j4.b(H.v(R.string.voice_training_learn_more, abstractC1725n), AbstractC4194d.a((X) a20, androidx.compose.foundation.a.h(c4323o, new Wb.b((W0) obj, 1))), j6, 0L, null, null, null, 0L, Y0.j.f22032c, null, 0L, 0, false, 0, 0, null, null, abstractC1725n, 100663680, 0, 130808);
                return;
            case 12:
                AbstractC4326r a21 = io.sentry.compose.b.a("VoiceModeScreenContent");
                if ((i10 & 11) == 2) {
                    Z.r rVar14 = (Z.r) abstractC1725n;
                    if (rVar14.B()) {
                        rVar14.P();
                        return;
                    }
                }
                AbstractC4326r a22 = AbstractC4194d.a((X) a21, androidx.compose.foundation.layout.e.j(c4323o, p9.q.f42832c));
                U3.f fVar = ((Cd.X) obj).f3027b;
                if (AbstractC3557B.K(fVar, W.f3025g) || AbstractC3557B.K(fVar, V.f3024g)) {
                    c5953f = AbstractC4344b.f37865i;
                    if (c5953f == null) {
                        C5952e c5952e = new C5952e("Rounded.Stop", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i19 = AbstractC5944H.f46870a;
                        r0.N n10 = new r0.N(r0.r.f44254b);
                        Wh.p pVar = new Wh.p(0);
                        pVar.p(8.0f, 6.0f);
                        pVar.m(8.0f);
                        pVar.h(1.1f, 0.0f, 2.0f, 0.9f, 2.0f, 2.0f);
                        pVar.x(8.0f);
                        pVar.h(0.0f, 1.1f, -0.9f, 2.0f, -2.0f, 2.0f);
                        pVar.l(8.0f);
                        pVar.h(-1.1f, 0.0f, -2.0f, -0.9f, -2.0f, -2.0f);
                        pVar.w(8.0f);
                        pVar.h(0.0f, -1.1f, 0.9f, -2.0f, 2.0f, -2.0f);
                        pVar.f();
                        C5952e.b(c5952e, pVar.f21239a, 0, n10, null, 1.0f, 0, 2, 1.0f);
                        c5953f = c5952e.c();
                        AbstractC4344b.f37865i = c5953f;
                    }
                } else {
                    c5953f = com.google.android.gms.internal.play_billing.N.f26871d;
                    if (c5953f == null) {
                        C5952e c5952e2 = new C5952e("Rounded.Pause", 24.0f, 24.0f, 24.0f, 24.0f, 0L, 0, false, 96);
                        int i20 = AbstractC5944H.f46870a;
                        r0.N n11 = new r0.N(r0.r.f44254b);
                        Wh.p p11 = R.a.p(0, 8.0f, 19.0f);
                        p11.h(1.1f, 0.0f, 2.0f, -0.9f, 2.0f, -2.0f);
                        p11.n(10.0f, 7.0f);
                        p11.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        p11.u(-2.0f, 0.9f, -2.0f, 2.0f);
                        p11.x(10.0f);
                        p11.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        p11.f();
                        p11.p(14.0f, 7.0f);
                        p11.x(10.0f);
                        p11.h(0.0f, 1.1f, 0.9f, 2.0f, 2.0f, 2.0f);
                        p11.u(2.0f, -0.9f, 2.0f, -2.0f);
                        p11.n(18.0f, 7.0f);
                        p11.h(0.0f, -1.1f, -0.9f, -2.0f, -2.0f, -2.0f);
                        p11.u(-2.0f, 0.9f, -2.0f, 2.0f);
                        p11.f();
                        C5952e.b(c5952e2, p11.f21239a, 0, n11, null, 1.0f, 0, 2, 1.0f);
                        c5953f = c5952e2.c();
                        com.google.android.gms.internal.play_billing.N.f26871d = c5953f;
                    }
                }
                AbstractC1607r1.b(c5953f, H.v(R.string.voice_halt_description, abstractC1725n), a22, 0L, abstractC1725n, 0, 8);
                return;
        }
    }

    public final void e(String str, List list) {
        int i10 = this.f8969Y;
        Object obj = this.f8970Z;
        switch (i10) {
            case 16:
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str);
                AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, list);
                ((C6405J) obj).f49847i.e(str, list);
                return;
            default:
                AbstractC3557B.c0("name", str);
                AbstractC3557B.c0(DiagnosticsEntry.Histogram.VALUES_KEY, list);
                ((Fe.x) obj).e(str, list);
                return;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:98:0x0216, code lost:
        r11 = r4.getCommunicationDevice();
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0066  */
    @Override // wf.n
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        String str;
        AudioDeviceInfo communicationDevice;
        int i10;
        jf.y yVar = jf.y.f36177a;
        int i11 = this.f8969Y;
        String str2 = null;
        Object obj3 = this.f8970Z;
        switch (i11) {
            case 0:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 1:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 2:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 3:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 4:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 5:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 6:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 7:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 8:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 9:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 10:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 11:
                Activity activity = (Activity) obj;
                Bundle bundle = (Bundle) obj2;
                AbstractC3557B.c0("activity", activity);
                if (activity instanceof AbstractActivityC3122o) {
                    ((AbstractActivityC3122o) activity).f30968i0.a(new C2875a((C2877c) obj3, activity));
                }
                return yVar;
            case 12:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 13:
                c((AbstractC1725n) obj, ((Number) obj2).intValue());
                return yVar;
            case 14:
                List list = (List) obj;
                Wd.h hVar = (Wd.h) obj2;
                AbstractC3557B.c0("audioDevices", list);
                I i12 = (I) obj3;
                Object systemService = i12.f9680c.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                AbstractC3557B.a0("null cannot be cast to non-null type android.media.AudioManager", systemService);
                AudioManager audioManager = (AudioManager) systemService;
                if (Build.VERSION.SDK_INT >= 31 && communicationDevice != null) {
                    num = Integer.valueOf(communicationDevice.getType());
                } else {
                    num = null;
                }
                K k10 = (K) i12.f9686i.getValue();
                if (k10 != null) {
                    Y0 y02 = Y0.f23302o;
                    C3959i[] c3959iArr = new C3959i[5];
                    if (hVar != null) {
                        str = hVar.a();
                    } else {
                        str = null;
                    }
                    if (str == null) {
                        str = "";
                    }
                    c3959iArr[0] = new C3959i("selected_device", str);
                    c3959iArr[1] = new C3959i("available_devices", kf.t.m2(list, null, null, null, C0825a.f9725h0, 31));
                    c3959iArr[2] = new C3959i("speakerphone_on", Boolean.valueOf(audioManager.isSpeakerphoneOn()));
                    c3959iArr[3] = new C3959i("bluetooth_sco_on", Boolean.valueOf(audioManager.isBluetoothScoOn()));
                    if (num != null) {
                        str2 = num.toString();
                    }
                    if (str2 == null) {
                        str2 = "";
                    }
                    c3959iArr[4] = new C3959i("communication_device", str2);
                    k10.a(y02, AbstractC4268D.a1(c3959iArr));
                }
                return yVar;
            case 15:
                String str3 = (String) obj;
                String str4 = (String) obj2;
                AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, str3);
                AbstractC3557B.c0("value", str4);
                List list2 = AbstractC6435x.f49956a;
                if (!AbstractC3557B.K(str3, SIPHeaderNames.CONTENT_LENGTH)) {
                    ((Wh.y) obj3).a(str3, str4);
                }
                return yVar;
            case 16:
                e((String) obj, (List) obj2);
                return yVar;
            case 17:
                e((String) obj, (List) obj2);
                return yVar;
            case 18:
                EnumC1486a enumC1486a = (EnumC1486a) obj;
                EnumC1486a enumC1486a2 = (EnumC1486a) obj2;
                AbstractC3557B.c0("newVal", enumC1486a);
                AbstractC3557B.c0("oldVal", enumC1486a2);
                if (enumC1486a != enumC1486a2) {
                    int ordinal = enumC1486a.ordinal();
                    if (ordinal != 1) {
                        if (ordinal == 2) {
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.a(new Object[0]);
                            }
                            if (enumC1486a2 == EnumC1486a.f18719Z) {
                                ((C1503i0) obj3).k();
                            }
                        }
                    } else {
                        EnumC1486a enumC1486a3 = EnumC1486a.f18720h0;
                        k0 k0Var = k0.f18807Z;
                        if (enumC1486a2 == enumC1486a3) {
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.a(new Object[0]);
                            }
                            F f6 = ((C1503i0) obj3).f18778d;
                            if (f6 != null) {
                                r0 r0Var = (r0) f6;
                                r0Var.o(k0Var);
                                Te.w wVar = new Te.w(r0Var);
                                C1394f c1394f = r0Var.f18872k;
                                if (c1394f != null) {
                                    r0Var.f18873l.a(wVar, c1394f);
                                } else {
                                    AbstractC3557B.C2("coroutineScope");
                                    throw null;
                                }
                            }
                        } else if (enumC1486a2 == EnumC1486a.f18721i0) {
                            AbstractC2408g.Companion.getClass();
                            if (AbstractC6708l.b(3, 7) >= 0 && Mi.a.d() > 0) {
                                Mi.a.a(new Object[0]);
                            }
                            F f10 = ((C1503i0) obj3).f18778d;
                            if (f10 != null) {
                                r0 r0Var2 = (r0) f10;
                                r0Var2.o(k0Var);
                                Te.w wVar2 = new Te.w(r0Var2);
                                C1394f c1394f2 = r0Var2.f18872k;
                                if (c1394f2 != null) {
                                    r0Var2.f18873l.a(wVar2, c1394f2);
                                } else {
                                    AbstractC3557B.C2("coroutineScope");
                                    throw null;
                                }
                            }
                        } else if (enumC1486a2 == EnumC1486a.f18722j0) {
                            F f11 = ((C1503i0) obj3).f18778d;
                        }
                    }
                }
                return yVar;
            case 19:
                k0 k0Var2 = (k0) obj;
                k0 k0Var3 = (k0) obj2;
                AbstractC3557B.c0("new", k0Var2);
                AbstractC3557B.c0("old", k0Var3);
                if (k0Var2 != k0Var3) {
                    int ordinal2 = k0Var2.ordinal();
                    if (ordinal2 != 0) {
                        if (ordinal2 == 2) {
                            r0 r0Var3 = (r0) obj3;
                            final Qe.g gVar = (Qe.g) r0Var3.f18868g;
                            Handler handler = gVar.f14697k;
                            handler.removeCallbacksAndMessages(null);
                            handler.postAtFrontOfQueue(new Runnable() { // from class: Qe.b
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r1v1, types: [Wd.k, Wd.c] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i13 = r2;
                                    g gVar2 = gVar;
                                    switch (i13) {
                                        case 0:
                                            AbstractC3557B.c0("this$0", gVar2);
                                            g.Companion.getClass();
                                            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = (AudioManager.OnAudioFocusChangeListener) g.f14684l.getValue();
                                            List list3 = gVar2.f14689c;
                                            if (list3 == null) {
                                                list3 = (List) g.f14686n.getValue();
                                            }
                                            List list4 = list3;
                                            Context context = gVar2.f14687a;
                                            AbstractC3557B.c0("context", context);
                                            AbstractC3557B.c0("audioFocusChangeListener", onAudioFocusChangeListener);
                                            AbstractC3557B.c0("preferredDeviceList", list4);
                                            G6.a aVar = new G6.a(false);
                                            Object systemService2 = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                                            if (systemService2 != null) {
                                                AudioManager audioManager2 = (AudioManager) systemService2;
                                                ?? cVar = new Wd.c(context, onAudioFocusChangeListener, new Yd.a(audioManager2, new Handler(Looper.getMainLooper())), aVar, list4, new Wd.i(context, aVar, audioManager2, onAudioFocusChangeListener));
                                                cVar.f20931g = gVar2.f14690d;
                                                int i14 = gVar2.f14691e;
                                                Wd.i iVar = cVar.f20934j;
                                                iVar.f20943e = i14;
                                                iVar.f20944f = gVar2.f14692f;
                                                iVar.f20945g = gVar2.f14693g;
                                                iVar.f20946h = gVar2.f14694h;
                                                iVar.f20947i = gVar2.f14695i;
                                                cVar.f20932h = false;
                                                gVar2.f14696j = cVar;
                                                wf.n nVar = gVar2.f14688b;
                                                if (nVar == null) {
                                                    nVar = (c) g.f14685m.getValue();
                                                }
                                                AbstractC3557B.c0("listener", nVar);
                                                cVar.f20925a = nVar;
                                                if (AbstractC6708l.f(cVar.f20926b) != 2) {
                                                    cVar.f20933i.e("AudioSwitch", "Redundant start() invocation while already in the started or activated state");
                                                } else {
                                                    cVar.f20927c.a(cVar);
                                                    cVar.f20926b = 1;
                                                }
                                                cVar.a();
                                                return;
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
                                        default:
                                            AbstractC3557B.c0("this$0", gVar2);
                                            Wd.k kVar = gVar2.f14696j;
                                            if (kVar != null) {
                                                int f12 = AbstractC6708l.f(kVar.f20926b);
                                                Yd.c cVar2 = kVar.f20927c;
                                                if (f12 != 0) {
                                                    if (f12 != 1) {
                                                        if (f12 == 2) {
                                                            kVar.f20933i.e("AudioSwitch", "Redundant stop() invocation while already in the stopped state");
                                                        }
                                                    } else {
                                                        if (AbstractC6708l.f(kVar.f20926b) == 1) {
                                                            kVar.f();
                                                            Wd.i iVar2 = kVar.f20934j;
                                                            int i15 = iVar2.f20939a;
                                                            AudioManager audioManager3 = iVar2.f20950l;
                                                            audioManager3.setMode(i15);
                                                            audioManager3.setMicrophoneMute(iVar2.f20940b);
                                                            iVar2.b(iVar2.f20941c);
                                                            iVar2.f20951m.getClass();
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                AudioFocusRequest audioFocusRequest = iVar2.f20942d;
                                                                if (audioFocusRequest != null) {
                                                                    audioManager3.abandonAudioFocusRequest(audioFocusRequest);
                                                                }
                                                                iVar2.f20942d = null;
                                                            } else {
                                                                audioManager3.abandonAudioFocus(iVar2.f20953o);
                                                            }
                                                            kVar.f20926b = 1;
                                                        }
                                                        cVar2.stop();
                                                        kVar.f20925a = null;
                                                        kVar.f20926b = 3;
                                                    }
                                                } else {
                                                    cVar2.stop();
                                                    kVar.f20925a = null;
                                                    kVar.f20926b = 3;
                                                }
                                            }
                                            gVar2.f14696j = null;
                                            return;
                                    }
                                }
                            });
                            r0Var3.f18871j.stop();
                        }
                    } else {
                        r0 r0Var4 = (r0) obj3;
                        final Qe.g gVar2 = (Qe.g) r0Var4.f18868g;
                        if (gVar2.f14696j == null) {
                            Handler handler2 = gVar2.f14697k;
                            handler2.removeCallbacksAndMessages(null);
                            handler2.postAtFrontOfQueue(new Runnable() { // from class: Qe.b
                                /* JADX WARN: Multi-variable type inference failed */
                                /* JADX WARN: Type inference failed for: r1v1, types: [Wd.k, Wd.c] */
                                @Override // java.lang.Runnable
                                public final void run() {
                                    int i13 = r2;
                                    g gVar22 = gVar2;
                                    switch (i13) {
                                        case 0:
                                            AbstractC3557B.c0("this$0", gVar22);
                                            g.Companion.getClass();
                                            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener = (AudioManager.OnAudioFocusChangeListener) g.f14684l.getValue();
                                            List list3 = gVar22.f14689c;
                                            if (list3 == null) {
                                                list3 = (List) g.f14686n.getValue();
                                            }
                                            List list4 = list3;
                                            Context context = gVar22.f14687a;
                                            AbstractC3557B.c0("context", context);
                                            AbstractC3557B.c0("audioFocusChangeListener", onAudioFocusChangeListener);
                                            AbstractC3557B.c0("preferredDeviceList", list4);
                                            G6.a aVar = new G6.a(false);
                                            Object systemService2 = context.getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
                                            if (systemService2 != null) {
                                                AudioManager audioManager2 = (AudioManager) systemService2;
                                                ?? cVar = new Wd.c(context, onAudioFocusChangeListener, new Yd.a(audioManager2, new Handler(Looper.getMainLooper())), aVar, list4, new Wd.i(context, aVar, audioManager2, onAudioFocusChangeListener));
                                                cVar.f20931g = gVar22.f14690d;
                                                int i14 = gVar22.f14691e;
                                                Wd.i iVar = cVar.f20934j;
                                                iVar.f20943e = i14;
                                                iVar.f20944f = gVar22.f14692f;
                                                iVar.f20945g = gVar22.f14693g;
                                                iVar.f20946h = gVar22.f14694h;
                                                iVar.f20947i = gVar22.f14695i;
                                                cVar.f20932h = false;
                                                gVar22.f14696j = cVar;
                                                wf.n nVar = gVar22.f14688b;
                                                if (nVar == null) {
                                                    nVar = (c) g.f14685m.getValue();
                                                }
                                                AbstractC3557B.c0("listener", nVar);
                                                cVar.f20925a = nVar;
                                                if (AbstractC6708l.f(cVar.f20926b) != 2) {
                                                    cVar.f20933i.e("AudioSwitch", "Redundant start() invocation while already in the started or activated state");
                                                } else {
                                                    cVar.f20927c.a(cVar);
                                                    cVar.f20926b = 1;
                                                }
                                                cVar.a();
                                                return;
                                            }
                                            throw new NullPointerException("null cannot be cast to non-null type android.media.AudioManager");
                                        default:
                                            AbstractC3557B.c0("this$0", gVar22);
                                            Wd.k kVar = gVar22.f14696j;
                                            if (kVar != null) {
                                                int f12 = AbstractC6708l.f(kVar.f20926b);
                                                Yd.c cVar2 = kVar.f20927c;
                                                if (f12 != 0) {
                                                    if (f12 != 1) {
                                                        if (f12 == 2) {
                                                            kVar.f20933i.e("AudioSwitch", "Redundant stop() invocation while already in the stopped state");
                                                        }
                                                    } else {
                                                        if (AbstractC6708l.f(kVar.f20926b) == 1) {
                                                            kVar.f();
                                                            Wd.i iVar2 = kVar.f20934j;
                                                            int i15 = iVar2.f20939a;
                                                            AudioManager audioManager3 = iVar2.f20950l;
                                                            audioManager3.setMode(i15);
                                                            audioManager3.setMicrophoneMute(iVar2.f20940b);
                                                            iVar2.b(iVar2.f20941c);
                                                            iVar2.f20951m.getClass();
                                                            if (Build.VERSION.SDK_INT >= 26) {
                                                                AudioFocusRequest audioFocusRequest = iVar2.f20942d;
                                                                if (audioFocusRequest != null) {
                                                                    audioManager3.abandonAudioFocusRequest(audioFocusRequest);
                                                                }
                                                                iVar2.f20942d = null;
                                                            } else {
                                                                audioManager3.abandonAudioFocus(iVar2.f20953o);
                                                            }
                                                            kVar.f20926b = 1;
                                                        }
                                                        cVar2.stop();
                                                        kVar.f20925a = null;
                                                        kVar.f20926b = 3;
                                                    }
                                                } else {
                                                    cVar2.stop();
                                                    kVar.f20925a = null;
                                                    kVar.f20926b = 3;
                                                }
                                            }
                                            gVar22.f14696j = null;
                                            return;
                                    }
                                }
                            });
                        }
                        r0Var4.f18871j.start();
                    }
                }
                return yVar;
            case 20:
                Xe.x xVar = (Xe.x) obj;
                Xe.x xVar2 = (Xe.x) obj2;
                AbstractC3557B.c0("newValue", xVar);
                AbstractC3557B.c0("oldValue", xVar2);
                if (xVar != xVar2) {
                    Xe.z zVar = (Xe.z) obj3;
                    zVar.f21946a.f17184a.g(new Te.y(zVar, xVar));
                }
                return yVar;
            case 21:
                int intValue = ((Number) obj).intValue();
                AbstractC4829i abstractC4829i = (AbstractC4829i) obj2;
                AbstractC4830j key = abstractC4829i.getKey();
                AbstractC4829i abstractC4829i2 = ((C) obj3).f15512Z.get(key);
                if (key != C1071k0.f12951Y) {
                    if (abstractC4829i != abstractC4829i2) {
                        i10 = Integer.MIN_VALUE;
                    } else {
                        i10 = intValue + 1;
                    }
                    return Integer.valueOf(i10);
                }
                AbstractC1073l0 abstractC1073l0 = (AbstractC1073l0) abstractC4829i2;
                for (AbstractC1073l0 abstractC1073l02 = (AbstractC1073l0) abstractC4829i; abstractC1073l02 != null; abstractC1073l02 = abstractC1073l02.getParent()) {
                    if (abstractC1073l02 == abstractC1073l0 || !(abstractC1073l02 instanceof Sg.y)) {
                        str2 = abstractC1073l02;
                        if (str2 != abstractC1073l0) {
                            if (abstractC1073l0 != null) {
                                intValue++;
                            }
                            return Integer.valueOf(intValue);
                        }
                        throw new IllegalStateException(("Flow invariant is violated:\n\t\tEmission from another coroutine is detected.\n\t\tChild of " + ((Object) str2) + ", expected child of " + abstractC1073l0 + ".\n\t\tFlowCollector is not thread-safe and concurrent emissions are prohibited.\n\t\tTo mitigate this restriction please use 'channelFlow' builder instead of 'flow'").toString());
                    }
                }
                if (str2 != abstractC1073l0) {
                }
                break;
            case 22:
                return a((Class) obj, obj2);
            default:
                return a((Class) obj, obj2);
        }
    }
}
