package com.statsig.androidsdk;

import com.revenuecat.purchases.common.verification.SigningManager;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\n"}, d2 = {"Lcom/statsig/androidsdk/HashAlgorithm;", "", "value", "", "(Ljava/lang/String;ILjava/lang/String;)V", "getValue", "()Ljava/lang/String;", "SHA256", "DJB2", "NONE", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public enum HashAlgorithm {
    SHA256(SigningManager.POST_PARAMS_ALGORITHM),
    DJB2("djb2"),
    NONE("none");
    
    private final String value;

    HashAlgorithm(String str) {
        this.value = str;
    }

    public final String getValue() {
        return this.value;
    }
}
