package com.statsig.androidsdk;

import android.gov.nist.javax.sip.parser.TokenNames;
import com.revenuecat.purchases.subscriberattributes.SubscriberAttributeKt;
import com.statsig.androidsdk.InitializeResponse;
import com.statsig.androidsdk.Marker;
import id.AbstractC3557B;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import jf.C3959i;
import kf.AbstractC4268D;
import kotlin.Metadata;
import kotlin.jvm.internal.g;
import r9.y;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010%\n\u0000\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u0000 22\u00020\u0001:\u00012B\u000f\u0012\u0006\u0010\"\u001a\u00020\n\u00a2\u0006\u0004\b0\u00101J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0002\u00a2\u0006\u0004\b\u0005\u0010\u0006J#\u0010\u000b\u001a\u00020\n2\u0006\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002H\u0002\u00a2\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00070\r2\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u0004\u00a2\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u0014\u0010\u0015J\r\u0010\u0016\u001a\u00020\u0011\u00a2\u0006\u0004\b\u0016\u0010\u0017J9\u0010\u001d\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b\u001d\u0010\u001eJA\u0010 \u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001f\u001a\u00020\n2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u00a2\u0006\u0004\b \u0010!R\u0016\u0010\"\u001a\u00020\n8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\"\u0010#R\"\u0010$\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e\u00a2\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010\u0015R\u0016\u0010)\u001a\u00020\u00048\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b)\u0010*R\"\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040+8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b\u0010\u0010,R,\u0010/\u001a\u0018\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00070-0+j\u0002`.8\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0006\n\u0004\b/\u0010,\u00a8\u00063"}, d2 = {"Lcom/statsig/androidsdk/Diagnostics;", "", "Lcom/statsig/androidsdk/ContextType;", "context", "", "getMaxMarkers", "(Lcom/statsig/androidsdk/ContextType;)I", "Lcom/statsig/androidsdk/Marker;", "marker", "overrideContext", "", "addMarker", "(Lcom/statsig/androidsdk/Marker;Lcom/statsig/androidsdk/ContextType;)Z", "", "getMarkers", "(Lcom/statsig/androidsdk/ContextType;)Ljava/util/List;", "maxMarkers", "Ljf/y;", "setMaxMarkers", "(Lcom/statsig/androidsdk/ContextType;I)V", "clearContext", "(Lcom/statsig/androidsdk/ContextType;)V", "clearAllContext", "()V", "Lcom/statsig/androidsdk/KeyType;", SubscriberAttributeKt.JSON_NAME_KEY, "Lcom/statsig/androidsdk/StepType;", "step", "additionalMarker", "markStart", "(Lcom/statsig/androidsdk/KeyType;Lcom/statsig/androidsdk/StepType;Lcom/statsig/androidsdk/Marker;Lcom/statsig/androidsdk/ContextType;)Z", "success", "markEnd", "(Lcom/statsig/androidsdk/KeyType;ZLcom/statsig/androidsdk/StepType;Lcom/statsig/androidsdk/Marker;Lcom/statsig/androidsdk/ContextType;)Z", "isDisabled", "Z", "diagnosticsContext", "Lcom/statsig/androidsdk/ContextType;", "getDiagnosticsContext", "()Lcom/statsig/androidsdk/ContextType;", "setDiagnosticsContext", "defaultMaxMarkers", TokenNames.f24313I, "", "Ljava/util/Map;", "", "Lcom/statsig/androidsdk/DiagnosticsMarkers;", "markers", "<init>", "(Z)V", "Companion", "build_release"}, k = 1, mv = {1, 5, 1})
/* loaded from: classes2.dex */
public final class Diagnostics {
    public static final Companion Companion = new Companion(null);
    private int defaultMaxMarkers = 30;
    private ContextType diagnosticsContext;
    private boolean isDisabled;
    private Map<ContextType, List<Marker>> markers;
    private Map<ContextType, Integer> maxMarkers;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\u000e\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006\u00a8\u0006\u0007"}, d2 = {"Lcom/statsig/androidsdk/Diagnostics$Companion;", "", "()V", "formatFailedResponse", "Lcom/statsig/androidsdk/Marker$ErrorMessage;", "failResponse", "Lcom/statsig/androidsdk/InitializeResponse$FailedInitializeResponse;", "build_release"}, k = 1, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes2.dex */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(g gVar) {
            this();
        }

        public final Marker.ErrorMessage formatFailedResponse(InitializeResponse.FailedInitializeResponse failedInitializeResponse) {
            Class<?> cls;
            String str;
            String cls2;
            AbstractC3557B.c0("failResponse", failedInitializeResponse);
            Exception exception = failedInitializeResponse.getException();
            String str2 = null;
            if (exception == null) {
                cls = null;
            } else {
                cls = exception.getClass();
            }
            if (cls == null || (cls2 = cls.toString()) == null) {
                str = "unknown";
            } else {
                str = cls2;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(failedInitializeResponse.getReason());
            sb2.append(" : ");
            Exception exception2 = failedInitializeResponse.getException();
            if (exception2 != null) {
                str2 = exception2.getMessage();
            }
            sb2.append((Object) str2);
            return new Marker.ErrorMessage(sb2.toString(), str, null, 4, null);
        }
    }

    @Metadata(k = 3, mv = {1, 5, 1}, xi = y.f44626f)
    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ContextType.values().length];
            iArr[ContextType.INITIALIZE.ordinal()] = 1;
            iArr[ContextType.UPDATE_USER.ordinal()] = 2;
            iArr[ContextType.API_CALL.ordinal()] = 3;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public Diagnostics(boolean z10) {
        this.isDisabled = z10;
        ContextType contextType = ContextType.INITIALIZE;
        this.diagnosticsContext = contextType;
        this.maxMarkers = AbstractC4268D.c1(new C3959i(contextType, 30), new C3959i(ContextType.API_CALL, Integer.valueOf(this.defaultMaxMarkers)), new C3959i(ContextType.EVENT_LOGGING, 0), new C3959i(ContextType.CONFIG_SYNC, 0), new C3959i(ContextType.UPDATE_USER, Integer.valueOf(this.defaultMaxMarkers)));
        Map<ContextType, List<Marker>> synchronizedMap = DesugarCollections.synchronizedMap(new LinkedHashMap());
        AbstractC3557B.b0("synchronizedMap(mutableMapOf())", synchronizedMap);
        this.markers = synchronizedMap;
    }

    private final boolean addMarker(Marker marker, ContextType contextType) {
        int i10;
        if (contextType == null) {
            contextType = this.diagnosticsContext;
        }
        int maxMarkers = getMaxMarkers(contextType);
        List<Marker> list = this.markers.get(contextType);
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.size();
        }
        if (maxMarkers <= i10) {
            return false;
        }
        if (this.markers.get(contextType) == null) {
            Map<ContextType, List<Marker>> map = this.markers;
            List<Marker> synchronizedList = Collections.synchronizedList(new ArrayList());
            AbstractC3557B.b0("synchronizedList(mutableListOf())", synchronizedList);
            map.put(contextType, synchronizedList);
        }
        List<Marker> list2 = this.markers.get(contextType);
        if (list2 != null) {
            list2.add(marker);
        }
        this.markers.values();
        return true;
    }

    public static /* synthetic */ boolean addMarker$default(Diagnostics diagnostics, Marker marker, ContextType contextType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            contextType = null;
        }
        return diagnostics.addMarker(marker, contextType);
    }

    public static /* synthetic */ void clearContext$default(Diagnostics diagnostics, ContextType contextType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            contextType = null;
        }
        diagnostics.clearContext(contextType);
    }

    public static /* synthetic */ List getMarkers$default(Diagnostics diagnostics, ContextType contextType, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            contextType = null;
        }
        return diagnostics.getMarkers(contextType);
    }

    private final int getMaxMarkers(ContextType contextType) {
        Integer num = this.maxMarkers.get(contextType);
        if (num == null) {
            return this.defaultMaxMarkers;
        }
        return num.intValue();
    }

    public static /* synthetic */ boolean markEnd$default(Diagnostics diagnostics, KeyType keyType, boolean z10, StepType stepType, Marker marker, ContextType contextType, int i10, Object obj) {
        StepType stepType2;
        Marker marker2;
        ContextType contextType2;
        if ((i10 & 4) != 0) {
            stepType2 = null;
        } else {
            stepType2 = stepType;
        }
        if ((i10 & 8) != 0) {
            marker2 = null;
        } else {
            marker2 = marker;
        }
        if ((i10 & 16) != 0) {
            contextType2 = null;
        } else {
            contextType2 = contextType;
        }
        return diagnostics.markEnd(keyType, z10, stepType2, marker2, contextType2);
    }

    public static /* synthetic */ boolean markStart$default(Diagnostics diagnostics, KeyType keyType, StepType stepType, Marker marker, ContextType contextType, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            stepType = null;
        }
        if ((i10 & 4) != 0) {
            marker = null;
        }
        if ((i10 & 8) != 0) {
            contextType = null;
        }
        return diagnostics.markStart(keyType, stepType, marker, contextType);
    }

    public final void clearAllContext() {
        this.markers = new LinkedHashMap();
    }

    public final void clearContext(ContextType contextType) {
        Map<ContextType, List<Marker>> map = this.markers;
        if (contextType == null) {
            contextType = this.diagnosticsContext;
        }
        List<Marker> synchronizedList = Collections.synchronizedList(new ArrayList());
        AbstractC3557B.b0("synchronizedList(\n            mutableListOf(),\n        )", synchronizedList);
        map.put(contextType, synchronizedList);
    }

    public final ContextType getDiagnosticsContext() {
        return this.diagnosticsContext;
    }

    public final List<Marker> getMarkers(ContextType contextType) {
        Map<ContextType, List<Marker>> map = this.markers;
        if (contextType == null) {
            contextType = this.diagnosticsContext;
        }
        List<Marker> list = map.get(contextType);
        if (list == null) {
            List<Marker> synchronizedList = Collections.synchronizedList(new ArrayList());
            AbstractC3557B.b0("synchronizedList(\n            mutableListOf(),\n        )", synchronizedList);
            return synchronizedList;
        }
        return list;
    }

    public final boolean markEnd(KeyType keyType, boolean z10, StepType stepType, Marker marker, ContextType contextType) {
        ContextType contextType2;
        int i10;
        Marker marker2;
        EvaluationDetails evaluationDetails;
        Integer num;
        String str;
        Integer num2;
        Marker.ErrorMessage errorMessage;
        String markerID;
        String str2;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, keyType);
        if (contextType == null) {
            contextType2 = this.diagnosticsContext;
        } else {
            contextType2 = contextType;
        }
        if (this.isDisabled && contextType2 == ContextType.API_CALL) {
            return false;
        }
        int maxMarkers = getMaxMarkers(contextType2);
        List<Marker> list = this.markers.get(contextType2);
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.size();
        }
        if (maxMarkers < i10) {
            return false;
        }
        Marker marker3 = new Marker(keyType, ActionType.END, Double.valueOf(System.nanoTime() / 1000000.0d), stepType, null, Boolean.valueOf(z10), null, null, null, null, null, null, null, null, null, null, null, null, 262096, null);
        int i11 = WhenMappings.$EnumSwitchMapping$0[contextType2.ordinal()];
        Boolean bool = null;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return false;
            }
            if (marker == null) {
                markerID = null;
            } else {
                markerID = marker.getMarkerID();
            }
            marker2 = marker3;
            marker2.setMarkerID(markerID);
            if (marker == null) {
                str2 = null;
            } else {
                str2 = marker.getConfigName();
            }
            marker2.setConfigName(str2);
        } else {
            marker2 = marker3;
            if (marker == null) {
                evaluationDetails = null;
            } else {
                evaluationDetails = marker.getEvaluationDetails();
            }
            marker2.setEvaluationDetails(evaluationDetails);
            if (marker == null) {
                num = null;
            } else {
                num = marker.getAttempt();
            }
            marker2.setAttempt(num);
            if (marker == null) {
                str = null;
            } else {
                str = marker.getSdkRegion();
            }
            marker2.setSdkRegion(str);
            if (marker == null) {
                num2 = null;
            } else {
                num2 = marker.getStatusCode();
            }
            marker2.setStatusCode(num2);
            if (marker == null) {
                errorMessage = null;
            } else {
                errorMessage = marker.getError();
            }
            marker2.setError(errorMessage);
        }
        if (stepType == StepType.NETWORK_REQUEST) {
            if (marker != null) {
                bool = marker.getHasNetwork();
            }
            marker2.setHasNetwork(bool);
        }
        return addMarker(marker2, contextType2);
    }

    public final boolean markStart(KeyType keyType, StepType stepType, Marker marker, ContextType contextType) {
        ContextType contextType2;
        int i10;
        Marker marker2;
        AbstractC3557B.c0(SubscriberAttributeKt.JSON_NAME_KEY, keyType);
        if (contextType == null) {
            contextType2 = this.diagnosticsContext;
        } else {
            contextType2 = contextType;
        }
        if (this.isDisabled && contextType2 == ContextType.API_CALL) {
            return false;
        }
        int maxMarkers = getMaxMarkers(contextType2);
        List<Marker> list = this.markers.get(contextType2);
        if (list == null) {
            i10 = 0;
        } else {
            i10 = list.size();
        }
        if (maxMarkers < i10) {
            return false;
        }
        ContextType contextType3 = contextType2;
        Marker marker3 = new Marker(keyType, ActionType.START, Double.valueOf(System.nanoTime() / 1000000.0d), stepType, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 262128, null);
        int i11 = WhenMappings.$EnumSwitchMapping$0[contextType3.ordinal()];
        Integer num = null;
        String markerID = null;
        if (i11 != 1 && i11 != 2) {
            if (i11 != 3) {
                return false;
            }
            if (marker != null) {
                markerID = marker.getMarkerID();
            }
            marker2 = marker3;
            marker2.setMarkerID(markerID);
        } else {
            marker2 = marker3;
            if (keyType == KeyType.INITIALIZE && stepType == StepType.NETWORK_REQUEST) {
                if (marker != null) {
                    num = marker.getAttempt();
                }
                marker2.setAttempt(num);
            }
        }
        return addMarker(marker2, contextType3);
    }

    public final void setDiagnosticsContext(ContextType contextType) {
        AbstractC3557B.c0("<set-?>", contextType);
        this.diagnosticsContext = contextType;
    }

    public final void setMaxMarkers(ContextType contextType, int i10) {
        AbstractC3557B.c0("context", contextType);
        this.maxMarkers.put(contextType, Integer.valueOf(i10));
    }
}
