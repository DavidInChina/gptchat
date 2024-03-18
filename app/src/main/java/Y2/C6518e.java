package y2;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Handler;
import livekit.org.webrtc.MediaStreamTrack;
import p2.C5052e;
import s2.AbstractC5530A;

/* renamed from: y2.e  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6518e {

    /* renamed from: a  reason: collision with root package name */
    public final AudioManager f50555a;

    /* renamed from: b  reason: collision with root package name */
    public final C6516c f50556b;

    /* renamed from: c  reason: collision with root package name */
    public AbstractC6517d f50557c;

    /* renamed from: d  reason: collision with root package name */
    public C5052e f50558d;

    /* renamed from: f  reason: collision with root package name */
    public int f50560f;

    /* renamed from: h  reason: collision with root package name */
    public AudioFocusRequest f50562h;

    /* renamed from: g  reason: collision with root package name */
    public float f50561g = 1.0f;

    /* renamed from: e  reason: collision with root package name */
    public int f50559e = 0;

    public C6518e(Context context, Handler handler, SurfaceHolder$CallbackC6500C surfaceHolder$CallbackC6500C) {
        AudioManager audioManager = (AudioManager) context.getApplicationContext().getSystemService(MediaStreamTrack.AUDIO_TRACK_KIND);
        audioManager.getClass();
        this.f50555a = audioManager;
        this.f50557c = surfaceHolder$CallbackC6500C;
        this.f50556b = new C6516c(this, handler);
    }

    public final void a() {
        if (this.f50559e == 0) {
            return;
        }
        int i10 = AbstractC5530A.f45131a;
        AudioManager audioManager = this.f50555a;
        if (i10 >= 26) {
            AudioFocusRequest audioFocusRequest = this.f50562h;
            if (audioFocusRequest != null) {
                AbstractC6515b.h(audioManager, audioFocusRequest);
            }
        } else {
            audioManager.abandonAudioFocus(this.f50556b);
        }
        d(0);
    }

    public final void b(int i10) {
        AbstractC6517d abstractC6517d = this.f50557c;
        if (abstractC6517d != null) {
            C6504G c6504g = ((SurfaceHolder$CallbackC6500C) abstractC6517d).f50334Y;
            boolean o10 = c6504g.o();
            int i11 = 1;
            if (o10 && i10 != 1) {
                i11 = 2;
            }
            c6504g.A(i10, i11, o10);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x002b, code lost:
        if (r7.f42011Y == 1) goto L13;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void c(C5052e c5052e) {
        int i10;
        if (!AbstractC5530A.a(this.f50558d, c5052e)) {
            this.f50558d = c5052e;
            boolean z10 = false;
            if (c5052e != null) {
                i10 = 3;
                int i11 = c5052e.f42013h0;
                switch (i11) {
                    case 0:
                        s2.p.g("AudioFocusManager", "Specify a proper usage in the audio attributes for audio focus handling. Using AUDIOFOCUS_GAIN by default.");
                        i10 = 1;
                        break;
                    case 1:
                    case 14:
                        i10 = 1;
                        break;
                    case 2:
                    case 4:
                        i10 = 2;
                        break;
                    case 3:
                        break;
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 9:
                    case 10:
                    case 12:
                    case 13:
                        break;
                    case 11:
                        break;
                    case 15:
                    default:
                        android.gov.nist.core.a.v("Unidentified audio usage: ", i11, "AudioFocusManager");
                        break;
                    case 16:
                        if (AbstractC5530A.f45131a >= 19) {
                            i10 = 4;
                            break;
                        }
                        i10 = 2;
                        break;
                }
                this.f50560f = i10;
                if (i10 != 1 || i10 == 0) {
                    z10 = true;
                }
                Gi.e.k("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", z10);
            }
            i10 = 0;
            this.f50560f = i10;
            if (i10 != 1) {
            }
            z10 = true;
            Gi.e.k("Automatic handling of audio focus is only available for USAGE_MEDIA and USAGE_GAME.", z10);
        }
    }

    public final void d(int i10) {
        float f6;
        if (this.f50559e == i10) {
            return;
        }
        this.f50559e = i10;
        if (i10 == 3) {
            f6 = 0.2f;
        } else {
            f6 = 1.0f;
        }
        if (this.f50561g == f6) {
            return;
        }
        this.f50561g = f6;
        AbstractC6517d abstractC6517d = this.f50557c;
        if (abstractC6517d != null) {
            C6504G c6504g = ((SurfaceHolder$CallbackC6500C) abstractC6517d).f50334Y;
            c6504g.w(1, Float.valueOf(c6504g.f50357R * c6504g.f50386y.f50561g), 2);
        }
    }

    public final int e(int i10, boolean z10) {
        int i11;
        int i12;
        AudioFocusRequest.Builder builder;
        boolean z11;
        int i13 = 1;
        if (i10 != 1 && this.f50560f == 1) {
            if (!z10) {
                return -1;
            }
            if (this.f50559e != 1) {
                int i14 = AbstractC5530A.f45131a;
                AudioManager audioManager = this.f50555a;
                C6516c c6516c = this.f50556b;
                if (i14 >= 26) {
                    AudioFocusRequest audioFocusRequest = this.f50562h;
                    if (audioFocusRequest == null) {
                        if (audioFocusRequest == null) {
                            AbstractC6515b.g();
                            builder = AbstractC6515b.b(this.f50560f);
                        } else {
                            AbstractC6515b.g();
                            builder = AbstractC6515b.e(this.f50562h);
                        }
                        C5052e c5052e = this.f50558d;
                        if (c5052e != null && c5052e.f42011Y == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        c5052e.getClass();
                        this.f50562h = AbstractC6515b.f(AbstractC6515b.c(AbstractC6515b.d(r0.s.l(builder, (AudioAttributes) c5052e.b().f8729Y), z11), c6516c));
                    }
                    i11 = AbstractC6515b.a(audioManager, this.f50562h);
                } else {
                    C5052e c5052e2 = this.f50558d;
                    c5052e2.getClass();
                    int i15 = c5052e2.f42013h0;
                    if (i15 != 13) {
                        switch (i15) {
                            case 2:
                                i12 = 0;
                                break;
                            case 3:
                                i12 = 8;
                                break;
                            case 4:
                                i12 = 4;
                                break;
                            case 5:
                            case 7:
                            case 8:
                            case 9:
                            case 10:
                                i12 = 5;
                                break;
                            case 6:
                                i12 = 2;
                                break;
                            default:
                                i12 = 3;
                                break;
                        }
                    } else {
                        i12 = 1;
                    }
                    i11 = audioManager.requestAudioFocus(c6516c, i12, this.f50560f);
                }
                if (i11 == 1) {
                    d(1);
                } else {
                    d(0);
                    i13 = -1;
                }
            }
            return i13;
        }
        a();
        if (z10) {
            return 1;
        }
        return -1;
    }
}
