package af;

import Ad.l;
import Ng.C1072l;
import cf.AbstractC2406e;
import cf.C2404c;
import cf.C2405d;
import com.google.android.gms.internal.play_billing.N;
import java.util.ArrayList;
import java.util.List;
import jf.y;
import livekit.org.webrtc.SdpObserver;
import livekit.org.webrtc.SessionDescription;
import nf.AbstractC4825e;
import nf.C4832l;
import nf.C4833m;
import of.EnumC5000a;
import q1.AbstractC5260f;

/* renamed from: af.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C1988e implements SdpObserver {

    /* renamed from: b  reason: collision with root package name */
    public AbstractC2406e f24184b;

    /* renamed from: d  reason: collision with root package name */
    public AbstractC2406e f24186d;

    /* renamed from: a  reason: collision with root package name */
    public final Wg.d f24183a = Wg.e.a();

    /* renamed from: c  reason: collision with root package name */
    public final ArrayList f24185c = new ArrayList();

    /* renamed from: e  reason: collision with root package name */
    public final ArrayList f24187e = new ArrayList();

    public final Object a(AbstractC4825e abstractC4825e) {
        C1072l c1072l = new C1072l(1, AbstractC5260f.z(abstractC4825e));
        c1072l.u();
        AbstractC2406e abstractC2406e = this.f24184b;
        if (abstractC2406e == null) {
            l.a1(C4832l.f40334Y, new C1984a(this, c1072l, null));
        } else {
            c1072l.resumeWith(abstractC2406e);
        }
        Object t10 = c1072l.t();
        if (t10 == EnumC5000a.f41328Y) {
            N.k0(abstractC4825e);
        }
        return t10;
    }

    public final Object b(AbstractC4825e abstractC4825e) {
        C4833m c4833m = new C4833m(AbstractC5260f.z(abstractC4825e));
        AbstractC2406e abstractC2406e = this.f24186d;
        if (abstractC2406e == null) {
            l.a1(C4832l.f40334Y, new C1985b(this, c4833m, null));
        } else {
            c4833m.resumeWith(abstractC2406e);
        }
        Object b10 = c4833m.b();
        if (b10 == EnumC5000a.f41328Y) {
            N.k0(abstractC4825e);
        }
        return b10;
    }

    public final void c(AbstractC2406e abstractC2406e) {
        List<AbstractC4825e> list = (List) l.a1(C4832l.f40334Y, new C1986c(this, abstractC2406e, null));
        if (list != null) {
            for (AbstractC4825e abstractC4825e : list) {
                abstractC4825e.resumeWith(abstractC2406e);
            }
        }
    }

    public final void d(AbstractC2406e abstractC2406e) {
        List<AbstractC4825e> list = (List) l.a1(C4832l.f40334Y, new C1987d(this, abstractC2406e, null));
        if (list != null) {
            for (AbstractC4825e abstractC4825e : list) {
                abstractC4825e.resumeWith(abstractC2406e);
            }
        }
    }

    @Override // livekit.org.webrtc.SdpObserver
    public final void onCreateFailure(String str) {
        c(new C2405d(str));
    }

    @Override // livekit.org.webrtc.SdpObserver
    public final void onCreateSuccess(SessionDescription sessionDescription) {
        AbstractC2406e abstractC2406e;
        if (sessionDescription == null) {
            abstractC2406e = new C2405d("empty sdp");
        } else {
            abstractC2406e = new C2404c(sessionDescription);
        }
        c(abstractC2406e);
    }

    @Override // livekit.org.webrtc.SdpObserver
    public final void onSetFailure(String str) {
        d(new C2405d(str));
    }

    @Override // livekit.org.webrtc.SdpObserver
    public final void onSetSuccess() {
        d(new C2404c(y.f36177a));
    }
}
