package g9;

import Dd.C0388i;
import Ng.x0;
import Qe.m;
import Wh.w;
import android.content.Context;
import android.media.AudioAttributes;
import bf.C2192a;
import ce.AbstractC2397c;
import i9.C3517i;
import id.AbstractC3557B;
import java.util.Set;
import l9.C4355c;
import livekit.org.webrtc.Logging;
import livekit.org.webrtc.PeerConnectionFactory;
import mc.AbstractC4617d;
import sd.AbstractC5614c;
import sd.C5613b;
import td.C5756a;

/* renamed from: g9.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3214e implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ int f31316a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f31317b;

    public /* synthetic */ C3214e(p000if.a aVar, int i10) {
        this.f31316a = i10;
        this.f31317b = aVar;
    }

    @Override // p000if.a
    public final Object get() {
        int i10 = this.f31316a;
        p000if.a aVar = this.f31317b;
        switch (i10) {
            case 0:
                return new C3213d((Set) aVar.get());
            case 1:
                return new C3517i((AbstractC4617d) aVar.get());
            case 2:
                AbstractC3557B.c0("datadogConfig", (C4355c) aVar.get());
                return new Object();
            case 3:
                C5613b c5613b = (C5613b) aVar.get();
                AbstractC3557B.c0("dependencies", c5613b);
                return new AbstractC5614c(c5613b, "voice_settings", new C5756a(C0388i.Companion.serializer()), new C0388i());
            case 4:
                return new Qe.g((Context) aVar.get());
            case 5:
                return new m((x0) aVar.get());
            case 6:
                Pe.b bVar = (Pe.b) aVar.get();
                AbstractC3557B.c0("audioType", bVar);
                AudioAttributes audioAttributes = bVar.f13952b;
                if (audioAttributes != null) {
                    return audioAttributes;
                }
                throw new NullPointerException("Cannot return null from a non-@Nullable @Provides method");
            case 7:
                Pe.b bVar2 = (Pe.b) aVar.get();
                if (bVar2 == null) {
                    return new Pe.b();
                }
                return bVar2;
            case 8:
                Context context = (Context) aVar.get();
                AbstractC3557B.c0("appContext", context);
                PeerConnectionFactory.initialize(PeerConnectionFactory.InitializationOptions.builder(context).setNativeLibraryName("lkjingle_peerconnection_so").setInjectableLogger(new A9.a(21), Logging.Severity.LS_VERBOSE).createInitializationOptions());
                return Re.d.f15467a;
            case 9:
                Context context2 = (Context) aVar.get();
                AbstractC3557B.c0("context", context2);
                return new C2192a(context2);
            case 10:
                w wVar = (w) aVar.get();
                if (wVar == null) {
                    return new w();
                }
                return wVar;
            default:
                w wVar2 = (w) aVar.get();
                AbstractC3557B.c0("okHttpClient", wVar2);
                return wVar2;
        }
    }
}
