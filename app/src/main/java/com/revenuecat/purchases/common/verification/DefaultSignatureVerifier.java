package com.revenuecat.purchases.common.verification;

import C8.e;
import android.util.Base64;
import id.AbstractC3557B;
import java.security.GeneralSecurityException;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u000f\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u00a2\u0006\u0004\b\f\u0010\rB\u0013\b\u0016\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u00a2\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0016\u00a2\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\b\t\u0010\n\u00a8\u0006\u0012"}, d2 = {"Lcom/revenuecat/purchases/common/verification/DefaultSignatureVerifier;", "Lcom/revenuecat/purchases/common/verification/SignatureVerifier;", "", "signatureToVerify", "messageToVerify", "", "verify", "([B[B)Z", "LC8/e;", "verifier", "LC8/e;", "publicKeyBytes", "<init>", "([B)V", "", "publicKey", "(Ljava/lang/String;)V", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes.dex */
public final class DefaultSignatureVerifier implements SignatureVerifier {
    public static final Companion Companion = new Companion(null);
    private static final String DEFAULT_PUBLIC_KEY = "UC1upXWg5QVmyOSwozp755xLqquBKjjU+di6U8QhMlM=";
    private final e verifier;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/revenuecat/purchases/common/verification/DefaultSignatureVerifier$Companion;", "", "()V", "DEFAULT_PUBLIC_KEY", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    public DefaultSignatureVerifier(byte[] bArr) {
        AbstractC3557B.c0("publicKeyBytes", bArr);
        this.verifier = new e(bArr);
    }

    @Override // com.revenuecat.purchases.common.verification.SignatureVerifier
    public boolean verify(byte[] bArr, byte[] bArr2) {
        AbstractC3557B.c0("signatureToVerify", bArr);
        AbstractC3557B.c0("messageToVerify", bArr2);
        try {
            this.verifier.a(bArr, bArr2);
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DefaultSignatureVerifier(String str) {
        this(r2);
        AbstractC3557B.c0("publicKey", str);
        byte[] decode = Base64.decode(str, 0);
        AbstractC3557B.b0("decode(publicKey, Base64.DEFAULT)", decode);
    }

    public /* synthetic */ DefaultSignatureVerifier(String str, int i10, g gVar) {
        this((i10 & 1) != 0 ? DEFAULT_PUBLIC_KEY : str);
    }
}
