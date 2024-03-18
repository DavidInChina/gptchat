package Xe;

import cf.C2409h;
import com.google.android.gms.internal.play_billing.AbstractC2469q0;
import id.AbstractC3557B;
import livekit.org.webrtc.MediaStreamTrack;

/* loaded from: classes.dex */
public abstract class z {

    /* renamed from: g  reason: collision with root package name */
    public static final /* synthetic */ Df.v[] f21945g = {kotlin.jvm.internal.C.f37623a.e(new kotlin.jvm.internal.q(z.class, "streamState", "getStreamState()Lio/livekit/android/room/track/Track$StreamState;", 0))};

    /* renamed from: a  reason: collision with root package name */
    public final Te.b f21946a;

    /* renamed from: b  reason: collision with root package name */
    public final Te.b f21947b;

    /* renamed from: c  reason: collision with root package name */
    public String f21948c;

    /* renamed from: d  reason: collision with root package name */
    public final int f21949d;

    /* renamed from: e  reason: collision with root package name */
    public String f21950e;

    /* renamed from: f  reason: collision with root package name */
    public final C2409h f21951f = R4.b.C0(x.f21940Z, new Jb.c(20, this));

    public z(String str, int i10, MediaStreamTrack mediaStreamTrack) {
        AbstractC2469q0.q("kind", i10);
        AbstractC3557B.c0("rtcTrack", mediaStreamTrack);
        Te.b bVar = new Te.b();
        this.f21946a = bVar;
        this.f21947b = bVar;
        this.f21948c = str;
        this.f21949d = i10;
    }

    public void a() {
        ef.e.a(new y(this, 0));
    }

    public abstract MediaStreamTrack b();

    public void c() {
        ef.e.a(new y(this, 2));
    }
}
