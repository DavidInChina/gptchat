package Wd;

import Ad.l;
import N.b0;
import android.content.Context;
import android.media.AudioAttributes;
import android.media.AudioFocusRequest;
import android.media.AudioManager;
import android.os.Build;
import id.AbstractC3557B;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentSkipListSet;
import jf.C3963m;
import jf.y;
import kf.s;
import kf.t;
import kotlin.jvm.internal.z;
import l8.AbstractC4344b;
import wf.n;
import xf.AbstractC6438a;
import xf.AbstractC6441d;
import y2.AbstractC6515b;
import yf.AbstractC6583a;
import z.AbstractC6708l;

/* loaded from: classes2.dex */
public abstract class c implements Yd.b {

    /* renamed from: k  reason: collision with root package name */
    public static final C3963m f20924k = R4.b.D1(a.f20921Y);

    /* renamed from: a  reason: collision with root package name */
    public n f20925a;

    /* renamed from: c  reason: collision with root package name */
    public final Yd.c f20927c;

    /* renamed from: d  reason: collision with root package name */
    public h f20928d;

    /* renamed from: e  reason: collision with root package name */
    public h f20929e;

    /* renamed from: f  reason: collision with root package name */
    public final ConcurrentSkipListSet f20930f;

    /* renamed from: h  reason: collision with root package name */
    public boolean f20932h;

    /* renamed from: i  reason: collision with root package name */
    public final G6.a f20933i;

    /* renamed from: j  reason: collision with root package name */
    public final i f20934j;

    /* renamed from: b  reason: collision with root package name */
    public int f20926b = 3;

