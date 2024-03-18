package Fe;

import Ng.C1059e0;
import Ng.D0;
import Ng.E;
import Ng.G;
import Ng.Q;
import Ng.z0;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.List;
import l8.AbstractC4344b;
import pf.AbstractC5163j;

/* loaded from: classes2.dex */
public abstract class t {

    /* renamed from: a  reason: collision with root package name */
    public static final List f5361a = AbstractC4344b.G0("NativePRNGNonBlocking", "WINDOWS-PRNG", "DRBG");

    /* renamed from: b  reason: collision with root package name */
    public static final Pg.k f5362b = Bi.c.d(1024, null, 6);

    /* renamed from: c  reason: collision with root package name */
    public static final D0 f5363c = Ad.l.N0(C1059e0.f12936Y, Q.f12906c.plus(z0.f13000Y).plus(new E("nonce-generator")), G.f12868Z, new AbstractC5163j(2, null));

    public static final SecureRandom a(String str) {
        SecureRandom secureRandom;
        try {
            if (str != null) {
                secureRandom = SecureRandom.getInstance(str);
            } else {
                secureRandom = new SecureRandom();
            }
            return secureRandom;
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }
}
