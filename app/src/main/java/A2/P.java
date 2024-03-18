package A2;

import android.media.AudioTrack;
import android.media.AudioTrack$StreamEventCallback;
import y2.C6505H;

/* loaded from: classes.dex */
public final class P extends AudioTrack$StreamEventCallback {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ Q f427a;

    public P(Q q10) {
        this.f427a = q10;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i10) {
        S s10;
        F4.a aVar;
        C6505H c6505h;
        if (audioTrack.equals(this.f427a.f430c.f487x) && (aVar = (s10 = this.f427a.f430c).f483t) != null && s10.f453X && (c6505h = ((V) aVar.f5033Z).f507X1) != null) {
            c6505h.f50388a.f50437m0.d(2);
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        S s10;
        F4.a aVar;
        C6505H c6505h;
        if (audioTrack.equals(this.f427a.f430c.f487x) && (aVar = (s10 = this.f427a.f430c).f483t) != null && s10.f453X && (c6505h = ((V) aVar.f5033Z).f507X1) != null) {
            c6505h.f50388a.f50437m0.d(2);
        }
    }
}
