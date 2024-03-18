package com.statsig.androidsdk;

import android.content.Context;
import id.AbstractC3557B;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000.\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u0015\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a \u0010\u0019\u001a\u00020\u001a2\u0006\u0010\u001b\u001a\u00020\u001c2\u0006\u0010\u001d\u001a\u00020\u00012\u0006\u0010\u001e\u001a\u00020\u001fH\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0004\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\t\u001a\u00020\nX\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000b\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\f\u001a\u00020\nX\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\r\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000e\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0011\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0012\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0013\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0014\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0015\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0016\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0017\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0018\u001a\u00020\u0001X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006 "}, d2 = {"ACCEPT_HEADER_KEY", "", "ACCEPT_HEADER_VALUE", "CONTENT_TYPE_HEADER_KEY", "CONTENT_TYPE_HEADER_VALUE", "HASH", "INITIALIZE_ENDPOINT", "LAST_SYNC_TIME_FOR_USER", "LOGGING_ENDPOINT", "MAX_LOG_PERIOD", "", "OFFLINE_LOGS_KEY_V1", "POLLING_INTERVAL_MS", StatsigNetworkKt.POST, "PREVIOUS_DERIVED_FIELDS", "RETRY_CODES", "", "SINCE_TIME", "STATSIG_API_HEADER_KEY", "STATSIG_CLIENT_TIME_HEADER_KEY", "STATSIG_EVENT_COUNT", "STATSIG_METADATA", "STATSIG_SDK_TYPE_KEY", "STATSIG_SDK_VERSION_KEY", "USER", "StatsigNetwork", "Lcom/statsig/androidsdk/StatsigNetwork;", "context", "Landroid/content/Context;", "sdkKey", "errorBoundary", "Lcom/statsig/androidsdk/ErrorBoundary;", "build_release"}, k = 2, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class StatsigNetworkKt {
    private static final String ACCEPT_HEADER_KEY = "Accept";
    private static final String ACCEPT_HEADER_VALUE = "application/json";
    private static final String CONTENT_TYPE_HEADER_KEY = "Content-Type";
    private static final String CONTENT_TYPE_HEADER_VALUE = "application/json; charset=UTF-8";
    private static final String HASH = "hash";
    private static final String INITIALIZE_ENDPOINT = "initialize";
    private static final String LAST_SYNC_TIME_FOR_USER = "lastSyncTimeForUser";
    private static final String LOGGING_ENDPOINT = "log_event";
    private static final String OFFLINE_LOGS_KEY_V1 = "StatsigNetwork.OFFLINE_LOGS";
    private static final long POLLING_INTERVAL_MS = 10000;
    private static final String POST = "POST";
    private static final String PREVIOUS_DERIVED_FIELDS = "previousDerivedFields";
    private static final String SINCE_TIME = "sinceTime";
    private static final String STATSIG_API_HEADER_KEY = "STATSIG-API-KEY";
    private static final String STATSIG_CLIENT_TIME_HEADER_KEY = "STATSIG-CLIENT-TIME";
    private static final String STATSIG_EVENT_COUNT = "STATSIG-EVENT-COUNT";
    private static final String STATSIG_METADATA = "statsigMetadata";
    private static final String STATSIG_SDK_TYPE_KEY = "STATSIG-SDK-TYPE";
    private static final String STATSIG_SDK_VERSION_KEY = "STATSIG-SDK-VERSION";
    private static final String USER = "user";
    private static final int[] RETRY_CODES = {408, 500, 502, 503, 504, 522, 524, 599};
    private static final long MAX_LOG_PERIOD = TimeUnit.DAYS.toMillis(3);

    public static final StatsigNetwork StatsigNetwork(Context context, String str, ErrorBoundary errorBoundary) {
        AbstractC3557B.c0("context", context);
        AbstractC3557B.c0("sdkKey", str);
        AbstractC3557B.c0("errorBoundary", errorBoundary);
        return new StatsigNetworkImpl(context, str, errorBoundary);
    }
}
