package y2;

import android.media.AudioManager;
import android.os.Handler;

/* renamed from: y2.c  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6516c implements AudioManager.OnAudioFocusChangeListener {

    /* renamed from: a  reason: collision with root package name */
    public final Handler f50521a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ C6518e f50522b;

    public C6516c(C6518e c6518e, Handler handler) {
        this.f50522b = c6518e;
        this.f50521a = handler;
    }

    @Override // android.media.AudioManager.OnAudioFocusChangeListener
    public final void onAudioFocusChange(int i10) {
        this.f50521a.post(new r1.m(this, i10, 1));
    }
}
