package k5;

import java.security.NoSuchAlgorithmException;
import java.security.PublicKey;
import java.security.Signature;
import java.util.Collections;
import java.util.List;

/* renamed from: k5.a  reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4175a {

    /* renamed from: a  reason: collision with root package name */
    public final List f37059a = Collections.singletonList("RS256");

    /* renamed from: b  reason: collision with root package name */
    public final Signature f37060b;

    public C4175a(PublicKey publicKey) {
        try {
            Signature signature = Signature.getInstance("SHA256withRSA");
            this.f37060b = signature;
            signature.initVerify(publicKey);
        } catch (NoSuchAlgorithmException unused) {
        }
    }
}