    /* renamed from: g  reason: collision with root package name */
    public boolean f20931g = true;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v12, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v18, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r2v8, types: [java.util.List, java.lang.Iterable] */
    public c(Context context, AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener, Yd.c cVar, G6.a aVar, List list, i iVar) {
        ?? r22;
        AbstractC3557B.c0("logger", aVar);
        AbstractC3557B.c0("audioDeviceManager", iVar);
        this.f20933i = aVar;
        this.f20934j = iVar;
        this.f20927c = cVar;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Class cls = (Class) it.next();
            Object obj = linkedHashMap.get(cls);
            if (obj == null && !linkedHashMap.containsKey(cls)) {
                obj = new Object();
            }
            z zVar = (z) obj;
            zVar.f37647Y++;
            linkedHashMap.put(cls, zVar);
        }
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            AbstractC3557B.a0("null cannot be cast to non-null type kotlin.collections.MutableMap.MutableEntry<K of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4, R of kotlin.collections.GroupingKt__GroupingJVMKt.mapValuesInPlace$lambda$4>", entry);
            if ((entry instanceof AbstractC6438a) && !(entry instanceof AbstractC6441d)) {
                l.g1("kotlin.collections.MutableMap.MutableEntry", entry);
                throw null;
            }
            entry.setValue(Integer.valueOf(((z) entry.getValue()).f37647Y));
        }
        l.I(linkedHashMap);
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            if (((Number) entry2.getValue()).intValue() > 1) {
                linkedHashMap2.put(entry2.getKey(), entry2.getValue());
            }
        }
        if (linkedHashMap2.isEmpty()) {
            boolean isEmpty = list.isEmpty();
            C3963m c3963m = f20924k;
            if (!isEmpty && !AbstractC3557B.K(list, (List) c3963m.getValue())) {
                r22 = t.M2((List) c3963m.getValue());
                r22.removeAll(list);
                int i10 = 0;
                for (Object obj2 : list) {
                    int i11 = i10 + 1;
                    if (i10 >= 0) {
                        r22.add(i10, (Class) obj2);
                        i10 = i11;
                    } else {
                        AbstractC4344b.d1();
                        throw null;
                    }
                }
            } else {
                r22 = (List) c3963m.getValue();
            }
            this.f20930f = new ConcurrentSkipListSet(new b0(r22));
            this.f20933i.e("AudioSwitch", "AudioSwitch(1.2.0)");
            G6.a aVar2 = this.f20933i;
            StringBuilder sb2 = new StringBuilder("Preferred device list = ");
            ArrayList arrayList = new ArrayList(AbstractC6583a.H1(r22, 10));
            for (Class cls2 : r22) {
                arrayList.add(cls2.getSimpleName());
            }
            sb2.append(arrayList);
            aVar2.e("AudioSwitch", sb2.toString());
            return;
        }
        throw new IllegalArgumentException("Failed requirement.".toString());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public static void d(c cVar, boolean z10) {
        n nVar;
        ?? r22;
        h hVar = cVar.f20928d;
        Yd.c cVar2 = cVar.f20927c;
        if (hVar == null || !cVar2.b(hVar)) {
            Iterator it = cVar.f20930f.iterator();
            while (true) {
                if (it.hasNext()) {
                    r22 = it.next();
                    h hVar2 = (h) r22;
                    AbstractC3557B.b0("it", hVar2);
                    if (cVar2.b(hVar2)) {
                        break;
                    }
                } else {
                    r22 = 0;
                    break;
                }
            }
            hVar = r22;
        }
        boolean K10 = AbstractC3557B.K(cVar.f20929e, hVar);
        ConcurrentSkipListSet concurrentSkipListSet = cVar.f20930f;
        if (K10) {
            if (z10 && (nVar = cVar.f20925a) != null) {
                y yVar = (y) nVar.invoke(t.K2(concurrentSkipListSet), cVar.f20929e);
                return;
            }
            return;
        }
        if (cVar.e()) {
            cVar.f20933i.e("AudioSwitch", "Current user selected AudioDevice = " + cVar.f20928d);
            cVar.f20929e = hVar;
            if (cVar.f20926b == 2) {
                cVar.a();
            }
        }
        n nVar2 = cVar.f20925a;
        if (nVar2 != null) {
            y yVar2 = (y) nVar2.invoke(t.K2(concurrentSkipListSet), cVar.f20929e);
        }
    }

    public final void a() {
        AudioFocusRequest.Builder audioAttributes;
        AudioFocusRequest.Builder acceptsDelayedFocusGain;
        AudioFocusRequest.Builder onAudioFocusChangeListener;
        AudioFocusRequest build;
        int f6 = AbstractC6708l.f(this.f20926b);
        h hVar = null;
        if (f6 != 0) {
            if (f6 != 1) {
                if (f6 == 2) {
                    throw new IllegalStateException();
                }
                return;
            }
            h hVar2 = this.f20929e;
            if (hVar2 != null) {
                if (e()) {
                    hVar = hVar2;
                }
                if (hVar != null) {
                    b(hVar);
                    return;
                }
                return;
            }
            return;
        }
        i iVar = this.f20934j;
        AudioManager audioManager = iVar.f20950l;
        iVar.f20939a = audioManager.getMode();
        iVar.f20940b = audioManager.isMicrophoneMute();
        iVar.f20941c = audioManager.isSpeakerphoneOn();
        AudioManager audioManager2 = iVar.f20950l;
        audioManager2.setMicrophoneMute(false);
        if (this.f20931g) {
            iVar.f20951m.getClass();
            int i10 = Build.VERSION.SDK_INT;
            AudioManager.OnAudioFocusChangeListener onAudioFocusChangeListener2 = iVar.f20953o;
            if (i10 >= 26) {
                int i11 = iVar.f20944f;
                int i12 = iVar.f20946h;
                int i13 = iVar.f20947i;
                iVar.f20952n.getClass();
                AbstractC3557B.c0("audioFocusChangeListener", onAudioFocusChangeListener2);
                audioAttributes = AbstractC6515b.b(i11).setAudioAttributes(new AudioAttributes.Builder().setUsage(i12).setContentType(i13).build());
                acceptsDelayedFocusGain = audioAttributes.setAcceptsDelayedFocusGain(true);
                onAudioFocusChangeListener = acceptsDelayedFocusGain.setOnAudioFocusChangeListener(onAudioFocusChangeListener2);
                build = onAudioFocusChangeListener.build();
                AbstractC3557B.b0("AudioFocusRequest.Builde\u2026ner)\n            .build()", build);
                iVar.f20942d = build;
                audioManager2.requestAudioFocus(build);
            } else {
                audioManager2.requestAudioFocus(onAudioFocusChangeListener2, iVar.f20945g, iVar.f20944f);
            }
            audioManager2.setMode(iVar.f20943e);
        }
        h hVar3 = this.f20929e;
        if (hVar3 != null) {
            if (e()) {
                hVar = hVar3;
            }
            if (hVar != null) {
                b(hVar);
            }
        }
        this.f20926b = 2;
    }

    public abstract void b(h hVar);

    public void c(h hVar) {
        AbstractC3557B.c0("audioDevice", hVar);
        this.f20933i.e("AudioSwitch", "onDeviceConnected(" + hVar + ')');
        boolean z10 = hVar instanceof e;
        ConcurrentSkipListSet concurrentSkipListSet = this.f20930f;
        if (z10 && t.K2(concurrentSkipListSet).contains(new g())) {
            return;
        }
        boolean add = concurrentSkipListSet.add(hVar);
        if (hVar instanceof g) {
            s.S1(concurrentSkipListSet, b.f20922Z);
        }
        d(this, add);
    }

    public final boolean e() {
        int i10 = this.f20934j.f20943e;
        if (!this.f20932h && i10 != 3 && i10 != 2) {
            return false;
        }
        return true;
    }
}
