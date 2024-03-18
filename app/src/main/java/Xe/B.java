package Xe;

import android.gov.nist.javax.sip.header.ParameterNames;
import cf.C2409h;
import id.AbstractC3557B;
import java.lang.ref.WeakReference;
import jh.EnumC4051n2;
import jh.EnumC4056o2;
import livekit.LivekitModels$TrackInfo;

/* loaded from: classes.dex */
public abstract class B {

    /* renamed from: i  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f21841i;

    /* renamed from: a  reason: collision with root package name */
    public final C2409h f21842a;

    /* renamed from: b  reason: collision with root package name */
    public String f21843b;

    /* renamed from: c  reason: collision with root package name */
    public String f21844c;

    /* renamed from: d  reason: collision with root package name */
    public int f21845d;

    /* renamed from: e  reason: collision with root package name */
    public final C2409h f21846e = R4.b.C0(Boolean.FALSE, null);

    /* renamed from: f  reason: collision with root package name */
    public int f21847f = 4;

    /* renamed from: g  reason: collision with root package name */
    public LivekitModels$TrackInfo f21848g;

    /* renamed from: h  reason: collision with root package name */
    public final WeakReference f21849h;

    static {
        kotlin.jvm.internal.q qVar = new kotlin.jvm.internal.q(B.class, "track", "getTrack()Lio/livekit/android/room/track/Track;", 0);
        kotlin.jvm.internal.D d10 = kotlin.jvm.internal.C.f37623a;
        f21841i = new Df.v[]{d10.e(qVar), E9.f.w(B.class, "muted", "getMuted()Z", 0, d10)};
    }

    public B(LivekitModels$TrackInfo livekitModels$TrackInfo, z zVar, We.w wVar) {
        AbstractC3557B.c0(ParameterNames.INFO, livekitModels$TrackInfo);
        AbstractC3557B.c0("participant", wVar);
        this.f21842a = R4.b.C0(zVar, null);
        String sid = livekitModels$TrackInfo.getSid();
        AbstractC3557B.b0("info.sid", sid);
        this.f21844c = sid;
        String name = livekitModels$TrackInfo.getName();
        AbstractC3557B.b0("info.name", name);
        this.f21843b = name;
        EnumC4056o2 type = livekitModels$TrackInfo.getType();
        AbstractC3557B.b0("info.type", type);
        v.f21937a.getClass();
        int ordinal = type.ordinal();
        int i10 = 1;
        if (ordinal != 0) {
            if (ordinal != 1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
        }
        this.f21845d = i10;
        this.f21849h = new WeakReference(wVar);
        c(livekitModels$TrackInfo);
    }

    public z a() {
        return (z) this.f21842a.d(f21841i[0]);
    }

    public abstract void b(boolean z10);

    public final void c(LivekitModels$TrackInfo livekitModels$TrackInfo) {
        int i10;
        AbstractC3557B.c0(ParameterNames.INFO, livekitModels$TrackInfo);
        String sid = livekitModels$TrackInfo.getSid();
        AbstractC3557B.b0("info.sid", sid);
        this.f21844c = sid;
        String name = livekitModels$TrackInfo.getName();
        AbstractC3557B.b0("info.name", name);
        this.f21843b = name;
        EnumC4056o2 type = livekitModels$TrackInfo.getType();
        AbstractC3557B.b0("info.type", type);
        v.f21937a.getClass();
        int ordinal = type.ordinal();
        int i11 = 3;
        if (ordinal != 0) {
            if (ordinal != 1) {
                i10 = 3;
            } else {
                i10 = 2;
            }
        } else {
            i10 = 1;
        }
        this.f21845d = i10;
        b(livekitModels$TrackInfo.getMuted());
        EnumC4051n2 source = livekitModels$TrackInfo.getSource();
        AbstractC3557B.b0("info.source", source);
        v.f21938b.getClass();
        int ordinal2 = source.ordinal();
        if (ordinal2 != 1) {
            if (ordinal2 != 2) {
                if (ordinal2 != 3) {
                    i11 = 4;
                }
            } else {
                i11 = 2;
            }
        } else {
            i11 = 1;
        }
        this.f21847f = i11;
        if (this.f21845d == 2) {
            livekitModels$TrackInfo.getSimulcast();
            livekitModels$TrackInfo.getWidth();
            livekitModels$TrackInfo.getHeight();
        }
        livekitModels$TrackInfo.getMimeType();
        this.f21848g = livekitModels$TrackInfo;
    }
}
