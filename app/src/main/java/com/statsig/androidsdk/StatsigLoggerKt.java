package com.statsig.androidsdk;

import kotlin.Metadata;
import r9.y;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0002\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0005\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\b\u001a\u00020\tX\u0080T\u00a2\u0006\u0002\n\u0000\"\u000e\u0010\n\u001a\u00020\u0004X\u0080T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u000b"}, d2 = {"CONFIG_EXPOSURE", "", "DIAGNOSTICS_EVENT", "EXPOSURE_DEDUPE_INTERVAL", "", "FLUSH_TIMER_MS", "GATE_EXPOSURE", "LAYER_EXPOSURE", "MAX_EVENTS", "", "SHUTDOWN_WAIT_S", "build_release"}, k = 2, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public final class StatsigLoggerKt {
    public static final String CONFIG_EXPOSURE = "statsig::config_exposure";
    public static final String DIAGNOSTICS_EVENT = "statsig::diagnostics";
    private static final long EXPOSURE_DEDUPE_INTERVAL = 600000;
    public static final long FLUSH_TIMER_MS = 60000;
    public static final String GATE_EXPOSURE = "statsig::gate_exposure";
    public static final String LAYER_EXPOSURE = "statsig::layer_exposure";
    public static final int MAX_EVENTS = 50;
    public static final long SHUTDOWN_WAIT_S = 3;
}
