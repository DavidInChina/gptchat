package k5;

import android.util.Base64;
import h5.C3324b;
import io.sentry.android.core.AbstractC3612c;
import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class E {

    /* renamed from: f  reason: collision with root package name */
    public static final /* synthetic */ int f37035f = 0;

    /* renamed from: a  reason: collision with root package name */
    public final C3324b f37036a;

    /* renamed from: b  reason: collision with root package name */
    public final String f37037b;

    /* renamed from: c  reason: collision with root package name */
    public final String f37038c;

    /* renamed from: d  reason: collision with root package name */
    public final String f37039d;

    /* renamed from: e  reason: collision with root package name */
    public final Map f37040e;

    public E(C3324b c3324b, String str, HashMap hashMap) {
        this.f37036a = c3324b;
        this.f37038c = str;
        byte[] bArr = new byte[32];
        new SecureRandom().nextBytes(bArr);
        String encodeToString = Base64.encodeToString(bArr, 11);
        this.f37037b = encodeToString;
        byte[] bytes = encodeToString.getBytes(StandardCharsets.US_ASCII);
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.update(bytes, 0, bytes.length);
            this.f37039d = Base64.encodeToString(messageDigest.digest(), 11);
            this.f37040e = hashMap;
        } catch (NoSuchAlgorithmException e10) {
            AbstractC3612c.d("c", "Failed to get SHA-256 signature", e10);
            throw new IllegalStateException("Failed to get SHA-256 signature", e10);
        }
    }
}
