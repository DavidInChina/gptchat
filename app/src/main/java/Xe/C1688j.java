package Xe;

import android.gov.nist.javax.sip.header.ParameterNames;
import cf.C2409h;
import id.AbstractC3557B;
import livekit.LivekitModels$TrackInfo;

/* renamed from: Xe.j  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1688j extends B {

    /* renamed from: j  reason: collision with root package name */
    public final We.D f21898j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1688j(LivekitModels$TrackInfo livekitModels$TrackInfo, z zVar, We.i iVar, We.D d10) {
        super(livekitModels$TrackInfo, zVar, iVar);
        AbstractC3557B.c0(ParameterNames.INFO, livekitModels$TrackInfo);
        AbstractC3557B.c0("options", d10);
        this.f21898j = d10;
    }

    @Override // Xe.B
    public final void b(boolean z10) {
        z a5;
        We.i iVar;
        Df.v[] vVarArr = B.f21841i;
        Df.v vVar = vVarArr[1];
        C2409h c2409h = this.f21846e;
        if (z10 == ((Boolean) c2409h.d(vVar)).booleanValue() || (a5 = a()) == null) {
            return;
        }
        a5.b().setEnabled(!z10);
        c2409h.h(Boolean.valueOf(z10), vVarArr[1]);
        Object obj = this.f21849h.get();
        if (obj instanceof We.i) {
            iVar = (We.i) obj;
        } else {
            iVar = null;
        }
        if (iVar == null) {
            return;
        }
        iVar.f21021s.n(this.f21844c, z10);
        if (z10) {
            iVar.d(this);
        } else {
            iVar.e(this);
        }
    }

    public final boolean d() {
        return ((Boolean) this.f21846e.d(B.f21841i[1])).booleanValue();
    }
}
