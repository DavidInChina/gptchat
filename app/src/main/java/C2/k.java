package C2;

import android.media.MediaCodec;
import s2.AbstractC5530A;

/* loaded from: classes2.dex */
public class k extends x2.f {

    /* renamed from: Y  reason: collision with root package name */
    public final String f2546Y;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public k(IllegalStateException illegalStateException, m mVar) {
        super(r0.toString(), illegalStateException);
        String str;
        StringBuilder sb2 = new StringBuilder("Decoder failed: ");
        String str2 = null;
        if (mVar == null) {
            str = null;
        } else {
            str = mVar.f2547a;
        }
        sb2.append(str);
        if (AbstractC5530A.f45131a >= 21 && (illegalStateException instanceof MediaCodec.CodecException)) {
            str2 = ((MediaCodec.CodecException) illegalStateException).getDiagnosticInfo();
        }
        this.f2546Y = str2;
    }
}
