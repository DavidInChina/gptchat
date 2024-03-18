package x2;

import android.media.MediaCodec;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public final class d {

    /* renamed from: a  reason: collision with root package name */
    public byte[] f48629a;

    /* renamed from: b  reason: collision with root package name */
    public byte[] f48630b;

    /* renamed from: c  reason: collision with root package name */
    public int f48631c;

    /* renamed from: d  reason: collision with root package name */
    public int[] f48632d;

    /* renamed from: e  reason: collision with root package name */
    public int[] f48633e;

    /* renamed from: f  reason: collision with root package name */
    public int f48634f;

    /* renamed from: g  reason: collision with root package name */
    public int f48635g;

    /* renamed from: h  reason: collision with root package name */
    public int f48636h;

    /* renamed from: i  reason: collision with root package name */
    public final MediaCodec.CryptoInfo f48637i;

    /* renamed from: j  reason: collision with root package name */
    public final C6268c f48638j;

    public d() {
        C6268c c6268c;
        MediaCodec.CryptoInfo cryptoInfo = new MediaCodec.CryptoInfo();
        this.f48637i = cryptoInfo;
        if (AbstractC5530A.f45131a >= 24) {
            c6268c = new C6268c(cryptoInfo);
        } else {
            c6268c = null;
        }
        this.f48638j = c6268c;
    }
}
