package com.revenuecat.purchases.common;

import com.revenuecat.purchases.LogLevel;
import id.AbstractC3557B;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u00c0\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u000b"}, d2 = {"Lcom/revenuecat/purchases/common/Config;", "", "()V", "frameworkVersion", "", "logLevel", "Lcom/revenuecat/purchases/LogLevel;", "getLogLevel", "()Lcom/revenuecat/purchases/LogLevel;", "setLogLevel", "(Lcom/revenuecat/purchases/LogLevel;)V", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class Config {
    public static final String frameworkVersion = "7.7.0";
    public static final Config INSTANCE = new Config();
    private static LogLevel logLevel = LogUtilsKt.debugLogsEnabled(LogLevel.Companion, false);

    private Config() {
    }

    public final LogLevel getLogLevel() {
        return logLevel;
    }

    public final void setLogLevel(LogLevel logLevel2) {
        AbstractC3557B.c0("<set-?>", logLevel2);
        logLevel = logLevel2;
    }
}
