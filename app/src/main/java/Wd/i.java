package Wd;

import android.content.Context;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import id.AbstractC3557B;

/* loaded from: classes2.dex */
public final class i {

    /* renamed from: a  reason: collision with root package name */
    public int f20939a;

    /* renamed from: b  reason: collision with root package name */
    public boolean f20940b;

    /* renamed from: c  reason: collision with root package name */
    public boolean f20941c;

    /* renamed from: d  reason: collision with root package name */
    public AudioFocusRequest f20942d;

    /* renamed from: g  reason: collision with root package name */
    public int f20945g;

    /* renamed from: j  reason: collision with root package name */
    public final Context f20948j;

    /* renamed from: k  reason: collision with root package name */
    public final G6.a f20949k;

    /* renamed from: l  reason: collision with root package name */
    public final AudioManager f20950l;

    /* renamed from: m  reason: collision with root package name */
    public final Wc.d f20951m;

    /* renamed from: n  reason: collision with root package name */
    public final P5.c f20952n;

    /* renamed from: o  reason: collision with root package name */
    public final AudioManager.OnAudioFocusChangeListener f20953o;

    /* renamed from: e  reason: collision with root package name */
    public int f20943e = 3;

    /* renamed from: f  reason: collision with root package name */
    public int f20944f = 2;

    /* renamed from: h  reason: collision with root package name */
    public int f20946h = 2;

    /* renamed from: i  reason: collision with root package name */
    public int f20947i = 1;

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, P5.c] */
    public i(Context context, G6.a aVar, AudioManager audioManager, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener) {
        Wc.d dVar = new Wc.d(23);
        ?? obj = new Object();
        AbstractC3557B.c0("logger", aVar);
        AbstractC3557B.c0("audioManager", audioManager);
        this.f20948j = context;
        this.f20949k = aVar;
        this.f20950l = audioManager;
        this.f20951m = dVar;
        this.f20952n = obj;
        this.f20953o = onAudioFocusChangeListener;
    }

    public final void a(boolean z10) {
        AudioManager audioManager = this.f20950l;
        if (z10) {
            audioManager.startBluetoothSco();
        } else {
            audioManager.stopBluetoothSco();
        }
    }

    public final void b(boolean z10) {
        this.f20950l.setSpeakerphoneOn(z10);
    }

    public final boolean c() {
        boolean hasSystemFeature = this.f20948j.getPackageManager().hasSystemFeature("android.hardware.telephony");
        if (hasSystemFeature) {
            this.f20949k.e("AudioDeviceManager", "Earpiece available");
        }
        return hasSystemFeature;
    }
}
