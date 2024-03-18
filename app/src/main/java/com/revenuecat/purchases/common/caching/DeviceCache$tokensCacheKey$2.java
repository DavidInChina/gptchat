package com.revenuecat.purchases.common.caching;

import kotlin.Metadata;
import kotlin.jvm.internal.o;
import r9.y;
import wf.AbstractC6216a;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n\u00a2\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes.dex */
public final class DeviceCache$tokensCacheKey$2 extends o implements AbstractC6216a {
    final /* synthetic */ DeviceCache this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceCache$tokensCacheKey$2(DeviceCache deviceCache) {
        super(0);
        this.this$0 = deviceCache;
    }

    @Override // wf.AbstractC6216a
    /* renamed from: invoke */
    public final String mo122invoke() {
        String apiKeyPrefix;
        StringBuilder sb2 = new StringBuilder();
        apiKeyPrefix = this.this$0.getApiKeyPrefix();
        sb2.append(apiKeyPrefix);
        sb2.append(".tokens");
        return sb2.toString();
    }
}
