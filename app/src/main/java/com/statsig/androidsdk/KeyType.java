package com.statsig.androidsdk;

import Lg.n;
import id.AbstractC3557B;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \n2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\nB\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t\u00a8\u0006\u000b"}, d2 = {"Lcom/statsig/androidsdk/KeyType;", "", "(Ljava/lang/String;I)V", "INITIALIZE", "BOOTSTRAP", "OVERALL", "CHECK_GATE", "GET_CONFIG", "GET_EXPERIMENT", "GET_LAYER", "Companion", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public enum KeyType {
    INITIALIZE,
    BOOTSTRAP,
    OVERALL,
    CHECK_GATE,
    GET_CONFIG,
    GET_EXPERIMENT,
    GET_LAYER;
    
    public static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/statsig/androidsdk/KeyType$Companion;", "", "()V", "convertFromString", "Lcom/statsig/androidsdk/KeyType;", "value", "", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final KeyType convertFromString(String str) {
            AbstractC3557B.c0("value", str);
            if (n.Z1("checkGate", str, false)) {
                return KeyType.CHECK_GATE;
            }
            if (n.Z1("getExperiment", str, false)) {
                return KeyType.GET_EXPERIMENT;
            }
            if (n.Z1("getConfig", str, false)) {
                return KeyType.GET_CONFIG;
            }
            if (n.Z1("getLayer", str, false)) {
                return KeyType.GET_LAYER;
            }
            return null;
        }
    }
}
