package y2;

import java.util.Locale;
import s2.AbstractC5530A;

/* renamed from: y2.g  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6520g {

    /* renamed from: a  reason: collision with root package name */
    public int f50589a;

    /* renamed from: b  reason: collision with root package name */
    public int f50590b;

    /* renamed from: c  reason: collision with root package name */
    public int f50591c;

    /* renamed from: d  reason: collision with root package name */
    public int f50592d;

    /* renamed from: e  reason: collision with root package name */
    public int f50593e;

    /* renamed from: f  reason: collision with root package name */
    public int f50594f;

    /* renamed from: g  reason: collision with root package name */
    public int f50595g;

    /* renamed from: h  reason: collision with root package name */
    public int f50596h;

    /* renamed from: i  reason: collision with root package name */
    public int f50597i;

    /* renamed from: j  reason: collision with root package name */
    public int f50598j;

    /* renamed from: k  reason: collision with root package name */
    public long f50599k;

    /* renamed from: l  reason: collision with root package name */
    public int f50600l;

    public final String toString() {
        int i10 = this.f50589a;
        int i11 = this.f50590b;
        int i12 = this.f50591c;
        int i13 = this.f50592d;
        int i14 = this.f50593e;
        int i15 = this.f50594f;
        int i16 = this.f50595g;
        int i17 = this.f50596h;
        int i18 = this.f50597i;
        int i19 = this.f50598j;
        long j6 = this.f50599k;
        int i20 = this.f50600l;
        int i21 = AbstractC5530A.f45131a;
        Locale locale = Locale.US;
        StringBuilder A10 = E9.f.A("DecoderCounters {\n decoderInits=", i10, ",\n decoderReleases=", i11, "\n queuedInputBuffers=");
        A10.append(i12);
        A10.append("\n skippedInputBuffers=");
        A10.append(i13);
        A10.append("\n renderedOutputBuffers=");
        A10.append(i14);
        A10.append("\n skippedOutputBuffers=");
        A10.append(i15);
        A10.append("\n droppedBuffers=");
        A10.append(i16);
        A10.append("\n droppedInputBuffers=");
        A10.append(i17);
        A10.append("\n maxConsecutiveDroppedBuffers=");
        A10.append(i18);
        A10.append("\n droppedToKeyframeEvents=");
        A10.append(i19);
        A10.append("\n totalVideoFrameProcessingOffsetUs=");
        A10.append(j6);
        A10.append("\n videoFrameProcessingOffsetCount=");
        A10.append(i20);
        A10.append("\n}");
        return A10.toString();
    }
}
