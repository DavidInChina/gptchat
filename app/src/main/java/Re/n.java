package Re;

import android.content.Context;
import android.media.AudioAttributes;
import android.os.Build;
import ce.AbstractC2397c;
import ce.AbstractC2400f;
import id.AbstractC3557B;
import livekit.org.webrtc.audio.AudioDeviceModule;
import livekit.org.webrtc.audio.JavaAudioDeviceModule;

/* loaded from: classes2.dex */
public final class n implements AbstractC2397c {

    /* renamed from: a  reason: collision with root package name */
    public final p000if.a f15475a;

    /* renamed from: b  reason: collision with root package name */
    public final p000if.a f15476b;

    /* renamed from: c  reason: collision with root package name */
    public final p000if.a f15477c;

    /* renamed from: d  reason: collision with root package name */
    public final p000if.a f15478d;

    /* renamed from: e  reason: collision with root package name */
    public final p000if.a f15479e;

    /* renamed from: f  reason: collision with root package name */
    public final p000if.a f15480f;

    public n(p000if.a aVar, p000if.a aVar2, p000if.a aVar3, p000if.a aVar4, p000if.a aVar5, AbstractC2400f abstractC2400f) {
        this.f15475a = aVar;
        this.f15476b = aVar2;
        this.f15477c = aVar3;
        this.f15478d = aVar4;
        this.f15479e = aVar5;
        this.f15480f = abstractC2400f;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Object, livekit.org.webrtc.audio.JavaAudioDeviceModule$AudioRecordErrorCallback] */
    /* JADX WARN: Type inference failed for: r6v4, types: [livekit.org.webrtc.audio.JavaAudioDeviceModule$AudioTrackErrorCallback, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, livekit.org.webrtc.audio.JavaAudioDeviceModule$AudioRecordStateCallback] */
    @Override // p000if.a
    public final Object get() {
        boolean z10;
        AudioDeviceModule audioDeviceModule = (AudioDeviceModule) this.f15475a.get();
        wf.k kVar = (wf.k) this.f15476b.get();
        AudioAttributes audioAttributes = (AudioAttributes) this.f15477c.get();
        Context context = (Context) this.f15478d.get();
        Ue.a aVar = (Ue.a) this.f15479e.get();
        Qe.h hVar = (Qe.h) this.f15480f.get();
        AbstractC3557B.c0("audioOutputAttributes", audioAttributes);
        AbstractC3557B.c0("appContext", context);
        AbstractC3557B.c0("closeableManager", aVar);
        AbstractC3557B.c0("communicationWorkaround", hVar);
        if (audioDeviceModule == null) {
            ?? obj = new Object();
            ?? obj2 = new Object();
            ?? obj3 = new Object();
            l lVar = new l(hVar);
            if (Build.VERSION.SDK_INT >= 29) {
                z10 = true;
            } else {
                z10 = false;
            }
            JavaAudioDeviceModule.Builder audioAttributes2 = JavaAudioDeviceModule.builder(context).setUseHardwareAcousticEchoCanceler(z10).setUseHardwareNoiseSuppressor(z10).setAudioRecordErrorCallback(obj).setAudioTrackErrorCallback(obj2).setAudioRecordStateCallback(obj3).setAudioTrackStateCallback(lVar).setAudioSource(7).setAudioAttributes(audioAttributes);
            if (kVar != null) {
                AbstractC3557B.b0("builder", audioAttributes2);
                kVar.invoke(audioAttributes2);
            }
            JavaAudioDeviceModule createAudioDeviceModule = audioAttributes2.createAudioDeviceModule();
            aVar.a(new a(3, createAudioDeviceModule));
            AbstractC3557B.b0("builder.createAudioDevic\u2026rClosable { release() } }", createAudioDeviceModule);
            return createAudioDeviceModule;
        }
        return audioDeviceModule;
    }
}
