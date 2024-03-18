package com.revenuecat.purchases.common.diagnostics;

import android.gov.nist.javax.sip.header.SIPHeaderNames;
import com.revenuecat.purchases.common.DateProvider;
import com.revenuecat.purchases.common.DefaultDateProvider;
import id.AbstractC3557B;
import java.util.Collection;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import org.json.JSONArray;
import org.json.JSONObject;
import r9.y;
import y.AbstractC6463a;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b0\u0018\u0000 \u00072\u00020\u0001:\u0004\u0007\b\t\nB\u000f\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006\u0082\u0001\u0003\u000b\f\r\u00a8\u0006\u000e"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "Lcom/revenuecat/purchases/utils/Event;", "diagnosticType", "", "(Ljava/lang/String;)V", "getDiagnosticType", "()Ljava/lang/String;", "Companion", "Counter", SIPHeaderNames.EVENT, "Histogram", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Counter;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Event;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Histogram;", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
/* loaded from: classes2.dex */
public abstract class DiagnosticsEntry implements com.revenuecat.purchases.utils.Event {
    public static final Companion Companion = new Companion(null);
    private static final String TYPE_KEY = "type";
    private static final int VERSION = 1;
    private static final String VERSION_KEY = "version";
    private final String diagnosticType;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\b"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Companion;", "", "()V", "TYPE_KEY", "", "VERSION", "", "VERSION_KEY", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001c2\u00020\u0001:\u0001\u001cB)\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\u0007\u001a\u00020\b\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005H\u00c6\u0003J\t\u0010\u0012\u001a\u00020\bH\u00c6\u0003J3\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bH\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\bH\u00d6\u0001J\b\u0010\u0019\u001a\u00020\u001aH\u0002J\b\u0010\u001b\u001a\u00020\u0006H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0007\u001a\u00020\b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001d"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Counter;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "name", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsCounterName;", "tags", "", "", "value", "", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsCounterName;Ljava/util/Map;I)V", "getName", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsCounterName;", "getTags", "()Ljava/util/Map;", "getValue", "()I", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "toJSONObject", "Lorg/json/JSONObject;", "toString", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Counter extends DiagnosticsEntry {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        public static final String NAME_KEY = "name";
        @Deprecated
        public static final String TAGS_KEY = "tags";
        @Deprecated
        public static final String VALUE_KEY = "value";
        private final DiagnosticsCounterName name;
        private final Map<String, String> tags;
        private final int value;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Counter$Companion;", "", "()V", "NAME_KEY", "", "TAGS_KEY", "VALUE_KEY", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
        /* loaded from: classes2.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Counter(DiagnosticsCounterName diagnosticsCounterName, Map<String, String> map, int i10) {
            super("counter", null);
            AbstractC3557B.c0("name", diagnosticsCounterName);
            AbstractC3557B.c0("tags", map);
            this.name = diagnosticsCounterName;
            this.tags = map;
            this.value = i10;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Counter copy$default(Counter counter, DiagnosticsCounterName diagnosticsCounterName, Map map, int i10, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                diagnosticsCounterName = counter.name;
            }
            if ((i11 & 2) != 0) {
                map = counter.tags;
            }
            if ((i11 & 4) != 0) {
                i10 = counter.value;
            }
            return counter.copy(diagnosticsCounterName, map, i10);
        }

        private final JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", 1);
            jSONObject.put(DiagnosticsEntry.TYPE_KEY, getDiagnosticType());
            String lowerCase = this.name.name().toLowerCase(Locale.ROOT);
            AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
            jSONObject.put("name", lowerCase);
            jSONObject.put("tags", new JSONObject(this.tags));
            jSONObject.put("value", this.value);
            return jSONObject;
        }

        public final DiagnosticsCounterName component1() {
            return this.name;
        }

        public final Map<String, String> component2() {
            return this.tags;
        }

        public final int component3() {
            return this.value;
        }

        public final Counter copy(DiagnosticsCounterName diagnosticsCounterName, Map<String, String> map, int i10) {
            AbstractC3557B.c0("name", diagnosticsCounterName);
            AbstractC3557B.c0("tags", map);
            return new Counter(diagnosticsCounterName, map, i10);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Counter)) {
                return false;
            }
            Counter counter = (Counter) obj;
            return this.name == counter.name && AbstractC3557B.K(this.tags, counter.tags) && this.value == counter.value;
        }

        public final DiagnosticsCounterName getName() {
            return this.name;
        }

        public final Map<String, String> getTags() {
            return this.tags;
        }

        public final int getValue() {
            return this.value;
        }

        public int hashCode() {
            return AbstractC6463a.f(this.tags, this.name.hashCode() * 31, 31) + this.value;
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            String jSONObject = toJSONObject().toString();
            AbstractC3557B.b0("toJSONObject().toString()", jSONObject);
            return jSONObject;
        }
    }

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0006\n\u0002\b\f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\u0002\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0011\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005H\u00c6\u0003J\u000f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0003J9\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00052\u000e\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u00c6\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u00d6\u0003J\t\u0010\u0018\u001a\u00020\u0019H\u00d6\u0001J\b\u0010\u001a\u001a\u00020\u001bH\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f\u00a8\u0006\u001e"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Histogram;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "name", "", "tags", "", Histogram.VALUES_KEY, "", "", "(Ljava/lang/String;Ljava/util/Map;Ljava/util/List;)V", "getName", "()Ljava/lang/String;", "getTags", "()Ljava/util/Map;", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toJSONObject", "Lorg/json/JSONObject;", "toString", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public static final class Histogram extends DiagnosticsEntry {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        public static final String NAME_KEY = "name";
        @Deprecated
        public static final String TAGS_KEY = "tags";
        @Deprecated
        public static final String VALUES_KEY = "values";
        private final String name;
        private final Map<String, String> tags;
        private final List<Double> values;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Histogram$Companion;", "", "()V", "NAME_KEY", "", "TAGS_KEY", "VALUES_KEY", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Histogram(String str, Map<String, String> map, List<Double> list) {
            super("histogram", null);
            AbstractC3557B.c0("name", str);
            AbstractC3557B.c0("tags", map);
            AbstractC3557B.c0(VALUES_KEY, list);
            this.name = str;
            this.tags = map;
            this.values = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Histogram copy$default(Histogram histogram, String str, Map map, List list, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = histogram.name;
            }
            if ((i10 & 2) != 0) {
                map = histogram.tags;
            }
            if ((i10 & 4) != 0) {
                list = histogram.values;
            }
            return histogram.copy(str, map, list);
        }

        private final JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", 1);
            jSONObject.put(DiagnosticsEntry.TYPE_KEY, getDiagnosticType());
            String lowerCase = this.name.toLowerCase(Locale.ROOT);
            AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
            jSONObject.put("name", lowerCase);
            jSONObject.put("tags", new JSONObject(this.tags));
            jSONObject.put(VALUES_KEY, new JSONArray((Collection) this.values));
            return jSONObject;
        }

        public final String component1() {
            return this.name;
        }

        public final Map<String, String> component2() {
            return this.tags;
        }

        public final List<Double> component3() {
            return this.values;
        }

        public final Histogram copy(String str, Map<String, String> map, List<Double> list) {
            AbstractC3557B.c0("name", str);
            AbstractC3557B.c0("tags", map);
            AbstractC3557B.c0(VALUES_KEY, list);
            return new Histogram(str, map, list);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Histogram)) {
                return false;
            }
            Histogram histogram = (Histogram) obj;
            return AbstractC3557B.K(this.name, histogram.name) && AbstractC3557B.K(this.tags, histogram.tags) && AbstractC3557B.K(this.values, histogram.values);
        }

        public final String getName() {
            return this.name;
        }

        public final Map<String, String> getTags() {
            return this.tags;
        }

        public final List<Double> getValues() {
            return this.values;
        }

        public int hashCode() {
            return this.values.hashCode() + AbstractC6463a.f(this.tags, this.name.hashCode() * 31, 31);
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            String jSONObject = toJSONObject().toString();
            AbstractC3557B.b0("toJSONObject().toString()", jSONObject);
            return jSONObject;
        }
    }

    public /* synthetic */ DiagnosticsEntry(String str, g gVar) {
        this(str);
    }

    public final String getDiagnosticType() {
        return this.diagnosticType;
    }

    private DiagnosticsEntry(String str) {
        this.diagnosticType = str;
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\b\u0018\u0000 \"2\u00020\u0001:\u0001\"B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u00a2\u0006\u0002\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\u0015\u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\tH\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u000bH\u00c6\u0003J=\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0014\b\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u000bH\u00c6\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0007H\u00d6\u0003J\t\u0010\u001d\u001a\u00020\u001eH\u00d6\u0001J\b\u0010\u001f\u001a\u00020 H\u0002J\b\u0010!\u001a\u00020\u0006H\u0016R\u0011\u0010\b\u001a\u00020\t\u00a2\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0011\u0010\n\u001a\u00020\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014\u00a8\u0006#"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Event;", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry;", "name", "Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventName;", Event.PROPERTIES_KEY, "", "", "", "dateProvider", "Lcom/revenuecat/purchases/common/DateProvider;", "dateTime", "Ljava/util/Date;", "(Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventName;Ljava/util/Map;Lcom/revenuecat/purchases/common/DateProvider;Ljava/util/Date;)V", "getDateProvider", "()Lcom/revenuecat/purchases/common/DateProvider;", "getDateTime", "()Ljava/util/Date;", "getName", "()Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEventName;", "getProperties", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toJSONObject", "Lorg/json/JSONObject;", "toString", "Companion", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Event extends DiagnosticsEntry {
        private static final Companion Companion = new Companion(null);
        @Deprecated
        public static final String NAME_KEY = "name";
        @Deprecated
        public static final String PROPERTIES_KEY = "properties";
        @Deprecated
        public static final String TIMESTAMP_KEY = "timestamp";
        private final DateProvider dateProvider;
        private final Date dateTime;
        private final DiagnosticsEventName name;
        private final Map<String, Object> properties;

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0007"}, d2 = {"Lcom/revenuecat/purchases/common/diagnostics/DiagnosticsEntry$Event$Companion;", "", "()V", "NAME_KEY", "", "PROPERTIES_KEY", "TIMESTAMP_KEY", "purchases_customEntitlementComputationRelease"}, k = 1, mv = {1, 7, 1}, xi = y.f44626f)
        /* loaded from: classes.dex */
        public static final class Companion {
            private Companion() {
            }

            public /* synthetic */ Companion(g gVar) {
                this();
            }
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Event(DiagnosticsEventName diagnosticsEventName, Map map, DateProvider dateProvider, Date date, int i10, g gVar) {
            this(diagnosticsEventName, map, dateProvider, (i10 & 8) != 0 ? dateProvider.getNow() : date);
            dateProvider = (i10 & 4) != 0 ? new DefaultDateProvider() : dateProvider;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Event copy$default(Event event, DiagnosticsEventName diagnosticsEventName, Map map, DateProvider dateProvider, Date date, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                diagnosticsEventName = event.name;
            }
            if ((i10 & 2) != 0) {
                map = event.properties;
            }
            if ((i10 & 4) != 0) {
                dateProvider = event.dateProvider;
            }
            if ((i10 & 8) != 0) {
                date = event.dateTime;
            }
            return event.copy(diagnosticsEventName, map, dateProvider, date);
        }

        private final JSONObject toJSONObject() {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("version", 1);
            jSONObject.put(DiagnosticsEntry.TYPE_KEY, getDiagnosticType());
            String lowerCase = this.name.name().toLowerCase(Locale.ROOT);
            AbstractC3557B.b0("this as java.lang.String).toLowerCase(Locale.ROOT)", lowerCase);
            jSONObject.put("name", lowerCase);
            jSONObject.put(PROPERTIES_KEY, new JSONObject(this.properties));
            jSONObject.put(TIMESTAMP_KEY, this.dateTime.getTime());
            return jSONObject;
        }

        public final DiagnosticsEventName component1() {
            return this.name;
        }

        public final Map<String, Object> component2() {
            return this.properties;
        }

        public final DateProvider component3() {
            return this.dateProvider;
        }

        public final Date component4() {
            return this.dateTime;
        }

        public final Event copy(DiagnosticsEventName diagnosticsEventName, Map<String, ? extends Object> map, DateProvider dateProvider, Date date) {
            AbstractC3557B.c0("name", diagnosticsEventName);
            AbstractC3557B.c0(PROPERTIES_KEY, map);
            AbstractC3557B.c0("dateProvider", dateProvider);
            AbstractC3557B.c0("dateTime", date);
            return new Event(diagnosticsEventName, map, dateProvider, date);
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Event)) {
                return false;
            }
            Event event = (Event) obj;
            return this.name == event.name && AbstractC3557B.K(this.properties, event.properties) && AbstractC3557B.K(this.dateProvider, event.dateProvider) && AbstractC3557B.K(this.dateTime, event.dateTime);
        }

        public final DateProvider getDateProvider() {
            return this.dateProvider;
        }

        public final Date getDateTime() {
            return this.dateTime;
        }

        public final DiagnosticsEventName getName() {
            return this.name;
        }

        public final Map<String, Object> getProperties() {
            return this.properties;
        }

        public int hashCode() {
            int f6 = AbstractC6463a.f(this.properties, this.name.hashCode() * 31, 31);
            return this.dateTime.hashCode() + ((this.dateProvider.hashCode() + f6) * 31);
        }

        @Override // com.revenuecat.purchases.utils.Event
        public String toString() {
            String jSONObject = toJSONObject().toString();
            AbstractC3557B.b0("toJSONObject().toString()", jSONObject);
            return jSONObject;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public Event(DiagnosticsEventName diagnosticsEventName, Map<String, ? extends Object> map, DateProvider dateProvider, Date date) {
            super("event", null);
            AbstractC3557B.c0("name", diagnosticsEventName);
            AbstractC3557B.c0(PROPERTIES_KEY, map);
            AbstractC3557B.c0("dateProvider", dateProvider);
            AbstractC3557B.c0("dateTime", date);
            this.name = diagnosticsEventName;
            this.properties = map;
            this.dateProvider = dateProvider;
            this.dateTime = date;
        }
    }
}
