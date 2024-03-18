package com.statsig.androidsdk;

import J8.b;
import id.AbstractC3557B;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\r\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB[\u0012\u0012\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u001e\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00070\u0002\u0012\u001e\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00070\u0002\u00a2\u0006\u0004\b\u001b\u0010\u001cJ\u001c\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\u0005\u0010\u0006J(\u0010\b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00070\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\b\u0010\u0006J(\u0010\t\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00070\u0002H\u00c6\u0003\u00a2\u0006\u0004\b\t\u0010\u0006Jj\u0010\r\u001a\u00020\u00002\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022 \b\u0002\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00070\u00022 \b\u0002\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00070\u0002H\u00c6\u0001\u00a2\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0003H\u00d6\u0001\u00a2\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011H\u00d6\u0001\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0015\u001a\u00020\u00042\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\b\u0015\u0010\u0016R&\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\n\u0010\u0017\u001a\u0004\b\u0018\u0010\u0006R2\u0010\u000b\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00070\u00028\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\u000b\u0010\u0017\u001a\u0004\b\u0019\u0010\u0006R2\u0010\f\u001a\u001a\u0012\u0004\u0012\u00020\u0003\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00010\u00070\u00028\u0006X\u0087\u0004\u00a2\u0006\f\n\u0004\b\f\u0010\u0017\u001a\u0004\b\u001a\u0010\u0006\u00a8\u0006\u001e"}, d2 = {"Lcom/statsig/androidsdk/StatsigOverrides;", "", "j$/util/concurrent/ConcurrentHashMap", "", "", "component1", "()Lj$/util/concurrent/ConcurrentHashMap;", "", "component2", "component3", "gates", "configs", "layers", "copy", "(Lj$/util/concurrent/ConcurrentHashMap;Lj$/util/concurrent/ConcurrentHashMap;Lj$/util/concurrent/ConcurrentHashMap;)Lcom/statsig/androidsdk/StatsigOverrides;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Lj$/util/concurrent/ConcurrentHashMap;", "getGates", "getConfigs", "getLayers", "<init>", "(Lj$/util/concurrent/ConcurrentHashMap;Lj$/util/concurrent/ConcurrentHashMap;Lj$/util/concurrent/ConcurrentHashMap;)V", "Companion", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes.dex */
public final class StatsigOverrides {
    public static final Companion Companion = new Companion(null);
    @b("configs")
    private final ConcurrentHashMap<String, Map<String, Object>> configs;
    @b("gates")
    private final ConcurrentHashMap<String, Boolean> gates;
    @b("layers")
    private final ConcurrentHashMap<String, Map<String, Object>> layers;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004\u00a8\u0006\u0005"}, d2 = {"Lcom/statsig/androidsdk/StatsigOverrides$Companion;", "", "()V", "empty", "Lcom/statsig/androidsdk/StatsigOverrides;", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final StatsigOverrides empty() {
            return new StatsigOverrides(new ConcurrentHashMap(), new ConcurrentHashMap(), new ConcurrentHashMap());
        }
    }

    public StatsigOverrides(ConcurrentHashMap<String, Boolean> concurrentHashMap, ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap2, ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap3) {
        AbstractC3557B.c0("gates", concurrentHashMap);
        AbstractC3557B.c0("configs", concurrentHashMap2);
        AbstractC3557B.c0("layers", concurrentHashMap3);
        this.gates = concurrentHashMap;
        this.configs = concurrentHashMap2;
        this.layers = concurrentHashMap3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ StatsigOverrides copy$default(StatsigOverrides statsigOverrides, ConcurrentHashMap concurrentHashMap, ConcurrentHashMap concurrentHashMap2, ConcurrentHashMap concurrentHashMap3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            concurrentHashMap = statsigOverrides.gates;
        }
        if ((i10 & 2) != 0) {
            concurrentHashMap2 = statsigOverrides.configs;
        }
        if ((i10 & 4) != 0) {
            concurrentHashMap3 = statsigOverrides.layers;
        }
        return statsigOverrides.copy(concurrentHashMap, concurrentHashMap2, concurrentHashMap3);
    }

    public final ConcurrentHashMap<String, Boolean> component1() {
        return this.gates;
    }

    public final ConcurrentHashMap<String, Map<String, Object>> component2() {
        return this.configs;
    }

    public final ConcurrentHashMap<String, Map<String, Object>> component3() {
        return this.layers;
    }

    public final StatsigOverrides copy(ConcurrentHashMap<String, Boolean> concurrentHashMap, ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap2, ConcurrentHashMap<String, Map<String, Object>> concurrentHashMap3) {
        AbstractC3557B.c0("gates", concurrentHashMap);
        AbstractC3557B.c0("configs", concurrentHashMap2);
        AbstractC3557B.c0("layers", concurrentHashMap3);
        return new StatsigOverrides(concurrentHashMap, concurrentHashMap2, concurrentHashMap3);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StatsigOverrides)) {
            return false;
        }
        StatsigOverrides statsigOverrides = (StatsigOverrides) obj;
        return AbstractC3557B.K(this.gates, statsigOverrides.gates) && AbstractC3557B.K(this.configs, statsigOverrides.configs) && AbstractC3557B.K(this.layers, statsigOverrides.layers);
    }

    public final ConcurrentHashMap<String, Map<String, Object>> getConfigs() {
        return this.configs;
    }

    public final ConcurrentHashMap<String, Boolean> getGates() {
        return this.gates;
    }

    public final ConcurrentHashMap<String, Map<String, Object>> getLayers() {
        return this.layers;
    }

    public int hashCode() {
        int hashCode = this.configs.hashCode();
        return this.layers.hashCode() + ((hashCode + (this.gates.hashCode() * 31)) * 31);
    }

    public String toString() {
        return "StatsigOverrides(gates=" + this.gates + ", configs=" + this.configs + ", layers=" + this.layers + ')';
    }
}
