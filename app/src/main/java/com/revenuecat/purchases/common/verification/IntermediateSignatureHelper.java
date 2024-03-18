package com.revenuecat.purchases.common.verification;

import Df.H;
import Mg.a;
import Mg.b;
import Mg.d;
import com.revenuecat.purchases.PurchasesError;
import com.revenuecat.purchases.PurchasesErrorCode;
import com.revenuecat.purchases.common.IntExtensionsKt;
import com.revenuecat.purchases.utils.Result;
import id.AbstractC3557B;
import java.util.Date;
import kf.q;
import kotlin.Metadata;
import kotlin.jvm.internal.l;
import r9.y;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001a\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/verification/IntermediateSignatureHelper;", "", "rootSignatureVerifier", "Lcom/revenuecat/purchases/common/verification/SignatureVerifier;", "(Lcom/revenuecat/purchases/common/verification/SignatureVerifier;)V", "createIntermediateKeyVerifierIfVerified", "Lcom/revenuecat/purchases/utils/Result;", "Lcom/revenuecat/purchases/PurchasesError;", "signature", "Lcom/revenuecat/purchases/common/verification/Signature;", "getIntermediateKeyExpirationDate", "Ljava/util/Date;", "intermediateKeyExpirationBytes", "", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class IntermediateSignatureHelper {
    private final SignatureVerifier rootSignatureVerifier;

    public IntermediateSignatureHelper(SignatureVerifier signatureVerifier) {
        AbstractC3557B.c0("rootSignatureVerifier", signatureVerifier);
        this.rootSignatureVerifier = signatureVerifier;
    }

    private final Date getIntermediateKeyExpirationDate(byte[] bArr) {
        a aVar = b.f12127Z;
        return new Date(b.e(H.x0(IntExtensionsKt.fromLittleEndianBytes(l.f37641a, bArr), d.f12137l0)));
    }

    public final Result<SignatureVerifier, PurchasesError> createIntermediateKeyVerifierIfVerified(Signature signature) {
        AbstractC3557B.c0("signature", signature);
        if (!this.rootSignatureVerifier.verify(signature.getIntermediateKeySignature(), q.t3(signature.getIntermediateKeyExpiration(), signature.getIntermediateKey()))) {
            return new Result.Error(new PurchasesError(PurchasesErrorCode.SignatureVerificationError, "Error verifying intermediate key."));
        }
        Date intermediateKeyExpirationDate = getIntermediateKeyExpirationDate(signature.getIntermediateKeyExpiration());
        if (intermediateKeyExpirationDate.before(new Date())) {
            PurchasesErrorCode purchasesErrorCode = PurchasesErrorCode.SignatureVerificationError;
            return new Result.Error(new PurchasesError(purchasesErrorCode, "Intermediate key expired at " + intermediateKeyExpirationDate));
        }
        return new Result.Success(new DefaultSignatureVerifier(signature.getIntermediateKey()));
    }
}
