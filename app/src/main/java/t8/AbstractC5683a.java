package t8;

import java.util.HashMap;

/* renamed from: t8.a  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC5683a {

    /* renamed from: a  reason: collision with root package name */
    public static final HashMap f45795a;

    /* renamed from: b  reason: collision with root package name */
    public static final HashMap f45796b;

    static {
        HashMap hashMap = new HashMap();
        f45795a = hashMap;
        HashMap hashMap2 = new HashMap();
        f45796b = hashMap2;
        hashMap.put(-1, "The Play Store app is either not installed or not the official version.");
        hashMap.put(-2, "Call first requestReviewFlow to get the ReviewInfo.");
        hashMap.put(-100, "Retry with an exponential backoff. Consider filing a bug if fails consistently.");
        hashMap2.put(-1, "PLAY_STORE_NOT_FOUND");
        hashMap2.put(-2, "INVALID_REQUEST");
        hashMap2.put(-100, "INTERNAL_ERROR");
    }
}
