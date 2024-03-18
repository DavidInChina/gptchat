package H3;

import android.animation.TypeEvaluator;
import y.AbstractC6463a;

/* loaded from: classes2.dex */
public final class f implements TypeEvaluator {

    /* renamed from: a  reason: collision with root package name */
    public static final f f7365a = new Object();

    @Override // android.animation.TypeEvaluator
    public final Object evaluate(float f6, Object obj, Object obj2) {
        int intValue = ((Integer) obj).intValue();
        float f10 = ((intValue >> 24) & 255) / 255.0f;
        int intValue2 = ((Integer) obj2).intValue();
        float pow = (float) Math.pow(((intValue >> 16) & 255) / 255.0f, 2.2d);
        float pow2 = (float) Math.pow(((intValue >> 8) & 255) / 255.0f, 2.2d);
        float pow3 = (float) Math.pow((intValue & 255) / 255.0f, 2.2d);
        float pow4 = (float) Math.pow(((intValue2 >> 16) & 255) / 255.0f, 2.2d);
        float d10 = AbstractC6463a.d(((intValue2 >> 24) & 255) / 255.0f, f10, f6, f10);
        float d11 = AbstractC6463a.d(pow4, pow, f6, pow);
        float d12 = AbstractC6463a.d((float) Math.pow(((intValue2 >> 8) & 255) / 255.0f, 2.2d), pow2, f6, pow2);
        float d13 = AbstractC6463a.d((float) Math.pow((intValue2 & 255) / 255.0f, 2.2d), pow3, f6, pow3);
        int round = Math.round(((float) Math.pow(d11, 0.45454545454545453d)) * 255.0f) << 16;
        return Integer.valueOf(Math.round(((float) Math.pow(d13, 0.45454545454545453d)) * 255.0f) | round | (Math.round(d10 * 255.0f) << 24) | (Math.round(((float) Math.pow(d12, 0.45454545454545453d)) * 255.0f) << 8));
    }
}
